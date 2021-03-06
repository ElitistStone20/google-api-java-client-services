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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * Metadata of an ExportData operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of annotated dataset in format "projects/datasets/annotatedDatasets".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotatedDataset;

  /**
   * Output only. Timestamp when export dataset request was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The name of dataset to be exported. "projects/datasets"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * Output only. Partial failures encountered. E.g. single files that couldn't be read. Status
   * details field will contain standard GCP error details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleRpcStatus> partialFailures;

  /**
   * Output only. The name of annotated dataset in format "projects/datasets/annotatedDatasets".
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotatedDataset() {
    return annotatedDataset;
  }

  /**
   * Output only. The name of annotated dataset in format "projects/datasets/annotatedDatasets".
   * @param annotatedDataset annotatedDataset or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata setAnnotatedDataset(java.lang.String annotatedDataset) {
    this.annotatedDataset = annotatedDataset;
    return this;
  }

  /**
   * Output only. Timestamp when export dataset request was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when export dataset request was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The name of dataset to be exported. "projects/datasets"
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * Output only. The name of dataset to be exported. "projects/datasets"
   * @param dataset dataset or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * Output only. Partial failures encountered. E.g. single files that couldn't be read. Status
   * details field will contain standard GCP error details.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleRpcStatus> getPartialFailures() {
    return partialFailures;
  }

  /**
   * Output only. Partial failures encountered. E.g. single files that couldn't be read. Status
   * details field will contain standard GCP error details.
   * @param partialFailures partialFailures or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata setPartialFailures(java.util.List<GoogleRpcStatus> partialFailures) {
    this.partialFailures = partialFailures;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata clone() {
    return (GoogleCloudDatalabelingV1beta1ExportDataOperationMetadata) super.clone();
  }

}
