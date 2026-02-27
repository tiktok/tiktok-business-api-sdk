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
 * FilteringBcMemberGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class FilteringBcMemberGet {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("relation_status")
  private String relationStatus = null;

  @JsonProperty("user_role")
  private String userRole = null;

  public FilteringBcMemberGet keyword(String keyword) {
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

  public FilteringBcMemberGet relationStatus(String relationStatus) {
    this.relationStatus = relationStatus;
    return this;
  }

   /**
   * Get relationStatus
   * @return relationStatus
  **/
  @Schema(description = "")
  public String getRelationStatus() {
    return relationStatus;
  }

  public void setRelationStatus(String relationStatus) {
    this.relationStatus = relationStatus;
  }

  public FilteringBcMemberGet userRole(String userRole) {
    this.userRole = userRole;
    return this;
  }

   /**
   * Get userRole
   * @return userRole
  **/
  @Schema(description = "")
  public String getUserRole() {
    return userRole;
  }

  public void setUserRole(String userRole) {
    this.userRole = userRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBcMemberGet filteringBcMemberGet = (FilteringBcMemberGet) o;
    return Objects.equals(this.keyword, filteringBcMemberGet.keyword) &&
        Objects.equals(this.relationStatus, filteringBcMemberGet.relationStatus) &&
        Objects.equals(this.userRole, filteringBcMemberGet.userRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, relationStatus, userRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcMemberGet {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    relationStatus: ").append(toIndentedString(relationStatus)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
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
