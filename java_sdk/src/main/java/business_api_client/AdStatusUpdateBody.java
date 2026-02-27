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
 * AdStatusUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdStatusUpdateBody {
  @JsonProperty("aco_ad_ids")
  private List<String> acoAdIds = null;

  @JsonProperty("ad_ids")
  private List<String> adIds = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("operation_status")
  private String operationStatus = null;

  public AdStatusUpdateBody acoAdIds(List<String> acoAdIds) {
    this.acoAdIds = acoAdIds;
    return this;
  }

  public AdStatusUpdateBody addAcoAdIdsItem(String acoAdIdsItem) {
    if (this.acoAdIds == null) {
      this.acoAdIds = new ArrayList<String>();
    }
    this.acoAdIds.add(acoAdIdsItem);
    return this;
  }

   /**
   * Get acoAdIds
   * @return acoAdIds
  **/
  @Schema(description = "")
  public List<String> getAcoAdIds() {
    return acoAdIds;
  }

  public void setAcoAdIds(List<String> acoAdIds) {
    this.acoAdIds = acoAdIds;
  }

  public AdStatusUpdateBody adIds(List<String> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdStatusUpdateBody addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<String>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * Get adIds
   * @return adIds
  **/
  @Schema(description = "")
  public List<String> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  public AdStatusUpdateBody advertiserId(String advertiserId) {
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

  public AdStatusUpdateBody operationStatus(String operationStatus) {
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
    AdStatusUpdateBody adStatusUpdateBody = (AdStatusUpdateBody) o;
    return Objects.equals(this.acoAdIds, adStatusUpdateBody.acoAdIds) &&
        Objects.equals(this.adIds, adStatusUpdateBody.adIds) &&
        Objects.equals(this.advertiserId, adStatusUpdateBody.advertiserId) &&
        Objects.equals(this.operationStatus, adStatusUpdateBody.operationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acoAdIds, adIds, advertiserId, operationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdStatusUpdateBody {\n");
    
    sb.append("    acoAdIds: ").append(toIndentedString(acoAdIds)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
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
