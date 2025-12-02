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
 * BlockedwordUpdateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class BlockedwordUpdateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("new_word")
  private String newWord = null;

  @JsonProperty("old_word")
  private String oldWord = null;

  public BlockedwordUpdateBody advertiserId(String advertiserId) {
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

  public BlockedwordUpdateBody newWord(String newWord) {
    this.newWord = newWord;
    return this;
  }

   /**
   * Get newWord
   * @return newWord
  **/
  @Schema(required = true, description = "")
  public String getNewWord() {
    return newWord;
  }

  public void setNewWord(String newWord) {
    this.newWord = newWord;
  }

  public BlockedwordUpdateBody oldWord(String oldWord) {
    this.oldWord = oldWord;
    return this;
  }

   /**
   * Get oldWord
   * @return oldWord
  **/
  @Schema(required = true, description = "")
  public String getOldWord() {
    return oldWord;
  }

  public void setOldWord(String oldWord) {
    this.oldWord = oldWord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockedwordUpdateBody blockedwordUpdateBody = (BlockedwordUpdateBody) o;
    return Objects.equals(this.advertiserId, blockedwordUpdateBody.advertiserId) &&
        Objects.equals(this.newWord, blockedwordUpdateBody.newWord) &&
        Objects.equals(this.oldWord, blockedwordUpdateBody.oldWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, newWord, oldWord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockedwordUpdateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    newWord: ").append(toIndentedString(newWord)).append("\n");
    sb.append("    oldWord: ").append(toIndentedString(oldWord)).append("\n");
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
