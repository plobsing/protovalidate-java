// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/bool.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.BoolConstFalse}
 */
public final class BoolConstFalse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.BoolConstFalse)
    BoolConstFalseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoolConstFalse.newBuilder() to construct.
  private BoolConstFalse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoolConstFalse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoolConstFalse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.BoolProto.internal_static_buf_validate_conformance_cases_BoolConstFalse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.BoolProto.internal_static_buf_validate_conformance_cases_BoolConstFalse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.BoolConstFalse.class, build.buf.validate.conformance.cases.BoolConstFalse.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private boolean val_ = false;
  /**
   * <code>bool val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  @java.lang.Override
  public boolean getVal() {
    return val_;
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
    if (val_ != false) {
      output.writeBool(1, val_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (val_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, val_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.BoolConstFalse)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.BoolConstFalse other = (build.buf.validate.conformance.cases.BoolConstFalse) obj;

    if (getVal()
        != other.getVal()) return false;
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
    hash = (37 * hash) + VAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVal());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.BoolConstFalse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.BoolConstFalse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.BoolConstFalse parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.BoolConstFalse prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.BoolConstFalse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.BoolConstFalse)
      build.buf.validate.conformance.cases.BoolConstFalseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.BoolProto.internal_static_buf_validate_conformance_cases_BoolConstFalse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.BoolProto.internal_static_buf_validate_conformance_cases_BoolConstFalse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.BoolConstFalse.class, build.buf.validate.conformance.cases.BoolConstFalse.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.BoolConstFalse.newBuilder()
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
      val_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.BoolProto.internal_static_buf_validate_conformance_cases_BoolConstFalse_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.BoolConstFalse getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.BoolConstFalse.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.BoolConstFalse build() {
      build.buf.validate.conformance.cases.BoolConstFalse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.BoolConstFalse buildPartial() {
      build.buf.validate.conformance.cases.BoolConstFalse result = new build.buf.validate.conformance.cases.BoolConstFalse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.BoolConstFalse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = val_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.BoolConstFalse) {
        return mergeFrom((build.buf.validate.conformance.cases.BoolConstFalse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.BoolConstFalse other) {
      if (other == build.buf.validate.conformance.cases.BoolConstFalse.getDefaultInstance()) return this;
      if (other.getVal() != false) {
        setVal(other.getVal());
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
            case 8: {
              val_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean val_ ;
    /**
     * <code>bool val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The val.
     */
    @java.lang.Override
    public boolean getVal() {
      return val_;
    }
    /**
     * <code>bool val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(boolean value) {

      val_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      val_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.BoolConstFalse)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.BoolConstFalse)
  private static final build.buf.validate.conformance.cases.BoolConstFalse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.BoolConstFalse();
  }

  public static build.buf.validate.conformance.cases.BoolConstFalse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoolConstFalse>
      PARSER = new com.google.protobuf.AbstractParser<BoolConstFalse>() {
    @java.lang.Override
    public BoolConstFalse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BoolConstFalse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoolConstFalse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.BoolConstFalse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

