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
 * Represents a grouping of related user role permissions.
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
public final class UserRolePermissionGroup extends com.google.api.client.json.GenericJson {

  /**
   * ID of this user role permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#userRolePermissionGroup".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this user role permission group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * ID of this user role permission.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this user role permission.
   * @param id id or {@code null} for none
   */
  public UserRolePermissionGroup setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#userRolePermissionGroup".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#userRolePermissionGroup".
   * @param kind kind or {@code null} for none
   */
  public UserRolePermissionGroup setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this user role permission group.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this user role permission group.
   * @param name name or {@code null} for none
   */
  public UserRolePermissionGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public UserRolePermissionGroup set(String fieldName, Object value) {
    return (UserRolePermissionGroup) super.set(fieldName, value);
  }

  @Override
  public UserRolePermissionGroup clone() {
    return (UserRolePermissionGroup) super.clone();
  }

}
