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
 * Billing group information
 */
@Schema(description = "Billing group information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class BcadvertisercreateBillingGroupInfo {
  @JsonProperty("billing_group_id")
  private String billingGroupId = null;

  @JsonProperty("invoice_group_by")
  private String invoiceGroupBy = null;

  @JsonProperty("invoice_payer")
  private String invoicePayer = null;

  public BcadvertisercreateBillingGroupInfo billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Billing group ID. Valid when &#x60;invoice_group_by&#x60; is &#x60;ACCOUNT&#x60;
   * @return billingGroupId
  **/
  @Schema(description = "Billing group ID. Valid when `invoice_group_by` is `ACCOUNT`")
  public String getBillingGroupId() {
    return billingGroupId;
  }

  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }

  public BcadvertisercreateBillingGroupInfo invoiceGroupBy(String invoiceGroupBy) {
    this.invoiceGroupBy = invoiceGroupBy;
    return this;
  }

   /**
   * Invoicing mode. Enum values: &#x60;ACCOUNT&#x60;: Invoices in this billing groups are combined. &#x60;ADVERTISER&#x60;: Invoices in this billing group are handled separately.
   * @return invoiceGroupBy
  **/
  @Schema(description = "Invoicing mode. Enum values: `ACCOUNT`: Invoices in this billing groups are combined. `ADVERTISER`: Invoices in this billing group are handled separately.")
  public String getInvoiceGroupBy() {
    return invoiceGroupBy;
  }

  public void setInvoiceGroupBy(String invoiceGroupBy) {
    this.invoiceGroupBy = invoiceGroupBy;
  }

  public BcadvertisercreateBillingGroupInfo invoicePayer(String invoicePayer) {
    this.invoicePayer = invoicePayer;
    return this;
  }

   /**
   * Party who pays the invoices. Enum values: &#x60;AGENCY&#x60;, &#x60;ADVERTISER&#x60;. This field is required when the registrated area of the ad account is &#x60;FR&#x60; (France)
   * @return invoicePayer
  **/
  @Schema(description = "Party who pays the invoices. Enum values: `AGENCY`, `ADVERTISER`. This field is required when the registrated area of the ad account is `FR` (France)")
  public String getInvoicePayer() {
    return invoicePayer;
  }

  public void setInvoicePayer(String invoicePayer) {
    this.invoicePayer = invoicePayer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcadvertisercreateBillingGroupInfo bcadvertisercreateBillingGroupInfo = (BcadvertisercreateBillingGroupInfo) o;
    return Objects.equals(this.billingGroupId, bcadvertisercreateBillingGroupInfo.billingGroupId) &&
        Objects.equals(this.invoiceGroupBy, bcadvertisercreateBillingGroupInfo.invoiceGroupBy) &&
        Objects.equals(this.invoicePayer, bcadvertisercreateBillingGroupInfo.invoicePayer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingGroupId, invoiceGroupBy, invoicePayer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcadvertisercreateBillingGroupInfo {\n");
    
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    invoiceGroupBy: ").append(toIndentedString(invoiceGroupBy)).append("\n");
    sb.append("    invoicePayer: ").append(toIndentedString(invoicePayer)).append("\n");
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
