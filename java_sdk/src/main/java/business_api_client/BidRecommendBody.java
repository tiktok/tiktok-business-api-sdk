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
 * BidRecommendBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class BidRecommendBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("campaign_id")
  private String campaignId = "\"0\"";

  @JsonProperty("external_action")
  private String externalAction = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  @JsonProperty("objective_type")
  private String objectiveType = null;

  public BidRecommendBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public BidRecommendBody campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Campaign ID.
   * @return campaignId
  **/
  @Schema(description = "Campaign ID.")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public BidRecommendBody externalAction(String externalAction) {
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Conversion event for the ad group.
   * @return externalAction
  **/
  @Schema(description = "Conversion event for the ad group.")
  public String getExternalAction() {
    return externalAction;
  }

  public void setExternalAction(String externalAction) {
    this.externalAction = externalAction;
  }

  public BidRecommendBody locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public BidRecommendBody addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * IDs of the locations that you want to target.
   * @return locationIds
  **/
  @Schema(required = true, description = "IDs of the locations that you want to target.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public BidRecommendBody objectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Campaign objective. The current API endpoint only supports Traffic and Website conversions objectives. For enum values and descriptions, see Objectives. Note: This API is being revamped to support larger function scope and more accurate result. Please stay tuned for updates.
   * @return objectiveType
  **/
  @Schema(required = true, description = "Campaign objective. The current API endpoint only supports Traffic and Website conversions objectives. For enum values and descriptions, see Objectives. Note: This API is being revamped to support larger function scope and more accurate result. Please stay tuned for updates.")
  public String getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(String objectiveType) {
    this.objectiveType = objectiveType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidRecommendBody bidRecommendBody = (BidRecommendBody) o;
    return Objects.equals(this.advertiserId, bidRecommendBody.advertiserId) &&
        Objects.equals(this.campaignId, bidRecommendBody.campaignId) &&
        Objects.equals(this.externalAction, bidRecommendBody.externalAction) &&
        Objects.equals(this.locationIds, bidRecommendBody.locationIds) &&
        Objects.equals(this.objectiveType, bidRecommendBody.objectiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignId, externalAction, locationIds, objectiveType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidRecommendBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
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
