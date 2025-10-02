/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdgroupCreateBodyPhoneInfo;
import business_api_client.SmartPlusAdgroupCreateBodyTargetingSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartPlusAdgroupCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class SmartPlusAdgroupCreateBody {
  @JsonProperty("adgroup_name")
  private String adgroupName = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("attribution_event_count")
  private String attributionEventCount = null;

  @JsonProperty("bid_price")
  private Double bidPrice = null;

  @JsonProperty("bid_type")
  private String bidType = null;

  @JsonProperty("billing_event")
  private String billingEvent = null;

  @JsonProperty("budget")
  private Double budget = null;

  @JsonProperty("budget_mode")
  private String budgetMode = null;

  @JsonProperty("campaign_id")
  private String campaignId = null;

  @JsonProperty("catalog_authorized_bc_id")
  private String catalogAuthorizedBcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("click_attribution_window")
  private String clickAttributionWindow = null;

  @JsonProperty("comment_disabled")
  private Boolean commentDisabled = false;

  @JsonProperty("conversion_bid_price")
  private Double conversionBidPrice = null;

  @JsonProperty("custom_conversion_id")
  private String customConversionId = null;

  @JsonProperty("dayparting")
  private String dayparting = null;

  @JsonProperty("deep_bid_type")
  private String deepBidType = null;

  @JsonProperty("deep_cpabid")
  private Double deepCpabid = null;

  @JsonProperty("deep_funnel_event_source")
  private String deepFunnelEventSource = null;

  @JsonProperty("deep_funnel_event_source_id")
  private String deepFunnelEventSourceId = null;

  @JsonProperty("deep_funnel_optimization_event")
  private String deepFunnelOptimizationEvent = null;

  @JsonProperty("deep_funnel_optimization_status")
  private String deepFunnelOptimizationStatus = null;

  @JsonProperty("engaged_view_attribution_window")
  private String engagedViewAttributionWindow = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("message_event_set_id")
  private String messageEventSetId = null;

  @JsonProperty("messaging_app_account_id")
  private String messagingAppAccountId = null;

  @JsonProperty("messaging_app_type")
  private String messagingAppType = null;

  @JsonProperty("min_budget")
  private Double minBudget = null;

  @JsonProperty("movie_premiere_date")
  private String moviePremiereDate = null;

  @JsonProperty("open_api_partner")
  private String openApiPartner = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("optimization_event")
  private String optimizationEvent = null;

  @JsonProperty("optimization_goal")
  private String optimizationGoal = null;

  @JsonProperty("phone_info")
  private SmartPlusAdgroupCreateBodyPhoneInfo phoneInfo = null;

  @JsonProperty("pixel_id")
  private String pixelId = null;

  @JsonProperty("placement_type")
  private String placementType = null;

  @JsonProperty("placements")
  private List<String> placements = null;

  @JsonProperty("product_source")
  private String productSource = null;

  @JsonProperty("promotion_target_type")
  private String promotionTargetType = null;

  @JsonProperty("promotion_type")
  private String promotionType = null;

  @JsonProperty("promotion_website_type")
  private String promotionWebsiteType = null;

  @JsonProperty("request_id")
  private String requestId = null;

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

  @JsonProperty("vbo_window")
  private String vboWindow = null;

  @JsonProperty("video_download_disabled")
  private Boolean videoDownloadDisabled = null;

  @JsonProperty("view_attribution_window")
  private String viewAttributionWindow = null;

  @JsonProperty("zalo_id_type")
  private String zaloIdType = null;

  public SmartPlusAdgroupCreateBody adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @Schema(required = true, description = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public SmartPlusAdgroupCreateBody advertiserId(String advertiserId) {
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

  public SmartPlusAdgroupCreateBody appId(String appId) {
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

  public SmartPlusAdgroupCreateBody attributionEventCount(String attributionEventCount) {
    this.attributionEventCount = attributionEventCount;
    return this;
  }

   /**
   * Get attributionEventCount
   * @return attributionEventCount
  **/
  @Schema(description = "")
  public String getAttributionEventCount() {
    return attributionEventCount;
  }

  public void setAttributionEventCount(String attributionEventCount) {
    this.attributionEventCount = attributionEventCount;
  }

  public SmartPlusAdgroupCreateBody bidPrice(Double bidPrice) {
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

  public SmartPlusAdgroupCreateBody bidType(String bidType) {
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

  public SmartPlusAdgroupCreateBody billingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

   /**
   * Get billingEvent
   * @return billingEvent
  **/
  @Schema(required = true, description = "")
  public String getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
  }

  public SmartPlusAdgroupCreateBody budget(Double budget) {
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

  public SmartPlusAdgroupCreateBody budgetMode(String budgetMode) {
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

  public SmartPlusAdgroupCreateBody campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @Schema(required = true, description = "")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public SmartPlusAdgroupCreateBody catalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
    return this;
  }

   /**
   * Get catalogAuthorizedBcId
   * @return catalogAuthorizedBcId
  **/
  @Schema(description = "")
  public String getCatalogAuthorizedBcId() {
    return catalogAuthorizedBcId;
  }

  public void setCatalogAuthorizedBcId(String catalogAuthorizedBcId) {
    this.catalogAuthorizedBcId = catalogAuthorizedBcId;
  }

  public SmartPlusAdgroupCreateBody catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public SmartPlusAdgroupCreateBody clickAttributionWindow(String clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
    return this;
  }

   /**
   * Get clickAttributionWindow
   * @return clickAttributionWindow
  **/
  @Schema(description = "")
  public String getClickAttributionWindow() {
    return clickAttributionWindow;
  }

  public void setClickAttributionWindow(String clickAttributionWindow) {
    this.clickAttributionWindow = clickAttributionWindow;
  }

  public SmartPlusAdgroupCreateBody commentDisabled(Boolean commentDisabled) {
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

  public SmartPlusAdgroupCreateBody conversionBidPrice(Double conversionBidPrice) {
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

  public SmartPlusAdgroupCreateBody customConversionId(String customConversionId) {
    this.customConversionId = customConversionId;
    return this;
  }

   /**
   * Get customConversionId
   * @return customConversionId
  **/
  @Schema(description = "")
  public String getCustomConversionId() {
    return customConversionId;
  }

  public void setCustomConversionId(String customConversionId) {
    this.customConversionId = customConversionId;
  }

  public SmartPlusAdgroupCreateBody dayparting(String dayparting) {
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

  public SmartPlusAdgroupCreateBody deepBidType(String deepBidType) {
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

  public SmartPlusAdgroupCreateBody deepCpabid(Double deepCpabid) {
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * Get deepCpabid
   * @return deepCpabid
  **/
  @Schema(description = "")
  public Double getDeepCpabid() {
    return deepCpabid;
  }

  public void setDeepCpabid(Double deepCpabid) {
    this.deepCpabid = deepCpabid;
  }

  public SmartPlusAdgroupCreateBody deepFunnelEventSource(String deepFunnelEventSource) {
    this.deepFunnelEventSource = deepFunnelEventSource;
    return this;
  }

   /**
   * Get deepFunnelEventSource
   * @return deepFunnelEventSource
  **/
  @Schema(description = "")
  public String getDeepFunnelEventSource() {
    return deepFunnelEventSource;
  }

  public void setDeepFunnelEventSource(String deepFunnelEventSource) {
    this.deepFunnelEventSource = deepFunnelEventSource;
  }

  public SmartPlusAdgroupCreateBody deepFunnelEventSourceId(String deepFunnelEventSourceId) {
    this.deepFunnelEventSourceId = deepFunnelEventSourceId;
    return this;
  }

   /**
   * Get deepFunnelEventSourceId
   * @return deepFunnelEventSourceId
  **/
  @Schema(description = "")
  public String getDeepFunnelEventSourceId() {
    return deepFunnelEventSourceId;
  }

  public void setDeepFunnelEventSourceId(String deepFunnelEventSourceId) {
    this.deepFunnelEventSourceId = deepFunnelEventSourceId;
  }

  public SmartPlusAdgroupCreateBody deepFunnelOptimizationEvent(String deepFunnelOptimizationEvent) {
    this.deepFunnelOptimizationEvent = deepFunnelOptimizationEvent;
    return this;
  }

   /**
   * Get deepFunnelOptimizationEvent
   * @return deepFunnelOptimizationEvent
  **/
  @Schema(description = "")
  public String getDeepFunnelOptimizationEvent() {
    return deepFunnelOptimizationEvent;
  }

  public void setDeepFunnelOptimizationEvent(String deepFunnelOptimizationEvent) {
    this.deepFunnelOptimizationEvent = deepFunnelOptimizationEvent;
  }

  public SmartPlusAdgroupCreateBody deepFunnelOptimizationStatus(String deepFunnelOptimizationStatus) {
    this.deepFunnelOptimizationStatus = deepFunnelOptimizationStatus;
    return this;
  }

   /**
   * Get deepFunnelOptimizationStatus
   * @return deepFunnelOptimizationStatus
  **/
  @Schema(description = "")
  public String getDeepFunnelOptimizationStatus() {
    return deepFunnelOptimizationStatus;
  }

  public void setDeepFunnelOptimizationStatus(String deepFunnelOptimizationStatus) {
    this.deepFunnelOptimizationStatus = deepFunnelOptimizationStatus;
  }

  public SmartPlusAdgroupCreateBody engagedViewAttributionWindow(String engagedViewAttributionWindow) {
    this.engagedViewAttributionWindow = engagedViewAttributionWindow;
    return this;
  }

   /**
   * Get engagedViewAttributionWindow
   * @return engagedViewAttributionWindow
  **/
  @Schema(description = "")
  public String getEngagedViewAttributionWindow() {
    return engagedViewAttributionWindow;
  }

  public void setEngagedViewAttributionWindow(String engagedViewAttributionWindow) {
    this.engagedViewAttributionWindow = engagedViewAttributionWindow;
  }

  public SmartPlusAdgroupCreateBody identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * Get identityAuthorizedBcId
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public SmartPlusAdgroupCreateBody identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public SmartPlusAdgroupCreateBody identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public SmartPlusAdgroupCreateBody messageEventSetId(String messageEventSetId) {
    this.messageEventSetId = messageEventSetId;
    return this;
  }

   /**
   * Get messageEventSetId
   * @return messageEventSetId
  **/
  @Schema(description = "")
  public String getMessageEventSetId() {
    return messageEventSetId;
  }

  public void setMessageEventSetId(String messageEventSetId) {
    this.messageEventSetId = messageEventSetId;
  }

  public SmartPlusAdgroupCreateBody messagingAppAccountId(String messagingAppAccountId) {
    this.messagingAppAccountId = messagingAppAccountId;
    return this;
  }

   /**
   * Get messagingAppAccountId
   * @return messagingAppAccountId
  **/
  @Schema(description = "")
  public String getMessagingAppAccountId() {
    return messagingAppAccountId;
  }

  public void setMessagingAppAccountId(String messagingAppAccountId) {
    this.messagingAppAccountId = messagingAppAccountId;
  }

  public SmartPlusAdgroupCreateBody messagingAppType(String messagingAppType) {
    this.messagingAppType = messagingAppType;
    return this;
  }

   /**
   * Get messagingAppType
   * @return messagingAppType
  **/
  @Schema(description = "")
  public String getMessagingAppType() {
    return messagingAppType;
  }

  public void setMessagingAppType(String messagingAppType) {
    this.messagingAppType = messagingAppType;
  }

  public SmartPlusAdgroupCreateBody minBudget(Double minBudget) {
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

  public SmartPlusAdgroupCreateBody moviePremiereDate(String moviePremiereDate) {
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

  public SmartPlusAdgroupCreateBody openApiPartner(String openApiPartner) {
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

  public SmartPlusAdgroupCreateBody operationStatus(String operationStatus) {
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

  public SmartPlusAdgroupCreateBody optimizationEvent(String optimizationEvent) {
    this.optimizationEvent = optimizationEvent;
    return this;
  }

   /**
   * Get optimizationEvent
   * @return optimizationEvent
  **/
  @Schema(description = "")
  public String getOptimizationEvent() {
    return optimizationEvent;
  }

  public void setOptimizationEvent(String optimizationEvent) {
    this.optimizationEvent = optimizationEvent;
  }

  public SmartPlusAdgroupCreateBody optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

   /**
   * Get optimizationGoal
   * @return optimizationGoal
  **/
  @Schema(required = true, description = "")
  public String getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public SmartPlusAdgroupCreateBody phoneInfo(SmartPlusAdgroupCreateBodyPhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

   /**
   * Get phoneInfo
   * @return phoneInfo
  **/
  @Schema(description = "")
  public SmartPlusAdgroupCreateBodyPhoneInfo getPhoneInfo() {
    return phoneInfo;
  }

  public void setPhoneInfo(SmartPlusAdgroupCreateBodyPhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
  }

  public SmartPlusAdgroupCreateBody pixelId(String pixelId) {
    this.pixelId = pixelId;
    return this;
  }

   /**
   * Get pixelId
   * @return pixelId
  **/
  @Schema(description = "")
  public String getPixelId() {
    return pixelId;
  }

  public void setPixelId(String pixelId) {
    this.pixelId = pixelId;
  }

  public SmartPlusAdgroupCreateBody placementType(String placementType) {
    this.placementType = placementType;
    return this;
  }

   /**
   * Get placementType
   * @return placementType
  **/
  @Schema(description = "")
  public String getPlacementType() {
    return placementType;
  }

  public void setPlacementType(String placementType) {
    this.placementType = placementType;
  }

  public SmartPlusAdgroupCreateBody placements(List<String> placements) {
    this.placements = placements;
    return this;
  }

  public SmartPlusAdgroupCreateBody addPlacementsItem(String placementsItem) {
    if (this.placements == null) {
      this.placements = new ArrayList<String>();
    }
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Get placements
   * @return placements
  **/
  @Schema(description = "")
  public List<String> getPlacements() {
    return placements;
  }

  public void setPlacements(List<String> placements) {
    this.placements = placements;
  }

  public SmartPlusAdgroupCreateBody productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

   /**
   * Get productSource
   * @return productSource
  **/
  @Schema(description = "")
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }

  public SmartPlusAdgroupCreateBody promotionTargetType(String promotionTargetType) {
    this.promotionTargetType = promotionTargetType;
    return this;
  }

   /**
   * Get promotionTargetType
   * @return promotionTargetType
  **/
  @Schema(description = "")
  public String getPromotionTargetType() {
    return promotionTargetType;
  }

  public void setPromotionTargetType(String promotionTargetType) {
    this.promotionTargetType = promotionTargetType;
  }

  public SmartPlusAdgroupCreateBody promotionType(String promotionType) {
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Get promotionType
   * @return promotionType
  **/
  @Schema(required = true, description = "")
  public String getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(String promotionType) {
    this.promotionType = promotionType;
  }

  public SmartPlusAdgroupCreateBody promotionWebsiteType(String promotionWebsiteType) {
    this.promotionWebsiteType = promotionWebsiteType;
    return this;
  }

   /**
   * Get promotionWebsiteType
   * @return promotionWebsiteType
  **/
  @Schema(description = "")
  public String getPromotionWebsiteType() {
    return promotionWebsiteType;
  }

  public void setPromotionWebsiteType(String promotionWebsiteType) {
    this.promotionWebsiteType = promotionWebsiteType;
  }

  public SmartPlusAdgroupCreateBody requestId(String requestId) {
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

  public SmartPlusAdgroupCreateBody roasBid(Double roasBid) {
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

  public SmartPlusAdgroupCreateBody scheduleEndTime(String scheduleEndTime) {
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

  public SmartPlusAdgroupCreateBody scheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
    return this;
  }

   /**
   * Get scheduleStartTime
   * @return scheduleStartTime
  **/
  @Schema(required = true, description = "")
  public String getScheduleStartTime() {
    return scheduleStartTime;
  }

  public void setScheduleStartTime(String scheduleStartTime) {
    this.scheduleStartTime = scheduleStartTime;
  }

  public SmartPlusAdgroupCreateBody scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @Schema(required = true, description = "")
  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public SmartPlusAdgroupCreateBody shareDisabled(Boolean shareDisabled) {
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

  public SmartPlusAdgroupCreateBody suggestionAudienceEnabled(Boolean suggestionAudienceEnabled) {
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

  public SmartPlusAdgroupCreateBody targetingOptimizationMode(String targetingOptimizationMode) {
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

  public SmartPlusAdgroupCreateBody targetingSpec(SmartPlusAdgroupCreateBodyTargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @Schema(required = true, description = "")
  public SmartPlusAdgroupCreateBodyTargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(SmartPlusAdgroupCreateBodyTargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public SmartPlusAdgroupCreateBody vboWindow(String vboWindow) {
    this.vboWindow = vboWindow;
    return this;
  }

   /**
   * Get vboWindow
   * @return vboWindow
  **/
  @Schema(description = "")
  public String getVboWindow() {
    return vboWindow;
  }

  public void setVboWindow(String vboWindow) {
    this.vboWindow = vboWindow;
  }

  public SmartPlusAdgroupCreateBody videoDownloadDisabled(Boolean videoDownloadDisabled) {
    this.videoDownloadDisabled = videoDownloadDisabled;
    return this;
  }

   /**
   * Get videoDownloadDisabled
   * @return videoDownloadDisabled
  **/
  @Schema(description = "")
  public Boolean isVideoDownloadDisabled() {
    return videoDownloadDisabled;
  }

  public void setVideoDownloadDisabled(Boolean videoDownloadDisabled) {
    this.videoDownloadDisabled = videoDownloadDisabled;
  }

  public SmartPlusAdgroupCreateBody viewAttributionWindow(String viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
    return this;
  }

   /**
   * Get viewAttributionWindow
   * @return viewAttributionWindow
  **/
  @Schema(description = "")
  public String getViewAttributionWindow() {
    return viewAttributionWindow;
  }

  public void setViewAttributionWindow(String viewAttributionWindow) {
    this.viewAttributionWindow = viewAttributionWindow;
  }

  public SmartPlusAdgroupCreateBody zaloIdType(String zaloIdType) {
    this.zaloIdType = zaloIdType;
    return this;
  }

   /**
   * Get zaloIdType
   * @return zaloIdType
  **/
  @Schema(description = "")
  public String getZaloIdType() {
    return zaloIdType;
  }

  public void setZaloIdType(String zaloIdType) {
    this.zaloIdType = zaloIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdgroupCreateBody smartPlusAdgroupCreateBody = (SmartPlusAdgroupCreateBody) o;
    return Objects.equals(this.adgroupName, smartPlusAdgroupCreateBody.adgroupName) &&
        Objects.equals(this.advertiserId, smartPlusAdgroupCreateBody.advertiserId) &&
        Objects.equals(this.appId, smartPlusAdgroupCreateBody.appId) &&
        Objects.equals(this.attributionEventCount, smartPlusAdgroupCreateBody.attributionEventCount) &&
        Objects.equals(this.bidPrice, smartPlusAdgroupCreateBody.bidPrice) &&
        Objects.equals(this.bidType, smartPlusAdgroupCreateBody.bidType) &&
        Objects.equals(this.billingEvent, smartPlusAdgroupCreateBody.billingEvent) &&
        Objects.equals(this.budget, smartPlusAdgroupCreateBody.budget) &&
        Objects.equals(this.budgetMode, smartPlusAdgroupCreateBody.budgetMode) &&
        Objects.equals(this.campaignId, smartPlusAdgroupCreateBody.campaignId) &&
        Objects.equals(this.catalogAuthorizedBcId, smartPlusAdgroupCreateBody.catalogAuthorizedBcId) &&
        Objects.equals(this.catalogId, smartPlusAdgroupCreateBody.catalogId) &&
        Objects.equals(this.clickAttributionWindow, smartPlusAdgroupCreateBody.clickAttributionWindow) &&
        Objects.equals(this.commentDisabled, smartPlusAdgroupCreateBody.commentDisabled) &&
        Objects.equals(this.conversionBidPrice, smartPlusAdgroupCreateBody.conversionBidPrice) &&
        Objects.equals(this.customConversionId, smartPlusAdgroupCreateBody.customConversionId) &&
        Objects.equals(this.dayparting, smartPlusAdgroupCreateBody.dayparting) &&
        Objects.equals(this.deepBidType, smartPlusAdgroupCreateBody.deepBidType) &&
        Objects.equals(this.deepCpabid, smartPlusAdgroupCreateBody.deepCpabid) &&
        Objects.equals(this.deepFunnelEventSource, smartPlusAdgroupCreateBody.deepFunnelEventSource) &&
        Objects.equals(this.deepFunnelEventSourceId, smartPlusAdgroupCreateBody.deepFunnelEventSourceId) &&
        Objects.equals(this.deepFunnelOptimizationEvent, smartPlusAdgroupCreateBody.deepFunnelOptimizationEvent) &&
        Objects.equals(this.deepFunnelOptimizationStatus, smartPlusAdgroupCreateBody.deepFunnelOptimizationStatus) &&
        Objects.equals(this.engagedViewAttributionWindow, smartPlusAdgroupCreateBody.engagedViewAttributionWindow) &&
        Objects.equals(this.identityAuthorizedBcId, smartPlusAdgroupCreateBody.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, smartPlusAdgroupCreateBody.identityId) &&
        Objects.equals(this.identityType, smartPlusAdgroupCreateBody.identityType) &&
        Objects.equals(this.messageEventSetId, smartPlusAdgroupCreateBody.messageEventSetId) &&
        Objects.equals(this.messagingAppAccountId, smartPlusAdgroupCreateBody.messagingAppAccountId) &&
        Objects.equals(this.messagingAppType, smartPlusAdgroupCreateBody.messagingAppType) &&
        Objects.equals(this.minBudget, smartPlusAdgroupCreateBody.minBudget) &&
        Objects.equals(this.moviePremiereDate, smartPlusAdgroupCreateBody.moviePremiereDate) &&
        Objects.equals(this.openApiPartner, smartPlusAdgroupCreateBody.openApiPartner) &&
        Objects.equals(this.operationStatus, smartPlusAdgroupCreateBody.operationStatus) &&
        Objects.equals(this.optimizationEvent, smartPlusAdgroupCreateBody.optimizationEvent) &&
        Objects.equals(this.optimizationGoal, smartPlusAdgroupCreateBody.optimizationGoal) &&
        Objects.equals(this.phoneInfo, smartPlusAdgroupCreateBody.phoneInfo) &&
        Objects.equals(this.pixelId, smartPlusAdgroupCreateBody.pixelId) &&
        Objects.equals(this.placementType, smartPlusAdgroupCreateBody.placementType) &&
        Objects.equals(this.placements, smartPlusAdgroupCreateBody.placements) &&
        Objects.equals(this.productSource, smartPlusAdgroupCreateBody.productSource) &&
        Objects.equals(this.promotionTargetType, smartPlusAdgroupCreateBody.promotionTargetType) &&
        Objects.equals(this.promotionType, smartPlusAdgroupCreateBody.promotionType) &&
        Objects.equals(this.promotionWebsiteType, smartPlusAdgroupCreateBody.promotionWebsiteType) &&
        Objects.equals(this.requestId, smartPlusAdgroupCreateBody.requestId) &&
        Objects.equals(this.roasBid, smartPlusAdgroupCreateBody.roasBid) &&
        Objects.equals(this.scheduleEndTime, smartPlusAdgroupCreateBody.scheduleEndTime) &&
        Objects.equals(this.scheduleStartTime, smartPlusAdgroupCreateBody.scheduleStartTime) &&
        Objects.equals(this.scheduleType, smartPlusAdgroupCreateBody.scheduleType) &&
        Objects.equals(this.shareDisabled, smartPlusAdgroupCreateBody.shareDisabled) &&
        Objects.equals(this.suggestionAudienceEnabled, smartPlusAdgroupCreateBody.suggestionAudienceEnabled) &&
        Objects.equals(this.targetingOptimizationMode, smartPlusAdgroupCreateBody.targetingOptimizationMode) &&
        Objects.equals(this.targetingSpec, smartPlusAdgroupCreateBody.targetingSpec) &&
        Objects.equals(this.vboWindow, smartPlusAdgroupCreateBody.vboWindow) &&
        Objects.equals(this.videoDownloadDisabled, smartPlusAdgroupCreateBody.videoDownloadDisabled) &&
        Objects.equals(this.viewAttributionWindow, smartPlusAdgroupCreateBody.viewAttributionWindow) &&
        Objects.equals(this.zaloIdType, smartPlusAdgroupCreateBody.zaloIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupName, advertiserId, appId, attributionEventCount, bidPrice, bidType, billingEvent, budget, budgetMode, campaignId, catalogAuthorizedBcId, catalogId, clickAttributionWindow, commentDisabled, conversionBidPrice, customConversionId, dayparting, deepBidType, deepCpabid, deepFunnelEventSource, deepFunnelEventSourceId, deepFunnelOptimizationEvent, deepFunnelOptimizationStatus, engagedViewAttributionWindow, identityAuthorizedBcId, identityId, identityType, messageEventSetId, messagingAppAccountId, messagingAppType, minBudget, moviePremiereDate, openApiPartner, operationStatus, optimizationEvent, optimizationGoal, phoneInfo, pixelId, placementType, placements, productSource, promotionTargetType, promotionType, promotionWebsiteType, requestId, roasBid, scheduleEndTime, scheduleStartTime, scheduleType, shareDisabled, suggestionAudienceEnabled, targetingOptimizationMode, targetingSpec, vboWindow, videoDownloadDisabled, viewAttributionWindow, zaloIdType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdgroupCreateBody {\n");
    
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    attributionEventCount: ").append(toIndentedString(attributionEventCount)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    billingEvent: ").append(toIndentedString(billingEvent)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    catalogAuthorizedBcId: ").append(toIndentedString(catalogAuthorizedBcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    clickAttributionWindow: ").append(toIndentedString(clickAttributionWindow)).append("\n");
    sb.append("    commentDisabled: ").append(toIndentedString(commentDisabled)).append("\n");
    sb.append("    conversionBidPrice: ").append(toIndentedString(conversionBidPrice)).append("\n");
    sb.append("    customConversionId: ").append(toIndentedString(customConversionId)).append("\n");
    sb.append("    dayparting: ").append(toIndentedString(dayparting)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    deepFunnelEventSource: ").append(toIndentedString(deepFunnelEventSource)).append("\n");
    sb.append("    deepFunnelEventSourceId: ").append(toIndentedString(deepFunnelEventSourceId)).append("\n");
    sb.append("    deepFunnelOptimizationEvent: ").append(toIndentedString(deepFunnelOptimizationEvent)).append("\n");
    sb.append("    deepFunnelOptimizationStatus: ").append(toIndentedString(deepFunnelOptimizationStatus)).append("\n");
    sb.append("    engagedViewAttributionWindow: ").append(toIndentedString(engagedViewAttributionWindow)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    messageEventSetId: ").append(toIndentedString(messageEventSetId)).append("\n");
    sb.append("    messagingAppAccountId: ").append(toIndentedString(messagingAppAccountId)).append("\n");
    sb.append("    messagingAppType: ").append(toIndentedString(messagingAppType)).append("\n");
    sb.append("    minBudget: ").append(toIndentedString(minBudget)).append("\n");
    sb.append("    moviePremiereDate: ").append(toIndentedString(moviePremiereDate)).append("\n");
    sb.append("    openApiPartner: ").append(toIndentedString(openApiPartner)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    optimizationEvent: ").append(toIndentedString(optimizationEvent)).append("\n");
    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    phoneInfo: ").append(toIndentedString(phoneInfo)).append("\n");
    sb.append("    pixelId: ").append(toIndentedString(pixelId)).append("\n");
    sb.append("    placementType: ").append(toIndentedString(placementType)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    productSource: ").append(toIndentedString(productSource)).append("\n");
    sb.append("    promotionTargetType: ").append(toIndentedString(promotionTargetType)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    promotionWebsiteType: ").append(toIndentedString(promotionWebsiteType)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    roasBid: ").append(toIndentedString(roasBid)).append("\n");
    sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
    sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    shareDisabled: ").append(toIndentedString(shareDisabled)).append("\n");
    sb.append("    suggestionAudienceEnabled: ").append(toIndentedString(suggestionAudienceEnabled)).append("\n");
    sb.append("    targetingOptimizationMode: ").append(toIndentedString(targetingOptimizationMode)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("    vboWindow: ").append(toIndentedString(vboWindow)).append("\n");
    sb.append("    videoDownloadDisabled: ").append(toIndentedString(videoDownloadDisabled)).append("\n");
    sb.append("    viewAttributionWindow: ").append(toIndentedString(viewAttributionWindow)).append("\n");
    sb.append("    zaloIdType: ").append(toIndentedString(zaloIdType)).append("\n");
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
