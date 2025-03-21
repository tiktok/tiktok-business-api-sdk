/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.BcmemberinviteExtUserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * MemberUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class MemberUpdateBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("child_bc_id")
  private String childBcId = null;

  @JsonProperty("ext_user_role")
  private BcmemberinviteExtUserRole extUserRole = null;

  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("user_role")
  private String userRole = null;

  public MemberUpdateBody bcId(String bcId) {
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

  public MemberUpdateBody childBcId(String childBcId) {
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

  public MemberUpdateBody extUserRole(BcmemberinviteExtUserRole extUserRole) {
    this.extUserRole = extUserRole;
    return this;
  }

   /**
   * Get extUserRole
   * @return extUserRole
  **/
  @Schema(description = "")
  public BcmemberinviteExtUserRole getExtUserRole() {
    return extUserRole;
  }

  public void setExtUserRole(BcmemberinviteExtUserRole extUserRole) {
    this.extUserRole = extUserRole;
  }

  public MemberUpdateBody userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(required = true, description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public MemberUpdateBody userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public MemberUpdateBody userRole(String userRole) {
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
    MemberUpdateBody memberUpdateBody = (MemberUpdateBody) o;
    return Objects.equals(this.bcId, memberUpdateBody.bcId) &&
        Objects.equals(this.childBcId, memberUpdateBody.childBcId) &&
        Objects.equals(this.extUserRole, memberUpdateBody.extUserRole) &&
        Objects.equals(this.userId, memberUpdateBody.userId) &&
        Objects.equals(this.userName, memberUpdateBody.userName) &&
        Objects.equals(this.userRole, memberUpdateBody.userRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, childBcId, extUserRole, userId, userName, userRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberUpdateBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    childBcId: ").append(toIndentedString(childBcId)).append("\n");
    sb.append("    extUserRole: ").append(toIndentedString(extUserRole)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
