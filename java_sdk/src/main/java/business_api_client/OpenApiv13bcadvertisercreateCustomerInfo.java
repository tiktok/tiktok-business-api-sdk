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
 * Business Information
 */
@Schema(description = "Business Information")
@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2024-11-01T15:21:34.532937-07:00[America/Los_Angeles]")
public class OpenApiv13bcadvertisercreateCustomerInfo {
  @JsonProperty("company")
  private String company = null;

  @JsonProperty("industry")
  private Integer industry = null;

  @JsonProperty("registered_area")
  private String registeredArea = null;

  public OpenApiv13bcadvertisercreateCustomerInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Ad Account company name. Length cannot exceed 255 characters
   * @return company
  **/
  @Schema(description = "Ad Account company name. Length cannot exceed 255 characters")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public OpenApiv13bcadvertisercreateCustomerInfo industry(Integer industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Ad Account industry ID. The value range is shown in [Appendix-Industries](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739357589575681)
   * @return industry
  **/
  @Schema(description = "Ad Account industry ID. The value range is shown in [Appendix-Industries](https://ads.tiktok.com/marketing_api/docs?id=1739357589575681)")
  public Integer getIndustry() {
    return industry;
  }

  public void setIndustry(Integer industry) {
    this.industry = industry;
  }

  public OpenApiv13bcadvertisercreateCustomerInfo registeredArea(String registeredArea) {
    this.registeredArea = registeredArea;
    return this;
  }

   /**
   * Ad Account registration code. The value range is shown in [Appendix-Location code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585867307010)
   * @return registeredArea
  **/
  @Schema(description = "Ad Account registration code. The value range is shown in [Appendix-Location code](https://ads.tiktok.com/marketing_api/docs?id=1737585867307010)")
  public String getRegisteredArea() {
    return registeredArea;
  }

  public void setRegisteredArea(String registeredArea) {
    this.registeredArea = registeredArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13bcadvertisercreateCustomerInfo openApiv13bcadvertisercreateCustomerInfo = (OpenApiv13bcadvertisercreateCustomerInfo) o;
    return Objects.equals(this.company, openApiv13bcadvertisercreateCustomerInfo.company) &&
        Objects.equals(this.industry, openApiv13bcadvertisercreateCustomerInfo.industry) &&
        Objects.equals(this.registeredArea, openApiv13bcadvertisercreateCustomerInfo.registeredArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, industry, registeredArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13bcadvertisercreateCustomerInfo {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    registeredArea: ").append(toIndentedString(registeredArea)).append("\n");
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
