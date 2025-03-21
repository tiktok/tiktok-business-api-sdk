/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AppupdateTrackingUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AppUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class AppUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("download_url")
  private String downloadUrl = null;

  @JsonProperty("enable_retargeting")
  private String enableRetargeting = "NON_RETARGETING";

  @JsonProperty("partner")
  private String partner = null;

  @JsonProperty("platform")
  private String platform = null;

  @JsonProperty("tracking_url")
  private AppupdateTrackingUrl trackingUrl = null;

  public AppUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AppUpdateBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(required = true, description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppUpdateBody downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @Schema(description = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public AppUpdateBody enableRetargeting(String enableRetargeting) {
    this.enableRetargeting = enableRetargeting;
    return this;
  }

   /**
   * Get enableRetargeting
   * @return enableRetargeting
  **/
  @Schema(description = "")
  public String getEnableRetargeting() {
    return enableRetargeting;
  }

  public void setEnableRetargeting(String enableRetargeting) {
    this.enableRetargeting = enableRetargeting;
  }

  public AppUpdateBody partner(String partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @Schema(description = "")
  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public AppUpdateBody platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(description = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public AppUpdateBody trackingUrl(AppupdateTrackingUrl trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * Get trackingUrl
   * @return trackingUrl
  **/
  @Schema(description = "")
  public AppupdateTrackingUrl getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(AppupdateTrackingUrl trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUpdateBody appUpdateBody = (AppUpdateBody) o;
    return Objects.equals(this.advertiserId, appUpdateBody.advertiserId) &&
        Objects.equals(this.appId, appUpdateBody.appId) &&
        Objects.equals(this.downloadUrl, appUpdateBody.downloadUrl) &&
        Objects.equals(this.enableRetargeting, appUpdateBody.enableRetargeting) &&
        Objects.equals(this.partner, appUpdateBody.partner) &&
        Objects.equals(this.platform, appUpdateBody.platform) &&
        Objects.equals(this.trackingUrl, appUpdateBody.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, downloadUrl, enableRetargeting, partner, platform, trackingUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    enableRetargeting: ").append(toIndentedString(enableRetargeting)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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
