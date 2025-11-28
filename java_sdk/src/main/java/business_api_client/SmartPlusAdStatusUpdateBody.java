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
 * SmartPlusAdStatusUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SmartPlusAdStatusUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  @JsonProperty("smart_plus_ad_ids")
  private List<String> smartPlusAdIds = new ArrayList<String>();

  public SmartPlusAdStatusUpdateBody advertiserId(String advertiserId) {
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

  public SmartPlusAdStatusUpdateBody operationStatus(String operationStatus) {
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

  public SmartPlusAdStatusUpdateBody smartPlusAdIds(List<String> smartPlusAdIds) {
    this.smartPlusAdIds = smartPlusAdIds;
    return this;
  }

  public SmartPlusAdStatusUpdateBody addSmartPlusAdIdsItem(String smartPlusAdIdsItem) {
    this.smartPlusAdIds.add(smartPlusAdIdsItem);
    return this;
  }

   /**
   * Get smartPlusAdIds
   * @return smartPlusAdIds
  **/
  @Schema(required = true, description = "")
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
    SmartPlusAdStatusUpdateBody smartPlusAdStatusUpdateBody = (SmartPlusAdStatusUpdateBody) o;
    return Objects.equals(this.advertiserId, smartPlusAdStatusUpdateBody.advertiserId) &&
        Objects.equals(this.operationStatus, smartPlusAdStatusUpdateBody.operationStatus) &&
        Objects.equals(this.smartPlusAdIds, smartPlusAdStatusUpdateBody.smartPlusAdIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, operationStatus, smartPlusAdIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdStatusUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
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
