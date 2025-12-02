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
 * FilteringBcTransactionGet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")
public class FilteringBcTransactionGet {
  @JsonProperty("funds_type")
  private List<String> fundsType = null;

  public FilteringBcTransactionGet fundsType(List<String> fundsType) {
    this.fundsType = fundsType;
    return this;
  }

  public FilteringBcTransactionGet addFundsTypeItem(String fundsTypeItem) {
    if (this.fundsType == null) {
      this.fundsType = new ArrayList<String>();
    }
    this.fundsType.add(fundsTypeItem);
    return this;
  }

   /**
   * Get fundsType
   * @return fundsType
  **/
  @Schema(description = "")
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
    FilteringBcTransactionGet filteringBcTransactionGet = (FilteringBcTransactionGet) o;
    return Objects.equals(this.fundsType, filteringBcTransactionGet.fundsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringBcTransactionGet {\n");
    
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
