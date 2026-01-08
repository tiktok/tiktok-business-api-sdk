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
 * FilteringSmartPlusAdGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class FilteringSmartPlusAdGet {
  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("creation_filter_end_time")
  private String creationFilterEndTime = null;

  @JsonProperty("creation_filter_start_time")
  private String creationFilterStartTime = null;

  @JsonProperty("modified_after")
  private String modifiedAfter = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("primary_status")
  private String primaryStatus = null;

  @JsonProperty("secondary_status")
  private String secondaryStatus = null;

  @JsonProperty("smart_plus_ad_ids")
  private List<String> smartPlusAdIds = null;

  public FilteringSmartPlusAdGet adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringSmartPlusAdGet addAdgroupIdsItem(String adgroupIdsItem) {
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

  public FilteringSmartPlusAdGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringSmartPlusAdGet addCampaignIdsItem(String campaignIdsItem) {
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

  public FilteringSmartPlusAdGet creationFilterEndTime(String creationFilterEndTime) {
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

  public FilteringSmartPlusAdGet creationFilterStartTime(String creationFilterStartTime) {
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

  public FilteringSmartPlusAdGet modifiedAfter(String modifiedAfter) {
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

  public FilteringSmartPlusAdGet objectiveType(String objectiveType) {
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

  public FilteringSmartPlusAdGet optimizationGoal(String optimizationGoal) {
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

  public FilteringSmartPlusAdGet primaryStatus(String primaryStatus) {
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

  public FilteringSmartPlusAdGet secondaryStatus(String secondaryStatus) {
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

  public FilteringSmartPlusAdGet smartPlusAdIds(List<String> smartPlusAdIds) {
    this.smartPlusAdIds = smartPlusAdIds;
    return this;
  }

  public FilteringSmartPlusAdGet addSmartPlusAdIdsItem(String smartPlusAdIdsItem) {
    if (this.smartPlusAdIds == null) {
      this.smartPlusAdIds = new ArrayList<String>();
    }
    this.smartPlusAdIds.add(smartPlusAdIdsItem);
    return this;
  }

   /**
   * Get smartPlusAdIds
   * @return smartPlusAdIds
  **/
  @Schema(description = "")
  public List<String> getSmartPlusAdIds() {
    return smartPlusAdIds;
  }

  public void setSmartPlusAdIds(List<String> smartPlusAdIds) {
    this.smartPlusAdIds = smartPlusAdIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringSmartPlusAdGet filteringSmartPlusAdGet = (FilteringSmartPlusAdGet) o;
    return Objects.equals(this.adgroupIds, filteringSmartPlusAdGet.adgroupIds) &&
        Objects.equals(this.campaignIds, filteringSmartPlusAdGet.campaignIds) &&
        Objects.equals(this.creationFilterEndTime, filteringSmartPlusAdGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringSmartPlusAdGet.creationFilterStartTime) &&
        Objects.equals(this.modifiedAfter, filteringSmartPlusAdGet.modifiedAfter) &&
        Objects.equals(this.objectiveType, filteringSmartPlusAdGet.objectiveType) &&
        Objects.equals(this.optimizationGoal, filteringSmartPlusAdGet.optimizationGoal) &&
        Objects.equals(this.primaryStatus, filteringSmartPlusAdGet.primaryStatus) &&
        Objects.equals(this.secondaryStatus, filteringSmartPlusAdGet.secondaryStatus) &&
        Objects.equals(this.smartPlusAdIds, filteringSmartPlusAdGet.smartPlusAdIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, campaignIds, creationFilterEndTime, creationFilterStartTime, modifiedAfter, objectiveType, optimizationGoal, primaryStatus, secondaryStatus, smartPlusAdIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringSmartPlusAdGet {\n");
    
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    modifiedAfter: ").append(toIndentedString(modifiedAfter)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
    sb.append("    smartPlusAdIds: ").append(toIndentedString(smartPlusAdIds)).append("\n");
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
