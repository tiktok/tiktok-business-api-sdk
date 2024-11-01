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
 * OpenApiv13dmpcustomAudienceapplyContextInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13dmpcustomAudienceapplyContextInfo {
  @JsonProperty("core_user_id")
  private Long coreUserId = null;

  public OpenApiv13dmpcustomAudienceapplyContextInfo coreUserId(Long coreUserId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13dmpcustomAudienceapplyContextInfo openApiv13dmpcustomAudienceapplyContextInfo = (OpenApiv13dmpcustomAudienceapplyContextInfo) o;
    return Objects.equals(this.coreUserId, openApiv13dmpcustomAudienceapplyContextInfo.coreUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13dmpcustomAudienceapplyContextInfo {\n");
    
    sb.append("    coreUserId: ").append(toIndentedString(coreUserId)).append("\n");
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
