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
import business_api_client.AdgroupcreateExcludedCustomActions;
import business_api_client.AdgroupcreateIncludedCustomActions;
import business_api_client.AdgroupupdateSearchKeywords;
import business_api_client.AdgroupupdateTargetingExpansion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * AdgroupUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdgroupUpdateBody {
  @JsonProperty("actions")
  private List<AdgroupcreateActions> actions = null;

  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("age_groups")
  private List<String> ageGroups = null;

  @JsonProperty("audience_ids")
  private List<String> audienceIds = null;

  @JsonProperty("audience_rule")
  private Object audienceRule = null;

  @JsonProperty("audience_type")
  private String audienceType = null;

  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled = null;

  @JsonProperty("automated_keywords_enabled")
  private Boolean automatedKeywordsEnabled = false;

  @JsonProperty("bid_price")
  private BigDecimal bidPrice = null;

  @JsonProperty("bid_type")
  private String bidType = null;

  @JsonProperty("blocked_pangle_app_ids")
  private List<String> blockedPangleAppIds = null;

  @JsonProperty("brand_safety_type")
  private String brandSafetyType = null;

  @JsonProperty("budget")
  private BigDecimal budget = null;

  @JsonProperty("carrier_ids")
  private List<String> carrierIds = null;

  @JsonProperty("catalog_authorized_bc_id")
  private String catalogAuthorizedBcId = null;

  @JsonProperty("category_exclusion_ids")
  private List<String> categoryExclusionIds = null;

  @JsonProperty("comment_disabled")
  private Boolean commentDisabled = null;

  @JsonProperty("contextual_tag_ids")
  private List<String> contextualTagIds = null;

  @JsonProperty("conversion_bid_price")
  private BigDecimal conversionBidPrice = null;

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

  @JsonProperty("exclude_age_under_eighteen")
  private Boolean excludeAgeUnderEighteen = false;

  @JsonProperty("excluded_audience_ids")
  private List<String> excludedAudienceIds = null;

  @JsonProperty("excluded_custom_actions")
  private List<AdgroupcreateExcludedCustomActions> excludedCustomActions = null;

  @JsonProperty("excluded_pangle_audience_package_ids")
  private List<String> excludedPangleAudiencePackageIds = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  @JsonProperty("frequency_schedule")
  private Integer frequencySchedule = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("household_income")
  private List<String> householdIncome = null;

  @JsonProperty("included_custom_actions")
  private List<AdgroupcreateIncludedCustomActions> includedCustomActions = null;

  @JsonProperty("included_pangle_audience_package_ids")
  private List<String> includedPangleAudiencePackageIds = null;

  @JsonProperty("interest_category_ids")
  private List<String> interestCategoryIds = null;

  @JsonProperty("interest_keyword_ids")
  private List<String> interestKeywordIds = null;

  @JsonProperty("ios14_targeting")
  private String ios14Targeting = null;

  @JsonProperty("is_hfss")
  private Boolean isHfss = null;

  @JsonProperty("is_lhf_compliance")
  private Boolean isLhfCompliance = null;

  @JsonProperty("isp_ids")
  private List<String> ispIds = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = null;

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

  @JsonProperty("pacing")
  private String pacing = null;

  @JsonProperty("purchase_intention_keyword_ids")
  private List<String> purchaseIntentionKeywordIds = null;

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
  private List<AdgroupupdateSearchKeywords> searchKeywords = null;

  @JsonProperty("search_result_enabled")
  private Boolean searchResultEnabled = null;

  @JsonProperty("secondary_optimization_event")
  private String secondaryOptimizationEvent = null;

  @JsonProperty("share_disabled")
  private Boolean shareDisabled = null;

  @JsonProperty("shopping_ads_retargeting_actions_days")
  private Integer shoppingAdsRetargetingActionsDays = null;

  @JsonProperty("shopping_ads_retargeting_custom_audience_relation")
  private String shoppingAdsRetargetingCustomAudienceRelation = null;

  @JsonProperty("shopping_ads_retargeting_type")
  private String shoppingAdsRetargetingType = null;

  @JsonProperty("smart_audience_enabled")
  private Boolean smartAudienceEnabled = null;

  @JsonProperty("smart_interest_behavior_enabled")
  private Boolean smartInterestBehaviorEnabled = null;

  @JsonProperty("spending_power")
  private String spendingPower = null;

  @JsonProperty("targeting_expansion")
  private AdgroupupdateTargetingExpansion targetingExpansion = null;

  @JsonProperty("vertical_sensitivity_id")
  private String verticalSensitivityId = null;

  @JsonProperty("zipcode_ids")
  private List<String> zipcodeIds = null;

  public AdgroupUpdateBody actions(List<AdgroupcreateActions> actions) {
    this.actions = actions;
    return this;
  }

  public AdgroupUpdateBody addActionsItem(AdgroupcreateActions actionsItem) {
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

  public AdgroupUpdateBody adgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @Schema(required = true, description = "")
  public String getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(String adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdgroupUpdateBody adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @Schema(description = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public AdgroupUpdateBody advertiserId(String advertiserId) {
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

  public AdgroupUpdateBody ageGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public AdgroupUpdateBody addAgeGroupsItem(String ageGroupsItem) {
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

  public AdgroupUpdateBody audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public AdgroupUpdateBody addAudienceIdsItem(String audienceIdsItem) {
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

  public AdgroupUpdateBody audienceRule(Object audienceRule) {
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

  public AdgroupUpdateBody audienceType(String audienceType) {
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

  public AdgroupUpdateBody autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

   /**
   * Get autoTargetingEnabled
   * @return autoTargetingEnabled
  **/
  @Schema(description = "")
  public Boolean isAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdgroupUpdateBody automatedKeywordsEnabled(Boolean automatedKeywordsEnabled) {
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

  public AdgroupUpdateBody bidPrice(BigDecimal bidPrice) {
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

  public AdgroupUpdateBody bidType(String bidType) {
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

  public AdgroupUpdateBody blockedPangleAppIds(List<String> blockedPangleAppIds) {
    this.blockedPangleAppIds = blockedPangleAppIds;
    return this;
  }

  public AdgroupUpdateBody addBlockedPangleAppIdsItem(String blockedPangleAppIdsItem) {
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

  public AdgroupUpdateBody brandSafetyType(String brandSafetyType) {
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

  public AdgroupUpdateBody budget(BigDecimal budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(description = "")
  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public AdgroupUpdateBody carrierIds(List<String> carrierIds) {
    this.carrierIds = carrierIds;
    return this;
  }

  public AdgroupUpdateBody addCarrierIdsItem(String carrierIdsItem) {
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

  public AdgroupUpdateBody catalogAuthorizedBcId(String catalogAuthorizedBcId) {
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

  public AdgroupUpdateBody categoryExclusionIds(List<String> categoryExclusionIds) {
    this.categoryExclusionIds = categoryExclusionIds;
    return this;
  }

  public AdgroupUpdateBody addCategoryExclusionIdsItem(String categoryExclusionIdsItem) {
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

  public AdgroupUpdateBody commentDisabled(Boolean commentDisabled) {
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

  public AdgroupUpdateBody contextualTagIds(List<String> contextualTagIds) {
    this.contextualTagIds = contextualTagIds;
    return this;
  }

  public AdgroupUpdateBody addContextualTagIdsItem(String contextualTagIdsItem) {
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

  public AdgroupUpdateBody conversionBidPrice(BigDecimal conversionBidPrice) {
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

  public AdgroupUpdateBody dayparting(String dayparting) {
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

  public AdgroupUpdateBody deepBidType(String deepBidType) {
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

  public AdgroupUpdateBody deepCpaBid(BigDecimal deepCpaBid) {
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

  public AdgroupUpdateBody deepFunnelEventSource(String deepFunnelEventSource) {
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

  public AdgroupUpdateBody deepFunnelEventSourceId(String deepFunnelEventSourceId) {
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

  public AdgroupUpdateBody deepFunnelOptimizationEvent(String deepFunnelOptimizationEvent) {
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

  public AdgroupUpdateBody deepFunnelOptimizationStatus(String deepFunnelOptimizationStatus) {
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

  public AdgroupUpdateBody deviceModelIds(List<String> deviceModelIds) {
    this.deviceModelIds = deviceModelIds;
    return this;
  }

  public AdgroupUpdateBody addDeviceModelIdsItem(String deviceModelIdsItem) {
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

  public AdgroupUpdateBody devicePriceRanges(List<Integer> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
    return this;
  }

  public AdgroupUpdateBody addDevicePriceRangesItem(Integer devicePriceRangesItem) {
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

  public AdgroupUpdateBody excludeAgeUnderEighteen(Boolean excludeAgeUnderEighteen) {
    this.excludeAgeUnderEighteen = excludeAgeUnderEighteen;
    return this;
  }

   /**
   * Get excludeAgeUnderEighteen
   * @return excludeAgeUnderEighteen
  **/
  @Schema(description = "")
  public Boolean isExcludeAgeUnderEighteen() {
    return excludeAgeUnderEighteen;
  }

  public void setExcludeAgeUnderEighteen(Boolean excludeAgeUnderEighteen) {
    this.excludeAgeUnderEighteen = excludeAgeUnderEighteen;
  }

  public AdgroupUpdateBody excludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
    return this;
  }

  public AdgroupUpdateBody addExcludedAudienceIdsItem(String excludedAudienceIdsItem) {
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

  public AdgroupUpdateBody excludedCustomActions(List<AdgroupcreateExcludedCustomActions> excludedCustomActions) {
    this.excludedCustomActions = excludedCustomActions;
    return this;
  }

  public AdgroupUpdateBody addExcludedCustomActionsItem(AdgroupcreateExcludedCustomActions excludedCustomActionsItem) {
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

  public AdgroupUpdateBody excludedPangleAudiencePackageIds(List<String> excludedPangleAudiencePackageIds) {
    this.excludedPangleAudiencePackageIds = excludedPangleAudiencePackageIds;
    return this;
  }

  public AdgroupUpdateBody addExcludedPangleAudiencePackageIdsItem(String excludedPangleAudiencePackageIdsItem) {
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

  public AdgroupUpdateBody frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public AdgroupUpdateBody frequencySchedule(Integer frequencySchedule) {
    this.frequencySchedule = frequencySchedule;
    return this;
  }

   /**
   * Get frequencySchedule
   * @return frequencySchedule
  **/
  @Schema(description = "")
  public Integer getFrequencySchedule() {
    return frequencySchedule;
  }

  public void setFrequencySchedule(Integer frequencySchedule) {
    this.frequencySchedule = frequencySchedule;
  }

  public AdgroupUpdateBody gender(String gender) {
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

  public AdgroupUpdateBody householdIncome(List<String> householdIncome) {
    this.householdIncome = householdIncome;
    return this;
  }

  public AdgroupUpdateBody addHouseholdIncomeItem(String householdIncomeItem) {
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

  public AdgroupUpdateBody includedCustomActions(List<AdgroupcreateIncludedCustomActions> includedCustomActions) {
    this.includedCustomActions = includedCustomActions;
    return this;
  }

  public AdgroupUpdateBody addIncludedCustomActionsItem(AdgroupcreateIncludedCustomActions includedCustomActionsItem) {
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

  public AdgroupUpdateBody includedPangleAudiencePackageIds(List<String> includedPangleAudiencePackageIds) {
    this.includedPangleAudiencePackageIds = includedPangleAudiencePackageIds;
    return this;
  }

  public AdgroupUpdateBody addIncludedPangleAudiencePackageIdsItem(String includedPangleAudiencePackageIdsItem) {
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

  public AdgroupUpdateBody interestCategoryIds(List<String> interestCategoryIds) {
    this.interestCategoryIds = interestCategoryIds;
    return this;
  }

  public AdgroupUpdateBody addInterestCategoryIdsItem(String interestCategoryIdsItem) {
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

  public AdgroupUpdateBody interestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
    return this;
  }

  public AdgroupUpdateBody addInterestKeywordIdsItem(String interestKeywordIdsItem) {
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

  public AdgroupUpdateBody ios14Targeting(String ios14Targeting) {
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

  public AdgroupUpdateBody isHfss(Boolean isHfss) {
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

  public AdgroupUpdateBody isLhfCompliance(Boolean isLhfCompliance) {
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

  public AdgroupUpdateBody ispIds(List<String> ispIds) {
    this.ispIds = ispIds;
    return this;
  }

  public AdgroupUpdateBody addIspIdsItem(String ispIdsItem) {
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

  public AdgroupUpdateBody languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public AdgroupUpdateBody addLanguagesItem(String languagesItem) {
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

  public AdgroupUpdateBody locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public AdgroupUpdateBody addLocationIdsItem(String locationIdsItem) {
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

  public AdgroupUpdateBody minAndroidVersion(String minAndroidVersion) {
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

  public AdgroupUpdateBody minIosVersion(String minIosVersion) {
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

  public AdgroupUpdateBody networkTypes(List<String> networkTypes) {
    this.networkTypes = networkTypes;
    return this;
  }

  public AdgroupUpdateBody addNetworkTypesItem(String networkTypesItem) {
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

  public AdgroupUpdateBody nextDayRetention(BigDecimal nextDayRetention) {
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

  public AdgroupUpdateBody operatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  public AdgroupUpdateBody addOperatingSystemsItem(String operatingSystemsItem) {
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

  public AdgroupUpdateBody pacing(String pacing) {
    this.pacing = pacing;
    return this;
  }

   /**
   * Get pacing
   * @return pacing
  **/
  @Schema(description = "")
  public String getPacing() {
    return pacing;
  }

  public void setPacing(String pacing) {
    this.pacing = pacing;
  }

  public AdgroupUpdateBody purchaseIntentionKeywordIds(List<String> purchaseIntentionKeywordIds) {
    this.purchaseIntentionKeywordIds = purchaseIntentionKeywordIds;
    return this;
  }

  public AdgroupUpdateBody addPurchaseIntentionKeywordIdsItem(String purchaseIntentionKeywordIdsItem) {
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

  public AdgroupUpdateBody roasBid(BigDecimal roasBid) {
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

  public AdgroupUpdateBody savedAudienceId(String savedAudienceId) {
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

  public AdgroupUpdateBody scheduleEndTime(String scheduleEndTime) {
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

  public AdgroupUpdateBody scheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
    return this;
  }

   /**
   * Get scheduleStartTime
   * @return scheduleStartTime
  **/
  @Schema(description = "")
  public String getScheduleStartTime() {
    return scheduleStartTime;
  }

  public void setScheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
  }

  public AdgroupUpdateBody scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @Schema(description = "")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public AdgroupUpdateBody searchKeywords(List<AdgroupupdateSearchKeywords> searchKeywords) {
    this.searchKeywords = searchKeywords;
    return this;
  }

  public AdgroupUpdateBody addSearchKeywordsItem(AdgroupupdateSearchKeywords searchKeywordsItem) {
    if (this.searchKeywords == null) {
      this.searchKeywords = new ArrayList<AdgroupupdateSearchKeywords>();
    }
    this.searchKeywords.add(searchKeywordsItem);
    return this;
  }

   /**
   * Get searchKeywords
   * @return searchKeywords
  **/
  @Schema(description = "")
  public List<AdgroupupdateSearchKeywords> getSearchKeywords() {
    return searchKeywords;
  }

  public void setSearchKeywords(List<AdgroupupdateSearchKeywords> searchKeywords) {
    this.searchKeywords = searchKeywords;
  }

  public AdgroupUpdateBody searchResultEnabled(Boolean searchResultEnabled) {
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

  public AdgroupUpdateBody secondaryOptimizationEvent(String secondaryOptimizationEvent) {
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

  public AdgroupUpdateBody shareDisabled(Boolean shareDisabled) {
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

  public AdgroupUpdateBody shoppingAdsRetargetingActionsDays(Integer shoppingAdsRetargetingActionsDays) {
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

  public AdgroupUpdateBody shoppingAdsRetargetingCustomAudienceRelation(String shoppingAdsRetargetingCustomAudienceRelation) {
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

  public AdgroupUpdateBody shoppingAdsRetargetingType(String shoppingAdsRetargetingType) {
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

  public AdgroupUpdateBody smartAudienceEnabled(Boolean smartAudienceEnabled) {
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

  public AdgroupUpdateBody smartInterestBehaviorEnabled(Boolean smartInterestBehaviorEnabled) {
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

  public AdgroupUpdateBody spendingPower(String spendingPower) {
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

  public AdgroupUpdateBody targetingExpansion(AdgroupupdateTargetingExpansion targetingExpansion) {
    this.targetingExpansion = targetingExpansion;
    return this;
  }

   /**
   * Get targetingExpansion
   * @return targetingExpansion
  **/
  @Schema(description = "")
  public AdgroupupdateTargetingExpansion getTargetingExpansion() {
    return targetingExpansion;
  }

  public void setTargetingExpansion(AdgroupupdateTargetingExpansion targetingExpansion) {
    this.targetingExpansion = targetingExpansion;
  }

  public AdgroupUpdateBody verticalSensitivityId(String verticalSensitivityId) {
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

  public AdgroupUpdateBody zipcodeIds(List<String> zipcodeIds) {
    this.zipcodeIds = zipcodeIds;
    return this;
  }

  public AdgroupUpdateBody addZipcodeIdsItem(String zipcodeIdsItem) {
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
    AdgroupUpdateBody adgroupUpdateBody = (AdgroupUpdateBody) o;
    return Objects.equals(this.actions, adgroupUpdateBody.actions) &&
        Objects.equals(this.adgroupId, adgroupUpdateBody.adgroupId) &&
        Objects.equals(this.adgroupName, adgroupUpdateBody.adgroupName) &&
        Objects.equals(this.advertiserId, adgroupUpdateBody.advertiserId) &&
        Objects.equals(this.ageGroups, adgroupUpdateBody.ageGroups) &&
        Objects.equals(this.audienceIds, adgroupUpdateBody.audienceIds) &&
        Objects.equals(this.audienceRule, adgroupUpdateBody.audienceRule) &&
        Objects.equals(this.audienceType, adgroupUpdateBody.audienceType) &&
        Objects.equals(this.autoTargetingEnabled, adgroupUpdateBody.autoTargetingEnabled) &&
        Objects.equals(this.automatedKeywordsEnabled, adgroupUpdateBody.automatedKeywordsEnabled) &&
        Objects.equals(this.bidPrice, adgroupUpdateBody.bidPrice) &&
        Objects.equals(this.bidType, adgroupUpdateBody.bidType) &&
        Objects.equals(this.blockedPangleAppIds, adgroupUpdateBody.blockedPangleAppIds) &&
        Objects.equals(this.brandSafetyType, adgroupUpdateBody.brandSafetyType) &&
        Objects.equals(this.budget, adgroupUpdateBody.budget) &&
        Objects.equals(this.carrierIds, adgroupUpdateBody.carrierIds) &&
        Objects.equals(this.catalogAuthorizedBcId, adgroupUpdateBody.catalogAuthorizedBcId) &&
        Objects.equals(this.categoryExclusionIds, adgroupUpdateBody.categoryExclusionIds) &&
        Objects.equals(this.commentDisabled, adgroupUpdateBody.commentDisabled) &&
        Objects.equals(this.contextualTagIds, adgroupUpdateBody.contextualTagIds) &&
        Objects.equals(this.conversionBidPrice, adgroupUpdateBody.conversionBidPrice) &&
        Objects.equals(this.dayparting, adgroupUpdateBody.dayparting) &&
        Objects.equals(this.deepBidType, adgroupUpdateBody.deepBidType) &&
        Objects.equals(this.deepCpaBid, adgroupUpdateBody.deepCpaBid) &&
        Objects.equals(this.deepFunnelEventSource, adgroupUpdateBody.deepFunnelEventSource) &&
        Objects.equals(this.deepFunnelEventSourceId, adgroupUpdateBody.deepFunnelEventSourceId) &&
        Objects.equals(this.deepFunnelOptimizationEvent, adgroupUpdateBody.deepFunnelOptimizationEvent) &&
        Objects.equals(this.deepFunnelOptimizationStatus, adgroupUpdateBody.deepFunnelOptimizationStatus) &&
        Objects.equals(this.deviceModelIds, adgroupUpdateBody.deviceModelIds) &&
        Objects.equals(this.devicePriceRanges, adgroupUpdateBody.devicePriceRanges) &&
        Objects.equals(this.excludeAgeUnderEighteen, adgroupUpdateBody.excludeAgeUnderEighteen) &&
        Objects.equals(this.excludedAudienceIds, adgroupUpdateBody.excludedAudienceIds) &&
        Objects.equals(this.excludedCustomActions, adgroupUpdateBody.excludedCustomActions) &&
        Objects.equals(this.excludedPangleAudiencePackageIds, adgroupUpdateBody.excludedPangleAudiencePackageIds) &&
        Objects.equals(this.frequency, adgroupUpdateBody.frequency) &&
        Objects.equals(this.frequencySchedule, adgroupUpdateBody.frequencySchedule) &&
        Objects.equals(this.gender, adgroupUpdateBody.gender) &&
        Objects.equals(this.householdIncome, adgroupUpdateBody.householdIncome) &&
        Objects.equals(this.includedCustomActions, adgroupUpdateBody.includedCustomActions) &&
        Objects.equals(this.includedPangleAudiencePackageIds, adgroupUpdateBody.includedPangleAudiencePackageIds) &&
        Objects.equals(this.interestCategoryIds, adgroupUpdateBody.interestCategoryIds) &&
        Objects.equals(this.interestKeywordIds, adgroupUpdateBody.interestKeywordIds) &&
        Objects.equals(this.ios14Targeting, adgroupUpdateBody.ios14Targeting) &&
        Objects.equals(this.isHfss, adgroupUpdateBody.isHfss) &&
        Objects.equals(this.isLhfCompliance, adgroupUpdateBody.isLhfCompliance) &&
        Objects.equals(this.ispIds, adgroupUpdateBody.ispIds) &&
        Objects.equals(this.languages, adgroupUpdateBody.languages) &&
        Objects.equals(this.locationIds, adgroupUpdateBody.locationIds) &&
        Objects.equals(this.minAndroidVersion, adgroupUpdateBody.minAndroidVersion) &&
        Objects.equals(this.minIosVersion, adgroupUpdateBody.minIosVersion) &&
        Objects.equals(this.networkTypes, adgroupUpdateBody.networkTypes) &&
        Objects.equals(this.nextDayRetention, adgroupUpdateBody.nextDayRetention) &&
        Objects.equals(this.operatingSystems, adgroupUpdateBody.operatingSystems) &&
        Objects.equals(this.pacing, adgroupUpdateBody.pacing) &&
        Objects.equals(this.purchaseIntentionKeywordIds, adgroupUpdateBody.purchaseIntentionKeywordIds) &&
        Objects.equals(this.roasBid, adgroupUpdateBody.roasBid) &&
        Objects.equals(this.savedAudienceId, adgroupUpdateBody.savedAudienceId) &&
        Objects.equals(this.scheduleEndTime, adgroupUpdateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, adgroupUpdateBody.scheduleStartTime) &&
        Objects.equals(this.scheduleType, adgroupUpdateBody.scheduleType) &&
        Objects.equals(this.searchKeywords, adgroupUpdateBody.searchKeywords) &&
        Objects.equals(this.searchResultEnabled, adgroupUpdateBody.searchResultEnabled) &&
        Objects.equals(this.secondaryOptimizationEvent, adgroupUpdateBody.secondaryOptimizationEvent) &&
        Objects.equals(this.shareDisabled, adgroupUpdateBody.shareDisabled) &&
        Objects.equals(this.shoppingAdsRetargetingActionsDays, adgroupUpdateBody.shoppingAdsRetargetingActionsDays) &&
        Objects.equals(this.shoppingAdsRetargetingCustomAudienceRelation, adgroupUpdateBody.shoppingAdsRetargetingCustomAudienceRelation) &&
        Objects.equals(this.shoppingAdsRetargetingType, adgroupUpdateBody.shoppingAdsRetargetingType) &&
        Objects.equals(this.smartAudienceEnabled, adgroupUpdateBody.smartAudienceEnabled) &&
        Objects.equals(this.smartInterestBehaviorEnabled, adgroupUpdateBody.smartInterestBehaviorEnabled) &&
        Objects.equals(this.spendingPower, adgroupUpdateBody.spendingPower) &&
        Objects.equals(this.targetingExpansion, adgroupUpdateBody.targetingExpansion) &&
        Objects.equals(this.verticalSensitivityId, adgroupUpdateBody.verticalSensitivityId) &&
        Objects.equals(this.zipcodeIds, adgroupUpdateBody.zipcodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, adgroupId, adgroupName, advertiserId, ageGroups, audienceIds, audienceRule, audienceType, autoTargetingEnabled, automatedKeywordsEnabled, bidPrice, bidType, blockedPangleAppIds, brandSafetyType, budget, carrierIds, catalogAuthorizedBcId, categoryExclusionIds, commentDisabled, contextualTagIds, conversionBidPrice, dayparting, deepBidType, deepCpaBid, deepFunnelEventSource, deepFunnelEventSourceId, deepFunnelOptimizationEvent, deepFunnelOptimizationStatus, deviceModelIds, devicePriceRanges, excludeAgeUnderEighteen, excludedAudienceIds, excludedCustomActions, excludedPangleAudiencePackageIds, frequency, frequencySchedule, gender, householdIncome, includedCustomActions, includedPangleAudiencePackageIds, interestCategoryIds, interestKeywordIds, ios14Targeting, isHfss, isLhfCompliance, ispIds, languages, locationIds, minAndroidVersion, minIosVersion, networkTypes, nextDayRetention, operatingSystems, pacing, purchaseIntentionKeywordIds, roasBid, savedAudienceId, scheduleEndTime, scheduleStartTime, scheduleType, searchKeywords, searchResultEnabled, secondaryOptimizationEvent, shareDisabled, shoppingAdsRetargetingActionsDays, shoppingAdsRetargetingCustomAudienceRelation, shoppingAdsRetargetingType, smartAudienceEnabled, smartInterestBehaviorEnabled, spendingPower, targetingExpansion, verticalSensitivityId, zipcodeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupUpdateBody {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    audienceRule: ").append(toIndentedString(audienceRule)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    automatedKeywordsEnabled: ").append(toIndentedString(automatedKeywordsEnabled)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    blockedPangleAppIds: ").append(toIndentedString(blockedPangleAppIds)).append("\n");
    sb.append("    brandSafetyType: ").append(toIndentedString(brandSafetyType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    carrierIds: ").append(toIndentedString(carrierIds)).append("\n");
    sb.append("    catalogAuthorizedBcId: ").append(toIndentedString(catalogAuthorizedBcId)).append("\n");
    sb.append("    categoryExclusionIds: ").append(toIndentedString(categoryExclusionIds)).append("\n");
    sb.append("    commentDisabled: ").append(toIndentedString(commentDisabled)).append("\n");
    sb.append("    contextualTagIds: ").append(toIndentedString(contextualTagIds)).append("\n");
    sb.append("    conversionBidPrice: ").append(toIndentedString(conversionBidPrice)).append("\n");
    sb.append("    dayparting: ").append(toIndentedString(dayparting)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deepFunnelEventSource: ").append(toIndentedString(deepFunnelEventSource)).append("\n");
    sb.append("    deepFunnelEventSourceId: ").append(toIndentedString(deepFunnelEventSourceId)).append("\n");
    sb.append("    deepFunnelOptimizationEvent: ").append(toIndentedString(deepFunnelOptimizationEvent)).append("\n");
    sb.append("    deepFunnelOptimizationStatus: ").append(toIndentedString(deepFunnelOptimizationStatus)).append("\n");
    sb.append("    deviceModelIds: ").append(toIndentedString(deviceModelIds)).append("\n");
    sb.append("    devicePriceRanges: ").append(toIndentedString(devicePriceRanges)).append("\n");
    sb.append("    excludeAgeUnderEighteen: ").append(toIndentedString(excludeAgeUnderEighteen)).append("\n");
    sb.append("    excludedAudienceIds: ").append(toIndentedString(excludedAudienceIds)).append("\n");
    sb.append("    excludedCustomActions: ").append(toIndentedString(excludedCustomActions)).append("\n");
    sb.append("    excludedPangleAudiencePackageIds: ").append(toIndentedString(excludedPangleAudiencePackageIds)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencySchedule: ").append(toIndentedString(frequencySchedule)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    householdIncome: ").append(toIndentedString(householdIncome)).append("\n");
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
    sb.append("    minAndroidVersion: ").append(toIndentedString(minAndroidVersion)).append("\n");
    sb.append("    minIosVersion: ").append(toIndentedString(minIosVersion)).append("\n");
    sb.append("    networkTypes: ").append(toIndentedString(networkTypes)).append("\n");
    sb.append("    nextDayRetention: ").append(toIndentedString(nextDayRetention)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
    sb.append("    purchaseIntentionKeywordIds: ").append(toIndentedString(purchaseIntentionKeywordIds)).append("\n");
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
    sb.append("    smartAudienceEnabled: ").append(toIndentedString(smartAudienceEnabled)).append("\n");
    sb.append("    smartInterestBehaviorEnabled: ").append(toIndentedString(smartInterestBehaviorEnabled)).append("\n");
    sb.append("    spendingPower: ").append(toIndentedString(spendingPower)).append("\n");
    sb.append("    targetingExpansion: ").append(toIndentedString(targetingExpansion)).append("\n");
    sb.append("    verticalSensitivityId: ").append(toIndentedString(verticalSensitivityId)).append("\n");
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
