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
 * MemberDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class MemberDeleteBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("child_bc_id")
  private String childBcId = null;

  @JsonProperty("user_email")
  private String userEmail = null;

  @JsonProperty("user_id")
  private String userId = null;

  public MemberDeleteBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(required = true, description = "")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public MemberDeleteBody childBcId(String childBcId) {
    this.childBcId = childBcId;
    return this;
  }

   /**
   * Get childBcId
   * @return childBcId
  **/
  @Schema(description = "")
  public String getChildBcId() {
    return childBcId;
  }

  public void setChildBcId(String childBcId) {
    this.childBcId = childBcId;
  }

  public MemberDeleteBody userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @Schema(description = "")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public MemberDeleteBody userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
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
    MemberDeleteBody memberDeleteBody = (MemberDeleteBody) o;
    return Objects.equals(this.bcId, memberDeleteBody.bcId) &&
        Objects.equals(this.childBcId, memberDeleteBody.childBcId) &&
        Objects.equals(this.userEmail, memberDeleteBody.userEmail) &&
        Objects.equals(this.userId, memberDeleteBody.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, childBcId, userEmail, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDeleteBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    childBcId: ").append(toIndentedString(childBcId)).append("\n");
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
