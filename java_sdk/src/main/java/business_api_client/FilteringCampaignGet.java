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
 * FilteringCampaignGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class FilteringCampaignGet {
  @JsonProperty("buying_types")
  private List<String> buyingTypes = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("campaign_product_source")
  private String campaignProductSource = null;

  @JsonProperty("campaign_system_origins")
  private List<String> campaignSystemOrigins = null;

  @JsonProperty("campaign_type")
  private String campaignType = null;

  @JsonProperty("creation_filter_end_time")
  private String creationFilterEndTime = null;

  @JsonProperty("creation_filter_start_time")
  private String creationFilterStartTime = null;

  @JsonProperty("creative_campaign_type")
  private List<String> creativeCampaignType = null;

  @JsonProperty("is_smart_performance_campaign")
  private Boolean isSmartPerformanceCampaign = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("primary_status")
  private String primaryStatus = null;

  @JsonProperty("sales_destination")
  private String salesDestination = null;

  @JsonProperty("secondary_status")
  private String secondaryStatus = null;

  @JsonProperty("split_test_enabled")
  private Boolean splitTestEnabled = null;

  public FilteringCampaignGet buyingTypes(List<String> buyingTypes) {
    this.buyingTypes = buyingTypes;
    return this;
  }

  public FilteringCampaignGet addBuyingTypesItem(String buyingTypesItem) {
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

  public FilteringCampaignGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringCampaignGet addCampaignIdsItem(String campaignIdsItem) {
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

  public FilteringCampaignGet campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @Schema(description = "")
  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public FilteringCampaignGet campaignProductSource(String campaignProductSource) {
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

  public FilteringCampaignGet campaignSystemOrigins(List<String> campaignSystemOrigins) {
    this.campaignSystemOrigins = campaignSystemOrigins;
    return this;
  }

  public FilteringCampaignGet addCampaignSystemOriginsItem(String campaignSystemOriginsItem) {
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

  public FilteringCampaignGet campaignType(String campaignType) {
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

  public FilteringCampaignGet creationFilterEndTime(String creationFilterEndTime) {
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

  public FilteringCampaignGet creationFilterStartTime(String creationFilterStartTime) {
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

  public FilteringCampaignGet creativeCampaignType(List<String> creativeCampaignType) {
    this.creativeCampaignType = creativeCampaignType;
    return this;
  }

  public FilteringCampaignGet addCreativeCampaignTypeItem(String creativeCampaignTypeItem) {
    if (this.creativeCampaignType == null) {
      this.creativeCampaignType = new ArrayList<String>();
    }
    this.creativeCampaignType.add(creativeCampaignTypeItem);
    return this;
  }

   /**
   * Get creativeCampaignType
   * @return creativeCampaignType
  **/
  @Schema(description = "")
  public List<String> getCreativeCampaignType() {
    return creativeCampaignType;
  }

  public void setCreativeCampaignType(List<String> creativeCampaignType) {
    this.creativeCampaignType = creativeCampaignType;
  }

  public FilteringCampaignGet isSmartPerformanceCampaign(Boolean isSmartPerformanceCampaign) {
    this.isSmartPerformanceCampaign = isSmartPerformanceCampaign;
    return this;
  }

   /**
   * Get isSmartPerformanceCampaign
   * @return isSmartPerformanceCampaign
  **/
  @Schema(description = "")
  public Boolean isIsSmartPerformanceCampaign() {
    return isSmartPerformanceCampaign;
  }

  public void setIsSmartPerformanceCampaign(Boolean isSmartPerformanceCampaign) {
    this.isSmartPerformanceCampaign = isSmartPerformanceCampaign;
  }

  public FilteringCampaignGet objectiveType(String objectiveType) {
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

  public FilteringCampaignGet optimizationGoal(String optimizationGoal) {
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

  public FilteringCampaignGet primaryStatus(String primaryStatus) {
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

  public FilteringCampaignGet salesDestination(String salesDestination) {
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

  public FilteringCampaignGet secondaryStatus(String secondaryStatus) {
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

  public FilteringCampaignGet splitTestEnabled(Boolean splitTestEnabled) {
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
    FilteringCampaignGet filteringCampaignGet = (FilteringCampaignGet) o;
    return Objects.equals(this.buyingTypes, filteringCampaignGet.buyingTypes) &&
        Objects.equals(this.campaignIds, filteringCampaignGet.campaignIds) &&
        Objects.equals(this.campaignName, filteringCampaignGet.campaignName) &&
        Objects.equals(this.campaignProductSource, filteringCampaignGet.campaignProductSource) &&
        Objects.equals(this.campaignSystemOrigins, filteringCampaignGet.campaignSystemOrigins) &&
        Objects.equals(this.campaignType, filteringCampaignGet.campaignType) &&
        Objects.equals(this.creationFilterEndTime, filteringCampaignGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringCampaignGet.creationFilterStartTime) &&
        Objects.equals(this.creativeCampaignType, filteringCampaignGet.creativeCampaignType) &&
        Objects.equals(this.isSmartPerformanceCampaign, filteringCampaignGet.isSmartPerformanceCampaign) &&
        Objects.equals(this.objectiveType, filteringCampaignGet.objectiveType) &&
        Objects.equals(this.optimizationGoal, filteringCampaignGet.optimizationGoal) &&
        Objects.equals(this.primaryStatus, filteringCampaignGet.primaryStatus) &&
        Objects.equals(this.salesDestination, filteringCampaignGet.salesDestination) &&
        Objects.equals(this.secondaryStatus, filteringCampaignGet.secondaryStatus) &&
        Objects.equals(this.splitTestEnabled, filteringCampaignGet.splitTestEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingTypes, campaignIds, campaignName, campaignProductSource, campaignSystemOrigins, campaignType, creationFilterEndTime, creationFilterStartTime, creativeCampaignType, isSmartPerformanceCampaign, objectiveType, optimizationGoal, primaryStatus, salesDestination, secondaryStatus, splitTestEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringCampaignGet {\n");
    
    sb.append("    buyingTypes: ").append(toIndentedString(buyingTypes)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignProductSource: ").append(toIndentedString(campaignProductSource)).append("\n");
    sb.append("    campaignSystemOrigins: ").append(toIndentedString(campaignSystemOrigins)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    creativeCampaignType: ").append(toIndentedString(creativeCampaignType)).append("\n");
    sb.append("    isSmartPerformanceCampaign: ").append(toIndentedString(isSmartPerformanceCampaign)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    salesDestination: ").append(toIndentedString(salesDestination)).append("\n");
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
