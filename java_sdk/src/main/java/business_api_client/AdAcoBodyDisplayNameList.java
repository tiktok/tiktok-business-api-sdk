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
 * AdAcoBodyDisplayNameList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-02-27T14:19:48.489627-08:00[America/Los_Angeles]")
public class AdAcoBodyDisplayNameList {
  @JsonProperty("app_name")
  private String appName = null;

  @JsonProperty("landing_page_name")
  private String landingPageName = null;

  public AdAcoBodyDisplayNameList appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * App name that is displayed in the ad. If not specified, the name in the app store will be used. Number of characters allowed- 1-40. If the name in the app store exceeds 40 characters, you must pass in a new app name with this field.
   * @return appName
  **/
  @Schema(description = "App name that is displayed in the ad. If not specified, the name in the app store will be used. Number of characters allowed- 1-40. If the name in the app store exceeds 40 characters, you must pass in a new app name with this field.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AdAcoBodyDisplayNameList landingPageName(String landingPageName) {
    this.landingPageName = landingPageName;
    return this;
  }

   /**
   * The display name of the landing page, required when the promotion type is landing page. Length limit- 1-40 characters.
   * @return landingPageName
  **/
  @Schema(description = "The display name of the landing page, required when the promotion type is landing page. Length limit- 1-40 characters.")
  public String getLandingPageName() {
    return landingPageName;
  }

  public void setLandingPageName(String landingPageName) {
    this.landingPageName = landingPageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAcoBodyDisplayNameList adAcoBodyDisplayNameList = (AdAcoBodyDisplayNameList) o;
    return Objects.equals(this.appName, adAcoBodyDisplayNameList.appName) &&
        Objects.equals(this.landingPageName, adAcoBodyDisplayNameList.landingPageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, landingPageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAcoBodyDisplayNameList {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    landingPageName: ").append(toIndentedString(landingPageName)).append("\n");
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
