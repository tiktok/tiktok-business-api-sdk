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
import business_api_client.AdgroupcreateAudienceRule;
import business_api_client.AdgroupcreateExcludedCustomActions;
import business_api_client.AdgroupcreateIncludedCustomActions;
import business_api_client.AdgroupcreateTargetingExpansion;
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

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
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

  @JsonProperty("app_download_url")
  private String appDownloadUrl = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("audience_ids")
  private List<String> audienceIds = null;

  @JsonProperty("audience_rule")
  private AdgroupcreateAudienceRule audienceRule = null;

  @JsonProperty("audience_type")
  private String audienceType = null;

  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled = null;

  @JsonProperty("bid_price")
  private BigDecimal bidPrice = null;

  @JsonProperty("bid_type")
  private String bidType = null;

  @JsonProperty("billing_event")
  private String billingEvent = null;

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

  @JsonProperty("comment_disabled")
  private String commentDisabled = null;

  @JsonProperty("contextual_tag_ids")
  private List<String> contextualTagIds = null;

  @JsonProperty("conversion_bid_price")
  private BigDecimal conversionBidPrice = null;

  @JsonProperty("conversion_id")
  private Integer conversionId = null;

  @JsonProperty("creative_material_mode")
  private String creativeMaterialMode = null;

  @JsonProperty("dayparting")
  private String dayparting = null;

  @JsonProperty("deep_bid_type")
  private String deepBidType = null;

  @JsonProperty("deep_cpa_bid")
  private BigDecimal deepCpaBid = null;

  @JsonProperty("device_model_ids")
  private List<String> deviceModelIds = null;

  @JsonProperty("device_price_ranges")
  private List<Integer> devicePriceRanges = null;

  @JsonProperty("excluded_audience_ids")
  private List<String> excludedAudienceIds = null;

  @JsonProperty("excluded_custom_actions")
  private AdgroupcreateExcludedCustomActions excludedCustomActions = null;

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

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("included_custom_actions")
  private AdgroupcreateIncludedCustomActions includedCustomActions = null;

  @JsonProperty("included_pangle_audience_package_ids")
  private List<String> includedPangleAudiencePackageIds = null;

  @JsonProperty("interest_category_ids")
  private List<String> interestCategoryIds = null;

  @JsonProperty("interest_keyword_ids")
  private List<String> interestKeywordIds = null;

  @JsonProperty("interest_keywords")
  private List<String> interestKeywords = null;

  @JsonProperty("ios14_targeting")
  private String ios14Targeting = null;

  @JsonProperty("is_hfss")
  private Boolean isHfss = null;

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

  @JsonProperty("schedule_end_time")
  private String scheduleEndTime = null;

  @JsonProperty("schedule_start_time")
  private String scheduleStartTime = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  @JsonProperty("secondary_optimization_event")
  private String secondaryOptimizationEvent = null;

  @JsonProperty("shopping_ads_retargeting_actions_days")
  private Integer shoppingAdsRetargetingActionsDays = null;

  @JsonProperty("shopping_ads_retargeting_type")
  private String shoppingAdsRetargetingType = null;

  @JsonProperty("spending_power")
  private String spendingPower = null;

  @JsonProperty("targeting_expansion")
  private AdgroupcreateTargetingExpansion targetingExpansion = null;

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
   * A list of action category objects.
   * @return actions
  **/
  @Schema(description = "A list of action category objects.")
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

  public AdgroupUpdateBody adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Ad group name. Character limit is 512 and cannot contain emoji.
   * @return adgroupName
  **/
  @Schema(description = "Ad group name. Character limit is 512 and cannot contain emoji.")
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
   * Age groups you want to target. For enum values, see [Enumeration - Targeting Age Group](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return ageGroups
  **/
  @Schema(description = "Age groups you want to target. For enum values, see [Enumeration - Targeting Age Group](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public List<String> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<String> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public AdgroupUpdateBody appDownloadUrl(String appDownloadUrl) {
    this.appDownloadUrl = appDownloadUrl;
    return this;
  }

   /**
   * App download link
   * @return appDownloadUrl
  **/
  @Schema(description = "App download link")
  public String getAppDownloadUrl() {
    return appDownloadUrl;
  }

  public void setAppDownloadUrl(String appDownloadUrl) {
    this.appDownloadUrl = appDownloadUrl;
  }

  public AdgroupUpdateBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The Application id of the promoted app. You can get &#x60;app_id&#x60; by using the [/app/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786) endpoint. Required in the following use cases- When &#x60;objective_type&#x60; is &#x60;APP_INSTALL&#x60;.When &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60; and &#x60;app_promotion_type&#x60; is &#x60;APP_RETARGETING&#x60; (App retargeting).When &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60; , &#x60;app_promotion_type&#x60; is &#x60;APP_INSTALL&#x60;(App install), and it is not an iOS14 Dedicated Campaign.When &#x60;objective_type&#x60; is &#x60;CONVERSIONS&#x60; and &#x60;promotion_type&#x60; is &#x60;APP_ANDROID&#x60; or &#x60;APP_IOS&#x60;
   * @return appId
  **/
  @Schema(description = "The Application id of the promoted app. You can get `app_id` by using the [/app/list/](https://ads.tiktok.com/marketing_api/docs?id=1740859313270786) endpoint. Required in the following use cases- When `objective_type` is `APP_INSTALL`.When `objective_type` is `APP_PROMOTION` and `app_promotion_type` is `APP_RETARGETING` (App retargeting).When `objective_type` is `APP_PROMOTION` , `app_promotion_type` is `APP_INSTALL`(App install), and it is not an iOS14 Dedicated Campaign.When `objective_type` is `CONVERSIONS` and `promotion_type` is `APP_ANDROID` or `APP_IOS`")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
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
   * List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
   * @return audienceIds
  **/
  @Schema(description = "List of audience IDs. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public AdgroupUpdateBody audienceRule(AdgroupcreateAudienceRule audienceRule) {
    this.audienceRule = audienceRule;
    return this;
  }

   /**
   * Get audienceRule
   * @return audienceRule
  **/
  @Schema(description = "")
  public AdgroupcreateAudienceRule getAudienceRule() {
    return audienceRule;
  }

  public void setAudienceRule(AdgroupcreateAudienceRule audienceRule) {
    this.audienceRule = audienceRule;
  }

  public AdgroupUpdateBody audienceType(String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

   /**
   * App retargeting audience type, required when objective_type is &#x60;CONVERSIONS&#x60; and externla_type is app-related. Currently, the only supported enumeration is &#x60;NEW_CUSTOM_AUDIENCE&#x60;; for this type, you must pass audience IDs to the &#x60;audience_ids&#x60; field when creating or updating the ad group. The audiences to be used must be either Custom File Audience or App Activity Audience. Optionally, you can specify the &#x60;excluded_audience_ids&#x60; field. If both &#x60;audience_ids&#x60; and &#x60;excluded_audience_ids&#x60; are specified, they cannot contain the same IDs
   * @return audienceType
  **/
  @Schema(description = "App retargeting audience type, required when objective_type is `CONVERSIONS` and externla_type is app-related. Currently, the only supported enumeration is `NEW_CUSTOM_AUDIENCE`; for this type, you must pass audience IDs to the `audience_ids` field when creating or updating the ad group. The audiences to be used must be either Custom File Audience or App Activity Audience. Optionally, you can specify the `excluded_audience_ids` field. If both `audience_ids` and `excluded_audience_ids` are specified, they cannot contain the same IDs")
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
   * Whether to enable automated targeting.
   * @return autoTargetingEnabled
  **/
  @Schema(description = "Whether to enable automated targeting.")
  public Boolean isAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public AdgroupUpdateBody bidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * The maximum cost per result you are willing to bid (for Bid Cap bidding strategy), or an average cost per result that you want to achieve (for Cost Cap bidding strategy). When Campaign Budget Optimization (&#x60;budget_optimize_on&#x60;) is on, we suggest that you set the same bid value for all ad groups in the campaign. Note- To specify &#x60;bid_price&#x60;, you need to set &#x60;bid_type&#x60; as &#x60;BID_TYPE_CUSTOM&#x60;.&#x60;bid_price&#x60; needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1745292444424193) to learn more about the bid verification mechanism.
   * @return bidPrice
  **/
  @Schema(description = "The maximum cost per result you are willing to bid (for Bid Cap bidding strategy), or an average cost per result that you want to achieve (for Cost Cap bidding strategy). When Campaign Budget Optimization (`budget_optimize_on`) is on, we suggest that you set the same bid value for all ad groups in the campaign. Note- To specify `bid_price`, you need to set `bid_type` as `BID_TYPE_CUSTOM`.`bid_price` needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id=1745292444424193) to learn more about the bid verification mechanism.")
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
   * Bidding strategy that determines how the system manages your cost per result, spends your budget, and how it delivers ads. Required when Campaign Budget Optimization (CBO) is enabled (&#x60;budget_optimize_on&#x60; &#x3D; &#x60;TRUE&#x60;). For enum values, see [Enumeration - Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return bidType
  **/
  @Schema(description = "Bidding strategy that determines how the system manages your cost per result, spends your budget, and how it delivers ads. Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`). For enum values, see [Enumeration - Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public String getBidType() {
    return bidType;
  }

  public void setBidType(String bidType) {
    this.bidType = bidType;
  }

  public AdgroupUpdateBody billingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

   /**
   * Events that you want to pay for. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).|
   * @return billingEvent
  **/
  @Schema(description = "Events that you want to pay for. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).|")
  public String getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
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
   * Pangle app block list ID. You can get an ID via the &#x60;app_package_id&#x60; field returned by [Get Pangle block list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740039957181441). It only takes effect when Pangle placement is selected.
   * @return blockedPangleAppIds
  **/
  @Schema(description = "Pangle app block list ID. You can get an ID via the `app_package_id` field returned by [Get Pangle block list](https://ads.tiktok.com/marketing_api/docs?id=1740039957181441). It only takes effect when Pangle placement is selected.")
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
   * Valid only when &#x60;placements&#x60; is set as &#x60;PLACEMENT_TIKTOK&#x60;. Default value- &#x60;NO_BRAND_SAFETY&#x60;. Enum values- &#x60;NO_BRAND_SAFETY&#x60;-  To not use any brand safety solution.  Full inventory, which means your ads may appear next to some content featuring mature themes. &#x60;STANDARD_INVENTORY&#x60;- Use TikTok&#x27;s brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. &#x60;LIMITED_INVENTORY&#x60;- Use TikTok&#x27;s brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes.&#x60;THIRD_PARTY&#x60;- Use a third-party brand safety solution. You also need to pass in a value to the &#x60;brand_safety_partner&#x60; field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the [/tool/region/] function. Note -   Pre-bid first-party Brand Safety solutions for &#x60;APP_PROMOTION&#x60;, &#x60;APP_INSTALL&#x60;, &#x60;WEB_CONVERSIONS&#x60;, &#x60;CONVERSIONS&#x60;, &#x60;TRAFFIC&#x60;,  &#x60;LEAD_GENERATION&#x60; objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  Pre-bid third-party Brand Safety solutions are not supported for TikTok Pulse campaigns (&#x60;rf_campaign_type&#x60; &#x3D;&#x60;PULSE&#x60;).  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of pre-bid Brand Safety filtering.  Once set, this field cannot be modified.
   * @return brandSafetyType
  **/
  @Schema(description = "Valid only when `placements` is set as `PLACEMENT_TIKTOK`. Default value- `NO_BRAND_SAFETY`. Enum values- `NO_BRAND_SAFETY`-  To not use any brand safety solution.  Full inventory, which means your ads may appear next to some content featuring mature themes. `STANDARD_INVENTORY`- Use TikTok's brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. `LIMITED_INVENTORY`- Use TikTok's brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes.`THIRD_PARTY`- Use a third-party brand safety solution. You also need to pass in a value to the `brand_safety_partner` field. To get the countries and regions that your ads can be deployed to based on your brand safety settings, use the [/tool/region/] function. Note -   Pre-bid first-party Brand Safety solutions for `APP_PROMOTION`, `APP_INSTALL`, `WEB_CONVERSIONS`, `CONVERSIONS`, `TRAFFIC`,  `LEAD_GENERATION` objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative.  Pre-bid third-party Brand Safety solutions are not supported for TikTok Pulse campaigns (`rf_campaign_type` =`PULSE`).  See [Brand safety](https://ads.tiktok.com/marketing_api/docs?id=1739381752981505) to learn about the supported advertising objectives, supported markets, and the general introduction of pre-bid Brand Safety filtering.  Once set, this field cannot be modified.")
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
   * Ad group budget. The setting will be ignored when Campaign Budget Optimization (&#x60;budget_optimize_on&#x60; &#x3D; &#x60;TRUE&#x60;) is enabled. For how to configure budget settings, see [Budget](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739381246298114). To directly see the daily budget value range for a currency, see [Currency-Daily budget value range](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585839634433).
   * @return budget
  **/
  @Schema(description = "Ad group budget. The setting will be ignored when Campaign Budget Optimization (`budget_optimize_on` = `TRUE`) is enabled. For how to configure budget settings, see [Budget](https://ads.tiktok.com/marketing_api/docs?id=1739381246298114). To directly see the daily budget value range for a currency, see [Currency-Daily budget value range](https://ads.tiktok.com/marketing_api/docs?id=1737585839634433).")
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
   * Carriers that you want to target. A carrier is valid only when the &#x60;in_use&#x60; field for the carrier is &#x60;true&#x60;. The carriers must be consistent with the location(s) that you want to target. Use [/tool/carrier/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737168013095938) endpoint to get the enum values.
   * @return carrierIds
  **/
  @Schema(description = "Carriers that you want to target. A carrier is valid only when the `in_use` field for the carrier is `true`. The carriers must be consistent with the location(s) that you want to target. Use [/tool/carrier/](https://ads.tiktok.com/marketing_api/docs?id=1737168013095938) endpoint to get the enum values.")
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
   * For catalogs in Business Center, you must specify the ID of the Business Center that a catalog belongs to.
   * @return catalogAuthorizedBcId
  **/
  @Schema(description = "For catalogs in Business Center, you must specify the ID of the Business Center that a catalog belongs to.")
  public String getCatalogAuthorizedBcId() {
    return catalogAuthorizedBcId;
  }

  public void setCatalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
  }

  public AdgroupUpdateBody commentDisabled(String commentDisabled) {
    this.commentDisabled = commentDisabled;
    return this;
  }

   /**
   * Whether to allow comments on your ads on TikTok.
   * @return commentDisabled
  **/
  @Schema(description = "Whether to allow comments on your ads on TikTok.")
  public String getCommentDisabled() {
    return commentDisabled;
  }

  public void setCommentDisabled(String commentDisabled) {
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
   * Contextual tag IDs. You can use [/tool/contextual_tag/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747118654465) to get available contextual tags.  See [Contextual targeting](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1745292519923713)  to learn more about how to use contextual targeting.&lt;p&gt;&lt;span style&#x3D;\&quot;color-darkred\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;&lt;/span&gt;- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative.Only supports &#x60;REACH&#x60; and &#x60;VIDEO_VIEWS&#x60; as objectives (&#x60;objective_type&#x60;) at the campaign level. Not supported when &#x60;brand_safety_type&#x60; is set to &#x60;THIRD_PARTY&#x60;.
   * @return contextualTagIds
  **/
  @Schema(description = "Contextual tag IDs. You can use [/tool/contextual_tag/get/](https://ads.tiktok.com/marketing_api/docs?id=1747747118654465) to get available contextual tags.  See [Contextual targeting](https://ads.tiktok.com/marketing_api/docs?id=1745292519923713)  to learn more about how to use contextual targeting.<p><span style=\"color-darkred\"><b>Note</b></span>- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative.Only supports `REACH` and `VIDEO_VIEWS` as objectives (`objective_type`) at the campaign level. Not supported when `brand_safety_type` is set to `THIRD_PARTY`.")
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
   * Where you can set a target cost per conversion for oCPM(Optimized Cost per Mille); Required when &#x60;billing_event&#x60; &#x3D; &#x60;OCPM&#x60; and &#x60;bid_type&#x60; &#x3D; &#x60;BID_TYPE_CUSTOM&#x60;.&#x60;conversion_bid_price&#x60; needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1745292444424193) to learn more about the bid verification mechanism.
   * @return conversionBidPrice
  **/
  @Schema(description = "Where you can set a target cost per conversion for oCPM(Optimized Cost per Mille); Required when `billing_event` = `OCPM` and `bid_type` = `BID_TYPE_CUSTOM`.`conversion_bid_price` needs to be lower than budget set at the campaign level and ad group level. See [Bidding-Bidding limits](https://ads.tiktok.com/marketing_api/docs?id=1745292444424193) to learn more about the bid verification mechanism.")
  public BigDecimal getConversionBidPrice() {
    return conversionBidPrice;
  }

  public void setConversionBidPrice(BigDecimal conversionBidPrice) {
    this.conversionBidPrice = conversionBidPrice;
  }

  public AdgroupUpdateBody conversionId(Integer conversionId) {
    this.conversionId = conversionId;
    return this;
  }

   /**
   * Conversion Id
   * @return conversionId
  **/
  @Schema(description = "Conversion Id")
  public Integer getConversionId() {
    return conversionId;
  }

  public void setConversionId(Integer conversionId) {
    this.conversionId = conversionId;
  }

  public AdgroupUpdateBody creativeMaterialMode(String creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * The strategy that your creatives will be delivered.&lt;br data-tomark-pass&gt;&#x60;Note&#x60;- When you choose automated ad, your creative materials will automatically be combined for delivery. Tiktok Ads&#x27; smart optimization algorithm is applied and will be used to achieve the best ad performance during delivery. &lt;br data-tomark-pass&gt;Optional values include- &#x60;CUSTOM&#x60; (custom), &#x60;DYNAMIC&#x60; (automated). Default value is &#x60;CUSTOM&#x60; (custom). See [help center](https://ads.tiktok.com/help/article?aid&#x3D;6670043695674294277) for more.
   * @return creativeMaterialMode
  **/
  @Schema(description = "The strategy that your creatives will be delivered.<br data-tomark-pass>`Note`- When you choose automated ad, your creative materials will automatically be combined for delivery. Tiktok Ads' smart optimization algorithm is applied and will be used to achieve the best ad performance during delivery. <br data-tomark-pass>Optional values include- `CUSTOM` (custom), `DYNAMIC` (automated). Default value is `CUSTOM` (custom). See [help center](https://ads.tiktok.com/help/article?aid=6670043695674294277) for more.")
  public String getCreativeMaterialMode() {
    return creativeMaterialMode;
  }

  public void setCreativeMaterialMode(String creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }

  public AdgroupUpdateBody dayparting(String dayparting) {
    this.dayparting = dayparting;
    return this;
  }

   /**
   * Ad delivery arrangement, in the format of a string that consists of 48 x 7 characters. Each character is mapped to a 30-minute timeframe from Monday to Sunday. Each character can be set to either 0 or 1. 1 represents delivery in the 30-minute timeframe, and 0 stands for non-delivery in the 30-minute timeframe. The first character is mapped to 0-01-0-30 of Monday; The second character is mapped to 0-31-1-00 of Monday, and the last character represents 23-31-0-00 Sunday.
   * @return dayparting
  **/
  @Schema(description = "Ad delivery arrangement, in the format of a string that consists of 48 x 7 characters. Each character is mapped to a 30-minute timeframe from Monday to Sunday. Each character can be set to either 0 or 1. 1 represents delivery in the 30-minute timeframe, and 0 stands for non-delivery in the 30-minute timeframe. The first character is mapped to 0-01-0-30 of Monday; The second character is mapped to 0-31-1-00 of Monday, and the last character represents 23-31-0-00 Sunday.")
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
   * Bidding strategy for in-app events. Required when Campaign Budget Optimization (CBO) is enabled (&#x60;budget_optimize_on&#x60; &#x3D; &#x60;TRUE&#x60;)  and &#x60;optimization_goal&#x60; is &#x60;VALUE&#x60;. Enum values- &#x60;VO_MIN_ROAS&#x60; (allowlisted), &#x60;VO_HIGHEST_VALUE&#x60; (allowlisted). For details, see [Enumeration - Deep-level Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return deepBidType
  **/
  @Schema(description = "Bidding strategy for in-app events. Required when Campaign Budget Optimization (CBO) is enabled (`budget_optimize_on` = `TRUE`)  and `optimization_goal` is `VALUE`. Enum values- `VO_MIN_ROAS` (allowlisted), `VO_HIGHEST_VALUE` (allowlisted). For details, see [Enumeration - Deep-level Bidding Strategy](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
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
   * Deep CPA bid
   * @return deepCpaBid
  **/
  @Schema(description = "Deep CPA bid")
  public BigDecimal getDeepCpaBid() {
    return deepCpaBid;
  }

  public void setDeepCpaBid(BigDecimal deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
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
   * IDs of the device models that you want to target. Use [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172880570369) to get the complete list of device model IDs and their statuses, and only active devices (&#x60;is_active&#x60; &#x3D; &#x60;True&#x60; in the response of  [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172880570369)) can be used to create ads.
   * @return deviceModelIds
  **/
  @Schema(description = "IDs of the device models that you want to target. Use [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369) to get the complete list of device model IDs and their statuses, and only active devices (`is_active` = `True` in the response of  [/tool/device_model/](https://ads.tiktok.com/marketing_api/docs?id=1737172880570369)) can be used to create ads.")
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
   * Targeting device price range. 10000 means 1000+. The numbers must be in multiples of 50. The upper limit you set will be added by 50 and the resulting new number will be used as the actual upper limit for device targeting. The actual upper limit is shown in the ad group settings in TikTok Ads Manager. If you set and get the price range of [0, 250], it actually means [0, 300].
   * @return devicePriceRanges
  **/
  @Schema(description = "Targeting device price range. 10000 means 1000+. The numbers must be in multiples of 50. The upper limit you set will be added by 50 and the resulting new number will be used as the actual upper limit for device targeting. The actual upper limit is shown in the ad group settings in TikTok Ads Manager. If you set and get the price range of [0, 250], it actually means [0, 300].")
  public List<Integer> getDevicePriceRanges() {
    return devicePriceRanges;
  }

  public void setDevicePriceRanges(List<Integer> devicePriceRanges) {
    this.devicePriceRanges = devicePriceRanges;
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
   * List of audience ID to be excluded. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746) endpoint.
   * @return excludedAudienceIds
  **/
  @Schema(description = "List of audience ID to be excluded. You can get audience IDs by using the [/dmp/custom_audience/list/](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746) endpoint.")
  public List<String> getExcludedAudienceIds() {
    return excludedAudienceIds;
  }

  public void setExcludedAudienceIds(List<String> excludedAudienceIds) {
    this.excludedAudienceIds = excludedAudienceIds;
  }

  public AdgroupUpdateBody excludedCustomActions(AdgroupcreateExcludedCustomActions excludedCustomActions) {
    this.excludedCustomActions = excludedCustomActions;
    return this;
  }

   /**
   * Get excludedCustomActions
   * @return excludedCustomActions
  **/
  @Schema(description = "")
  public AdgroupcreateExcludedCustomActions getExcludedCustomActions() {
    return excludedCustomActions;
  }

  public void setExcludedCustomActions(AdgroupcreateExcludedCustomActions excludedCustomActions) {
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
   * IDs of the Pangle audiences that you want to exclude. Valid only for Pangle placement. You can get audience IDs (&#x60;package_id&#x60;) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740040177229826) endpoint. You need to set &#x60;bind_type&#x60; to &#x60;EXCLUDE&#x60;. Do not specify this field and &#x60;included_pangle_audience_package_ids&#x60; at the same time.
   * @return excludedPangleAudiencePackageIds
  **/
  @Schema(description = "IDs of the Pangle audiences that you want to exclude. Valid only for Pangle placement. You can get audience IDs (`package_id`) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id=1740040177229826) endpoint. You need to set `bind_type` to `EXCLUDE`. Do not specify this field and `included_pangle_audience_package_ids` at the same time.")
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
   * Frequency, together with &#x60;frequency_schedule&#x60;, controls how often people see your ad (only available for &#x60;REACH&#x60; ads). The below conditions should be both met-1 &lt;&#x3D; &#x60;frequency&#x60; &lt;&#x3D; &#x60;frequency_schedule&#x60; * 3 1 &lt;&#x3D; &#x60;frequency_schedule&#x60; &lt;&#x3D;7 For example, &#x60;frequency&#x60; &#x3D; 2 &amp; &#x60;frequency_schedule&#x60; &#x3D; 3 means \&quot;show ads no more than twice every 3 day\&quot;.
   * @return frequency
  **/
  @Schema(description = "Frequency, together with `frequency_schedule`, controls how often people see your ad (only available for `REACH` ads). The below conditions should be both met-1 <= `frequency` <= `frequency_schedule` * 3 1 <= `frequency_schedule` <=7 For example, `frequency` = 2 & `frequency_schedule` = 3 means \"show ads no more than twice every 3 day\".")
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
   * Frequency_schedule&#x60;, together with &#x60;frequency&#x60;, controls how often people see your ad (only available for &#x60;REACH&#x60; ads). See &#x60;frequency&#x60; fields for more.
   * @return frequencySchedule
  **/
  @Schema(description = "Frequency_schedule`, together with `frequency`, controls how often people see your ad (only available for `REACH` ads). See `frequency` fields for more.")
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
   * Gender that you want to target. Enum values- &#x60;GENDER_FEMALE&#x60;,&#x60;GENDER_MALE&#x60;,&#x60;GENDER_UNLIMITED&#x60;
   * @return gender
  **/
  @Schema(description = "Gender that you want to target. Enum values- `GENDER_FEMALE`,`GENDER_MALE`,`GENDER_UNLIMITED`")
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
   * Household income that you want to target. Enum values- &#x60;TOP5&#x60;(Top 5% of ZIP codes), &#x60;TOP10&#x60;(Top 10% of ZIP codes), &#x60;TOP10_25&#x60;(Top 10% -25% of ZIP codes), &#x60;TOP25_50&#x60;(Top 25% - 50% of ZIP codes). Note-  It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585562434561) for details. It  is only applicable the TikTok Placement in US. If you have specified &#x60;special_industries&#x60; at the campaign level, then you cannot use the field here. &#x60;household_income&#x60; is an allowlist-only feature that is only available in US. If you would like to access it, please contact your TikTok representative.
   * @return householdIncome
  **/
  @Schema(description = "Household income that you want to target. Enum values- `TOP5`(Top 5% of ZIP codes), `TOP10`(Top 10% of ZIP codes), `TOP10_25`(Top 10% -25% of ZIP codes), `TOP25_50`(Top 25% - 50% of ZIP codes). Note-  It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561) for details. It  is only applicable the TikTok Placement in US. If you have specified `special_industries` at the campaign level, then you cannot use the field here. `household_income` is an allowlist-only feature that is only available in US. If you would like to access it, please contact your TikTok representative.")
  public List<String> getHouseholdIncome() {
    return householdIncome;
  }

  public void setHouseholdIncome(List<String> householdIncome) {
    this.householdIncome = householdIncome;
  }

  public AdgroupUpdateBody identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when &#x60;identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;.
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "ID of the Business Center that a TikTok Account User in Business Center identity is associated with. Required when `identity_type` is `BC_AUTH_TT`.")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public AdgroupUpdateBody identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Identity ID. Required and only valid when &#x60;objective_type&#x60; is &#x60;SHOP_PURCHASES&#x60; or &#x60;PRODUCT_SALES&#x60;.
   * @return identityId
  **/
  @Schema(description = "Identity ID. Required and only valid when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`.")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public AdgroupUpdateBody identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Identity type. Enum values- &#x60;AUTH_CODE&#x60; (Authorized Post User), &#x60;TT_USER&#x60; (TikTok Business Account User), &#x60;BC_AUTH_TT&#x60;(The TikTok account that a Business Center is authorized to access). Required and only valid when &#x60;objective_type&#x60; is &#x60;SHOP_PURCHASES&#x60; or &#x60;PRODUCT_SALES&#x60;. See [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097) for details.
   * @return identityType
  **/
  @Schema(description = "Identity type. Enum values- `AUTH_CODE` (Authorized Post User), `TT_USER` (TikTok Business Account User), `BC_AUTH_TT`(The TikTok account that a Business Center is authorized to access). Required and only valid when `objective_type` is `SHOP_PURCHASES` or `PRODUCT_SALES`. See [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097) for details.")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public AdgroupUpdateBody includedCustomActions(AdgroupcreateIncludedCustomActions includedCustomActions) {
    this.includedCustomActions = includedCustomActions;
    return this;
  }

   /**
   * Get includedCustomActions
   * @return includedCustomActions
  **/
  @Schema(description = "")
  public AdgroupcreateIncludedCustomActions getIncludedCustomActions() {
    return includedCustomActions;
  }

  public void setIncludedCustomActions(AdgroupcreateIncludedCustomActions includedCustomActions) {
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
   * IDs of the Pangle audiences that you want to include. Valid only for Pangle placement. You can get audience IDs (&#x60;package_id&#x60;) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740040177229826) endpoint. You need to set &#x60;bind_type&#x60; to &#x60;INCLUDE&#x60;.  Do not specify this field and &#x60;excluded_pangle_audience_package_ids&#x60; at the sa
   * @return includedPangleAudiencePackageIds
  **/
  @Schema(description = "IDs of the Pangle audiences that you want to include. Valid only for Pangle placement. You can get audience IDs (`package_id`) by using the [/pangle_audience_package/get/](https://ads.tiktok.com/marketing_api/docs?id=1740040177229826) endpoint. You need to set `bind_type` to `INCLUDE`.  Do not specify this field and `excluded_pangle_audience_package_ids` at the sa")
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
   * Interest classification. If the interest is specified, users that do not meet interest target will be excluded during delivery. Do not specify if you wish to target everyone. Use [/tool/target_recommend_tags/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736275204260866) to get a list of recommended interest categories based on your targeting regions and your industries. Use [/tool/interest_category/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174348712961) endpoint to get the complete list of interest categories.
   * @return interestCategoryIds
  **/
  @Schema(description = "Interest classification. If the interest is specified, users that do not meet interest target will be excluded during delivery. Do not specify if you wish to target everyone. Use [/tool/target_recommend_tags/](https://ads.tiktok.com/marketing_api/docs?id=1736275204260866) to get a list of recommended interest categories based on your targeting regions and your industries. Use [/tool/interest_category/](https://ads.tiktok.com/marketing_api/docs?id=1737174348712961) endpoint to get the complete list of interest categories.")
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
   * IDs of interest keywords that you want to use to target audience. You can get recommended interest keywords IDs by using the [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737180852720642) endpoint.
   * @return interestKeywordIds
  **/
  @Schema(description = "IDs of interest keywords that you want to use to target audience. You can get recommended interest keywords IDs by using the [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642) endpoint.")
  public List<String> getInterestKeywordIds() {
    return interestKeywordIds;
  }

  public void setInterestKeywordIds(List<String> interestKeywordIds) {
    this.interestKeywordIds = interestKeywordIds;
  }

  public AdgroupUpdateBody interestKeywords(List<String> interestKeywords) {
    this.interestKeywords = interestKeywords;
    return this;
  }

  public AdgroupUpdateBody addInterestKeywordsItem(String interestKeywordsItem) {
    if (this.interestKeywords == null) {
      this.interestKeywords = new ArrayList<String>();
    }
    this.interestKeywords.add(interestKeywordsItem);
    return this;
  }

   /**
   *  Interest Keywords
   * @return interestKeywords
  **/
  @Schema(description = " Interest Keywords")
  public List<String> getInterestKeywords() {
    return interestKeywords;
  }

  public void setInterestKeywords(List<String> interestKeywords) {
    this.interestKeywords = interestKeywords;
  }

  public AdgroupUpdateBody ios14Targeting(String ios14Targeting) {
    this.ios14Targeting = ios14Targeting;
    return this;
  }

   /**
   * The iOS devices that you want to target. When &#x60;campaign_type&#x60; of the campaign is set as &#x60;IOS14_CAMPAIGN&#x60;,  &#x60;ios14_targeting&#x60; is required and must be specified as &#x60;IOS14_PLUS&#x60;. Enum values-&#x60;UNSET&#x60;- Devices with iOS 14.4 or earlier versions. The default value for ad groups that were created before the introduction of this field.&#x60;IOS14_MINUS&#x60;- Devices with versions earlier than iOS 14.0, which are not affected by the iOS 14 privacy update. This is the default value for ad groups that are created after the introduction of this field.&#x60;IOS14_PLUS&#x60;- Devices with iOS 14.5 and above. The iOS 14 privacy update has been enforced in this group of devices. Specify this value if you want to create an iOS 14 campaign.  Each iOS 14 campaign can have up to 2 active ad groups. &lt;br data-tomark-pass&gt; If &#x60;IOS14_PLUS&#x60; is specified, this field cannot be updated. If &#x60;IOS14_PLUS&#x60; is specified for this field, the system will verify if related fields meet the requirements for an iOS 14 campaign. The following fields will be checked. &#x60;app_id&#x60;- It must not be an ID of an Android app.&#x60;operating_systems&#x60;- It must not be &#x60;ANDROID&#x60; or &#x60;PC&#x60;.&#x60;min_ios_version&#x60;- You must specify a value for this field, and the the value must not contradict with the selection for &#x60;ios14_targeting&#x60;.&#x60;min_android_version&#x60;- Must not be specified.&#x60;optimization_goal&#x60;- Can only be set to &#x60;IN_APP_EVENT&#x60;, &#x60;INSTALL&#x60;, or &#x60;CLICK&#x60;.&#x60;shopping_ads_retargeting_type&#x60;- Must not be specified.&#x60;shopping_ads_retargeting_actions_days&#x60;- Must not be specified. &#x60;conversion_window&#x60;- Must not be specified.On the Ad level, &#x60;deeplink_type&#x60; must not be set to &#x60;DEFERRED_DEEPLINK&#x60;.
   * @return ios14Targeting
  **/
  @Schema(description = "The iOS devices that you want to target. When `campaign_type` of the campaign is set as `IOS14_CAMPAIGN`,  `ios14_targeting` is required and must be specified as `IOS14_PLUS`. Enum values-`UNSET`- Devices with iOS 14.4 or earlier versions. The default value for ad groups that were created before the introduction of this field.`IOS14_MINUS`- Devices with versions earlier than iOS 14.0, which are not affected by the iOS 14 privacy update. This is the default value for ad groups that are created after the introduction of this field.`IOS14_PLUS`- Devices with iOS 14.5 and above. The iOS 14 privacy update has been enforced in this group of devices. Specify this value if you want to create an iOS 14 campaign.  Each iOS 14 campaign can have up to 2 active ad groups. <br data-tomark-pass> If `IOS14_PLUS` is specified, this field cannot be updated. If `IOS14_PLUS` is specified for this field, the system will verify if related fields meet the requirements for an iOS 14 campaign. The following fields will be checked. `app_id`- It must not be an ID of an Android app.`operating_systems`- It must not be `ANDROID` or `PC`.`min_ios_version`- You must specify a value for this field, and the the value must not contradict with the selection for `ios14_targeting`.`min_android_version`- Must not be specified.`optimization_goal`- Can only be set to `IN_APP_EVENT`, `INSTALL`, or `CLICK`.`shopping_ads_retargeting_type`- Must not be specified.`shopping_ads_retargeting_actions_days`- Must not be specified. `conversion_window`- Must not be specified.On the Ad level, `deeplink_type` must not be set to `DEFERRED_DEEPLINK`.")
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
   * Whether the promoted content is HFSS foods (foods that are high in fat, salt, or sugar).
   * @return isHfss
  **/
  @Schema(description = "Whether the promoted content is HFSS foods (foods that are high in fat, salt, or sugar).")
  public Boolean isIsHfss() {
    return isHfss;
  }

  public void setIsHfss(Boolean isHfss) {
    this.isHfss = isHfss;
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
   * Codes of the languages that you want to target. For the list of languages codes supported, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).You can get language codes via [/tool/language/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737188554152962), and if you don&#x27;t want to limit the languages you target, assign an empty value to this field or do not pass in this field.
   * @return languages
  **/
  @Schema(description = "Codes of the languages that you want to target. For the list of languages codes supported, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).You can get language codes via [/tool/language/](https://ads.tiktok.com/marketing_api/docs?id=1737188554152962), and if you don't want to limit the languages you target, assign an empty value to this field or do not pass in this field.")
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
   * IDs of the locations that you want to target. To get the available locations and corresponding IDs based on your placement and objective, use the [/tool/region/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737189539571713) endpoint. To get the list of location IDs, see [Location IDs](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739311040498689).
   * @return locationIds
  **/
  @Schema(description = "IDs of the locations that you want to target. To get the available locations and corresponding IDs based on your placement and objective, use the [/tool/region/](https://ads.tiktok.com/marketing_api/docs?id=1737189539571713) endpoint. To get the list of location IDs, see [Location IDs](https://ads.tiktok.com/marketing_api/docs?id=1739311040498689).")
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
   * Minimum device Android version. For enum values, see [Enumeration - Minimum Android Version](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return minAndroidVersion
  **/
  @Schema(description = "Minimum device Android version. For enum values, see [Enumeration - Minimum Android Version](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
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
   * Minimum iOS version. For enum values, see [Enumeration - Minimum iOS Version](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). This field is required when &#x60;ios14_targeting&#x60; is specified.
   * @return minIosVersion
  **/
  @Schema(description = "Minimum iOS version. For enum values, see [Enumeration - Minimum iOS Version](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138). This field is required when `ios14_targeting` is specified.")
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
   * Device connection types that you want to target. Default- &#x60;unlimited&#x60;. For enum values, see [Enumeration - Connection Type](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return networkTypes
  **/
  @Schema(description = "Device connection types that you want to target. Default- `unlimited`. For enum values, see [Enumeration - Connection Type](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
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
   * Day 2 retention ratio. Formula- &#x60;next_day_retention&#x60; &#x3D; &#x60;conversion_bid_price&#x60;/&#x60;deep_cpa_bid&#x60;. Value range is (0,1]. Only valid when &#x60;placements&#x60; is &#x60;PLACEMENT_PANGLE&#x60; and &#x60;secondary_optimization_event&#x60; is &#x60;NEXT_DAY_OPEN&#x60;. If you want to use this field, please pass in &#x60;conversion_bid_price&#x60;, &#x60;deep_cpa_bid&#x60;, and &#x60;next_day_retention&#x60; at the same time, and make sure the value of them meets the calculation formula. Otherwise there might be unexpected errors.
   * @return nextDayRetention
  **/
  @Schema(description = "Day 2 retention ratio. Formula- `next_day_retention` = `conversion_bid_price`/`deep_cpa_bid`. Value range is (0,1]. Only valid when `placements` is `PLACEMENT_PANGLE` and `secondary_optimization_event` is `NEXT_DAY_OPEN`. If you want to use this field, please pass in `conversion_bid_price`, `deep_cpa_bid`, and `next_day_retention` at the same time, and make sure the value of them meets the calculation formula. Otherwise there might be unexpected errors.")
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
   * Device operating systems that you want to target. Only one value is allowed.  Enum values- &#x60;ANDROID&#x60;, &#x60;IOS&#x60;. This field is required in two scenarios- &#x60;objective_type&#x60; &#x3D; &#x60;APP_INSTALL&#x60;&#x60;objective&#x60;&#x3D;&#x60;TRAFFIC&#x60; and &#x60;optimization_event&#x60; &#x3D; &#x60;APP_IOS&#x60; or &#x60;APP_ANDROID&#x60;
   * @return operatingSystems
  **/
  @Schema(description = "Device operating systems that you want to target. Only one value is allowed.  Enum values- `ANDROID`, `IOS`. This field is required in two scenarios- `objective_type` = `APP_INSTALL``objective`=`TRAFFIC` and `optimization_event` = `APP_IOS` or `APP_ANDROID`")
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
   * You can choose between &#x60;PACING_MODE_SMOOTH&#x60; and &#x60;PACING_MODE_FAST&#x60;. For &#x60;PACING_MODE_SMOOTH&#x60;, the budget is allocated evenly within the scheduled time. &#x60;PACING_MODE_FAST&#x60; would consume budget and produce results as soon as possible. When Campaign Budget Optimization (&#x60;budget_optimize_on&#x60;) is on, your setting will be ignored and it will be set as &#x60;PACING_MODE_SMOOTH&#x60;. Otherwise, this field is required.
   * @return pacing
  **/
  @Schema(description = "You can choose between `PACING_MODE_SMOOTH` and `PACING_MODE_FAST`. For `PACING_MODE_SMOOTH`, the budget is allocated evenly within the scheduled time. `PACING_MODE_FAST` would consume budget and produce results as soon as possible. When Campaign Budget Optimization (`budget_optimize_on`) is on, your setting will be ignored and it will be set as `PACING_MODE_SMOOTH`. Otherwise, this field is required.")
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
   * IDs of purchase intention keywords that you want to use to target audiences with an interest in purchases related to a content category. To get purchase intention keyword IDs, you need to set &#x60;audience_type&#x60; as &#x60;PURCHASE_INTENTION&#x60; when calling [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737180852720642) and then get purchase intention keyword IDs from &#x60;keyword_id&#x60; in the response. Note-Do not pass in &#x60;purchase_intention_keyword_ids&#x60; and &#x60;interest_keyword_ids&#x60; at the same time. Otherwise, keyword conflict will occur.&#x60;purchase_intention_keyword_ids&#x60; only supports auctions ads with the corresponding advertising objective(&#x60;objective_type&#x60;) as App promotion (&#x60;APP_PROMOTION&#x60;), Conversions (&#x60;CONVERSIONS&#x60; ) ，or Product sales (&#x60;PRODUCT_SALES&#x60; when the corresponding &#x60;promotion_type&#x60; &#x3D; &#x60;APP_ANDROID&#x60;, &#x60;APP_IOS&#x60;, or &#x60;WEBSITE&#x60;）, and the placement setting should include TikTok.
   * @return purchaseIntentionKeywordIds
  **/
  @Schema(description = "IDs of purchase intention keywords that you want to use to target audiences with an interest in purchases related to a content category. To get purchase intention keyword IDs, you need to set `audience_type` as `PURCHASE_INTENTION` when calling [/tool/interest_keyword/recommend/](https://ads.tiktok.com/marketing_api/docs?id=1737180852720642) and then get purchase intention keyword IDs from `keyword_id` in the response. Note-Do not pass in `purchase_intention_keyword_ids` and `interest_keyword_ids` at the same time. Otherwise, keyword conflict will occur.`purchase_intention_keyword_ids` only supports auctions ads with the corresponding advertising objective(`objective_type`) as App promotion (`APP_PROMOTION`), Conversions (`CONVERSIONS` ) ，or Product sales (`PRODUCT_SALES` when the corresponding `promotion_type` = `APP_ANDROID`, `APP_IOS`, or `WEBSITE`）, and the placement setting should include TikTok.")
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
   * ROAS goal for Value Optimization. Required when &#x60;deep_bid_type&#x60; is &#x60;VO_MIN_ROAS&#x60;.
   * @return roasBid
  **/
  @Schema(description = "ROAS goal for Value Optimization. Required when `deep_bid_type` is `VO_MIN_ROAS`.")
  public BigDecimal getRoasBid() {
    return roasBid;
  }

  public void setRoasBid(BigDecimal roasBid) {
    this.roasBid = roasBid;
  }

  public AdgroupUpdateBody scheduleEndTime(String scheduleEndTime) {
    this.scheduleEndTime = scheduleEndTime;
    return this;
  }

   /**
   * Schedule end time (UTC+0), in the format of \&quot;YYYY-MM-DD HH-MM-SS\&quot;. This field is required when &#x60;schedule_type&#x60; is &#x60;SCHEDULE_START_END&#x60; or &#x60;budget_mode&#x60; is &#x60;BUDGET_MODE_TOTAL&#x60;
   * @return scheduleEndTime
  **/
  @Schema(description = "Schedule end time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". This field is required when `schedule_type` is `SCHEDULE_START_END` or `budget_mode` is `BUDGET_MODE_TOTAL`")
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
   * Schedule start time (UTC+0), in the format of \&quot;YYYY-MM-DD HH-MM-SS\&quot;. The start time can be up to 12 hours earlier than the current time.
   * @return scheduleStartTime
  **/
  @Schema(description = "Schedule start time (UTC+0), in the format of \"YYYY-MM-DD HH-MM-SS\". The start time can be up to 12 hours earlier than the current time.")
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
   * The schedule type can be either &#x60;SCHEDULE_START_END&#x60; or &#x60;SCHEDULE_FROM_NOW&#x60;. If you choose &#x60;SCHEDULE_START_END&#x60;, you need to specify a start time and an end time. If you choose &#x60;SCHEDULE_FROM_NOW&#x60;, you only need to specify a start time and the end time will be automatically set to 10 years later than the start time. If &#x60;budget_mode&#x60; is &#x60;BUDGET_MODE_TOTAL&#x60;, this field must be set to &#x60;SCHEDULE_START_END&#x60;.
   * @return scheduleType
  **/
  @Schema(description = "The schedule type can be either `SCHEDULE_START_END` or `SCHEDULE_FROM_NOW`. If you choose `SCHEDULE_START_END`, you need to specify a start time and an end time. If you choose `SCHEDULE_FROM_NOW`, you only need to specify a start time and the end time will be automatically set to 10 years later than the start time. If `budget_mode` is `BUDGET_MODE_TOTAL`, this field must be set to `SCHEDULE_START_END`.")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public AdgroupUpdateBody secondaryOptimizationEvent(String secondaryOptimizationEvent) {
    this.secondaryOptimizationEvent = secondaryOptimizationEvent;
    return this;
  }

   /**
   * The secondary goal when optimization goal (&#x60;optimization_goal&#x60;) is Install (&#x60;INSTALL&#x60;) or Value (&#x60;VALUE&#x60;). For enum values, see [Conversion events - Secondary-goal events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739361474981889).
   * @return secondaryOptimizationEvent
  **/
  @Schema(description = "The secondary goal when optimization goal (`optimization_goal`) is Install (`INSTALL`) or Value (`VALUE`). For enum values, see [Conversion events - Secondary-goal events](https://ads.tiktok.com/marketing_api/docs?id=1739361474981889).")
  public String getSecondaryOptimizationEvent() {
    return secondaryOptimizationEvent;
  }

  public void setSecondaryOptimizationEvent(String secondaryOptimizationEvent) {
    this.secondaryOptimizationEvent = secondaryOptimizationEvent;
  }

  public AdgroupUpdateBody shoppingAdsRetargetingActionsDays(Integer shoppingAdsRetargetingActionsDays) {
    this.shoppingAdsRetargetingActionsDays = shoppingAdsRetargetingActionsDays;
    return this;
  }

   /**
   * The valid time range for the specified audience action. Audiences who have completed the specified action within the time range will be retargeted by the shopping ads. Required when &#x60;shopping_ads_retargeting_type&#x60; is &#x60;LAB1&#x60; or &#x60;LAB2&#x60;.
   * @return shoppingAdsRetargetingActionsDays
  **/
  @Schema(description = "The valid time range for the specified audience action. Audiences who have completed the specified action within the time range will be retargeted by the shopping ads. Required when `shopping_ads_retargeting_type` is `LAB1` or `LAB2`.")
  public Integer getShoppingAdsRetargetingActionsDays() {
    return shoppingAdsRetargetingActionsDays;
  }

  public void setShoppingAdsRetargetingActionsDays(Integer shoppingAdsRetargetingActionsDays) {
    this.shoppingAdsRetargetingActionsDays = shoppingAdsRetargetingActionsDays;
  }

  public AdgroupUpdateBody shoppingAdsRetargetingType(String shoppingAdsRetargetingType) {
    this.shoppingAdsRetargetingType = shoppingAdsRetargetingType;
    return this;
  }

   /**
   * Valid when the campaign &#x60;objective_type&#x60; is &#x60;PRODUCT_SALES&#x60;. The retargeting type of shopping ads. Enum values- &#x60;LAB1&#x60;- Retargeting audiences who viewed products or added products to cart but didn&#x27;t purchase products. &#x60;LAB2&#x60;- Retargeting audiences who added products to cart but didn&#x27;t purchase products. &#x60;LAB3&#x60;- Retargeting audiences using custom combination. &#x60;OFF&#x60;- No retargeting.
   * @return shoppingAdsRetargetingType
  **/
  @Schema(description = "Valid when the campaign `objective_type` is `PRODUCT_SALES`. The retargeting type of shopping ads. Enum values- `LAB1`- Retargeting audiences who viewed products or added products to cart but didn't purchase products. `LAB2`- Retargeting audiences who added products to cart but didn't purchase products. `LAB3`- Retargeting audiences using custom combination. `OFF`- No retargeting.")
  public String getShoppingAdsRetargetingType() {
    return shoppingAdsRetargetingType;
  }

  public void setShoppingAdsRetargetingType(String shoppingAdsRetargetingType) {
    this.shoppingAdsRetargetingType = shoppingAdsRetargetingType;
  }

  public AdgroupUpdateBody spendingPower(String spendingPower) {
    this.spendingPower = spendingPower;
    return this;
  }

   /**
   * Spending power that you want to target. Enum values- &#x60;ALL&#x60;, &#x60;HIGH&#x60;.   If it is set to &#x60;HIGH&#x60;, you can target high spending users who typically spend more on purchases than average users.  Note-  It is only applicable to the TikTok placement. Your &#x60;placements&#x60; field must contain the enum value of &#x60;PLACEMENT_TIKTOK&#x60; . It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585562434561) for details.  It cannot be used with special industries targeting at the same time. If you have specified &#x60;special_industries&#x60; at the campaign level, then you cannot use the field here. When &#x60;auto_targeting_enabled&#x60; is &#x60;True&#x60; at the ad group level, then &#x60;spending_power&#x60;  will be automatically set to &#x60;ALL&#x60;.  Enum values are &#x60;ALL&#x60; and &#x60;HIGH&#x60;. Even if you don&#x27;t specify this field,  then we will still return &#x60;ALL&#x60; spending power users.
   * @return spendingPower
  **/
  @Schema(description = "Spending power that you want to target. Enum values- `ALL`, `HIGH`.   If it is set to `HIGH`, you can target high spending users who typically spend more on purchases than average users.  Note-  It is only applicable to the TikTok placement. Your `placements` field must contain the enum value of `PLACEMENT_TIKTOK` . It only supports the ad objectives for Auction ads. See [Advertising objectives](https://ads.tiktok.com/marketing_api/docs?id=1737585562434561) for details.  It cannot be used with special industries targeting at the same time. If you have specified `special_industries` at the campaign level, then you cannot use the field here. When `auto_targeting_enabled` is `True` at the ad group level, then `spending_power`  will be automatically set to `ALL`.  Enum values are `ALL` and `HIGH`. Even if you don't specify this field,  then we will still return `ALL` spending power users.")
  public String getSpendingPower() {
    return spendingPower;
  }

  public void setSpendingPower(String spendingPower) {
    this.spendingPower = spendingPower;
  }

  public AdgroupUpdateBody targetingExpansion(AdgroupcreateTargetingExpansion targetingExpansion) {
    this.targetingExpansion = targetingExpansion;
    return this;
  }

   /**
   * Get targetingExpansion
   * @return targetingExpansion
  **/
  @Schema(description = "")
  public AdgroupcreateTargetingExpansion getTargetingExpansion() {
    return targetingExpansion;
  }

  public void setTargetingExpansion(AdgroupcreateTargetingExpansion targetingExpansion) {
    this.targetingExpansion = targetingExpansion;
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
        Objects.equals(this.appDownloadUrl, adgroupUpdateBody.appDownloadUrl) &&
        Objects.equals(this.appId, adgroupUpdateBody.appId) &&
        Objects.equals(this.audienceIds, adgroupUpdateBody.audienceIds) &&
        Objects.equals(this.audienceRule, adgroupUpdateBody.audienceRule) &&
        Objects.equals(this.audienceType, adgroupUpdateBody.audienceType) &&
        Objects.equals(this.autoTargetingEnabled, adgroupUpdateBody.autoTargetingEnabled) &&
        Objects.equals(this.bidPrice, adgroupUpdateBody.bidPrice) &&
        Objects.equals(this.bidType, adgroupUpdateBody.bidType) &&
        Objects.equals(this.billingEvent, adgroupUpdateBody.billingEvent) &&
        Objects.equals(this.blockedPangleAppIds, adgroupUpdateBody.blockedPangleAppIds) &&
        Objects.equals(this.brandSafetyType, adgroupUpdateBody.brandSafetyType) &&
        Objects.equals(this.budget, adgroupUpdateBody.budget) &&
        Objects.equals(this.carrierIds, adgroupUpdateBody.carrierIds) &&
        Objects.equals(this.catalogAuthorizedBcId, adgroupUpdateBody.catalogAuthorizedBcId) &&
        Objects.equals(this.commentDisabled, adgroupUpdateBody.commentDisabled) &&
        Objects.equals(this.contextualTagIds, adgroupUpdateBody.contextualTagIds) &&
        Objects.equals(this.conversionBidPrice, adgroupUpdateBody.conversionBidPrice) &&
        Objects.equals(this.conversionId, adgroupUpdateBody.conversionId) &&
        Objects.equals(this.creativeMaterialMode, adgroupUpdateBody.creativeMaterialMode) &&
        Objects.equals(this.dayparting, adgroupUpdateBody.dayparting) &&
        Objects.equals(this.deepBidType, adgroupUpdateBody.deepBidType) &&
        Objects.equals(this.deepCpaBid, adgroupUpdateBody.deepCpaBid) &&
        Objects.equals(this.deviceModelIds, adgroupUpdateBody.deviceModelIds) &&
        Objects.equals(this.devicePriceRanges, adgroupUpdateBody.devicePriceRanges) &&
        Objects.equals(this.excludedAudienceIds, adgroupUpdateBody.excludedAudienceIds) &&
        Objects.equals(this.excludedCustomActions, adgroupUpdateBody.excludedCustomActions) &&
        Objects.equals(this.excludedPangleAudiencePackageIds, adgroupUpdateBody.excludedPangleAudiencePackageIds) &&
        Objects.equals(this.frequency, adgroupUpdateBody.frequency) &&
        Objects.equals(this.frequencySchedule, adgroupUpdateBody.frequencySchedule) &&
        Objects.equals(this.gender, adgroupUpdateBody.gender) &&
        Objects.equals(this.householdIncome, adgroupUpdateBody.householdIncome) &&
        Objects.equals(this.identityAuthorizedBcId, adgroupUpdateBody.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, adgroupUpdateBody.identityId) &&
        Objects.equals(this.identityType, adgroupUpdateBody.identityType) &&
        Objects.equals(this.includedCustomActions, adgroupUpdateBody.includedCustomActions) &&
        Objects.equals(this.includedPangleAudiencePackageIds, adgroupUpdateBody.includedPangleAudiencePackageIds) &&
        Objects.equals(this.interestCategoryIds, adgroupUpdateBody.interestCategoryIds) &&
        Objects.equals(this.interestKeywordIds, adgroupUpdateBody.interestKeywordIds) &&
        Objects.equals(this.interestKeywords, adgroupUpdateBody.interestKeywords) &&
        Objects.equals(this.ios14Targeting, adgroupUpdateBody.ios14Targeting) &&
        Objects.equals(this.isHfss, adgroupUpdateBody.isHfss) &&
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
        Objects.equals(this.scheduleEndTime, adgroupUpdateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, adgroupUpdateBody.scheduleStartTime) &&
        Objects.equals(this.scheduleType, adgroupUpdateBody.scheduleType) &&
        Objects.equals(this.secondaryOptimizationEvent, adgroupUpdateBody.secondaryOptimizationEvent) &&
        Objects.equals(this.shoppingAdsRetargetingActionsDays, adgroupUpdateBody.shoppingAdsRetargetingActionsDays) &&
        Objects.equals(this.shoppingAdsRetargetingType, adgroupUpdateBody.shoppingAdsRetargetingType) &&
        Objects.equals(this.spendingPower, adgroupUpdateBody.spendingPower) &&
        Objects.equals(this.targetingExpansion, adgroupUpdateBody.targetingExpansion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, adgroupId, adgroupName, advertiserId, ageGroups, appDownloadUrl, appId, audienceIds, audienceRule, audienceType, autoTargetingEnabled, bidPrice, bidType, billingEvent, blockedPangleAppIds, brandSafetyType, budget, carrierIds, catalogAuthorizedBcId, commentDisabled, contextualTagIds, conversionBidPrice, conversionId, creativeMaterialMode, dayparting, deepBidType, deepCpaBid, deviceModelIds, devicePriceRanges, excludedAudienceIds, excludedCustomActions, excludedPangleAudiencePackageIds, frequency, frequencySchedule, gender, householdIncome, identityAuthorizedBcId, identityId, identityType, includedCustomActions, includedPangleAudiencePackageIds, interestCategoryIds, interestKeywordIds, interestKeywords, ios14Targeting, isHfss, languages, locationIds, minAndroidVersion, minIosVersion, networkTypes, nextDayRetention, operatingSystems, pacing, purchaseIntentionKeywordIds, roasBid, scheduleEndTime, scheduleStartTime, scheduleType, secondaryOptimizationEvent, shoppingAdsRetargetingActionsDays, shoppingAdsRetargetingType, spendingPower, targetingExpansion);
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
    sb.append("    appDownloadUrl: ").append(toIndentedString(appDownloadUrl)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    audienceRule: ").append(toIndentedString(audienceRule)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    billingEvent: ").append(toIndentedString(billingEvent)).append("\n");
    sb.append("    blockedPangleAppIds: ").append(toIndentedString(blockedPangleAppIds)).append("\n");
    sb.append("    brandSafetyType: ").append(toIndentedString(brandSafetyType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    carrierIds: ").append(toIndentedString(carrierIds)).append("\n");
    sb.append("    catalogAuthorizedBcId: ").append(toIndentedString(catalogAuthorizedBcId)).append("\n");
    sb.append("    commentDisabled: ").append(toIndentedString(commentDisabled)).append("\n");
    sb.append("    contextualTagIds: ").append(toIndentedString(contextualTagIds)).append("\n");
    sb.append("    conversionBidPrice: ").append(toIndentedString(conversionBidPrice)).append("\n");
    sb.append("    conversionId: ").append(toIndentedString(conversionId)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    dayparting: ").append(toIndentedString(dayparting)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deviceModelIds: ").append(toIndentedString(deviceModelIds)).append("\n");
    sb.append("    devicePriceRanges: ").append(toIndentedString(devicePriceRanges)).append("\n");
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
    sb.append("    interestKeywords: ").append(toIndentedString(interestKeywords)).append("\n");
    sb.append("    ios14Targeting: ").append(toIndentedString(ios14Targeting)).append("\n");
    sb.append("    isHfss: ").append(toIndentedString(isHfss)).append("\n");
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
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    secondaryOptimizationEvent: ").append(toIndentedString(secondaryOptimizationEvent)).append("\n");
    sb.append("    shoppingAdsRetargetingActionsDays: ").append(toIndentedString(shoppingAdsRetargetingActionsDays)).append("\n");
    sb.append("    shoppingAdsRetargetingType: ").append(toIndentedString(shoppingAdsRetargetingType)).append("\n");
    sb.append("    spendingPower: ").append(toIndentedString(spendingPower)).append("\n");
    sb.append("    targetingExpansion: ").append(toIndentedString(targetingExpansion)).append("\n");
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
