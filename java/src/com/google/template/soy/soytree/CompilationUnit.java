// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/protobuf/template_metadata.proto
// Protobuf Java Version: 4.28.2

package com.google.template.soy.soytree;

/**
 * <pre>
 * Represents a set of files
 * </pre>
 *
 * Protobuf type {@code soy.compiler.CompilationUnit}
 */
public final class CompilationUnit extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:soy.compiler.CompilationUnit)
    CompilationUnitOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      CompilationUnit.class.getName());
  }
  // Use CompilationUnit.newBuilder() to construct.
  private CompilationUnit(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CompilationUnit() {
    file_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.template.soy.soytree.TemplateMetadataProto.internal_static_soy_compiler_CompilationUnit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.template.soy.soytree.TemplateMetadataProto.internal_static_soy_compiler_CompilationUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.template.soy.soytree.CompilationUnit.class, com.google.template.soy.soytree.CompilationUnit.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.template.soy.soytree.SoyFileP> file_;
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.template.soy.soytree.SoyFileP> getFileList() {
    return file_;
  }
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.template.soy.soytree.SoyFilePOrBuilder> 
      getFileOrBuilderList() {
    return file_;
  }
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  @java.lang.Override
  public int getFileCount() {
    return file_.size();
  }
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  @java.lang.Override
  public com.google.template.soy.soytree.SoyFileP getFile(int index) {
    return file_.get(index);
  }
  /**
   * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
   */
  @java.lang.Override
  public com.google.template.soy.soytree.SoyFilePOrBuilder getFileOrBuilder(
      int index) {
    return file_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < file_.size(); i++) {
      output.writeMessage(1, file_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < file_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, file_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.template.soy.soytree.CompilationUnit)) {
      return super.equals(obj);
    }
    com.google.template.soy.soytree.CompilationUnit other = (com.google.template.soy.soytree.CompilationUnit) obj;

    if (!getFileList()
        .equals(other.getFileList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFileCount() > 0) {
      hash = (37 * hash) + FILE_FIELD_NUMBER;
      hash = (53 * hash) + getFileList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.template.soy.soytree.CompilationUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.template.soy.soytree.CompilationUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.template.soy.soytree.CompilationUnit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.template.soy.soytree.CompilationUnit prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents a set of files
   * </pre>
   *
   * Protobuf type {@code soy.compiler.CompilationUnit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:soy.compiler.CompilationUnit)
      com.google.template.soy.soytree.CompilationUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.template.soy.soytree.TemplateMetadataProto.internal_static_soy_compiler_CompilationUnit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.template.soy.soytree.TemplateMetadataProto.internal_static_soy_compiler_CompilationUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.template.soy.soytree.CompilationUnit.class, com.google.template.soy.soytree.CompilationUnit.Builder.class);
    }

    // Construct using com.google.template.soy.soytree.CompilationUnit.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (fileBuilder_ == null) {
        file_ = java.util.Collections.emptyList();
      } else {
        file_ = null;
        fileBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.template.soy.soytree.TemplateMetadataProto.internal_static_soy_compiler_CompilationUnit_descriptor;
    }

    @java.lang.Override
    public com.google.template.soy.soytree.CompilationUnit getDefaultInstanceForType() {
      return com.google.template.soy.soytree.CompilationUnit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.template.soy.soytree.CompilationUnit build() {
      com.google.template.soy.soytree.CompilationUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.template.soy.soytree.CompilationUnit buildPartial() {
      com.google.template.soy.soytree.CompilationUnit result = new com.google.template.soy.soytree.CompilationUnit(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.template.soy.soytree.CompilationUnit result) {
      if (fileBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          file_ = java.util.Collections.unmodifiableList(file_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.file_ = file_;
      } else {
        result.file_ = fileBuilder_.build();
      }
    }

    private void buildPartial0(com.google.template.soy.soytree.CompilationUnit result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.template.soy.soytree.CompilationUnit) {
        return mergeFrom((com.google.template.soy.soytree.CompilationUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.template.soy.soytree.CompilationUnit other) {
      if (other == com.google.template.soy.soytree.CompilationUnit.getDefaultInstance()) return this;
      if (fileBuilder_ == null) {
        if (!other.file_.isEmpty()) {
          if (file_.isEmpty()) {
            file_ = other.file_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFileIsMutable();
            file_.addAll(other.file_);
          }
          onChanged();
        }
      } else {
        if (!other.file_.isEmpty()) {
          if (fileBuilder_.isEmpty()) {
            fileBuilder_.dispose();
            fileBuilder_ = null;
            file_ = other.file_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fileBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getFileFieldBuilder() : null;
          } else {
            fileBuilder_.addAllMessages(other.file_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.template.soy.soytree.SoyFileP m =
                  input.readMessage(
                      com.google.template.soy.soytree.SoyFileP.parser(),
                      extensionRegistry);
              if (fileBuilder_ == null) {
                ensureFileIsMutable();
                file_.add(m);
              } else {
                fileBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.template.soy.soytree.SoyFileP> file_ =
      java.util.Collections.emptyList();
    private void ensureFileIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        file_ = new java.util.ArrayList<com.google.template.soy.soytree.SoyFileP>(file_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.template.soy.soytree.SoyFileP, com.google.template.soy.soytree.SoyFileP.Builder, com.google.template.soy.soytree.SoyFilePOrBuilder> fileBuilder_;

    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public java.util.List<com.google.template.soy.soytree.SoyFileP> getFileList() {
      if (fileBuilder_ == null) {
        return java.util.Collections.unmodifiableList(file_);
      } else {
        return fileBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public int getFileCount() {
      if (fileBuilder_ == null) {
        return file_.size();
      } else {
        return fileBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public com.google.template.soy.soytree.SoyFileP getFile(int index) {
      if (fileBuilder_ == null) {
        return file_.get(index);
      } else {
        return fileBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder setFile(
        int index, com.google.template.soy.soytree.SoyFileP value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileIsMutable();
        file_.set(index, value);
        onChanged();
      } else {
        fileBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder setFile(
        int index, com.google.template.soy.soytree.SoyFileP.Builder builderForValue) {
      if (fileBuilder_ == null) {
        ensureFileIsMutable();
        file_.set(index, builderForValue.build());
        onChanged();
      } else {
        fileBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder addFile(com.google.template.soy.soytree.SoyFileP value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileIsMutable();
        file_.add(value);
        onChanged();
      } else {
        fileBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder addFile(
        int index, com.google.template.soy.soytree.SoyFileP value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileIsMutable();
        file_.add(index, value);
        onChanged();
      } else {
        fileBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder addFile(
        com.google.template.soy.soytree.SoyFileP.Builder builderForValue) {
      if (fileBuilder_ == null) {
        ensureFileIsMutable();
        file_.add(builderForValue.build());
        onChanged();
      } else {
        fileBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder addFile(
        int index, com.google.template.soy.soytree.SoyFileP.Builder builderForValue) {
      if (fileBuilder_ == null) {
        ensureFileIsMutable();
        file_.add(index, builderForValue.build());
        onChanged();
      } else {
        fileBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder addAllFile(
        java.lang.Iterable<? extends com.google.template.soy.soytree.SoyFileP> values) {
      if (fileBuilder_ == null) {
        ensureFileIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, file_);
        onChanged();
      } else {
        fileBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        file_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fileBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public Builder removeFile(int index) {
      if (fileBuilder_ == null) {
        ensureFileIsMutable();
        file_.remove(index);
        onChanged();
      } else {
        fileBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public com.google.template.soy.soytree.SoyFileP.Builder getFileBuilder(
        int index) {
      return getFileFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public com.google.template.soy.soytree.SoyFilePOrBuilder getFileOrBuilder(
        int index) {
      if (fileBuilder_ == null) {
        return file_.get(index);  } else {
        return fileBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public java.util.List<? extends com.google.template.soy.soytree.SoyFilePOrBuilder> 
         getFileOrBuilderList() {
      if (fileBuilder_ != null) {
        return fileBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(file_);
      }
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public com.google.template.soy.soytree.SoyFileP.Builder addFileBuilder() {
      return getFileFieldBuilder().addBuilder(
          com.google.template.soy.soytree.SoyFileP.getDefaultInstance());
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public com.google.template.soy.soytree.SoyFileP.Builder addFileBuilder(
        int index) {
      return getFileFieldBuilder().addBuilder(
          index, com.google.template.soy.soytree.SoyFileP.getDefaultInstance());
    }
    /**
     * <code>repeated .soy.compiler.SoyFileP file = 1;</code>
     */
    public java.util.List<com.google.template.soy.soytree.SoyFileP.Builder> 
         getFileBuilderList() {
      return getFileFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.template.soy.soytree.SoyFileP, com.google.template.soy.soytree.SoyFileP.Builder, com.google.template.soy.soytree.SoyFilePOrBuilder> 
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        fileBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.template.soy.soytree.SoyFileP, com.google.template.soy.soytree.SoyFileP.Builder, com.google.template.soy.soytree.SoyFilePOrBuilder>(
                file_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        file_ = null;
      }
      return fileBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:soy.compiler.CompilationUnit)
  }

  // @@protoc_insertion_point(class_scope:soy.compiler.CompilationUnit)
  private static final com.google.template.soy.soytree.CompilationUnit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.template.soy.soytree.CompilationUnit();
  }

  public static com.google.template.soy.soytree.CompilationUnit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompilationUnit>
      PARSER = new com.google.protobuf.AbstractParser<CompilationUnit>() {
    @java.lang.Override
    public CompilationUnit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CompilationUnit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompilationUnit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.template.soy.soytree.CompilationUnit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

