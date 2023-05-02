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
 * Page information.
 */
@Schema(description = "Page information.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")
public class PixelContextPage {
  @JsonProperty("referrer")
  private String referrer = null;

  @JsonProperty("url")
  private String url = null;

  public PixelContextPage referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * Page referrer.
   * @return referrer
  **/
  @Schema(description = "Page referrer.")
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public PixelContextPage url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Page url when event happened.
   * @return url
  **/
  @Schema(description = "Page url when event happened.")
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
    PixelContextPage pixelContextPage = (PixelContextPage) o;
    return Objects.equals(this.referrer, pixelContextPage.referrer) &&
        Objects.equals(this.url, pixelContextPage.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referrer, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelContextPage {\n");
    
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
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
