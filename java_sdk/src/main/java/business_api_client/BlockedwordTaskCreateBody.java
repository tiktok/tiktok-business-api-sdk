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
 * BlockedwordTaskCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class BlockedwordTaskCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("blocked_words")
  private List<String> blockedWords = null;

  @JsonProperty("lang")
  private String lang = "EN";

  public BlockedwordTaskCreateBody advertiserId(String advertiserId) {
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

  public BlockedwordTaskCreateBody blockedWords(List<String> blockedWords) {
    this.blockedWords = blockedWords;
    return this;
  }

  public BlockedwordTaskCreateBody addBlockedWordsItem(String blockedWordsItem) {
    if (this.blockedWords == null) {
      this.blockedWords = new ArrayList<String>();
    }
    this.blockedWords.add(blockedWordsItem);
    return this;
  }

   /**
   * Get blockedWords
   * @return blockedWords
  **/
  @Schema(description = "")
  public List<String> getBlockedWords() {
    return blockedWords;
  }

  public void setBlockedWords(List<String> blockedWords) {
    this.blockedWords = blockedWords;
  }

  public BlockedwordTaskCreateBody lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockedwordTaskCreateBody blockedwordTaskCreateBody = (BlockedwordTaskCreateBody) o;
    return Objects.equals(this.advertiserId, blockedwordTaskCreateBody.advertiserId) &&
        Objects.equals(this.blockedWords, blockedwordTaskCreateBody.blockedWords) &&
        Objects.equals(this.lang, blockedwordTaskCreateBody.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, blockedWords, lang);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockedwordTaskCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    blockedWords: ").append(toIndentedString(blockedWords)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
