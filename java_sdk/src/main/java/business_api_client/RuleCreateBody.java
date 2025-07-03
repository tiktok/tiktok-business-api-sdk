/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencerulecreateRuleSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * RuleCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class RuleCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("audience_sub_type")
  private String audienceSubType = null;

  @JsonProperty("audience_type")
  private String audienceType = null;

  @JsonProperty("custom_audience_name")
  private String customAudienceName = null;

  @JsonProperty("identity_authorized_bc_id")
  private String identityAuthorizedBcId = null;

  @JsonProperty("identity_id")
  private String identityId = null;

  @JsonProperty("identity_type")
  private String identityType = null;

  @JsonProperty("is_auto_refresh")
  private Boolean isAutoRefresh = null;

  @JsonProperty("retention_in_days")
  private Integer retentionInDays = null;

  @JsonProperty("rule_spec")
  private DmpcustomAudiencerulecreateRuleSpec ruleSpec = null;

  public RuleCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public RuleCreateBody audienceSubType(String audienceSubType) {
    this.audienceSubType = audienceSubType;
    return this;
  }

   /**
   * Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL: Audience for non-Reach &amp; Frequency ads. REACH_FREQUENCY: Audience for Reach &amp; Frequency ads. It can only be used in Reach &amp; Frequency ads. Default value: NORMAL.
   * @return audienceSubType
  **/
  @Schema(description = "Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL: Audience for non-Reach & Frequency ads. REACH_FREQUENCY: Audience for Reach & Frequency ads. It can only be used in Reach & Frequency ads. Default value: NORMAL.")
  public String getAudienceSubType() {
    return audienceSubType;
  }

  public void setAudienceSubType(String audienceSubType) {
    this.audienceSubType = audienceSubType;
  }

  public RuleCreateBody audienceType(String audienceType) {
    this.audienceType = audienceType;
    return this;
  }

   /**
   * Audience type. Enum values: ENGAGEMENT: Engagement Audience (with asset type as ad groups). ENGAGEMENT_ORGANIC_VIDEO: Organic Engagement Audience (with asset type as public video). ENGAGEMENT_LIVE_VIDEO: Live Engagement Audience (with asset type as live video). APP: App Activity Audience. PIXEL: Website Traffic Audience. LEAD_GENERATION: Lead Generation Audience. BUSINESS_ACCOUNT: Business Account Audience. TIKTOK_SHOP: Shop Activity Audience. OFFLINE: Offline Activity Audience.
   * @return audienceType
  **/
  @Schema(required = true, description = "Audience type. Enum values: ENGAGEMENT: Engagement Audience (with asset type as ad groups). ENGAGEMENT_ORGANIC_VIDEO: Organic Engagement Audience (with asset type as public video). ENGAGEMENT_LIVE_VIDEO: Live Engagement Audience (with asset type as live video). APP: App Activity Audience. PIXEL: Website Traffic Audience. LEAD_GENERATION: Lead Generation Audience. BUSINESS_ACCOUNT: Business Account Audience. TIKTOK_SHOP: Shop Activity Audience. OFFLINE: Offline Activity Audience.")
  public String getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

  public RuleCreateBody customAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
    return this;
  }

   /**
   * Audience name. Length limit: 128 characters.
   * @return customAudienceName
  **/
  @Schema(required = true, description = "Audience name. Length limit: 128 characters.")
  public String getCustomAudienceName() {
    return customAudienceName;
  }

  public void setCustomAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
  }

  public RuleCreateBody identityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
    return this;
  }

   /**
   * Required when identity_type is BC_AUTH_TT. ID of the Business Center that a TikTok Account User in Business Center identity is associated with.
   * @return identityAuthorizedBcId
  **/
  @Schema(description = "Required when identity_type is BC_AUTH_TT. ID of the Business Center that a TikTok Account User in Business Center identity is associated with.")
  public String getIdentityAuthorizedBcId() {
    return identityAuthorizedBcId;
  }

  public void setIdentityAuthorizedBcId(String identityAuthorizedBcId) {
    this.identityAuthorizedBcId = identityAuthorizedBcId;
  }

  public RuleCreateBody identityId(String identityId) {
    this.identityId = identityId;
    return this;
  }

   /**
   * Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity ID.
   * @return identityId
  **/
  @Schema(description = "Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity ID.")
  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public RuleCreateBody identityType(String identityType) {
    this.identityType = identityType;
    return this;
  }

   /**
   * Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity type. Enum values: TT_USER, BC_AUTH_TT
   * @return identityType
  **/
  @Schema(description = "Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity type. Enum values: TT_USER, BC_AUTH_TT")
  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }

  public RuleCreateBody isAutoRefresh(Boolean isAutoRefresh) {
    this.isAutoRefresh = isAutoRefresh;
    return this;
  }

   /**
   * Whether to turn on the audience auto-refresh function. Supported values: true, false. Default value: true. If you enable this feature, your audience will automatically refresh to include the latest user data according to the lookback window you set. If you disable this feature, your audience will not automatically refresh.
   * @return isAutoRefresh
  **/
  @Schema(description = "Whether to turn on the audience auto-refresh function. Supported values: true, false. Default value: true. If you enable this feature, your audience will automatically refresh to include the latest user data according to the lookback window you set. If you disable this feature, your audience will not automatically refresh.")
  public Boolean isIsAutoRefresh() {
    return isAutoRefresh;
  }

  public void setIsAutoRefresh(Boolean isAutoRefresh) {
    this.isAutoRefresh = isAutoRefresh;
  }

  public RuleCreateBody retentionInDays(Integer retentionInDays) {
    this.retentionInDays = retentionInDays;
    return this;
  }

   /**
   * Number of days to retain the audience. Value range: 1-365. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.
   * @return retentionInDays
  **/
  @Schema(description = "Number of days to retain the audience. Value range: 1-365. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.")
  public Integer getRetentionInDays() {
    return retentionInDays;
  }

  public void setRetentionInDays(Integer retentionInDays) {
    this.retentionInDays = retentionInDays;
  }

  public RuleCreateBody ruleSpec(DmpcustomAudiencerulecreateRuleSpec ruleSpec) {
    this.ruleSpec = ruleSpec;
    return this;
  }

   /**
   * Get ruleSpec
   * @return ruleSpec
  **/
  @Schema(required = true, description = "")
  public DmpcustomAudiencerulecreateRuleSpec getRuleSpec() {
    return ruleSpec;
  }

  public void setRuleSpec(DmpcustomAudiencerulecreateRuleSpec ruleSpec) {
    this.ruleSpec = ruleSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleCreateBody ruleCreateBody = (RuleCreateBody) o;
    return Objects.equals(this.advertiserId, ruleCreateBody.advertiserId) &&
        Objects.equals(this.audienceSubType, ruleCreateBody.audienceSubType) &&
        Objects.equals(this.audienceType, ruleCreateBody.audienceType) &&
        Objects.equals(this.customAudienceName, ruleCreateBody.customAudienceName) &&
        Objects.equals(this.identityAuthorizedBcId, ruleCreateBody.identityAuthorizedBcId) &&
        Objects.equals(this.identityId, ruleCreateBody.identityId) &&
        Objects.equals(this.identityType, ruleCreateBody.identityType) &&
        Objects.equals(this.isAutoRefresh, ruleCreateBody.isAutoRefresh) &&
        Objects.equals(this.retentionInDays, ruleCreateBody.retentionInDays) &&
        Objects.equals(this.ruleSpec, ruleCreateBody.ruleSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audienceSubType, audienceType, customAudienceName, identityAuthorizedBcId, identityId, identityType, isAutoRefresh, retentionInDays, ruleSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audienceSubType: ").append(toIndentedString(audienceSubType)).append("\n");
    sb.append("    audienceType: ").append(toIndentedString(audienceType)).append("\n");
    sb.append("    customAudienceName: ").append(toIndentedString(customAudienceName)).append("\n");
    sb.append("    identityAuthorizedBcId: ").append(toIndentedString(identityAuthorizedBcId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    isAutoRefresh: ").append(toIndentedString(isAutoRefresh)).append("\n");
    sb.append("    retentionInDays: ").append(toIndentedString(retentionInDays)).append("\n");
    sb.append("    ruleSpec: ").append(toIndentedString(ruleSpec)).append("\n");
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
