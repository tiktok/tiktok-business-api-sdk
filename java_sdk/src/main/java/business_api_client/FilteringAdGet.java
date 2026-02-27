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
 * FilteringAdGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class FilteringAdGet {
  @JsonProperty("ad_ids")
  private List<String> adIds = null;

  @JsonProperty("ad_name")
  private String adName = null;

  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

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

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("modified_after")
  private String modifiedAfter = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("primary_status")
  private String primaryStatus = "STATUS_NOT_DELETE";

  @JsonProperty("secondary_status")
  private String secondaryStatus = null;

  public FilteringAdGet adIds(List<String> adIds) {
    this.adIds = adIds;
    return this;
  }

  public FilteringAdGet addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<String>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * Get adIds
   * @return adIds
  **/
  @Schema(description = "")
  public List<String> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  public FilteringAdGet adName(String adName) {
    this.adName = adName;
    return this;
  }

   /**
   * Get adName
   * @return adName
  **/
  @Schema(description = "")
  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public FilteringAdGet adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringAdGet addAdgroupIdsItem(String adgroupIdsItem) {
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

  public FilteringAdGet buyingTypes(List<String> buyingTypes) {
    this.buyingTypes = buyingTypes;
    return this;
  }

  public FilteringAdGet addBuyingTypesItem(String buyingTypesItem) {
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

  public FilteringAdGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringAdGet addCampaignIdsItem(String campaignIdsItem) {
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

  public FilteringAdGet campaignSystemOrigins(List<String> campaignSystemOrigins) {
    this.campaignSystemOrigins = campaignSystemOrigins;
    return this;
  }

  public FilteringAdGet addCampaignSystemOriginsItem(String campaignSystemOriginsItem) {
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

  public FilteringAdGet creationFilterEndTime(String creationFilterEndTime) {
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

  public FilteringAdGet creationFilterStartTime(String creationFilterStartTime) {
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

  public FilteringAdGet creativeMaterialMode(String creativeMaterialMode) {
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

  public FilteringAdGet destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public FilteringAdGet modifiedAfter(String modifiedAfter) {
    this.modifiedAfter = modifiedAfter;
    return this;
  }

   /**
   * Get modifiedAfter
   * @return modifiedAfter
  **/
  @Schema(description = "")
  public String getModifiedAfter() {
    return modifiedAfter;
  }

  public void setModifiedAfter(String modifiedAfter) {
    this.modifiedAfter = modifiedAfter;
  }

  public FilteringAdGet objectiveType(String objectiveType) {
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

  public FilteringAdGet optimizationGoal(String optimizationGoal) {
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

  public FilteringAdGet primaryStatus(String primaryStatus) {
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

  public FilteringAdGet secondaryStatus(String secondaryStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringAdGet filteringAdGet = (FilteringAdGet) o;
    return Objects.equals(this.adIds, filteringAdGet.adIds) &&
        Objects.equals(this.adName, filteringAdGet.adName) &&
        Objects.equals(this.adgroupIds, filteringAdGet.adgroupIds) &&
        Objects.equals(this.buyingTypes, filteringAdGet.buyingTypes) &&
        Objects.equals(this.campaignIds, filteringAdGet.campaignIds) &&
        Objects.equals(this.campaignSystemOrigins, filteringAdGet.campaignSystemOrigins) &&
        Objects.equals(this.creationFilterEndTime, filteringAdGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringAdGet.creationFilterStartTime) &&
        Objects.equals(this.creativeMaterialMode, filteringAdGet.creativeMaterialMode) &&
        Objects.equals(this.destination, filteringAdGet.destination) &&
        Objects.equals(this.modifiedAfter, filteringAdGet.modifiedAfter) &&
        Objects.equals(this.objectiveType, filteringAdGet.objectiveType) &&
        Objects.equals(this.optimizationGoal, filteringAdGet.optimizationGoal) &&
        Objects.equals(this.primaryStatus, filteringAdGet.primaryStatus) &&
        Objects.equals(this.secondaryStatus, filteringAdGet.secondaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, adName, adgroupIds, buyingTypes, campaignIds, campaignSystemOrigins, creationFilterEndTime, creationFilterStartTime, creativeMaterialMode, destination, modifiedAfter, objectiveType, optimizationGoal, primaryStatus, secondaryStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringAdGet {\n");
    
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    buyingTypes: ").append(toIndentedString(buyingTypes)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignSystemOrigins: ").append(toIndentedString(campaignSystemOrigins)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    modifiedAfter: ").append(toIndentedString(modifiedAfter)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
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
