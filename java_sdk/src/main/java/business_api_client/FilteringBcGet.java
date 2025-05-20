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
 * FilteringBcGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class FilteringBcGet {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("keyword_type")
  private String keywordType = null;

  @JsonProperty("relation_type")
  private String relationType = null;

  public FilteringBcGet keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @Schema(description = "")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public FilteringBcGet keywordType(String keywordType) {
    this.keywordType = keywordType;
    return this;
  }

   /**
   * Get keywordType
   * @return keywordType
  **/
  @Schema(description = "")
  public String getKeywordType() {
    return keywordType;
  }

  public void setKeywordType(String keywordType) {
    this.keywordType = keywordType;
  }

  public FilteringBcGet relationType(String relationType) {
    this.relationType = relationType;
    return this;
  }

   /**
   * Get relationType
   * @return relationType
  **/
  @Schema(description = "")
  public String getRelationType() {
    return relationType;
  }

  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBcGet filteringBcGet = (FilteringBcGet) o;
    return Objects.equals(this.keyword, filteringBcGet.keyword) &&
        Objects.equals(this.keywordType, filteringBcGet.keywordType) &&
        Objects.equals(this.relationType, filteringBcGet.relationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, keywordType, relationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcGet {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordType: ").append(toIndentedString(keywordType)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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
