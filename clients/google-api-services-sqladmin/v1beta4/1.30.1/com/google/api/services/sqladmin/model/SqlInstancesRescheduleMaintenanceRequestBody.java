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

package com.google.api.services.sqladmin.model;

/**
 * Reschedule options for maintenance windows.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlInstancesRescheduleMaintenanceRequestBody extends com.google.api.client.json.GenericJson {

  /**
   * Required. The type of the reschedule the user wants.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Reschedule reschedule;

  /**
   * Required. The type of the reschedule the user wants.
   * @return value or {@code null} for none
   */
  public Reschedule getReschedule() {
    return reschedule;
  }

  /**
   * Required. The type of the reschedule the user wants.
   * @param reschedule reschedule or {@code null} for none
   */
  public SqlInstancesRescheduleMaintenanceRequestBody setReschedule(Reschedule reschedule) {
    this.reschedule = reschedule;
    return this;
  }

  @Override
  public SqlInstancesRescheduleMaintenanceRequestBody set(String fieldName, Object value) {
    return (SqlInstancesRescheduleMaintenanceRequestBody) super.set(fieldName, value);
  }

  @Override
  public SqlInstancesRescheduleMaintenanceRequestBody clone() {
    return (SqlInstancesRescheduleMaintenanceRequestBody) super.clone();
  }

}
