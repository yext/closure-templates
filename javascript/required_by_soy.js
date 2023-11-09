/*
 * Copyright 2017 Google Inc.
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

/**
 * @fileoverview
 * Exports of symbols required by the `soy.` and `soydata.`
 * namespaces and which are generated by required by outputs of SoyToJavaScript.
 * This allows compiling a standalone bundle of closure dependencies for soy
 * templates.
 */

goog.require('goog.Uri');
goog.require('goog.array');
goog.require('goog.asserts');
goog.require('goog.debug');
goog.require('goog.dom.DomHelper');
goog.require('goog.format');
goog.require('goog.i18n.BidiFormatter');
goog.require('goog.i18n.MessageFormat');
goog.require('goog.i18n.NumberFormat');
goog.require('goog.i18n.bidi');
goog.require('goog.i18n.bidi.Dir');
goog.require('goog.object');
goog.require('goog.soy');
goog.require('goog.soy.data.SanitizedContent');
goog.require('goog.soy.data.SanitizedContentKind');
goog.require('goog.soy.data.SanitizedCss');
goog.require('goog.soy.data.SanitizedHtml');
goog.require('goog.soy.data.SanitizedHtmlAttribute');
goog.require('goog.soy.data.SanitizedJs');
goog.require('goog.soy.data.SanitizedTrustedResourceUri');
goog.require('goog.soy.data.SanitizedUri');
goog.require('goog.string');
goog.require('goog.string.Const');
goog.require('google3.javascript.template.soy.soyutils_idom');
goog.require('proto.webutil.html.types.SafeHtmlProto');
goog.require('proto.webutil.html.types.SafeScriptProto');
goog.require('proto.webutil.html.types.SafeStyleProto');
goog.require('proto.webutil.html.types.SafeStyleSheetProto');
goog.require('proto.webutil.html.types.SafeUrlProto');
goog.require('proto.webutil.html.types.TrustedResourceUrlProto');
goog.require('soydata.converters.idom');
goog.require('xid');

