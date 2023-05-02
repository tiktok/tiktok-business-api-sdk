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
 * OpenApiv13creativeportfoliocreateAdvancedAudioInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class OpenApiv13creativeportfoliocreateAdvancedAudioInfo {
  @JsonProperty("video_id")
  private String videoId = null;

  public OpenApiv13creativeportfoliocreateAdvancedAudioInfo videoId(String videoId) {
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
    OpenApiv13creativeportfoliocreateAdvancedAudioInfo openApiv13creativeportfoliocreateAdvancedAudioInfo = (OpenApiv13creativeportfoliocreateAdvancedAudioInfo) o;
    return Objects.equals(this.videoId, openApiv13creativeportfoliocreateAdvancedAudioInfo.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13creativeportfoliocreateAdvancedAudioInfo {\n");
    
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
