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
 * AdAcoBodyCallToActionList
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class AdAcoBodyCallToActionList {
  @JsonProperty("call_to_action")
  private String callToAction = null;

  public AdAcoBodyCallToActionList callToAction(String callToAction) {
    this.callToAction = callToAction;
    return this;
  }

   /**
   * Call-to-action text. For enum values, see [Enumeration - Call-to-action](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138).
   * @return callToAction
  **/
  @Schema(description = "Call-to-action text. For enum values, see [Enumeration - Call-to-action](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138).")
  public String getCallToAction() {
    return callToAction;
  }

  public void setCallToAction(String callToAction) {
    this.callToAction = callToAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyCallToActionList adAcoBodyCallToActionList = (AdAcoBodyCallToActionList) o;
    return Objects.equals(this.callToAction, adAcoBodyCallToActionList.callToAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callToAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyCallToActionList {\n");
    
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
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
