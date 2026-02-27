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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * BcassetGroupcreateMembers
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class BcassetGroupcreateMembers {
  @JsonProperty("asset_roles")
  private Map<String, String> assetRoles = null;

  @JsonProperty("member_id")
  private String memberId = null;

  public BcassetGroupcreateMembers assetRoles(Map<String, String> assetRoles) {
    this.assetRoles = assetRoles;
    return this;
  }

  public BcassetGroupcreateMembers putAssetRolesItem(String key, String assetRolesItem) {
    if (this.assetRoles == null) {
      this.assetRoles = new HashMap<String, String>();
    }
    this.assetRoles.put(key, assetRolesItem);
    return this;
  }

   /**
   * Get assetRoles
   * @return assetRoles
  **/
  @Schema(description = "")
  public Map<String, String> getAssetRoles() {
    return assetRoles;
  }

  public void setAssetRoles(Map<String, String> assetRoles) {
    this.assetRoles = assetRoles;
  }

  public BcassetGroupcreateMembers memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @Schema(required = true, description = "")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcassetGroupcreateMembers bcassetGroupcreateMembers = (BcassetGroupcreateMembers) o;
    return Objects.equals(this.assetRoles, bcassetGroupcreateMembers.assetRoles) &&
        Objects.equals(this.memberId, bcassetGroupcreateMembers.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetRoles, memberId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcassetGroupcreateMembers {\n");
    
    sb.append("    assetRoles: ").append(toIndentedString(assetRoles)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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
