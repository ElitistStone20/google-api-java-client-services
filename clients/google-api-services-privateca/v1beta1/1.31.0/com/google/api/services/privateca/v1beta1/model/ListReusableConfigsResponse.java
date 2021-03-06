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

package com.google.api.services.privateca.v1beta1.model;

/**
 * Response message for CertificateAuthorityService.ListReusableConfigs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Authority API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListReusableConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve next page of results. Pass this value in
   * ListReusableConfigsRequest.next_page_token to retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of ReusableConfigs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReusableConfig> reusableConfigs;

  /**
   * A list of locations (e.g. "us-west1") that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A token to retrieve next page of results. Pass this value in
   * ListReusableConfigsRequest.next_page_token to retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve next page of results. Pass this value in
   * ListReusableConfigsRequest.next_page_token to retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListReusableConfigsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of ReusableConfigs.
   * @return value or {@code null} for none
   */
  public java.util.List<ReusableConfig> getReusableConfigs() {
    return reusableConfigs;
  }

  /**
   * The list of ReusableConfigs.
   * @param reusableConfigs reusableConfigs or {@code null} for none
   */
  public ListReusableConfigsResponse setReusableConfigs(java.util.List<ReusableConfig> reusableConfigs) {
    this.reusableConfigs = reusableConfigs;
    return this;
  }

  /**
   * A list of locations (e.g. "us-west1") that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * A list of locations (e.g. "us-west1") that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListReusableConfigsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListReusableConfigsResponse set(String fieldName, Object value) {
    return (ListReusableConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public ListReusableConfigsResponse clone() {
    return (ListReusableConfigsResponse) super.clone();
  }

}
