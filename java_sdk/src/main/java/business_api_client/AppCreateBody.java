/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AppcreateTrackingUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AppCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class AppCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("download_url")
  private String downloadUrl = null;

  @JsonProperty("enable_retargeting")
  private String enableRetargeting = "NON_RETARGETING";

  @JsonProperty("partner")
  private String partner = null;

  @JsonProperty("tracking_url")
  private AppcreateTrackingUrl trackingUrl = null;

  public AppCreateBody advertiserId(String advertiserId) {
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

  public AppCreateBody downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @Schema(required = true, description = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public AppCreateBody enableRetargeting(String enableRetargeting) {
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

  public AppCreateBody partner(String partner) {
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

  public AppCreateBody trackingUrl(AppcreateTrackingUrl trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * Get trackingUrl
   * @return trackingUrl
  **/
  @Schema(description = "")
  public AppcreateTrackingUrl getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(AppcreateTrackingUrl trackingUrl) {
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
    AppCreateBody appCreateBody = (AppCreateBody) o;
    return Objects.equals(this.advertiserId, appCreateBody.advertiserId) &&
        Objects.equals(this.downloadUrl, appCreateBody.downloadUrl) &&
        Objects.equals(this.enableRetargeting, appCreateBody.enableRetargeting) &&
        Objects.equals(this.partner, appCreateBody.partner) &&
        Objects.equals(this.trackingUrl, appCreateBody.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, downloadUrl, enableRetargeting, partner, trackingUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    enableRetargeting: ").append(toIndentedString(enableRetargeting)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
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
