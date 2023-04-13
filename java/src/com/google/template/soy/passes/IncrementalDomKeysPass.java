/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.passes;

import com.google.template.soy.base.internal.IdGenerator;
import com.google.template.soy.soytree.AbstractSoyNodeVisitor;
import com.google.template.soy.soytree.HtmlCloseTagNode;
import com.google.template.soy.soytree.HtmlOpenTagNode;
import com.google.template.soy.soytree.KeyNode;
import com.google.template.soy.soytree.SkipNode;
import com.google.template.soy.soytree.SoyFileNode;
import com.google.template.soy.soytree.SoyNode;
import com.google.template.soy.soytree.SoyNode.ParentSoyNode;
import com.google.template.soy.soytree.TemplateNode;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/** Annotates autokeys for HTML tags. */
final class IncrementalDomKeysPass implements CompilerFilePass {

  @Override
  public void run(SoyFileNode file, IdGenerator nodeIdGen) {
    new IncrementalDomKeysPassVisitor().exec(file);
  }

  private static final class IncrementalDomKeysPassVisitor extends AbstractSoyNodeVisitor<Void> {

    // Tracks the counter to use for a tag's generated key:
    // - When encountering an open tag without a manual key, the counter at the top of the stack is
    //   incremented.
    // - When encountering an open tag with a manual key, a new counter is pushed onto the stack.
    // - When encountering a close tag that corresponds to an open tag with a manual key, the
    //   topmost counter is then popped from the stack.
    private ArrayDeque<AtomicInteger> keyCounterStack;
    private TemplateNode template;

    @Override
    public void visitTemplateNode(TemplateNode templateNode) {
      keyCounterStack = new ArrayDeque<>();
      keyCounterStack.push(new AtomicInteger());
      template = templateNode;
      visitChildren(templateNode);
    }

    @Override
    public void visitHtmlOpenTagNode(HtmlOpenTagNode openTagNode) {
      KeyNode keyNode = openTagNode.getKeyNode();
      if (keyNode != null) {
        keyCounterStack.push(new AtomicInteger());
      } else {
        openTagNode.setKeyId(incrementKeyForTemplate(template, openTagNode.isElementRoot()));
      }
      visitChildren(openTagNode);
    }

    @Override
    public void visitHtmlCloseTagNode(HtmlCloseTagNode closeTagNode) {
      if (closeTagNode.getTaggedPairs().size() == 1) {
        HtmlOpenTagNode openTag = (HtmlOpenTagNode) closeTagNode.getTaggedPairs().get(0);
        if (openTag.getKeyNode() != null && !(openTag.getParent() instanceof SkipNode)) {
          keyCounterStack.pop();
        }
      }
    }

    @Override
    public void visitSoyNode(SoyNode node) {
      if (node instanceof ParentSoyNode) {
        visitChildren((ParentSoyNode<?>) node);
      }
    }

    private String incrementKeyForTemplate(TemplateNode template, boolean isElementRoot) {
      if (isElementRoot) {
        return template.getTemplateName() + "-root";
      }
      AtomicInteger keyCounter = keyCounterStack.peek();
      return template.getTemplateName() + "-" + keyCounter.getAndIncrement();
    }
  }
}
