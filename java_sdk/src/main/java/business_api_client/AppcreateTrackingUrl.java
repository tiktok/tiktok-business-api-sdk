/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AppcreateTrackingUrl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AppcreateTrackingUrl {
  @JsonProperty("click_url")
  private String clickUrl = null;

  @JsonProperty("impression_url")
  private String impressionUrl = null;

  @JsonProperty("retargeting_click_url")
  private String retargetingClickUrl = null;

  @JsonProperty("retargeting_impression_url")
  private String retargetingImpressionUrl = null;

  public AppcreateTrackingUrl clickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
    return this;
  }

   /**
   * Get clickUrl
   * @return clickUrl
  **/
  @Schema(description = "")
  public String getClickUrl() {
    return clickUrl;
  }

  public void setClickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
  }

  public AppcreateTrackingUrl impressionUrl(String impressionUrl) {
    this.impressionUrl = impressionUrl;
    return this;
  }

   /**
   * Get impressionUrl
   * @return impressionUrl
  **/
  @Schema(description = "")
  public String getImpressionUrl() {
    return impressionUrl;
  }

  public void setImpressionUrl(String impressionUrl) {
    this.impressionUrl = impressionUrl;
  }

  public AppcreateTrackingUrl retargetingClickUrl(String retargetingClickUrl) {
    this.retargetingClickUrl = retargetingClickUrl;
    return this;
  }

   /**
   * Get retargetingClickUrl
   * @return retargetingClickUrl
  **/
  @Schema(description = "")
  public String getRetargetingClickUrl() {
    return retargetingClickUrl;
  }

  public void setRetargetingClickUrl(String retargetingClickUrl) {
    this.retargetingClickUrl = retargetingClickUrl;
  }

  public AppcreateTrackingUrl retargetingImpressionUrl(String retargetingImpressionUrl) {
    this.retargetingImpressionUrl = retargetingImpressionUrl;
    return this;
  }

   /**
   * Get retargetingImpressionUrl
   * @return retargetingImpressionUrl
  **/
  @Schema(description = "")
  public String getRetargetingImpressionUrl() {
    return retargetingImpressionUrl;
  }

  public void setRetargetingImpressionUrl(String retargetingImpressionUrl) {
    this.retargetingImpressionUrl = retargetingImpressionUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppcreateTrackingUrl appcreateTrackingUrl = (AppcreateTrackingUrl) o;
    return Objects.equals(this.clickUrl, appcreateTrackingUrl.clickUrl) &&
        Objects.equals(this.impressionUrl, appcreateTrackingUrl.impressionUrl) &&
        Objects.equals(this.retargetingClickUrl, appcreateTrackingUrl.retargetingClickUrl) &&
        Objects.equals(this.retargetingImpressionUrl, appcreateTrackingUrl.retargetingImpressionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickUrl, impressionUrl, retargetingClickUrl, retargetingImpressionUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppcreateTrackingUrl {\n");
    
    sb.append("    clickUrl: ").append(toIndentedString(clickUrl)).append("\n");
    sb.append("    impressionUrl: ").append(toIndentedString(impressionUrl)).append("\n");
    sb.append("    retargetingClickUrl: ").append(toIndentedString(retargetingClickUrl)).append("\n");
    sb.append("    retargetingImpressionUrl: ").append(toIndentedString(retargetingImpressionUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
