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
import java.util.ArrayList;
import java.util.List;
/**
 * FilteringBCTransactionGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class FilteringBCTransactionGet {
  @JsonProperty("funds_type")
  private List<String> fundsType = null;

  public FilteringBCTransactionGet fundsType(List<String> fundsType) {
    this.fundsType = fundsType;
    return this;
  }

  public FilteringBCTransactionGet addFundsTypeItem(String fundsTypeItem) {
    if (this.fundsType == null) {
      this.fundsType = new ArrayList<String>();
    }
    this.fundsType.add(fundsTypeItem);
    return this;
  }

   /**
   * Fund type. If not specified, both types of fund will be returned. Enum values- &#x60;FUNDS_TYPE_CASH&#x60; (cash), &#x60;FUNDS_TYPE_GRANT&#x60; (non-cash).
   * @return fundsType
  **/
  @Schema(description = "Fund type. If not specified, both types of fund will be returned. Enum values- `FUNDS_TYPE_CASH` (cash), `FUNDS_TYPE_GRANT` (non-cash).")
  public List<String> getFundsType() {
    return fundsType;
  }

  public void setFundsType(List<String> fundsType) {
    this.fundsType = fundsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringBCTransactionGet filteringBCTransactionGet = (FilteringBCTransactionGet) o;
    return Objects.equals(this.fundsType, filteringBCTransactionGet.fundsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBCTransactionGet {\n");
    
    sb.append("    fundsType: ").append(toIndentedString(fundsType)).append("\n");
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
