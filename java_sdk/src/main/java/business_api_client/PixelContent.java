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
import java.math.BigDecimal;
/**
 * PixelContent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class PixelContent {
  @JsonProperty("content_category")
  private String contentCategory = null;

  @JsonProperty("content_id")
  private String contentId = null;

  @JsonProperty("content_name")
  private String contentName = null;

  @JsonProperty("content_type")
  private String contentType = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("status")
  private String status = null;

  public PixelContent contentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
    return this;
  }

   /**
   * Category of the page/product.
   * @return contentCategory
  **/
  @Schema(description = "Category of the page/product.")
  public String getContentCategory() {
    return contentCategory;
  }

  public void setContentCategory(String contentCategory) {
    this.contentCategory = contentCategory;
  }

  public PixelContent contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * ID of the product item. Example &#x60;1077218&#x60;
   * @return contentId
  **/
  @Schema(description = "ID of the product item. Example `1077218`")
  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  public PixelContent contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Name of the page/product.
   * @return contentName
  **/
  @Schema(description = "Name of the page/product.")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public PixelContent contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The content_type object propertys value must be set to either &#x60;product&#x60;, or &#x60;product_group&#x60;, depending on how you will configure your data feed when you set up your product catalog. If you will be tracking events associated with individual products, set the value to &#x60;product&#x60;. If you are tracking events associated with product groups, set it to &#x60;product_group&#x60; instead.
   * @return contentType
  **/
  @Schema(description = "The content_type object propertys value must be set to either `product`, or `product_group`, depending on how you will configure your data feed when you set up your product catalog. If you will be tracking events associated with individual products, set the value to `product`. If you are tracking events associated with product groups, set it to `product_group` instead.")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public PixelContent price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the item. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.
   * @return price
  **/
  @Schema(description = "The price of the item. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20.")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public PixelContent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of the item. 
   * @return quantity
  **/
  @Schema(description = "The number of the item. ")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PixelContent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of an order, item, or service. Note: Depending on your use of status, Events API may be required in order to share status changes to TikTok.
   * @return status
  **/
  @Schema(description = "Status of an order, item, or service. Note: Depending on your use of status, Events API may be required in order to share status changes to TikTok.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelContent pixelContent = (PixelContent) o;
    return Objects.equals(this.contentCategory, pixelContent.contentCategory) &&
        Objects.equals(this.contentId, pixelContent.contentId) &&
        Objects.equals(this.contentName, pixelContent.contentName) &&
        Objects.equals(this.contentType, pixelContent.contentType) &&
        Objects.equals(this.price, pixelContent.price) &&
        Objects.equals(this.quantity, pixelContent.quantity) &&
        Objects.equals(this.status, pixelContent.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentCategory, contentId, contentName, contentType, price, quantity, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelContent {\n");
    
    sb.append("    contentCategory: ").append(toIndentedString(contentCategory)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
