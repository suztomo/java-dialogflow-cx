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
// source: google/cloud/dialogflow/cx/v3/test_case.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ExportTestCasesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ExportTestCasesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported test cases. This field is
   * populated only if `gcs_uri` is specified in
   * [ExportTestCasesRequest][google.cloud.dialogflow.cx.v3.ExportTestCasesRequest].
   * </pre>
   *
   * <code>string gcs_uri = 1;</code>
   *
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString getGcsUriBytes();

  /**
   *
   *
   * <pre>
   * Uncompressed raw byte content for test cases.
   * </pre>
   *
   * <code>bytes content = 2;</code>
   *
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  public com.google.cloud.dialogflow.cx.v3.ExportTestCasesResponse.DestinationCase
      getDestinationCase();
}
