/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13bcadvertisercreateAdvertiserInfo;
import business_api_client.OpenApiv13bcadvertisercreateBillingGroupInfo;
import business_api_client.OpenApiv13bcadvertisercreateBillingInfo;
import business_api_client.OpenApiv13bcadvertisercreateContactInfo;
import business_api_client.OpenApiv13bcadvertisercreateCustomerInfo;
import business_api_client.OpenApiv13bcadvertisercreateQualificationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AdvertiserCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class AdvertiserCreateBody {
  @JsonProperty("advertiser_info")
  private OpenApiv13bcadvertisercreateAdvertiserInfo advertiserInfo = null;

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("billing_group_info")
  private OpenApiv13bcadvertisercreateBillingGroupInfo billingGroupInfo = null;

  @JsonProperty("billing_info")
  private OpenApiv13bcadvertisercreateBillingInfo billingInfo = null;

  @JsonProperty("contact_info")
  private OpenApiv13bcadvertisercreateContactInfo contactInfo = null;

  @JsonProperty("customer_info")
  private OpenApiv13bcadvertisercreateCustomerInfo customerInfo = null;

  @JsonProperty("qualification_info")
  private OpenApiv13bcadvertisercreateQualificationInfo qualificationInfo = null;

  @JsonProperty("tied_to_billing_group")
  private Boolean tiedToBillingGroup = null;

  public AdvertiserCreateBody advertiserInfo(OpenApiv13bcadvertisercreateAdvertiserInfo advertiserInfo) {
    this.advertiserInfo = advertiserInfo;
    return this;
  }

   /**
   * Get advertiserInfo
   * @return advertiserInfo
  **/
  @Schema(required = true, description = "")
  public OpenApiv13bcadvertisercreateAdvertiserInfo getAdvertiserInfo() {
    return advertiserInfo;
  }

  public void setAdvertiserInfo(OpenApiv13bcadvertisercreateAdvertiserInfo advertiserInfo) {
    this.advertiserInfo = advertiserInfo;
  }

  public AdvertiserCreateBody bcId(String bcId) {
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

  public AdvertiserCreateBody billingGroupInfo(OpenApiv13bcadvertisercreateBillingGroupInfo billingGroupInfo) {
    this.billingGroupInfo = billingGroupInfo;
    return this;
  }

   /**
   * Get billingGroupInfo
   * @return billingGroupInfo
  **/
  @Schema(description = "")
  public OpenApiv13bcadvertisercreateBillingGroupInfo getBillingGroupInfo() {
    return billingGroupInfo;
  }

  public void setBillingGroupInfo(OpenApiv13bcadvertisercreateBillingGroupInfo billingGroupInfo) {
    this.billingGroupInfo = billingGroupInfo;
  }

  public AdvertiserCreateBody billingInfo(OpenApiv13bcadvertisercreateBillingInfo billingInfo) {
    this.billingInfo = billingInfo;
    return this;
  }

   /**
   * Get billingInfo
   * @return billingInfo
  **/
  @Schema(description = "")
  public OpenApiv13bcadvertisercreateBillingInfo getBillingInfo() {
    return billingInfo;
  }

  public void setBillingInfo(OpenApiv13bcadvertisercreateBillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }

  public AdvertiserCreateBody contactInfo(OpenApiv13bcadvertisercreateContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @Schema(description = "")
  public OpenApiv13bcadvertisercreateContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(OpenApiv13bcadvertisercreateContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public AdvertiserCreateBody customerInfo(OpenApiv13bcadvertisercreateCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @Schema(required = true, description = "")
  public OpenApiv13bcadvertisercreateCustomerInfo getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(OpenApiv13bcadvertisercreateCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }

  public AdvertiserCreateBody qualificationInfo(OpenApiv13bcadvertisercreateQualificationInfo qualificationInfo) {
    this.qualificationInfo = qualificationInfo;
    return this;
  }

   /**
   * Get qualificationInfo
   * @return qualificationInfo
  **/
  @Schema(description = "")
  public OpenApiv13bcadvertisercreateQualificationInfo getQualificationInfo() {
    return qualificationInfo;
  }

  public void setQualificationInfo(OpenApiv13bcadvertisercreateQualificationInfo qualificationInfo) {
    this.qualificationInfo = qualificationInfo;
  }

  public AdvertiserCreateBody tiedToBillingGroup(Boolean tiedToBillingGroup) {
    this.tiedToBillingGroup = tiedToBillingGroup;
    return this;
  }

   /**
   * Whether to add the ad account to a billing group. Default value: &#x60;False&#x60;. This field is an allowlist-only feature. If you would like to access it, please contact your TikTok representative
   * @return tiedToBillingGroup
  **/
  @Schema(description = "Whether to add the ad account to a billing group. Default value: `False`. This field is an allowlist-only feature. If you would like to access it, please contact your TikTok representative")
  public Boolean isTiedToBillingGroup() {
    return tiedToBillingGroup;
  }

  public void setTiedToBillingGroup(Boolean tiedToBillingGroup) {
    this.tiedToBillingGroup = tiedToBillingGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserCreateBody advertiserCreateBody = (AdvertiserCreateBody) o;
    return Objects.equals(this.advertiserInfo, advertiserCreateBody.advertiserInfo) &&
        Objects.equals(this.bcId, advertiserCreateBody.bcId) &&
        Objects.equals(this.billingGroupInfo, advertiserCreateBody.billingGroupInfo) &&
        Objects.equals(this.billingInfo, advertiserCreateBody.billingInfo) &&
        Objects.equals(this.contactInfo, advertiserCreateBody.contactInfo) &&
        Objects.equals(this.customerInfo, advertiserCreateBody.customerInfo) &&
        Objects.equals(this.qualificationInfo, advertiserCreateBody.qualificationInfo) &&
        Objects.equals(this.tiedToBillingGroup, advertiserCreateBody.tiedToBillingGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserInfo, bcId, billingGroupInfo, billingInfo, contactInfo, customerInfo, qualificationInfo, tiedToBillingGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserCreateBody {\n");
    
    sb.append("    advertiserInfo: ").append(toIndentedString(advertiserInfo)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    billingGroupInfo: ").append(toIndentedString(billingGroupInfo)).append("\n");
    sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    qualificationInfo: ").append(toIndentedString(qualificationInfo)).append("\n");
    sb.append("    tiedToBillingGroup: ").append(toIndentedString(tiedToBillingGroup)).append("\n");
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
