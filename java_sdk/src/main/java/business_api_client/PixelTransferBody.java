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
 * PixelTransferBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class PixelTransferBody {
  @JsonProperty("bc_id")
  private String bcId = null;

  @JsonProperty("pixel_code")
  private String pixelCode = null;

  public PixelTransferBody bcId(String bcId) {
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

  public PixelTransferBody pixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
    return this;
  }

   /**
   * Get pixelCode
   * @return pixelCode
  **/
  @Schema(required = true, description = "")
  public String getPixelCode() {
    return pixelCode;
  }

  public void setPixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixelTransferBody pixelTransferBody = (PixelTransferBody) o;
    return Objects.equals(this.bcId, pixelTransferBody.bcId) &&
        Objects.equals(this.pixelCode, pixelTransferBody.pixelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcId, pixelCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelTransferBody {\n");
    
    sb.append("    bcId: ").append(toIndentedString(bcId)).append("\n");
    sb.append("    pixelCode: ").append(toIndentedString(pixelCode)).append("\n");
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
