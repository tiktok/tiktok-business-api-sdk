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
 * BlockedwordCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class BlockedwordCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("blocked_words")
  private List<String> blockedWords = new ArrayList<String>();

  public BlockedwordCreateBody advertiserId(String advertiserId) {
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

  public BlockedwordCreateBody blockedWords(List<String> blockedWords) {
    this.blockedWords = blockedWords;
    return this;
  }

  public BlockedwordCreateBody addBlockedWordsItem(String blockedWordsItem) {
    this.blockedWords.add(blockedWordsItem);
    return this;
  }

   /**
   * Get blockedWords
   * @return blockedWords
  **/
  @Schema(required = true, description = "")
  public List<String> getBlockedWords() {
    return blockedWords;
  }

  public void setBlockedWords(List<String> blockedWords) {
    this.blockedWords = blockedWords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockedwordCreateBody blockedwordCreateBody = (BlockedwordCreateBody) o;
    return Objects.equals(this.advertiserId, blockedwordCreateBody.advertiserId) &&
        Objects.equals(this.blockedWords, blockedwordCreateBody.blockedWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, blockedWords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockedwordCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    blockedWords: ").append(toIndentedString(blockedWords)).append("\n");
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
