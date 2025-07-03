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
 * FilteringBcBillingGroupGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class FilteringBcBillingGroupGet {
  @JsonProperty("billed_to_type")
  private String billedToType = null;

  @JsonProperty("billing_group_id")
  private String billingGroupId = null;

  @JsonProperty("billing_group_name")
  private String billingGroupName = null;

  @JsonProperty("billing_group_type")
  private String billingGroupType = null;

  @JsonProperty("invoice_group_by")
  private String invoiceGroupBy = null;

  @JsonProperty("status")
  private Long status = null;

  public FilteringBcBillingGroupGet billedToType(String billedToType) {
    this.billedToType = billedToType;
    return this;
  }

   /**
   * Get billedToType
   * @return billedToType
  **/
  @Schema(description = "")
  public String getBilledToType() {
    return billedToType;
  }

  public void setBilledToType(String billedToType) {
    this.billedToType = billedToType;
  }

  public FilteringBcBillingGroupGet billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Get billingGroupId
   * @return billingGroupId
  **/
  @Schema(description = "")
  public String getBillingGroupId() {
    return billingGroupId;
  }

  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }

  public FilteringBcBillingGroupGet billingGroupName(String billingGroupName) {
    this.billingGroupName = billingGroupName;
    return this;
  }

   /**
   * Get billingGroupName
   * @return billingGroupName
  **/
  @Schema(description = "")
  public String getBillingGroupName() {
    return billingGroupName;
  }

  public void setBillingGroupName(String billingGroupName) {
    this.billingGroupName = billingGroupName;
  }

  public FilteringBcBillingGroupGet billingGroupType(String billingGroupType) {
    this.billingGroupType = billingGroupType;
    return this;
  }

   /**
   * Get billingGroupType
   * @return billingGroupType
  **/
  @Schema(description = "")
  public String getBillingGroupType() {
    return billingGroupType;
  }

  public void setBillingGroupType(String billingGroupType) {
    this.billingGroupType = billingGroupType;
  }

  public FilteringBcBillingGroupGet invoiceGroupBy(String invoiceGroupBy) {
    this.invoiceGroupBy = invoiceGroupBy;
    return this;
  }

   /**
   * Get invoiceGroupBy
   * @return invoiceGroupBy
  **/
  @Schema(description = "")
  public String getInvoiceGroupBy() {
    return invoiceGroupBy;
  }

  public void setInvoiceGroupBy(String invoiceGroupBy) {
    this.invoiceGroupBy = invoiceGroupBy;
  }

  public FilteringBcBillingGroupGet status(Long status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBcBillingGroupGet filteringBcBillingGroupGet = (FilteringBcBillingGroupGet) o;
    return Objects.equals(this.billedToType, filteringBcBillingGroupGet.billedToType) &&
        Objects.equals(this.billingGroupId, filteringBcBillingGroupGet.billingGroupId) &&
        Objects.equals(this.billingGroupName, filteringBcBillingGroupGet.billingGroupName) &&
        Objects.equals(this.billingGroupType, filteringBcBillingGroupGet.billingGroupType) &&
        Objects.equals(this.invoiceGroupBy, filteringBcBillingGroupGet.invoiceGroupBy) &&
        Objects.equals(this.status, filteringBcBillingGroupGet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billedToType, billingGroupId, billingGroupName, billingGroupType, invoiceGroupBy, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcBillingGroupGet {\n");
    
    sb.append("    billedToType: ").append(toIndentedString(billedToType)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    billingGroupName: ").append(toIndentedString(billingGroupName)).append("\n");
    sb.append("    billingGroupType: ").append(toIndentedString(billingGroupType)).append("\n");
    sb.append("    invoiceGroupBy: ").append(toIndentedString(invoiceGroupBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
