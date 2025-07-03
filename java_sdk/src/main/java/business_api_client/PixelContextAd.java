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
 * Ad information.
 */
@Schema(description = "Ad information.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class PixelContextAd {
  @JsonProperty("callback")
  private String callback = null;

  public PixelContextAd callback(String callback) {
    this.callback = callback;
    return this;
  }

   /**
   * TikTok Click ID. TikTok Click ID (ttclid) is a tracking parameter appended to a landing page URL whenever a user clicks on an ad on TikTok. The ttcid valid period is the same as your CTA window setting in [Attribution Manager](https://ads.tiktok.com/help/article/attribution-manager?redirected&#x3D;1). For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584860883969)
   * @return callback
  **/
  @Schema(description = "TikTok Click ID. TikTok Click ID (ttclid) is a tracking parameter appended to a landing page URL whenever a user clicks on an ad on TikTok. The ttcid valid period is the same as your CTA window setting in [Attribution Manager](https://ads.tiktok.com/help/article/attribution-manager?redirected=1). For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id=1739584860883969)")
  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelContextAd pixelContextAd = (PixelContextAd) o;
    return Objects.equals(this.callback, pixelContextAd.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelContextAd {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
