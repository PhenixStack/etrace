// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector/metrics/v2/metrics_service.proto

package io.etrace.proto.collector.metrics.v2;

/**
 * Protobuf type {@code io.etrace.proto.collector.metrics.v2.MetricsServiceRequest}
 */
public  final class MetricsServiceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.etrace.proto.collector.metrics.v2.MetricsServiceRequest)
    MetricsServiceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetricsServiceRequest.newBuilder() to construct.
  private MetricsServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricsServiceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetricsServiceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.etrace.proto.common.v2.Resource.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(io.etrace.proto.common.v2.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.etrace.proto.metrics.v2.ResourceMetrics.Builder subBuilder = null;
            if (resourceMetrics_ != null) {
              subBuilder = resourceMetrics_.toBuilder();
            }
            resourceMetrics_ = input.readMessage(io.etrace.proto.metrics.v2.ResourceMetrics.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resourceMetrics_);
              resourceMetrics_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.etrace.proto.collector.metrics.v2.MetricsServiceProto.internal_static_io_etrace_proto_collector_metrics_v2_MetricsServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.etrace.proto.collector.metrics.v2.MetricsServiceProto.internal_static_io_etrace_proto_collector_metrics_v2_MetricsServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.class, io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private io.etrace.proto.common.v2.Resource resource_;
  /**
   * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
   */
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
   */
  public io.etrace.proto.common.v2.Resource getResource() {
    return resource_ == null ? io.etrace.proto.common.v2.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
   */
  public io.etrace.proto.common.v2.ResourceOrBuilder getResourceOrBuilder() {
    return getResource();
  }

  public static final int RESOURCE_METRICS_FIELD_NUMBER = 2;
  private io.etrace.proto.metrics.v2.ResourceMetrics resourceMetrics_;
  /**
   * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
   */
  public boolean hasResourceMetrics() {
    return resourceMetrics_ != null;
  }
  /**
   * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
   */
  public io.etrace.proto.metrics.v2.ResourceMetrics getResourceMetrics() {
    return resourceMetrics_ == null ? io.etrace.proto.metrics.v2.ResourceMetrics.getDefaultInstance() : resourceMetrics_;
  }
  /**
   * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
   */
  public io.etrace.proto.metrics.v2.ResourceMetricsOrBuilder getResourceMetricsOrBuilder() {
    return getResourceMetrics();
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
    if (resourceMetrics_ != null) {
      output.writeMessage(2, getResourceMetrics());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResource());
    }
    if (resourceMetrics_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResourceMetrics());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.etrace.proto.collector.metrics.v2.MetricsServiceRequest)) {
      return super.equals(obj);
    }
    io.etrace.proto.collector.metrics.v2.MetricsServiceRequest other = (io.etrace.proto.collector.metrics.v2.MetricsServiceRequest) obj;

    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
    }
    if (hasResourceMetrics() != other.hasResourceMetrics()) return false;
    if (hasResourceMetrics()) {
      if (!getResourceMetrics()
          .equals(other.getResourceMetrics())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    if (hasResourceMetrics()) {
      hash = (37 * hash) + RESOURCE_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceMetrics().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parseFrom(
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
  public static Builder newBuilder(io.etrace.proto.collector.metrics.v2.MetricsServiceRequest prototype) {
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
   * Protobuf type {@code io.etrace.proto.collector.metrics.v2.MetricsServiceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.etrace.proto.collector.metrics.v2.MetricsServiceRequest)
      io.etrace.proto.collector.metrics.v2.MetricsServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.etrace.proto.collector.metrics.v2.MetricsServiceProto.internal_static_io_etrace_proto_collector_metrics_v2_MetricsServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.etrace.proto.collector.metrics.v2.MetricsServiceProto.internal_static_io_etrace_proto_collector_metrics_v2_MetricsServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.class, io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.Builder.class);
    }

    // Construct using io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      if (resourceMetricsBuilder_ == null) {
        resourceMetrics_ = null;
      } else {
        resourceMetrics_ = null;
        resourceMetricsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.etrace.proto.collector.metrics.v2.MetricsServiceProto.internal_static_io_etrace_proto_collector_metrics_v2_MetricsServiceRequest_descriptor;
    }

    @java.lang.Override
    public io.etrace.proto.collector.metrics.v2.MetricsServiceRequest getDefaultInstanceForType() {
      return io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.etrace.proto.collector.metrics.v2.MetricsServiceRequest build() {
      io.etrace.proto.collector.metrics.v2.MetricsServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.etrace.proto.collector.metrics.v2.MetricsServiceRequest buildPartial() {
      io.etrace.proto.collector.metrics.v2.MetricsServiceRequest result = new io.etrace.proto.collector.metrics.v2.MetricsServiceRequest(this);
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      if (resourceMetricsBuilder_ == null) {
        result.resourceMetrics_ = resourceMetrics_;
      } else {
        result.resourceMetrics_ = resourceMetricsBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof io.etrace.proto.collector.metrics.v2.MetricsServiceRequest) {
        return mergeFrom((io.etrace.proto.collector.metrics.v2.MetricsServiceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.etrace.proto.collector.metrics.v2.MetricsServiceRequest other) {
      if (other == io.etrace.proto.collector.metrics.v2.MetricsServiceRequest.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (other.hasResourceMetrics()) {
        mergeResourceMetrics(other.getResourceMetrics());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.etrace.proto.collector.metrics.v2.MetricsServiceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.etrace.proto.collector.metrics.v2.MetricsServiceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.etrace.proto.common.v2.Resource resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.etrace.proto.common.v2.Resource, io.etrace.proto.common.v2.Resource.Builder, io.etrace.proto.common.v2.ResourceOrBuilder> resourceBuilder_;
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public io.etrace.proto.common.v2.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? io.etrace.proto.common.v2.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public Builder setResource(io.etrace.proto.common.v2.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public Builder setResource(
        io.etrace.proto.common.v2.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public Builder mergeResource(io.etrace.proto.common.v2.Resource value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            io.etrace.proto.common.v2.Resource.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public io.etrace.proto.common.v2.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    public io.etrace.proto.common.v2.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            io.etrace.proto.common.v2.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <code>.io.etrace.proto.common.v2.Resource resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.etrace.proto.common.v2.Resource, io.etrace.proto.common.v2.Resource.Builder, io.etrace.proto.common.v2.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.etrace.proto.common.v2.Resource, io.etrace.proto.common.v2.Resource.Builder, io.etrace.proto.common.v2.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }

    private io.etrace.proto.metrics.v2.ResourceMetrics resourceMetrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.etrace.proto.metrics.v2.ResourceMetrics, io.etrace.proto.metrics.v2.ResourceMetrics.Builder, io.etrace.proto.metrics.v2.ResourceMetricsOrBuilder> resourceMetricsBuilder_;
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public boolean hasResourceMetrics() {
      return resourceMetricsBuilder_ != null || resourceMetrics_ != null;
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public io.etrace.proto.metrics.v2.ResourceMetrics getResourceMetrics() {
      if (resourceMetricsBuilder_ == null) {
        return resourceMetrics_ == null ? io.etrace.proto.metrics.v2.ResourceMetrics.getDefaultInstance() : resourceMetrics_;
      } else {
        return resourceMetricsBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public Builder setResourceMetrics(io.etrace.proto.metrics.v2.ResourceMetrics value) {
      if (resourceMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resourceMetrics_ = value;
        onChanged();
      } else {
        resourceMetricsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public Builder setResourceMetrics(
        io.etrace.proto.metrics.v2.ResourceMetrics.Builder builderForValue) {
      if (resourceMetricsBuilder_ == null) {
        resourceMetrics_ = builderForValue.build();
        onChanged();
      } else {
        resourceMetricsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public Builder mergeResourceMetrics(io.etrace.proto.metrics.v2.ResourceMetrics value) {
      if (resourceMetricsBuilder_ == null) {
        if (resourceMetrics_ != null) {
          resourceMetrics_ =
            io.etrace.proto.metrics.v2.ResourceMetrics.newBuilder(resourceMetrics_).mergeFrom(value).buildPartial();
        } else {
          resourceMetrics_ = value;
        }
        onChanged();
      } else {
        resourceMetricsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public Builder clearResourceMetrics() {
      if (resourceMetricsBuilder_ == null) {
        resourceMetrics_ = null;
        onChanged();
      } else {
        resourceMetrics_ = null;
        resourceMetricsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public io.etrace.proto.metrics.v2.ResourceMetrics.Builder getResourceMetricsBuilder() {
      
      onChanged();
      return getResourceMetricsFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    public io.etrace.proto.metrics.v2.ResourceMetricsOrBuilder getResourceMetricsOrBuilder() {
      if (resourceMetricsBuilder_ != null) {
        return resourceMetricsBuilder_.getMessageOrBuilder();
      } else {
        return resourceMetrics_ == null ?
            io.etrace.proto.metrics.v2.ResourceMetrics.getDefaultInstance() : resourceMetrics_;
      }
    }
    /**
     * <code>.io.etrace.proto.metrics.v2.ResourceMetrics resource_metrics = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.etrace.proto.metrics.v2.ResourceMetrics, io.etrace.proto.metrics.v2.ResourceMetrics.Builder, io.etrace.proto.metrics.v2.ResourceMetricsOrBuilder> 
        getResourceMetricsFieldBuilder() {
      if (resourceMetricsBuilder_ == null) {
        resourceMetricsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.etrace.proto.metrics.v2.ResourceMetrics, io.etrace.proto.metrics.v2.ResourceMetrics.Builder, io.etrace.proto.metrics.v2.ResourceMetricsOrBuilder>(
                getResourceMetrics(),
                getParentForChildren(),
                isClean());
        resourceMetrics_ = null;
      }
      return resourceMetricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.etrace.proto.collector.metrics.v2.MetricsServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:io.etrace.proto.collector.metrics.v2.MetricsServiceRequest)
  private static final io.etrace.proto.collector.metrics.v2.MetricsServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.etrace.proto.collector.metrics.v2.MetricsServiceRequest();
  }

  public static io.etrace.proto.collector.metrics.v2.MetricsServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricsServiceRequest>
      PARSER = new com.google.protobuf.AbstractParser<MetricsServiceRequest>() {
    @java.lang.Override
    public MetricsServiceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetricsServiceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetricsServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricsServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.etrace.proto.collector.metrics.v2.MetricsServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
