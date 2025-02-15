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
 * The personal data of a user.
 */
@Schema(description = "The personal data of a user.")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")
public class PixelContextUser {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("external_id")
  private String externalId = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("ttp")
  private String ttp = null;

  public PixelContextUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the customer if available. It must be hashed with SHA256 on the client side.
   * @return email
  **/
  @Schema(description = "The email of the customer if available. It must be hashed with SHA256 on the client side.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PixelContextUser externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Any unique identifier on the advertisers side, such as loyalty membership IDs, user IDs, and external cookie IDs. It must be hashed with SHA256 on the client side.
   * @return externalId
  **/
  @Schema(description = "Any unique identifier on the advertisers side, such as loyalty membership IDs, user IDs, and external cookie IDs. It must be hashed with SHA256 on the client side.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PixelContextUser phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the customer if available. It must be hashed with SHA256 on the client side.
   * @return phoneNumber
  **/
  @Schema(description = "The phone number of the customer if available. It must be hashed with SHA256 on the client side.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PixelContextUser ttp(String ttp) {
    this.ttp = ttp;
    return this;
  }

   /**
   * Cookie ID. If you also use Pixel SDK and enabled cookie, Pixel SDK automatically saves a unique identifier in the _ttp cookie. The value of _ttp is used to match website visitor events with TikTok ads. You can extract the value of _ttp and attach the value here. For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584860883969)
   * @return ttp
  **/
  @Schema(description = "Cookie ID. If you also use Pixel SDK and enabled cookie, Pixel SDK automatically saves a unique identifier in the _ttp cookie. The value of _ttp is used to match website visitor events with TikTok ads. You can extract the value of _ttp and attach the value here. For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id=1739584860883969)")
  public String getTtp() {
    return ttp;
  }

  public void setTtp(String ttp) {
    this.ttp = ttp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelContextUser pixelContextUser = (PixelContextUser) o;
    return Objects.equals(this.email, pixelContextUser.email) &&
        Objects.equals(this.externalId, pixelContextUser.externalId) &&
        Objects.equals(this.phoneNumber, pixelContextUser.phoneNumber) &&
        Objects.equals(this.ttp, pixelContextUser.ttp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, externalId, phoneNumber, ttp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelContextUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    ttp: ").append(toIndentedString(ttp)).append("\n");
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
