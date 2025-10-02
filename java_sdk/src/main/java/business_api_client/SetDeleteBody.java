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
 * SetDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class SetDeleteBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("product_set_ids")
  private List<String> productSetIds = new ArrayList<String>();

  public SetDeleteBody bcId(String bcId) {
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

  public SetDeleteBody catalogId(String catalogId) {
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

  public SetDeleteBody productSetIds(List<String> productSetIds) {
    this.productSetIds = productSetIds;
    return this;
  }

  public SetDeleteBody addProductSetIdsItem(String productSetIdsItem) {
    this.productSetIds.add(productSetIdsItem);
    return this;
  }

   /**
   * Get productSetIds
   * @return productSetIds
  **/
  @Schema(required = true, description = "")
  public List<String> getProductSetIds() {
    return productSetIds;
  }

  public void setProductSetIds(List<String> productSetIds) {
    this.productSetIds = productSetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDeleteBody setDeleteBody = (SetDeleteBody) o;
    return Objects.equals(this.bcId, setDeleteBody.bcId) &&
        Objects.equals(this.catalogId, setDeleteBody.catalogId) &&
        Objects.equals(this.productSetIds, setDeleteBody.productSetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogId, productSetIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDeleteBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    productSetIds: ").append(toIndentedString(productSetIds)).append("\n");
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
