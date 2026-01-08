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
 * ExtraInfoSettingSmartPlusMaterialReviewInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2026-01-08T15:25:30.628143-08:00[America/Los_Angeles]")
public class ExtraInfoSettingSmartPlusMaterialReviewInfo {
  @JsonProperty("include_reject_info")
  private Boolean includeRejectInfo = false;

  @JsonProperty("include_violation_frame")
  private Boolean includeViolationFrame = false;

  public ExtraInfoSettingSmartPlusMaterialReviewInfo includeRejectInfo(Boolean includeRejectInfo) {
    this.includeRejectInfo = includeRejectInfo;
    return this;
  }

   /**
   * Get includeRejectInfo
   * @return includeRejectInfo
  **/
  @Schema(description = "")
  public Boolean isIncludeRejectInfo() {
    return includeRejectInfo;
  }

  public void setIncludeRejectInfo(Boolean includeRejectInfo) {
    this.includeRejectInfo = includeRejectInfo;
  }

  public ExtraInfoSettingSmartPlusMaterialReviewInfo includeViolationFrame(Boolean includeViolationFrame) {
    this.includeViolationFrame = includeViolationFrame;
    return this;
  }

   /**
   * Get includeViolationFrame
   * @return includeViolationFrame
  **/
  @Schema(description = "")
  public Boolean isIncludeViolationFrame() {
    return includeViolationFrame;
  }

  public void setIncludeViolationFrame(Boolean includeViolationFrame) {
    this.includeViolationFrame = includeViolationFrame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraInfoSettingSmartPlusMaterialReviewInfo extraInfoSettingSmartPlusMaterialReviewInfo = (ExtraInfoSettingSmartPlusMaterialReviewInfo) o;
    return Objects.equals(this.includeRejectInfo, extraInfoSettingSmartPlusMaterialReviewInfo.includeRejectInfo) &&
        Objects.equals(this.includeViolationFrame, extraInfoSettingSmartPlusMaterialReviewInfo.includeViolationFrame);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeRejectInfo, includeViolationFrame);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraInfoSettingSmartPlusMaterialReviewInfo {\n");
    
    sb.append("    includeRejectInfo: ").append(toIndentedString(includeRejectInfo)).append("\n");
    sb.append("    includeViolationFrame: ").append(toIndentedString(includeViolationFrame)).append("\n");
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