goog.scope(function() {

goog.exportSymbol('goog.DEBUG', goog.DEBUG);
goog.exportSymbol('goog.Uri', goog.Uri);
goog.exportSymbol('goog.array', goog.array);
goog.exportSymbol('goog.array.range', goog.array.range);
goog.exportSymbol('goog.asserts.ENABLE_ASSERTS', goog.asserts.ENABLE_ASSERTS);
goog.exportSymbol('goog.asserts.assert', goog.asserts.assert);
goog.exportSymbol('goog.asserts.fail', goog.asserts.fail);
goog.exportSymbol('goog.debug.runtimeType', goog.debug.runtimeType);
goog.exportSymbol('goog.dom.DomHelper', goog.dom.DomHelper);
goog.exportSymbol('goog.format.insertWordBreaks', goog.format.insertWordBreaks);
goog.exportSymbol('goog.getCssName', goog.getCssName);
goog.exportSymbol('goog.getMsg', goog.getMsg);
goog.exportSymbol('goog.getMsgWithFallback', goog.getMsgWithFallback);
goog.exportSymbol('goog.i18n.BidiFormatter', goog.i18n.BidiFormatter);
goog.exportSymbol('goog.i18n.MessageFormat', goog.i18n.MessageFormat);
goog.exportSymbol('goog.i18n.NumberFormat', goog.i18n.NumberFormat);
goog.exportSymbol('goog.i18n.NumberFormat.Format.COMPACT_LONG', goog.i18n.NumberFormat.Format.COMPACT_LONG);
goog.exportSymbol('goog.i18n.NumberFormat.Format.COMPACT_SHORT', goog.i18n.NumberFormat.Format.COMPACT_SHORT);
goog.exportSymbol('goog.i18n.NumberFormat.Format.CURRENCY', goog.i18n.NumberFormat.Format.CURRENCY);
goog.exportSymbol('goog.i18n.NumberFormat.Format.DECIMAL', goog.i18n.NumberFormat.Format.DECIMAL);
goog.exportSymbol('goog.i18n.NumberFormat.Format.PERCENT', goog.i18n.NumberFormat.Format.PERCENT);
goog.exportSymbol('goog.i18n.NumberFormat.Format.SCIENTIFIC', goog.i18n.NumberFormat.Format.SCIENTIFIC);
goog.exportSymbol('goog.i18n.bidi.IS_RTL', goog.i18n.bidi.IS_RTL);
goog.exportSymbol('goog.i18n.bidi.Dir.LTR', goog.i18n.bidi.Dir.LTR);
goog.exportSymbol('goog.i18n.bidi.Dir.NEUTRAL', goog.i18n.bidi.Dir.NEUTRAL);
goog.exportSymbol('goog.i18n.bidi.Dir.RTL', goog.i18n.bidi.Dir.RTL);
goog.exportSymbol('goog.i18n.bidi.estimateDirection', goog.i18n.bidi.estimateDirection);
goog.exportSymbol('goog.isObject', goog.isObject);
goog.exportSymbol('goog.module', goog.module);
goog.exportSymbol('goog.module.get', goog.module.get);
goog.exportSymbol('goog.object', goog.object);
goog.exportSymbol('goog.inherits', goog.inherits);
goog.exportSymbol('goog.provide', goog.provide);
goog.exportSymbol('goog.require', goog.require);
goog.exportSymbol('goog.requireType', goog.requireType);
goog.exportSymbol('goog.soy.IjData', goog.soy.IjData);
goog.exportSymbol('goog.soy.data.SanitizedContent', goog.soy.data.SanitizedContent);
goog.exportSymbol('goog.soy.data.SanitizedContentKind', goog.soy.data.SanitizedContentKind);
goog.exportSymbol('goog.soy.data.SanitizedCss', goog.soy.data.SanitizedCss);
goog.exportSymbol('goog.soy.data.SanitizedHtml', goog.soy.data.SanitizedHtml);
goog.exportSymbol('goog.soy.data.SanitizedHtml.isCompatibleWith', goog.soy.data.SanitizedHtml.isCompatibleWith);
goog.exportSymbol('goog.soy.data.SanitizedHtmlAttribute', goog.soy.data.SanitizedHtmlAttribute);
goog.exportSymbol('goog.soy.data.SanitizedJs', goog.soy.data.SanitizedJs);
goog.exportSymbol('goog.soy.data.SanitizedTrustedResourceUri', goog.soy.data.SanitizedTrustedResourceUri);
goog.exportSymbol('goog.soy.data.SanitizedUri', goog.soy.data.SanitizedUri);
goog.exportSymbol('goog.string.Const', goog.string.Const);
goog.exportSymbol('goog.string.contains', goog.string.contains);
goog.exportSymbol('goog.string.htmlEscape', goog.string.htmlEscape);
goog.exportSymbol('goog.string.quote', goog.string.quote);
goog.exportSymbol('goog.string.regExpEscape', goog.string.regExpEscape);
goog.exportSymbol('goog.string.unescapeEntities', goog.string.unescapeEntities);
goog.exportSymbol('goog.string.newLineToBr', goog.string.newLineToBr);
goog.exportSymbol('goog.string.urlEncode', goog.string.urlEncode);
goog.exportSymbol('google3.javascript.template.soy.soyutils_idom', goog.module.get('google3.javascript.template.soy.soyutils_idom'));
goog.exportSymbol('proto.webutil.html.types.SafeHtmlProto', proto.webutil.html.types.SafeHtmlProto);
goog.exportSymbol('proto.webutil.html.types.SafeScriptProto', proto.webutil.html.types.SafeScriptProto);
goog.exportSymbol('proto.webutil.html.types.SafeStyleProto', proto.webutil.html.types.SafeStyleProto);
goog.exportSymbol('proto.webutil.html.types.SafeStyleSheetProto', proto.webutil.html.types.SafeStyleSheetProto);
goog.exportSymbol('proto.webutil.html.types.SafeUrlProto', proto.webutil.html.types.SafeUrlProto);
goog.exportSymbol('proto.webutil.html.types.TrustedResourceUrlProto', proto.webutil.html.types.TrustedResourceUrlProto);
goog.exportSymbol('soydata.converters.idom', goog.module.get('soydata.converters.idom'));
goog.exportSymbol('xid', xid);

});
