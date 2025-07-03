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
 * BillingGroupCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class BillingGroupCreateBody {
  @JsonProperty("advertiser_ids")
  private List<String> advertiserIds = new ArrayList<String>();

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("billing_group_emails")
  private List<String> billingGroupEmails = null;

  @JsonProperty("billing_group_name")
  private String billingGroupName = null;

  @JsonProperty("billing_group_type")
  private String billingGroupType = "AUCTION";

  @JsonProperty("is_primary")
  private Boolean isPrimary = false;

  public BillingGroupCreateBody advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public BillingGroupCreateBody addAdvertiserIdsItem(String advertiserIdsItem) {
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * Get advertiserIds
   * @return advertiserIds
  **/
  @Schema(required = true, description = "")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  public BillingGroupCreateBody bcId(String bcId) {
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

  public BillingGroupCreateBody billingGroupEmails(List<String> billingGroupEmails) {
    this.billingGroupEmails = billingGroupEmails;
    return this;
  }

  public BillingGroupCreateBody addBillingGroupEmailsItem(String billingGroupEmailsItem) {
    if (this.billingGroupEmails == null) {
      this.billingGroupEmails = new ArrayList<String>();
    }
    this.billingGroupEmails.add(billingGroupEmailsItem);
    return this;
  }

   /**
   * Get billingGroupEmails
   * @return billingGroupEmails
  **/
  @Schema(description = "")
  public List<String> getBillingGroupEmails() {
    return billingGroupEmails;
  }

  public void setBillingGroupEmails(List<String> billingGroupEmails) {
    this.billingGroupEmails = billingGroupEmails;
  }

  public BillingGroupCreateBody billingGroupName(String billingGroupName) {
    this.billingGroupName = billingGroupName;
    return this;
  }

   /**
   * Get billingGroupName
   * @return billingGroupName
  **/
  @Schema(required = true, description = "")
  public String getBillingGroupName() {
    return billingGroupName;
  }

  public void setBillingGroupName(String billingGroupName) {
    this.billingGroupName = billingGroupName;
  }

  public BillingGroupCreateBody billingGroupType(String billingGroupType) {
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

  public BillingGroupCreateBody isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @Schema(description = "")
  public Boolean isIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingGroupCreateBody billingGroupCreateBody = (BillingGroupCreateBody) o;
    return Objects.equals(this.advertiserIds, billingGroupCreateBody.advertiserIds) &&
        Objects.equals(this.bcId, billingGroupCreateBody.bcId) &&
        Objects.equals(this.billingGroupEmails, billingGroupCreateBody.billingGroupEmails) &&
        Objects.equals(this.billingGroupName, billingGroupCreateBody.billingGroupName) &&
        Objects.equals(this.billingGroupType, billingGroupCreateBody.billingGroupType) &&
        Objects.equals(this.isPrimary, billingGroupCreateBody.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, bcId, billingGroupEmails, billingGroupName, billingGroupType, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingGroupCreateBody {\n");
    
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    billingGroupEmails: ").append(toIndentedString(billingGroupEmails)).append("\n");
    sb.append("    billingGroupName: ").append(toIndentedString(billingGroupName)).append("\n");
    sb.append("    billingGroupType: ").append(toIndentedString(billingGroupType)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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
