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
import java.util.ArrayList;
import java.util.List;
/**
 * ProductDeleteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class ProductDeleteBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("destination_ids")
  private List<String> destinationIds = null;

  @JsonProperty("feed_id")
  private String feedId = null;

  @JsonProperty("flight_ids")
  private List<String> flightIds = null;

  @JsonProperty("hotel_ids")
  private List<String> hotelIds = null;

  @JsonProperty("media_title_ids")
  private List<String> mediaTitleIds = null;

  @JsonProperty("sku_ids")
  private List<String> skuIds = null;

  @JsonProperty("vehicle_ids")
  private List<String> vehicleIds = null;

  public ProductDeleteBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(required = true, description = "")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public ProductDeleteBody catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(required = true, description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public ProductDeleteBody destinationIds(List<String> destinationIds) {
    this.destinationIds = destinationIds;
    return this;
  }

  public ProductDeleteBody addDestinationIdsItem(String destinationIdsItem) {
    if (this.destinationIds == null) {
      this.destinationIds = new ArrayList<String>();
    }
    this.destinationIds.add(destinationIdsItem);
    return this;
  }

   /**
   * Get destinationIds
   * @return destinationIds
  **/
  @Schema(description = "")
  public List<String> getDestinationIds() {
    return destinationIds;
  }

  public void setDestinationIds(List<String> destinationIds) {
    this.destinationIds = destinationIds;
  }

  public ProductDeleteBody feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Get feedId
   * @return feedId
  **/
  @Schema(description = "")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public ProductDeleteBody flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public ProductDeleteBody addFlightIdsItem(String flightIdsItem) {
    if (this.flightIds == null) {
      this.flightIds = new ArrayList<String>();
    }
    this.flightIds.add(flightIdsItem);
    return this;
  }

   /**
   * Get flightIds
   * @return flightIds
  **/
  @Schema(description = "")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public ProductDeleteBody hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  public ProductDeleteBody addHotelIdsItem(String hotelIdsItem) {
    if (this.hotelIds == null) {
      this.hotelIds = new ArrayList<String>();
    }
    this.hotelIds.add(hotelIdsItem);
    return this;
  }

   /**
   * Get hotelIds
   * @return hotelIds
  **/
  @Schema(description = "")
  public List<String> getHotelIds() {
    return hotelIds;
  }

  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  public ProductDeleteBody mediaTitleIds(List<String> mediaTitleIds) {
    this.mediaTitleIds = mediaTitleIds;
    return this;
  }

  public ProductDeleteBody addMediaTitleIdsItem(String mediaTitleIdsItem) {
    if (this.mediaTitleIds == null) {
      this.mediaTitleIds = new ArrayList<String>();
    }
    this.mediaTitleIds.add(mediaTitleIdsItem);
    return this;
  }

   /**
   * Get mediaTitleIds
   * @return mediaTitleIds
  **/
  @Schema(description = "")
  public List<String> getMediaTitleIds() {
    return mediaTitleIds;
  }

  public void setMediaTitleIds(List<String> mediaTitleIds) {
    this.mediaTitleIds = mediaTitleIds;
  }

  public ProductDeleteBody skuIds(List<String> skuIds) {
    this.skuIds = skuIds;
    return this;
  }

  public ProductDeleteBody addSkuIdsItem(String skuIdsItem) {
    if (this.skuIds == null) {
      this.skuIds = new ArrayList<String>();
    }
    this.skuIds.add(skuIdsItem);
    return this;
  }

   /**
   * Get skuIds
   * @return skuIds
  **/
  @Schema(description = "")
  public List<String> getSkuIds() {
    return skuIds;
  }

  public void setSkuIds(List<String> skuIds) {
    this.skuIds = skuIds;
  }

  public ProductDeleteBody vehicleIds(List<String> vehicleIds) {
    this.vehicleIds = vehicleIds;
    return this;
  }

  public ProductDeleteBody addVehicleIdsItem(String vehicleIdsItem) {
    if (this.vehicleIds == null) {
      this.vehicleIds = new ArrayList<String>();
    }
    this.vehicleIds.add(vehicleIdsItem);
    return this;
  }

   /**
   * Get vehicleIds
   * @return vehicleIds
  **/
  @Schema(description = "")
  public List<String> getVehicleIds() {
    return vehicleIds;
  }

  public void setVehicleIds(List<String> vehicleIds) {
    this.vehicleIds = vehicleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDeleteBody productDeleteBody = (ProductDeleteBody) o;
    return Objects.equals(this.bcId, productDeleteBody.bcId) &&
        Objects.equals(this.catalogId, productDeleteBody.catalogId) &&
        Objects.equals(this.destinationIds, productDeleteBody.destinationIds) &&
        Objects.equals(this.feedId, productDeleteBody.feedId) &&
        Objects.equals(this.flightIds, productDeleteBody.flightIds) &&
        Objects.equals(this.hotelIds, productDeleteBody.hotelIds) &&
        Objects.equals(this.mediaTitleIds, productDeleteBody.mediaTitleIds) &&
        Objects.equals(this.skuIds, productDeleteBody.skuIds) &&
        Objects.equals(this.vehicleIds, productDeleteBody.vehicleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, destinationIds, feedId, flightIds, hotelIds, mediaTitleIds, skuIds, vehicleIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDeleteBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    destinationIds: ").append(toIndentedString(destinationIds)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    hotelIds: ").append(toIndentedString(hotelIds)).append("\n");
    sb.append("    mediaTitleIds: ").append(toIndentedString(mediaTitleIds)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    vehicleIds: ").append(toIndentedString(vehicleIds)).append("\n");
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
