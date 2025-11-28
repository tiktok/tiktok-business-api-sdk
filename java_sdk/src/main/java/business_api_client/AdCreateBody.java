/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdcreateCreatives;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * AdCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class AdCreateBody {
  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("creatives")
  private List<AdcreateCreatives> creatives = new ArrayList<AdcreateCreatives>();

  public AdCreateBody adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Ad group ID
   * @return adgroupId
  **/
  @Schema(required = true, description = "Ad group ID")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdCreateBody creatives(List<AdcreateCreatives> creatives) {
    this.creatives = creatives;
    return this;
  }

  public AdCreateBody addCreativesItem(AdcreateCreatives creativesItem) {
    this.creatives.add(creativesItem);
    return this;
  }

   /**
   * Advertising creatives.
   * @return creatives
  **/
  @Schema(required = true, description = "Advertising creatives.")
  public List<AdcreateCreatives> getCreatives() {
    return creatives;
  }

  public void setCreatives(List<AdcreateCreatives> creatives) {
    this.creatives = creatives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdCreateBody adCreateBody = (AdCreateBody) o;
    return Objects.equals(this.adgroupId, adCreateBody.adgroupId) &&
        Objects.equals(this.advertiserId, adCreateBody.advertiserId) &&
        Objects.equals(this.creatives, adCreateBody.creatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, advertiserId, creatives);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCreateBody {\n");
    
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creatives: ").append(toIndentedString(creatives)).append("\n");
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
