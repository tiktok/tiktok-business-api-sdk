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
 * SmartPlusAdCreateBodyAutoMessageList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class SmartPlusAdCreateBodyAutoMessageList {
  @JsonProperty("auto_message_id")
  private String autoMessageId = null;

  public SmartPlusAdCreateBodyAutoMessageList autoMessageId(String autoMessageId) {
    this.autoMessageId = autoMessageId;
    return this;
  }

   /**
   * Get autoMessageId
   * @return autoMessageId
  **/
  @Schema(description = "")
  public String getAutoMessageId() {
    return autoMessageId;
  }

  public void setAutoMessageId(String autoMessageId) {
    this.autoMessageId = autoMessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdCreateBodyAutoMessageList smartPlusAdCreateBodyAutoMessageList = (SmartPlusAdCreateBodyAutoMessageList) o;
    return Objects.equals(this.autoMessageId, smartPlusAdCreateBodyAutoMessageList.autoMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoMessageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBodyAutoMessageList {\n");
    
    sb.append("    autoMessageId: ").append(toIndentedString(autoMessageId)).append("\n");
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
