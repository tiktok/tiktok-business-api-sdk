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
 * Billing information. Required if the place of registration of the ad account or the agency that owns the Business Center is France, Brazil, or Mexico
 */
@Schema(description = "Billing information. Required if the place of registration of the ad account or the agency that owns the Business Center is France, Brazil, or Mexico")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13bcadvertisercreateBillingInfo {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("tax_map")
  private String taxMap = null;

  public OpenApiv13bcadvertisercreateBillingInfo address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Billing address, no more than 512 characters in length
   * @return address
  **/
  @Schema(description = "Billing address, no more than 512 characters in length")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OpenApiv13bcadvertisercreateBillingInfo taxMap(String taxMap) {
    this.taxMap = taxMap;
    return this;
  }

   /**
   * Billing and invoicing tax number. Different countries use different tax number fields. The tax number field &#x60;vat&#x60; is used for European countries, for instance, France.The tax number field &#x60;tax_id&#x60; is used for Brazil (required), Mexico (required), United Arab Emirates, Egypt, Saudi Arabia, Israel, Turkey, Canada, and the United States.The tax number field &#x60;abn&#x60; is used for Australia and New Zealand.
   * @return taxMap
  **/
  @Schema(description = "Billing and invoicing tax number. Different countries use different tax number fields. The tax number field `vat` is used for European countries, for instance, France.The tax number field `tax_id` is used for Brazil (required), Mexico (required), United Arab Emirates, Egypt, Saudi Arabia, Israel, Turkey, Canada, and the United States.The tax number field `abn` is used for Australia and New Zealand.")
  public String getTaxMap() {
    return taxMap;
  }

  public void setTaxMap(String taxMap) {
    this.taxMap = taxMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13bcadvertisercreateBillingInfo openApiv13bcadvertisercreateBillingInfo = (OpenApiv13bcadvertisercreateBillingInfo) o;
    return Objects.equals(this.address, openApiv13bcadvertisercreateBillingInfo.address) &&
        Objects.equals(this.taxMap, openApiv13bcadvertisercreateBillingInfo.taxMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, taxMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13bcadvertisercreateBillingInfo {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxMap: ").append(toIndentedString(taxMap)).append("\n");
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
