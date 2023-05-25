// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/harness/harness.proto

package build.buf.validate.conformance.harness;

/**
 * Protobuf type {@code buf.validate.conformance.harness.TestConformanceRequest}
 */
public final class TestConformanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.harness.TestConformanceRequest)
    TestConformanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestConformanceRequest.newBuilder() to construct.
  private TestConformanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestConformanceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestConformanceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetCases();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.harness.TestConformanceRequest.class, build.buf.validate.conformance.harness.TestConformanceRequest.Builder.class);
  }

  public static final int FDSET_FIELD_NUMBER = 2;
  private com.google.protobuf.DescriptorProtos.FileDescriptorSet fdset_;
  /**
   * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
   * @return Whether the fdset field is set.
   */
  @java.lang.Override
  public boolean hasFdset() {
    return fdset_ != null;
  }
  /**
   * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
   * @return The fdset.
   */
  @java.lang.Override
  public com.google.protobuf.DescriptorProtos.FileDescriptorSet getFdset() {
    return fdset_ == null ? com.google.protobuf.DescriptorProtos.FileDescriptorSet.getDefaultInstance() : fdset_;
  }
  /**
   * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder getFdsetOrBuilder() {
    return fdset_ == null ? com.google.protobuf.DescriptorProtos.FileDescriptorSet.getDefaultInstance() : fdset_;
  }

  public static final int CASES_FIELD_NUMBER = 3;
  private static final class CasesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.Any> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.Any>newDefaultInstance(
                build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceRequest_CasesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.protobuf.Any.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.Any> cases_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
  internalGetCases() {
    if (cases_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CasesDefaultEntryHolder.defaultEntry);
    }
    return cases_;
  }
  public int getCasesCount() {
    return internalGetCases().getMap().size();
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  @java.lang.Override
  public boolean containsCases(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCases().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCasesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.Any> getCases() {
    return getCasesMap();
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.protobuf.Any> getCasesMap() {
    return internalGetCases().getMap();
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.protobuf.Any getCasesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Any defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.Any> map =
        internalGetCases().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getCasesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.protobuf.Any> map =
        internalGetCases().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (hasFdset()) {
      if (!getFdset().isInitialized()) {
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
    if (fdset_ != null) {
      output.writeMessage(2, getFdset());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCases(),
        CasesDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fdset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFdset());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.Any> entry
         : internalGetCases().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Any>
      cases__ = CasesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, cases__);
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
    if (!(obj instanceof build.buf.validate.conformance.harness.TestConformanceRequest)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.harness.TestConformanceRequest other = (build.buf.validate.conformance.harness.TestConformanceRequest) obj;

    if (hasFdset() != other.hasFdset()) return false;
    if (hasFdset()) {
      if (!getFdset()
          .equals(other.getFdset())) return false;
    }
    if (!internalGetCases().equals(
        other.internalGetCases())) return false;
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
    if (hasFdset()) {
      hash = (37 * hash) + FDSET_FIELD_NUMBER;
      hash = (53 * hash) + getFdset().hashCode();
    }
    if (!internalGetCases().getMap().isEmpty()) {
      hash = (37 * hash) + CASES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCases().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.harness.TestConformanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.harness.TestConformanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.harness.TestConformanceRequest parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.harness.TestConformanceRequest prototype) {
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
   * Protobuf type {@code buf.validate.conformance.harness.TestConformanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.harness.TestConformanceRequest)
      build.buf.validate.conformance.harness.TestConformanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetCases();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableCases();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.harness.TestConformanceRequest.class, build.buf.validate.conformance.harness.TestConformanceRequest.Builder.class);
    }

    // Construct using build.buf.validate.conformance.harness.TestConformanceRequest.newBuilder()
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
      fdset_ = null;
      if (fdsetBuilder_ != null) {
        fdsetBuilder_.dispose();
        fdsetBuilder_ = null;
      }
      internalGetMutableCases().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.harness.HarnessProto.internal_static_buf_validate_conformance_harness_TestConformanceRequest_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.harness.TestConformanceRequest getDefaultInstanceForType() {
      return build.buf.validate.conformance.harness.TestConformanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.harness.TestConformanceRequest build() {
      build.buf.validate.conformance.harness.TestConformanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.harness.TestConformanceRequest buildPartial() {
      build.buf.validate.conformance.harness.TestConformanceRequest result = new build.buf.validate.conformance.harness.TestConformanceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.harness.TestConformanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fdset_ = fdsetBuilder_ == null
            ? fdset_
            : fdsetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cases_ = internalGetCases();
        result.cases_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.harness.TestConformanceRequest) {
        return mergeFrom((build.buf.validate.conformance.harness.TestConformanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.harness.TestConformanceRequest other) {
      if (other == build.buf.validate.conformance.harness.TestConformanceRequest.getDefaultInstance()) return this;
      if (other.hasFdset()) {
        mergeFdset(other.getFdset());
      }
      internalGetMutableCases().mergeFrom(
          other.internalGetCases());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (hasFdset()) {
        if (!getFdset().isInitialized()) {
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
            case 18: {
              input.readMessage(
                  getFdsetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.Any>
              cases__ = input.readMessage(
                  CasesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCases().getMutableMap().put(
                  cases__.getKey(), cases__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private com.google.protobuf.DescriptorProtos.FileDescriptorSet fdset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DescriptorProtos.FileDescriptorSet, com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder, com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder> fdsetBuilder_;
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     * @return Whether the fdset field is set.
     */
    public boolean hasFdset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     * @return The fdset.
     */
    public com.google.protobuf.DescriptorProtos.FileDescriptorSet getFdset() {
      if (fdsetBuilder_ == null) {
        return fdset_ == null ? com.google.protobuf.DescriptorProtos.FileDescriptorSet.getDefaultInstance() : fdset_;
      } else {
        return fdsetBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    public Builder setFdset(com.google.protobuf.DescriptorProtos.FileDescriptorSet value) {
      if (fdsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fdset_ = value;
      } else {
        fdsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    public Builder setFdset(
        com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder builderForValue) {
      if (fdsetBuilder_ == null) {
        fdset_ = builderForValue.build();
      } else {
        fdsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    public Builder mergeFdset(com.google.protobuf.DescriptorProtos.FileDescriptorSet value) {
      if (fdsetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fdset_ != null &&
          fdset_ != com.google.protobuf.DescriptorProtos.FileDescriptorSet.getDefaultInstance()) {
          getFdsetBuilder().mergeFrom(value);
        } else {
          fdset_ = value;
        }
      } else {
        fdsetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    public Builder clearFdset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fdset_ = null;
      if (fdsetBuilder_ != null) {
        fdsetBuilder_.dispose();
        fdsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder getFdsetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFdsetFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    public com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder getFdsetOrBuilder() {
      if (fdsetBuilder_ != null) {
        return fdsetBuilder_.getMessageOrBuilder();
      } else {
        return fdset_ == null ?
            com.google.protobuf.DescriptorProtos.FileDescriptorSet.getDefaultInstance() : fdset_;
      }
    }
    /**
     * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DescriptorProtos.FileDescriptorSet, com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder, com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder> 
        getFdsetFieldBuilder() {
      if (fdsetBuilder_ == null) {
        fdsetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DescriptorProtos.FileDescriptorSet, com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder, com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder>(
                getFdset(),
                getParentForChildren(),
                isClean());
        fdset_ = null;
      }
      return fdsetBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.Any> cases_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
        internalGetCases() {
      if (cases_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CasesDefaultEntryHolder.defaultEntry);
      }
      return cases_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.Any>
        internalGetMutableCases() {
      if (cases_ == null) {
        cases_ = com.google.protobuf.MapField.newMapField(
            CasesDefaultEntryHolder.defaultEntry);
      }
      if (!cases_.isMutable()) {
        cases_ = cases_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return cases_;
    }
    public int getCasesCount() {
      return internalGetCases().getMap().size();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    @java.lang.Override
    public boolean containsCases(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCases().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCasesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Any> getCases() {
      return getCasesMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.Any> getCasesMap() {
      return internalGetCases().getMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.protobuf.Any getCasesOrDefault(
        java.lang.String key,
        /* nullable */
com.google.protobuf.Any defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.Any> map =
          internalGetCases().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getCasesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.protobuf.Any> map =
          internalGetCases().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearCases() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableCases().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    public Builder removeCases(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCases().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.Any>
        getMutableCases() {
      bitField0_ |= 0x00000002;
      return internalGetMutableCases().getMutableMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    public Builder putCases(
        java.lang.String key,
        com.google.protobuf.Any value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableCases().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
     */
    public Builder putAllCases(
        java.util.Map<java.lang.String, com.google.protobuf.Any> values) {
      internalGetMutableCases().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.harness.TestConformanceRequest)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.harness.TestConformanceRequest)
  private static final build.buf.validate.conformance.harness.TestConformanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.harness.TestConformanceRequest();
  }

  public static build.buf.validate.conformance.harness.TestConformanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestConformanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<TestConformanceRequest>() {
    @java.lang.Override
    public TestConformanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestConformanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestConformanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.harness.TestConformanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

