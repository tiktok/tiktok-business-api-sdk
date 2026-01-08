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
 * CampaignStatusUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class CampaignStatusUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("postback_window_mode")
  private String postbackWindowMode = null;

  public CampaignStatusUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public CampaignStatusUpdateBody campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignStatusUpdateBody addCampaignIdsItem(String campaignIdsItem) {
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

  public CampaignStatusUpdateBody operationStatus(String operationStatus) {
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

  public CampaignStatusUpdateBody postbackWindowMode(String postbackWindowMode) {
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
    CampaignStatusUpdateBody campaignStatusUpdateBody = (CampaignStatusUpdateBody) o;
    return Objects.equals(this.advertiserId, campaignStatusUpdateBody.advertiserId) &&
        Objects.equals(this.campaignIds, campaignStatusUpdateBody.campaignIds) &&
        Objects.equals(this.operationStatus, campaignStatusUpdateBody.operationStatus) &&
        Objects.equals(this.postbackWindowMode, campaignStatusUpdateBody.postbackWindowMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignIds, operationStatus, postbackWindowMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignStatusUpdateBody {\n");
    
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
