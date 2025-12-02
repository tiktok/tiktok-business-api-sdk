/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdCreateBodyAdConfigurationPhoneInfo;
import business_api_client.SmartPlusAdCreateBodyAdConfigurationTrackingInfo;
import business_api_client.SmartPlusAdCreateBodyAdConfigurationUtmParams;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SmartPlusAdCreateBodyAdConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class SmartPlusAdCreateBodyAdConfiguration {
  @JsonProperty("auto_disclaimer_types")
  private List<String> autoDisclaimerTypes = null;

  @JsonProperty("call_to_action_id")
  private String callToActionId = null;

  @JsonProperty("catalog_creative_toggle")
  private Boolean catalogCreativeToggle = null;

  @JsonProperty("dark_post_status")
  private String darkPostStatus = "OFF";

  @JsonProperty("end_card_cta")
  private String endCardCta = null;

  @JsonProperty("fallback_type")
  private String fallbackType = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("phone_info")
  private SmartPlusAdCreateBodyAdConfigurationPhoneInfo phoneInfo = null;

  @JsonProperty("product_display_field_list")
  private List<String> productDisplayFieldList = null;

  @JsonProperty("product_ids")
  private List<String> productIds = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("product_specific_type")
  private String productSpecificType = null;

  @JsonProperty("tracking_info")
  private SmartPlusAdCreateBodyAdConfigurationTrackingInfo trackingInfo = null;

  @JsonProperty("utm_params")
  private List<SmartPlusAdCreateBodyAdConfigurationUtmParams> utmParams = null;

  public SmartPlusAdCreateBodyAdConfiguration autoDisclaimerTypes(List<String> autoDisclaimerTypes) {
    this.autoDisclaimerTypes = autoDisclaimerTypes;
    return this;
  }

  public SmartPlusAdCreateBodyAdConfiguration addAutoDisclaimerTypesItem(String autoDisclaimerTypesItem) {
    if (this.autoDisclaimerTypes == null) {
      this.autoDisclaimerTypes = new ArrayList<String>();
    }
    this.autoDisclaimerTypes.add(autoDisclaimerTypesItem);
    return this;
  }

   /**
   * Get autoDisclaimerTypes
   * @return autoDisclaimerTypes
  **/
  @Schema(description = "")
  public List<String> getAutoDisclaimerTypes() {
    return autoDisclaimerTypes;
  }

  public void setAutoDisclaimerTypes(List<String> autoDisclaimerTypes) {
    this.autoDisclaimerTypes = autoDisclaimerTypes;
  }

  public SmartPlusAdCreateBodyAdConfiguration callToActionId(String callToActionId) {
    this.callToActionId = callToActionId;
    return this;
  }

   /**
   * Get callToActionId
   * @return callToActionId
  **/
  @Schema(description = "")
  public String getCallToActionId() {
    return callToActionId;
  }

  public void setCallToActionId(String callToActionId) {
    this.callToActionId = callToActionId;
  }

  public SmartPlusAdCreateBodyAdConfiguration catalogCreativeToggle(Boolean catalogCreativeToggle) {
    this.catalogCreativeToggle = catalogCreativeToggle;
    return this;
  }

   /**
   * Get catalogCreativeToggle
   * @return catalogCreativeToggle
  **/
  @Schema(description = "")
  public Boolean isCatalogCreativeToggle() {
    return catalogCreativeToggle;
  }

  public void setCatalogCreativeToggle(Boolean catalogCreativeToggle) {
    this.catalogCreativeToggle = catalogCreativeToggle;
  }

  public SmartPlusAdCreateBodyAdConfiguration darkPostStatus(String darkPostStatus) {
    this.darkPostStatus = darkPostStatus;
    return this;
  }

   /**
   * Get darkPostStatus
   * @return darkPostStatus
  **/
  @Schema(description = "")
  public String getDarkPostStatus() {
    return darkPostStatus;
  }

  public void setDarkPostStatus(String darkPostStatus) {
    this.darkPostStatus = darkPostStatus;
  }

  public SmartPlusAdCreateBodyAdConfiguration endCardCta(String endCardCta) {
    this.endCardCta = endCardCta;
    return this;
  }

   /**
   * Get endCardCta
   * @return endCardCta
  **/
  @Schema(description = "")
  public String getEndCardCta() {
    return endCardCta;
  }

  public void setEndCardCta(String endCardCta) {
    this.endCardCta = endCardCta;
  }

  public SmartPlusAdCreateBodyAdConfiguration fallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
    return this;
  }

   /**
   * Get fallbackType
   * @return fallbackType
  **/
  @Schema(description = "")
  public String getFallbackType() {
    return fallbackType;
  }

  public void setFallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
  }

  public SmartPlusAdCreateBodyAdConfiguration identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @Schema(description = "")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public SmartPlusAdCreateBodyAdConfiguration identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Get identityType
   * @return identityType
  **/
  @Schema(description = "")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public SmartPlusAdCreateBodyAdConfiguration phoneInfo(SmartPlusAdCreateBodyAdConfigurationPhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

   /**
   * Get phoneInfo
   * @return phoneInfo
  **/
  @Schema(description = "")
  public SmartPlusAdCreateBodyAdConfigurationPhoneInfo getPhoneInfo() {
    return phoneInfo;
  }

  public void setPhoneInfo(SmartPlusAdCreateBodyAdConfigurationPhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
  }

  public SmartPlusAdCreateBodyAdConfiguration productDisplayFieldList(List<String> productDisplayFieldList) {
    this.productDisplayFieldList = productDisplayFieldList;
    return this;
  }

  public SmartPlusAdCreateBodyAdConfiguration addProductDisplayFieldListItem(String productDisplayFieldListItem) {
    if (this.productDisplayFieldList == null) {
      this.productDisplayFieldList = new ArrayList<String>();
    }
    this.productDisplayFieldList.add(productDisplayFieldListItem);
    return this;
  }

   /**
   * Get productDisplayFieldList
   * @return productDisplayFieldList
  **/
  @Schema(description = "")
  public List<String> getProductDisplayFieldList() {
    return productDisplayFieldList;
  }

  public void setProductDisplayFieldList(List<String> productDisplayFieldList) {
    this.productDisplayFieldList = productDisplayFieldList;
  }

  public SmartPlusAdCreateBodyAdConfiguration productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public SmartPlusAdCreateBodyAdConfiguration addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<String>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * Get productIds
   * @return productIds
  **/
  @Schema(description = "")
  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  public SmartPlusAdCreateBodyAdConfiguration productSetId(String productSetId) {
    this.productSetId = productSetId;
    return this;
  }

   /**
   * Get productSetId
   * @return productSetId
  **/
  @Schema(description = "")
  public String getProductSetId() {
    return productSetId;
  }

  public void setProductSetId(String productSetId) {
    this.productSetId = productSetId;
  }

  public SmartPlusAdCreateBodyAdConfiguration productSpecificType(String productSpecificType) {
    this.productSpecificType = productSpecificType;
    return this;
  }

   /**
   * Get productSpecificType
   * @return productSpecificType
  **/
  @Schema(description = "")
  public String getProductSpecificType() {
    return productSpecificType;
  }

  public void setProductSpecificType(String productSpecificType) {
    this.productSpecificType = productSpecificType;
  }

  public SmartPlusAdCreateBodyAdConfiguration trackingInfo(SmartPlusAdCreateBodyAdConfigurationTrackingInfo trackingInfo) {
    this.trackingInfo = trackingInfo;
    return this;
  }

   /**
   * Get trackingInfo
   * @return trackingInfo
  **/
  @Schema(description = "")
  public SmartPlusAdCreateBodyAdConfigurationTrackingInfo getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(SmartPlusAdCreateBodyAdConfigurationTrackingInfo trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  public SmartPlusAdCreateBodyAdConfiguration utmParams(List<SmartPlusAdCreateBodyAdConfigurationUtmParams> utmParams) {
    this.utmParams = utmParams;
    return this;
  }

  public SmartPlusAdCreateBodyAdConfiguration addUtmParamsItem(SmartPlusAdCreateBodyAdConfigurationUtmParams utmParamsItem) {
    if (this.utmParams == null) {
      this.utmParams = new ArrayList<SmartPlusAdCreateBodyAdConfigurationUtmParams>();
    }
    this.utmParams.add(utmParamsItem);
    return this;
  }

   /**
   * Get utmParams
   * @return utmParams
  **/
  @Schema(description = "")
  public List<SmartPlusAdCreateBodyAdConfigurationUtmParams> getUtmParams() {
    return utmParams;
  }

  public void setUtmParams(List<SmartPlusAdCreateBodyAdConfigurationUtmParams> utmParams) {
    this.utmParams = utmParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdCreateBodyAdConfiguration smartPlusAdCreateBodyAdConfiguration = (SmartPlusAdCreateBodyAdConfiguration) o;
    return Objects.equals(this.autoDisclaimerTypes, smartPlusAdCreateBodyAdConfiguration.autoDisclaimerTypes) &&
        Objects.equals(this.callToActionId, smartPlusAdCreateBodyAdConfiguration.callToActionId) &&
        Objects.equals(this.catalogCreativeToggle, smartPlusAdCreateBodyAdConfiguration.catalogCreativeToggle) &&
        Objects.equals(this.darkPostStatus, smartPlusAdCreateBodyAdConfiguration.darkPostStatus) &&
        Objects.equals(this.endCardCta, smartPlusAdCreateBodyAdConfiguration.endCardCta) &&
        Objects.equals(this.fallbackType, smartPlusAdCreateBodyAdConfiguration.fallbackType) &&
        Objects.equals(this.identityId, smartPlusAdCreateBodyAdConfiguration.identityId) &&
        Objects.equals(this.identityType, smartPlusAdCreateBodyAdConfiguration.identityType) &&
        Objects.equals(this.phoneInfo, smartPlusAdCreateBodyAdConfiguration.phoneInfo) &&
        Objects.equals(this.productDisplayFieldList, smartPlusAdCreateBodyAdConfiguration.productDisplayFieldList) &&
        Objects.equals(this.productIds, smartPlusAdCreateBodyAdConfiguration.productIds) &&
        Objects.equals(this.productSetId, smartPlusAdCreateBodyAdConfiguration.productSetId) &&
        Objects.equals(this.productSpecificType, smartPlusAdCreateBodyAdConfiguration.productSpecificType) &&
        Objects.equals(this.trackingInfo, smartPlusAdCreateBodyAdConfiguration.trackingInfo) &&
        Objects.equals(this.utmParams, smartPlusAdCreateBodyAdConfiguration.utmParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoDisclaimerTypes, callToActionId, catalogCreativeToggle, darkPostStatus, endCardCta, fallbackType, identityId, identityType, phoneInfo, productDisplayFieldList, productIds, productSetId, productSpecificType, trackingInfo, utmParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBodyAdConfiguration {\n");
    
    sb.append("    autoDisclaimerTypes: ").append(toIndentedString(autoDisclaimerTypes)).append("\n");
    sb.append("    callToActionId: ").append(toIndentedString(callToActionId)).append("\n");
    sb.append("    catalogCreativeToggle: ").append(toIndentedString(catalogCreativeToggle)).append("\n");
    sb.append("    darkPostStatus: ").append(toIndentedString(darkPostStatus)).append("\n");
    sb.append("    endCardCta: ").append(toIndentedString(endCardCta)).append("\n");
    sb.append("    fallbackType: ").append(toIndentedString(fallbackType)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    phoneInfo: ").append(toIndentedString(phoneInfo)).append("\n");
    sb.append("    productDisplayFieldList: ").append(toIndentedString(productDisplayFieldList)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSpecificType: ").append(toIndentedString(productSpecificType)).append("\n");
    sb.append("    trackingInfo: ").append(toIndentedString(trackingInfo)).append("\n");
    sb.append("    utmParams: ").append(toIndentedString(utmParams)).append("\n");
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
