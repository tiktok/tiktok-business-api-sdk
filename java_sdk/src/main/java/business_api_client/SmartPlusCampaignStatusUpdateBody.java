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
 * SmartPlusCampaignStatusUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SmartPlusCampaignStatusUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = new ArrayList<String>();

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("postback_window_mode")
  private String postbackWindowMode = null;

  public SmartPlusCampaignStatusUpdateBody advertiserId(String advertiserId) {
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

  public SmartPlusCampaignStatusUpdateBody campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public SmartPlusCampaignStatusUpdateBody addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @Schema(required = true, description = "")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public SmartPlusCampaignStatusUpdateBody operationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * Get operationStatus
   * @return operationStatus
  **/
  @Schema(required = true, description = "")
  public String getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }

  public SmartPlusCampaignStatusUpdateBody postbackWindowMode(String postbackWindowMode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusCampaignStatusUpdateBody smartPlusCampaignStatusUpdateBody = (SmartPlusCampaignStatusUpdateBody) o;
    return Objects.equals(this.advertiserId, smartPlusCampaignStatusUpdateBody.advertiserId) &&
        Objects.equals(this.campaignIds, smartPlusCampaignStatusUpdateBody.campaignIds) &&
        Objects.equals(this.operationStatus, smartPlusCampaignStatusUpdateBody.operationStatus) &&
        Objects.equals(this.postbackWindowMode, smartPlusCampaignStatusUpdateBody.postbackWindowMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignIds, operationStatus, postbackWindowMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusCampaignStatusUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    postbackWindowMode: ").append(toIndentedString(postbackWindowMode)).append("\n");
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
