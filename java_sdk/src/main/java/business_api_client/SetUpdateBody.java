/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CatalogsetupdateConditions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SetUpdateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class SetUpdateBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("conditions")
  private CatalogsetupdateConditions conditions = null;

  @JsonProperty("product_set_id")
  private String productSetId = null;

  @JsonProperty("product_set_name")
  private String productSetName = null;

  public SetUpdateBody bcId(String bcId) {
    this.bcId = bcId;
    return this;
  }

   /**
   * Get bcId
   * @return bcId
  **/
  @Schema(required = true, description = "")
  public String getBcId() {
    return bcId;
  }

  public void setBcId(String bcId) {
    this.bcId = bcId;
  }

  public SetUpdateBody catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(required = true, description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public SetUpdateBody conditions(CatalogsetupdateConditions conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public CatalogsetupdateConditions getConditions() {
    return conditions;
  }

  public void setConditions(CatalogsetupdateConditions conditions) {
    this.conditions = conditions;
  }

  public SetUpdateBody productSetId(String productSetId) {
    this.productSetId = productSetId;
    return this;
  }

   /**
   * Get productSetId
   * @return productSetId
  **/
  @Schema(required = true, description = "")
  public String getProductSetId() {
    return productSetId;
  }

  public void setProductSetId(String productSetId) {
    this.productSetId = productSetId;
  }

  public SetUpdateBody productSetName(String productSetName) {
    this.productSetName = productSetName;
    return this;
  }

   /**
   * Get productSetName
   * @return productSetName
  **/
  @Schema(description = "")
  public String getProductSetName() {
    return productSetName;
  }

  public void setProductSetName(String productSetName) {
    this.productSetName = productSetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetUpdateBody setUpdateBody = (SetUpdateBody) o;
    return Objects.equals(this.bcId, setUpdateBody.bcId) &&
        Objects.equals(this.catalogId, setUpdateBody.catalogId) &&
        Objects.equals(this.conditions, setUpdateBody.conditions) &&
        Objects.equals(this.productSetId, setUpdateBody.productSetId) &&
        Objects.equals(this.productSetName, setUpdateBody.productSetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, conditions, productSetId, productSetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetUpdateBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    productSetId: ").append(toIndentedString(productSetId)).append("\n");
    sb.append("    productSetName: ").append(toIndentedString(productSetName)).append("\n");
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
