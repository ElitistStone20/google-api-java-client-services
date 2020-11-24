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

package com.google.api.services.dfareporting.model;

/**
 * Placement Group List Response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlacementGroupsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#placementGroupsListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Pagination token to be used for the next list operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Placement group collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlacementGroup> placementGroups;

  static {
    // hack to force ProGuard to consider PlacementGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PlacementGroup.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#placementGroupsListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#placementGroupsListResponse".
   * @param kind kind or {@code null} for none
   */
  public PlacementGroupsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Pagination token to be used for the next list operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token to be used for the next list operation.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PlacementGroupsListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Placement group collection.
   * @return value or {@code null} for none
   */
  public java.util.List<PlacementGroup> getPlacementGroups() {
    return placementGroups;
  }

  /**
   * Placement group collection.
   * @param placementGroups placementGroups or {@code null} for none
   */
  public PlacementGroupsListResponse setPlacementGroups(java.util.List<PlacementGroup> placementGroups) {
    this.placementGroups = placementGroups;
    return this;
  }

  @Override
  public PlacementGroupsListResponse set(String fieldName, Object value) {
    return (PlacementGroupsListResponse) super.set(fieldName, value);
  }

  @Override
  public PlacementGroupsListResponse clone() {
    return (PlacementGroupsListResponse) super.clone();
  }

}
