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
 * SmartPlusAdCreateBodyDeeplinkList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class SmartPlusAdCreateBodyDeeplinkList {
  @JsonProperty("deeplink")
  private String deeplink = null;

  @JsonProperty("deeplink_type")
  private String deeplinkType = null;

  public SmartPlusAdCreateBodyDeeplinkList deeplink(String deeplink) {
    this.deeplink = deeplink;
    return this;
  }

   /**
   * Get deeplink
   * @return deeplink
  **/
  @Schema(description = "")
  public String getDeeplink() {
    return deeplink;
  }

  public void setDeeplink(String deeplink) {
    this.deeplink = deeplink;
  }

  public SmartPlusAdCreateBodyDeeplinkList deeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
    return this;
  }

   /**
   * Get deeplinkType
   * @return deeplinkType
  **/
  @Schema(description = "")
  public String getDeeplinkType() {
    return deeplinkType;
  }

  public void setDeeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdCreateBodyDeeplinkList smartPlusAdCreateBodyDeeplinkList = (SmartPlusAdCreateBodyDeeplinkList) o;
    return Objects.equals(this.deeplink, smartPlusAdCreateBodyDeeplinkList.deeplink) &&
        Objects.equals(this.deeplinkType, smartPlusAdCreateBodyDeeplinkList.deeplinkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deeplink, deeplinkType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBodyDeeplinkList {\n");
    
    sb.append("    deeplink: ").append(toIndentedString(deeplink)).append("\n");
    sb.append("    deeplinkType: ").append(toIndentedString(deeplinkType)).append("\n");
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
