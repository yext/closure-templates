// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/protobuf/template_metadata.proto
// Protobuf Java Version: 4.28.2

package com.google.template.soy.soytree;

public interface CompilationUnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:soy.compiler.CompilationUnit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  java.util.List<com.google.template.soy.soytree.SoyFileP> 
      getFileList();
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  com.google.template.soy.soytree.SoyFileP getFile(int index);
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  int getFileCount();
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  java.util.List<? extends com.google.template.soy.soytree.SoyFilePOrBuilder> 
      getFileOrBuilderList();
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  com.google.template.soy.soytree.SoyFilePOrBuilder getFileOrBuilder(
      int index);
}
