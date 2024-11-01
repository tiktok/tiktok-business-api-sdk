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
 * OpenApiv13dmpcustomAudiencelookalikecreateContextInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudiencelookalikecreateContextInfo {
  @JsonProperty("app_id")
  private Long appId = null;

  @JsonProperty("core_user_id")
  private Long coreUserId = null;

  @JsonProperty("developer_id")
  private Long developerId = null;

  public OpenApiv13dmpcustomAudiencelookalikecreateContextInfo appId(Long appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateContextInfo coreUserId(Long coreUserId) {
    this.coreUserId = coreUserId;
    return this;
  }

   /**
   * Get coreUserId
   * @return coreUserId
  **/
  @Schema(description = "")
  public Long getCoreUserId() {
    return coreUserId;
  }

  public void setCoreUserId(Long coreUserId) {
    this.coreUserId = coreUserId;
  }

  public OpenApiv13dmpcustomAudiencelookalikecreateContextInfo developerId(Long developerId) {
    this.developerId = developerId;
    return this;
  }

   /**
   * Get developerId
   * @return developerId
  **/
  @Schema(description = "")
  public Long getDeveloperId() {
    return developerId;
  }

  public void setDeveloperId(Long developerId) {
    this.developerId = developerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13dmpcustomAudiencelookalikecreateContextInfo openApiv13dmpcustomAudiencelookalikecreateContextInfo = (OpenApiv13dmpcustomAudiencelookalikecreateContextInfo) o;
    return Objects.equals(this.appId, openApiv13dmpcustomAudiencelookalikecreateContextInfo.appId) &&
        Objects.equals(this.coreUserId, openApiv13dmpcustomAudiencelookalikecreateContextInfo.coreUserId) &&
        Objects.equals(this.developerId, openApiv13dmpcustomAudiencelookalikecreateContextInfo.developerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, coreUserId, developerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudiencelookalikecreateContextInfo {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    coreUserId: ").append(toIndentedString(coreUserId)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
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
