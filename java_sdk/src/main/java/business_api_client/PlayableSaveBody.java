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
/**
 * PlayableSaveBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class PlayableSaveBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("playable_id")
  private String playableId = null;

  @JsonProperty("playable_name")
  private String playableName = null;

  public PlayableSaveBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(required = true, description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public PlayableSaveBody playableId(String playableId) {
    this.playableId = playableId;
    return this;
  }

   /**
   * Get playableId
   * @return playableId
  **/
  @Schema(required = true, description = "")
  public String getPlayableId() {
    return playableId;
  }

  public void setPlayableId(String playableId) {
    this.playableId = playableId;
  }

  public PlayableSaveBody playableName(String playableName) {
    this.playableName = playableName;
    return this;
  }

   /**
   * Get playableName
   * @return playableName
  **/
  @Schema(required = true, description = "")
  public String getPlayableName() {
    return playableName;
  }

  public void setPlayableName(String playableName) {
    this.playableName = playableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableSaveBody playableSaveBody = (PlayableSaveBody) o;
    return Objects.equals(this.advertiserId, playableSaveBody.advertiserId) &&
        Objects.equals(this.playableId, playableSaveBody.playableId) &&
        Objects.equals(this.playableName, playableSaveBody.playableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, playableId, playableName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableSaveBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableName: ").append(toIndentedString(playableName)).append("\n");
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
