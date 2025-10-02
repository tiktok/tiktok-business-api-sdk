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
 * AssetGroupDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class AssetGroupDeleteBody {
  @JsonProperty("asset_group_ids")
  private List<String> assetGroupIds = new ArrayList<String>();

  @JsonProperty("bc_id")
  private String bcId = null;

  public AssetGroupDeleteBody assetGroupIds(List<String> assetGroupIds) {
    this.assetGroupIds = assetGroupIds;
    return this;
  }

  public AssetGroupDeleteBody addAssetGroupIdsItem(String assetGroupIdsItem) {
    this.assetGroupIds.add(assetGroupIdsItem);
    return this;
  }

   /**
   * Get assetGroupIds
   * @return assetGroupIds
  **/
  @Schema(required = true, description = "")
  public List<String> getAssetGroupIds() {
    return assetGroupIds;
  }

  public void setAssetGroupIds(List<String> assetGroupIds) {
    this.assetGroupIds = assetGroupIds;
  }

  public AssetGroupDeleteBody bcId(String bcId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupDeleteBody assetGroupDeleteBody = (AssetGroupDeleteBody) o;
    return Objects.equals(this.assetGroupIds, assetGroupDeleteBody.assetGroupIds) &&
        Objects.equals(this.bcId, assetGroupDeleteBody.bcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupIds, bcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeleteBody {\n");
    
    sb.append("    assetGroupIds: ").append(toIndentedString(assetGroupIds)).append("\n");
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
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
