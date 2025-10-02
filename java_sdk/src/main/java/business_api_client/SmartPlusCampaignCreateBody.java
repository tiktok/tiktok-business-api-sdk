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
 * SmartPlusCampaignCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class SmartPlusCampaignCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("app_promotion_type")
  private String appPromotionType = null;

  @JsonProperty("bid_align_type")
  private String bidAlignType = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  @JsonProperty("budget_optimize_on")
  private Boolean budgetOptimizeOn = null;

  @JsonProperty("campaign_app_profile_page_state")
  private String campaignAppProfilePageState = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("campaign_type")
  private String campaignType = null;

  @JsonProperty("catalog_enabled")
  private Boolean catalogEnabled = null;

  @JsonProperty("catalog_type")
  private String catalogType = null;

  @JsonProperty("disable_skan_campaign")
  private Boolean disableSkanCampaign = null;

  @JsonProperty("is_advanced_dedicated_campaign")
  private Boolean isAdvancedDedicatedCampaign = true;

  @JsonProperty("is_promotional_campaign")
  private Boolean isPromotionalCampaign = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("open_api_partner")
  private String openApiPartner = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("po_number")
  private String poNumber = null;

  @JsonProperty("postback_window_mode")
  private String postbackWindowMode = null;

  @JsonProperty("request_id")
  private String requestId = null;

  @JsonProperty("sales_destination")
  private String salesDestination = null;

  @JsonProperty("special_industries")
  private List<String> specialIndustries = null;

  public SmartPlusCampaignCreateBody advertiserId(String advertiserId) {
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

  public SmartPlusCampaignCreateBody appId(String appId) {
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

  public SmartPlusCampaignCreateBody appPromotionType(String appPromotionType) {
    this.appPromotionType = appPromotionType;
    return this;
  }

   /**
   * Get appPromotionType
   * @return appPromotionType
  **/
  @Schema(description = "")
  public String getAppPromotionType() {
    return appPromotionType;
  }

  public void setAppPromotionType(String appPromotionType) {
    this.appPromotionType = appPromotionType;
  }

  public SmartPlusCampaignCreateBody bidAlignType(String bidAlignType) {
    this.bidAlignType = bidAlignType;
    return this;
  }

   /**
   * Get bidAlignType
   * @return bidAlignType
  **/
  @Schema(description = "")
  public String getBidAlignType() {
    return bidAlignType;
  }

  public void setBidAlignType(String bidAlignType) {
    this.bidAlignType = bidAlignType;
  }

  public SmartPlusCampaignCreateBody budget(Double budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(description = "")
  public Double getBudget() {
    return budget;
  }

  public void setBudget(Double budget) {
    this.budget = budget;
  }

  public SmartPlusCampaignCreateBody budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @Schema(description = "")
  public String getBudgetMode() {
    return budgetMode;
  }

  public void setBudgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
  }

  public SmartPlusCampaignCreateBody budgetOptimizeOn(Boolean budgetOptimizeOn) {
    this.budgetOptimizeOn = budgetOptimizeOn;
    return this;
  }

   /**
   * Get budgetOptimizeOn
   * @return budgetOptimizeOn
  **/
  @Schema(description = "")
  public Boolean isBudgetOptimizeOn() {
    return budgetOptimizeOn;
  }

  public void setBudgetOptimizeOn(Boolean budgetOptimizeOn) {
    this.budgetOptimizeOn = budgetOptimizeOn;
  }

  public SmartPlusCampaignCreateBody campaignAppProfilePageState(String campaignAppProfilePageState) {
    this.campaignAppProfilePageState = campaignAppProfilePageState;
    return this;
  }

   /**
   * Get campaignAppProfilePageState
   * @return campaignAppProfilePageState
  **/
  @Schema(description = "")
  public String getCampaignAppProfilePageState() {
    return campaignAppProfilePageState;
  }

  public void setCampaignAppProfilePageState(String campaignAppProfilePageState) {
    this.campaignAppProfilePageState = campaignAppProfilePageState;
  }

  public SmartPlusCampaignCreateBody campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @Schema(required = true, description = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public SmartPlusCampaignCreateBody campaignType(String campaignType) {
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @Schema(description = "")
  public String getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(String campaignType) {
    this.campaignType = campaignType;
  }

  public SmartPlusCampaignCreateBody catalogEnabled(Boolean catalogEnabled) {
    this.catalogEnabled = catalogEnabled;
    return this;
  }

   /**
   * Get catalogEnabled
   * @return catalogEnabled
  **/
  @Schema(description = "")
  public Boolean isCatalogEnabled() {
    return catalogEnabled;
  }

  public void setCatalogEnabled(Boolean catalogEnabled) {
    this.catalogEnabled = catalogEnabled;
  }

  public SmartPlusCampaignCreateBody catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @Schema(description = "")
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public SmartPlusCampaignCreateBody disableSkanCampaign(Boolean disableSkanCampaign) {
    this.disableSkanCampaign = disableSkanCampaign;
    return this;
  }

   /**
   * Get disableSkanCampaign
   * @return disableSkanCampaign
  **/
  @Schema(description = "")
  public Boolean isDisableSkanCampaign() {
    return disableSkanCampaign;
  }

  public void setDisableSkanCampaign(Boolean disableSkanCampaign) {
    this.disableSkanCampaign = disableSkanCampaign;
  }

  public SmartPlusCampaignCreateBody isAdvancedDedicatedCampaign(Boolean isAdvancedDedicatedCampaign) {
    this.isAdvancedDedicatedCampaign = isAdvancedDedicatedCampaign;
    return this;
  }

   /**
   * Get isAdvancedDedicatedCampaign
   * @return isAdvancedDedicatedCampaign
  **/
  @Schema(description = "")
  public Boolean isIsAdvancedDedicatedCampaign() {
    return isAdvancedDedicatedCampaign;
  }

  public void setIsAdvancedDedicatedCampaign(Boolean isAdvancedDedicatedCampaign) {
    this.isAdvancedDedicatedCampaign = isAdvancedDedicatedCampaign;
  }

  public SmartPlusCampaignCreateBody isPromotionalCampaign(Boolean isPromotionalCampaign) {
    this.isPromotionalCampaign = isPromotionalCampaign;
    return this;
  }

   /**
   * Get isPromotionalCampaign
   * @return isPromotionalCampaign
  **/
  @Schema(description = "")
  public Boolean isIsPromotionalCampaign() {
    return isPromotionalCampaign;
  }

  public void setIsPromotionalCampaign(Boolean isPromotionalCampaign) {
    this.isPromotionalCampaign = isPromotionalCampaign;
  }

  public SmartPlusCampaignCreateBody objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  @Schema(required = true, description = "")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public SmartPlusCampaignCreateBody openApiPartner(String openApiPartner) {
    this.openApiPartner = openApiPartner;
    return this;
  }

   /**
   * Get openApiPartner
   * @return openApiPartner
  **/
  @Schema(description = "")
  public String getOpenApiPartner() {
    return openApiPartner;
  }

  public void setOpenApiPartner(String openApiPartner) {
    this.openApiPartner = openApiPartner;
  }

  public SmartPlusCampaignCreateBody operationStatus(String operationStatus) {
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

  public SmartPlusCampaignCreateBody poNumber(String poNumber) {
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Get poNumber
   * @return poNumber
  **/
  @Schema(description = "")
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  public SmartPlusCampaignCreateBody postbackWindowMode(String postbackWindowMode) {
    this.postbackWindowMode = postbackWindowMode;
    return this;
  }

   /**
   * Get postbackWindowMode
   * @return postbackWindowMode
  **/
  @Schema(description = "")
  public String getPostbackWindowMode() {
    return postbackWindowMode;
  }

  public void setPostbackWindowMode(String postbackWindowMode) {
    this.postbackWindowMode = postbackWindowMode;
  }

  public SmartPlusCampaignCreateBody requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(required = true, description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public SmartPlusCampaignCreateBody salesDestination(String salesDestination) {
    this.salesDestination = salesDestination;
    return this;
  }

   /**
   * Get salesDestination
   * @return salesDestination
  **/
  @Schema(description = "")
  public String getSalesDestination() {
    return salesDestination;
  }

  public void setSalesDestination(String salesDestination) {
    this.salesDestination = salesDestination;
  }

  public SmartPlusCampaignCreateBody specialIndustries(List<String> specialIndustries) {
    this.specialIndustries = specialIndustries;
    return this;
  }

  public SmartPlusCampaignCreateBody addSpecialIndustriesItem(String specialIndustriesItem) {
    if (this.specialIndustries == null) {
      this.specialIndustries = new ArrayList<String>();
    }
    this.specialIndustries.add(specialIndustriesItem);
    return this;
  }

   /**
   * Get specialIndustries
   * @return specialIndustries
  **/
  @Schema(description = "")
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
    SmartPlusCampaignCreateBody smartPlusCampaignCreateBody = (SmartPlusCampaignCreateBody) o;
    return Objects.equals(this.advertiserId, smartPlusCampaignCreateBody.advertiserId) &&
        Objects.equals(this.appId, smartPlusCampaignCreateBody.appId) &&
        Objects.equals(this.appPromotionType, smartPlusCampaignCreateBody.appPromotionType) &&
        Objects.equals(this.bidAlignType, smartPlusCampaignCreateBody.bidAlignType) &&
        Objects.equals(this.budget, smartPlusCampaignCreateBody.budget) &&
        Objects.equals(this.budgetMode, smartPlusCampaignCreateBody.budgetMode) &&
        Objects.equals(this.budgetOptimizeOn, smartPlusCampaignCreateBody.budgetOptimizeOn) &&
        Objects.equals(this.campaignAppProfilePageState, smartPlusCampaignCreateBody.campaignAppProfilePageState) &&
        Objects.equals(this.campaignName, smartPlusCampaignCreateBody.campaignName) &&
        Objects.equals(this.campaignType, smartPlusCampaignCreateBody.campaignType) &&
        Objects.equals(this.catalogEnabled, smartPlusCampaignCreateBody.catalogEnabled) &&
        Objects.equals(this.catalogType, smartPlusCampaignCreateBody.catalogType) &&
        Objects.equals(this.disableSkanCampaign, smartPlusCampaignCreateBody.disableSkanCampaign) &&
        Objects.equals(this.isAdvancedDedicatedCampaign, smartPlusCampaignCreateBody.isAdvancedDedicatedCampaign) &&
        Objects.equals(this.isPromotionalCampaign, smartPlusCampaignCreateBody.isPromotionalCampaign) &&
        Objects.equals(this.objectiveType, smartPlusCampaignCreateBody.objectiveType) &&
        Objects.equals(this.openApiPartner, smartPlusCampaignCreateBody.openApiPartner) &&
        Objects.equals(this.operationStatus, smartPlusCampaignCreateBody.operationStatus) &&
        Objects.equals(this.poNumber, smartPlusCampaignCreateBody.poNumber) &&
        Objects.equals(this.postbackWindowMode, smartPlusCampaignCreateBody.postbackWindowMode) &&
        Objects.equals(this.requestId, smartPlusCampaignCreateBody.requestId) &&
        Objects.equals(this.salesDestination, smartPlusCampaignCreateBody.salesDestination) &&
        Objects.equals(this.specialIndustries, smartPlusCampaignCreateBody.specialIndustries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, appPromotionType, bidAlignType, budget, budgetMode, budgetOptimizeOn, campaignAppProfilePageState, campaignName, campaignType, catalogEnabled, catalogType, disableSkanCampaign, isAdvancedDedicatedCampaign, isPromotionalCampaign, objectiveType, openApiPartner, operationStatus, poNumber, postbackWindowMode, requestId, salesDestination, specialIndustries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusCampaignCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPromotionType: ").append(toIndentedString(appPromotionType)).append("\n");
    sb.append("    bidAlignType: ").append(toIndentedString(bidAlignType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    budgetOptimizeOn: ").append(toIndentedString(budgetOptimizeOn)).append("\n");
    sb.append("    campaignAppProfilePageState: ").append(toIndentedString(campaignAppProfilePageState)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    catalogEnabled: ").append(toIndentedString(catalogEnabled)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    disableSkanCampaign: ").append(toIndentedString(disableSkanCampaign)).append("\n");
    sb.append("    isAdvancedDedicatedCampaign: ").append(toIndentedString(isAdvancedDedicatedCampaign)).append("\n");
    sb.append("    isPromotionalCampaign: ").append(toIndentedString(isPromotionalCampaign)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    openApiPartner: ").append(toIndentedString(openApiPartner)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    postbackWindowMode: ").append(toIndentedString(postbackWindowMode)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    salesDestination: ").append(toIndentedString(salesDestination)).append("\n");
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
