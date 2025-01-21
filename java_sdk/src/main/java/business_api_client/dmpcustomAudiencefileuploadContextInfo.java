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
 * dmpcustomAudiencefileuploadContextInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class dmpcustomAudiencefileuploadContextInfo {
  @JsonProperty("app_id")
  private Long appId = null;

  @JsonProperty("core_user_id")
  private Long coreUserId = null;

  @JsonProperty("developer_id")
  private Long developerId = null;

  @JsonProperty("x_forwarded_for")
  private String xForwardedFor = null;

  @JsonProperty("x_real_ip")
  private String xRealIp = null;

  public dmpcustomAudiencefileuploadContextInfo appId(Long appId) {
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

  public dmpcustomAudiencefileuploadContextInfo coreUserId(Long coreUserId) {
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

  public dmpcustomAudiencefileuploadContextInfo developerId(Long developerId) {
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

  public dmpcustomAudiencefileuploadContextInfo xForwardedFor(String xForwardedFor) {
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

  public dmpcustomAudiencefileuploadContextInfo xRealIp(String xRealIp) {
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
    dmpcustomAudiencefileuploadContextInfo dmpcustomAudiencefileuploadContextInfo = (dmpcustomAudiencefileuploadContextInfo) o;
    return Objects.equals(this.appId, dmpcustomAudiencefileuploadContextInfo.appId) &&
        Objects.equals(this.coreUserId, dmpcustomAudiencefileuploadContextInfo.coreUserId) &&
        Objects.equals(this.developerId, dmpcustomAudiencefileuploadContextInfo.developerId) &&
        Objects.equals(this.xForwardedFor, dmpcustomAudiencefileuploadContextInfo.xForwardedFor) &&
        Objects.equals(this.xRealIp, dmpcustomAudiencefileuploadContextInfo.xRealIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, coreUserId, developerId, xForwardedFor, xRealIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class dmpcustomAudiencefileuploadContextInfo {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    coreUserId: ").append(toIndentedString(coreUserId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
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
