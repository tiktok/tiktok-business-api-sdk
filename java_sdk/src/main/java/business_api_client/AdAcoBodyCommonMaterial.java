/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdAcoBodyCommonMaterialTrackingInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Common material.
 */
@Schema(description = "Common material.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class AdAcoBodyCommonMaterial {
  @JsonProperty("ad_name")
  private String adName = null;

  @JsonProperty("call_to_action_id")
  private String callToActionId = null;

  @JsonProperty("creative_authorized")
  private Boolean creativeAuthorized = null;

  @JsonProperty("fallback_type")
  private String fallbackType = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("is_smart_creative")
  private Boolean isSmartCreative = null;

  @JsonProperty("playable_url")
  private String playableUrl = null;

  @JsonProperty("tracking_info")
  private AdAcoBodyCommonMaterialTrackingInfo trackingInfo = null;

  public AdAcoBodyCommonMaterial adName(String adName) {
    this.adName = adName;
    return this;
  }

   /**
   * Ad name. Set as \&quot; \&quot; (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji.
   * @return adName
  **/
  @Schema(description = "Ad name. Set as \" \" (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji.")
  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public AdAcoBodyCommonMaterial callToActionId(String callToActionId) {
    this.callToActionId = callToActionId;
    return this;
  }

   /**
   * The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. For details about auto-optimized CTAs, see [CTA recommendations &gt; Dynamic CTAs](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740307296329730)
   * @return callToActionId
  **/
  @Schema(description = "The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. For details about auto-optimized CTAs, see [CTA recommendations > Dynamic CTAs](https://ads.tiktok.com/marketing_api/docs?id=1740307296329730)")
  public String getCallToActionId() {
    return callToActionId;
  }

  public void setCallToActionId(String callToActionId) {
    this.callToActionId = callToActionId;
  }

  public AdAcoBodyCommonMaterial creativeAuthorized(Boolean creativeAuthorized) {
    this.creativeAuthorized = creativeAuthorized;
    return this;
  }

   /**
   * Whether you grant displaying some of your ads in our TikTok for Business Creative Center. Only valid for non-US advertisers, the default value is &#x60;false&#x60;.
   * @return creativeAuthorized
  **/
  @Schema(description = "Whether you grant displaying some of your ads in our TikTok for Business Creative Center. Only valid for non-US advertisers, the default value is `false`.")
  public Boolean isCreativeAuthorized() {
    return creativeAuthorized;
  }

  public void setCreativeAuthorized(Boolean creativeAuthorized) {
    this.creativeAuthorized = creativeAuthorized;
  }

  public AdAcoBodyCommonMaterial fallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
    return this;
  }

   /**
   * Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page.  Allowed values- &#x60;APP_INSTALL &#x60;, &#x60;WEBSITE&#x60;. If website is chosen, you need to specify the url via &#x60;landing_page_urls&#x60; field.
   * @return fallbackType
  **/
  @Schema(description = "Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page.  Allowed values- `APP_INSTALL `, `WEBSITE`. If website is chosen, you need to specify the url via `landing_page_urls` field.")
  public String getFallbackType() {
    return fallbackType;
  }

  public void setFallbackType(String fallbackType) {
    this.fallbackType = fallbackType;
  }

  public AdAcoBodyCommonMaterial identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Identity ID, required when you use Spark Ads (&#x60;tiktok_item_id&#x60;).
   * @return identityId
  **/
  @Schema(description = "Identity ID, required when you use Spark Ads (`tiktok_item_id`).")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public AdAcoBodyCommonMaterial identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Identity type. Required when you use Spark Ads (&#x60;tiktok_item_id&#x60;). Enum values- &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097).
   * @return identityType
  **/
  @Schema(description = "Identity type. Required when you use Spark Ads (`tiktok_item_id`). Enum values- `AUTH_CODE`, `TT_USER`. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097).")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public AdAcoBodyCommonMaterial isSmartCreative(Boolean isSmartCreative) {
    this.isSmartCreative = isSmartCreative;
    return this;
  }

   /**
   * Whether the ad is a Smart Creative ad. Default value- &#x60;False&#x60;. Smart Creative is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.
   * @return isSmartCreative
  **/
  @Schema(description = "Whether the ad is a Smart Creative ad. Default value- `False`. Smart Creative is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative.")
  public Boolean isIsSmartCreative() {
    return isSmartCreative;
  }

  public void setIsSmartCreative(Boolean isSmartCreative) {
    this.isSmartCreative = isSmartCreative;
  }

  public AdAcoBodyCommonMaterial playableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * Playable material url, valid only in Pangle placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737732758495234) endpoint. Note that all ads in the same ad group share the same playable material.
   * @return playableUrl
  **/
  @Schema(description = "Playable material url, valid only in Pangle placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id=1737732758495234) endpoint. Note that all ads in the same ad group share the same playable material.")
  public String getPlayableUrl() {
    return playableUrl;
  }

  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }

  public AdAcoBodyCommonMaterial trackingInfo(AdAcoBodyCommonMaterialTrackingInfo trackingInfo) {
    this.trackingInfo = trackingInfo;
    return this;
  }

   /**
   * Get trackingInfo
   * @return trackingInfo
  **/
  @Schema(description = "")
  public AdAcoBodyCommonMaterialTrackingInfo getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(AdAcoBodyCommonMaterialTrackingInfo trackingInfo) {
    this.trackingInfo = trackingInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyCommonMaterial adAcoBodyCommonMaterial = (AdAcoBodyCommonMaterial) o;
    return Objects.equals(this.adName, adAcoBodyCommonMaterial.adName) &&
        Objects.equals(this.callToActionId, adAcoBodyCommonMaterial.callToActionId) &&
        Objects.equals(this.creativeAuthorized, adAcoBodyCommonMaterial.creativeAuthorized) &&
        Objects.equals(this.fallbackType, adAcoBodyCommonMaterial.fallbackType) &&
        Objects.equals(this.identityId, adAcoBodyCommonMaterial.identityId) &&
        Objects.equals(this.identityType, adAcoBodyCommonMaterial.identityType) &&
        Objects.equals(this.isSmartCreative, adAcoBodyCommonMaterial.isSmartCreative) &&
        Objects.equals(this.playableUrl, adAcoBodyCommonMaterial.playableUrl) &&
        Objects.equals(this.trackingInfo, adAcoBodyCommonMaterial.trackingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adName, callToActionId, creativeAuthorized, fallbackType, identityId, identityType, isSmartCreative, playableUrl, trackingInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyCommonMaterial {\n");
    
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    callToActionId: ").append(toIndentedString(callToActionId)).append("\n");
    sb.append("    creativeAuthorized: ").append(toIndentedString(creativeAuthorized)).append("\n");
    sb.append("    fallbackType: ").append(toIndentedString(fallbackType)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    isSmartCreative: ").append(toIndentedString(isSmartCreative)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    trackingInfo: ").append(toIndentedString(trackingInfo)).append("\n");
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
