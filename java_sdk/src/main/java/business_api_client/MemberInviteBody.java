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
import java.util.ArrayList;
import java.util.List;
/**
 * MemberInviteBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class MemberInviteBody {
  @JsonProperty("advertiser_role")
  private String advertiserRole = "ANALYST";

  @JsonProperty("asset_ids")
  private List<String> assetIds = new ArrayList<String>();

  @JsonProperty("asset_type")
  private String assetType = "ADVERTISER";

  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("emails")
  private List<String> emails = new ArrayList<String>();

  @JsonProperty("ext_user_role")
  private BcmemberinviteExtUserRole extUserRole = null;

  @JsonProperty("user_role")
  private String userRole = "STANDARD";

  public MemberInviteBody advertiserRole(String advertiserRole) {
    this.advertiserRole = advertiserRole;
    return this;
  }

   /**
   * Get advertiserRole
   * @return advertiserRole
  **/
  @Schema(description = "")
  public String getAdvertiserRole() {
    return advertiserRole;
  }

  public void setAdvertiserRole(String advertiserRole) {
    this.advertiserRole = advertiserRole;
  }

  public MemberInviteBody assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public MemberInviteBody addAssetIdsItem(String assetIdsItem) {
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * Get assetIds
   * @return assetIds
  **/
  @Schema(required = true, description = "")
  public List<String> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }

  public MemberInviteBody assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public MemberInviteBody bcId(String bcId) {
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

  public MemberInviteBody emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public MemberInviteBody addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @Schema(required = true, description = "")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public MemberInviteBody extUserRole(BcmemberinviteExtUserRole extUserRole) {
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

  public MemberInviteBody userRole(String userRole) {
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
    MemberInviteBody memberInviteBody = (MemberInviteBody) o;
    return Objects.equals(this.advertiserRole, memberInviteBody.advertiserRole) &&
        Objects.equals(this.assetIds, memberInviteBody.assetIds) &&
        Objects.equals(this.assetType, memberInviteBody.assetType) &&
        Objects.equals(this.bcId, memberInviteBody.bcId) &&
        Objects.equals(this.emails, memberInviteBody.emails) &&
        Objects.equals(this.extUserRole, memberInviteBody.extUserRole) &&
        Objects.equals(this.userRole, memberInviteBody.userRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserRole, assetIds, assetType, bcId, emails, extUserRole, userRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberInviteBody {\n");
    
    sb.append("    advertiserRole: ").append(toIndentedString(advertiserRole)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    extUserRole: ").append(toIndentedString(extUserRole)).append("\n");
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
