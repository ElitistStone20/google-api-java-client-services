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

package com.google.api.services.compute.model;

/**
 * Configuration and status of a self-managed SSL certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslCertificateSelfManagedSslCertificate extends com.google.api.client.json.GenericJson {

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificate;

  /**
   * A write-only private key in PEM format. Only insert requests will include this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateKey;

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificate() {
    return certificate;
  }

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   * @param certificate certificate or {@code null} for none
   */
  public SslCertificateSelfManagedSslCertificate setCertificate(java.lang.String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * A write-only private key in PEM format. Only insert requests will include this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateKey() {
    return privateKey;
  }

  /**
   * A write-only private key in PEM format. Only insert requests will include this field.
   * @param privateKey privateKey or {@code null} for none
   */
  public SslCertificateSelfManagedSslCertificate setPrivateKey(java.lang.String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  @Override
  public SslCertificateSelfManagedSslCertificate set(String fieldName, Object value) {
    return (SslCertificateSelfManagedSslCertificate) super.set(fieldName, value);
  }

  @Override
  public SslCertificateSelfManagedSslCertificate clone() {
    return (SslCertificateSelfManagedSslCertificate) super.clone();
  }

}
