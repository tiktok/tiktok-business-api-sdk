/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencefileuploadContextInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * LookalikeUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class LookalikeUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("context_info")
  private DmpcustomAudiencefileuploadContextInfo contextInfo = null;

  @JsonProperty("custom_audience_ids")
  private List<String> customAudienceIds = new ArrayList<String>();

  public LookalikeUpdateBody advertiserId(String advertiserId) {
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

  public LookalikeUpdateBody contextInfo(DmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public DmpcustomAudiencefileuploadContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(DmpcustomAudiencefileuploadContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public LookalikeUpdateBody customAudienceIds(List<String> customAudienceIds) {
    this.customAudienceIds = customAudienceIds;
    return this;
  }

  public LookalikeUpdateBody addCustomAudienceIdsItem(String customAudienceIdsItem) {
    this.customAudienceIds.add(customAudienceIdsItem);
    return this;
  }

   /**
   * A list of custom audience IDs.
   * @return customAudienceIds
  **/
  @Schema(required = true, description = "A list of custom audience IDs.")
  public List<String> getCustomAudienceIds() {
    return customAudienceIds;
  }

  public void setCustomAudienceIds(List<String> customAudienceIds) {
    this.customAudienceIds = customAudienceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookalikeUpdateBody lookalikeUpdateBody = (LookalikeUpdateBody) o;
    return Objects.equals(this.advertiserId, lookalikeUpdateBody.advertiserId) &&
        Objects.equals(this.contextInfo, lookalikeUpdateBody.contextInfo) &&
        Objects.equals(this.customAudienceIds, lookalikeUpdateBody.customAudienceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, contextInfo, customAudienceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookalikeUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    customAudienceIds: ").append(toIndentedString(customAudienceIds)).append("\n");
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
