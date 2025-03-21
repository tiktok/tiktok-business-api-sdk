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
 * BcmemberinviteExtUserRole
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class BcmemberinviteExtUserRole {
  @JsonProperty("finance_role")
  private String financeRole = null;

  public BcmemberinviteExtUserRole financeRole(String financeRole) {
    this.financeRole = financeRole;
    return this;
  }

   /**
   * Get financeRole
   * @return financeRole
  **/
  @Schema(description = "")
  public String getFinanceRole() {
    return financeRole;
  }

  public void setFinanceRole(String financeRole) {
    this.financeRole = financeRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcmemberinviteExtUserRole bcmemberinviteExtUserRole = (BcmemberinviteExtUserRole) o;
    return Objects.equals(this.financeRole, bcmemberinviteExtUserRole.financeRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financeRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcmemberinviteExtUserRole {\n");
    
    sb.append("    financeRole: ").append(toIndentedString(financeRole)).append("\n");
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
