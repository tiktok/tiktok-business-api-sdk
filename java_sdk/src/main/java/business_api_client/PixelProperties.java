/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixelContent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Properties associated with the event
 */
@Schema(description = "Properties associated with the event")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class PixelProperties {
  @JsonProperty("contents")
  private List<PixelContent> contents = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  public PixelProperties contents(List<PixelContent> contents) {
    this.contents = contents;
    return this;
  }

  public PixelProperties addContentsItem(PixelContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<PixelContent>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Related items in a web event (e.g. items added in an Initiate Checkout event).
   * @return contents
  **/
  @Schema(description = "Related items in a web event (e.g. items added in an Initiate Checkout event).")
  public List<PixelContent> getContents() {
    return contents;
  }

  public void setContents(List<PixelContent> contents) {
    this.contents = contents;
  }

  public PixelProperties currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 code. Examples: EUR, USD, JPY. List of currencies currently supported: AED, ARS, AUD, BDT, BHD, BIF, BOB, BRL, CAD, CHF, CLP, CNY, COP, CRC, CZK, DKK, DZD, EGP, EUR, GBP, GTQ, HKD, HNL, HUF, IDR, ILS, INR, ISK, JPY, KES, KHR, KRW, KWD, KZT, MAD, MOP, MXN, MYR, NGN, NIO, NOK, NZD, OMR, PEN, PHP, PHP, PKR, PLN, PYG, QAR, RON, RUB, SAR, SEK, SGD, THB, TRY, TWD, UAH, USD, VES, VND, ZAR.
   * @return currency
  **/
  @Schema(description = "ISO 4217 code. Examples: EUR, USD, JPY. List of currencies currently supported: AED, ARS, AUD, BDT, BHD, BIF, BOB, BRL, CAD, CHF, CLP, CNY, COP, CRC, CZK, DKK, DZD, EGP, EUR, GBP, GTQ, HKD, HNL, HUF, IDR, ILS, INR, ISK, JPY, KES, KHR, KRW, KWD, KZT, MAD, MOP, MXN, MYR, NGN, NIO, NOK, NZD, OMR, PEN, PHP, PHP, PKR, PLN, PYG, QAR, RON, RUB, SAR, SEK, SGD, THB, TRY, TWD, UAH, USD, VES, VND, ZAR.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PixelProperties description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the item or page.
   * @return description
  **/
  @Schema(description = "Description of the item or page.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PixelProperties query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The text string that was input by a user. For instance, if a person searches for a product on your website, you can forward the keyword being searched. If a person enters a coupon code at check out, you can forward the code.
   * @return query
  **/
  @Schema(description = "The text string that was input by a user. For instance, if a person searches for a product on your website, you can forward the keyword being searched. If a person enters a coupon code at check out, you can forward the code.")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public PixelProperties value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the order or items sold. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.
   * @return value
  **/
  @Schema(description = "Value of the order or items sold. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelProperties pixelProperties = (PixelProperties) o;
    return Objects.equals(this.contents, pixelProperties.contents) &&
        Objects.equals(this.currency, pixelProperties.currency) &&
        Objects.equals(this.description, pixelProperties.description) &&
        Objects.equals(this.query, pixelProperties.query) &&
        Objects.equals(this.value, pixelProperties.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, currency, description, query, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelProperties {\n");
    
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
