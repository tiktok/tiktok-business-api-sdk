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
/**
 * BcTransferBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class BcTransferBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("cash_amount")
  private Float cashAmount = null;

  @JsonProperty("child_bc_id")
  private String childBcId = null;

  @JsonProperty("grant_amount")
  private Float grantAmount = null;

  @JsonProperty("request_id")
  private String requestId = null;

  @JsonProperty("transfer_level")
  private String transferLevel = null;

  @JsonProperty("transfer_type")
  private String transferType = null;

  public BcTransferBody advertiserId(String advertiserId) {
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

  public BcTransferBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(required = true, description = "")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public BcTransferBody cashAmount(Float cashAmount) {
    this.cashAmount = cashAmount;
    return this;
  }

   /**
   * Get cashAmount
   * @return cashAmount
  **/
  @Schema(description = "")
  public Float getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(Float cashAmount) {
    this.cashAmount = cashAmount;
  }

  public BcTransferBody childBcId(String childBcId) {
    this.childBcId = childBcId;
    return this;
  }

   /**
   * Get childBcId
   * @return childBcId
  **/
  @Schema(description = "")
  public String getChildBcId() {
    return childBcId;
  }

  public void setChildBcId(String childBcId) {
    this.childBcId = childBcId;
  }

  public BcTransferBody grantAmount(Float grantAmount) {
    this.grantAmount = grantAmount;
    return this;
  }

   /**
   * Get grantAmount
   * @return grantAmount
  **/
  @Schema(description = "")
  public Float getGrantAmount() {
    return grantAmount;
  }

  public void setGrantAmount(Float grantAmount) {
    this.grantAmount = grantAmount;
  }

  public BcTransferBody requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public BcTransferBody transferLevel(String transferLevel) {
    this.transferLevel = transferLevel;
    return this;
  }

   /**
   * Get transferLevel
   * @return transferLevel
  **/
  @Schema(description = "")
  public String getTransferLevel() {
    return transferLevel;
  }

  public void setTransferLevel(String transferLevel) {
    this.transferLevel = transferLevel;
  }

  public BcTransferBody transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @Schema(required = true, description = "")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcTransferBody bcTransferBody = (BcTransferBody) o;
    return Objects.equals(this.advertiserId, bcTransferBody.advertiserId) &&
        Objects.equals(this.bcId, bcTransferBody.bcId) &&
        Objects.equals(this.cashAmount, bcTransferBody.cashAmount) &&
        Objects.equals(this.childBcId, bcTransferBody.childBcId) &&
        Objects.equals(this.grantAmount, bcTransferBody.grantAmount) &&
        Objects.equals(this.requestId, bcTransferBody.requestId) &&
        Objects.equals(this.transferLevel, bcTransferBody.transferLevel) &&
        Objects.equals(this.transferType, bcTransferBody.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bcId, cashAmount, childBcId, grantAmount, requestId, transferLevel, transferType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcTransferBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
    sb.append("    childBcId: ").append(toIndentedString(childBcId)).append("\n");
    sb.append("    grantAmount: ").append(toIndentedString(grantAmount)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    transferLevel: ").append(toIndentedString(transferLevel)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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
