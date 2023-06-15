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
 * Contact Information
 */
@Schema(description = "Contact Information")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class OpenApiv13bcadvertisercreateContactInfo {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("number")
  private String number = null;

  public OpenApiv13bcadvertisercreateContactInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email. Required if the place of registration of the ad account or the Business Center is France, Brazil, or Mexico
   * @return email
  **/
  @Schema(description = "Contact email. Required if the place of registration of the ad account or the Business Center is France, Brazil, or Mexico")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OpenApiv13bcadvertisercreateContactInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Contact name. No more than 100 characters in length
   * @return name
  **/
  @Schema(description = "Contact name. No more than 100 characters in length")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpenApiv13bcadvertisercreateContactInfo number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Contact phone
   * @return number
  **/
  @Schema(description = "Contact phone")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13bcadvertisercreateContactInfo openApiv13bcadvertisercreateContactInfo = (OpenApiv13bcadvertisercreateContactInfo) o;
    return Objects.equals(this.email, openApiv13bcadvertisercreateContactInfo.email) &&
        Objects.equals(this.name, openApiv13bcadvertisercreateContactInfo.name) &&
        Objects.equals(this.number, openApiv13bcadvertisercreateContactInfo.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13bcadvertisercreateContactInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
