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
 * AdgroupStatusUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class AdgroupStatusUpdateBody {
  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = new ArrayList<String>();

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  public AdgroupStatusUpdateBody adgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public AdgroupStatusUpdateBody addAdgroupIdsItem(String adgroupIdsItem) {
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

   /**
   * The ID of the ad group(s) to be operated. The allowed quantity range is &#x60;1-20&#x60;.
   * @return adgroupIds
  **/
  @Schema(required = true, description = "The ID of the ad group(s) to be operated. The allowed quantity range is `1-20`.")
  public List<String> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<String> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  public AdgroupStatusUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdgroupStatusUpdateBody operationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * The operation being made.Enum values- &#x60;DELETE&#x60; (delete),&#x60; DISABLE&#x60; (pause), &#x60;ENABLE&#x60; (enable). The status of deleted ads cannot be modified.
   * @return operationStatus
  **/
  @Schema(required = true, description = "The operation being made.Enum values- `DELETE` (delete),` DISABLE` (pause), `ENABLE` (enable). The status of deleted ads cannot be modified.")
  public String getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(String operationStatus) {
    this.operationStatus = operationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupStatusUpdateBody adgroupStatusUpdateBody = (AdgroupStatusUpdateBody) o;
    return Objects.equals(this.adgroupIds, adgroupStatusUpdateBody.adgroupIds) &&
        Objects.equals(this.advertiserId, adgroupStatusUpdateBody.advertiserId) &&
        Objects.equals(this.operationStatus, adgroupStatusUpdateBody.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, advertiserId, operationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupStatusUpdateBody {\n");
    
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
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
