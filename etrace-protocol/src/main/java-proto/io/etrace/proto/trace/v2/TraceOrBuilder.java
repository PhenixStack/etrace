// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trace/v2/trace.proto

package io.etrace.proto.trace.v2;

public interface TraceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.etrace.proto.trace.v2.Trace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string request_id = 1;</code>
   */
  java.lang.String getRequestId();
  /**
   * <code>string request_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>string rpc_id = 2;</code>
   */
  java.lang.String getRpcId();
  /**
   * <code>string rpc_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getRpcIdBytes();

  /**
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */

  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attributes = 3;</code>
   */

  java.lang.String getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>.io.etrace.proto.trace.v2.Span span = 4;</code>
   */
  boolean hasSpan();
  /**
   * <code>.io.etrace.proto.trace.v2.Span span = 4;</code>
   */
  io.etrace.proto.trace.v2.Span getSpan();
  /**
   * <code>.io.etrace.proto.trace.v2.Span span = 4;</code>
   */
  io.etrace.proto.trace.v2.SpanOrBuilder getSpanOrBuilder();
}