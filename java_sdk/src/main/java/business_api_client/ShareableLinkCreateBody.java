/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.CreativeshareableLinkcreateSharedAssets;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ShareableLinkCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class ShareableLinkCreateBody {
  @JsonProperty("shared_assets")
  private List<CreativeshareableLinkcreateSharedAssets> sharedAssets = new ArrayList<CreativeshareableLinkcreateSharedAssets>();

  @JsonProperty("sharer")
  private String sharer = null;

  public ShareableLinkCreateBody sharedAssets(List<CreativeshareableLinkcreateSharedAssets> sharedAssets) {
    this.sharedAssets = sharedAssets;
    return this;
  }

  public ShareableLinkCreateBody addSharedAssetsItem(CreativeshareableLinkcreateSharedAssets sharedAssetsItem) {
    this.sharedAssets.add(sharedAssetsItem);
    return this;
  }

   /**
   * Get sharedAssets
   * @return sharedAssets
  **/
  @Schema(required = true, description = "")
  public List<CreativeshareableLinkcreateSharedAssets> getSharedAssets() {
    return sharedAssets;
  }

  public void setSharedAssets(List<CreativeshareableLinkcreateSharedAssets> sharedAssets) {
    this.sharedAssets = sharedAssets;
  }

  public ShareableLinkCreateBody sharer(String sharer) {
    this.sharer = sharer;
    return this;
  }

   /**
   * Get sharer
   * @return sharer
  **/
  @Schema(required = true, description = "")
  public String getSharer() {
    return sharer;
  }

  public void setSharer(String sharer) {
    this.sharer = sharer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareableLinkCreateBody shareableLinkCreateBody = (ShareableLinkCreateBody) o;
    return Objects.equals(this.sharedAssets, shareableLinkCreateBody.sharedAssets) &&
        Objects.equals(this.sharer, shareableLinkCreateBody.sharer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedAssets, sharer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareableLinkCreateBody {\n");
    
    sb.append("    sharedAssets: ").append(toIndentedString(sharedAssets)).append("\n");
    sb.append("    sharer: ").append(toIndentedString(sharer)).append("\n");
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
