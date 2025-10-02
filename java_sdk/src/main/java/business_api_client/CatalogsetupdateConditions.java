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
 * CatalogsetupdateConditions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class CatalogsetupdateConditions {
  @JsonProperty("and")
  private List<Object> and = null;

  @JsonProperty("or")
  private List<Object> or = null;

  public CatalogsetupdateConditions and(List<Object> and) {
    this.and = and;
    return this;
  }

  public CatalogsetupdateConditions addAndItem(Object andItem) {
    if (this.and == null) {
      this.and = new ArrayList<Object>();
    }
    this.and.add(andItem);
    return this;
  }

   /**
   * Get and
   * @return and
  **/
  @Schema(description = "")
  public List<Object> getAnd() {
    return and;
  }

  public void setAnd(List<Object> and) {
    this.and = and;
  }

  public CatalogsetupdateConditions or(List<Object> or) {
    this.or = or;
    return this;
  }

  public CatalogsetupdateConditions addOrItem(Object orItem) {
    if (this.or == null) {
      this.or = new ArrayList<Object>();
    }
    this.or.add(orItem);
    return this;
  }

   /**
   * Get or
   * @return or
  **/
  @Schema(description = "")
  public List<Object> getOr() {
    return or;
  }

  public void setOr(List<Object> or) {
    this.or = or;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsetupdateConditions catalogsetupdateConditions = (CatalogsetupdateConditions) o;
    return Objects.equals(this.and, catalogsetupdateConditions.and) &&
        Objects.equals(this.or, catalogsetupdateConditions.or);
  }

  @Override
  public int hashCode() {
    return Objects.hash(and, or);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsetupdateConditions {\n");
    
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
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
