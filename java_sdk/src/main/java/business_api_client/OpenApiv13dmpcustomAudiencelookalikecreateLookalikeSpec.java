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
 * OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec {
  @JsonProperty("audience_size")
  private String audienceSize = null;

  @JsonProperty("include_source")
  private Boolean includeSource = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = null;

  @JsonProperty("mobile_os")
  private String mobileOs = null;

  @JsonProperty("placements")
  private List<String> placements = null;

  @JsonProperty("source_audience_id")
  private String sourceAudienceId = null;

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec audienceSize(String audienceSize) {
    this.audienceSize = audienceSize;
    return this;
  }

   /**
   * Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD.
   * @return audienceSize
  **/
  @Schema(description = "Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD.")
  public String getAudienceSize() {
    return audienceSize;
  }

  public void setAudienceSize(String audienceSize) {
    this.audienceSize = audienceSize;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec includeSource(Boolean includeSource) {
    this.includeSource = includeSource;
    return this;
  }

   /**
   * Whether to include the source audience in the new lookalike audience.
   * @return includeSource
  **/
  @Schema(description = "Whether to include the source audience in the new lookalike audience.")
  public Boolean isIncludeSource() {
    return includeSource;
  }

  public void setIncludeSource(Boolean includeSource) {
    this.includeSource = includeSource;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec addLocationIdsItem(String locationIdsItem) {
    if (this.locationIds == null) {
      this.locationIds = new ArrayList<String>();
    }
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations.
   * @return locationIds
  **/
  @Schema(description = "IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec mobileOs(String mobileOs) {
    this.mobileOs = mobileOs;
    return this;
  }

   /**
   * Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details.
   * @return mobileOs
  **/
  @Schema(description = "Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details.")
  public String getMobileOs() {
    return mobileOs;
  }

  public void setMobileOs(String mobileOs) {
    this.mobileOs = mobileOs;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec placements(List<String> placements) {
    this.placements = placements;
    return this;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec addPlacementsItem(String placementsItem) {
    if (this.placements == null) {
      this.placements = new ArrayList<String>();
    }
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz &amp; BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details.
   * @return placements
  **/
  @Schema(description = "The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz & BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details.")
  public List<String> getPlacements() {
    return placements;
  }

  public void setPlacements(List<String> placements) {
    this.placements = placements;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec sourceAudienceId(String sourceAudienceId) {
    this.sourceAudienceId = sourceAudienceId;
    return this;
  }

   /**
   * Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100.
   * @return sourceAudienceId
  **/
  @Schema(description = "Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100.")
  public String getSourceAudienceId() {
    return sourceAudienceId;
  }

  public void setSourceAudienceId(String sourceAudienceId) {
    this.sourceAudienceId = sourceAudienceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec = (OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec) o;
    return Objects.equals(this.audienceSize, openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.audienceSize) &&
        Objects.equals(this.includeSource, openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.includeSource) &&
        Objects.equals(this.locationIds, openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.locationIds) &&
        Objects.equals(this.mobileOs, openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.mobileOs) &&
        Objects.equals(this.placements, openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.placements) &&
        Objects.equals(this.sourceAudienceId, openApiv13dmpcustomAudiencelookalikecreateLookalikeSpec.sourceAudienceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceSize, includeSource, locationIds, mobileOs, placements, sourceAudienceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencelookalikecreateLookalikeSpec {\n");
    
    sb.append("    audienceSize: ").append(toIndentedString(audienceSize)).append("\n");
    sb.append("    includeSource: ").append(toIndentedString(includeSource)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    mobileOs: ").append(toIndentedString(mobileOs)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    sourceAudienceId: ").append(toIndentedString(sourceAudienceId)).append("\n");
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
