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
 * CreativeportfoliocreateAdvancedAudioInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class CreativeportfoliocreateAdvancedAudioInfo {
  @JsonProperty("video_id")
  private String videoId = null;

  public CreativeportfoliocreateAdvancedAudioInfo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @Schema(description = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeportfoliocreateAdvancedAudioInfo creativeportfoliocreateAdvancedAudioInfo = (CreativeportfoliocreateAdvancedAudioInfo) o;
    return Objects.equals(this.videoId, creativeportfoliocreateAdvancedAudioInfo.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeportfoliocreateAdvancedAudioInfo {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
