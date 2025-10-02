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
 * PageInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-10-02T15:20:10.801947-07:00[America/Los_Angeles]")
public class PageInfo {
  @JsonProperty("page")
  private Long page = 1l;

  @JsonProperty("page_size")
  private Long pageSize = 10l;

  public PageInfo page(Long page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * minimum: 1
   * @return page
  **/
  @Schema(description = "")
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public PageInfo pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * minimum: 1
   * maximum: 500
   * @return pageSize
  **/
  @Schema(description = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageInfo pageInfo = (PageInfo) o;
    return Objects.equals(this.page, pageInfo.page) &&
        Objects.equals(this.pageSize, pageInfo.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfo {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
