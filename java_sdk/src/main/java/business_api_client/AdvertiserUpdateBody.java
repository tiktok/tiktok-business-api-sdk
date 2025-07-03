/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdvertiserupdateAdvertiserBudgets;
import business_api_client.AdvertiserupdateQualificationImages;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AdvertiserUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class AdvertiserUpdateBody {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("advertiser_budgets")
  private List<AdvertiserupdateAdvertiserBudgets> advertiserBudgets = null;

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("advertiser_name")
  private String advertiserName = null;

  @JsonProperty("bc_id")
  private Long bcId = null;

  @JsonProperty("budget_update_type")
  private String budgetUpdateType = null;

  @JsonProperty("child_bc_id")
  private Long childBcId = null;

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
  private List<AdvertiserupdateQualificationImages> qualificationImages = null;

  @JsonProperty("tax_map")
  private Map<String, String> taxMap = null;

  public AdvertiserUpdateBody address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AdvertiserUpdateBody advertiserBudgets(List<AdvertiserupdateAdvertiserBudgets> advertiserBudgets) {
    this.advertiserBudgets = advertiserBudgets;
    return this;
  }

  public AdvertiserUpdateBody addAdvertiserBudgetsItem(AdvertiserupdateAdvertiserBudgets advertiserBudgetsItem) {
    if (this.advertiserBudgets == null) {
      this.advertiserBudgets = new ArrayList<AdvertiserupdateAdvertiserBudgets>();
    }
    this.advertiserBudgets.add(advertiserBudgetsItem);
    return this;
  }

   /**
   * Get advertiserBudgets
   * @return advertiserBudgets
  **/
  @Schema(description = "")
  public List<AdvertiserupdateAdvertiserBudgets> getAdvertiserBudgets() {
    return advertiserBudgets;
  }

  public void setAdvertiserBudgets(List<AdvertiserupdateAdvertiserBudgets> advertiserBudgets) {
    this.advertiserBudgets = advertiserBudgets;
  }

  public AdvertiserUpdateBody advertiserId(String advertiserId) {
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

  public AdvertiserUpdateBody advertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * Get advertiserName
   * @return advertiserName
  **/
  @Schema(description = "")
  public String getAdvertiserName() {
    return advertiserName;
  }

  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }

  public AdvertiserUpdateBody bcId(Long bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(description = "")
  public Long getBcId() {
    return bcId;
  }

  public void setBcId(Long bcId) {
    this.bcId = bcId;
  }

  public AdvertiserUpdateBody budgetUpdateType(String budgetUpdateType) {
    this.budgetUpdateType = budgetUpdateType;
    return this;
  }

   /**
   * Get budgetUpdateType
   * @return budgetUpdateType
  **/
  @Schema(description = "")
  public String getBudgetUpdateType() {
    return budgetUpdateType;
  }

  public void setBudgetUpdateType(String budgetUpdateType) {
    this.budgetUpdateType = budgetUpdateType;
  }

  public AdvertiserUpdateBody childBcId(Long childBcId) {
    this.childBcId = childBcId;
    return this;
  }

   /**
   * Get childBcId
   * @return childBcId
  **/
  @Schema(description = "")
  public Long getChildBcId() {
    return childBcId;
  }

  public void setChildBcId(Long childBcId) {
    this.childBcId = childBcId;
  }

  public AdvertiserUpdateBody company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @Schema(description = "")
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
   * Get contactEmail
   * @return contactEmail
  **/
  @Schema(description = "")
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
   * Get contactName
   * @return contactName
  **/
  @Schema(description = "")
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
   * Get contactNumber
   * @return contactNumber
  **/
  @Schema(description = "")
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
   * Get licenseImageId
   * @return licenseImageId
  **/
  @Schema(description = "")
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
   * Get licenseNo
   * @return licenseNo
  **/
  @Schema(description = "")
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
   * Get needSubmitCertificate
   * @return needSubmitCertificate
  **/
  @Schema(description = "")
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
   * Get promotionLink
   * @return promotionLink
  **/
  @Schema(description = "")
  public String getPromotionLink() {
    return promotionLink;
  }

  public void setPromotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
  }

  public AdvertiserUpdateBody qualificationImages(List<AdvertiserupdateQualificationImages> qualificationImages) {
    this.qualificationImages = qualificationImages;
    return this;
  }

  public AdvertiserUpdateBody addQualificationImagesItem(AdvertiserupdateQualificationImages qualificationImagesItem) {
    if (this.qualificationImages == null) {
      this.qualificationImages = new ArrayList<AdvertiserupdateQualificationImages>();
    }
    this.qualificationImages.add(qualificationImagesItem);
    return this;
  }

   /**
   * Get qualificationImages
   * @return qualificationImages
  **/
  @Schema(description = "")
  public List<AdvertiserupdateQualificationImages> getQualificationImages() {
    return qualificationImages;
  }

  public void setQualificationImages(List<AdvertiserupdateQualificationImages> qualificationImages) {
    this.qualificationImages = qualificationImages;
  }

  public AdvertiserUpdateBody taxMap(Map<String, String> taxMap) {
    this.taxMap = taxMap;
    return this;
  }

  public AdvertiserUpdateBody putTaxMapItem(String key, String taxMapItem) {
    if (this.taxMap == null) {
      this.taxMap = new HashMap<String, String>();
    }
    this.taxMap.put(key, taxMapItem);
    return this;
  }

   /**
   * Get taxMap
   * @return taxMap
  **/
  @Schema(description = "")
  public Map<String, String> getTaxMap() {
    return taxMap;
  }

  public void setTaxMap(Map<String, String> taxMap) {
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
        Objects.equals(this.advertiserBudgets, advertiserUpdateBody.advertiserBudgets) &&
        Objects.equals(this.advertiserId, advertiserUpdateBody.advertiserId) &&
        Objects.equals(this.advertiserName, advertiserUpdateBody.advertiserName) &&
        Objects.equals(this.bcId, advertiserUpdateBody.bcId) &&
        Objects.equals(this.budgetUpdateType, advertiserUpdateBody.budgetUpdateType) &&
        Objects.equals(this.childBcId, advertiserUpdateBody.childBcId) &&
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
    return Objects.hash(address, advertiserBudgets, advertiserId, advertiserName, bcId, budgetUpdateType, childBcId, company, contactEmail, contactName, contactNumber, licenseImageId, licenseNo, needSubmitCertificate, promotionLink, qualificationImages, taxMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserUpdateBody {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    advertiserBudgets: ").append(toIndentedString(advertiserBudgets)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    budgetUpdateType: ").append(toIndentedString(budgetUpdateType)).append("\n");
    sb.append("    childBcId: ").append(toIndentedString(childBcId)).append("\n");
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
