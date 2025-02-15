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
 * BillingGroupUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class BillingGroupUpdateBody {
  @JsonProperty("add_advertiser_ids")
  private List<String> addAdvertiserIds = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("billing_group_id")
  private String billingGroupId = null;

  @JsonProperty("delete_advertiser_ids")
  private List<String> deleteAdvertiserIds = null;

  @JsonProperty("is_primary")
  private Boolean isPrimary = null;

  @JsonProperty("new_billing_group_emails")
  private List<String> newBillingGroupEmails = null;

  @JsonProperty("new_billing_group_name")
  private String newBillingGroupName = null;

  public BillingGroupUpdateBody addAdvertiserIds(List<String> addAdvertiserIds) {
    this.addAdvertiserIds = addAdvertiserIds;
    return this;
  }

  public BillingGroupUpdateBody addAddAdvertiserIdsItem(String addAdvertiserIdsItem) {
    if (this.addAdvertiserIds == null) {
      this.addAdvertiserIds = new ArrayList<String>();
    }
    this.addAdvertiserIds.add(addAdvertiserIdsItem);
    return this;
  }

   /**
   * Get addAdvertiserIds
   * @return addAdvertiserIds
  **/
  @Schema(description = "")
  public List<String> getAddAdvertiserIds() {
    return addAdvertiserIds;
  }

  public void setAddAdvertiserIds(List<String> addAdvertiserIds) {
    this.addAdvertiserIds = addAdvertiserIds;
  }

  public BillingGroupUpdateBody bcId(String bcId) {
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

  public BillingGroupUpdateBody billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Get billingGroupId
   * @return billingGroupId
  **/
  @Schema(required = true, description = "")
  public String getBillingGroupId() {
    return billingGroupId;
  }

  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }

  public BillingGroupUpdateBody deleteAdvertiserIds(List<String> deleteAdvertiserIds) {
    this.deleteAdvertiserIds = deleteAdvertiserIds;
    return this;
  }

  public BillingGroupUpdateBody addDeleteAdvertiserIdsItem(String deleteAdvertiserIdsItem) {
    if (this.deleteAdvertiserIds == null) {
      this.deleteAdvertiserIds = new ArrayList<String>();
    }
    this.deleteAdvertiserIds.add(deleteAdvertiserIdsItem);
    return this;
  }

   /**
   * Get deleteAdvertiserIds
   * @return deleteAdvertiserIds
  **/
  @Schema(description = "")
  public List<String> getDeleteAdvertiserIds() {
    return deleteAdvertiserIds;
  }

  public void setDeleteAdvertiserIds(List<String> deleteAdvertiserIds) {
    this.deleteAdvertiserIds = deleteAdvertiserIds;
  }

  public BillingGroupUpdateBody isPrimary(Boolean isPrimary) {
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

  public BillingGroupUpdateBody newBillingGroupEmails(List<String> newBillingGroupEmails) {
    this.newBillingGroupEmails = newBillingGroupEmails;
    return this;
  }

  public BillingGroupUpdateBody addNewBillingGroupEmailsItem(String newBillingGroupEmailsItem) {
    if (this.newBillingGroupEmails == null) {
      this.newBillingGroupEmails = new ArrayList<String>();
    }
    this.newBillingGroupEmails.add(newBillingGroupEmailsItem);
    return this;
  }

   /**
   * Get newBillingGroupEmails
   * @return newBillingGroupEmails
  **/
  @Schema(description = "")
  public List<String> getNewBillingGroupEmails() {
    return newBillingGroupEmails;
  }

  public void setNewBillingGroupEmails(List<String> newBillingGroupEmails) {
    this.newBillingGroupEmails = newBillingGroupEmails;
  }

  public BillingGroupUpdateBody newBillingGroupName(String newBillingGroupName) {
    this.newBillingGroupName = newBillingGroupName;
    return this;
  }

   /**
   * Get newBillingGroupName
   * @return newBillingGroupName
  **/
  @Schema(description = "")
  public String getNewBillingGroupName() {
    return newBillingGroupName;
  }

  public void setNewBillingGroupName(String newBillingGroupName) {
    this.newBillingGroupName = newBillingGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingGroupUpdateBody billingGroupUpdateBody = (BillingGroupUpdateBody) o;
    return Objects.equals(this.addAdvertiserIds, billingGroupUpdateBody.addAdvertiserIds) &&
        Objects.equals(this.bcId, billingGroupUpdateBody.bcId) &&
        Objects.equals(this.billingGroupId, billingGroupUpdateBody.billingGroupId) &&
        Objects.equals(this.deleteAdvertiserIds, billingGroupUpdateBody.deleteAdvertiserIds) &&
        Objects.equals(this.isPrimary, billingGroupUpdateBody.isPrimary) &&
        Objects.equals(this.newBillingGroupEmails, billingGroupUpdateBody.newBillingGroupEmails) &&
        Objects.equals(this.newBillingGroupName, billingGroupUpdateBody.newBillingGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addAdvertiserIds, bcId, billingGroupId, deleteAdvertiserIds, isPrimary, newBillingGroupEmails, newBillingGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingGroupUpdateBody {\n");
    
    sb.append("    addAdvertiserIds: ").append(toIndentedString(addAdvertiserIds)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    deleteAdvertiserIds: ").append(toIndentedString(deleteAdvertiserIds)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    newBillingGroupEmails: ").append(toIndentedString(newBillingGroupEmails)).append("\n");
    sb.append("    newBillingGroupName: ").append(toIndentedString(newBillingGroupName)).append("\n");
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
