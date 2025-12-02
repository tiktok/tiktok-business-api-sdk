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
 * FilteringGmvMaxReportGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class FilteringGmvMaxReportGet {
  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("campaign_name")
  private String campaignName = null;

  @JsonProperty("campaign_statuses")
  private List<String> campaignStatuses = null;

  @JsonProperty("creative_delivery_statuses")
  private List<String> creativeDeliveryStatuses = null;

  @JsonProperty("creative_types")
  private List<String> creativeTypes = null;

  @JsonProperty("gmv_max_promotion_types")
  private List<String> gmvMaxPromotionTypes = null;

  @JsonProperty("item_group_ids")
  private List<String> itemGroupIds = null;

  @JsonProperty("item_ids")
  private List<String> itemIds = null;

  @JsonProperty("room_ids")
  private List<String> roomIds = null;

  @JsonProperty("search_word")
  private String searchWord = null;

  public FilteringGmvMaxReportGet campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilteringGmvMaxReportGet addCampaignIdsItem(String campaignIdsItem) {
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

  public FilteringGmvMaxReportGet campaignName(String campaignName) {
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

  public FilteringGmvMaxReportGet campaignStatuses(List<String> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
    return this;
  }

  public FilteringGmvMaxReportGet addCampaignStatusesItem(String campaignStatusesItem) {
    if (this.campaignStatuses == null) {
      this.campaignStatuses = new ArrayList<String>();
    }
    this.campaignStatuses.add(campaignStatusesItem);
    return this;
  }

   /**
   * Get campaignStatuses
   * @return campaignStatuses
  **/
  @Schema(description = "")
  public List<String> getCampaignStatuses() {
    return campaignStatuses;
  }

  public void setCampaignStatuses(List<String> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  public FilteringGmvMaxReportGet creativeDeliveryStatuses(List<String> creativeDeliveryStatuses) {
    this.creativeDeliveryStatuses = creativeDeliveryStatuses;
    return this;
  }

  public FilteringGmvMaxReportGet addCreativeDeliveryStatusesItem(String creativeDeliveryStatusesItem) {
    if (this.creativeDeliveryStatuses == null) {
      this.creativeDeliveryStatuses = new ArrayList<String>();
    }
    this.creativeDeliveryStatuses.add(creativeDeliveryStatusesItem);
    return this;
  }

   /**
   * Get creativeDeliveryStatuses
   * @return creativeDeliveryStatuses
  **/
  @Schema(description = "")
  public List<String> getCreativeDeliveryStatuses() {
    return creativeDeliveryStatuses;
  }

  public void setCreativeDeliveryStatuses(List<String> creativeDeliveryStatuses) {
    this.creativeDeliveryStatuses = creativeDeliveryStatuses;
  }

  public FilteringGmvMaxReportGet creativeTypes(List<String> creativeTypes) {
    this.creativeTypes = creativeTypes;
    return this;
  }

  public FilteringGmvMaxReportGet addCreativeTypesItem(String creativeTypesItem) {
    if (this.creativeTypes == null) {
      this.creativeTypes = new ArrayList<String>();
    }
    this.creativeTypes.add(creativeTypesItem);
    return this;
  }

   /**
   * Get creativeTypes
   * @return creativeTypes
  **/
  @Schema(description = "")
  public List<String> getCreativeTypes() {
    return creativeTypes;
  }

  public void setCreativeTypes(List<String> creativeTypes) {
    this.creativeTypes = creativeTypes;
  }

  public FilteringGmvMaxReportGet gmvMaxPromotionTypes(List<String> gmvMaxPromotionTypes) {
    this.gmvMaxPromotionTypes = gmvMaxPromotionTypes;
    return this;
  }

  public FilteringGmvMaxReportGet addGmvMaxPromotionTypesItem(String gmvMaxPromotionTypesItem) {
    if (this.gmvMaxPromotionTypes == null) {
      this.gmvMaxPromotionTypes = new ArrayList<String>();
    }
    this.gmvMaxPromotionTypes.add(gmvMaxPromotionTypesItem);
    return this;
  }

   /**
   * Get gmvMaxPromotionTypes
   * @return gmvMaxPromotionTypes
  **/
  @Schema(description = "")
  public List<String> getGmvMaxPromotionTypes() {
    return gmvMaxPromotionTypes;
  }

  public void setGmvMaxPromotionTypes(List<String> gmvMaxPromotionTypes) {
    this.gmvMaxPromotionTypes = gmvMaxPromotionTypes;
  }

  public FilteringGmvMaxReportGet itemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
    return this;
  }

  public FilteringGmvMaxReportGet addItemGroupIdsItem(String itemGroupIdsItem) {
    if (this.itemGroupIds == null) {
      this.itemGroupIds = new ArrayList<String>();
    }
    this.itemGroupIds.add(itemGroupIdsItem);
    return this;
  }

   /**
   * Get itemGroupIds
   * @return itemGroupIds
  **/
  @Schema(description = "")
  public List<String> getItemGroupIds() {
    return itemGroupIds;
  }

  public void setItemGroupIds(List<String> itemGroupIds) {
    this.itemGroupIds = itemGroupIds;
  }

  public FilteringGmvMaxReportGet itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public FilteringGmvMaxReportGet addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<String>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * Get itemIds
   * @return itemIds
  **/
  @Schema(description = "")
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public FilteringGmvMaxReportGet roomIds(List<String> roomIds) {
    this.roomIds = roomIds;
    return this;
  }

  public FilteringGmvMaxReportGet addRoomIdsItem(String roomIdsItem) {
    if (this.roomIds == null) {
      this.roomIds = new ArrayList<String>();
    }
    this.roomIds.add(roomIdsItem);
    return this;
  }

   /**
   * Get roomIds
   * @return roomIds
  **/
  @Schema(description = "")
  public List<String> getRoomIds() {
    return roomIds;
  }

  public void setRoomIds(List<String> roomIds) {
    this.roomIds = roomIds;
  }

  public FilteringGmvMaxReportGet searchWord(String searchWord) {
    this.searchWord = searchWord;
    return this;
  }

   /**
   * Get searchWord
   * @return searchWord
  **/
  @Schema(description = "")
  public String getSearchWord() {
    return searchWord;
  }

  public void setSearchWord(String searchWord) {
    this.searchWord = searchWord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringGmvMaxReportGet filteringGmvMaxReportGet = (FilteringGmvMaxReportGet) o;
    return Objects.equals(this.campaignIds, filteringGmvMaxReportGet.campaignIds) &&
        Objects.equals(this.campaignName, filteringGmvMaxReportGet.campaignName) &&
        Objects.equals(this.campaignStatuses, filteringGmvMaxReportGet.campaignStatuses) &&
        Objects.equals(this.creativeDeliveryStatuses, filteringGmvMaxReportGet.creativeDeliveryStatuses) &&
        Objects.equals(this.creativeTypes, filteringGmvMaxReportGet.creativeTypes) &&
        Objects.equals(this.gmvMaxPromotionTypes, filteringGmvMaxReportGet.gmvMaxPromotionTypes) &&
        Objects.equals(this.itemGroupIds, filteringGmvMaxReportGet.itemGroupIds) &&
        Objects.equals(this.itemIds, filteringGmvMaxReportGet.itemIds) &&
        Objects.equals(this.roomIds, filteringGmvMaxReportGet.roomIds) &&
        Objects.equals(this.searchWord, filteringGmvMaxReportGet.searchWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, campaignName, campaignStatuses, creativeDeliveryStatuses, creativeTypes, gmvMaxPromotionTypes, itemGroupIds, itemIds, roomIds, searchWord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringGmvMaxReportGet {\n");
    
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignStatuses: ").append(toIndentedString(campaignStatuses)).append("\n");
    sb.append("    creativeDeliveryStatuses: ").append(toIndentedString(creativeDeliveryStatuses)).append("\n");
    sb.append("    creativeTypes: ").append(toIndentedString(creativeTypes)).append("\n");
    sb.append("    gmvMaxPromotionTypes: ").append(toIndentedString(gmvMaxPromotionTypes)).append("\n");
    sb.append("    itemGroupIds: ").append(toIndentedString(itemGroupIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    roomIds: ").append(toIndentedString(roomIds)).append("\n");
    sb.append("    searchWord: ").append(toIndentedString(searchWord)).append("\n");
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
