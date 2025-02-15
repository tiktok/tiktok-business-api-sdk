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
 * AdAcoBodyDeeplinkList
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class AdAcoBodyDeeplinkList {
  @JsonProperty("deeplink")
  private String deeplink = null;

  @JsonProperty("deeplink_type")
  private String deeplinkType = null;

  public AdAcoBodyDeeplinkList deeplink(String deeplink) {
    this.deeplink = deeplink;
    return this;
  }

   /**
   * The specific location where you want your audience to go if they have your app installed.
   * @return deeplink
  **/
  @Schema(description = "The specific location where you want your audience to go if they have your app installed.")
  public String getDeeplink() {
    return deeplink;
  }

  public void setDeeplink(String deeplink) {
    this.deeplink = deeplink;
  }

  public AdAcoBodyDeeplinkList deeplinkType(String deeplinkType) {
    this.deeplinkType = deeplinkType;
    return this;
  }

   /**
   * The open URL type. Allowed values differs based on campaign objectives. Allowed values- &#x60;NORMAL&#x60; (supported in Traffic, Conversion), &#x60;DEFERRED_DEEPLINK&#x60; (supported in App Install ). The default value is &#x60;NORMAL&#x60;. For an ad that will be included in an iOS 14 campaign, this field cannot be set to &#x60;DEFERRED_DEEPLINK&#x60;.
   * @return deeplinkType
  **/
  @Schema(description = "The open URL type. Allowed values differs based on campaign objectives. Allowed values- `NORMAL` (supported in Traffic, Conversion), `DEFERRED_DEEPLINK` (supported in App Install ). The default value is `NORMAL`. For an ad that will be included in an iOS 14 campaign, this field cannot be set to `DEFERRED_DEEPLINK`.")
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
    AdAcoBodyDeeplinkList adAcoBodyDeeplinkList = (AdAcoBodyDeeplinkList) o;
    return Objects.equals(this.deeplink, adAcoBodyDeeplinkList.deeplink) &&
        Objects.equals(this.deeplinkType, adAcoBodyDeeplinkList.deeplinkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deeplink, deeplinkType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyDeeplinkList {\n");
    
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
