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
 * ReportTaskCreateBodyFiltering
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class ReportTaskCreateBodyFiltering {
  @JsonProperty("field_name")
  private String fieldName = null;

  @JsonProperty("filter_type")
  private String filterType = null;

  @JsonProperty("filter_value")
  private String filterValue = null;

  public ReportTaskCreateBodyFiltering fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @Schema(description = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ReportTaskCreateBodyFiltering filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Get filterType
   * @return filterType
  **/
  @Schema(description = "")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public ReportTaskCreateBodyFiltering filterValue(String filterValue) {
    this.filterValue = filterValue;
    return this;
  }

   /**
   * Get filterValue
   * @return filterValue
  **/
  @Schema(description = "")
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
    ReportTaskCreateBodyFiltering reportTaskCreateBodyFiltering = (ReportTaskCreateBodyFiltering) o;
    return Objects.equals(this.fieldName, reportTaskCreateBodyFiltering.fieldName) &&
        Objects.equals(this.filterType, reportTaskCreateBodyFiltering.filterType) &&
        Objects.equals(this.filterValue, reportTaskCreateBodyFiltering.filterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, filterType, filterValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTaskCreateBodyFiltering {\n");
    
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
