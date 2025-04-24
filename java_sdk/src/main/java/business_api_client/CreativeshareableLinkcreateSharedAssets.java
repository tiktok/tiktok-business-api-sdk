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
 * CreativeshareableLinkcreateSharedAssets
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-04-24T14:52:51.475773-07:00[America/Los_Angeles]")
public class CreativeshareableLinkcreateSharedAssets {
  @JsonProperty("asset_id")
  private String assetId = null;

  @JsonProperty("asset_name")
  private String assetName = null;

  public CreativeshareableLinkcreateSharedAssets assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @Schema(description = "")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public CreativeshareableLinkcreateSharedAssets assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @Schema(description = "")
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeshareableLinkcreateSharedAssets creativeshareableLinkcreateSharedAssets = (CreativeshareableLinkcreateSharedAssets) o;
    return Objects.equals(this.assetId, creativeshareableLinkcreateSharedAssets.assetId) &&
        Objects.equals(this.assetName, creativeshareableLinkcreateSharedAssets.assetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeshareableLinkcreateSharedAssets {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
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
