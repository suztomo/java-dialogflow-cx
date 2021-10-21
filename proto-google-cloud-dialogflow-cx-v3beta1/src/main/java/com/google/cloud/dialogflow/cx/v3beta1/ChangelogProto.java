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
// source: google/cloud/dialogflow/cx/v3beta1/changelog.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class ChangelogProto {
  private ChangelogProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetChangelogRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetChangelogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Changelog_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Changelog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/dialogflow/cx/v3beta1/cha"
          + "ngelog.proto\022\"google.cloud.dialogflow.cx"
          + ".v3beta1\032\034google/api/annotations.proto\032\027"
          + "google/api/client.proto\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032\034google/protobuf/struct.proto\032\037googl"
          + "e/protobuf/timestamp.proto\"\213\001\n\025ListChang"
          + "elogsRequest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\022#di"
          + "alogflow.googleapis.com/Changelog\022\016\n\006fil"
          + "ter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_tok"
          + "en\030\004 \001(\t\"t\n\026ListChangelogsResponse\022A\n\nch"
          + "angelogs\030\001 \003(\0132-.google.cloud.dialogflow"
          + ".cx.v3beta1.Changelog\022\027\n\017next_page_token"
          + "\030\002 \001(\t\"P\n\023GetChangelogRequest\0229\n\004name\030\001 "
          + "\001(\tB+\340A\002\372A%\n#dialogflow.googleapis.com/C"
          + "hangelog\"\235\002\n\tChangelog\022\014\n\004name\030\001 \001(\t\022\022\n\n"
          + "user_email\030\002 \001(\t\022\024\n\014display_name\030\007 \001(\t\022\016"
          + "\n\006action\030\013 \001(\t\022\014\n\004type\030\010 \001(\t\022\020\n\010resource"
          + "\030\003 \001(\t\022/\n\013create_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.Timestamp:w\352At\n#dialogflow.googlea"
          + "pis.com/Changelog\022Mprojects/{project}/lo"
          + "cations/{location}/agents/{agent}/change"
          + "logs/{changelog}2\245\004\n\nChangelogs\022\326\001\n\016List"
          + "Changelogs\0229.google.cloud.dialogflow.cx."
          + "v3beta1.ListChangelogsRequest\032:.google.c"
          + "loud.dialogflow.cx.v3beta1.ListChangelog"
          + "sResponse\"M\202\323\344\223\002>\022</v3beta1/{parent=proj"
          + "ects/*/locations/*/agents/*}/changelogs\332"
          + "A\006parent\022\303\001\n\014GetChangelog\0227.google.cloud"
          + ".dialogflow.cx.v3beta1.GetChangelogReque"
          + "st\032-.google.cloud.dialogflow.cx.v3beta1."
          + "Changelog\"K\202\323\344\223\002>\022</v3beta1/{name=projec"
          + "ts/*/locations/*/agents/*/changelogs/*}\332"
          + "A\004name\032x\312A\031dialogflow.googleapis.com\322AYh"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tform,https://www.googleapis.com/auth/di"
          + "alogflowB\326\001\n&com.google.cloud.dialogflow"
          + ".cx.v3beta1B\016ChangelogProtoP\001ZDgoogle.go"
          + "lang.org/genproto/googleapis/cloud/dialo"
          + "gflow/cx/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Clo"
          + "ud.Dialogflow.Cx.V3Beta1\352\002&Google::Cloud"
          + "::Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListChangelogsResponse_descriptor,
            new java.lang.String[] {
              "Changelogs", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetChangelogRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetChangelogRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetChangelogRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Changelog_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Changelog_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Changelog_descriptor,
            new java.lang.String[] {
              "Name", "UserEmail", "DisplayName", "Action", "Type", "Resource", "CreateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
