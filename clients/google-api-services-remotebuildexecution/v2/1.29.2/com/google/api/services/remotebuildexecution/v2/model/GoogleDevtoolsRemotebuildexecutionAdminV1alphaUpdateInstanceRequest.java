/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * The request used for `UpdateInstance`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Whether to enable Stackdriver logging for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean loggingEnabled;

  /**
   * Name of the instance to update. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The fields to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Whether to enable Stackdriver logging for this instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLoggingEnabled() {
    return loggingEnabled;
  }

  /**
   * Whether to enable Stackdriver logging for this instance.
   * @param loggingEnabled loggingEnabled or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest setLoggingEnabled(java.lang.Boolean loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
    return this;
  }

  /**
   * Name of the instance to update. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the instance to update. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * @param name name or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The fields to update.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * The fields to update.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateInstanceRequest) super.clone();
  }

}
