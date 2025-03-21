/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudienceapplyContextInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CustomAudienceUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class CustomAudienceUpdateBody {
  @JsonProperty("action")
  private String action = "REPLACE";

  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("audience_enhancement")
  private Boolean audienceEnhancement = null;

  @JsonProperty("audience_sub_type")
  private String audienceSubType = null;

  @JsonProperty("context_info")
  private DmpcustomAudienceapplyContextInfo contextInfo = null;

  @JsonProperty("custom_audience_id")
  private String customAudienceId = null;

  @JsonProperty("custom_audience_name")
  private String customAudienceName = null;

  @JsonProperty("file_paths")
  private List<String> filePaths = null;

  public CustomAudienceUpdateBody action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Modification type. This field is valid when file_paths is passed. Enum values: APPEND: Upload files to expand the Customer File audience. Only data not included in the original file will be added. REMOVE: Upload files to remove the Customer File audience. Only the data that coincide with the original file will be removed. REPLACE: Upload files to replace the Customer File audience. All the data in the original file will be replaced. Default value: REPLACE. Note: The APPEND, REMOVE and REPLACE operations will fail if the audience size is less than 1,000 after the operation.
   * @return action
  **/
  @Schema(description = "Modification type. This field is valid when file_paths is passed. Enum values: APPEND: Upload files to expand the Customer File audience. Only data not included in the original file will be added. REMOVE: Upload files to remove the Customer File audience. Only the data that coincide with the original file will be removed. REPLACE: Upload files to replace the Customer File audience. All the data in the original file will be replaced. Default value: REPLACE. Note: The APPEND, REMOVE and REPLACE operations will fail if the audience size is less than 1,000 after the operation.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public CustomAudienceUpdateBody advertiserId(String advertiserId) {
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

  public CustomAudienceUpdateBody audienceEnhancement(Boolean audienceEnhancement) {
    this.audienceEnhancement = audienceEnhancement;
    return this;
  }

   /**
   * Get audienceEnhancement
   * @return audienceEnhancement
  **/
  @Schema(description = "")
  public Boolean isAudienceEnhancement() {
    return audienceEnhancement;
  }

  public void setAudienceEnhancement(Boolean audienceEnhancement) {
    this.audienceEnhancement = audienceEnhancement;
  }

  public CustomAudienceUpdateBody audienceSubType(String audienceSubType) {
    this.audienceSubType = audienceSubType;
    return this;
  }

   /**
   * Audience sub type, indicating the type of ads that the audience can be used for. The allowed enum value: REACH_FREQUENCY(To enable the audience to be used in Reach &amp; Frequency campaigns). It means you can only convert audience sub type from NORMAL to REACH_FREQUENCY, but not the other way round. Note: If you update this field, changes to other data fields will be ignored. If you want to update a Lookalike audience, you cannot change the audience_sub_type to REACH_FREQUENCY. Otherwise, an error will occur.
   * @return audienceSubType
  **/
  @Schema(description = "Audience sub type, indicating the type of ads that the audience can be used for. The allowed enum value: REACH_FREQUENCY(To enable the audience to be used in Reach & Frequency campaigns). It means you can only convert audience sub type from NORMAL to REACH_FREQUENCY, but not the other way round. Note: If you update this field, changes to other data fields will be ignored. If you want to update a Lookalike audience, you cannot change the audience_sub_type to REACH_FREQUENCY. Otherwise, an error will occur.")
  public String getAudienceSubType() {
    return audienceSubType;
  }

  public void setAudienceSubType(String audienceSubType) {
    this.audienceSubType = audienceSubType;
  }

  public CustomAudienceUpdateBody contextInfo(DmpcustomAudienceapplyContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public DmpcustomAudienceapplyContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(DmpcustomAudienceapplyContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public CustomAudienceUpdateBody customAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * Custom audience ID.
   * @return customAudienceId
  **/
  @Schema(required = true, description = "Custom audience ID.")
  public String getCustomAudienceId() {
    return customAudienceId;
  }

  public void setCustomAudienceId(String customAudienceId) {
    this.customAudienceId = customAudienceId;
  }

  public CustomAudienceUpdateBody customAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
    return this;
  }

   /**
   * New name for the audience. Length limit: 128 characters. You must pass in either this field or file_paths.
   * @return customAudienceName
  **/
  @Schema(description = "New name for the audience. Length limit: 128 characters. You must pass in either this field or file_paths.")
  public String getCustomAudienceName() {
    return customAudienceName;
  }

  public void setCustomAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
  }

  public CustomAudienceUpdateBody filePaths(List<String> filePaths) {
    this.filePaths = filePaths;
    return this;
  }

  public CustomAudienceUpdateBody addFilePathsItem(String filePathsItem) {
    if (this.filePaths == null) {
      this.filePaths = new ArrayList<String>();
    }
    this.filePaths.add(filePathsItem);
    return this;
  }

   /**
   * The files you upload to update the Customer File audience. You must pass in either this field or custom_audience_name. The recommended size is &lt;50 per request to ensure stability. Once you pass in this field, you can specify the modification type (APPEND, REMOVE or REPLACE) via action. The files must be encrypted with the same encryption method/type with the audience that you want to update.
   * @return filePaths
  **/
  @Schema(description = "The files you upload to update the Customer File audience. You must pass in either this field or custom_audience_name. The recommended size is <50 per request to ensure stability. Once you pass in this field, you can specify the modification type (APPEND, REMOVE or REPLACE) via action. The files must be encrypted with the same encryption method/type with the audience that you want to update.")
  public List<String> getFilePaths() {
    return filePaths;
  }

  public void setFilePaths(List<String> filePaths) {
    this.filePaths = filePaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudienceUpdateBody customAudienceUpdateBody = (CustomAudienceUpdateBody) o;
    return Objects.equals(this.action, customAudienceUpdateBody.action) &&
        Objects.equals(this.advertiserId, customAudienceUpdateBody.advertiserId) &&
        Objects.equals(this.audienceEnhancement, customAudienceUpdateBody.audienceEnhancement) &&
        Objects.equals(this.audienceSubType, customAudienceUpdateBody.audienceSubType) &&
        Objects.equals(this.contextInfo, customAudienceUpdateBody.contextInfo) &&
        Objects.equals(this.customAudienceId, customAudienceUpdateBody.customAudienceId) &&
        Objects.equals(this.customAudienceName, customAudienceUpdateBody.customAudienceName) &&
        Objects.equals(this.filePaths, customAudienceUpdateBody.filePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, advertiserId, audienceEnhancement, audienceSubType, contextInfo, customAudienceId, customAudienceName, filePaths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAudienceUpdateBody {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audienceEnhancement: ").append(toIndentedString(audienceEnhancement)).append("\n");
    sb.append("    audienceSubType: ").append(toIndentedString(audienceSubType)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    customAudienceName: ").append(toIndentedString(customAudienceName)).append("\n");
    sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
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
