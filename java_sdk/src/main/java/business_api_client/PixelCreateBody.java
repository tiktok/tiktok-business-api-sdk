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
 * PixelCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class PixelCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("partner_name")
  private String partnerName = null;

  @JsonProperty("pixel_category")
  private String pixelCategory = null;

  @JsonProperty("pixel_name")
  private String pixelName = null;

  public PixelCreateBody advertiserId(String advertiserId) {
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

  public PixelCreateBody partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

   /**
   * Get partnerName
   * @return partnerName
  **/
  @Schema(description = "")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public PixelCreateBody pixelCategory(String pixelCategory) {
    this.pixelCategory = pixelCategory;
    return this;
  }

   /**
   * Get pixelCategory
   * @return pixelCategory
  **/
  @Schema(description = "")
  public String getPixelCategory() {
    return pixelCategory;
  }

  public void setPixelCategory(String pixelCategory) {
    this.pixelCategory = pixelCategory;
  }

  public PixelCreateBody pixelName(String pixelName) {
    this.pixelName = pixelName;
    return this;
  }

   /**
   * Get pixelName
   * @return pixelName
  **/
  @Schema(required = true, description = "")
  public String getPixelName() {
    return pixelName;
  }

  public void setPixelName(String pixelName) {
    this.pixelName = pixelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelCreateBody pixelCreateBody = (PixelCreateBody) o;
    return Objects.equals(this.advertiserId, pixelCreateBody.advertiserId) &&
        Objects.equals(this.partnerName, pixelCreateBody.partnerName) &&
        Objects.equals(this.pixelCategory, pixelCreateBody.pixelCategory) &&
        Objects.equals(this.pixelName, pixelCreateBody.pixelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, partnerName, pixelCategory, pixelName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    pixelCategory: ").append(toIndentedString(pixelCategory)).append("\n");
    sb.append("    pixelName: ").append(toIndentedString(pixelName)).append("\n");
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
