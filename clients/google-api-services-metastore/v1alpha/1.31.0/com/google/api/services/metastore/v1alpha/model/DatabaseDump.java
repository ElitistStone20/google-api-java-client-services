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
 * A specification of the location of and metadata about a database dump from a relational database
 * management system.
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
public final class DatabaseDump extends com.google.api.client.json.GenericJson {

  /**
   * The type of the database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseType;

  /**
   * A Cloud Storage object URI that specifies the source from which to import metadata. It must
   * begin with gs://.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsUri;

  /**
   * The name of the source database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDatabase;

  /**
   * The type of the database.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseType() {
    return databaseType;
  }

  /**
   * The type of the database.
   * @param databaseType databaseType or {@code null} for none
   */
  public DatabaseDump setDatabaseType(java.lang.String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

  /**
   * A Cloud Storage object URI that specifies the source from which to import metadata. It must
   * begin with gs://.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsUri() {
    return gcsUri;
  }

  /**
   * A Cloud Storage object URI that specifies the source from which to import metadata. It must
   * begin with gs://.
   * @param gcsUri gcsUri or {@code null} for none
   */
  public DatabaseDump setGcsUri(java.lang.String gcsUri) {
    this.gcsUri = gcsUri;
    return this;
  }

  /**
   * The name of the source database.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDatabase() {
    return sourceDatabase;
  }

  /**
   * The name of the source database.
   * @param sourceDatabase sourceDatabase or {@code null} for none
   */
  public DatabaseDump setSourceDatabase(java.lang.String sourceDatabase) {
    this.sourceDatabase = sourceDatabase;
    return this;
  }

  @Override
  public DatabaseDump set(String fieldName, Object value) {
    return (DatabaseDump) super.set(fieldName, value);
  }

  @Override
  public DatabaseDump clone() {
    return (DatabaseDump) super.clone();
  }

}
