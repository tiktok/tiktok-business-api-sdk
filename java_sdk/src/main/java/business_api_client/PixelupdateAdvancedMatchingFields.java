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
 * PixelupdateAdvancedMatchingFields
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class PixelupdateAdvancedMatchingFields {
  @JsonProperty("email")
  private Boolean email = true;

  @JsonProperty("phone_number")
  private Boolean phoneNumber = true;

  public PixelupdateAdvancedMatchingFields email(Boolean email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public Boolean isEmail() {
    return email;
  }

  public void setEmail(Boolean email) {
    this.email = email;
  }

  public PixelupdateAdvancedMatchingFields phoneNumber(Boolean phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public Boolean isPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Boolean phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelupdateAdvancedMatchingFields pixelupdateAdvancedMatchingFields = (PixelupdateAdvancedMatchingFields) o;
    return Objects.equals(this.email, pixelupdateAdvancedMatchingFields.email) &&
        Objects.equals(this.phoneNumber, pixelupdateAdvancedMatchingFields.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelupdateAdvancedMatchingFields {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
