// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tests/example/v1/example.proto

package build.tests.example.v1;

/**
 * Protobuf type {@code tests.example.v1.Coordinates}
 */
public final class Coordinates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tests.example.v1.Coordinates)
    CoordinatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Coordinates.newBuilder() to construct.
  private Coordinates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Coordinates() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Coordinates();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.tests.example.v1.ExampleProto.internal_static_tests_example_v1_Coordinates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.tests.example.v1.ExampleProto.internal_static_tests_example_v1_Coordinates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.tests.example.v1.Coordinates.class, build.tests.example.v1.Coordinates.Builder.class);
  }

  public static final int LAT_FIELD_NUMBER = 1;
  private double lat_ = 0D;
  /**
   * <code>double lat = 1 [json_name = "lat", (.buf.validate.field) = { ... }</code>
   * @return The lat.
   */
  @java.lang.Override
  public double getLat() {
    return lat_;
  }

  public static final int LNG_FIELD_NUMBER = 2;
  private double lng_ = 0D;
  /**
   * <code>double lng = 2 [json_name = "lng", (.buf.validate.field) = { ... }</code>
   * @return The lng.
   */
  @java.lang.Override
  public double getLng() {
    return lng_;
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
    if (java.lang.Double.doubleToRawLongBits(lat_) != 0) {
      output.writeDouble(1, lat_);
    }
    if (java.lang.Double.doubleToRawLongBits(lng_) != 0) {
      output.writeDouble(2, lng_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(lat_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, lat_);
    }
    if (java.lang.Double.doubleToRawLongBits(lng_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, lng_);
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
    if (!(obj instanceof build.tests.example.v1.Coordinates)) {
      return super.equals(obj);
    }
    build.tests.example.v1.Coordinates other = (build.tests.example.v1.Coordinates) obj;

    if (java.lang.Double.doubleToLongBits(getLat())
        != java.lang.Double.doubleToLongBits(
            other.getLat())) return false;
    if (java.lang.Double.doubleToLongBits(getLng())
        != java.lang.Double.doubleToLongBits(
            other.getLng())) return false;
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
    hash = (37 * hash) + LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLat()));
    hash = (37 * hash) + LNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLng()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.tests.example.v1.Coordinates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.Coordinates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.tests.example.v1.Coordinates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.tests.example.v1.Coordinates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.tests.example.v1.Coordinates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.tests.example.v1.Coordinates parseFrom(
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
  public static Builder newBuilder(build.tests.example.v1.Coordinates prototype) {
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
   * Protobuf type {@code tests.example.v1.Coordinates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tests.example.v1.Coordinates)
      build.tests.example.v1.CoordinatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.tests.example.v1.ExampleProto.internal_static_tests_example_v1_Coordinates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.tests.example.v1.ExampleProto.internal_static_tests_example_v1_Coordinates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.tests.example.v1.Coordinates.class, build.tests.example.v1.Coordinates.Builder.class);
    }

    // Construct using build.tests.example.v1.Coordinates.newBuilder()
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
      lat_ = 0D;
      lng_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.tests.example.v1.ExampleProto.internal_static_tests_example_v1_Coordinates_descriptor;
    }

    @java.lang.Override
    public build.tests.example.v1.Coordinates getDefaultInstanceForType() {
      return build.tests.example.v1.Coordinates.getDefaultInstance();
    }

    @java.lang.Override
    public build.tests.example.v1.Coordinates build() {
      build.tests.example.v1.Coordinates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.tests.example.v1.Coordinates buildPartial() {
      build.tests.example.v1.Coordinates result = new build.tests.example.v1.Coordinates(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.tests.example.v1.Coordinates result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lat_ = lat_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lng_ = lng_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.tests.example.v1.Coordinates) {
        return mergeFrom((build.tests.example.v1.Coordinates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.tests.example.v1.Coordinates other) {
      if (other == build.tests.example.v1.Coordinates.getDefaultInstance()) return this;
      if (other.getLat() != 0D) {
        setLat(other.getLat());
      }
      if (other.getLng() != 0D) {
        setLng(other.getLng());
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
            case 9: {
              lat_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              lng_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
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

    private double lat_ ;
    /**
     * <code>double lat = 1 [json_name = "lat", (.buf.validate.field) = { ... }</code>
     * @return The lat.
     */
    @java.lang.Override
    public double getLat() {
      return lat_;
    }
    /**
     * <code>double lat = 1 [json_name = "lat", (.buf.validate.field) = { ... }</code>
     * @param value The lat to set.
     * @return This builder for chaining.
     */
    public Builder setLat(double value) {

      lat_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>double lat = 1 [json_name = "lat", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLat() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lat_ = 0D;
      onChanged();
      return this;
    }

    private double lng_ ;
    /**
     * <code>double lng = 2 [json_name = "lng", (.buf.validate.field) = { ... }</code>
     * @return The lng.
     */
    @java.lang.Override
    public double getLng() {
      return lng_;
    }
    /**
     * <code>double lng = 2 [json_name = "lng", (.buf.validate.field) = { ... }</code>
     * @param value The lng to set.
     * @return This builder for chaining.
     */
    public Builder setLng(double value) {

      lng_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double lng = 2 [json_name = "lng", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLng() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lng_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:tests.example.v1.Coordinates)
  }

  // @@protoc_insertion_point(class_scope:tests.example.v1.Coordinates)
  private static final build.tests.example.v1.Coordinates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.tests.example.v1.Coordinates();
  }

  public static build.tests.example.v1.Coordinates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Coordinates>
      PARSER = new com.google.protobuf.AbstractParser<Coordinates>() {
    @java.lang.Override
    public Coordinates parsePartialFrom(
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

  public static com.google.protobuf.Parser<Coordinates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Coordinates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.tests.example.v1.Coordinates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

