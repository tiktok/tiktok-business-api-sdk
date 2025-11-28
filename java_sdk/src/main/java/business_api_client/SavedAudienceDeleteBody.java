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
 * SavedAudienceDeleteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SavedAudienceDeleteBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("saved_audience_ids")
  private List<String> savedAudienceIds = new ArrayList<String>();

  public SavedAudienceDeleteBody advertiserId(String advertiserId) {
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

  public SavedAudienceDeleteBody savedAudienceIds(List<String> savedAudienceIds) {
    this.savedAudienceIds = savedAudienceIds;
    return this;
  }

  public SavedAudienceDeleteBody addSavedAudienceIdsItem(String savedAudienceIdsItem) {
    this.savedAudienceIds.add(savedAudienceIdsItem);
    return this;
  }

   /**
   * IDs of Saved Audiences that you want to delete. Max size &#x3D; 100.
   * @return savedAudienceIds
  **/
  @Schema(required = true, description = "IDs of Saved Audiences that you want to delete. Max size = 100.")
  public List<String> getSavedAudienceIds() {
    return savedAudienceIds;
  }

  public void setSavedAudienceIds(List<String> savedAudienceIds) {
    this.savedAudienceIds = savedAudienceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedAudienceDeleteBody savedAudienceDeleteBody = (SavedAudienceDeleteBody) o;
    return Objects.equals(this.advertiserId, savedAudienceDeleteBody.advertiserId) &&
        Objects.equals(this.savedAudienceIds, savedAudienceDeleteBody.savedAudienceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, savedAudienceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedAudienceDeleteBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    savedAudienceIds: ").append(toIndentedString(savedAudienceIds)).append("\n");
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
