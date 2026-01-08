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
 * ContextInfoSmartPlusAdReviewInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class ContextInfoSmartPlusAdReviewInfo {
  @JsonProperty("app_id")
  private Long appId = null;

  @JsonProperty("core_user_id")
  private Long coreUserId = null;

  @JsonProperty("developer_id")
  private Long developerId = null;

  @JsonProperty("developer_region")
  private String developerRegion = null;

  @JsonProperty("referer")
  private String referer = null;

  @JsonProperty("user_agent")
  private String userAgent = null;

  @JsonProperty("x_forwarded_for")
  private String xForwardedFor = null;

  @JsonProperty("x_real_ip")
  private String xRealIp = null;

  public ContextInfoSmartPlusAdReviewInfo appId(Long appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public ContextInfoSmartPlusAdReviewInfo coreUserId(Long coreUserId) {
    this.coreUserId = coreUserId;
    return this;
  }

   /**
   * Get coreUserId
   * @return coreUserId
  **/
  @Schema(description = "")
  public Long getCoreUserId() {
    return coreUserId;
  }

  public void setCoreUserId(Long coreUserId) {
    this.coreUserId = coreUserId;
  }

  public ContextInfoSmartPlusAdReviewInfo developerId(Long developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * Get developerId
   * @return developerId
  **/
  @Schema(description = "")
  public Long getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(Long developerId) {
    this.developerId = developerId;
  }

  public ContextInfoSmartPlusAdReviewInfo developerRegion(String developerRegion) {
    this.developerRegion = developerRegion;
    return this;
  }

   /**
   * Get developerRegion
   * @return developerRegion
  **/
  @Schema(description = "")
  public String getDeveloperRegion() {
    return developerRegion;
  }

  public void setDeveloperRegion(String developerRegion) {
    this.developerRegion = developerRegion;
  }

  public ContextInfoSmartPlusAdReviewInfo referer(String referer) {
    this.referer = referer;
    return this;
  }

   /**
   * Get referer
   * @return referer
  **/
  @Schema(description = "")
  public String getReferer() {
    return referer;
  }

  public void setReferer(String referer) {
    this.referer = referer;
  }

  public ContextInfoSmartPlusAdReviewInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @Schema(description = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public ContextInfoSmartPlusAdReviewInfo xForwardedFor(String xForwardedFor) {
    this.xForwardedFor = xForwardedFor;
    return this;
  }

   /**
   * Get xForwardedFor
   * @return xForwardedFor
  **/
  @Schema(description = "")
  public String getXForwardedFor() {
    return xForwardedFor;
  }

  public void setXForwardedFor(String xForwardedFor) {
    this.xForwardedFor = xForwardedFor;
  }

  public ContextInfoSmartPlusAdReviewInfo xRealIp(String xRealIp) {
    this.xRealIp = xRealIp;
    return this;
  }

   /**
   * Get xRealIp
   * @return xRealIp
  **/
  @Schema(description = "")
  public String getXRealIp() {
    return xRealIp;
  }

  public void setXRealIp(String xRealIp) {
    this.xRealIp = xRealIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextInfoSmartPlusAdReviewInfo contextInfoSmartPlusAdReviewInfo = (ContextInfoSmartPlusAdReviewInfo) o;
    return Objects.equals(this.appId, contextInfoSmartPlusAdReviewInfo.appId) &&
        Objects.equals(this.coreUserId, contextInfoSmartPlusAdReviewInfo.coreUserId) &&
        Objects.equals(this.developerId, contextInfoSmartPlusAdReviewInfo.developerId) &&
        Objects.equals(this.developerRegion, contextInfoSmartPlusAdReviewInfo.developerRegion) &&
        Objects.equals(this.referer, contextInfoSmartPlusAdReviewInfo.referer) &&
        Objects.equals(this.userAgent, contextInfoSmartPlusAdReviewInfo.userAgent) &&
        Objects.equals(this.xForwardedFor, contextInfoSmartPlusAdReviewInfo.xForwardedFor) &&
        Objects.equals(this.xRealIp, contextInfoSmartPlusAdReviewInfo.xRealIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, coreUserId, developerId, developerRegion, referer, userAgent, xForwardedFor, xRealIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextInfoSmartPlusAdReviewInfo {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    coreUserId: ").append(toIndentedString(coreUserId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
    sb.append("    developerRegion: ").append(toIndentedString(developerRegion)).append("\n");
    sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    xForwardedFor: ").append(toIndentedString(xForwardedFor)).append("\n");
    sb.append("    xRealIp: ").append(toIndentedString(xRealIp)).append("\n");
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
