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

package com.google.api.services.speech.v1p1beta1.model;

/**
 * A speech recognition result corresponding to a portion of the audio.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech-to-Text API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SpeechRecognitionResult extends com.google.api.client.json.GenericJson {

  /**
   * Output only. May contain one or more recognition hypotheses (up to the maximum specified in
   * `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SpeechRecognitionAlternative> alternatives;

  static {
    // hack to force ProGuard to consider SpeechRecognitionAlternative used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SpeechRecognitionAlternative.class);
  }

  /**
   * For multi-channel audio, this is the channel number corresponding to the recognized result for
   * the audio from that channel. For audio_channel_count = N, its output values can range from '1'
   * to 'N'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer channelTag;

  /**
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most likelihood of being
   * spoken in the audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Output only. May contain one or more recognition hypotheses (up to the maximum specified in
   * `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * @return value or {@code null} for none
   */
  public java.util.List<SpeechRecognitionAlternative> getAlternatives() {
    return alternatives;
  }

  /**
   * Output only. May contain one or more recognition hypotheses (up to the maximum specified in
   * `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * @param alternatives alternatives or {@code null} for none
   */
  public SpeechRecognitionResult setAlternatives(java.util.List<SpeechRecognitionAlternative> alternatives) {
    this.alternatives = alternatives;
    return this;
  }

  /**
   * For multi-channel audio, this is the channel number corresponding to the recognized result for
   * the audio from that channel. For audio_channel_count = N, its output values can range from '1'
   * to 'N'.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChannelTag() {
    return channelTag;
  }

  /**
   * For multi-channel audio, this is the channel number corresponding to the recognized result for
   * the audio from that channel. For audio_channel_count = N, its output values can range from '1'
   * to 'N'.
   * @param channelTag channelTag or {@code null} for none
   */
  public SpeechRecognitionResult setChannelTag(java.lang.Integer channelTag) {
    this.channelTag = channelTag;
    return this;
  }

  /**
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most likelihood of being
   * spoken in the audio.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most likelihood of being
   * spoken in the audio.
   * @param languageCode languageCode or {@code null} for none
   */
  public SpeechRecognitionResult setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  @Override
  public SpeechRecognitionResult set(String fieldName, Object value) {
    return (SpeechRecognitionResult) super.set(fieldName, value);
  }

  @Override
  public SpeechRecognitionResult clone() {
    return (SpeechRecognitionResult) super.clone();
  }

}
