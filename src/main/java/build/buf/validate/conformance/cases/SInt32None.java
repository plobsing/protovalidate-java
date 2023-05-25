// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/numbers.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.SInt32None}
 */
public final class SInt32None extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.SInt32None)
    SInt32NoneOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SInt32None.newBuilder() to construct.
  private SInt32None(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SInt32None() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SInt32None();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_SInt32None_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_SInt32None_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.SInt32None.class, build.buf.validate.conformance.cases.SInt32None.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private int val_ = 0;
  /**
   * <code>sint32 val = 1 [json_name = "val"];</code>
   * @return The val.
   */
  @java.lang.Override
  public int getVal() {
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
    if (val_ != 0) {
      output.writeSInt32(1, val_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (val_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(1, val_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.SInt32None)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.SInt32None other = (build.buf.validate.conformance.cases.SInt32None) obj;

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
    hash = (53 * hash) + getVal();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.SInt32None parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.SInt32None parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.SInt32None parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.SInt32None prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.SInt32None}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.SInt32None)
      build.buf.validate.conformance.cases.SInt32NoneOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_SInt32None_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_SInt32None_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.SInt32None.class, build.buf.validate.conformance.cases.SInt32None.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.SInt32None.newBuilder()
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
      val_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.NumbersProto.internal_static_buf_validate_conformance_cases_SInt32None_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.SInt32None getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.SInt32None.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.SInt32None build() {
      build.buf.validate.conformance.cases.SInt32None result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.SInt32None buildPartial() {
      build.buf.validate.conformance.cases.SInt32None result = new build.buf.validate.conformance.cases.SInt32None(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.SInt32None result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = val_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.SInt32None) {
        return mergeFrom((build.buf.validate.conformance.cases.SInt32None)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.SInt32None other) {
      if (other == build.buf.validate.conformance.cases.SInt32None.getDefaultInstance()) return this;
      if (other.getVal() != 0) {
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
              val_ = input.readSInt32();
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

    private int val_ ;
    /**
     * <code>sint32 val = 1 [json_name = "val"];</code>
     * @return The val.
     */
    @java.lang.Override
    public int getVal() {
      return val_;
    }
    /**
     * <code>sint32 val = 1 [json_name = "val"];</code>
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(int value) {

      val_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 val = 1 [json_name = "val"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      val_ = 0;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.SInt32None)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.SInt32None)
  private static final build.buf.validate.conformance.cases.SInt32None DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.SInt32None();
  }

  public static build.buf.validate.conformance.cases.SInt32None getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SInt32None>
      PARSER = new com.google.protobuf.AbstractParser<SInt32None>() {
    @java.lang.Override
    public SInt32None parsePartialFrom(
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

  public static com.google.protobuf.Parser<SInt32None> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SInt32None> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.SInt32None getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

