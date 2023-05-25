// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/oneofs.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.OneofRequired}
 */
public final class OneofRequired extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.OneofRequired)
    OneofRequiredOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OneofRequired.newBuilder() to construct.
  private OneofRequired(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OneofRequired() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OneofRequired();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_OneofRequired_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_OneofRequired_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.OneofRequired.class, build.buf.validate.conformance.cases.OneofRequired.Builder.class);
  }

  private int oCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object o_;
  public enum OCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    X(1),
    Y(2),
    NAME_WITH_UNDERSCORES(3),
    UNDER_AND_1_NUMBER(4),
    O_NOT_SET(0);
    private final int value;
    private OCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OCase valueOf(int value) {
      return forNumber(value);
    }

    public static OCase forNumber(int value) {
      switch (value) {
        case 1: return X;
        case 2: return Y;
        case 3: return NAME_WITH_UNDERSCORES;
        case 4: return UNDER_AND_1_NUMBER;
        case 0: return O_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OCase
  getOCase() {
    return OCase.forNumber(
        oCase_);
  }

  public static final int X_FIELD_NUMBER = 1;
  /**
   * <code>string x = 1 [json_name = "x"];</code>
   * @return Whether the x field is set.
   */
  public boolean hasX() {
    return oCase_ == 1;
  }
  /**
   * <code>string x = 1 [json_name = "x"];</code>
   * @return The x.
   */
  public java.lang.String getX() {
    java.lang.Object ref = "";
    if (oCase_ == 1) {
      ref = o_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (oCase_ == 1) {
        o_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string x = 1 [json_name = "x"];</code>
   * @return The bytes for x.
   */
  public com.google.protobuf.ByteString
      getXBytes() {
    java.lang.Object ref = "";
    if (oCase_ == 1) {
      ref = o_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (oCase_ == 1) {
        o_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int Y_FIELD_NUMBER = 2;
  /**
   * <code>int32 y = 2 [json_name = "y"];</code>
   * @return Whether the y field is set.
   */
  @java.lang.Override
  public boolean hasY() {
    return oCase_ == 2;
  }
  /**
   * <code>int32 y = 2 [json_name = "y"];</code>
   * @return The y.
   */
  @java.lang.Override
  public int getY() {
    if (oCase_ == 2) {
      return (java.lang.Integer) o_;
    }
    return 0;
  }

  public static final int NAME_WITH_UNDERSCORES_FIELD_NUMBER = 3;
  /**
   * <code>int32 name_with_underscores = 3 [json_name = "nameWithUnderscores"];</code>
   * @return Whether the nameWithUnderscores field is set.
   */
  @java.lang.Override
  public boolean hasNameWithUnderscores() {
    return oCase_ == 3;
  }
  /**
   * <code>int32 name_with_underscores = 3 [json_name = "nameWithUnderscores"];</code>
   * @return The nameWithUnderscores.
   */
  @java.lang.Override
  public int getNameWithUnderscores() {
    if (oCase_ == 3) {
      return (java.lang.Integer) o_;
    }
    return 0;
  }

  public static final int UNDER_AND_1_NUMBER_FIELD_NUMBER = 4;
  /**
   * <code>int32 under_and_1_number = 4 [json_name = "underAnd1Number"];</code>
   * @return Whether the underAnd1Number field is set.
   */
  @java.lang.Override
  public boolean hasUnderAnd1Number() {
    return oCase_ == 4;
  }
  /**
   * <code>int32 under_and_1_number = 4 [json_name = "underAnd1Number"];</code>
   * @return The underAnd1Number.
   */
  @java.lang.Override
  public int getUnderAnd1Number() {
    if (oCase_ == 4) {
      return (java.lang.Integer) o_;
    }
    return 0;
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
    if (oCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, o_);
    }
    if (oCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) o_));
    }
    if (oCase_ == 3) {
      output.writeInt32(
          3, (int)((java.lang.Integer) o_));
    }
    if (oCase_ == 4) {
      output.writeInt32(
          4, (int)((java.lang.Integer) o_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, o_);
    }
    if (oCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) o_));
    }
    if (oCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            3, (int)((java.lang.Integer) o_));
    }
    if (oCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            4, (int)((java.lang.Integer) o_));
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
    if (!(obj instanceof build.buf.validate.conformance.cases.OneofRequired)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.OneofRequired other = (build.buf.validate.conformance.cases.OneofRequired) obj;

    if (!getOCase().equals(other.getOCase())) return false;
    switch (oCase_) {
      case 1:
        if (!getX()
            .equals(other.getX())) return false;
        break;
      case 2:
        if (getY()
            != other.getY()) return false;
        break;
      case 3:
        if (getNameWithUnderscores()
            != other.getNameWithUnderscores()) return false;
        break;
      case 4:
        if (getUnderAnd1Number()
            != other.getUnderAnd1Number()) return false;
        break;
      case 0:
      default:
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
    switch (oCase_) {
      case 1:
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX().hashCode();
        break;
      case 2:
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
        break;
      case 3:
        hash = (37 * hash) + NAME_WITH_UNDERSCORES_FIELD_NUMBER;
        hash = (53 * hash) + getNameWithUnderscores();
        break;
      case 4:
        hash = (37 * hash) + UNDER_AND_1_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getUnderAnd1Number();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.OneofRequired parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.OneofRequired parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.OneofRequired parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.OneofRequired prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.OneofRequired}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.OneofRequired)
      build.buf.validate.conformance.cases.OneofRequiredOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_OneofRequired_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_OneofRequired_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.OneofRequired.class, build.buf.validate.conformance.cases.OneofRequired.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.OneofRequired.newBuilder()
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
      oCase_ = 0;
      o_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.OneofsProto.internal_static_buf_validate_conformance_cases_OneofRequired_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.OneofRequired getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.OneofRequired.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.OneofRequired build() {
      build.buf.validate.conformance.cases.OneofRequired result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.OneofRequired buildPartial() {
      build.buf.validate.conformance.cases.OneofRequired result = new build.buf.validate.conformance.cases.OneofRequired(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.OneofRequired result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(build.buf.validate.conformance.cases.OneofRequired result) {
      result.oCase_ = oCase_;
      result.o_ = this.o_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.OneofRequired) {
        return mergeFrom((build.buf.validate.conformance.cases.OneofRequired)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.OneofRequired other) {
      if (other == build.buf.validate.conformance.cases.OneofRequired.getDefaultInstance()) return this;
      switch (other.getOCase()) {
        case X: {
          oCase_ = 1;
          o_ = other.o_;
          onChanged();
          break;
        }
        case Y: {
          setY(other.getY());
          break;
        }
        case NAME_WITH_UNDERSCORES: {
          setNameWithUnderscores(other.getNameWithUnderscores());
          break;
        }
        case UNDER_AND_1_NUMBER: {
          setUnderAnd1Number(other.getUnderAnd1Number());
          break;
        }
        case O_NOT_SET: {
          break;
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
              java.lang.String s = input.readStringRequireUtf8();
              oCase_ = 1;
              o_ = s;
              break;
            } // case 10
            case 16: {
              o_ = input.readInt32();
              oCase_ = 2;
              break;
            } // case 16
            case 24: {
              o_ = input.readInt32();
              oCase_ = 3;
              break;
            } // case 24
            case 32: {
              o_ = input.readInt32();
              oCase_ = 4;
              break;
            } // case 32
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
    private int oCase_ = 0;
    private java.lang.Object o_;
    public OCase
        getOCase() {
      return OCase.forNumber(
          oCase_);
    }

    public Builder clearO() {
      oCase_ = 0;
      o_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string x = 1 [json_name = "x"];</code>
     * @return Whether the x field is set.
     */
    @java.lang.Override
    public boolean hasX() {
      return oCase_ == 1;
    }
    /**
     * <code>string x = 1 [json_name = "x"];</code>
     * @return The x.
     */
    @java.lang.Override
    public java.lang.String getX() {
      java.lang.Object ref = "";
      if (oCase_ == 1) {
        ref = o_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (oCase_ == 1) {
          o_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string x = 1 [json_name = "x"];</code>
     * @return The bytes for x.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getXBytes() {
      java.lang.Object ref = "";
      if (oCase_ == 1) {
        ref = o_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (oCase_ == 1) {
          o_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string x = 1 [json_name = "x"];</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oCase_ = 1;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string x = 1 [json_name = "x"];</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      if (oCase_ == 1) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string x = 1 [json_name = "x"];</code>
     * @param value The bytes for x to set.
     * @return This builder for chaining.
     */
    public Builder setXBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oCase_ = 1;
      o_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 y = 2 [json_name = "y"];</code>
     * @return Whether the y field is set.
     */
    public boolean hasY() {
      return oCase_ == 2;
    }
    /**
     * <code>int32 y = 2 [json_name = "y"];</code>
     * @return The y.
     */
    public int getY() {
      if (oCase_ == 2) {
        return (java.lang.Integer) o_;
      }
      return 0;
    }
    /**
     * <code>int32 y = 2 [json_name = "y"];</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(int value) {

      oCase_ = 2;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 y = 2 [json_name = "y"];</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      if (oCase_ == 2) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 name_with_underscores = 3 [json_name = "nameWithUnderscores"];</code>
     * @return Whether the nameWithUnderscores field is set.
     */
    public boolean hasNameWithUnderscores() {
      return oCase_ == 3;
    }
    /**
     * <code>int32 name_with_underscores = 3 [json_name = "nameWithUnderscores"];</code>
     * @return The nameWithUnderscores.
     */
    public int getNameWithUnderscores() {
      if (oCase_ == 3) {
        return (java.lang.Integer) o_;
      }
      return 0;
    }
    /**
     * <code>int32 name_with_underscores = 3 [json_name = "nameWithUnderscores"];</code>
     * @param value The nameWithUnderscores to set.
     * @return This builder for chaining.
     */
    public Builder setNameWithUnderscores(int value) {

      oCase_ = 3;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 name_with_underscores = 3 [json_name = "nameWithUnderscores"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNameWithUnderscores() {
      if (oCase_ == 3) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 under_and_1_number = 4 [json_name = "underAnd1Number"];</code>
     * @return Whether the underAnd1Number field is set.
     */
    public boolean hasUnderAnd1Number() {
      return oCase_ == 4;
    }
    /**
     * <code>int32 under_and_1_number = 4 [json_name = "underAnd1Number"];</code>
     * @return The underAnd1Number.
     */
    public int getUnderAnd1Number() {
      if (oCase_ == 4) {
        return (java.lang.Integer) o_;
      }
      return 0;
    }
    /**
     * <code>int32 under_and_1_number = 4 [json_name = "underAnd1Number"];</code>
     * @param value The underAnd1Number to set.
     * @return This builder for chaining.
     */
    public Builder setUnderAnd1Number(int value) {

      oCase_ = 4;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 under_and_1_number = 4 [json_name = "underAnd1Number"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnderAnd1Number() {
      if (oCase_ == 4) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.OneofRequired)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.OneofRequired)
  private static final build.buf.validate.conformance.cases.OneofRequired DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.OneofRequired();
  }

  public static build.buf.validate.conformance.cases.OneofRequired getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OneofRequired>
      PARSER = new com.google.protobuf.AbstractParser<OneofRequired>() {
    @java.lang.Override
    public OneofRequired parsePartialFrom(
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

  public static com.google.protobuf.Parser<OneofRequired> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OneofRequired> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.OneofRequired getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

