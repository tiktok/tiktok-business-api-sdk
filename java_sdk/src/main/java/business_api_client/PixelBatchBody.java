/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.PixelbatchBatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PixelBatchBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-07-03T14:36:18.961395-07:00[America/Los_Angeles]")
public class PixelBatchBody {
  @JsonProperty("batch")
  private List<PixelbatchBatch> batch = new ArrayList<PixelbatchBatch>();

  @JsonProperty("pixel_code")
  private String pixelCode = null;

  public PixelBatchBody batch(List<PixelbatchBatch> batch) {
    this.batch = batch;
    return this;
  }

  public PixelBatchBody addBatchItem(PixelbatchBatch batchItem) {
    this.batch.add(batchItem);
    return this;
  }

   /**
   * A list of web events
   * @return batch
  **/
  @Schema(required = true, description = "A list of web events")
  public List<PixelbatchBatch> getBatch() {
    return batch;
  }

  public void setBatch(List<PixelbatchBatch> batch) {
    this.batch = batch;
  }

  public PixelBatchBody pixelCode(String pixelCode) {
    this.pixelCode = pixelCode;
    return this;
  }

   /**
   * Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584855420929) section
   * @return pixelCode
  **/
  @Schema(required = true, description = "Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929) section")
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
    PixelBatchBody pixelBatchBody = (PixelBatchBody) o;
    return Objects.equals(this.batch, pixelBatchBody.batch) &&
        Objects.equals(this.pixelCode, pixelBatchBody.pixelCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batch, pixelCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixelBatchBody {\n");
    
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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
