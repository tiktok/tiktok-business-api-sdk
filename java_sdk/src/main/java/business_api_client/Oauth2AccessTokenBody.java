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
 * Oauth2AccessTokenBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")
public class Oauth2AccessTokenBody {
  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("auth_code")
  private String authCode = null;

  @JsonProperty("secret")
  private String secret = null;

  public Oauth2AccessTokenBody appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The App ID applied by the developer. It can be found in the Basic Information section for you app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).
   * @return appId
  **/
  @Schema(required = true, description = "The App ID applied by the developer. It can be found in the Basic Information section for you app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Oauth2AccessTokenBody authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Authorization code provided once the callback is complete.
   * @return authCode
  **/
  @Schema(required = true, description = "Authorization code provided once the callback is complete.")
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  public Oauth2AccessTokenBody secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The private key of the developer&#x27;s App. It can be found in the Basic Information section for your app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).
   * @return secret
  **/
  @Schema(required = true, description = "The private key of the developer's App. It can be found in the Basic Information section for your app under [My Apps](https://ads.tiktok.com/marketing_api/apps/).")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2AccessTokenBody oauth2AccessTokenBody = (Oauth2AccessTokenBody) o;
    return Objects.equals(this.appId, oauth2AccessTokenBody.appId) &&
        Objects.equals(this.authCode, oauth2AccessTokenBody.authCode) &&
        Objects.equals(this.secret, oauth2AccessTokenBody.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, authCode, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oauth2AccessTokenBody {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
