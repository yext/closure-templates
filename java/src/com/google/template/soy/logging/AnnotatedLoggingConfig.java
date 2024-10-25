// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: src/main/protobuf/annotated_logging_config.proto
// Protobuf Java Version: 4.28.2

package com.google.template.soy.logging;

/**
 * <pre>
 * A Soy-internal version of LoggingConfig that contains additional Soy-only
 * details.
 * </pre>
 *
 * Protobuf type {@code soy.AnnotatedLoggingConfig}
 */
public final class AnnotatedLoggingConfig extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:soy.AnnotatedLoggingConfig)
    AnnotatedLoggingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      AnnotatedLoggingConfig.class.getName());
  }
  // Use AnnotatedLoggingConfig.newBuilder() to construct.
  private AnnotatedLoggingConfig(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AnnotatedLoggingConfig() {
    element_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.template.soy.logging.AnnotatedLoggingConfigOuterClass.internal_static_soy_AnnotatedLoggingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.template.soy.logging.AnnotatedLoggingConfigOuterClass.internal_static_soy_AnnotatedLoggingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.template.soy.logging.AnnotatedLoggingConfig.class, com.google.template.soy.logging.AnnotatedLoggingConfig.Builder.class);
  }

  public static final int ELEMENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.template.soy.logging.AnnotatedLoggableElement> element_;
  /**
   * <pre>
   * All the logging elements that are configured for the current compilation
   * unit.
   * </pre>
   *
   * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.template.soy.logging.AnnotatedLoggableElement> getElementList() {
    return element_;
  }
  /**
   * <pre>
   * All the logging elements that are configured for the current compilation
   * unit.
   * </pre>
   *
   * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder> 
      getElementOrBuilderList() {
    return element_;
  }
  /**
   * <pre>
   * All the logging elements that are configured for the current compilation
   * unit.
   * </pre>
   *
   * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
   */
  @java.lang.Override
  public int getElementCount() {
    return element_.size();
  }
  /**
   * <pre>
   * All the logging elements that are configured for the current compilation
   * unit.
   * </pre>
   *
   * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
   */
  @java.lang.Override
  public com.google.template.soy.logging.AnnotatedLoggableElement getElement(int index) {
    return element_.get(index);
  }
  /**
   * <pre>
   * All the logging elements that are configured for the current compilation
   * unit.
   * </pre>
   *
   * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
   */
  @java.lang.Override
  public com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder getElementOrBuilder(
      int index) {
    return element_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getElementCount(); i++) {
      if (!getElement(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < element_.size(); i++) {
      output.writeMessage(1, element_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < element_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, element_.get(i));
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
    if (!(obj instanceof com.google.template.soy.logging.AnnotatedLoggingConfig)) {
      return super.equals(obj);
    }
    com.google.template.soy.logging.AnnotatedLoggingConfig other = (com.google.template.soy.logging.AnnotatedLoggingConfig) obj;

    if (!getElementList()
        .equals(other.getElementList())) return false;
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
    if (getElementCount() > 0) {
      hash = (37 * hash) + ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getElementList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.template.soy.logging.AnnotatedLoggingConfig parseFrom(
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
  public static Builder newBuilder(com.google.template.soy.logging.AnnotatedLoggingConfig prototype) {
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
   * A Soy-internal version of LoggingConfig that contains additional Soy-only
   * details.
   * </pre>
   *
   * Protobuf type {@code soy.AnnotatedLoggingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:soy.AnnotatedLoggingConfig)
      com.google.template.soy.logging.AnnotatedLoggingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.template.soy.logging.AnnotatedLoggingConfigOuterClass.internal_static_soy_AnnotatedLoggingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.template.soy.logging.AnnotatedLoggingConfigOuterClass.internal_static_soy_AnnotatedLoggingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.template.soy.logging.AnnotatedLoggingConfig.class, com.google.template.soy.logging.AnnotatedLoggingConfig.Builder.class);
    }

    // Construct using com.google.template.soy.logging.AnnotatedLoggingConfig.newBuilder()
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
      if (elementBuilder_ == null) {
        element_ = java.util.Collections.emptyList();
      } else {
        element_ = null;
        elementBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.template.soy.logging.AnnotatedLoggingConfigOuterClass.internal_static_soy_AnnotatedLoggingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.template.soy.logging.AnnotatedLoggingConfig getDefaultInstanceForType() {
      return com.google.template.soy.logging.AnnotatedLoggingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.template.soy.logging.AnnotatedLoggingConfig build() {
      com.google.template.soy.logging.AnnotatedLoggingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.template.soy.logging.AnnotatedLoggingConfig buildPartial() {
      com.google.template.soy.logging.AnnotatedLoggingConfig result = new com.google.template.soy.logging.AnnotatedLoggingConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.template.soy.logging.AnnotatedLoggingConfig result) {
      if (elementBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          element_ = java.util.Collections.unmodifiableList(element_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.element_ = element_;
      } else {
        result.element_ = elementBuilder_.build();
      }
    }

    private void buildPartial0(com.google.template.soy.logging.AnnotatedLoggingConfig result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.template.soy.logging.AnnotatedLoggingConfig) {
        return mergeFrom((com.google.template.soy.logging.AnnotatedLoggingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.template.soy.logging.AnnotatedLoggingConfig other) {
      if (other == com.google.template.soy.logging.AnnotatedLoggingConfig.getDefaultInstance()) return this;
      if (elementBuilder_ == null) {
        if (!other.element_.isEmpty()) {
          if (element_.isEmpty()) {
            element_ = other.element_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElementIsMutable();
            element_.addAll(other.element_);
          }
          onChanged();
        }
      } else {
        if (!other.element_.isEmpty()) {
          if (elementBuilder_.isEmpty()) {
            elementBuilder_.dispose();
            elementBuilder_ = null;
            element_ = other.element_;
            bitField0_ = (bitField0_ & ~0x00000001);
            elementBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getElementFieldBuilder() : null;
          } else {
            elementBuilder_.addAllMessages(other.element_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (int i = 0; i < getElementCount(); i++) {
        if (!getElement(i).isInitialized()) {
          return false;
        }
      }
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
              com.google.template.soy.logging.AnnotatedLoggableElement m =
                  input.readMessage(
                      com.google.template.soy.logging.AnnotatedLoggableElement.parser(),
                      extensionRegistry);
              if (elementBuilder_ == null) {
                ensureElementIsMutable();
                element_.add(m);
              } else {
                elementBuilder_.addMessage(m);
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

    private java.util.List<com.google.template.soy.logging.AnnotatedLoggableElement> element_ =
      java.util.Collections.emptyList();
    private void ensureElementIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        element_ = new java.util.ArrayList<com.google.template.soy.logging.AnnotatedLoggableElement>(element_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.template.soy.logging.AnnotatedLoggableElement, com.google.template.soy.logging.AnnotatedLoggableElement.Builder, com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder> elementBuilder_;

    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public java.util.List<com.google.template.soy.logging.AnnotatedLoggableElement> getElementList() {
      if (elementBuilder_ == null) {
        return java.util.Collections.unmodifiableList(element_);
      } else {
        return elementBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public int getElementCount() {
      if (elementBuilder_ == null) {
        return element_.size();
      } else {
        return elementBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public com.google.template.soy.logging.AnnotatedLoggableElement getElement(int index) {
      if (elementBuilder_ == null) {
        return element_.get(index);
      } else {
        return elementBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder setElement(
        int index, com.google.template.soy.logging.AnnotatedLoggableElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementIsMutable();
        element_.set(index, value);
        onChanged();
      } else {
        elementBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder setElement(
        int index, com.google.template.soy.logging.AnnotatedLoggableElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.set(index, builderForValue.build());
        onChanged();
      } else {
        elementBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder addElement(com.google.template.soy.logging.AnnotatedLoggableElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementIsMutable();
        element_.add(value);
        onChanged();
      } else {
        elementBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder addElement(
        int index, com.google.template.soy.logging.AnnotatedLoggableElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementIsMutable();
        element_.add(index, value);
        onChanged();
      } else {
        elementBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder addElement(
        com.google.template.soy.logging.AnnotatedLoggableElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.add(builderForValue.build());
        onChanged();
      } else {
        elementBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder addElement(
        int index, com.google.template.soy.logging.AnnotatedLoggableElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.add(index, builderForValue.build());
        onChanged();
      } else {
        elementBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder addAllElement(
        java.lang.Iterable<? extends com.google.template.soy.logging.AnnotatedLoggableElement> values) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, element_);
        onChanged();
      } else {
        elementBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder clearElement() {
      if (elementBuilder_ == null) {
        element_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        elementBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public Builder removeElement(int index) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.remove(index);
        onChanged();
      } else {
        elementBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public com.google.template.soy.logging.AnnotatedLoggableElement.Builder getElementBuilder(
        int index) {
      return getElementFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder getElementOrBuilder(
        int index) {
      if (elementBuilder_ == null) {
        return element_.get(index);  } else {
        return elementBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public java.util.List<? extends com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder> 
         getElementOrBuilderList() {
      if (elementBuilder_ != null) {
        return elementBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(element_);
      }
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public com.google.template.soy.logging.AnnotatedLoggableElement.Builder addElementBuilder() {
      return getElementFieldBuilder().addBuilder(
          com.google.template.soy.logging.AnnotatedLoggableElement.getDefaultInstance());
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public com.google.template.soy.logging.AnnotatedLoggableElement.Builder addElementBuilder(
        int index) {
      return getElementFieldBuilder().addBuilder(
          index, com.google.template.soy.logging.AnnotatedLoggableElement.getDefaultInstance());
    }
    /**
     * <pre>
     * All the logging elements that are configured for the current compilation
     * unit.
     * </pre>
     *
     * <code>repeated .soy.AnnotatedLoggableElement element = 1;</code>
     */
    public java.util.List<com.google.template.soy.logging.AnnotatedLoggableElement.Builder> 
         getElementBuilderList() {
      return getElementFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.template.soy.logging.AnnotatedLoggableElement, com.google.template.soy.logging.AnnotatedLoggableElement.Builder, com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder> 
        getElementFieldBuilder() {
      if (elementBuilder_ == null) {
        elementBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.template.soy.logging.AnnotatedLoggableElement, com.google.template.soy.logging.AnnotatedLoggableElement.Builder, com.google.template.soy.logging.AnnotatedLoggableElementOrBuilder>(
                element_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        element_ = null;
      }
      return elementBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:soy.AnnotatedLoggingConfig)
  }

  // @@protoc_insertion_point(class_scope:soy.AnnotatedLoggingConfig)
  private static final com.google.template.soy.logging.AnnotatedLoggingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.template.soy.logging.AnnotatedLoggingConfig();
  }

  public static com.google.template.soy.logging.AnnotatedLoggingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnnotatedLoggingConfig>
      PARSER = new com.google.protobuf.AbstractParser<AnnotatedLoggingConfig>() {
    @java.lang.Override
    public AnnotatedLoggingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnnotatedLoggingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnnotatedLoggingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.template.soy.logging.AnnotatedLoggingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

