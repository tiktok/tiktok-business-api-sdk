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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdgroupStatusUpdateBody {
  @JsonProperty("adgroup_ids")
  private List<String> adgroupIds = new ArrayList<String>();

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("allow_partial_success")
  private Boolean allowPartialSuccess = false;

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
   * Get adgroupIds
   * @return adgroupIds
  **/
  @Schema(required = true, description = "")
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

  public AdgroupStatusUpdateBody allowPartialSuccess(Boolean allowPartialSuccess) {
    this.allowPartialSuccess = allowPartialSuccess;
    return this;
  }

   /**
   * Get allowPartialSuccess
   * @return allowPartialSuccess
  **/
  @Schema(description = "")
  public Boolean isAllowPartialSuccess() {
    return allowPartialSuccess;
  }

  public void setAllowPartialSuccess(Boolean allowPartialSuccess) {
    this.allowPartialSuccess = allowPartialSuccess;
  }

  public AdgroupStatusUpdateBody operationStatus(String operationStatus) {
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
        Objects.equals(this.allowPartialSuccess, adgroupStatusUpdateBody.allowPartialSuccess) &&
        Objects.equals(this.operationStatus, adgroupStatusUpdateBody.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupIds, advertiserId, allowPartialSuccess, operationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupStatusUpdateBody {\n");
    
    sb.append("    adgroupIds: ").append(toIndentedString(adgroupIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    allowPartialSuccess: ").append(toIndentedString(allowPartialSuccess)).append("\n");
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
