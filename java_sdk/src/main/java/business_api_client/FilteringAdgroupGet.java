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
 * FilteringAdgroupGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class FilteringAdgroupGet {
  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("bid_strategy")
  private String bidStrategy = null;

  @JsonProperty("billing_events")
  private List<String> billingEvents = null;

  @JsonProperty("buying_types")
  private List<String> buyingTypes = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("campaign_system_origins")
  private List<String> campaignSystemOrigins = null;

  @JsonProperty("creation_filter_end_time")
  private String creationFilterEndTime = null;

  @JsonProperty("creation_filter_start_time")
  private String creationFilterStartTime = null;

  @JsonProperty("creative_material_mode")
  private String creativeMaterialMode = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("primary_status")
  private String primaryStatus = "STATUS_NOT_DELETE";

  @JsonProperty("promotion_type")
  private String promotionType = null;

  @JsonProperty("secondary_status")
  private String secondaryStatus = null;

  @JsonProperty("split_test_enabled")
  private Boolean splitTestEnabled = null;

  public FilteringAdgroupGet adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringAdgroupGet addAdgroupIdsItem(String adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<String>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * Get adgroupIds
   * @return adgroupIds
  **/
  @Schema(description = "")
  public List<String> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  public FilteringAdgroupGet adgroupName(String adgroupName) {
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

  public FilteringAdgroupGet bidStrategy(String bidStrategy) {
    this.bidStrategy = bidStrategy;
    return this;
  }

   /**
   * Get bidStrategy
   * @return bidStrategy
  **/
  @Schema(description = "")
  public String getBidStrategy() {
    return bidStrategy;
  }

  public void setBidStrategy(String bidStrategy) {
    this.bidStrategy = bidStrategy;
  }

  public FilteringAdgroupGet billingEvents(List<String> billingEvents) {
    this.billingEvents = billingEvents;
    return this;
  }

  public FilteringAdgroupGet addBillingEventsItem(String billingEventsItem) {
    if (this.billingEvents == null) {
      this.billingEvents = new ArrayList<String>();
    }
    this.billingEvents.add(billingEventsItem);
    return this;
  }

   /**
   * Get billingEvents
   * @return billingEvents
  **/
  @Schema(description = "")
  public List<String> getBillingEvents() {
    return billingEvents;
  }

  public void setBillingEvents(List<String> billingEvents) {
    this.billingEvents = billingEvents;
  }

  public FilteringAdgroupGet buyingTypes(List<String> buyingTypes) {
    this.buyingTypes = buyingTypes;
    return this;
  }

  public FilteringAdgroupGet addBuyingTypesItem(String buyingTypesItem) {
    if (this.buyingTypes == null) {
      this.buyingTypes = new ArrayList<String>();
    }
    this.buyingTypes.add(buyingTypesItem);
    return this;
  }

   /**
   * Get buyingTypes
   * @return buyingTypes
  **/
  @Schema(description = "")
  public List<String> getBuyingTypes() {
    return buyingTypes;
  }

  public void setBuyingTypes(List<String> buyingTypes) {
    this.buyingTypes = buyingTypes;
  }

  public FilteringAdgroupGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringAdgroupGet addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @Schema(description = "")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public FilteringAdgroupGet campaignSystemOrigins(List<String> campaignSystemOrigins) {
    this.campaignSystemOrigins = campaignSystemOrigins;
    return this;
  }

  public FilteringAdgroupGet addCampaignSystemOriginsItem(String campaignSystemOriginsItem) {
    if (this.campaignSystemOrigins == null) {
      this.campaignSystemOrigins = new ArrayList<String>();
    }
    this.campaignSystemOrigins.add(campaignSystemOriginsItem);
    return this;
  }

   /**
   * Get campaignSystemOrigins
   * @return campaignSystemOrigins
  **/
  @Schema(description = "")
  public List<String> getCampaignSystemOrigins() {
    return campaignSystemOrigins;
  }

  public void setCampaignSystemOrigins(List<String> campaignSystemOrigins) {
    this.campaignSystemOrigins = campaignSystemOrigins;
  }

  public FilteringAdgroupGet creationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
    return this;
  }

   /**
   * Get creationFilterEndTime
   * @return creationFilterEndTime
  **/
  @Schema(description = "")
  public String getCreationFilterEndTime() {
    return creationFilterEndTime;
  }

  public void setCreationFilterEndTime(String creationFilterEndTime) {
    this.creationFilterEndTime = creationFilterEndTime;
  }

  public FilteringAdgroupGet creationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
    return this;
  }

   /**
   * Get creationFilterStartTime
   * @return creationFilterStartTime
  **/
  @Schema(description = "")
  public String getCreationFilterStartTime() {
    return creationFilterStartTime;
  }

  public void setCreationFilterStartTime(String creationFilterStartTime) {
    this.creationFilterStartTime = creationFilterStartTime;
  }

  public FilteringAdgroupGet creativeMaterialMode(String creativeMaterialMode) {
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

  public FilteringAdgroupGet objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  @Schema(description = "")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }

  public FilteringAdgroupGet optimizationGoal(String optimizationGoal) {
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

  public FilteringAdgroupGet primaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
    return this;
  }

   /**
   * Get primaryStatus
   * @return primaryStatus
  **/
  @Schema(description = "")
  public String getPrimaryStatus() {
    return primaryStatus;
  }

  public void setPrimaryStatus(String primaryStatus) {
    this.primaryStatus = primaryStatus;
  }

  public FilteringAdgroupGet promotionType(String promotionType) {
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

  public FilteringAdgroupGet secondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }

   /**
   * Get secondaryStatus
   * @return secondaryStatus
  **/
  @Schema(description = "")
  public String getSecondaryStatus() {
    return secondaryStatus;
  }

  public void setSecondaryStatus(String secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }

  public FilteringAdgroupGet splitTestEnabled(Boolean splitTestEnabled) {
    this.splitTestEnabled = splitTestEnabled;
    return this;
  }

   /**
   * Get splitTestEnabled
   * @return splitTestEnabled
  **/
  @Schema(description = "")
  public Boolean isSplitTestEnabled() {
    return splitTestEnabled;
  }

  public void setSplitTestEnabled(Boolean splitTestEnabled) {
    this.splitTestEnabled = splitTestEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringAdgroupGet filteringAdgroupGet = (FilteringAdgroupGet) o;
    return Objects.equals(this.adgroupIds, filteringAdgroupGet.adgroupIds) &&
        Objects.equals(this.adgroupName, filteringAdgroupGet.adgroupName) &&
        Objects.equals(this.bidStrategy, filteringAdgroupGet.bidStrategy) &&
        Objects.equals(this.billingEvents, filteringAdgroupGet.billingEvents) &&
        Objects.equals(this.buyingTypes, filteringAdgroupGet.buyingTypes) &&
        Objects.equals(this.campaignIds, filteringAdgroupGet.campaignIds) &&
        Objects.equals(this.campaignSystemOrigins, filteringAdgroupGet.campaignSystemOrigins) &&
        Objects.equals(this.creationFilterEndTime, filteringAdgroupGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringAdgroupGet.creationFilterStartTime) &&
        Objects.equals(this.creativeMaterialMode, filteringAdgroupGet.creativeMaterialMode) &&
        Objects.equals(this.objectiveType, filteringAdgroupGet.objectiveType) &&
        Objects.equals(this.optimizationGoal, filteringAdgroupGet.optimizationGoal) &&
        Objects.equals(this.primaryStatus, filteringAdgroupGet.primaryStatus) &&
        Objects.equals(this.promotionType, filteringAdgroupGet.promotionType) &&
        Objects.equals(this.secondaryStatus, filteringAdgroupGet.secondaryStatus) &&
        Objects.equals(this.splitTestEnabled, filteringAdgroupGet.splitTestEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, adgroupName, bidStrategy, billingEvents, buyingTypes, campaignIds, campaignSystemOrigins, creationFilterEndTime, creationFilterStartTime, creativeMaterialMode, objectiveType, optimizationGoal, primaryStatus, promotionType, secondaryStatus, splitTestEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringAdgroupGet {\n");
    
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    bidStrategy: ").append(toIndentedString(bidStrategy)).append("\n");
    sb.append("    billingEvents: ").append(toIndentedString(billingEvents)).append("\n");
    sb.append("    buyingTypes: ").append(toIndentedString(buyingTypes)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignSystemOrigins: ").append(toIndentedString(campaignSystemOrigins)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
    sb.append("    splitTestEnabled: ").append(toIndentedString(splitTestEnabled)).append("\n");
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
