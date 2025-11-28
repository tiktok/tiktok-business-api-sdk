/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CatalogcreateCatalogConf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CatalogCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")
public class CatalogCreateBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("catalog_conf")
  private CatalogcreateCatalogConf catalogConf = null;

  @JsonProperty("catalog_type")
  private String catalogType = null;

  @JsonProperty("creative_asset_type")
  private String creativeAssetType = null;

  @JsonProperty("name")
  private String name = null;

  public CatalogCreateBody bcId(String bcId) {
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

  public CatalogCreateBody catalogConf(CatalogcreateCatalogConf catalogConf) {
    this.catalogConf = catalogConf;
    return this;
  }

   /**
   * Get catalogConf
   * @return catalogConf
  **/
  @Schema(required = true, description = "")
  public CatalogcreateCatalogConf getCatalogConf() {
    return catalogConf;
  }

  public void setCatalogConf(CatalogcreateCatalogConf catalogConf) {
    this.catalogConf = catalogConf;
  }

  public CatalogCreateBody catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @Schema(required = true, description = "")
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogCreateBody creativeAssetType(String creativeAssetType) {
    this.creativeAssetType = creativeAssetType;
    return this;
  }

   /**
   * Get creativeAssetType
   * @return creativeAssetType
  **/
  @Schema(description = "")
  public String getCreativeAssetType() {
    return creativeAssetType;
  }

  public void setCreativeAssetType(String creativeAssetType) {
    this.creativeAssetType = creativeAssetType;
  }

  public CatalogCreateBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogCreateBody catalogCreateBody = (CatalogCreateBody) o;
    return Objects.equals(this.bcId, catalogCreateBody.bcId) &&
        Objects.equals(this.catalogConf, catalogCreateBody.catalogConf) &&
        Objects.equals(this.catalogType, catalogCreateBody.catalogType) &&
        Objects.equals(this.creativeAssetType, catalogCreateBody.creativeAssetType) &&
        Objects.equals(this.name, catalogCreateBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, catalogConf, catalogType, creativeAssetType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogCreateBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    catalogConf: ").append(toIndentedString(catalogConf)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetType: ").append(toIndentedString(creativeAssetType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
