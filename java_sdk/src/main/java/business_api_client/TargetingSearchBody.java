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
 * TargetingSearchBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class TargetingSearchBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("brand_safety_partner")
  private String brandSafetyPartner = null;

  @JsonProperty("brand_safety_type")
  private String brandSafetyType = null;

  @JsonProperty("geo_types")
  private List<String> geoTypes = null;

  @JsonProperty("keywords")
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("operating_system")
  private String operatingSystem = null;

  @JsonProperty("placements")
  private List<String> placements = new ArrayList<String>();

  @JsonProperty("promotion_type")
  private String promotionType = null;

  @JsonProperty("region_codes")
  private List<String> regionCodes = null;

  @JsonProperty("search_type")
  private String searchType = null;

  public TargetingSearchBody advertiserId(String advertiserId) {
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

  public TargetingSearchBody brandSafetyPartner(String brandSafetyPartner) {
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

  public TargetingSearchBody brandSafetyType(String brandSafetyType) {
    this.brandSafetyType = brandSafetyType;
    return this;
  }

   /**
   * Brand safety type. Valid only when placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok&#x27;s brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok&#x27;s brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok&#x27;s brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.
   * @return brandSafetyType
  **/
  @Schema(description = "Brand safety type. Valid only when placements is set as PLACEMENT_TIKTOK. Default value: NO_BRAND_SAFETY. Enum values: NO_BRAND_SAFETY: To not use any brand safety solution. Full inventory, which means your ads may appear next to some content featuring mature themes. EXPANDED_INVENTORY: Use TikTok's brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and that does not contain mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. THIRD_PARTY: Use a third-party brand safety solution. You also need to pass in a value to the brand_safety_partner field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the /tool/region/ endpoint. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering.")
  public String getBrandSafetyType() {
    return brandSafetyType;
  }

  public void setBrandSafetyType(String brandSafetyType) {
    this.brandSafetyType = brandSafetyType;
  }

  public TargetingSearchBody geoTypes(List<String> geoTypes) {
    this.geoTypes = geoTypes;
    return this;
  }

  public TargetingSearchBody addGeoTypesItem(String geoTypesItem) {
    if (this.geoTypes == null) {
      this.geoTypes = new ArrayList<String>();
    }
    this.geoTypes.add(geoTypesItem);
    return this;
  }

   /**
   * The types of locations that you want to filter the results by. Enum values: COUNTRY (country or region), PROVINCE (province), CITY (city or county), DISTRICT (district or city), DMA (DMA), ZIP_CODE (zip code or postal code). When you specify search_type as FUZZY_SEARCH, the allowed enum values for this field are ZIP_CODE, COUNTRY, PROVINCE, CITY, DISTRICT, and DMA. When you specify search_type as BATCH_ZIPCODE_SEARCH, the allowed enum value for this field is ZIP_CODE. When you specify search_type as BATCH_REGION_SEARCH, the allowed enum values for this field are COUNTRY, PROVINCE, CITY, DISTRICT, and DMA.
   * @return geoTypes
  **/
  @Schema(description = "The types of locations that you want to filter the results by. Enum values: COUNTRY (country or region), PROVINCE (province), CITY (city or county), DISTRICT (district or city), DMA (DMA), ZIP_CODE (zip code or postal code). When you specify search_type as FUZZY_SEARCH, the allowed enum values for this field are ZIP_CODE, COUNTRY, PROVINCE, CITY, DISTRICT, and DMA. When you specify search_type as BATCH_ZIPCODE_SEARCH, the allowed enum value for this field is ZIP_CODE. When you specify search_type as BATCH_REGION_SEARCH, the allowed enum values for this field are COUNTRY, PROVINCE, CITY, DISTRICT, and DMA.")
  public List<String> getGeoTypes() {
    return geoTypes;
  }

  public void setGeoTypes(List<String> geoTypes) {
    this.geoTypes = geoTypes;
  }

  public TargetingSearchBody keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingSearchBody addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * The keywords that you use to search for targeting tags. Length limit: 1 when search_type is FUZZY_SEARCH. 1,000 when search_type is BATCH_REGION_SEARCH or BATCH_ZIPCODE_SEARCH. If you set search_type as BATCH_ZIPCODE_SEARCH, you need to pass zip codes or postal codes as keywords because this search type only supports exact search. For US zip code targeting, provide the five-digit US zip codes as keywords. Example: [\&quot;10001\&quot;,\&quot;10002\&quot;]. For Canadian postal code targeting, provide the three-character Forward Sortation Area (FSA) portions of Canadian postal codes as keywords. Example: [\&quot;A0A\&quot;,\&quot;A0B\&quot;].
   * @return keywords
  **/
  @Schema(required = true, description = "The keywords that you use to search for targeting tags. Length limit: 1 when search_type is FUZZY_SEARCH. 1,000 when search_type is BATCH_REGION_SEARCH or BATCH_ZIPCODE_SEARCH. If you set search_type as BATCH_ZIPCODE_SEARCH, you need to pass zip codes or postal codes as keywords because this search type only supports exact search. For US zip code targeting, provide the five-digit US zip codes as keywords. Example: [\"10001\",\"10002\"]. For Canadian postal code targeting, provide the three-character Forward Sortation Area (FSA) portions of Canadian postal codes as keywords. Example: [\"A0A\",\"A0B\"].")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public TargetingSearchBody objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.
   * @return objectiveType
  **/
  @Schema(required = true, description = "Campaign objective. The allowed enum values: REACH, TRAFFIC, VIDEO_VIEWS, LEAD_GENERATION, ENGAGEMENT, APP_PROMOTION, WEB_CONVERSIONS, PRODUCT_SALES. For descriptions of the objectives, see Objectives.")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public TargetingSearchBody operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Device operating system that you want to target. Enum values: ANDROID, IOS.
   * @return operatingSystem
  **/
  @Schema(description = "Device operating system that you want to target. Enum values: ANDROID, IOS.")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public TargetingSearchBody placements(List<String> placements) {
    this.placements = placements;
    return this;
  }

  public TargetingSearchBody addPlacementsItem(String placementsItem) {
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to fuzzy search for a zip code ID to be used for zip code targeting in the US or a postal code ID to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.
   * @return placements
  **/
  @Schema(required = true, description = "The apps where you want to deliver your ads. For enum values, see Enumeration - Placement. Note: If you want to fuzzy search for a zip code ID to be used for zip code targeting in the US or a postal code ID to be used for postal code targeting in Canada, the value of this field needs to include PLACEMENT_TIKTOK.")
  public List<String> getPlacements() {
    return placements;
  }

  public void setPlacements(List<String> placements) {
    this.placements = placements;
  }

  public TargetingSearchBody promotionType(String promotionType) {
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Promotion type and you can decide where you&#x27;d like to promote your products using this field. You need to specify the field when advertising objective (objective_type) for your campaign is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. For enum values, see Enumeration - Promotion Type.
   * @return promotionType
  **/
  @Schema(description = "Promotion type and you can decide where you'd like to promote your products using this field. You need to specify the field when advertising objective (objective_type) for your campaign is NOT set as REACH, VIDEO_VIEWS, or ENGAGEMENT. For enum values, see Enumeration - Promotion Type.")
  public String getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
  }

  public TargetingSearchBody regionCodes(List<String> regionCodes) {
    this.regionCodes = regionCodes;
    return this;
  }

  public TargetingSearchBody addRegionCodesItem(String regionCodesItem) {
    if (this.regionCodes == null) {
      this.regionCodes = new ArrayList<String>();
    }
    this.regionCodes.add(regionCodesItem);
    return this;
  }

   /**
   * The codes of targeted countries or regions that you want to filter the results by. When you specify search_type as BATCH_ZIPCODE_SEARCH or BATCH_REGION_SEARCH, this field is required and needs to be set as US (the US) or CA (Canada). When you specify search_type as FUZZY_SEARCH, this field is optional and you can pass any supported country or region code to this field. To find out the complete list of country or region codes, see Location code.
   * @return regionCodes
  **/
  @Schema(description = "The codes of targeted countries or regions that you want to filter the results by. When you specify search_type as BATCH_ZIPCODE_SEARCH or BATCH_REGION_SEARCH, this field is required and needs to be set as US (the US) or CA (Canada). When you specify search_type as FUZZY_SEARCH, this field is optional and you can pass any supported country or region code to this field. To find out the complete list of country or region codes, see Location code.")
  public List<String> getRegionCodes() {
    return regionCodes;
  }

  public void setRegionCodes(List<String> regionCodes) {
    this.regionCodes = regionCodes;
  }

  public TargetingSearchBody searchType(String searchType) {
    this.searchType = searchType;
    return this;
  }

   /**
   * The type of search you want to perform. Enum values: FUZZY_SEARCH: To fuzzy search for a single location ID, a zip code ID, or a postal code ID. For this search type, you can only pass one keyword to keywords and a maximum of 100 results will be returned. BATCH_REGION_SEARCH: To search for location IDs in batch. Fuzzy search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword a maximum of 5 results ordered by relevance will be returned. BATCH_ZIPCODE_SEARCH: To search for zip code IDs or postal code IDs in batch. Exact search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword one result or no result will be returned. Note: The enum values BATCH_ZIPCODE_SEARCH and BATCH_REGION_SEARCH can only be used to search for IDs of zip codes (or postal codes) or locations in the US or Canada. In contrast, you can use FUZZY_SEARCH to search for a single ID of a zip code (or postal code) or location in the US or Canada or in another country.
   * @return searchType
  **/
  @Schema(required = true, description = "The type of search you want to perform. Enum values: FUZZY_SEARCH: To fuzzy search for a single location ID, a zip code ID, or a postal code ID. For this search type, you can only pass one keyword to keywords and a maximum of 100 results will be returned. BATCH_REGION_SEARCH: To search for location IDs in batch. Fuzzy search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword a maximum of 5 results ordered by relevance will be returned. BATCH_ZIPCODE_SEARCH: To search for zip code IDs or postal code IDs in batch. Exact search is supported. For this search type, you can pass up to 1,000 keywords to keywords, and for each keyword one result or no result will be returned. Note: The enum values BATCH_ZIPCODE_SEARCH and BATCH_REGION_SEARCH can only be used to search for IDs of zip codes (or postal codes) or locations in the US or Canada. In contrast, you can use FUZZY_SEARCH to search for a single ID of a zip code (or postal code) or location in the US or Canada or in another country.")
  public String getSearchType() {
    return searchType;
  }

  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSearchBody targetingSearchBody = (TargetingSearchBody) o;
    return Objects.equals(this.advertiserId, targetingSearchBody.advertiserId) &&
        Objects.equals(this.brandSafetyPartner, targetingSearchBody.brandSafetyPartner) &&
        Objects.equals(this.brandSafetyType, targetingSearchBody.brandSafetyType) &&
        Objects.equals(this.geoTypes, targetingSearchBody.geoTypes) &&
        Objects.equals(this.keywords, targetingSearchBody.keywords) &&
        Objects.equals(this.objectiveType, targetingSearchBody.objectiveType) &&
        Objects.equals(this.operatingSystem, targetingSearchBody.operatingSystem) &&
        Objects.equals(this.placements, targetingSearchBody.placements) &&
        Objects.equals(this.promotionType, targetingSearchBody.promotionType) &&
        Objects.equals(this.regionCodes, targetingSearchBody.regionCodes) &&
        Objects.equals(this.searchType, targetingSearchBody.searchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, brandSafetyPartner, brandSafetyType, geoTypes, keywords, objectiveType, operatingSystem, placements, promotionType, regionCodes, searchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSearchBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    brandSafetyPartner: ").append(toIndentedString(brandSafetyPartner)).append("\n");
    sb.append("    brandSafetyType: ").append(toIndentedString(brandSafetyType)).append("\n");
    sb.append("    geoTypes: ").append(toIndentedString(geoTypes)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    regionCodes: ").append(toIndentedString(regionCodes)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
