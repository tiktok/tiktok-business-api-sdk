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
 * SmartPlusAdUpdateBodyAdConfigurationTrackingInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class SmartPlusAdUpdateBodyAdConfigurationTrackingInfo {
  @JsonProperty("click_tracking_url")
  private String clickTrackingUrl = null;

  @JsonProperty("impression_tracking_url")
  private String impressionTrackingUrl = null;

  @JsonProperty("tracking_app_id")
  private String trackingAppId = null;

  public SmartPlusAdUpdateBodyAdConfigurationTrackingInfo clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

   /**
   * Get clickTrackingUrl
   * @return clickTrackingUrl
  **/
  @Schema(description = "")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public SmartPlusAdUpdateBodyAdConfigurationTrackingInfo impressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

   /**
   * Get impressionTrackingUrl
   * @return impressionTrackingUrl
  **/
  @Schema(description = "")
  public String getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  public void setImpressionTrackingUrl(String impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
  }

  public SmartPlusAdUpdateBodyAdConfigurationTrackingInfo trackingAppId(String trackingAppId) {
    this.trackingAppId = trackingAppId;
    return this;
  }

   /**
   * Get trackingAppId
   * @return trackingAppId
  **/
  @Schema(description = "")
  public String getTrackingAppId() {
    return trackingAppId;
  }

  public void setTrackingAppId(String trackingAppId) {
    this.trackingAppId = trackingAppId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdUpdateBodyAdConfigurationTrackingInfo smartPlusAdUpdateBodyAdConfigurationTrackingInfo = (SmartPlusAdUpdateBodyAdConfigurationTrackingInfo) o;
    return Objects.equals(this.clickTrackingUrl, smartPlusAdUpdateBodyAdConfigurationTrackingInfo.clickTrackingUrl) &&
        Objects.equals(this.impressionTrackingUrl, smartPlusAdUpdateBodyAdConfigurationTrackingInfo.impressionTrackingUrl) &&
        Objects.equals(this.trackingAppId, smartPlusAdUpdateBodyAdConfigurationTrackingInfo.trackingAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickTrackingUrl, impressionTrackingUrl, trackingAppId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdUpdateBodyAdConfigurationTrackingInfo {\n");
    
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    impressionTrackingUrl: ").append(toIndentedString(impressionTrackingUrl)).append("\n");
    sb.append("    trackingAppId: ").append(toIndentedString(trackingAppId)).append("\n");
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
