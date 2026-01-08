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
 * SmartPlusAdCreateBodyCreativeInfoMusicInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class SmartPlusAdCreateBodyCreativeInfoMusicInfo {
  @JsonProperty("music_id")
  private String musicId = null;

  public SmartPlusAdCreateBodyCreativeInfoMusicInfo musicId(String musicId) {
    this.musicId = musicId;
    return this;
  }

   /**
   * Get musicId
   * @return musicId
  **/
  @Schema(required = true, description = "")
  public String getMusicId() {
    return musicId;
  }

  public void setMusicId(String musicId) {
    this.musicId = musicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdCreateBodyCreativeInfoMusicInfo smartPlusAdCreateBodyCreativeInfoMusicInfo = (SmartPlusAdCreateBodyCreativeInfoMusicInfo) o;
    return Objects.equals(this.musicId, smartPlusAdCreateBodyCreativeInfoMusicInfo.musicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(musicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBodyCreativeInfoMusicInfo {\n");
    
    sb.append("    musicId: ").append(toIndentedString(musicId)).append("\n");
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
