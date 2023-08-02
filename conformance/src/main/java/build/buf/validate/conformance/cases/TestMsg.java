// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/messages.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.TestMsg}
 */
public final class TestMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.TestMsg)
    TestMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestMsg.newBuilder() to construct.
  private TestMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestMsg() {
    const_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestMsg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.MessagesProto.internal_static_buf_validate_conformance_cases_TestMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.MessagesProto.internal_static_buf_validate_conformance_cases_TestMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.TestMsg.class, build.buf.validate.conformance.cases.TestMsg.Builder.class);
  }

  public static final int CONST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object const_ = "";
  /**
   * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
   * @return The const.
   */
  @java.lang.Override
  public java.lang.String getConst() {
    java.lang.Object ref = const_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      const_ = s;
      return s;
    }
  }
  /**
   * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
   * @return The bytes for const.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConstBytes() {
    java.lang.Object ref = const_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      const_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NESTED_FIELD_NUMBER = 2;
  private build.buf.validate.conformance.cases.TestMsg nested_;
  /**
   * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
   * @return Whether the nested field is set.
   */
  @java.lang.Override
  public boolean hasNested() {
    return nested_ != null;
  }
  /**
   * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
   * @return The nested.
   */
  @java.lang.Override
  public build.buf.validate.conformance.cases.TestMsg getNested() {
    return nested_ == null ? build.buf.validate.conformance.cases.TestMsg.getDefaultInstance() : nested_;
  }
  /**
   * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
   */
  @java.lang.Override
  public build.buf.validate.conformance.cases.TestMsgOrBuilder getNestedOrBuilder() {
    return nested_ == null ? build.buf.validate.conformance.cases.TestMsg.getDefaultInstance() : nested_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(const_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, const_);
    }
    if (nested_ != null) {
      output.writeMessage(2, getNested());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(const_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, const_);
    }
    if (nested_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNested());
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
    if (!(obj instanceof build.buf.validate.conformance.cases.TestMsg)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.TestMsg other = (build.buf.validate.conformance.cases.TestMsg) obj;

    if (!getConst()
        .equals(other.getConst())) return false;
    if (hasNested() != other.hasNested()) return false;
    if (hasNested()) {
      if (!getNested()
          .equals(other.getNested())) return false;
    }
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
    hash = (37 * hash) + CONST_FIELD_NUMBER;
    hash = (53 * hash) + getConst().hashCode();
    if (hasNested()) {
      hash = (37 * hash) + NESTED_FIELD_NUMBER;
      hash = (53 * hash) + getNested().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.TestMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.TestMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.TestMsg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.buf.validate.conformance.cases.TestMsg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code buf.validate.conformance.cases.TestMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.TestMsg)
      build.buf.validate.conformance.cases.TestMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.MessagesProto.internal_static_buf_validate_conformance_cases_TestMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.MessagesProto.internal_static_buf_validate_conformance_cases_TestMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.TestMsg.class, build.buf.validate.conformance.cases.TestMsg.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.TestMsg.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      const_ = "";
      nested_ = null;
      if (nestedBuilder_ != null) {
        nestedBuilder_.dispose();
        nestedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.MessagesProto.internal_static_buf_validate_conformance_cases_TestMsg_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.TestMsg getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.TestMsg.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.TestMsg build() {
      build.buf.validate.conformance.cases.TestMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.TestMsg buildPartial() {
      build.buf.validate.conformance.cases.TestMsg result = new build.buf.validate.conformance.cases.TestMsg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.TestMsg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.const_ = const_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nested_ = nestedBuilder_ == null
            ? nested_
            : nestedBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.TestMsg) {
        return mergeFrom((build.buf.validate.conformance.cases.TestMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.TestMsg other) {
      if (other == build.buf.validate.conformance.cases.TestMsg.getDefaultInstance()) return this;
      if (!other.getConst().isEmpty()) {
        const_ = other.const_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasNested()) {
        mergeNested(other.getNested());
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
              const_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getNestedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object const_ = "";
    /**
     * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
     * @return The const.
     */
    public java.lang.String getConst() {
      java.lang.Object ref = const_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        const_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
     * @return The bytes for const.
     */
    public com.google.protobuf.ByteString
        getConstBytes() {
      java.lang.Object ref = const_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        const_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
     * @param value The const to set.
     * @return This builder for chaining.
     */
    public Builder setConst(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      const_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConst() {
      const_ = getDefaultInstance().getConst();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string const = 1 [json_name = "const", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for const to set.
     * @return This builder for chaining.
     */
    public Builder setConstBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      const_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private build.buf.validate.conformance.cases.TestMsg nested_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buf.validate.conformance.cases.TestMsg, build.buf.validate.conformance.cases.TestMsg.Builder, build.buf.validate.conformance.cases.TestMsgOrBuilder> nestedBuilder_;
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     * @return Whether the nested field is set.
     */
    public boolean hasNested() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     * @return The nested.
     */
    public build.buf.validate.conformance.cases.TestMsg getNested() {
      if (nestedBuilder_ == null) {
        return nested_ == null ? build.buf.validate.conformance.cases.TestMsg.getDefaultInstance() : nested_;
      } else {
        return nestedBuilder_.getMessage();
      }
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    public Builder setNested(build.buf.validate.conformance.cases.TestMsg value) {
      if (nestedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nested_ = value;
      } else {
        nestedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    public Builder setNested(
        build.buf.validate.conformance.cases.TestMsg.Builder builderForValue) {
      if (nestedBuilder_ == null) {
        nested_ = builderForValue.build();
      } else {
        nestedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    public Builder mergeNested(build.buf.validate.conformance.cases.TestMsg value) {
      if (nestedBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          nested_ != null &&
          nested_ != build.buf.validate.conformance.cases.TestMsg.getDefaultInstance()) {
          getNestedBuilder().mergeFrom(value);
        } else {
          nested_ = value;
        }
      } else {
        nestedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    public Builder clearNested() {
      bitField0_ = (bitField0_ & ~0x00000002);
      nested_ = null;
      if (nestedBuilder_ != null) {
        nestedBuilder_.dispose();
        nestedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    public build.buf.validate.conformance.cases.TestMsg.Builder getNestedBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNestedFieldBuilder().getBuilder();
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    public build.buf.validate.conformance.cases.TestMsgOrBuilder getNestedOrBuilder() {
      if (nestedBuilder_ != null) {
        return nestedBuilder_.getMessageOrBuilder();
      } else {
        return nested_ == null ?
            build.buf.validate.conformance.cases.TestMsg.getDefaultInstance() : nested_;
      }
    }
    /**
     * <code>.buf.validate.conformance.cases.TestMsg nested = 2 [json_name = "nested"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.buf.validate.conformance.cases.TestMsg, build.buf.validate.conformance.cases.TestMsg.Builder, build.buf.validate.conformance.cases.TestMsgOrBuilder> 
        getNestedFieldBuilder() {
      if (nestedBuilder_ == null) {
        nestedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.buf.validate.conformance.cases.TestMsg, build.buf.validate.conformance.cases.TestMsg.Builder, build.buf.validate.conformance.cases.TestMsgOrBuilder>(
                getNested(),
                getParentForChildren(),
                isClean());
        nested_ = null;
      }
      return nestedBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.TestMsg)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.TestMsg)
  private static final build.buf.validate.conformance.cases.TestMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.TestMsg();
  }

  public static build.buf.validate.conformance.cases.TestMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestMsg>
      PARSER = new com.google.protobuf.AbstractParser<TestMsg>() {
    @java.lang.Override
    public TestMsg parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.TestMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
