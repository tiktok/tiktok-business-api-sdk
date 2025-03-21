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
 * FilteringReportIntegratedGet
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class FilteringReportIntegratedGet {
  @JsonProperty("field_name")
  private String fieldName = null;

  @JsonProperty("filter_type")
  private String filterType = null;

  @JsonProperty("filter_value")
  private String filterValue = null;

  public FilteringReportIntegratedGet fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Filter field name.
   * @return fieldName
  **/
  @Schema(description = "Filter field name.")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FilteringReportIntegratedGet filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Filter type. Enum values- &#x60;IN&#x60;- Contains. When the filter type is this item, the filtered value needs to be a valid JSON array character string. &#x60;MATCH&#x60;- Fuzzy matching, equivalent to &#x60;like&#x60; operations in MySQL. &#x60;GREATER_EQUAL&#x60;- Greater than or equal to. &#x60;GREATER_THAN&#x60;- Greater than. &#x60;LOWER_EQUAL&#x60;- Less than or equal to.&#x60;LOWER_THAN&#x60;- Less than. &#x60;BETWEEN&#x60;- Between. When the filter type is this item, the filtered value needs to be a valid JSON array of 2-element string.
   * @return filterType
  **/
  @Schema(description = "Filter type. Enum values- `IN`- Contains. When the filter type is this item, the filtered value needs to be a valid JSON array character string. `MATCH`- Fuzzy matching, equivalent to `like` operations in MySQL. `GREATER_EQUAL`- Greater than or equal to. `GREATER_THAN`- Greater than. `LOWER_EQUAL`- Less than or equal to.`LOWER_THAN`- Less than. `BETWEEN`- Between. When the filter type is this item, the filtered value needs to be a valid JSON array of 2-element string.")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public FilteringReportIntegratedGet filterValue(String filterValue) {
    this.filterValue = filterValue;
    return this;
  }

   /**
   * The value to filter. When filter_type is &#x60;IN&#x60;, filter_value needs to be a valid JSON array character string.
   * @return filterValue
  **/
  @Schema(description = "The value to filter. When filter_type is `IN`, filter_value needs to be a valid JSON array character string.")
  public String getFilterValue() {
    return filterValue;
  }

  public void setFilterValue(String filterValue) {
    this.filterValue = filterValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringReportIntegratedGet filteringReportIntegratedGet = (FilteringReportIntegratedGet) o;
    return Objects.equals(this.fieldName, filteringReportIntegratedGet.fieldName) &&
        Objects.equals(this.filterType, filteringReportIntegratedGet.filterType) &&
        Objects.equals(this.filterValue, filteringReportIntegratedGet.filterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, filterType, filterValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringReportIntegratedGet {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    filterValue: ").append(toIndentedString(filterValue)).append("\n");
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
