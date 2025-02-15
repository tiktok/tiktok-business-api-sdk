/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixelContextAd;
import business_api_client.PixelContextPage;
import business_api_client.PixelContextUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Required to attribute events to TikTok campaigns. The context object can be removed for testing event fires
 */
@Schema(description = "Required to attribute events to TikTok campaigns. The context object can be removed for testing event fires")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class PixelContext {
  @JsonProperty("ad")
  private PixelContextAd ad = null;

  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("page")
  private PixelContextPage page = null;

  @JsonProperty("user")
  private PixelContextUser user = null;

  @JsonProperty("user_agent")
  private String userAgent = null;

  public PixelContext ad(PixelContextAd ad) {
    this.ad = ad;
    return this;
  }

   /**
   * Get ad
   * @return ad
  **/
  @Schema(description = "")
  public PixelContextAd getAd() {
    return ad;
  }

  public void setAd(PixelContextAd ad) {
    this.ad = ad;
  }

  public PixelContext ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Non-hashed public IP address of the browser. To increase the probability of matching website visitor events with TikTok ads, we recommend sending both ip and user_agent.
   * @return ip
  **/
  @Schema(description = "Non-hashed public IP address of the browser. To increase the probability of matching website visitor events with TikTok ads, we recommend sending both ip and user_agent.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public PixelContext page(PixelContextPage page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public PixelContextPage getPage() {
    return page;
  }

  public void setPage(PixelContextPage page) {
    this.page = page;
  }

  public PixelContext user(PixelContextUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public PixelContextUser getUser() {
    return user;
  }

  public void setUser(PixelContextUser user) {
    this.user = user;
  }

  public PixelContext userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Non-hashed user agent from the user’s device. To increase the probability of matching website visitor events with TikTok ads, we recommend sending both ip and user_agent.
   * @return userAgent
  **/
  @Schema(description = "Non-hashed user agent from the user’s device. To increase the probability of matching website visitor events with TikTok ads, we recommend sending both ip and user_agent.")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelContext pixelContext = (PixelContext) o;
    return Objects.equals(this.ad, pixelContext.ad) &&
        Objects.equals(this.ip, pixelContext.ip) &&
        Objects.equals(this.page, pixelContext.page) &&
        Objects.equals(this.user, pixelContext.user) &&
        Objects.equals(this.userAgent, pixelContext.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ad, ip, page, user, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelContext {\n");
    
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
