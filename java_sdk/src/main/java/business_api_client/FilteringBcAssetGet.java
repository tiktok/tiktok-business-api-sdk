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
 * FilteringBcAssetGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class FilteringBcAssetGet {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("user_email")
  private String userEmail = null;

  @JsonProperty("user_id")
  private String userId = null;

  public FilteringBcAssetGet keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Keyword filter for asset search.
   * @return keyword
  **/
  @Schema(description = "Keyword filter for asset search.")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public FilteringBcAssetGet userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * User email filter.
   * @return userEmail
  **/
  @Schema(description = "User email filter.")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public FilteringBcAssetGet userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID filter.
   * @return userId
  **/
  @Schema(description = "User ID filter.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBcAssetGet filteringBcAssetGet = (FilteringBcAssetGet) o;
    return Objects.equals(this.keyword, filteringBcAssetGet.keyword) &&
        Objects.equals(this.userEmail, filteringBcAssetGet.userEmail) &&
        Objects.equals(this.userId, filteringBcAssetGet.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, userEmail, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcAssetGet {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
