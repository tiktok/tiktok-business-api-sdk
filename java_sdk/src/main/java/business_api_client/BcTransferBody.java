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
import java.math.BigDecimal;
/**
 * BcTransferBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class BcTransferBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("cash_amount")
  private BigDecimal cashAmount = null;

  @JsonProperty("grant_amount")
  private BigDecimal grantAmount = null;

  @JsonProperty("transfer_type")
  private String transferType = null;

  public BcTransferBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Ad Account ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "Ad Account ID")
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
   * Business Center ID
   * @return bcId
  **/
  @Schema(required = true, description = "Business Center ID")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public BcTransferBody cashAmount(BigDecimal cashAmount) {
    this.cashAmount = cashAmount;
    return this;
  }

   /**
   * The amount to process. You need to specify either cash_amount or grant_amount. Rounded to two decimal places. Value range &gt; 0.
   * @return cashAmount
  **/
  @Schema(description = "The amount to process. You need to specify either cash_amount or grant_amount. Rounded to two decimal places. Value range > 0.")
  public BigDecimal getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(BigDecimal cashAmount) {
    this.cashAmount = cashAmount;
  }

  public BcTransferBody grantAmount(BigDecimal grantAmount) {
    this.grantAmount = grantAmount;
    return this;
  }

   /**
   * Coupon/voucher amount. You need to specify either &#x60;cash_amount&#x60; or &#x60;grant_amount&#x60;. Rounded to two decimal places. Value range &gt; 0
   * @return grantAmount
  **/
  @Schema(description = "Coupon/voucher amount. You need to specify either `cash_amount` or `grant_amount`. Rounded to two decimal places. Value range > 0")
  public BigDecimal getGrantAmount() {
    return grantAmount;
  }

  public void setGrantAmount(BigDecimal grantAmount) {
    this.grantAmount = grantAmount;
  }

  public BcTransferBody transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * How you&#x27;d like to process payments from an ad account. Enum values：&#x60;RECHARGE&#x60;(transfer), &#x60;REFUND&#x60;(deduction)
   * @return transferType
  **/
  @Schema(required = true, description = "How you'd like to process payments from an ad account. Enum values：`RECHARGE`(transfer), `REFUND`(deduction)")
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
        Objects.equals(this.grantAmount, bcTransferBody.grantAmount) &&
        Objects.equals(this.transferType, bcTransferBody.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bcId, cashAmount, grantAmount, transferType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcTransferBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
    sb.append("    grantAmount: ").append(toIndentedString(grantAmount)).append("\n");
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
