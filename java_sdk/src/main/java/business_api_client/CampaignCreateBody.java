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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class CampaignCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("app_promotion_type")
  private String appPromotionType = null;

  @JsonProperty("bid_type")
  private String bidType = null;

  @JsonProperty("budget")
  private Float budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  @JsonProperty("budget_optimize_on")
  private Boolean budgetOptimizeOn = false;

  @JsonProperty("campaign_app_profile_page_state")
  private String campaignAppProfilePageState = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("campaign_product_source")
  private String campaignProductSource = null;

  @JsonProperty("campaign_type")
  private String campaignType = null;

  @JsonProperty("catalog_enabled")
  private Boolean catalogEnabled = null;

  @JsonProperty("deep_bid_type")
  private String deepBidType = null;

  @JsonProperty("disable_skan_campaign")
  private Boolean disableSkanCampaign = null;

  @JsonProperty("internal_channel")
  private String internalChannel = null;

  @JsonProperty("is_advanced_dedicated_campaign")
  private Boolean isAdvancedDedicatedCampaign = null;

  @JsonProperty("is_search_campaign")
  private Boolean isSearchCampaign = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("operation_status")
  private String operationStatus = "ENABLE";

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("plugin_partner")
  private String pluginPartner = null;

  @JsonProperty("po_number")
  private String poNumber = null;

  @JsonProperty("postback_window_mode")
  private String postbackWindowMode = null;

  @JsonProperty("request_id")
  private String requestId = null;

  @JsonProperty("rf_campaign_type")
  private String rfCampaignType = null;

  @JsonProperty("roas_bid")
  private Float roasBid = null;

  @JsonProperty("rta_bid_enabled")
  private Boolean rtaBidEnabled = false;

  @JsonProperty("rta_id")
  private String rtaId = null;

  @JsonProperty("rta_product_selection_enabled")
  private Boolean rtaProductSelectionEnabled = null;

  @JsonProperty("sales_destination")
  private String salesDestination = null;

  @JsonProperty("special_industries")
  private List<String> specialIndustries = null;

  @JsonProperty("virtual_objective_type")
  private String virtualObjectiveType = null;

  public CampaignCreateBody advertiserId(String advertiserId) {
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

  public CampaignCreateBody appId(String appId) {
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

  public CampaignCreateBody appPromotionType(String appPromotionType) {
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

  public CampaignCreateBody bidType(String bidType) {
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

  public CampaignCreateBody budget(Float budget) {
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @Schema(description = "")
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

  public CampaignCreateBody budgetOptimizeOn(Boolean budgetOptimizeOn) {
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

  public CampaignCreateBody campaignAppProfilePageState(String campaignAppProfilePageState) {
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

  public CampaignCreateBody campaignName(String campaignName) {
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

  public CampaignCreateBody campaignProductSource(String campaignProductSource) {
    this.campaignProductSource = campaignProductSource;
    return this;
  }

   /**
   * Get campaignProductSource
   * @return campaignProductSource
  **/
  @Schema(description = "")
  public String getCampaignProductSource() {
    return campaignProductSource;
  }

  public void setCampaignProductSource(String campaignProductSource) {
    this.campaignProductSource = campaignProductSource;
  }

  public CampaignCreateBody campaignType(String campaignType) {
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

  public CampaignCreateBody catalogEnabled(Boolean catalogEnabled) {
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

  public CampaignCreateBody deepBidType(String deepBidType) {
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

  public CampaignCreateBody disableSkanCampaign(Boolean disableSkanCampaign) {
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

  public CampaignCreateBody internalChannel(String internalChannel) {
    this.internalChannel = internalChannel;
    return this;
  }

   /**
   * Get internalChannel
   * @return internalChannel
  **/
  @Schema(description = "")
  public String getInternalChannel() {
    return internalChannel;
  }

  public void setInternalChannel(String internalChannel) {
    this.internalChannel = internalChannel;
  }

  public CampaignCreateBody isAdvancedDedicatedCampaign(Boolean isAdvancedDedicatedCampaign) {
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

  public CampaignCreateBody isSearchCampaign(Boolean isSearchCampaign) {
    this.isSearchCampaign = isSearchCampaign;
    return this;
  }

   /**
   * Get isSearchCampaign
   * @return isSearchCampaign
  **/
  @Schema(description = "")
  public Boolean isIsSearchCampaign() {
    return isSearchCampaign;
  }

  public void setIsSearchCampaign(Boolean isSearchCampaign) {
    this.isSearchCampaign = isSearchCampaign;
  }

  public CampaignCreateBody objectiveType(String objectiveType) {
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

  public CampaignCreateBody operationStatus(String operationStatus) {
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

  public CampaignCreateBody optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

   /**
   * Get optimizationGoal
   * @return optimizationGoal
  **/
  @Schema(description = "")
  public String getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public CampaignCreateBody pluginPartner(String pluginPartner) {
    this.pluginPartner = pluginPartner;
    return this;
  }

   /**
   * Get pluginPartner
   * @return pluginPartner
  **/
  @Schema(description = "")
  public String getPluginPartner() {
    return pluginPartner;
  }

  public void setPluginPartner(String pluginPartner) {
    this.pluginPartner = pluginPartner;
  }

  public CampaignCreateBody poNumber(String poNumber) {
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

  public CampaignCreateBody postbackWindowMode(String postbackWindowMode) {
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

  public CampaignCreateBody requestId(String requestId) {
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

  public CampaignCreateBody rfCampaignType(String rfCampaignType) {
    this.rfCampaignType = rfCampaignType;
    return this;
  }

   /**
   * Get rfCampaignType
   * @return rfCampaignType
  **/
  @Schema(description = "")
  public String getRfCampaignType() {
    return rfCampaignType;
  }

  public void setRfCampaignType(String rfCampaignType) {
    this.rfCampaignType = rfCampaignType;
  }

  public CampaignCreateBody roasBid(Float roasBid) {
    this.roasBid = roasBid;
    return this;
  }

   /**
   * Get roasBid
   * @return roasBid
  **/
  @Schema(description = "")
  public Float getRoasBid() {
    return roasBid;
  }

  public void setRoasBid(Float roasBid) {
    this.roasBid = roasBid;
  }

  public CampaignCreateBody rtaBidEnabled(Boolean rtaBidEnabled) {
    this.rtaBidEnabled = rtaBidEnabled;
    return this;
  }

   /**
   * Get rtaBidEnabled
   * @return rtaBidEnabled
  **/
  @Schema(description = "")
  public Boolean isRtaBidEnabled() {
    return rtaBidEnabled;
  }

  public void setRtaBidEnabled(Boolean rtaBidEnabled) {
    this.rtaBidEnabled = rtaBidEnabled;
  }

  public CampaignCreateBody rtaId(String rtaId) {
    this.rtaId = rtaId;
    return this;
  }

   /**
   * Get rtaId
   * @return rtaId
  **/
  @Schema(description = "")
  public String getRtaId() {
    return rtaId;
  }

  public void setRtaId(String rtaId) {
    this.rtaId = rtaId;
  }

  public CampaignCreateBody rtaProductSelectionEnabled(Boolean rtaProductSelectionEnabled) {
    this.rtaProductSelectionEnabled = rtaProductSelectionEnabled;
    return this;
  }

   /**
   * Get rtaProductSelectionEnabled
   * @return rtaProductSelectionEnabled
  **/
  @Schema(description = "")
  public Boolean isRtaProductSelectionEnabled() {
    return rtaProductSelectionEnabled;
  }

  public void setRtaProductSelectionEnabled(Boolean rtaProductSelectionEnabled) {
    this.rtaProductSelectionEnabled = rtaProductSelectionEnabled;
  }

  public CampaignCreateBody salesDestination(String salesDestination) {
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

  public CampaignCreateBody virtualObjectiveType(String virtualObjectiveType) {
    this.virtualObjectiveType = virtualObjectiveType;
    return this;
  }

   /**
   * Get virtualObjectiveType
   * @return virtualObjectiveType
  **/
  @Schema(description = "")
  public String getVirtualObjectiveType() {
    return virtualObjectiveType;
  }

  public void setVirtualObjectiveType(String virtualObjectiveType) {
    this.virtualObjectiveType = virtualObjectiveType;
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
        Objects.equals(this.bidType, campaignCreateBody.bidType) &&
        Objects.equals(this.budget, campaignCreateBody.budget) &&
        Objects.equals(this.budgetMode, campaignCreateBody.budgetMode) &&
        Objects.equals(this.budgetOptimizeOn, campaignCreateBody.budgetOptimizeOn) &&
        Objects.equals(this.campaignAppProfilePageState, campaignCreateBody.campaignAppProfilePageState) &&
        Objects.equals(this.campaignName, campaignCreateBody.campaignName) &&
        Objects.equals(this.campaignProductSource, campaignCreateBody.campaignProductSource) &&
        Objects.equals(this.campaignType, campaignCreateBody.campaignType) &&
        Objects.equals(this.catalogEnabled, campaignCreateBody.catalogEnabled) &&
        Objects.equals(this.deepBidType, campaignCreateBody.deepBidType) &&
        Objects.equals(this.disableSkanCampaign, campaignCreateBody.disableSkanCampaign) &&
        Objects.equals(this.internalChannel, campaignCreateBody.internalChannel) &&
        Objects.equals(this.isAdvancedDedicatedCampaign, campaignCreateBody.isAdvancedDedicatedCampaign) &&
        Objects.equals(this.isSearchCampaign, campaignCreateBody.isSearchCampaign) &&
        Objects.equals(this.objectiveType, campaignCreateBody.objectiveType) &&
        Objects.equals(this.operationStatus, campaignCreateBody.operationStatus) &&
        Objects.equals(this.optimizationGoal, campaignCreateBody.optimizationGoal) &&
        Objects.equals(this.pluginPartner, campaignCreateBody.pluginPartner) &&
        Objects.equals(this.poNumber, campaignCreateBody.poNumber) &&
        Objects.equals(this.postbackWindowMode, campaignCreateBody.postbackWindowMode) &&
        Objects.equals(this.requestId, campaignCreateBody.requestId) &&
        Objects.equals(this.rfCampaignType, campaignCreateBody.rfCampaignType) &&
        Objects.equals(this.roasBid, campaignCreateBody.roasBid) &&
        Objects.equals(this.rtaBidEnabled, campaignCreateBody.rtaBidEnabled) &&
        Objects.equals(this.rtaId, campaignCreateBody.rtaId) &&
        Objects.equals(this.rtaProductSelectionEnabled, campaignCreateBody.rtaProductSelectionEnabled) &&
        Objects.equals(this.salesDestination, campaignCreateBody.salesDestination) &&
        Objects.equals(this.specialIndustries, campaignCreateBody.specialIndustries) &&
        Objects.equals(this.virtualObjectiveType, campaignCreateBody.virtualObjectiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, appPromotionType, bidType, budget, budgetMode, budgetOptimizeOn, campaignAppProfilePageState, campaignName, campaignProductSource, campaignType, catalogEnabled, deepBidType, disableSkanCampaign, internalChannel, isAdvancedDedicatedCampaign, isSearchCampaign, objectiveType, operationStatus, optimizationGoal, pluginPartner, poNumber, postbackWindowMode, requestId, rfCampaignType, roasBid, rtaBidEnabled, rtaId, rtaProductSelectionEnabled, salesDestination, specialIndustries, virtualObjectiveType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPromotionType: ").append(toIndentedString(appPromotionType)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    budgetOptimizeOn: ").append(toIndentedString(budgetOptimizeOn)).append("\n");
    sb.append("    campaignAppProfilePageState: ").append(toIndentedString(campaignAppProfilePageState)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignProductSource: ").append(toIndentedString(campaignProductSource)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    catalogEnabled: ").append(toIndentedString(catalogEnabled)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    disableSkanCampaign: ").append(toIndentedString(disableSkanCampaign)).append("\n");
    sb.append("    internalChannel: ").append(toIndentedString(internalChannel)).append("\n");
    sb.append("    isAdvancedDedicatedCampaign: ").append(toIndentedString(isAdvancedDedicatedCampaign)).append("\n");
    sb.append("    isSearchCampaign: ").append(toIndentedString(isSearchCampaign)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    pluginPartner: ").append(toIndentedString(pluginPartner)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    postbackWindowMode: ").append(toIndentedString(postbackWindowMode)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    rfCampaignType: ").append(toIndentedString(rfCampaignType)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    rtaBidEnabled: ").append(toIndentedString(rtaBidEnabled)).append("\n");
    sb.append("    rtaId: ").append(toIndentedString(rtaId)).append("\n");
    sb.append("    rtaProductSelectionEnabled: ").append(toIndentedString(rtaProductSelectionEnabled)).append("\n");
    sb.append("    salesDestination: ").append(toIndentedString(salesDestination)).append("\n");
    sb.append("    specialIndustries: ").append(toIndentedString(specialIndustries)).append("\n");
    sb.append("    virtualObjectiveType: ").append(toIndentedString(virtualObjectiveType)).append("\n");
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
