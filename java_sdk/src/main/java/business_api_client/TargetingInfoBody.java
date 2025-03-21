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
 * TargetingInfoBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class TargetingInfoBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("brand_safety_partner")
  private String brandSafetyPartner = null;

  @JsonProperty("brand_safety_type")
  private String brandSafetyType = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("operating_system")
  private String operatingSystem = null;

  @JsonProperty("placements")
  private List<String> placements = null;

  @JsonProperty("promotion_type")
  private String promotionType = null;

  @JsonProperty("scene")
  private String scene = "GEO";

  @JsonProperty("targeting_ids")
  private List<String> targetingIds = new ArrayList<String>();

  public TargetingInfoBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public TargetingInfoBody brandSafetyPartner(String brandSafetyPartner) {
    this.brandSafetyPartner = brandSafetyPartner;
    return this;
  }

   /**
   * Required only when brand_safety_type is THIRD_PARTY. Brand safety partner. Enum values: IAS, OPEN_SLATE(The partner is named DoubleVerify on TikTok Ads Manager because the partner has been acquired by DoubleVerify). Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.
   * @return brandSafetyPartner
  **/
  @Schema(description = "Required only when brand_safety_type is THIRD_PARTY. Brand safety partner. Enum values: IAS, OPEN_SLATE(The partner is named DoubleVerify on TikTok Ads Manager because the partner has been acquired by DoubleVerify). Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.")
  public String getBrandSafetyPartner() {
    return brandSafetyPartner;
  }

  public void setBrandSafetyPartner(String brandSafetyPartner) {
    this.brandSafetyPartner = brandSafetyPartner;
  }

  public TargetingInfoBody brandSafetyType(String brandSafetyType) {
    this.brandSafetyType = brandSafetyType;
    return this;
  }

   /**
   * Brand safety type. Valid only when scene is set as GEO and placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok&#x27;s brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok&#x27;s brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok&#x27;s brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.
   * @return brandSafetyType
  **/
  @Schema(description = "Brand safety type. Valid only when scene is set as GEO and placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.")
  public String getBrandSafetyType() {
    return brandSafetyType;
  }

  public void setBrandSafetyType(String brandSafetyType) {
    this.brandSafetyType = brandSafetyType;
  }

  public TargetingInfoBody objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Required when scene is set as GEO. Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.
   * @return objectiveType
  **/
  @Schema(description = "Required when scene is set as GEO. Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public TargetingInfoBody operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Valid only when scene is set as GEO. Device operating system that you want to target. Enum values: ANDROID, IOS.
   * @return operatingSystem
  **/
  @Schema(description = "Valid only when scene is set as GEO. Device operating system that you want to target. Enum values: ANDROID, IOS.")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public TargetingInfoBody placements(List<String> placements) {
    this.placements = placements;
    return this;
  }

  public TargetingInfoBody addPlacementsItem(String placementsItem) {
    if (this.placements == null) {
      this.placements = new ArrayList<String>();
    }
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Required when scene is set as GEO. The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to get information about zip code IDs to be used for zip code targeting in the US or postal code IDs to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.
   * @return placements
  **/
  @Schema(description = "Required when scene is set as GEO. The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to get information about zip code IDs to be used for zip code targeting in the US or postal code IDs to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.")
  public List<String> getPlacements() {
    return placements;
  }

  public void setPlacements(List<String> placements) {
    this.placements = placements;
  }

  public TargetingInfoBody promotionType(String promotionType) {
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Required when scene is set as GEO and objective_type is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. Promotion type and you can decide where you&#x27;d like to promote your products using this field. For enum values, see Enumeration - Promotion Type.
   * @return promotionType
  **/
  @Schema(description = "Required when scene is set as GEO and objective_type is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. Promotion type and you can decide where you'd like to promote your products using this field. For enum values, see Enumeration - Promotion Type.")
  public String getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
  }

  public TargetingInfoBody scene(String scene) {
    this.scene = scene;
    return this;
  }

   /**
   * The targeting type that the specified targeting_ids is used for. Enum values: GEO: Geographical targeting, which consists of administrative region targeting and zip code targeting (or postal code targeting). ISP : Internet Service Provider targeting. Default value: GEO.
   * @return scene
  **/
  @Schema(description = "The targeting type that the specified targeting_ids is used for. Enum values: GEO: Geographical targeting, which consists of administrative region targeting and zip code targeting (or postal code targeting). ISP : Internet Service Provider targeting. Default value: GEO.")
  public String getScene() {
    return scene;
  }

  public void setScene(String scene) {
    this.scene = scene;
  }

  public TargetingInfoBody targetingIds(List<String> targetingIds) {
    this.targetingIds = targetingIds;
    return this;
  }

  public TargetingInfoBody addTargetingIdsItem(String targetingIdsItem) {
    this.targetingIds.add(targetingIdsItem);
    return this;
  }

   /**
   * Targeting tag IDs. You can pass in location IDs, zip code IDs or postal code IDs, a combination of location IDs, zip code IDs or postal code IDs, or ISP IDs. Max size: 1,000. You can get location IDs, zip code IDs, or postal code IDs via geo_id returned from /tool/targeting/search/, or get location IDs via location_id returned from /tool/region/. You can get ISP IDs via isp_id returned from /tool/targeting/list/.
   * @return targetingIds
  **/
  @Schema(required = true, description = "Targeting tag IDs. You can pass in location IDs, zip code IDs or postal code IDs, a combination of location IDs, zip code IDs or postal code IDs, or ISP IDs. Max size: 1,000. You can get location IDs, zip code IDs, or postal code IDs via geo_id returned from /tool/targeting/search/, or get location IDs via location_id returned from /tool/region/. You can get ISP IDs via isp_id returned from /tool/targeting/list/.")
  public List<String> getTargetingIds() {
    return targetingIds;
  }

  public void setTargetingIds(List<String> targetingIds) {
    this.targetingIds = targetingIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingInfoBody targetingInfoBody = (TargetingInfoBody) o;
    return Objects.equals(this.advertiserId, targetingInfoBody.advertiserId) &&
        Objects.equals(this.brandSafetyPartner, targetingInfoBody.brandSafetyPartner) &&
        Objects.equals(this.brandSafetyType, targetingInfoBody.brandSafetyType) &&
        Objects.equals(this.objectiveType, targetingInfoBody.objectiveType) &&
        Objects.equals(this.operatingSystem, targetingInfoBody.operatingSystem) &&
        Objects.equals(this.placements, targetingInfoBody.placements) &&
        Objects.equals(this.promotionType, targetingInfoBody.promotionType) &&
        Objects.equals(this.scene, targetingInfoBody.scene) &&
        Objects.equals(this.targetingIds, targetingInfoBody.targetingIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, brandSafetyPartner, brandSafetyType, objectiveType, operatingSystem, placements, promotionType, scene, targetingIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingInfoBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    brandSafetyPartner: ").append(toIndentedString(brandSafetyPartner)).append("\n");
    sb.append("    brandSafetyType: ").append(toIndentedString(brandSafetyType)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    targetingIds: ").append(toIndentedString(targetingIds)).append("\n");
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
