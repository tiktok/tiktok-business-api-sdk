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
 * AdcreateDisclaimerClickableTexts
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class AdcreateDisclaimerClickableTexts {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("url")
  private String url = null;

  public AdcreateDisclaimerClickableTexts text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The disclaimer text. Length limit- 40 characters.
   * @return text
  **/
  @Schema(description = "The disclaimer text. Length limit- 40 characters.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AdcreateDisclaimerClickableTexts url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL for the clickable disclaimer. When users tap each text, they will be redirected to the URL and see more disclaimer details.
   * @return url
  **/
  @Schema(description = "The URL for the clickable disclaimer. When users tap each text, they will be redirected to the URL and see more disclaimer details.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreateDisclaimerClickableTexts adcreateDisclaimerClickableTexts = (AdcreateDisclaimerClickableTexts) o;
    return Objects.equals(this.text, adcreateDisclaimerClickableTexts.text) &&
        Objects.equals(this.url, adcreateDisclaimerClickableTexts.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreateDisclaimerClickableTexts {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
