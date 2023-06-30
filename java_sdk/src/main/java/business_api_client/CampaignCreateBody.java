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
 * CampaignCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class CampaignCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("app_promotion_type")
  private String appPromotionType = null;

  @JsonProperty("budget")
  private Float budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  @JsonProperty("budget_optimize_on")
  private Boolean budgetOptimizeOn = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("campaign_type")
  private String campaignType = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("rf_campaign_type")
  private String rfCampaignType = null;

  @JsonProperty("special_industries")
  private List<String> specialIndustries = null;

  public CampaignCreateBody advertiserId(String advertiserId) {
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

  public CampaignCreateBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App ID, required when the campaign is an iOS 14 Dedicated Campaign (camapign_type&#x3D;IOS14_CAMPAIGN) with the advertising objective (objective_type) as PRODUCT_SALES.
   * @return appId
  **/
  @Schema(description = "App ID, required when the campaign is an iOS 14 Dedicated Campaign (camapign_type=IOS14_CAMPAIGN) with the advertising objective (objective_type) as PRODUCT_SALES.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public CampaignCreateBody appPromotionType(String appPromotionType) {
    this.appPromotionType = appPromotionType;
    return this;
  }

   /**
   * App promotion type. Required when &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60;. Enum values- &#x60;APP_INSTALL&#x60;, &#x60;APP_RETARGETING&#x60;. Note- &#x60;APP_INSTALL&#x60; can be used in an iOS14 Dedicated Campaign, while &#x60;APP_RETARGETING&#x60; cannot be used.
   * @return appPromotionType
  **/
  @Schema(description = "App promotion type. Required when `objective_type` is `APP_PROMOTION`. Enum values- `APP_INSTALL`, `APP_RETARGETING`. Note- `APP_INSTALL` can be used in an iOS14 Dedicated Campaign, while `APP_RETARGETING` cannot be used.")
  public String getAppPromotionType() {
    return appPromotionType;
  }

  public void setAppPromotionType(String appPromotionType) {
    this.appPromotionType = appPromotionType;
  }

  public CampaignCreateBody budget(Float budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Campaign budget, required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings.
   * @return budget
  **/
  @Schema(description = "Campaign budget, required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings.")
  public Float getBudget() {
    return budget;
  }

  public void setBudget(Float budget) {
    this.budget = budget;
  }

  public CampaignCreateBody budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Budget mode. When Campaign Budget Optimization is enabled, only BUDGET_MODE_DAY is supported. When \&quot;objective_type\&quot; is RF_REACH, only BUDGET_MODE_INFINITE is supported. To learn about how to set budget types, see Budget setting.
   * @return budgetMode
  **/
  @Schema(description = "Budget mode. When Campaign Budget Optimization is enabled, only BUDGET_MODE_DAY is supported. When \"objective_type\" is RF_REACH, only BUDGET_MODE_INFINITE is supported. To learn about how to set budget types, see Budget setting.")
  public String getBudgetMode() {
    return budgetMode;
  }

  public void setBudgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
  }

  public CampaignCreateBody budgetOptimizeOn(Boolean budgetOptimizeOn) {
    this.budgetOptimizeOn = budgetOptimizeOn;
    return this;
  }

   /**
   * Whether to enable Campaign Budget Optimization. True: Enabled. False: Not enabled. Default: True. For details about Campaign Budget Optimization (CBO), see Campaign Budget Optimization.
   * @return budgetOptimizeOn
  **/
  @Schema(description = "Whether to enable Campaign Budget Optimization. True: Enabled. False: Not enabled. Default: True. For details about Campaign Budget Optimization (CBO), see Campaign Budget Optimization.")
  public Boolean isBudgetOptimizeOn() {
    return budgetOptimizeOn;
  }

  public void setBudgetOptimizeOn(Boolean budgetOptimizeOn) {
    this.budgetOptimizeOn = budgetOptimizeOn;
  }

  public CampaignCreateBody campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.
   * @return campaignName
  **/
  @Schema(required = true, description = "Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character.")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignCreateBody campaignType(String campaignType) {
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Enums values: REGULAR_CAMPAIGN, IOS14_CAMPAIGN. The value IOS14_CAMPAIGN supports the advertising objective PRODUCT_SALES only. For iOS 14 Dedicated Campaign with objectives other than PRODUCT_SALES , set campaign_type as REGULAR_CAMPAIGN.
   * @return campaignType
  **/
  @Schema(description = "Enums values: REGULAR_CAMPAIGN, IOS14_CAMPAIGN. The value IOS14_CAMPAIGN supports the advertising objective PRODUCT_SALES only. For iOS 14 Dedicated Campaign with objectives other than PRODUCT_SALES , set campaign_type as REGULAR_CAMPAIGN.")
  public String getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(String campaignType) {
    this.campaignType = campaignType;
  }

  public CampaignCreateBody objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Advertising objective. For enum values and descriptions, see Objectives.
   * @return objectiveType
  **/
  @Schema(required = true, description = "Advertising objective. For enum values and descriptions, see Objectives.")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateBody operationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * The field operation_status is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. If you pass in this field without applying for allowlisting first, the field will be ignored and no error message will appear. For Reach &amp; Frequency campaigns, please specify operation_status as ENABLE or do not pass in operation_status. Do not specify operation_status as DISABLE.  The status of the campaign when created. Enum values: ENABLE : The campaign is enabled when created. DISABLE : The campaign is disabled when created. Default value: ENABLE. If you want to update the status of the campaign after creation, use the /campaign/status/update/ endpoint.
   * @return operationStatus
  **/
  @Schema(description = "The field operation_status is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. If you pass in this field without applying for allowlisting first, the field will be ignored and no error message will appear. For Reach & Frequency campaigns, please specify operation_status as ENABLE or do not pass in operation_status. Do not specify operation_status as DISABLE.  The status of the campaign when created. Enum values: ENABLE : The campaign is enabled when created. DISABLE : The campaign is disabled when created. Default value: ENABLE. If you want to update the status of the campaign after creation, use the /campaign/status/update/ endpoint.")
  public String getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  public CampaignCreateBody optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

   /**
   * Optimization goal at the campaign level. Required when Campaign Budget Optimization is enabled. Allowed values: CONVERT, INSTALL, VALUE, IN_APP_EVENT and LEAD_GENERATION.
   * @return optimizationGoal
  **/
  @Schema(description = "Optimization goal at the campaign level. Required when Campaign Budget Optimization is enabled. Allowed values: CONVERT, INSTALL, VALUE, IN_APP_EVENT and LEAD_GENERATION.")
  public String getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public CampaignCreateBody rfCampaignType(String rfCampaignType) {
    this.rfCampaignType = rfCampaignType;
    return this;
  }

   /**
   * When &#x60;objective_type&#x60; is specified as &#x60;RF_REACH&#x60;, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when &#x60;objective_type&#x60; is not specified as &#x60;RF_REACH&#x60;.Enum values- &#x60;STANDARD&#x60; (Reach &amp; Frequency campaign), &#x60;PULSE&#x60;(TikTok Pulse campaign). Note&lt;- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative. This field cannot be updated after creation. If you select &#x60;rf_campaign_type&#x60; to &#x60;PULSE&#x60; , then you must enter contextual tags of &#x60;PREMIUM&#x60; type in the &#x60;contextual_tag_ids&#x60;  field in [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738235338194945). In this case, the CPM in your ad group is fixed. If you set &#x60;rf_campaign_type&#x60; to &#x60;PULSE&#x60;, then the targeting locations cannot be updated in  [/adgroup/rf/update/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738235402874882). If you set &#x60;rf_campaign_type&#x60; to &#x60;PULSE&#x60;, then &#x60;feed_type&#x60; cannot be &#x60;TOP_FEED&#x60; in  [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738235338194945).
   * @return rfCampaignType
  **/
  @Schema(description = "When `objective_type` is specified as `RF_REACH`, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when `objective_type` is not specified as `RF_REACH`.Enum values- `STANDARD` (Reach & Frequency campaign), `PULSE`(TikTok Pulse campaign). Note<- This is an allowlist-only feature. If you would like to access it, please contact your TikTok representative. This field cannot be updated after creation. If you select `rf_campaign_type` to `PULSE` , then you must enter contextual tags of `PREMIUM` type in the `contextual_tag_ids`  field in [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id=1738235338194945). In this case, the CPM in your ad group is fixed. If you set `rf_campaign_type` to `PULSE`, then the targeting locations cannot be updated in  [/adgroup/rf/update/](https://ads.tiktok.com/marketing_api/docs?id=1738235402874882). If you set `rf_campaign_type` to `PULSE`, then `feed_type` cannot be `TOP_FEED` in  [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id=1738235338194945).")
  public String getRfCampaignType() {
    return rfCampaignType;
  }

  public void setRfCampaignType(String rfCampaignType) {
    this.rfCampaignType = rfCampaignType;
  }

  public CampaignCreateBody specialIndustries(List<String> specialIndustries) {
    this.specialIndustries = specialIndustries;
    return this;
  }

  public CampaignCreateBody addSpecialIndustriesItem(String specialIndustriesItem) {
    if (this.specialIndustries == null) {
      this.specialIndustries = new ArrayList<String>();
    }
    this.specialIndustries.add(specialIndustriesItem);
    return this;
  }

   /**
   * Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: Once you&#x27;ve specified the industry type, the system will adjust your ad group target options to help you comply with advertising policies. See Ad targeting to know more.
   * @return specialIndustries
  **/
  @Schema(description = "Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: Once you've specified the industry type, the system will adjust your ad group target options to help you comply with advertising policies. See Ad targeting to know more.")
  public List<String> getSpecialIndustries() {
    return specialIndustries;
  }

  public void setSpecialIndustries(List<String> specialIndustries) {
    this.specialIndustries = specialIndustries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateBody campaignCreateBody = (CampaignCreateBody) o;
    return Objects.equals(this.advertiserId, campaignCreateBody.advertiserId) &&
        Objects.equals(this.appId, campaignCreateBody.appId) &&
        Objects.equals(this.appPromotionType, campaignCreateBody.appPromotionType) &&
        Objects.equals(this.budget, campaignCreateBody.budget) &&
        Objects.equals(this.budgetMode, campaignCreateBody.budgetMode) &&
        Objects.equals(this.budgetOptimizeOn, campaignCreateBody.budgetOptimizeOn) &&
        Objects.equals(this.campaignName, campaignCreateBody.campaignName) &&
        Objects.equals(this.campaignType, campaignCreateBody.campaignType) &&
        Objects.equals(this.objectiveType, campaignCreateBody.objectiveType) &&
        Objects.equals(this.operationStatus, campaignCreateBody.operationStatus) &&
        Objects.equals(this.optimizationGoal, campaignCreateBody.optimizationGoal) &&
        Objects.equals(this.rfCampaignType, campaignCreateBody.rfCampaignType) &&
        Objects.equals(this.specialIndustries, campaignCreateBody.specialIndustries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, appPromotionType, budget, budgetMode, budgetOptimizeOn, campaignName, campaignType, objectiveType, operationStatus, optimizationGoal, rfCampaignType, specialIndustries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPromotionType: ").append(toIndentedString(appPromotionType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    budgetOptimizeOn: ").append(toIndentedString(budgetOptimizeOn)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    rfCampaignType: ").append(toIndentedString(rfCampaignType)).append("\n");
    sb.append("    specialIndustries: ").append(toIndentedString(specialIndustries)).append("\n");
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
