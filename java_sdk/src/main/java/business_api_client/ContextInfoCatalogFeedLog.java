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
 * ContextInfoCatalogFeedLog
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class ContextInfoCatalogFeedLog {
  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("core_user_id")
  private String coreUserId = null;

  @JsonProperty("developer_id")
  private String developerId = null;

  @JsonProperty("x_forwarded_for")
  private String xForwardedFor = null;

  @JsonProperty("x_real_ip")
  private String xRealIp = null;

  public ContextInfoCatalogFeedLog appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ContextInfoCatalogFeedLog coreUserId(String coreUserId) {
    this.coreUserId = coreUserId;
    return this;
  }

   /**
   * Get coreUserId
   * @return coreUserId
  **/
  @Schema(description = "")
  public String getCoreUserId() {
    return coreUserId;
  }

  public void setCoreUserId(String coreUserId) {
    this.coreUserId = coreUserId;
  }

  public ContextInfoCatalogFeedLog developerId(String developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * Get developerId
   * @return developerId
  **/
  @Schema(description = "")
  public String getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(String developerId) {
    this.developerId = developerId;
  }

  public ContextInfoCatalogFeedLog xForwardedFor(String xForwardedFor) {
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

  public ContextInfoCatalogFeedLog xRealIp(String xRealIp) {
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
    ContextInfoCatalogFeedLog contextInfoCatalogFeedLog = (ContextInfoCatalogFeedLog) o;
    return Objects.equals(this.appId, contextInfoCatalogFeedLog.appId) &&
        Objects.equals(this.coreUserId, contextInfoCatalogFeedLog.coreUserId) &&
        Objects.equals(this.developerId, contextInfoCatalogFeedLog.developerId) &&
        Objects.equals(this.xForwardedFor, contextInfoCatalogFeedLog.xForwardedFor) &&
        Objects.equals(this.xRealIp, contextInfoCatalogFeedLog.xRealIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, coreUserId, developerId, xForwardedFor, xRealIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextInfoCatalogFeedLog {\n");
    
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
