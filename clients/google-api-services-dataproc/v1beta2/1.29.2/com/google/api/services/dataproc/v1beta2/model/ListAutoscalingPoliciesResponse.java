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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * A response to a request to list autoscaling policies in a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAutoscalingPoliciesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. This token is included in the response if there are more results to fetch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. Autoscaling policies list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AutoscalingPolicy> policies;

  static {
    // hack to force ProGuard to consider AutoscalingPolicy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AutoscalingPolicy.class);
  }

  /**
   * Output only. This token is included in the response if there are more results to fetch.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. This token is included in the response if there are more results to fetch.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAutoscalingPoliciesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. Autoscaling policies list.
   * @return value or {@code null} for none
   */
  public java.util.List<AutoscalingPolicy> getPolicies() {
    return policies;
  }

  /**
   * Output only. Autoscaling policies list.
   * @param policies policies or {@code null} for none
   */
  public ListAutoscalingPoliciesResponse setPolicies(java.util.List<AutoscalingPolicy> policies) {
    this.policies = policies;
    return this;
  }

  @Override
  public ListAutoscalingPoliciesResponse set(String fieldName, Object value) {
    return (ListAutoscalingPoliciesResponse) super.set(fieldName, value);
  }

  @Override
  public ListAutoscalingPoliciesResponse clone() {
    return (ListAutoscalingPoliciesResponse) super.clone();
  }

}
