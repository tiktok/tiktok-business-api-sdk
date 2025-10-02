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
 * CustomAudienceCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class CustomAudienceCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("audience_enhancement")
  private Boolean audienceEnhancement = false;

  @JsonProperty("audience_sub_type")
  private String audienceSubType = "NORMAL";

  @JsonProperty("calculate_type")
  private String calculateType = null;

  @JsonProperty("custom_audience_name")
  private String customAudienceName = null;

  @JsonProperty("file_paths")
  private List<String> filePaths = new ArrayList<String>();

  @JsonProperty("retention_in_days")
  private Integer retentionInDays = null;

  public CustomAudienceCreateBody advertiserId(String advertiserId) {
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

  public CustomAudienceCreateBody audienceEnhancement(Boolean audienceEnhancement) {
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

  public CustomAudienceCreateBody audienceSubType(String audienceSubType) {
    this.audienceSubType = audienceSubType;
    return this;
  }

   /**
   * Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL Normal audience. It can be used in non-R&amp;F ads. REACH_FREQUENCY: Audience for Reach &amp; Frequency. It can only be used in R&amp;F ads. Default: NORMAL.
   * @return audienceSubType
  **/
  @Schema(description = "Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL Normal audience. It can be used in non-R&F ads. REACH_FREQUENCY: Audience for Reach & Frequency. It can only be used in R&F ads. Default: NORMAL.")
  public String getAudienceSubType() {
    return audienceSubType;
  }

  public void setAudienceSubType(String audienceSubType) {
    this.audienceSubType = audienceSubType;
  }

  public CustomAudienceCreateBody calculateType(String calculateType) {
    this.calculateType = calculateType;
    return this;
  }

   /**
   * Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type.
   * @return calculateType
  **/
  @Schema(required = true, description = "Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type.")
  public String getCalculateType() {
    return calculateType;
  }

  public void setCalculateType(String calculateType) {
    this.calculateType = calculateType;
  }

  public CustomAudienceCreateBody customAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
    return this;
  }

   /**
   * Audience name. Maximum of 128 characters.
   * @return customAudienceName
  **/
  @Schema(required = true, description = "Audience name. Maximum of 128 characters.")
  public String getCustomAudienceName() {
    return customAudienceName;
  }

  public void setCustomAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
  }

  public CustomAudienceCreateBody filePaths(List<String> filePaths) {
    this.filePaths = filePaths;
    return this;
  }

  public CustomAudienceCreateBody addFilePathsItem(String filePathsItem) {
    this.filePaths.add(filePathsItem);
    return this;
  }

   /**
   * List of file paths. The recommended size is &lt;50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint.
   * @return filePaths
  **/
  @Schema(required = true, description = "List of file paths. The recommended size is <50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint.")
  public List<String> getFilePaths() {
    return filePaths;
  }

  public void setFilePaths(List<String> filePaths) {
    this.filePaths = filePaths;
  }

  public CustomAudienceCreateBody retentionInDays(Integer retentionInDays) {
    this.retentionInDays = retentionInDays;
    return this;
  }

   /**
   * Number of days to retain the audience. Value range: [1, 365]. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.
   * minimum: 1
   * maximum: 365
   * @return retentionInDays
  **/
  @Schema(description = "Number of days to retain the audience. Value range: [1, 365]. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy.")
  public Integer getRetentionInDays() {
    return retentionInDays;
  }

  public void setRetentionInDays(Integer retentionInDays) {
    this.retentionInDays = retentionInDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAudienceCreateBody customAudienceCreateBody = (CustomAudienceCreateBody) o;
    return Objects.equals(this.advertiserId, customAudienceCreateBody.advertiserId) &&
        Objects.equals(this.audienceEnhancement, customAudienceCreateBody.audienceEnhancement) &&
        Objects.equals(this.audienceSubType, customAudienceCreateBody.audienceSubType) &&
        Objects.equals(this.calculateType, customAudienceCreateBody.calculateType) &&
        Objects.equals(this.customAudienceName, customAudienceCreateBody.customAudienceName) &&
        Objects.equals(this.filePaths, customAudienceCreateBody.filePaths) &&
        Objects.equals(this.retentionInDays, customAudienceCreateBody.retentionInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audienceEnhancement, audienceSubType, calculateType, customAudienceName, filePaths, retentionInDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAudienceCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audienceEnhancement: ").append(toIndentedString(audienceEnhancement)).append("\n");
    sb.append("    audienceSubType: ").append(toIndentedString(audienceSubType)).append("\n");
    sb.append("    calculateType: ").append(toIndentedString(calculateType)).append("\n");
    sb.append("    customAudienceName: ").append(toIndentedString(customAudienceName)).append("\n");
    sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
    sb.append("    retentionInDays: ").append(toIndentedString(retentionInDays)).append("\n");
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
