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
 * Filtering
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class Filtering {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("user_email")
  private String userEmail = null;

  @JsonProperty("user_id")
  private String userId = null;

  public Filtering keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * Keyword of the asset you are looking for
   * @return keyword
  **/
  @Schema(description = "Keyword of the asset you are looking for")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public Filtering userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Email of the user that you want to get assets for. Note: &#x60;user_id&#x60; and &#x60;user_mail&#x60; cannot be set at the same time. For users that are in &#x60;BOUND&#x60; status, use &#x60;user_id&#x60; to get their assets. For users that are in &#x60;PENDING&#x60; status, use &#x60;user_email&#x60; to get their assets. Use &#x60;user_email&#x60; as filter only when you have set &#x60;asset_type&#x60; as &#x60;ADVERTISER&#x60; and the invitation for the user to join Business Center is still pending.
   * @return userEmail
  **/
  @Schema(description = "Email of the user that you want to get assets for. Note: `user_id` and `user_mail` cannot be set at the same time. For users that are in `BOUND` status, use `user_id` to get their assets. For users that are in `PENDING` status, use `user_email` to get their assets. Use `user_email` as filter only when you have set `asset_type` as `ADVERTISER` and the invitation for the user to join Business Center is still pending.")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public Filtering userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user that you want to get assets for. Note: &#x60;user_id&#x60; and &#x60;user_mail&#x60; cannot be set at the same time. For users that are in &#x60;BOUND&#x60; status, use &#x60;user_id&#x60; to get their assets. For users that are in &#x60;PENDING&#x60; status, use &#x60;user_email&#x60; to get their assets
   * @return userId
  **/
  @Schema(description = "ID of the user that you want to get assets for. Note: `user_id` and `user_mail` cannot be set at the same time. For users that are in `BOUND` status, use `user_id` to get their assets. For users that are in `PENDING` status, use `user_email` to get their assets")
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
    Filtering filtering = (Filtering) o;
    return Objects.equals(this.keyword, filtering.keyword) &&
        Objects.equals(this.userEmail, filtering.userEmail) &&
        Objects.equals(this.userId, filtering.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, userEmail, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filtering {\n");
    
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
