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
 * FilteringSmartPlusAdgroupGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class FilteringSmartPlusAdgroupGet {
  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = null;

  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("creation_filter_end_time")
  private String creationFilterEndTime = null;

  @JsonProperty("creation_filter_start_time")
  private String creationFilterStartTime = null;

  @JsonProperty("objective_type")
  private String objectiveType = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("primary_status")
  private String primaryStatus = null;

  @JsonProperty("promotion_type")
  private String promotionType = null;

  @JsonProperty("secondary_status")
  private String secondaryStatus = null;

  public FilteringSmartPlusAdgroupGet adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public FilteringSmartPlusAdgroupGet addAdgroupIdsItem(String adgroupIdsItem) {
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

  public FilteringSmartPlusAdgroupGet adgroupName(String adgroupName) {
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

  public FilteringSmartPlusAdgroupGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringSmartPlusAdgroupGet addCampaignIdsItem(String campaignIdsItem) {
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

  public FilteringSmartPlusAdgroupGet creationFilterEndTime(String creationFilterEndTime) {
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

  public FilteringSmartPlusAdgroupGet creationFilterStartTime(String creationFilterStartTime) {
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

  public FilteringSmartPlusAdgroupGet objectiveType(String objectiveType) {
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

  public FilteringSmartPlusAdgroupGet optimizationGoal(String optimizationGoal) {
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

  public FilteringSmartPlusAdgroupGet primaryStatus(String primaryStatus) {
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

  public FilteringSmartPlusAdgroupGet promotionType(String promotionType) {
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

  public FilteringSmartPlusAdgroupGet secondaryStatus(String secondaryStatus) {
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
    FilteringSmartPlusAdgroupGet filteringSmartPlusAdgroupGet = (FilteringSmartPlusAdgroupGet) o;
    return Objects.equals(this.adgroupIds, filteringSmartPlusAdgroupGet.adgroupIds) &&
        Objects.equals(this.adgroupName, filteringSmartPlusAdgroupGet.adgroupName) &&
        Objects.equals(this.campaignIds, filteringSmartPlusAdgroupGet.campaignIds) &&
        Objects.equals(this.creationFilterEndTime, filteringSmartPlusAdgroupGet.creationFilterEndTime) &&
        Objects.equals(this.creationFilterStartTime, filteringSmartPlusAdgroupGet.creationFilterStartTime) &&
        Objects.equals(this.objectiveType, filteringSmartPlusAdgroupGet.objectiveType) &&
        Objects.equals(this.optimizationGoal, filteringSmartPlusAdgroupGet.optimizationGoal) &&
        Objects.equals(this.primaryStatus, filteringSmartPlusAdgroupGet.primaryStatus) &&
        Objects.equals(this.promotionType, filteringSmartPlusAdgroupGet.promotionType) &&
        Objects.equals(this.secondaryStatus, filteringSmartPlusAdgroupGet.secondaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, adgroupName, campaignIds, creationFilterEndTime, creationFilterStartTime, objectiveType, optimizationGoal, primaryStatus, promotionType, secondaryStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringSmartPlusAdgroupGet {\n");
    
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    creationFilterEndTime: ").append(toIndentedString(creationFilterEndTime)).append("\n");
    sb.append("    creationFilterStartTime: ").append(toIndentedString(creationFilterStartTime)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    primaryStatus: ").append(toIndentedString(primaryStatus)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
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
