/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdgroupcreateActions;
import business_api_client.AdgroupcreateAppConfig;
import business_api_client.AdgroupcreateExcludedCustomActions;
import business_api_client.AdgroupcreateIncludedCustomActions;
import business_api_client.AdgroupcreateSearchKeywords;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * AdgroupCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class AdgroupCreateBody {
  @JsonProperty("actions")
  private List<AdgroupcreateActions> actions = null;

  @JsonProperty("adgroup_app_profile_page_state")
  private String adgroupAppProfilePageState = null;

  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("age_groups")
  private List<String> ageGroups = null;

  @JsonProperty("app_config")
  private List<AdgroupcreateAppConfig> appConfig = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("attribution_event_count")
  private String attributionEventCount = null;

  @JsonProperty("audience_ids")
  private List<String> audienceIds = null;

  @JsonProperty("audience_rule")
  private Object audienceRule = null;

  @JsonProperty("audience_type")
  private String audienceType = null;

  @JsonProperty("automated_keywords_enabled")
  private Boolean automatedKeywordsEnabled = false;

  @JsonProperty("bid_display_mode")
  private String bidDisplayMode = null;

  @JsonProperty("bid_price")
  private BigDecimal bidPrice = null;

  @JsonProperty("bid_type")
  private String bidType = null;

  @JsonProperty("billing_event")
  private String billingEvent = null;

  @JsonProperty("blocked_pangle_app_ids")
  private List<String> blockedPangleAppIds = null;

  @JsonProperty("brand_safety_partner")
  private String brandSafetyPartner = null;

  @JsonProperty("brand_safety_type")
  private String brandSafetyType = "NO_BRAND_SAFETY";

  @JsonProperty("budget")
  private BigDecimal budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  @JsonProperty("campaign_id")
  private String campaignId = null;

  @JsonProperty("carrier_ids")
  private List<String> carrierIds = null;

  @JsonProperty("catalog_authorized_bc_id")
  private String catalogAuthorizedBcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("category_exclusion_ids")
  private List<String> categoryExclusionIds = null;

  @JsonProperty("click_attribution_window")
  private String clickAttributionWindow = null;

  @JsonProperty("comment_disabled")
  private Boolean commentDisabled = null;

  @JsonProperty("contextual_tag_ids")
  private List<String> contextualTagIds = null;

  @JsonProperty("conversion_bid_price")
  private BigDecimal conversionBidPrice = null;

  @JsonProperty("creative_material_mode")
  private String creativeMaterialMode = "CUSTOM";

  @JsonProperty("custom_conversion_id")
  private String customConversionId = null;

  @JsonProperty("dayparting")
  private String dayparting = null;

  @JsonProperty("deep_bid_type")
  private String deepBidType = null;

  @JsonProperty("deep_cpa_bid")
  private BigDecimal deepCpaBid = null;

  @JsonProperty("deep_funnel_event_source")
  private String deepFunnelEventSource = null;

  @JsonProperty("deep_funnel_event_source_id")
  private String deepFunnelEventSourceId = null;

  @JsonProperty("deep_funnel_optimization_event")
  private String deepFunnelOptimizationEvent = null;

  @JsonProperty("deep_funnel_optimization_status")
  private String deepFunnelOptimizationStatus = null;

  @JsonProperty("device_model_ids")
  private List<String> deviceModelIds = null;

  @JsonProperty("device_price_ranges")
  private List<Integer> devicePriceRanges = null;

  @JsonProperty("engaged_view_attribution_window")
  private String engagedViewAttributionWindow = null;

  @JsonProperty("excluded_audience_ids")
  private List<String> excludedAudienceIds = null;

  @JsonProperty("excluded_custom_actions")
  private List<AdgroupcreateExcludedCustomActions> excludedCustomActions = null;

  @JsonProperty("excluded_pangle_audience_package_ids")
  private List<String> excludedPangleAudiencePackageIds = null;

  @JsonProperty("frequency")
  private Double frequency = null;

  @JsonProperty("frequency_schedule")
  private Double frequencySchedule = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("household_income")
  private List<String> householdIncome = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("included_custom_actions")
  private List<AdgroupcreateIncludedCustomActions> includedCustomActions = null;

  @JsonProperty("included_pangle_audience_package_ids")
  private List<String> includedPangleAudiencePackageIds = null;

  @JsonProperty("interest_category_ids")
  private List<String> interestCategoryIds = null;

  @JsonProperty("interest_keyword_ids")
  private List<String> interestKeywordIds = null;

  @JsonProperty("ios14_targeting")
  private String ios14Targeting = "UNSET";

  @JsonProperty("is_hfss")
  private Boolean isHfss = false;

  @JsonProperty("is_lhf_compliance")
  private Boolean isLhfCompliance = false;

  @JsonProperty("isp_ids")
  private List<String> ispIds = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = null;

  @JsonProperty("message_event_set_id")
  private String messageEventSetId = null;

  @JsonProperty("messaging_app_account_id")
  private String messagingAppAccountId = null;

  @JsonProperty("messaging_app_type")
  private String messagingAppType = null;

  @JsonProperty("min_android_version")
  private String minAndroidVersion = null;

  @JsonProperty("min_ios_version")
  private String minIosVersion = null;

  @JsonProperty("network_types")
  private List<String> networkTypes = null;

  @JsonProperty("next_day_retention")
  private BigDecimal nextDayRetention = null;

  @JsonProperty("operating_systems")
  private List<String> operatingSystems = null;

  @JsonProperty("operation_status")
  private String operationStatus = "ENABLE";

  @JsonProperty("optimization_event")
  private String optimizationEvent = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("pacing")
  private String pacing = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("phone_region_calling_code")
  private String phoneRegionCallingCode = null;

  @JsonProperty("phone_region_code")
  private String phoneRegionCode = null;

  @JsonProperty("pixel_id")
  private String pixelId = null;

  @JsonProperty("placement_type")
  private String placementType = "PLACEMENT_TYPE_NORMAL";

  @JsonProperty("placements")
  private List<String> placements = null;

  @JsonProperty("product_source")
  private String productSource = null;

  @JsonProperty("promotion_target_type")
  private String promotionTargetType = null;

  @JsonProperty("promotion_type")
  private String promotionType = null;

  @JsonProperty("promotion_website_type")
  private String promotionWebsiteType = null;

  @JsonProperty("purchase_intention_keyword_ids")
  private List<String> purchaseIntentionKeywordIds = null;

  @JsonProperty("request_id")
  private String requestId = null;

  @JsonProperty("roas_bid")
  private BigDecimal roasBid = null;

  @JsonProperty("saved_audience_id")
  private String savedAudienceId = null;

  @JsonProperty("schedule_end_time")
  private String scheduleEndTime = null;

  @JsonProperty("schedule_start_time")
  private String scheduleStartTime = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  @JsonProperty("search_keywords")
  private List<AdgroupcreateSearchKeywords> searchKeywords = null;

  @JsonProperty("search_result_enabled")
  private Boolean searchResultEnabled = null;

  @JsonProperty("secondary_optimization_event")
  private String secondaryOptimizationEvent = null;

  @JsonProperty("share_disabled")
  private Boolean shareDisabled = false;

  @JsonProperty("shopping_ads_retargeting_actions_days")
  private Integer shoppingAdsRetargetingActionsDays = null;

  @JsonProperty("shopping_ads_retargeting_custom_audience_relation")
  private String shoppingAdsRetargetingCustomAudienceRelation = null;

  @JsonProperty("shopping_ads_retargeting_type")
  private String shoppingAdsRetargetingType = null;

  @JsonProperty("shopping_ads_type")
  private String shoppingAdsType = null;

  @JsonProperty("skip_learning_phase")
  private Boolean skipLearningPhase = null;

  @JsonProperty("smart_audience_enabled")
  private Boolean smartAudienceEnabled = null;

  @JsonProperty("smart_interest_behavior_enabled")
  private Boolean smartInterestBehaviorEnabled = null;

  @JsonProperty("spending_power")
  private String spendingPower = null;

  @JsonProperty("statistic_type")
  private String statisticType = null;

  @JsonProperty("store_authorized_bc_id")
  private String storeAuthorizedBcId = null;

  @JsonProperty("store_id")
  private String storeId = null;

  @JsonProperty("tiktok_subplacements")
  private List<String> tiktokSubplacements = null;

  @JsonProperty("vbo_window")
  private String vboWindow = "SEVEN_DAYS";

  @JsonProperty("vertical_sensitivity_id")
  private String verticalSensitivityId = null;

  @JsonProperty("video_download_disabled")
  private Boolean videoDownloadDisabled = null;

  @JsonProperty("view_attribution_window")
  private String viewAttributionWindow = null;

  @JsonProperty("zipcode_ids")
  private List<String> zipcodeIds = null;

  public AdgroupCreateBody actions(List<AdgroupcreateActions> actions) {
    this.actions = actions;
    return this;
  }

  public AdgroupCreateBody addActionsItem(AdgroupcreateActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<AdgroupcreateActions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(description = "")
  public List<AdgroupcreateActions> getActions() {
    return actions;
  }

  public void setActions(List<AdgroupcreateActions> actions) {
    this.actions = actions;
  }

  public AdgroupCreateBody adgroupAppProfilePageState(String adgroupAppProfilePageState) {
    this.adgroupAppProfilePageState = adgroupAppProfilePageState;
    return this;
  }

   /**
   * Get adgroupAppProfilePageState
   * @return adgroupAppProfilePageState
  **/
  @Schema(description = "")
  public String getAdgroupAppProfilePageState() {
    return adgroupAppProfilePageState;
  }

  public void setAdgroupAppProfilePageState(String adgroupAppProfilePageState) {
    this.adgroupAppProfilePageState = adgroupAppProfilePageState;
  }

  public AdgroupCreateBody adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @Schema(required = true, description = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public AdgroupCreateBody advertiserId(String advertiserId) {
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

  public AdgroupCreateBody ageGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public AdgroupCreateBody addAgeGroupsItem(String ageGroupsItem) {
    if (this.ageGroups == null) {
      this.ageGroups = new ArrayList<String>();
    }
    this.ageGroups.add(ageGroupsItem);
    return this;
  }

   /**
   * Get ageGroups
   * @return ageGroups
  **/
  @Schema(description = "")
  public List<String> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public AdgroupCreateBody appConfig(List<AdgroupcreateAppConfig> appConfig) {
    this.appConfig = appConfig;
    return this;
  }

  public AdgroupCreateBody addAppConfigItem(AdgroupcreateAppConfig appConfigItem) {
    if (this.appConfig == null) {
      this.appConfig = new ArrayList<AdgroupcreateAppConfig>();
    }
    this.appConfig.add(appConfigItem);
    return this;
  }

   /**
   * Get appConfig
   * @return appConfig
  **/
  @Schema(description = "")
  public List<AdgroupcreateAppConfig> getAppConfig() {
    return appConfig;
  }

  public void setAppConfig(List<AdgroupcreateAppConfig> appConfig) {
    this.appConfig = appConfig;
  }

  public AdgroupCreateBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AdgroupCreateBody attributionEventCount(String attributionEventCount) {
    this.attributionEventCount = attributionEventCount;
    return this;
  }

   /**
   * Get attributionEventCount
   * @return attributionEventCount
  **/
  @Schema(description = "")
  public String getAttributionEventCount() {
    return attributionEventCount;
  }

  public void setAttributionEventCount(String attributionEventCount) {
    this.attributionEventCount = attributionEventCount;
  }

  public AdgroupCreateBody audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public AdgroupCreateBody addAudienceIdsItem(String audienceIdsItem) {
    if (this.audienceIds == null) {
      this.audienceIds = new ArrayList<String>();
    }
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

   /**
   * Get audienceIds
   * @return audienceIds
  **/
  @Schema(description = "")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public AdgroupCreateBody audienceRule(Object audienceRule) {
    this.audienceRule = audienceRule;
    return this;
  }

   /**
   * Get audienceRule
   * @return audienceRule
  **/
  @Schema(description = "")
  public Object getAudienceRule() {
    return audienceRule;
  }

  public void setAudienceRule(Object audienceRule) {
    this.audienceRule = audienceRule;
  }

  public AdgroupCreateBody audienceType(String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

   /**
   * Get audienceType
   * @return audienceType
  **/
  @Schema(description = "")
  public String getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

  public AdgroupCreateBody automatedKeywordsEnabled(Boolean automatedKeywordsEnabled) {
    this.automatedKeywordsEnabled = automatedKeywordsEnabled;
    return this;
  }

   /**
   * Get automatedKeywordsEnabled
   * @return automatedKeywordsEnabled
  **/
  @Schema(description = "")
  public Boolean isAutomatedKeywordsEnabled() {
    return automatedKeywordsEnabled;
  }

  public void setAutomatedKeywordsEnabled(Boolean automatedKeywordsEnabled) {
    this.automatedKeywordsEnabled = automatedKeywordsEnabled;
  }

  public AdgroupCreateBody bidDisplayMode(String bidDisplayMode) {
    this.bidDisplayMode = bidDisplayMode;
    return this;
  }

   /**
   * Get bidDisplayMode
   * @return bidDisplayMode
  **/
  @Schema(description = "")
  public String getBidDisplayMode() {
    return bidDisplayMode;
  }

  public void setBidDisplayMode(String bidDisplayMode) {
    this.bidDisplayMode = bidDisplayMode;
  }

  public AdgroupCreateBody bidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @Schema(description = "")
  public BigDecimal getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
  }

  public AdgroupCreateBody bidType(String bidType) {
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @Schema(description = "")
  public String getBidType() {
    return bidType;
  }

  public void setBidType(String bidType) {
    this.bidType = bidType;
  }

  public AdgroupCreateBody billingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

   /**
   * Get billingEvent
   * @return billingEvent
  **/
  @Schema(required = true, description = "")
  public String getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
  }

  public AdgroupCreateBody blockedPangleAppIds(List<String> blockedPangleAppIds) {
    this.blockedPangleAppIds = blockedPangleAppIds;
    return this;
  }

  public AdgroupCreateBody addBlockedPangleAppIdsItem(String blockedPangleAppIdsItem) {
    if (this.blockedPangleAppIds == null) {
      this.blockedPangleAppIds = new ArrayList<String>();
    }
    this.blockedPangleAppIds.add(blockedPangleAppIdsItem);
    return this;
  }

   /**
   * Get blockedPangleAppIds
   * @return blockedPangleAppIds
  **/
  @Schema(description = "")
  public List<String> getBlockedPangleAppIds() {
    return blockedPangleAppIds;
  }

  public void setBlockedPangleAppIds(List<String> blockedPangleAppIds) {
    this.blockedPangleAppIds = blockedPangleAppIds;
  }

  public AdgroupCreateBody brandSafetyPartner(String brandSafetyPartner) {
    this.brandSafetyPartner = brandSafetyPartner;
    return this;
  }

   /**
   * Get brandSafetyPartner
   * @return brandSafetyPartner
  **/
  @Schema(description = "")
  public String getBrandSafetyPartner() {
    return brandSafetyPartner;
  }

  public void setBrandSafetyPartner(String brandSafetyPartner) {
    this.brandSafetyPartner = brandSafetyPartner;
  }

  public AdgroupCreateBody brandSafetyType(String brandSafetyType) {
    this.brandSafetyType = brandSafetyType;
    return this;
  }

   /**
   * Get brandSafetyType
   * @return brandSafetyType
  **/
  @Schema(description = "")
  public String getBrandSafetyType() {
    return brandSafetyType;
  }

  public void setBrandSafetyType(String brandSafetyType) {
    this.brandSafetyType = brandSafetyType;
  }

  public AdgroupCreateBody budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(required = true, description = "")
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public AdgroupCreateBody budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @Schema(required = true, description = "")
  public String getBudgetMode() {
    return budgetMode;
  }

  public void setBudgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
  }

  public AdgroupCreateBody campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(required = true, description = "")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdgroupCreateBody carrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
    return this;
  }

  public AdgroupCreateBody addCarrierIdsItem(String carrierIdsItem) {
    if (this.carrierIds == null) {
      this.carrierIds = new ArrayList<String>();
    }
    this.carrierIds.add(carrierIdsItem);
    return this;
  }

   /**
   * Get carrierIds
   * @return carrierIds
  **/
  @Schema(description = "")
  public List<String> getCarrierIds() {
    return carrierIds;
  }

  public void setCarrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
  }

  public AdgroupCreateBody catalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
    return this;
  }

   /**
   * Get catalogAuthorizedBcId
   * @return catalogAuthorizedBcId
  **/
  @Schema(description = "")
  public String getCatalogAuthorizedBcId() {
    return catalogAuthorizedBcId;
  }

  public void setCatalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
  }

  public AdgroupCreateBody catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdgroupCreateBody categoryExclusionIds(List<String> categoryExclusionIds) {
    this.categoryExclusionIds = categoryExclusionIds;
    return this;
  }

  public AdgroupCreateBody addCategoryExclusionIdsItem(String categoryExclusionIdsItem) {
    if (this.categoryExclusionIds == null) {
      this.categoryExclusionIds = new ArrayList<String>();
    }
    this.categoryExclusionIds.add(categoryExclusionIdsItem);
    return this;
  }

   /**
   * Get categoryExclusionIds
   * @return categoryExclusionIds
  **/
  @Schema(description = "")
  public List<String> getCategoryExclusionIds() {
    return categoryExclusionIds;
  }

  public void setCategoryExclusionIds(List<String> categoryExclusionIds) {
    this.categoryExclusionIds = categoryExclusionIds;
  }

  public AdgroupCreateBody clickAttributionWindow(String clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Get clickAttributionWindow
   * @return clickAttributionWindow
  **/
  @Schema(description = "")
  public String getClickAttributionWindow() {
    return clickAttributionWindow;
  }

  public void setClickAttributionWindow(String clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }

  public AdgroupCreateBody commentDisabled(Boolean commentDisabled) {
    this.commentDisabled = commentDisabled;
    return this;
  }

   /**
   * Get commentDisabled
   * @return commentDisabled
  **/
  @Schema(description = "")
  public Boolean isCommentDisabled() {
    return commentDisabled;
  }

  public void setCommentDisabled(Boolean commentDisabled) {
    this.commentDisabled = commentDisabled;
  }

  public AdgroupCreateBody contextualTagIds(List<String> contextualTagIds) {
    this.contextualTagIds = contextualTagIds;
    return this;
  }

  public AdgroupCreateBody addContextualTagIdsItem(String contextualTagIdsItem) {
    if (this.contextualTagIds == null) {
      this.contextualTagIds = new ArrayList<String>();
    }
    this.contextualTagIds.add(contextualTagIdsItem);
    return this;
  }

   /**
   * Get contextualTagIds
   * @return contextualTagIds
  **/
  @Schema(description = "")
  public List<String> getContextualTagIds() {
    return contextualTagIds;
  }

  public void setContextualTagIds(List<String> contextualTagIds) {
    this.contextualTagIds = contextualTagIds;
  }

  public AdgroupCreateBody conversionBidPrice(BigDecimal conversionBidPrice) {
    this.conversionBidPrice = conversionBidPrice;
    return this;
  }

   /**
   * Get conversionBidPrice
   * @return conversionBidPrice
  **/
  @Schema(description = "")
  public BigDecimal getConversionBidPrice() {
    return conversionBidPrice;
  }

  public void setConversionBidPrice(BigDecimal conversionBidPrice) {
    this.conversionBidPrice = conversionBidPrice;
  }

  public AdgroupCreateBody creativeMaterialMode(String creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @Schema(description = "")
  public String getCreativeMaterialMode() {
    return creativeMaterialMode;
  }

  public void setCreativeMaterialMode(String creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }

  public AdgroupCreateBody customConversionId(String customConversionId) {
    this.customConversionId = customConversionId;
    return this;
  }

   /**
   * Get customConversionId
   * @return customConversionId
  **/
  @Schema(description = "")
  public String getCustomConversionId() {
    return customConversionId;
  }

  public void setCustomConversionId(String customConversionId) {
    this.customConversionId = customConversionId;
  }

  public AdgroupCreateBody dayparting(String dayparting) {
    this.dayparting = dayparting;
    return this;
  }

   /**
   * Get dayparting
   * @return dayparting
  **/
  @Schema(description = "")
  public String getDayparting() {
    return dayparting;
  }

  public void setDayparting(String dayparting) {
    this.dayparting = dayparting;
  }

  public AdgroupCreateBody deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @Schema(description = "")
  public String getDeepBidType() {
    return deepBidType;
  }

  public void setDeepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
  }

  public AdgroupCreateBody deepCpaBid(BigDecimal deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
    return this;
  }

   /**
   * Get deepCpaBid
   * @return deepCpaBid
  **/
  @Schema(description = "")
  public BigDecimal getDeepCpaBid() {
    return deepCpaBid;
  }

  public void setDeepCpaBid(BigDecimal deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
  }

  public AdgroupCreateBody deepFunnelEventSource(String deepFunnelEventSource) {
    this.deepFunnelEventSource = deepFunnelEventSource;
    return this;
  }

   /**
   * Get deepFunnelEventSource
   * @return deepFunnelEventSource
  **/
  @Schema(description = "")
  public String getDeepFunnelEventSource() {
    return deepFunnelEventSource;
  }

  public void setDeepFunnelEventSource(String deepFunnelEventSource) {
    this.deepFunnelEventSource = deepFunnelEventSource;
  }

  public AdgroupCreateBody deepFunnelEventSourceId(String deepFunnelEventSourceId) {
    this.deepFunnelEventSourceId = deepFunnelEventSourceId;
    return this;
  }

   /**
   * Get deepFunnelEventSourceId
   * @return deepFunnelEventSourceId
  **/
  @Schema(description = "")
  public String getDeepFunnelEventSourceId() {
    return deepFunnelEventSourceId;
  }

  public void setDeepFunnelEventSourceId(String deepFunnelEventSourceId) {
    this.deepFunnelEventSourceId = deepFunnelEventSourceId;
  }

  public AdgroupCreateBody deepFunnelOptimizationEvent(String deepFunnelOptimizationEvent) {
    this.deepFunnelOptimizationEvent = deepFunnelOptimizationEvent;
    return this;
  }

   /**
   * Get deepFunnelOptimizationEvent
   * @return deepFunnelOptimizationEvent
  **/
  @Schema(description = "")
  public String getDeepFunnelOptimizationEvent() {
    return deepFunnelOptimizationEvent;
  }

  public void setDeepFunnelOptimizationEvent(String deepFunnelOptimizationEvent) {
    this.deepFunnelOptimizationEvent = deepFunnelOptimizationEvent;
  }

  public AdgroupCreateBody deepFunnelOptimizationStatus(String deepFunnelOptimizationStatus) {
    this.deepFunnelOptimizationStatus = deepFunnelOptimizationStatus;
    return this;
  }

   /**
   * Get deepFunnelOptimizationStatus
   * @return deepFunnelOptimizationStatus
  **/
  @Schema(description = "")
  public String getDeepFunnelOptimizationStatus() {
    return deepFunnelOptimizationStatus;
  }

  public void setDeepFunnelOptimizationStatus(String deepFunnelOptimizationStatus) {
    this.deepFunnelOptimizationStatus = deepFunnelOptimizationStatus;
  }

  public AdgroupCreateBody deviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
    return this;
  }

  public AdgroupCreateBody addDeviceModelIdsItem(String deviceModelIdsItem) {
    if (this.deviceModelIds == null) {
      this.deviceModelIds = new ArrayList<String>();
    }
    this.deviceModelIds.add(deviceModelIdsItem);
    return this;
  }

   /**
   * Get deviceModelIds
   * @return deviceModelIds
  **/
  @Schema(description = "")
  public List<String> getDeviceModelIds() {
    return deviceModelIds;
  }

  public void setDeviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
  }

  public AdgroupCreateBody devicePriceRanges(List<Integer> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
    return this;
  }

  public AdgroupCreateBody addDevicePriceRangesItem(Integer devicePriceRangesItem) {
    if (this.devicePriceRanges == null) {
      this.devicePriceRanges = new ArrayList<Integer>();
    }
    this.devicePriceRanges.add(devicePriceRangesItem);
    return this;
  }

   /**
   * Get devicePriceRanges
   * @return devicePriceRanges
  **/
  @Schema(description = "")
  public List<Integer> getDevicePriceRanges() {
    return devicePriceRanges;
  }

  public void setDevicePriceRanges(List<Integer> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
  }

  public AdgroupCreateBody engagedViewAttributionWindow(String engagedViewAttributionWindow) {
    this.engagedViewAttributionWindow = engagedViewAttributionWindow;
    return this;
  }

   /**
   * Get engagedViewAttributionWindow
   * @return engagedViewAttributionWindow
  **/
  @Schema(description = "")
  public String getEngagedViewAttributionWindow() {
    return engagedViewAttributionWindow;
  }

  public void setEngagedViewAttributionWindow(String engagedViewAttributionWindow) {
    this.engagedViewAttributionWindow = engagedViewAttributionWindow;
  }

  public AdgroupCreateBody excludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
    return this;
  }

  public AdgroupCreateBody addExcludedAudienceIdsItem(String excludedAudienceIdsItem) {
    if (this.excludedAudienceIds == null) {
      this.excludedAudienceIds = new ArrayList<String>();
    }
    this.excludedAudienceIds.add(excludedAudienceIdsItem);
    return this;
  }

   /**
   * Get excludedAudienceIds
   * @return excludedAudienceIds
  **/
  @Schema(description = "")
  public List<String> getExcludedAudienceIds() {
    return excludedAudienceIds;
  }

  public void setExcludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
  }

  public AdgroupCreateBody excludedCustomActions(List<AdgroupcreateExcludedCustomActions> excludedCustomActions) {
    this.excludedCustomActions = excludedCustomActions;
    return this;
  }

  public AdgroupCreateBody addExcludedCustomActionsItem(AdgroupcreateExcludedCustomActions excludedCustomActionsItem) {
    if (this.excludedCustomActions == null) {
      this.excludedCustomActions = new ArrayList<AdgroupcreateExcludedCustomActions>();
    }
    this.excludedCustomActions.add(excludedCustomActionsItem);
    return this;
  }

   /**
   * Get excludedCustomActions
   * @return excludedCustomActions
  **/
  @Schema(description = "")
  public List<AdgroupcreateExcludedCustomActions> getExcludedCustomActions() {
    return excludedCustomActions;
  }

  public void setExcludedCustomActions(List<AdgroupcreateExcludedCustomActions> excludedCustomActions) {
    this.excludedCustomActions = excludedCustomActions;
  }

  public AdgroupCreateBody excludedPangleAudiencePackageIds(List<String> excludedPangleAudiencePackageIds) {
    this.excludedPangleAudiencePackageIds = excludedPangleAudiencePackageIds;
    return this;
  }

  public AdgroupCreateBody addExcludedPangleAudiencePackageIdsItem(String excludedPangleAudiencePackageIdsItem) {
    if (this.excludedPangleAudiencePackageIds == null) {
      this.excludedPangleAudiencePackageIds = new ArrayList<String>();
    }
    this.excludedPangleAudiencePackageIds.add(excludedPangleAudiencePackageIdsItem);
    return this;
  }

   /**
   * Get excludedPangleAudiencePackageIds
   * @return excludedPangleAudiencePackageIds
  **/
  @Schema(description = "")
  public List<String> getExcludedPangleAudiencePackageIds() {
    return excludedPangleAudiencePackageIds;
  }

  public void setExcludedPangleAudiencePackageIds(List<String> excludedPangleAudiencePackageIds) {
    this.excludedPangleAudiencePackageIds = excludedPangleAudiencePackageIds;
  }

  public AdgroupCreateBody frequency(Double frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public Double getFrequency() {
    return frequency;
  }

  public void setFrequency(Double frequency) {
    this.frequency = frequency;
  }

  public AdgroupCreateBody frequencySchedule(Double frequencySchedule) {
    this.frequencySchedule = frequencySchedule;
    return this;
  }

   /**
   * Get frequencySchedule
   * @return frequencySchedule
  **/
  @Schema(description = "")
  public Double getFrequencySchedule() {
    return frequencySchedule;
  }

  public void setFrequencySchedule(Double frequencySchedule) {
    this.frequencySchedule = frequencySchedule;
  }

  public AdgroupCreateBody gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @Schema(description = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public AdgroupCreateBody householdIncome(List<String> householdIncome) {
    this.householdIncome = householdIncome;
    return this;
  }

  public AdgroupCreateBody addHouseholdIncomeItem(String householdIncomeItem) {
    if (this.householdIncome == null) {
      this.householdIncome = new ArrayList<String>();
    }
    this.householdIncome.add(householdIncomeItem);
    return this;
  }

   /**
   * Get householdIncome
   * @return householdIncome
  **/
  @Schema(description = "")
  public List<String> getHouseholdIncome() {
    return householdIncome;
  }

  public void setHouseholdIncome(List<String> householdIncome) {
    this.householdIncome = householdIncome;
  }

  public AdgroupCreateBody identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * Get identityAuthorizedBcId
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public AdgroupCreateBody identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public AdgroupCreateBody identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public AdgroupCreateBody includedCustomActions(List<AdgroupcreateIncludedCustomActions> includedCustomActions) {
    this.includedCustomActions = includedCustomActions;
    return this;
  }

  public AdgroupCreateBody addIncludedCustomActionsItem(AdgroupcreateIncludedCustomActions includedCustomActionsItem) {
    if (this.includedCustomActions == null) {
      this.includedCustomActions = new ArrayList<AdgroupcreateIncludedCustomActions>();
    }
    this.includedCustomActions.add(includedCustomActionsItem);
    return this;
  }

   /**
   * Get includedCustomActions
   * @return includedCustomActions
  **/
  @Schema(description = "")
  public List<AdgroupcreateIncludedCustomActions> getIncludedCustomActions() {
    return includedCustomActions;
  }

  public void setIncludedCustomActions(List<AdgroupcreateIncludedCustomActions> includedCustomActions) {
    this.includedCustomActions = includedCustomActions;
  }

  public AdgroupCreateBody includedPangleAudiencePackageIds(List<String> includedPangleAudiencePackageIds) {
    this.includedPangleAudiencePackageIds = includedPangleAudiencePackageIds;
    return this;
  }

  public AdgroupCreateBody addIncludedPangleAudiencePackageIdsItem(String includedPangleAudiencePackageIdsItem) {
    if (this.includedPangleAudiencePackageIds == null) {
      this.includedPangleAudiencePackageIds = new ArrayList<String>();
    }
    this.includedPangleAudiencePackageIds.add(includedPangleAudiencePackageIdsItem);
    return this;
  }

   /**
   * Get includedPangleAudiencePackageIds
   * @return includedPangleAudiencePackageIds
  **/
  @Schema(description = "")
  public List<String> getIncludedPangleAudiencePackageIds() {
    return includedPangleAudiencePackageIds;
  }

  public void setIncludedPangleAudiencePackageIds(List<String> includedPangleAudiencePackageIds) {
    this.includedPangleAudiencePackageIds = includedPangleAudiencePackageIds;
  }

  public AdgroupCreateBody interestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
    return this;
  }

  public AdgroupCreateBody addInterestCategoryIdsItem(String interestCategoryIdsItem) {
    if (this.interestCategoryIds == null) {
      this.interestCategoryIds = new ArrayList<String>();
    }
    this.interestCategoryIds.add(interestCategoryIdsItem);
    return this;
  }

   /**
   * Get interestCategoryIds
   * @return interestCategoryIds
  **/
  @Schema(description = "")
  public List<String> getInterestCategoryIds() {
    return interestCategoryIds;
  }

  public void setInterestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
  }

  public AdgroupCreateBody interestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
    return this;
  }

  public AdgroupCreateBody addInterestKeywordIdsItem(String interestKeywordIdsItem) {
    if (this.interestKeywordIds == null) {
      this.interestKeywordIds = new ArrayList<String>();
    }
    this.interestKeywordIds.add(interestKeywordIdsItem);
    return this;
  }

   /**
   * Get interestKeywordIds
   * @return interestKeywordIds
  **/
  @Schema(description = "")
  public List<String> getInterestKeywordIds() {
    return interestKeywordIds;
  }

  public void setInterestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
  }

  public AdgroupCreateBody ios14Targeting(String ios14Targeting) {
    this.ios14Targeting = ios14Targeting;
    return this;
  }

   /**
   * Get ios14Targeting
   * @return ios14Targeting
  **/
  @Schema(description = "")
  public String getIos14Targeting() {
    return ios14Targeting;
  }

  public void setIos14Targeting(String ios14Targeting) {
    this.ios14Targeting = ios14Targeting;
  }

  public AdgroupCreateBody isHfss(Boolean isHfss) {
    this.isHfss = isHfss;
    return this;
  }

   /**
   * Get isHfss
   * @return isHfss
  **/
  @Schema(description = "")
  public Boolean isIsHfss() {
    return isHfss;
  }

  public void setIsHfss(Boolean isHfss) {
    this.isHfss = isHfss;
  }

  public AdgroupCreateBody isLhfCompliance(Boolean isLhfCompliance) {
    this.isLhfCompliance = isLhfCompliance;
    return this;
  }

   /**
   * Get isLhfCompliance
   * @return isLhfCompliance
  **/
  @Schema(description = "")
  public Boolean isIsLhfCompliance() {
    return isLhfCompliance;
  }

  public void setIsLhfCompliance(Boolean isLhfCompliance) {
    this.isLhfCompliance = isLhfCompliance;
  }

  public AdgroupCreateBody ispIds(List<String> ispIds) {
    this.ispIds = ispIds;
    return this;
  }

  public AdgroupCreateBody addIspIdsItem(String ispIdsItem) {
    if (this.ispIds == null) {
      this.ispIds = new ArrayList<String>();
    }
    this.ispIds.add(ispIdsItem);
    return this;
  }

   /**
   * Get ispIds
   * @return ispIds
  **/
  @Schema(description = "")
  public List<String> getIspIds() {
    return ispIds;
  }

  public void setIspIds(List<String> ispIds) {
    this.ispIds = ispIds;
  }

  public AdgroupCreateBody languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public AdgroupCreateBody addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @Schema(description = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public AdgroupCreateBody locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public AdgroupCreateBody addLocationIdsItem(String locationIdsItem) {
    if (this.locationIds == null) {
      this.locationIds = new ArrayList<String>();
    }
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * Get locationIds
   * @return locationIds
  **/
  @Schema(description = "")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public AdgroupCreateBody messageEventSetId(String messageEventSetId) {
    this.messageEventSetId = messageEventSetId;
    return this;
  }

   /**
   * Get messageEventSetId
   * @return messageEventSetId
  **/
  @Schema(description = "")
  public String getMessageEventSetId() {
    return messageEventSetId;
  }

  public void setMessageEventSetId(String messageEventSetId) {
    this.messageEventSetId = messageEventSetId;
  }

  public AdgroupCreateBody messagingAppAccountId(String messagingAppAccountId) {
    this.messagingAppAccountId = messagingAppAccountId;
    return this;
  }

   /**
   * Get messagingAppAccountId
   * @return messagingAppAccountId
  **/
  @Schema(description = "")
  public String getMessagingAppAccountId() {
    return messagingAppAccountId;
  }

  public void setMessagingAppAccountId(String messagingAppAccountId) {
    this.messagingAppAccountId = messagingAppAccountId;
  }

  public AdgroupCreateBody messagingAppType(String messagingAppType) {
    this.messagingAppType = messagingAppType;
    return this;
  }

   /**
   * Get messagingAppType
   * @return messagingAppType
  **/
  @Schema(description = "")
  public String getMessagingAppType() {
    return messagingAppType;
  }

  public void setMessagingAppType(String messagingAppType) {
    this.messagingAppType = messagingAppType;
  }

  public AdgroupCreateBody minAndroidVersion(String minAndroidVersion) {
    this.minAndroidVersion = minAndroidVersion;
    return this;
  }

   /**
   * Get minAndroidVersion
   * @return minAndroidVersion
  **/
  @Schema(description = "")
  public String getMinAndroidVersion() {
    return minAndroidVersion;
  }

  public void setMinAndroidVersion(String minAndroidVersion) {
    this.minAndroidVersion = minAndroidVersion;
  }

  public AdgroupCreateBody minIosVersion(String minIosVersion) {
    this.minIosVersion = minIosVersion;
    return this;
  }

   /**
   * Get minIosVersion
   * @return minIosVersion
  **/
  @Schema(description = "")
  public String getMinIosVersion() {
    return minIosVersion;
  }

  public void setMinIosVersion(String minIosVersion) {
    this.minIosVersion = minIosVersion;
  }

  public AdgroupCreateBody networkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
    return this;
  }

  public AdgroupCreateBody addNetworkTypesItem(String networkTypesItem) {
    if (this.networkTypes == null) {
      this.networkTypes = new ArrayList<String>();
    }
    this.networkTypes.add(networkTypesItem);
    return this;
  }

   /**
   * Get networkTypes
   * @return networkTypes
  **/
  @Schema(description = "")
  public List<String> getNetworkTypes() {
    return networkTypes;
  }

  public void setNetworkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
  }

  public AdgroupCreateBody nextDayRetention(BigDecimal nextDayRetention) {
    this.nextDayRetention = nextDayRetention;
    return this;
  }

   /**
   * Get nextDayRetention
   * @return nextDayRetention
  **/
  @Schema(description = "")
  public BigDecimal getNextDayRetention() {
    return nextDayRetention;
  }

  public void setNextDayRetention(BigDecimal nextDayRetention) {
    this.nextDayRetention = nextDayRetention;
  }

  public AdgroupCreateBody operatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  public AdgroupCreateBody addOperatingSystemsItem(String operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<String>();
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

   /**
   * Get operatingSystems
   * @return operatingSystems
  **/
  @Schema(description = "")
  public List<String> getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

  public AdgroupCreateBody operationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * Get operationStatus
   * @return operationStatus
  **/
  @Schema(description = "")
  public String getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  public AdgroupCreateBody optimizationEvent(String optimizationEvent) {
    this.optimizationEvent = optimizationEvent;
    return this;
  }

   /**
   * Get optimizationEvent
   * @return optimizationEvent
  **/
  @Schema(description = "")
  public String getOptimizationEvent() {
    return optimizationEvent;
  }

  public void setOptimizationEvent(String optimizationEvent) {
    this.optimizationEvent = optimizationEvent;
  }

  public AdgroupCreateBody optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

   /**
   * Get optimizationGoal
   * @return optimizationGoal
  **/
  @Schema(required = true, description = "")
  public String getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public AdgroupCreateBody pacing(String pacing) {
    this.pacing = pacing;
    return this;
  }

   /**
   * Get pacing
   * @return pacing
  **/
  @Schema(required = true, description = "")
  public String getPacing() {
    return pacing;
  }

  public void setPacing(String pacing) {
    this.pacing = pacing;
  }

  public AdgroupCreateBody phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AdgroupCreateBody phoneRegionCallingCode(String phoneRegionCallingCode) {
    this.phoneRegionCallingCode = phoneRegionCallingCode;
    return this;
  }

   /**
   * Get phoneRegionCallingCode
   * @return phoneRegionCallingCode
  **/
  @Schema(description = "")
  public String getPhoneRegionCallingCode() {
    return phoneRegionCallingCode;
  }

  public void setPhoneRegionCallingCode(String phoneRegionCallingCode) {
    this.phoneRegionCallingCode = phoneRegionCallingCode;
  }

  public AdgroupCreateBody phoneRegionCode(String phoneRegionCode) {
    this.phoneRegionCode = phoneRegionCode;
    return this;
  }

   /**
   * Get phoneRegionCode
   * @return phoneRegionCode
  **/
  @Schema(description = "")
  public String getPhoneRegionCode() {
    return phoneRegionCode;
  }

  public void setPhoneRegionCode(String phoneRegionCode) {
    this.phoneRegionCode = phoneRegionCode;
  }

  public AdgroupCreateBody pixelId(String pixelId) {
    this.pixelId = pixelId;
    return this;
  }

   /**
   * Get pixelId
   * @return pixelId
  **/
  @Schema(description = "")
  public String getPixelId() {
    return pixelId;
  }

  public void setPixelId(String pixelId) {
    this.pixelId = pixelId;
  }

  public AdgroupCreateBody placementType(String placementType) {
    this.placementType = placementType;
    return this;
  }

   /**
   * Get placementType
   * @return placementType
  **/
  @Schema(description = "")
  public String getPlacementType() {
    return placementType;
  }

  public void setPlacementType(String placementType) {
    this.placementType = placementType;
  }

  public AdgroupCreateBody placements(List<String> placements) {
    this.placements = placements;
    return this;
  }

  public AdgroupCreateBody addPlacementsItem(String placementsItem) {
    if (this.placements == null) {
      this.placements = new ArrayList<String>();
    }
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Get placements
   * @return placements
  **/
  @Schema(description = "")
  public List<String> getPlacements() {
    return placements;
  }

  public void setPlacements(List<String> placements) {
    this.placements = placements;
  }

  public AdgroupCreateBody productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

   /**
   * Get productSource
   * @return productSource
  **/
  @Schema(description = "")
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }

  public AdgroupCreateBody promotionTargetType(String promotionTargetType) {
    this.promotionTargetType = promotionTargetType;
    return this;
  }

   /**
   * Get promotionTargetType
   * @return promotionTargetType
  **/
  @Schema(description = "")
  public String getPromotionTargetType() {
    return promotionTargetType;
  }

  public void setPromotionTargetType(String promotionTargetType) {
    this.promotionTargetType = promotionTargetType;
  }

  public AdgroupCreateBody promotionType(String promotionType) {
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Get promotionType
   * @return promotionType
  **/
  @Schema(description = "")
  public String getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
  }

  public AdgroupCreateBody promotionWebsiteType(String promotionWebsiteType) {
    this.promotionWebsiteType = promotionWebsiteType;
    return this;
  }

   /**
   * Get promotionWebsiteType
   * @return promotionWebsiteType
  **/
  @Schema(description = "")
  public String getPromotionWebsiteType() {
    return promotionWebsiteType;
  }

  public void setPromotionWebsiteType(String promotionWebsiteType) {
    this.promotionWebsiteType = promotionWebsiteType;
  }

  public AdgroupCreateBody purchaseIntentionKeywordIds(List<String> purchaseIntentionKeywordIds) {
    this.purchaseIntentionKeywordIds = purchaseIntentionKeywordIds;
    return this;
  }

  public AdgroupCreateBody addPurchaseIntentionKeywordIdsItem(String purchaseIntentionKeywordIdsItem) {
    if (this.purchaseIntentionKeywordIds == null) {
      this.purchaseIntentionKeywordIds = new ArrayList<String>();
    }
    this.purchaseIntentionKeywordIds.add(purchaseIntentionKeywordIdsItem);
    return this;
  }

   /**
   * Get purchaseIntentionKeywordIds
   * @return purchaseIntentionKeywordIds
  **/
  @Schema(description = "")
  public List<String> getPurchaseIntentionKeywordIds() {
    return purchaseIntentionKeywordIds;
  }

  public void setPurchaseIntentionKeywordIds(List<String> purchaseIntentionKeywordIds) {
    this.purchaseIntentionKeywordIds = purchaseIntentionKeywordIds;
  }

  public AdgroupCreateBody requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public AdgroupCreateBody roasBid(BigDecimal roasBid) {
    this.roasBid = roasBid;
    return this;
  }

   /**
   * Get roasBid
   * @return roasBid
  **/
  @Schema(description = "")
  public BigDecimal getRoasBid() {
    return roasBid;
  }

  public void setRoasBid(BigDecimal roasBid) {
    this.roasBid = roasBid;
  }

  public AdgroupCreateBody savedAudienceId(String savedAudienceId) {
    this.savedAudienceId = savedAudienceId;
    return this;
  }

   /**
   * Get savedAudienceId
   * @return savedAudienceId
  **/
  @Schema(description = "")
  public String getSavedAudienceId() {
    return savedAudienceId;
  }

  public void setSavedAudienceId(String savedAudienceId) {
    this.savedAudienceId = savedAudienceId;
  }

  public AdgroupCreateBody scheduleEndTime(String scheduleEndTime) {
    this.scheduleEndTime = scheduleEndTime;
    return this;
  }

   /**
   * Get scheduleEndTime
   * @return scheduleEndTime
  **/
  @Schema(description = "")
  public String getScheduleEndTime() {
    return scheduleEndTime;
  }

  public void setScheduleEndTime(String scheduleEndTime) {
    this.scheduleEndTime = scheduleEndTime;
  }

  public AdgroupCreateBody scheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
    return this;
  }

   /**
   * Get scheduleStartTime
   * @return scheduleStartTime
  **/
  @Schema(required = true, description = "")
  public String getScheduleStartTime() {
    return scheduleStartTime;
  }

  public void setScheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
  }

  public AdgroupCreateBody scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @Schema(required = true, description = "")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public AdgroupCreateBody searchKeywords(List<AdgroupcreateSearchKeywords> searchKeywords) {
    this.searchKeywords = searchKeywords;
    return this;
  }

  public AdgroupCreateBody addSearchKeywordsItem(AdgroupcreateSearchKeywords searchKeywordsItem) {
    if (this.searchKeywords == null) {
      this.searchKeywords = new ArrayList<AdgroupcreateSearchKeywords>();
    }
    this.searchKeywords.add(searchKeywordsItem);
    return this;
  }

   /**
   * Get searchKeywords
   * @return searchKeywords
  **/
  @Schema(description = "")
  public List<AdgroupcreateSearchKeywords> getSearchKeywords() {
    return searchKeywords;
  }

  public void setSearchKeywords(List<AdgroupcreateSearchKeywords> searchKeywords) {
    this.searchKeywords = searchKeywords;
  }

  public AdgroupCreateBody searchResultEnabled(Boolean searchResultEnabled) {
    this.searchResultEnabled = searchResultEnabled;
    return this;
  }

   /**
   * Get searchResultEnabled
   * @return searchResultEnabled
  **/
  @Schema(description = "")
  public Boolean isSearchResultEnabled() {
    return searchResultEnabled;
  }

  public void setSearchResultEnabled(Boolean searchResultEnabled) {
    this.searchResultEnabled = searchResultEnabled;
  }

  public AdgroupCreateBody secondaryOptimizationEvent(String secondaryOptimizationEvent) {
    this.secondaryOptimizationEvent = secondaryOptimizationEvent;
    return this;
  }

   /**
   * Get secondaryOptimizationEvent
   * @return secondaryOptimizationEvent
  **/
  @Schema(description = "")
  public String getSecondaryOptimizationEvent() {
    return secondaryOptimizationEvent;
  }

  public void setSecondaryOptimizationEvent(String secondaryOptimizationEvent) {
    this.secondaryOptimizationEvent = secondaryOptimizationEvent;
  }

  public AdgroupCreateBody shareDisabled(Boolean shareDisabled) {
    this.shareDisabled = shareDisabled;
    return this;
  }

   /**
   * Get shareDisabled
   * @return shareDisabled
  **/
  @Schema(description = "")
  public Boolean isShareDisabled() {
    return shareDisabled;
  }

  public void setShareDisabled(Boolean shareDisabled) {
    this.shareDisabled = shareDisabled;
  }

  public AdgroupCreateBody shoppingAdsRetargetingActionsDays(Integer shoppingAdsRetargetingActionsDays) {
    this.shoppingAdsRetargetingActionsDays = shoppingAdsRetargetingActionsDays;
    return this;
  }

   /**
   * Get shoppingAdsRetargetingActionsDays
   * @return shoppingAdsRetargetingActionsDays
  **/
  @Schema(description = "")
  public Integer getShoppingAdsRetargetingActionsDays() {
    return shoppingAdsRetargetingActionsDays;
  }

  public void setShoppingAdsRetargetingActionsDays(Integer shoppingAdsRetargetingActionsDays) {
    this.shoppingAdsRetargetingActionsDays = shoppingAdsRetargetingActionsDays;
  }

  public AdgroupCreateBody shoppingAdsRetargetingCustomAudienceRelation(String shoppingAdsRetargetingCustomAudienceRelation) {
    this.shoppingAdsRetargetingCustomAudienceRelation = shoppingAdsRetargetingCustomAudienceRelation;
    return this;
  }

   /**
   * Get shoppingAdsRetargetingCustomAudienceRelation
   * @return shoppingAdsRetargetingCustomAudienceRelation
  **/
  @Schema(description = "")
  public String getShoppingAdsRetargetingCustomAudienceRelation() {
    return shoppingAdsRetargetingCustomAudienceRelation;
  }

  public void setShoppingAdsRetargetingCustomAudienceRelation(String shoppingAdsRetargetingCustomAudienceRelation) {
    this.shoppingAdsRetargetingCustomAudienceRelation = shoppingAdsRetargetingCustomAudienceRelation;
  }

  public AdgroupCreateBody shoppingAdsRetargetingType(String shoppingAdsRetargetingType) {
    this.shoppingAdsRetargetingType = shoppingAdsRetargetingType;
    return this;
  }

   /**
   * Get shoppingAdsRetargetingType
   * @return shoppingAdsRetargetingType
  **/
  @Schema(description = "")
  public String getShoppingAdsRetargetingType() {
    return shoppingAdsRetargetingType;
  }

  public void setShoppingAdsRetargetingType(String shoppingAdsRetargetingType) {
    this.shoppingAdsRetargetingType = shoppingAdsRetargetingType;
  }

  public AdgroupCreateBody shoppingAdsType(String shoppingAdsType) {
    this.shoppingAdsType = shoppingAdsType;
    return this;
  }

   /**
   * Get shoppingAdsType
   * @return shoppingAdsType
  **/
  @Schema(description = "")
  public String getShoppingAdsType() {
    return shoppingAdsType;
  }

  public void setShoppingAdsType(String shoppingAdsType) {
    this.shoppingAdsType = shoppingAdsType;
  }

  public AdgroupCreateBody skipLearningPhase(Boolean skipLearningPhase) {
    this.skipLearningPhase = skipLearningPhase;
    return this;
  }

   /**
   * Get skipLearningPhase
   * @return skipLearningPhase
  **/
  @Schema(description = "")
  public Boolean isSkipLearningPhase() {
    return skipLearningPhase;
  }

  public void setSkipLearningPhase(Boolean skipLearningPhase) {
    this.skipLearningPhase = skipLearningPhase;
  }

  public AdgroupCreateBody smartAudienceEnabled(Boolean smartAudienceEnabled) {
    this.smartAudienceEnabled = smartAudienceEnabled;
    return this;
  }

   /**
   * Get smartAudienceEnabled
   * @return smartAudienceEnabled
  **/
  @Schema(description = "")
  public Boolean isSmartAudienceEnabled() {
    return smartAudienceEnabled;
  }

  public void setSmartAudienceEnabled(Boolean smartAudienceEnabled) {
    this.smartAudienceEnabled = smartAudienceEnabled;
  }

  public AdgroupCreateBody smartInterestBehaviorEnabled(Boolean smartInterestBehaviorEnabled) {
    this.smartInterestBehaviorEnabled = smartInterestBehaviorEnabled;
    return this;
  }

   /**
   * Get smartInterestBehaviorEnabled
   * @return smartInterestBehaviorEnabled
  **/
  @Schema(description = "")
  public Boolean isSmartInterestBehaviorEnabled() {
    return smartInterestBehaviorEnabled;
  }

  public void setSmartInterestBehaviorEnabled(Boolean smartInterestBehaviorEnabled) {
    this.smartInterestBehaviorEnabled = smartInterestBehaviorEnabled;
  }

  public AdgroupCreateBody spendingPower(String spendingPower) {
    this.spendingPower = spendingPower;
    return this;
  }

   /**
   * Get spendingPower
   * @return spendingPower
  **/
  @Schema(description = "")
  public String getSpendingPower() {
    return spendingPower;
  }

  public void setSpendingPower(String spendingPower) {
    this.spendingPower = spendingPower;
  }

  public AdgroupCreateBody statisticType(String statisticType) {
    this.statisticType = statisticType;
    return this;
  }

   /**
   * Get statisticType
   * @return statisticType
  **/
  @Schema(description = "")
  public String getStatisticType() {
    return statisticType;
  }

  public void setStatisticType(String statisticType) {
    this.statisticType = statisticType;
  }

  public AdgroupCreateBody storeAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
    return this;
  }

   /**
   * Get storeAuthorizedBcId
   * @return storeAuthorizedBcId
  **/
  @Schema(description = "")
  public String getStoreAuthorizedBcId() {
    return storeAuthorizedBcId;
  }

  public void setStoreAuthorizedBcId(String storeAuthorizedBcId) {
    this.storeAuthorizedBcId = storeAuthorizedBcId;
  }

  public AdgroupCreateBody storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @Schema(description = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public AdgroupCreateBody tiktokSubplacements(List<String> tiktokSubplacements) {
    this.tiktokSubplacements = tiktokSubplacements;
    return this;
  }

  public AdgroupCreateBody addTiktokSubplacementsItem(String tiktokSubplacementsItem) {
    if (this.tiktokSubplacements == null) {
      this.tiktokSubplacements = new ArrayList<String>();
    }
    this.tiktokSubplacements.add(tiktokSubplacementsItem);
    return this;
  }

   /**
   * Get tiktokSubplacements
   * @return tiktokSubplacements
  **/
  @Schema(description = "")
  public List<String> getTiktokSubplacements() {
    return tiktokSubplacements;
  }

  public void setTiktokSubplacements(List<String> tiktokSubplacements) {
    this.tiktokSubplacements = tiktokSubplacements;
  }

  public AdgroupCreateBody vboWindow(String vboWindow) {
    this.vboWindow = vboWindow;
    return this;
  }

   /**
   * Get vboWindow
   * @return vboWindow
  **/
  @Schema(description = "")
  public String getVboWindow() {
    return vboWindow;
  }

  public void setVboWindow(String vboWindow) {
    this.vboWindow = vboWindow;
  }

  public AdgroupCreateBody verticalSensitivityId(String verticalSensitivityId) {
    this.verticalSensitivityId = verticalSensitivityId;
    return this;
  }

   /**
   * Get verticalSensitivityId
   * @return verticalSensitivityId
  **/
  @Schema(description = "")
  public String getVerticalSensitivityId() {
    return verticalSensitivityId;
  }

  public void setVerticalSensitivityId(String verticalSensitivityId) {
    this.verticalSensitivityId = verticalSensitivityId;
  }

  public AdgroupCreateBody videoDownloadDisabled(Boolean videoDownloadDisabled) {
    this.videoDownloadDisabled = videoDownloadDisabled;
    return this;
  }

   /**
   * Get videoDownloadDisabled
   * @return videoDownloadDisabled
  **/
  @Schema(description = "")
  public Boolean isVideoDownloadDisabled() {
    return videoDownloadDisabled;
  }

  public void setVideoDownloadDisabled(Boolean videoDownloadDisabled) {
    this.videoDownloadDisabled = videoDownloadDisabled;
  }

  public AdgroupCreateBody viewAttributionWindow(String viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Get viewAttributionWindow
   * @return viewAttributionWindow
  **/
  @Schema(description = "")
  public String getViewAttributionWindow() {
    return viewAttributionWindow;
  }

  public void setViewAttributionWindow(String viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
  }

  public AdgroupCreateBody zipcodeIds(List<String> zipcodeIds) {
    this.zipcodeIds = zipcodeIds;
    return this;
  }

  public AdgroupCreateBody addZipcodeIdsItem(String zipcodeIdsItem) {
    if (this.zipcodeIds == null) {
      this.zipcodeIds = new ArrayList<String>();
    }
    this.zipcodeIds.add(zipcodeIdsItem);
    return this;
  }

   /**
   * Get zipcodeIds
   * @return zipcodeIds
  **/
  @Schema(description = "")
  public List<String> getZipcodeIds() {
    return zipcodeIds;
  }

  public void setZipcodeIds(List<String> zipcodeIds) {
    this.zipcodeIds = zipcodeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupCreateBody adgroupCreateBody = (AdgroupCreateBody) o;
    return Objects.equals(this.actions, adgroupCreateBody.actions) &&
        Objects.equals(this.adgroupAppProfilePageState, adgroupCreateBody.adgroupAppProfilePageState) &&
        Objects.equals(this.adgroupName, adgroupCreateBody.adgroupName) &&
        Objects.equals(this.advertiserId, adgroupCreateBody.advertiserId) &&
        Objects.equals(this.ageGroups, adgroupCreateBody.ageGroups) &&
        Objects.equals(this.appConfig, adgroupCreateBody.appConfig) &&
        Objects.equals(this.appId, adgroupCreateBody.appId) &&
        Objects.equals(this.attributionEventCount, adgroupCreateBody.attributionEventCount) &&
        Objects.equals(this.audienceIds, adgroupCreateBody.audienceIds) &&
        Objects.equals(this.audienceRule, adgroupCreateBody.audienceRule) &&
        Objects.equals(this.audienceType, adgroupCreateBody.audienceType) &&
        Objects.equals(this.automatedKeywordsEnabled, adgroupCreateBody.automatedKeywordsEnabled) &&
        Objects.equals(this.bidDisplayMode, adgroupCreateBody.bidDisplayMode) &&
        Objects.equals(this.bidPrice, adgroupCreateBody.bidPrice) &&
        Objects.equals(this.bidType, adgroupCreateBody.bidType) &&
        Objects.equals(this.billingEvent, adgroupCreateBody.billingEvent) &&
        Objects.equals(this.blockedPangleAppIds, adgroupCreateBody.blockedPangleAppIds) &&
        Objects.equals(this.brandSafetyPartner, adgroupCreateBody.brandSafetyPartner) &&
        Objects.equals(this.brandSafetyType, adgroupCreateBody.brandSafetyType) &&
        Objects.equals(this.budget, adgroupCreateBody.budget) &&
        Objects.equals(this.budgetMode, adgroupCreateBody.budgetMode) &&
        Objects.equals(this.campaignId, adgroupCreateBody.campaignId) &&
        Objects.equals(this.carrierIds, adgroupCreateBody.carrierIds) &&
        Objects.equals(this.catalogAuthorizedBcId, adgroupCreateBody.catalogAuthorizedBcId) &&
        Objects.equals(this.catalogId, adgroupCreateBody.catalogId) &&
        Objects.equals(this.categoryExclusionIds, adgroupCreateBody.categoryExclusionIds) &&
        Objects.equals(this.clickAttributionWindow, adgroupCreateBody.clickAttributionWindow) &&
        Objects.equals(this.commentDisabled, adgroupCreateBody.commentDisabled) &&
        Objects.equals(this.contextualTagIds, adgroupCreateBody.contextualTagIds) &&
        Objects.equals(this.conversionBidPrice, adgroupCreateBody.conversionBidPrice) &&
        Objects.equals(this.creativeMaterialMode, adgroupCreateBody.creativeMaterialMode) &&
        Objects.equals(this.customConversionId, adgroupCreateBody.customConversionId) &&
        Objects.equals(this.dayparting, adgroupCreateBody.dayparting) &&
        Objects.equals(this.deepBidType, adgroupCreateBody.deepBidType) &&
        Objects.equals(this.deepCpaBid, adgroupCreateBody.deepCpaBid) &&
        Objects.equals(this.deepFunnelEventSource, adgroupCreateBody.deepFunnelEventSource) &&
        Objects.equals(this.deepFunnelEventSourceId, adgroupCreateBody.deepFunnelEventSourceId) &&
        Objects.equals(this.deepFunnelOptimizationEvent, adgroupCreateBody.deepFunnelOptimizationEvent) &&
        Objects.equals(this.deepFunnelOptimizationStatus, adgroupCreateBody.deepFunnelOptimizationStatus) &&
        Objects.equals(this.deviceModelIds, adgroupCreateBody.deviceModelIds) &&
        Objects.equals(this.devicePriceRanges, adgroupCreateBody.devicePriceRanges) &&
        Objects.equals(this.engagedViewAttributionWindow, adgroupCreateBody.engagedViewAttributionWindow) &&
        Objects.equals(this.excludedAudienceIds, adgroupCreateBody.excludedAudienceIds) &&
        Objects.equals(this.excludedCustomActions, adgroupCreateBody.excludedCustomActions) &&
        Objects.equals(this.excludedPangleAudiencePackageIds, adgroupCreateBody.excludedPangleAudiencePackageIds) &&
        Objects.equals(this.frequency, adgroupCreateBody.frequency) &&
        Objects.equals(this.frequencySchedule, adgroupCreateBody.frequencySchedule) &&
        Objects.equals(this.gender, adgroupCreateBody.gender) &&
        Objects.equals(this.householdIncome, adgroupCreateBody.householdIncome) &&
        Objects.equals(this.identityAuthorizedBcId, adgroupCreateBody.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, adgroupCreateBody.identityId) &&
        Objects.equals(this.identityType, adgroupCreateBody.identityType) &&
        Objects.equals(this.includedCustomActions, adgroupCreateBody.includedCustomActions) &&
        Objects.equals(this.includedPangleAudiencePackageIds, adgroupCreateBody.includedPangleAudiencePackageIds) &&
        Objects.equals(this.interestCategoryIds, adgroupCreateBody.interestCategoryIds) &&
        Objects.equals(this.interestKeywordIds, adgroupCreateBody.interestKeywordIds) &&
        Objects.equals(this.ios14Targeting, adgroupCreateBody.ios14Targeting) &&
        Objects.equals(this.isHfss, adgroupCreateBody.isHfss) &&
        Objects.equals(this.isLhfCompliance, adgroupCreateBody.isLhfCompliance) &&
        Objects.equals(this.ispIds, adgroupCreateBody.ispIds) &&
        Objects.equals(this.languages, adgroupCreateBody.languages) &&
        Objects.equals(this.locationIds, adgroupCreateBody.locationIds) &&
        Objects.equals(this.messageEventSetId, adgroupCreateBody.messageEventSetId) &&
        Objects.equals(this.messagingAppAccountId, adgroupCreateBody.messagingAppAccountId) &&
        Objects.equals(this.messagingAppType, adgroupCreateBody.messagingAppType) &&
        Objects.equals(this.minAndroidVersion, adgroupCreateBody.minAndroidVersion) &&
        Objects.equals(this.minIosVersion, adgroupCreateBody.minIosVersion) &&
        Objects.equals(this.networkTypes, adgroupCreateBody.networkTypes) &&
        Objects.equals(this.nextDayRetention, adgroupCreateBody.nextDayRetention) &&
        Objects.equals(this.operatingSystems, adgroupCreateBody.operatingSystems) &&
        Objects.equals(this.operationStatus, adgroupCreateBody.operationStatus) &&
        Objects.equals(this.optimizationEvent, adgroupCreateBody.optimizationEvent) &&
        Objects.equals(this.optimizationGoal, adgroupCreateBody.optimizationGoal) &&
        Objects.equals(this.pacing, adgroupCreateBody.pacing) &&
        Objects.equals(this.phoneNumber, adgroupCreateBody.phoneNumber) &&
        Objects.equals(this.phoneRegionCallingCode, adgroupCreateBody.phoneRegionCallingCode) &&
        Objects.equals(this.phoneRegionCode, adgroupCreateBody.phoneRegionCode) &&
        Objects.equals(this.pixelId, adgroupCreateBody.pixelId) &&
        Objects.equals(this.placementType, adgroupCreateBody.placementType) &&
        Objects.equals(this.placements, adgroupCreateBody.placements) &&
        Objects.equals(this.productSource, adgroupCreateBody.productSource) &&
        Objects.equals(this.promotionTargetType, adgroupCreateBody.promotionTargetType) &&
        Objects.equals(this.promotionType, adgroupCreateBody.promotionType) &&
        Objects.equals(this.promotionWebsiteType, adgroupCreateBody.promotionWebsiteType) &&
        Objects.equals(this.purchaseIntentionKeywordIds, adgroupCreateBody.purchaseIntentionKeywordIds) &&
        Objects.equals(this.requestId, adgroupCreateBody.requestId) &&
        Objects.equals(this.roasBid, adgroupCreateBody.roasBid) &&
        Objects.equals(this.savedAudienceId, adgroupCreateBody.savedAudienceId) &&
        Objects.equals(this.scheduleEndTime, adgroupCreateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, adgroupCreateBody.scheduleStartTime) &&
        Objects.equals(this.scheduleType, adgroupCreateBody.scheduleType) &&
        Objects.equals(this.searchKeywords, adgroupCreateBody.searchKeywords) &&
        Objects.equals(this.searchResultEnabled, adgroupCreateBody.searchResultEnabled) &&
        Objects.equals(this.secondaryOptimizationEvent, adgroupCreateBody.secondaryOptimizationEvent) &&
        Objects.equals(this.shareDisabled, adgroupCreateBody.shareDisabled) &&
        Objects.equals(this.shoppingAdsRetargetingActionsDays, adgroupCreateBody.shoppingAdsRetargetingActionsDays) &&
        Objects.equals(this.shoppingAdsRetargetingCustomAudienceRelation, adgroupCreateBody.shoppingAdsRetargetingCustomAudienceRelation) &&
        Objects.equals(this.shoppingAdsRetargetingType, adgroupCreateBody.shoppingAdsRetargetingType) &&
        Objects.equals(this.shoppingAdsType, adgroupCreateBody.shoppingAdsType) &&
        Objects.equals(this.skipLearningPhase, adgroupCreateBody.skipLearningPhase) &&
        Objects.equals(this.smartAudienceEnabled, adgroupCreateBody.smartAudienceEnabled) &&
        Objects.equals(this.smartInterestBehaviorEnabled, adgroupCreateBody.smartInterestBehaviorEnabled) &&
        Objects.equals(this.spendingPower, adgroupCreateBody.spendingPower) &&
        Objects.equals(this.statisticType, adgroupCreateBody.statisticType) &&
        Objects.equals(this.storeAuthorizedBcId, adgroupCreateBody.storeAuthorizedBcId) &&
        Objects.equals(this.storeId, adgroupCreateBody.storeId) &&
        Objects.equals(this.tiktokSubplacements, adgroupCreateBody.tiktokSubplacements) &&
        Objects.equals(this.vboWindow, adgroupCreateBody.vboWindow) &&
        Objects.equals(this.verticalSensitivityId, adgroupCreateBody.verticalSensitivityId) &&
        Objects.equals(this.videoDownloadDisabled, adgroupCreateBody.videoDownloadDisabled) &&
        Objects.equals(this.viewAttributionWindow, adgroupCreateBody.viewAttributionWindow) &&
        Objects.equals(this.zipcodeIds, adgroupCreateBody.zipcodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, adgroupAppProfilePageState, adgroupName, advertiserId, ageGroups, appConfig, appId, attributionEventCount, audienceIds, audienceRule, audienceType, automatedKeywordsEnabled, bidDisplayMode, bidPrice, bidType, billingEvent, blockedPangleAppIds, brandSafetyPartner, brandSafetyType, budget, budgetMode, campaignId, carrierIds, catalogAuthorizedBcId, catalogId, categoryExclusionIds, clickAttributionWindow, commentDisabled, contextualTagIds, conversionBidPrice, creativeMaterialMode, customConversionId, dayparting, deepBidType, deepCpaBid, deepFunnelEventSource, deepFunnelEventSourceId, deepFunnelOptimizationEvent, deepFunnelOptimizationStatus, deviceModelIds, devicePriceRanges, engagedViewAttributionWindow, excludedAudienceIds, excludedCustomActions, excludedPangleAudiencePackageIds, frequency, frequencySchedule, gender, householdIncome, identityAuthorizedBcId, identityId, identityType, includedCustomActions, includedPangleAudiencePackageIds, interestCategoryIds, interestKeywordIds, ios14Targeting, isHfss, isLhfCompliance, ispIds, languages, locationIds, messageEventSetId, messagingAppAccountId, messagingAppType, minAndroidVersion, minIosVersion, networkTypes, nextDayRetention, operatingSystems, operationStatus, optimizationEvent, optimizationGoal, pacing, phoneNumber, phoneRegionCallingCode, phoneRegionCode, pixelId, placementType, placements, productSource, promotionTargetType, promotionType, promotionWebsiteType, purchaseIntentionKeywordIds, requestId, roasBid, savedAudienceId, scheduleEndTime, scheduleStartTime, scheduleType, searchKeywords, searchResultEnabled, secondaryOptimizationEvent, shareDisabled, shoppingAdsRetargetingActionsDays, shoppingAdsRetargetingCustomAudienceRelation, shoppingAdsRetargetingType, shoppingAdsType, skipLearningPhase, smartAudienceEnabled, smartInterestBehaviorEnabled, spendingPower, statisticType, storeAuthorizedBcId, storeId, tiktokSubplacements, vboWindow, verticalSensitivityId, videoDownloadDisabled, viewAttributionWindow, zipcodeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupCreateBody {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    adgroupAppProfilePageState: ").append(toIndentedString(adgroupAppProfilePageState)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    appConfig: ").append(toIndentedString(appConfig)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    attributionEventCount: ").append(toIndentedString(attributionEventCount)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    audienceRule: ").append(toIndentedString(audienceRule)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    automatedKeywordsEnabled: ").append(toIndentedString(automatedKeywordsEnabled)).append("\n");
    sb.append("    bidDisplayMode: ").append(toIndentedString(bidDisplayMode)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    billingEvent: ").append(toIndentedString(billingEvent)).append("\n");
    sb.append("    blockedPangleAppIds: ").append(toIndentedString(blockedPangleAppIds)).append("\n");
    sb.append("    brandSafetyPartner: ").append(toIndentedString(brandSafetyPartner)).append("\n");
    sb.append("    brandSafetyType: ").append(toIndentedString(brandSafetyType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    carrierIds: ").append(toIndentedString(carrierIds)).append("\n");
    sb.append("    catalogAuthorizedBcId: ").append(toIndentedString(catalogAuthorizedBcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    categoryExclusionIds: ").append(toIndentedString(categoryExclusionIds)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    commentDisabled: ").append(toIndentedString(commentDisabled)).append("\n");
    sb.append("    contextualTagIds: ").append(toIndentedString(contextualTagIds)).append("\n");
    sb.append("    conversionBidPrice: ").append(toIndentedString(conversionBidPrice)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    customConversionId: ").append(toIndentedString(customConversionId)).append("\n");
    sb.append("    dayparting: ").append(toIndentedString(dayparting)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deepFunnelEventSource: ").append(toIndentedString(deepFunnelEventSource)).append("\n");
    sb.append("    deepFunnelEventSourceId: ").append(toIndentedString(deepFunnelEventSourceId)).append("\n");
    sb.append("    deepFunnelOptimizationEvent: ").append(toIndentedString(deepFunnelOptimizationEvent)).append("\n");
    sb.append("    deepFunnelOptimizationStatus: ").append(toIndentedString(deepFunnelOptimizationStatus)).append("\n");
    sb.append("    deviceModelIds: ").append(toIndentedString(deviceModelIds)).append("\n");
    sb.append("    devicePriceRanges: ").append(toIndentedString(devicePriceRanges)).append("\n");
    sb.append("    engagedViewAttributionWindow: ").append(toIndentedString(engagedViewAttributionWindow)).append("\n");
    sb.append("    excludedAudienceIds: ").append(toIndentedString(excludedAudienceIds)).append("\n");
    sb.append("    excludedCustomActions: ").append(toIndentedString(excludedCustomActions)).append("\n");
    sb.append("    excludedPangleAudiencePackageIds: ").append(toIndentedString(excludedPangleAudiencePackageIds)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencySchedule: ").append(toIndentedString(frequencySchedule)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    householdIncome: ").append(toIndentedString(householdIncome)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    includedCustomActions: ").append(toIndentedString(includedCustomActions)).append("\n");
    sb.append("    includedPangleAudiencePackageIds: ").append(toIndentedString(includedPangleAudiencePackageIds)).append("\n");
    sb.append("    interestCategoryIds: ").append(toIndentedString(interestCategoryIds)).append("\n");
    sb.append("    interestKeywordIds: ").append(toIndentedString(interestKeywordIds)).append("\n");
    sb.append("    ios14Targeting: ").append(toIndentedString(ios14Targeting)).append("\n");
    sb.append("    isHfss: ").append(toIndentedString(isHfss)).append("\n");
    sb.append("    isLhfCompliance: ").append(toIndentedString(isLhfCompliance)).append("\n");
    sb.append("    ispIds: ").append(toIndentedString(ispIds)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    messageEventSetId: ").append(toIndentedString(messageEventSetId)).append("\n");
    sb.append("    messagingAppAccountId: ").append(toIndentedString(messagingAppAccountId)).append("\n");
    sb.append("    messagingAppType: ").append(toIndentedString(messagingAppType)).append("\n");
    sb.append("    minAndroidVersion: ").append(toIndentedString(minAndroidVersion)).append("\n");
    sb.append("    minIosVersion: ").append(toIndentedString(minIosVersion)).append("\n");
    sb.append("    networkTypes: ").append(toIndentedString(networkTypes)).append("\n");
    sb.append("    nextDayRetention: ").append(toIndentedString(nextDayRetention)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    optimizationEvent: ").append(toIndentedString(optimizationEvent)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneRegionCallingCode: ").append(toIndentedString(phoneRegionCallingCode)).append("\n");
    sb.append("    phoneRegionCode: ").append(toIndentedString(phoneRegionCode)).append("\n");
    sb.append("    pixelId: ").append(toIndentedString(pixelId)).append("\n");
    sb.append("    placementType: ").append(toIndentedString(placementType)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    productSource: ").append(toIndentedString(productSource)).append("\n");
    sb.append("    promotionTargetType: ").append(toIndentedString(promotionTargetType)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    promotionWebsiteType: ").append(toIndentedString(promotionWebsiteType)).append("\n");
    sb.append("    purchaseIntentionKeywordIds: ").append(toIndentedString(purchaseIntentionKeywordIds)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    savedAudienceId: ").append(toIndentedString(savedAudienceId)).append("\n");
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
    sb.append("    searchResultEnabled: ").append(toIndentedString(searchResultEnabled)).append("\n");
    sb.append("    secondaryOptimizationEvent: ").append(toIndentedString(secondaryOptimizationEvent)).append("\n");
    sb.append("    shareDisabled: ").append(toIndentedString(shareDisabled)).append("\n");
    sb.append("    shoppingAdsRetargetingActionsDays: ").append(toIndentedString(shoppingAdsRetargetingActionsDays)).append("\n");
    sb.append("    shoppingAdsRetargetingCustomAudienceRelation: ").append(toIndentedString(shoppingAdsRetargetingCustomAudienceRelation)).append("\n");
    sb.append("    shoppingAdsRetargetingType: ").append(toIndentedString(shoppingAdsRetargetingType)).append("\n");
    sb.append("    shoppingAdsType: ").append(toIndentedString(shoppingAdsType)).append("\n");
    sb.append("    skipLearningPhase: ").append(toIndentedString(skipLearningPhase)).append("\n");
    sb.append("    smartAudienceEnabled: ").append(toIndentedString(smartAudienceEnabled)).append("\n");
    sb.append("    smartInterestBehaviorEnabled: ").append(toIndentedString(smartInterestBehaviorEnabled)).append("\n");
    sb.append("    spendingPower: ").append(toIndentedString(spendingPower)).append("\n");
    sb.append("    statisticType: ").append(toIndentedString(statisticType)).append("\n");
    sb.append("    storeAuthorizedBcId: ").append(toIndentedString(storeAuthorizedBcId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    tiktokSubplacements: ").append(toIndentedString(tiktokSubplacements)).append("\n");
    sb.append("    vboWindow: ").append(toIndentedString(vboWindow)).append("\n");
    sb.append("    verticalSensitivityId: ").append(toIndentedString(verticalSensitivityId)).append("\n");
    sb.append("    videoDownloadDisabled: ").append(toIndentedString(videoDownloadDisabled)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
    sb.append("    zipcodeIds: ").append(toIndentedString(zipcodeIds)).append("\n");
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
