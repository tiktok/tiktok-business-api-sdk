/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.DmpcustomAudiencelookalikecreateContextInfo;
import business_api_client.DmpcustomAudiencelookalikecreateLookalikeSpec;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * LookalikeCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class LookalikeCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("context_info")
  private DmpcustomAudiencelookalikecreateContextInfo contextInfo = null;

  @JsonProperty("custom_audience_name")
  private String customAudienceName = null;

  @JsonProperty("lookalike_spec")
  private DmpcustomAudiencelookalikecreateLookalikeSpec lookalikeSpec = null;

  public LookalikeCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return advertiserId
  **/
  @Schema(required = true, description = "Advertiser ID.")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public LookalikeCreateBody contextInfo(DmpcustomAudiencelookalikecreateContextInfo contextInfo) {
    this.contextInfo = contextInfo;
    return this;
  }

   /**
   * Get contextInfo
   * @return contextInfo
  **/
  @Schema(description = "")
  public DmpcustomAudiencelookalikecreateContextInfo getContextInfo() {
    return contextInfo;
  }

  public void setContextInfo(DmpcustomAudiencelookalikecreateContextInfo contextInfo) {
    this.contextInfo = contextInfo;
  }

  public LookalikeCreateBody customAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
    return this;
  }

   /**
   * Audience name. Maximum of 128 characters.
   * @return customAudienceName
  **/
  @Schema(required = true, description = "Audience name. Maximum of 128 characters.")
  public String getCustomAudienceName() {
    return customAudienceName;
  }

  public void setCustomAudienceName(String customAudienceName) {
    this.customAudienceName = customAudienceName;
  }

  public LookalikeCreateBody lookalikeSpec(DmpcustomAudiencelookalikecreateLookalikeSpec lookalikeSpec) {
    this.lookalikeSpec = lookalikeSpec;
    return this;
  }

   /**
   * Get lookalikeSpec
   * @return lookalikeSpec
  **/
  @Schema(required = true, description = "")
  public DmpcustomAudiencelookalikecreateLookalikeSpec getLookalikeSpec() {
    return lookalikeSpec;
  }

  public void setLookalikeSpec(DmpcustomAudiencelookalikecreateLookalikeSpec lookalikeSpec) {
    this.lookalikeSpec = lookalikeSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookalikeCreateBody lookalikeCreateBody = (LookalikeCreateBody) o;
    return Objects.equals(this.advertiserId, lookalikeCreateBody.advertiserId) &&
        Objects.equals(this.contextInfo, lookalikeCreateBody.contextInfo) &&
        Objects.equals(this.customAudienceName, lookalikeCreateBody.customAudienceName) &&
        Objects.equals(this.lookalikeSpec, lookalikeCreateBody.lookalikeSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, contextInfo, customAudienceName, lookalikeSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookalikeCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
    sb.append("    customAudienceName: ").append(toIndentedString(customAudienceName)).append("\n");
    sb.append("    lookalikeSpec: ").append(toIndentedString(lookalikeSpec)).append("\n");
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
