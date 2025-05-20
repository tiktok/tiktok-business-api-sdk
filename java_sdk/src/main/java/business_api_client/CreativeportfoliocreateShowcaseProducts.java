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
 * CreativeportfoliocreateShowcaseProducts
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")
public class CreativeportfoliocreateShowcaseProducts {
  @JsonProperty("catalog_id")
  private String catalogId = null;

  @JsonProperty("item_group_id")
  private String itemGroupId = null;

  @JsonProperty("store_id")
  private String storeId = null;

  public CreativeportfoliocreateShowcaseProducts catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @Schema(description = "")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CreativeportfoliocreateShowcaseProducts itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * Get itemGroupId
   * @return itemGroupId
  **/
  @Schema(description = "")
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public CreativeportfoliocreateShowcaseProducts storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @Schema(description = "")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeportfoliocreateShowcaseProducts creativeportfoliocreateShowcaseProducts = (CreativeportfoliocreateShowcaseProducts) o;
    return Objects.equals(this.catalogId, creativeportfoliocreateShowcaseProducts.catalogId) &&
        Objects.equals(this.itemGroupId, creativeportfoliocreateShowcaseProducts.itemGroupId) &&
        Objects.equals(this.storeId, creativeportfoliocreateShowcaseProducts.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, itemGroupId, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeportfoliocreateShowcaseProducts {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
