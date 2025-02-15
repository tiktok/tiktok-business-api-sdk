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
 * CustomAudienceDeleteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class CustomAudienceDeleteBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("custom_audience_ids")
  private List<String> customAudienceIds = new ArrayList<String>();

  public CustomAudienceDeleteBody advertiserId(String advertiserId) {
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

  public CustomAudienceDeleteBody customAudienceIds(List<String> customAudienceIds) {
    this.customAudienceIds = customAudienceIds;
    return this;
  }

  public CustomAudienceDeleteBody addCustomAudienceIdsItem(String customAudienceIdsItem) {
    this.customAudienceIds.add(customAudienceIdsItem);
    return this;
  }

   /**
   * A list of Audience IDs. Length range is [1, 100].
   * @return customAudienceIds
  **/
  @Schema(required = true, description = "A list of Audience IDs. Length range is [1, 100].")
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
    CustomAudienceDeleteBody customAudienceDeleteBody = (CustomAudienceDeleteBody) o;
    return Objects.equals(this.advertiserId, customAudienceDeleteBody.advertiserId) &&
        Objects.equals(this.customAudienceIds, customAudienceDeleteBody.customAudienceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, customAudienceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAudienceDeleteBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
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
