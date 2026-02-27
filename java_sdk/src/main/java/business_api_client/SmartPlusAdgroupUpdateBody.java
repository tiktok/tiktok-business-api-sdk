/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdgroupCreateBodyTargetingSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SmartPlusAdgroupUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class SmartPlusAdgroupUpdateBody {
  @JsonProperty("adgroup_id")
  private String adgroupId = null;

  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("bid_price")
  private Double bidPrice = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("comment_disabled")
  private Boolean commentDisabled = null;

  @JsonProperty("conversion_bid_price")
  private Double conversionBidPrice = null;

  @JsonProperty("dayparting")
  private String dayparting = null;

  @JsonProperty("min_budget")
  private Double minBudget = null;

  @JsonProperty("movie_premiere_date")
  private String moviePremiereDate = null;

  @JsonProperty("pacing")
  private String pacing = null;

  @JsonProperty("roas_bid")
  private Double roasBid = null;

  @JsonProperty("schedule_end_time")
  private String scheduleEndTime = null;

  @JsonProperty("schedule_start_time")
  private String scheduleStartTime = null;

  @JsonProperty("schedule_type")
  private String scheduleType = null;

  @JsonProperty("share_disabled")
  private Boolean shareDisabled = null;

  @JsonProperty("suggestion_audience_enabled")
  private Boolean suggestionAudienceEnabled = null;

  @JsonProperty("targeting_optimization_mode")
  private String targetingOptimizationMode = null;

  @JsonProperty("targeting_spec")
  private SmartPlusAdgroupCreateBodyTargetingSpec targetingSpec = null;

  public SmartPlusAdgroupUpdateBody adgroupId(String adgroupId) {
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

  public SmartPlusAdgroupUpdateBody adgroupName(String adgroupName) {
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

  public SmartPlusAdgroupUpdateBody advertiserId(String advertiserId) {
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

  public SmartPlusAdgroupUpdateBody bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @Schema(description = "")
  public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public SmartPlusAdgroupUpdateBody budget(Double budget) {
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

  public SmartPlusAdgroupUpdateBody commentDisabled(Boolean commentDisabled) {
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

  public SmartPlusAdgroupUpdateBody conversionBidPrice(Double conversionBidPrice) {
    this.conversionBidPrice = conversionBidPrice;
    return this;
  }

   /**
   * Get conversionBidPrice
   * @return conversionBidPrice
  **/
  @Schema(description = "")
  public Double getConversionBidPrice() {
    return conversionBidPrice;
  }

  public void setConversionBidPrice(Double conversionBidPrice) {
    this.conversionBidPrice = conversionBidPrice;
  }

  public SmartPlusAdgroupUpdateBody dayparting(String dayparting) {
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

  public SmartPlusAdgroupUpdateBody minBudget(Double minBudget) {
    this.minBudget = minBudget;
    return this;
  }

   /**
   * Get minBudget
   * @return minBudget
  **/
  @Schema(description = "")
  public Double getMinBudget() {
    return minBudget;
  }

  public void setMinBudget(Double minBudget) {
    this.minBudget = minBudget;
  }

  public SmartPlusAdgroupUpdateBody moviePremiereDate(String moviePremiereDate) {
    this.moviePremiereDate = moviePremiereDate;
    return this;
  }

   /**
   * Get moviePremiereDate
   * @return moviePremiereDate
  **/
  @Schema(description = "")
  public String getMoviePremiereDate() {
    return moviePremiereDate;
  }

  public void setMoviePremiereDate(String moviePremiereDate) {
    this.moviePremiereDate = moviePremiereDate;
  }

  public SmartPlusAdgroupUpdateBody pacing(String pacing) {
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

  public SmartPlusAdgroupUpdateBody roasBid(Double roasBid) {
    this.roasBid = roasBid;
    return this;
  }

   /**
   * Get roasBid
   * @return roasBid
  **/
  @Schema(description = "")
  public Double getRoasBid() {
    return roasBid;
  }

  public void setRoasBid(Double roasBid) {
    this.roasBid = roasBid;
  }

  public SmartPlusAdgroupUpdateBody scheduleEndTime(String scheduleEndTime) {
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

  public SmartPlusAdgroupUpdateBody scheduleStartTime(String scheduleStartTime) {
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

  public SmartPlusAdgroupUpdateBody scheduleType(String scheduleType) {
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

  public SmartPlusAdgroupUpdateBody shareDisabled(Boolean shareDisabled) {
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

  public SmartPlusAdgroupUpdateBody suggestionAudienceEnabled(Boolean suggestionAudienceEnabled) {
    this.suggestionAudienceEnabled = suggestionAudienceEnabled;
    return this;
  }

   /**
   * Get suggestionAudienceEnabled
   * @return suggestionAudienceEnabled
  **/
  @Schema(description = "")
  public Boolean isSuggestionAudienceEnabled() {
    return suggestionAudienceEnabled;
  }

  public void setSuggestionAudienceEnabled(Boolean suggestionAudienceEnabled) {
    this.suggestionAudienceEnabled = suggestionAudienceEnabled;
  }

  public SmartPlusAdgroupUpdateBody targetingOptimizationMode(String targetingOptimizationMode) {
    this.targetingOptimizationMode = targetingOptimizationMode;
    return this;
  }

   /**
   * Get targetingOptimizationMode
   * @return targetingOptimizationMode
  **/
  @Schema(description = "")
  public String getTargetingOptimizationMode() {
    return targetingOptimizationMode;
  }

  public void setTargetingOptimizationMode(String targetingOptimizationMode) {
    this.targetingOptimizationMode = targetingOptimizationMode;
  }

  public SmartPlusAdgroupUpdateBody targetingSpec(SmartPlusAdgroupCreateBodyTargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @Schema(description = "")
  public SmartPlusAdgroupCreateBodyTargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(SmartPlusAdgroupCreateBodyTargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdgroupUpdateBody smartPlusAdgroupUpdateBody = (SmartPlusAdgroupUpdateBody) o;
    return Objects.equals(this.adgroupId, smartPlusAdgroupUpdateBody.adgroupId) &&
        Objects.equals(this.adgroupName, smartPlusAdgroupUpdateBody.adgroupName) &&
        Objects.equals(this.advertiserId, smartPlusAdgroupUpdateBody.advertiserId) &&
        Objects.equals(this.bidPrice, smartPlusAdgroupUpdateBody.bidPrice) &&
        Objects.equals(this.budget, smartPlusAdgroupUpdateBody.budget) &&
        Objects.equals(this.commentDisabled, smartPlusAdgroupUpdateBody.commentDisabled) &&
        Objects.equals(this.conversionBidPrice, smartPlusAdgroupUpdateBody.conversionBidPrice) &&
        Objects.equals(this.dayparting, smartPlusAdgroupUpdateBody.dayparting) &&
        Objects.equals(this.minBudget, smartPlusAdgroupUpdateBody.minBudget) &&
        Objects.equals(this.moviePremiereDate, smartPlusAdgroupUpdateBody.moviePremiereDate) &&
        Objects.equals(this.pacing, smartPlusAdgroupUpdateBody.pacing) &&
        Objects.equals(this.roasBid, smartPlusAdgroupUpdateBody.roasBid) &&
        Objects.equals(this.scheduleEndTime, smartPlusAdgroupUpdateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, smartPlusAdgroupUpdateBody.scheduleStartTime) &&
        Objects.equals(this.scheduleType, smartPlusAdgroupUpdateBody.scheduleType) &&
        Objects.equals(this.shareDisabled, smartPlusAdgroupUpdateBody.shareDisabled) &&
        Objects.equals(this.suggestionAudienceEnabled, smartPlusAdgroupUpdateBody.suggestionAudienceEnabled) &&
        Objects.equals(this.targetingOptimizationMode, smartPlusAdgroupUpdateBody.targetingOptimizationMode) &&
        Objects.equals(this.targetingSpec, smartPlusAdgroupUpdateBody.targetingSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, adgroupName, advertiserId, bidPrice, budget, commentDisabled, conversionBidPrice, dayparting, minBudget, moviePremiereDate, pacing, roasBid, scheduleEndTime, scheduleStartTime, scheduleType, shareDisabled, suggestionAudienceEnabled, targetingOptimizationMode, targetingSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdgroupUpdateBody {\n");
    
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    commentDisabled: ").append(toIndentedString(commentDisabled)).append("\n");
    sb.append("    conversionBidPrice: ").append(toIndentedString(conversionBidPrice)).append("\n");
    sb.append("    dayparting: ").append(toIndentedString(dayparting)).append("\n");
    sb.append("    minBudget: ").append(toIndentedString(minBudget)).append("\n");
    sb.append("    moviePremiereDate: ").append(toIndentedString(moviePremiereDate)).append("\n");
    sb.append("    pacing: ").append(toIndentedString(pacing)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    shareDisabled: ").append(toIndentedString(shareDisabled)).append("\n");
    sb.append("    suggestionAudienceEnabled: ").append(toIndentedString(suggestionAudienceEnabled)).append("\n");
    sb.append("    targetingOptimizationMode: ").append(toIndentedString(targetingOptimizationMode)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
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
