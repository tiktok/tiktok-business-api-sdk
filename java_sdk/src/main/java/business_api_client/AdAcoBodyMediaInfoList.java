/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.AdAcoBodyMediaInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AdAcoBodyMediaInfoList
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class AdAcoBodyMediaInfoList {
  @JsonProperty("media_info")
  private AdAcoBodyMediaInfo mediaInfo = null;

  public AdAcoBodyMediaInfoList mediaInfo(AdAcoBodyMediaInfo mediaInfo) {
    this.mediaInfo = mediaInfo;
    return this;
  }

   /**
   * Get mediaInfo
   * @return mediaInfo
  **/
  @Schema(description = "")
  public AdAcoBodyMediaInfo getMediaInfo() {
    return mediaInfo;
  }

  public void setMediaInfo(AdAcoBodyMediaInfo mediaInfo) {
    this.mediaInfo = mediaInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyMediaInfoList adAcoBodyMediaInfoList = (AdAcoBodyMediaInfoList) o;
    return Objects.equals(this.mediaInfo, adAcoBodyMediaInfoList.mediaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyMediaInfoList {\n");
    
    sb.append("    mediaInfo: ").append(toIndentedString(mediaInfo)).append("\n");
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
