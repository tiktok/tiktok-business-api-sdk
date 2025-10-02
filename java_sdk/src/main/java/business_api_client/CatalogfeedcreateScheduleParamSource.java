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
 * CatalogfeedcreateScheduleParamSource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class CatalogfeedcreateScheduleParamSource {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("username")
  private String username = null;

  public CatalogfeedcreateScheduleParamSource password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CatalogfeedcreateScheduleParamSource uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public CatalogfeedcreateScheduleParamSource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogfeedcreateScheduleParamSource catalogfeedcreateScheduleParamSource = (CatalogfeedcreateScheduleParamSource) o;
    return Objects.equals(this.password, catalogfeedcreateScheduleParamSource.password) &&
        Objects.equals(this.uri, catalogfeedcreateScheduleParamSource.uri) &&
        Objects.equals(this.username, catalogfeedcreateScheduleParamSource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, uri, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogfeedcreateScheduleParamSource {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
