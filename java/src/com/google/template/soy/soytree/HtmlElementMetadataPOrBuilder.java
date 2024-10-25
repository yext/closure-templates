// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/protobuf/template_metadata.proto
// Protobuf Java Version: 4.28.2

package com.google.template.soy.soytree;

public interface HtmlElementMetadataPOrBuilder extends
    // @@protoc_insertion_point(interface_extends:soy.compiler.HtmlElementMetadataP)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If this is true, then the template contains either one visible HTML
   * tag, or does a call that resolves to one HTML tag. If false, then
   * there is a fragment. This is also false if the HTML element has dynamic
   * number of tags due to if or switch statements.
   * </pre>
   *
   * <code>bool is_html_element = 1;</code>
   * @return The isHtmlElement.
   */
  boolean getIsHtmlElement();

  /**
   * <pre>
   * If this is true, then the single element has a velog around it. This is
   * to prevent wrapping a velog around a call that is itself velogged.
   * </pre>
   *
   * <code>bool is_velogged = 2;</code>
   * @return The isVelogged.
   */
  boolean getIsVelogged();

  /**
   * <pre>
   * The tag of an element. If the template is a fragment or a template
   * contains a dynamic tag, then this will be "?".
   * </pre>
   *
   * <code>string tag = 3;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * The tag of an element. If the template is a fragment or a template
   * contains a dynamic tag, then this will be "?".
   * </pre>
   *
   * <code>string tag = 3;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Whether or not a template contains an element with {skip} directive.
   * </pre>
   *
   * <code>bool is_skip = 4;</code>
   * @return The isSkip.
   */
  boolean getIsSkip();
}
