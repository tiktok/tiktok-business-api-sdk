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
 * CatalogcreateCatalogConf
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class CatalogcreateCatalogConf {
  @JsonProperty("business_platform")
  private String businessPlatform = null;

  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("region_code")
  private String regionCode = null;

  public CatalogcreateCatalogConf businessPlatform(String businessPlatform) {
    this.businessPlatform = businessPlatform;
    return this;
  }

   /**
   * Get businessPlatform
   * @return businessPlatform
  **/
  @Schema(description = "")
  public String getBusinessPlatform() {
    return businessPlatform;
  }

  public void setBusinessPlatform(String businessPlatform) {
    this.businessPlatform = businessPlatform;
  }

  public CatalogcreateCatalogConf channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @Schema(description = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public CatalogcreateCatalogConf currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(required = true, description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CatalogcreateCatalogConf regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * Get regionCode
   * @return regionCode
  **/
  @Schema(required = true, description = "")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogcreateCatalogConf catalogcreateCatalogConf = (CatalogcreateCatalogConf) o;
    return Objects.equals(this.businessPlatform, catalogcreateCatalogConf.businessPlatform) &&
        Objects.equals(this.channel, catalogcreateCatalogConf.channel) &&
        Objects.equals(this.currency, catalogcreateCatalogConf.currency) &&
        Objects.equals(this.regionCode, catalogcreateCatalogConf.regionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessPlatform, channel, currency, regionCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogcreateCatalogConf {\n");
    
    sb.append("    businessPlatform: ").append(toIndentedString(businessPlatform)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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
