/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/agent.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The response message for [Agents.GetAgentValidationResult][google.cloud.dialogflow.cx.v3.Agents.GetAgentValidationResult].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.AgentValidationResult}
 */
public final class AgentValidationResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.AgentValidationResult)
    AgentValidationResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AgentValidationResult.newBuilder() to construct.
  private AgentValidationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AgentValidationResult() {
    name_ = "";
    flowValidationResults_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AgentValidationResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AgentValidationResult(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                flowValidationResults_ =
                    new java.util.ArrayList<
                        com.google.cloud.dialogflow.cx.v3.FlowValidationResult>();
                mutable_bitField0_ |= 0x00000001;
              }
              flowValidationResults_.add(
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3.FlowValidationResult.parser(),
                      extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        flowValidationResults_ = java.util.Collections.unmodifiableList(flowValidationResults_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.AgentProto
        .internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.AgentProto
        .internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.AgentValidationResult.class,
            com.google.cloud.dialogflow.cx.v3.AgentValidationResult.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The unique identifier of the agent validation result.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The unique identifier of the agent validation result.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/validationResult`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLOW_VALIDATION_RESULTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.dialogflow.cx.v3.FlowValidationResult>
      flowValidationResults_;
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3.FlowValidationResult>
      getFlowValidationResultsList() {
    return flowValidationResults_;
  }
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder>
      getFlowValidationResultsOrBuilderList() {
    return flowValidationResults_;
  }
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  @java.lang.Override
  public int getFlowValidationResultsCount() {
    return flowValidationResults_.size();
  }
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.FlowValidationResult getFlowValidationResults(
      int index) {
    return flowValidationResults_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Contains all flow validation results.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder
      getFlowValidationResultsOrBuilder(int index) {
    return flowValidationResults_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < flowValidationResults_.size(); i++) {
      output.writeMessage(2, flowValidationResults_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < flowValidationResults_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, flowValidationResults_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.AgentValidationResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.AgentValidationResult other =
        (com.google.cloud.dialogflow.cx.v3.AgentValidationResult) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getFlowValidationResultsList().equals(other.getFlowValidationResultsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getFlowValidationResultsCount() > 0) {
      hash = (37 * hash) + FLOW_VALIDATION_RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getFlowValidationResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dialogflow.cx.v3.AgentValidationResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response message for [Agents.GetAgentValidationResult][google.cloud.dialogflow.cx.v3.Agents.GetAgentValidationResult].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.AgentValidationResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.AgentValidationResult)
      com.google.cloud.dialogflow.cx.v3.AgentValidationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.AgentProto
          .internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.AgentProto
          .internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.AgentValidationResult.class,
              com.google.cloud.dialogflow.cx.v3.AgentValidationResult.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.AgentValidationResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFlowValidationResultsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (flowValidationResultsBuilder_ == null) {
        flowValidationResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        flowValidationResultsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.AgentProto
          .internal_static_google_cloud_dialogflow_cx_v3_AgentValidationResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.AgentValidationResult getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.AgentValidationResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.AgentValidationResult build() {
      com.google.cloud.dialogflow.cx.v3.AgentValidationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.AgentValidationResult buildPartial() {
      com.google.cloud.dialogflow.cx.v3.AgentValidationResult result =
          new com.google.cloud.dialogflow.cx.v3.AgentValidationResult(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (flowValidationResultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          flowValidationResults_ = java.util.Collections.unmodifiableList(flowValidationResults_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.flowValidationResults_ = flowValidationResults_;
      } else {
        result.flowValidationResults_ = flowValidationResultsBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3.AgentValidationResult) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.AgentValidationResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.AgentValidationResult other) {
      if (other == com.google.cloud.dialogflow.cx.v3.AgentValidationResult.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (flowValidationResultsBuilder_ == null) {
        if (!other.flowValidationResults_.isEmpty()) {
          if (flowValidationResults_.isEmpty()) {
            flowValidationResults_ = other.flowValidationResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFlowValidationResultsIsMutable();
            flowValidationResults_.addAll(other.flowValidationResults_);
          }
          onChanged();
        }
      } else {
        if (!other.flowValidationResults_.isEmpty()) {
          if (flowValidationResultsBuilder_.isEmpty()) {
            flowValidationResultsBuilder_.dispose();
            flowValidationResultsBuilder_ = null;
            flowValidationResults_ = other.flowValidationResults_;
            bitField0_ = (bitField0_ & ~0x00000001);
            flowValidationResultsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFlowValidationResultsFieldBuilder()
                    : null;
          } else {
            flowValidationResultsBuilder_.addAllMessages(other.flowValidationResults_);
          }
        }
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
      com.google.cloud.dialogflow.cx.v3.AgentValidationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.cx.v3.AgentValidationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The unique identifier of the agent validation result.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/validationResult`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique identifier of the agent validation result.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/validationResult`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique identifier of the agent validation result.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/validationResult`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique identifier of the agent validation result.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/validationResult`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique identifier of the agent validation result.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/validationResult`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.dialogflow.cx.v3.FlowValidationResult>
        flowValidationResults_ = java.util.Collections.emptyList();

    private void ensureFlowValidationResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        flowValidationResults_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3.FlowValidationResult>(
                flowValidationResults_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.FlowValidationResult,
            com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder,
            com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder>
        flowValidationResultsBuilder_;

    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.FlowValidationResult>
        getFlowValidationResultsList() {
      if (flowValidationResultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(flowValidationResults_);
      } else {
        return flowValidationResultsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public int getFlowValidationResultsCount() {
      if (flowValidationResultsBuilder_ == null) {
        return flowValidationResults_.size();
      } else {
        return flowValidationResultsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.FlowValidationResult getFlowValidationResults(
        int index) {
      if (flowValidationResultsBuilder_ == null) {
        return flowValidationResults_.get(index);
      } else {
        return flowValidationResultsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder setFlowValidationResults(
        int index, com.google.cloud.dialogflow.cx.v3.FlowValidationResult value) {
      if (flowValidationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.set(index, value);
        onChanged();
      } else {
        flowValidationResultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder setFlowValidationResults(
        int index, com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder builderForValue) {
      if (flowValidationResultsBuilder_ == null) {
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.set(index, builderForValue.build());
        onChanged();
      } else {
        flowValidationResultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder addFlowValidationResults(
        com.google.cloud.dialogflow.cx.v3.FlowValidationResult value) {
      if (flowValidationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.add(value);
        onChanged();
      } else {
        flowValidationResultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder addFlowValidationResults(
        int index, com.google.cloud.dialogflow.cx.v3.FlowValidationResult value) {
      if (flowValidationResultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.add(index, value);
        onChanged();
      } else {
        flowValidationResultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder addFlowValidationResults(
        com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder builderForValue) {
      if (flowValidationResultsBuilder_ == null) {
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.add(builderForValue.build());
        onChanged();
      } else {
        flowValidationResultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder addFlowValidationResults(
        int index, com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder builderForValue) {
      if (flowValidationResultsBuilder_ == null) {
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.add(index, builderForValue.build());
        onChanged();
      } else {
        flowValidationResultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder addAllFlowValidationResults(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3.FlowValidationResult>
            values) {
      if (flowValidationResultsBuilder_ == null) {
        ensureFlowValidationResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, flowValidationResults_);
        onChanged();
      } else {
        flowValidationResultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder clearFlowValidationResults() {
      if (flowValidationResultsBuilder_ == null) {
        flowValidationResults_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        flowValidationResultsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public Builder removeFlowValidationResults(int index) {
      if (flowValidationResultsBuilder_ == null) {
        ensureFlowValidationResultsIsMutable();
        flowValidationResults_.remove(index);
        onChanged();
      } else {
        flowValidationResultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder
        getFlowValidationResultsBuilder(int index) {
      return getFlowValidationResultsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder
        getFlowValidationResultsOrBuilder(int index) {
      if (flowValidationResultsBuilder_ == null) {
        return flowValidationResults_.get(index);
      } else {
        return flowValidationResultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder>
        getFlowValidationResultsOrBuilderList() {
      if (flowValidationResultsBuilder_ != null) {
        return flowValidationResultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(flowValidationResults_);
      }
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder
        addFlowValidationResultsBuilder() {
      return getFlowValidationResultsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.cx.v3.FlowValidationResult.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder
        addFlowValidationResultsBuilder(int index) {
      return getFlowValidationResultsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.dialogflow.cx.v3.FlowValidationResult.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Contains all flow validation results.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dialogflow.cx.v3.FlowValidationResult flow_validation_results = 2;
     * </code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder>
        getFlowValidationResultsBuilderList() {
      return getFlowValidationResultsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.FlowValidationResult,
            com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder,
            com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder>
        getFlowValidationResultsFieldBuilder() {
      if (flowValidationResultsBuilder_ == null) {
        flowValidationResultsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3.FlowValidationResult,
                com.google.cloud.dialogflow.cx.v3.FlowValidationResult.Builder,
                com.google.cloud.dialogflow.cx.v3.FlowValidationResultOrBuilder>(
                flowValidationResults_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        flowValidationResults_ = null;
      }
      return flowValidationResultsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.AgentValidationResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.AgentValidationResult)
  private static final com.google.cloud.dialogflow.cx.v3.AgentValidationResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.AgentValidationResult();
  }

  public static com.google.cloud.dialogflow.cx.v3.AgentValidationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentValidationResult> PARSER =
      new com.google.protobuf.AbstractParser<AgentValidationResult>() {
        @java.lang.Override
        public AgentValidationResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AgentValidationResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AgentValidationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentValidationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.AgentValidationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
