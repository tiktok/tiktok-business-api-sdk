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
 * PlayableDeleteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class PlayableDeleteBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("playable_id")
  private String playableId = null;

  public PlayableDeleteBody advertiserId(String advertiserId) {
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

  public PlayableDeleteBody playableId(String playableId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableDeleteBody playableDeleteBody = (PlayableDeleteBody) o;
    return Objects.equals(this.advertiserId, playableDeleteBody.advertiserId) &&
        Objects.equals(this.playableId, playableDeleteBody.playableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, playableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableDeleteBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
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
