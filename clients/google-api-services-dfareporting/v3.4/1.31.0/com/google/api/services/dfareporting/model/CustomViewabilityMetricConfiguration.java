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
 * The attributes, like playtime and percent onscreen, that define the Custom Viewability Metric.
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
public final class CustomViewabilityMetricConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * Whether the video must be audible to count an impression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean audible;

  /**
   * The time in milliseconds the video must play for the Custom Viewability Metric to count an
   * impression. If both this and timePercent are specified, the earlier of the two will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeMillis;

  /**
   * The percentage of video that must play for the Custom Viewability Metric to count an
   * impression. If both this and timeMillis are specified, the earlier of the two will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timePercent;

  /**
   * The percentage of video that must be on screen for the Custom Viewability Metric to count an
   * impression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer viewabilityPercent;

  /**
   * Whether the video must be audible to count an impression.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAudible() {
    return audible;
  }

  /**
   * Whether the video must be audible to count an impression.
   * @param audible audible or {@code null} for none
   */
  public CustomViewabilityMetricConfiguration setAudible(java.lang.Boolean audible) {
    this.audible = audible;
    return this;
  }

  /**
   * The time in milliseconds the video must play for the Custom Viewability Metric to count an
   * impression. If both this and timePercent are specified, the earlier of the two will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeMillis() {
    return timeMillis;
  }

  /**
   * The time in milliseconds the video must play for the Custom Viewability Metric to count an
   * impression. If both this and timePercent are specified, the earlier of the two will be used.
   * @param timeMillis timeMillis or {@code null} for none
   */
  public CustomViewabilityMetricConfiguration setTimeMillis(java.lang.Integer timeMillis) {
    this.timeMillis = timeMillis;
    return this;
  }

  /**
   * The percentage of video that must play for the Custom Viewability Metric to count an
   * impression. If both this and timeMillis are specified, the earlier of the two will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimePercent() {
    return timePercent;
  }

  /**
   * The percentage of video that must play for the Custom Viewability Metric to count an
   * impression. If both this and timeMillis are specified, the earlier of the two will be used.
   * @param timePercent timePercent or {@code null} for none
   */
  public CustomViewabilityMetricConfiguration setTimePercent(java.lang.Integer timePercent) {
    this.timePercent = timePercent;
    return this;
  }

  /**
   * The percentage of video that must be on screen for the Custom Viewability Metric to count an
   * impression.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getViewabilityPercent() {
    return viewabilityPercent;
  }

  /**
   * The percentage of video that must be on screen for the Custom Viewability Metric to count an
   * impression.
   * @param viewabilityPercent viewabilityPercent or {@code null} for none
   */
  public CustomViewabilityMetricConfiguration setViewabilityPercent(java.lang.Integer viewabilityPercent) {
    this.viewabilityPercent = viewabilityPercent;
    return this;
  }

  @Override
  public CustomViewabilityMetricConfiguration set(String fieldName, Object value) {
    return (CustomViewabilityMetricConfiguration) super.set(fieldName, value);
  }

  @Override
  public CustomViewabilityMetricConfiguration clone() {
    return (CustomViewabilityMetricConfiguration) super.clone();
  }

}
