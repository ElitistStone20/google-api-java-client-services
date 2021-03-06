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

package com.google.api.services.youtube.model;

/**
 * Model definition for MembershipsDuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipsDuration extends com.google.api.client.json.GenericJson {

  /**
   * The date and time when the user became a continuous member across all levels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memberSince;

  /**
   * The cumulative time the user has been a member across all levels in complete months (the time
   * is rounded down to the nearest integer).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memberTotalDurationMonths;

  /**
   * The date and time when the user became a continuous member across all levels.
   * @return value or {@code null} for none
   */
  public java.lang.String getMemberSince() {
    return memberSince;
  }

  /**
   * The date and time when the user became a continuous member across all levels.
   * @param memberSince memberSince or {@code null} for none
   */
  public MembershipsDuration setMemberSince(java.lang.String memberSince) {
    this.memberSince = memberSince;
    return this;
  }

  /**
   * The cumulative time the user has been a member across all levels in complete months (the time
   * is rounded down to the nearest integer).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemberTotalDurationMonths() {
    return memberTotalDurationMonths;
  }

  /**
   * The cumulative time the user has been a member across all levels in complete months (the time
   * is rounded down to the nearest integer).
   * @param memberTotalDurationMonths memberTotalDurationMonths or {@code null} for none
   */
  public MembershipsDuration setMemberTotalDurationMonths(java.lang.Integer memberTotalDurationMonths) {
    this.memberTotalDurationMonths = memberTotalDurationMonths;
    return this;
  }

  @Override
  public MembershipsDuration set(String fieldName, Object value) {
    return (MembershipsDuration) super.set(fieldName, value);
  }

  @Override
  public MembershipsDuration clone() {
    return (MembershipsDuration) super.clone();
  }

}
