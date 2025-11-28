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
 * SmartPlusAdCreateBodyAdConfigurationPhoneInfo
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SmartPlusAdCreateBodyAdConfigurationPhoneInfo {
  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("phone_region_calling_code")
  private String phoneRegionCallingCode = null;

  @JsonProperty("phone_region_code")
  private String phoneRegionCode = null;

  public SmartPlusAdCreateBodyAdConfigurationPhoneInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @Schema(description = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public SmartPlusAdCreateBodyAdConfigurationPhoneInfo phoneRegionCallingCode(String phoneRegionCallingCode) {
    this.phoneRegionCallingCode = phoneRegionCallingCode;
    return this;
  }

   /**
   * Get phoneRegionCallingCode
   * @return phoneRegionCallingCode
  **/
  @Schema(description = "")
  public String getPhoneRegionCallingCode() {
    return phoneRegionCallingCode;
  }

  public void setPhoneRegionCallingCode(String phoneRegionCallingCode) {
    this.phoneRegionCallingCode = phoneRegionCallingCode;
  }

  public SmartPlusAdCreateBodyAdConfigurationPhoneInfo phoneRegionCode(String phoneRegionCode) {
    this.phoneRegionCode = phoneRegionCode;
    return this;
  }

   /**
   * Get phoneRegionCode
   * @return phoneRegionCode
  **/
  @Schema(description = "")
  public String getPhoneRegionCode() {
    return phoneRegionCode;
  }

  public void setPhoneRegionCode(String phoneRegionCode) {
    this.phoneRegionCode = phoneRegionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartPlusAdCreateBodyAdConfigurationPhoneInfo smartPlusAdCreateBodyAdConfigurationPhoneInfo = (SmartPlusAdCreateBodyAdConfigurationPhoneInfo) o;
    return Objects.equals(this.phoneNumber, smartPlusAdCreateBodyAdConfigurationPhoneInfo.phoneNumber) &&
        Objects.equals(this.phoneRegionCallingCode, smartPlusAdCreateBodyAdConfigurationPhoneInfo.phoneRegionCallingCode) &&
        Objects.equals(this.phoneRegionCode, smartPlusAdCreateBodyAdConfigurationPhoneInfo.phoneRegionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, phoneRegionCallingCode, phoneRegionCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartPlusAdCreateBodyAdConfigurationPhoneInfo {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneRegionCallingCode: ").append(toIndentedString(phoneRegionCallingCode)).append("\n");
    sb.append("    phoneRegionCode: ").append(toIndentedString(phoneRegionCode)).append("\n");
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
