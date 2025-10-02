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
 * TargetingCategoryRecommendBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class TargetingCategoryRecommendBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("region_codes")
  private List<String> regionCodes = null;

  public TargetingCategoryRecommendBody advertiserId(String advertiserId) {
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

  public TargetingCategoryRecommendBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * ID of the mobile app that you want to promote. This field in optional and only valid if you want to promote a mobile app
   * @return appId
  **/
  @Schema(description = "ID of the mobile app that you want to promote. This field in optional and only valid if you want to promote a mobile app")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public TargetingCategoryRecommendBody regionCodes(List<String> regionCodes) {
    this.regionCodes = regionCodes;
    return this;
  }

  public TargetingCategoryRecommendBody addRegionCodesItem(String regionCodesItem) {
    if (this.regionCodes == null) {
      this.regionCodes = new ArrayList<String>();
    }
    this.regionCodes.add(regionCodesItem);
    return this;
  }

   /**
   * List of country or region codes
   * @return regionCodes
  **/
  @Schema(description = "List of country or region codes")
  public List<String> getRegionCodes() {
    return regionCodes;
  }

  public void setRegionCodes(List<String> regionCodes) {
    this.regionCodes = regionCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingCategoryRecommendBody targetingCategoryRecommendBody = (TargetingCategoryRecommendBody) o;
    return Objects.equals(this.advertiserId, targetingCategoryRecommendBody.advertiserId) &&
        Objects.equals(this.appId, targetingCategoryRecommendBody.appId) &&
        Objects.equals(this.regionCodes, targetingCategoryRecommendBody.regionCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, regionCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingCategoryRecommendBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    regionCodes: ").append(toIndentedString(regionCodes)).append("\n");
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
