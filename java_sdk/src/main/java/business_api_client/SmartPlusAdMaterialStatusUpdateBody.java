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
 * SmartPlusAdMaterialStatusUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class SmartPlusAdMaterialStatusUpdateBody {
  @JsonProperty("ad_material_ids")
  private List<String> adMaterialIds = new ArrayList<String>();

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("smart_plus_ad_id")
  private String smartPlusAdId = null;

  public SmartPlusAdMaterialStatusUpdateBody adMaterialIds(List<String> adMaterialIds) {
    this.adMaterialIds = adMaterialIds;
    return this;
  }

  public SmartPlusAdMaterialStatusUpdateBody addAdMaterialIdsItem(String adMaterialIdsItem) {
    this.adMaterialIds.add(adMaterialIdsItem);
    return this;
  }

   /**
   * Get adMaterialIds
   * @return adMaterialIds
  **/
  @Schema(required = true, description = "")
  public List<String> getAdMaterialIds() {
    return adMaterialIds;
  }

  public void setAdMaterialIds(List<String> adMaterialIds) {
    this.adMaterialIds = adMaterialIds;
  }

  public SmartPlusAdMaterialStatusUpdateBody advertiserId(String advertiserId) {
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

  public SmartPlusAdMaterialStatusUpdateBody operationStatus(String operationStatus) {
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

  public SmartPlusAdMaterialStatusUpdateBody smartPlusAdId(String smartPlusAdId) {
    this.smartPlusAdId = smartPlusAdId;
    return this;
  }

   /**
   * Get smartPlusAdId
   * @return smartPlusAdId
  **/
  @Schema(required = true, description = "")
  public String getSmartPlusAdId() {
    return smartPlusAdId;
  }

  public void setSmartPlusAdId(String smartPlusAdId) {
    this.smartPlusAdId = smartPlusAdId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdMaterialStatusUpdateBody smartPlusAdMaterialStatusUpdateBody = (SmartPlusAdMaterialStatusUpdateBody) o;
    return Objects.equals(this.adMaterialIds, smartPlusAdMaterialStatusUpdateBody.adMaterialIds) &&
        Objects.equals(this.advertiserId, smartPlusAdMaterialStatusUpdateBody.advertiserId) &&
        Objects.equals(this.operationStatus, smartPlusAdMaterialStatusUpdateBody.operationStatus) &&
        Objects.equals(this.smartPlusAdId, smartPlusAdMaterialStatusUpdateBody.smartPlusAdId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adMaterialIds, advertiserId, operationStatus, smartPlusAdId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdMaterialStatusUpdateBody {\n");
    
    sb.append("    adMaterialIds: ").append(toIndentedString(adMaterialIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    smartPlusAdId: ").append(toIndentedString(smartPlusAdId)).append("\n");
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
