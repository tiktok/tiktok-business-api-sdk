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
 * Ad Account information
 */
@Schema(description = "Ad Account information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class BcadvertisercreateAdvertiserInfo {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("type")
  private String type = null;

  public BcadvertisercreateAdvertiserInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Ad Account currency, note: need to be consistent with the Business Center, the value range is shown in [Appendix-Currency](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585839634433)
   * @return currency
  **/
  @Schema(description = "Ad Account currency, note: need to be consistent with the Business Center, the value range is shown in [Appendix-Currency](https://ads.tiktok.com/marketing_api/docs?id=1737585839634433)")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BcadvertisercreateAdvertiserInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Ad Account name, length cannot exceed 100 characters
   * @return name
  **/
  @Schema(description = "Ad Account name, length cannot exceed 100 characters")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BcadvertisercreateAdvertiserInfo timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Ad Account time zone code, the value range is shown in  [Appendix-Time Zone](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737586324313089)
   * @return timezone
  **/
  @Schema(description = "Ad Account time zone code, the value range is shown in  [Appendix-Time Zone](https://ads.tiktok.com/marketing_api/docs?id=1737586324313089)")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public BcadvertisercreateAdvertiserInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of ad account that you want to create. Enum values: &#x60;RESERVATION&#x60;, &#x60;AUCTION&#x60; (default).Note: &#x60;DIRECT&#x60; Business Centers can only create an ad account of &#x60;AUCTION&#x60; type
   * @return type
  **/
  @Schema(description = "Type of ad account that you want to create. Enum values: `RESERVATION`, `AUCTION` (default).Note: `DIRECT` Business Centers can only create an ad account of `AUCTION` type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcadvertisercreateAdvertiserInfo bcadvertisercreateAdvertiserInfo = (BcadvertisercreateAdvertiserInfo) o;
    return Objects.equals(this.currency, bcadvertisercreateAdvertiserInfo.currency) &&
        Objects.equals(this.name, bcadvertisercreateAdvertiserInfo.name) &&
        Objects.equals(this.timezone, bcadvertisercreateAdvertiserInfo.timezone) &&
        Objects.equals(this.type, bcadvertisercreateAdvertiserInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, name, timezone, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcadvertisercreateAdvertiserInfo {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
