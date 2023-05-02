/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13advertiserupdateQualificationImages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AdvertiserUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class AdvertiserUpdateBody {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("advertiser_name")
  private String advertiserName = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("contact_email")
  private String contactEmail = null;

  @JsonProperty("contact_name")
  private String contactName = null;

  @JsonProperty("contact_number")
  private String contactNumber = null;

  @JsonProperty("license_image_id")
  private String licenseImageId = null;

  @JsonProperty("license_no")
  private String licenseNo = null;

  @JsonProperty("need_submit_certificate")
  private Boolean needSubmitCertificate = null;

  @JsonProperty("promotion_link")
  private String promotionLink = null;

  @JsonProperty("qualification_images")
  private OpenApiv13advertiserupdateQualificationImages qualificationImages = null;

  @JsonProperty("tax_map")
  private String taxMap = null;

  public AdvertiserUpdateBody address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Business address that is shown on receipts
   * @return address
  **/
  @Schema(description = "Business address that is shown on receipts")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AdvertiserUpdateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Ad account ID
   * @return advertiserId
  **/
  @Schema(required = true, description = "Ad account ID")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public AdvertiserUpdateBody advertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * Ad account name
   * @return advertiserName
  **/
  @Schema(description = "Ad account name")
  public String getAdvertiserName() {
    return advertiserName;
  }

  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }

  public AdvertiserUpdateBody company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company name
   * @return company
  **/
  @Schema(description = "Company name")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AdvertiserUpdateBody contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Contact email
   * @return contactEmail
  **/
  @Schema(description = "Contact email")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public AdvertiserUpdateBody contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Name of the contact person
   * @return contactName
  **/
  @Schema(description = "Name of the contact person")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public AdvertiserUpdateBody contactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

   /**
   * Contact phone number
   * @return contactNumber
  **/
  @Schema(description = "Contact phone number")
  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public AdvertiserUpdateBody licenseImageId(String licenseImageId) {
    this.licenseImageId = licenseImageId;
    return this;
  }

   /**
   * Image ID (&#x60;image_id&#x60;) of the business license
   * @return licenseImageId
  **/
  @Schema(description = "Image ID (`image_id`) of the business license")
  public String getLicenseImageId() {
    return licenseImageId;
  }

  public void setLicenseImageId(String licenseImageId) {
    this.licenseImageId = licenseImageId;
  }

  public AdvertiserUpdateBody licenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * Business license number. This is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico
   * @return licenseNo
  **/
  @Schema(description = "Business license number. This is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico")
  public String getLicenseNo() {
    return licenseNo;
  }

  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }

  public AdvertiserUpdateBody needSubmitCertificate(Boolean needSubmitCertificate) {
    this.needSubmitCertificate = needSubmitCertificate;
    return this;
  }

   /**
   * Whether you want to submit the new certificate images for review
   * @return needSubmitCertificate
  **/
  @Schema(description = "Whether you want to submit the new certificate images for review")
  public Boolean isNeedSubmitCertificate() {
    return needSubmitCertificate;
  }

  public void setNeedSubmitCertificate(Boolean needSubmitCertificate) {
    this.needSubmitCertificate = needSubmitCertificate;
  }

  public AdvertiserUpdateBody promotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
    return this;
  }

   /**
   * Promotion link. Length cannot exceed 255 characters
   * @return promotionLink
  **/
  @Schema(description = "Promotion link. Length cannot exceed 255 characters")
  public String getPromotionLink() {
    return promotionLink;
  }

  public void setPromotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
  }

  public AdvertiserUpdateBody qualificationImages(OpenApiv13advertiserupdateQualificationImages qualificationImages) {
    this.qualificationImages = qualificationImages;
    return this;
  }

   /**
   * Get qualificationImages
   * @return qualificationImages
  **/
  @Schema(description = "")
  public OpenApiv13advertiserupdateQualificationImages getQualificationImages() {
    return qualificationImages;
  }

  public void setQualificationImages(OpenApiv13advertiserupdateQualificationImages qualificationImages) {
    this.qualificationImages = qualificationImages;
  }

  public AdvertiserUpdateBody taxMap(String taxMap) {
    this.taxMap = taxMap;
    return this;
  }

   /**
   * Billing and invoicing tax number. Different countries use different tax number fields. France uses &#x60;vat&#x60;, and Brazil uses &#x60;tax_id&#x60;
   * @return taxMap
  **/
  @Schema(description = "Billing and invoicing tax number. Different countries use different tax number fields. France uses `vat`, and Brazil uses `tax_id`")
  public String getTaxMap() {
    return taxMap;
  }

  public void setTaxMap(String taxMap) {
    this.taxMap = taxMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserUpdateBody advertiserUpdateBody = (AdvertiserUpdateBody) o;
    return Objects.equals(this.address, advertiserUpdateBody.address) &&
        Objects.equals(this.advertiserId, advertiserUpdateBody.advertiserId) &&
        Objects.equals(this.advertiserName, advertiserUpdateBody.advertiserName) &&
        Objects.equals(this.company, advertiserUpdateBody.company) &&
        Objects.equals(this.contactEmail, advertiserUpdateBody.contactEmail) &&
        Objects.equals(this.contactName, advertiserUpdateBody.contactName) &&
        Objects.equals(this.contactNumber, advertiserUpdateBody.contactNumber) &&
        Objects.equals(this.licenseImageId, advertiserUpdateBody.licenseImageId) &&
        Objects.equals(this.licenseNo, advertiserUpdateBody.licenseNo) &&
        Objects.equals(this.needSubmitCertificate, advertiserUpdateBody.needSubmitCertificate) &&
        Objects.equals(this.promotionLink, advertiserUpdateBody.promotionLink) &&
        Objects.equals(this.qualificationImages, advertiserUpdateBody.qualificationImages) &&
        Objects.equals(this.taxMap, advertiserUpdateBody.taxMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, advertiserId, advertiserName, company, contactEmail, contactName, contactNumber, licenseImageId, licenseNo, needSubmitCertificate, promotionLink, qualificationImages, taxMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserUpdateBody {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    licenseImageId: ").append(toIndentedString(licenseImageId)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    needSubmitCertificate: ").append(toIndentedString(needSubmitCertificate)).append("\n");
    sb.append("    promotionLink: ").append(toIndentedString(promotionLink)).append("\n");
    sb.append("    qualificationImages: ").append(toIndentedString(qualificationImages)).append("\n");
    sb.append("    taxMap: ").append(toIndentedString(taxMap)).append("\n");
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
