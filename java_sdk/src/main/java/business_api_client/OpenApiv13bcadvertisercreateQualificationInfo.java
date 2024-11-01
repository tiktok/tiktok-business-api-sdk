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
 * Qualification information.  Required when your Business Center type is &#x60;AGENCY&#x60;. &lt;p&gt;&lt;span style&#x3D;\&quot;color:darkred\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;&lt;/span&gt;: Do not specify this object when your Business Center type is &#x60;DIRECT&#x60;, or an error will occur.
 */
@Schema(description = "Qualification information.  Required when your Business Center type is `AGENCY`. <p><span style=\"color:darkred\"><b>Note</b></span>: Do not specify this object when your Business Center type is `DIRECT`, or an error will occur.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13bcadvertisercreateQualificationInfo {
  @JsonProperty("license_image_id")
  private String licenseImageId = null;

  @JsonProperty("license_no")
  private String licenseNo = null;

  @JsonProperty("promotion_link")
  private String promotionLink = null;

  @JsonProperty("qualification_image_ids")
  private List<String> qualificationImageIds = null;

  public OpenApiv13bcadvertisercreateQualificationInfo licenseImageId(String licenseImageId) {
    this.licenseImageId = licenseImageId;
    return this;
  }

   /**
   * Qualified Document picture ID, see [Upload a business certificate](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218). Note: This field is required for ad accounts that are registered in the Chinese mainland or Hong Kong
   * @return licenseImageId
  **/
  @Schema(description = "Qualified Document picture ID, see [Upload a business certificate](https://ads.tiktok.com/marketing_api/docs?id=1739938996913218). Note: This field is required for ad accounts that are registered in the Chinese mainland or Hong Kong")
  public String getLicenseImageId() {
    return licenseImageId;
  }

  public void setLicenseImageId(String licenseImageId) {
    this.licenseImageId = licenseImageId;
  }

  public OpenApiv13bcadvertisercreateQualificationInfo licenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * Business license number. This field is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico
   * @return licenseNo
  **/
  @Schema(description = "Business license number. This field is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico")
  public String getLicenseNo() {
    return licenseNo;
  }

  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }

  public OpenApiv13bcadvertisercreateQualificationInfo promotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
    return this;
  }

   /**
   * Promotion link. Required when your Business Center type is &#x60;AGENCY&#x60;. Length cannot exceed 255 characters
   * @return promotionLink
  **/
  @Schema(description = "Promotion link. Required when your Business Center type is `AGENCY`. Length cannot exceed 255 characters")
  public String getPromotionLink() {
    return promotionLink;
  }

  public void setPromotionLink(String promotionLink) {
    this.promotionLink = promotionLink;
  }

  public OpenApiv13bcadvertisercreateQualificationInfo qualificationImageIds(List<String> qualificationImageIds) {
    this.qualificationImageIds = qualificationImageIds;
    return this;
  }

  public OpenApiv13bcadvertisercreateQualificationInfo addQualificationImageIdsItem(String qualificationImageIdsItem) {
    if (this.qualificationImageIds == null) {
      this.qualificationImageIds = new ArrayList<String>();
    }
    this.qualificationImageIds.add(qualificationImageIdsItem);
    return this;
  }

   /**
   * Other Qualified Documents picture ID. See [Upload a business certificate](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218). Note: This field is required if the ad account or the Business Center is registered in France, Brazil, or Mexico
   * @return qualificationImageIds
  **/
  @Schema(description = "Other Qualified Documents picture ID. See [Upload a business certificate](https://ads.tiktok.com/marketing_api/docs?id=1739938996913218). Note: This field is required if the ad account or the Business Center is registered in France, Brazil, or Mexico")
  public List<String> getQualificationImageIds() {
    return qualificationImageIds;
  }

  public void setQualificationImageIds(List<String> qualificationImageIds) {
    this.qualificationImageIds = qualificationImageIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13bcadvertisercreateQualificationInfo openApiv13bcadvertisercreateQualificationInfo = (OpenApiv13bcadvertisercreateQualificationInfo) o;
    return Objects.equals(this.licenseImageId, openApiv13bcadvertisercreateQualificationInfo.licenseImageId) &&
        Objects.equals(this.licenseNo, openApiv13bcadvertisercreateQualificationInfo.licenseNo) &&
        Objects.equals(this.promotionLink, openApiv13bcadvertisercreateQualificationInfo.promotionLink) &&
        Objects.equals(this.qualificationImageIds, openApiv13bcadvertisercreateQualificationInfo.qualificationImageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseImageId, licenseNo, promotionLink, qualificationImageIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13bcadvertisercreateQualificationInfo {\n");
    
    sb.append("    licenseImageId: ").append(toIndentedString(licenseImageId)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    promotionLink: ").append(toIndentedString(promotionLink)).append("\n");
    sb.append("    qualificationImageIds: ").append(toIndentedString(qualificationImageIds)).append("\n");
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
