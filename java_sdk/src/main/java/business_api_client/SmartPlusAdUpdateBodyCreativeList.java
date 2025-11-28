/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.SmartPlusAdUpdateBodyCreativeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SmartPlusAdUpdateBodyCreativeList
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SmartPlusAdUpdateBodyCreativeList {
  @JsonProperty("creative_info")
  private SmartPlusAdUpdateBodyCreativeInfo creativeInfo = null;

  public SmartPlusAdUpdateBodyCreativeList creativeInfo(SmartPlusAdUpdateBodyCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
    return this;
  }

   /**
   * Get creativeInfo
   * @return creativeInfo
  **/
  @Schema(required = true, description = "")
  public SmartPlusAdUpdateBodyCreativeInfo getCreativeInfo() {
    return creativeInfo;
  }

  public void setCreativeInfo(SmartPlusAdUpdateBodyCreativeInfo creativeInfo) {
    this.creativeInfo = creativeInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdUpdateBodyCreativeList smartPlusAdUpdateBodyCreativeList = (SmartPlusAdUpdateBodyCreativeList) o;
    return Objects.equals(this.creativeInfo, smartPlusAdUpdateBodyCreativeList.creativeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdUpdateBodyCreativeList {\n");
    
    sb.append("    creativeInfo: ").append(toIndentedString(creativeInfo)).append("\n");
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
