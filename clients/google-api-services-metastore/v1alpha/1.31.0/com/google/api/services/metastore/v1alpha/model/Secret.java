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

package com.google.api.services.metastore.v1alpha.model;

/**
 * A securely stored value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataproc Metastore API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Secret extends com.google.api.client.json.GenericJson {

  /**
   * The relative resource name of a Secret Manager secret version, in the following
   * form:"projects/{project_number}/secrets/{secret_id}/versions/{version_id}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudSecret;

  /**
   * The relative resource name of a Secret Manager secret version, in the following
   * form:"projects/{project_number}/secrets/{secret_id}/versions/{version_id}".
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudSecret() {
    return cloudSecret;
  }

  /**
   * The relative resource name of a Secret Manager secret version, in the following
   * form:"projects/{project_number}/secrets/{secret_id}/versions/{version_id}".
   * @param cloudSecret cloudSecret or {@code null} for none
   */
  public Secret setCloudSecret(java.lang.String cloudSecret) {
    this.cloudSecret = cloudSecret;
    return this;
  }

  @Override
  public Secret set(String fieldName, Object value) {
    return (Secret) super.set(fieldName, value);
  }

  @Override
  public Secret clone() {
    return (Secret) super.clone();
  }

}
