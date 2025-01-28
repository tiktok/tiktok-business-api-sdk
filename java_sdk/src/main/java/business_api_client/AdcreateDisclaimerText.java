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
 * The text-only disclaimer that you want to add to the ad.  Required when &#x60;disclaimer_type&#x60; &#x3D; &#x60;TEXT_ONLY&#x60;.
 */
@Schema(description = "The text-only disclaimer that you want to add to the ad.  Required when `disclaimer_type` = `TEXT_ONLY`.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class AdcreateDisclaimerText {
  @JsonProperty("text")
  private String text = null;

  public AdcreateDisclaimerText text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The disclaimer text. Length limit- 90 characters.
   * @return text
  **/
  @Schema(description = "The disclaimer text. Length limit- 90 characters.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreateDisclaimerText adcreateDisclaimerText = (AdcreateDisclaimerText) o;
    return Objects.equals(this.text, adcreateDisclaimerText.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreateDisclaimerText {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
