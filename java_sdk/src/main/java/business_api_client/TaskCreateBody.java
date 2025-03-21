/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.ReporttaskcreateFiltering;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * TaskCreateBody
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")
public class TaskCreateBody {
  @JsonProperty("advertiser_id")
  private String advertiserId = null;

  @JsonProperty("advertiser_ids")
  private List<String> advertiserIds = null;

  @JsonProperty("data_level")
  private String dataLevel = null;

  @JsonProperty("dimensions")
  private List<String> dimensions = new ArrayList<String>();

  @JsonProperty("enable_report_title_translation")
  private Boolean enableReportTitleTranslation = true;

  @JsonProperty("end_date")
  private String endDate = null;

  @JsonProperty("file_name")
  private String fileName = " ";

  @JsonProperty("filtering")
  private List<ReporttaskcreateFiltering> filtering = null;

  @JsonProperty("metrics")
  private List<String> metrics = null;

  @JsonProperty("order_field")
  private String orderField = null;

  @JsonProperty("order_type")
  private String orderType = "DESC";

  @JsonProperty("output_format")
  private String outputFormat = "CSV_STRING";

  @JsonProperty("query_lifetime")
  private Boolean queryLifetime = false;

  @JsonProperty("report_type")
  private String reportType = null;

  @JsonProperty("service_type")
  private String serviceType = "AUCTION";

  @JsonProperty("start_date")
  private String startDate = null;

  public TaskCreateBody advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * Get advertiserId
   * @return advertiserId
  **/
  @Schema(description = "")
  public String getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }

  public TaskCreateBody advertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public TaskCreateBody addAdvertiserIdsItem(String advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<String>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * Get advertiserIds
   * @return advertiserIds
  **/
  @Schema(description = "")
  public List<String> getAdvertiserIds() {
    return advertiserIds;
  }

  public void setAdvertiserIds(List<String> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }

  public TaskCreateBody dataLevel(String dataLevel) {
    this.dataLevel = dataLevel;
    return this;
  }

   /**
   * Get dataLevel
   * @return dataLevel
  **/
  @Schema(description = "")
  public String getDataLevel() {
    return dataLevel;
  }

  public void setDataLevel(String dataLevel) {
    this.dataLevel = dataLevel;
  }

  public TaskCreateBody dimensions(List<String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public TaskCreateBody addDimensionsItem(String dimensionsItem) {
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @Schema(required = true, description = "")
  public List<String> getDimensions() {
    return dimensions;
  }

  public void setDimensions(List<String> dimensions) {
    this.dimensions = dimensions;
  }

  public TaskCreateBody enableReportTitleTranslation(Boolean enableReportTitleTranslation) {
    this.enableReportTitleTranslation = enableReportTitleTranslation;
    return this;
  }

   /**
   * Get enableReportTitleTranslation
   * @return enableReportTitleTranslation
  **/
  @Schema(description = "")
  public Boolean isEnableReportTitleTranslation() {
    return enableReportTitleTranslation;
  }

  public void setEnableReportTitleTranslation(Boolean enableReportTitleTranslation) {
    this.enableReportTitleTranslation = enableReportTitleTranslation;
  }

  public TaskCreateBody endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public TaskCreateBody fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public TaskCreateBody filtering(List<ReporttaskcreateFiltering> filtering) {
    this.filtering = filtering;
    return this;
  }

  public TaskCreateBody addFilteringItem(ReporttaskcreateFiltering filteringItem) {
    if (this.filtering == null) {
      this.filtering = new ArrayList<ReporttaskcreateFiltering>();
    }
    this.filtering.add(filteringItem);
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @Schema(description = "")
  public List<ReporttaskcreateFiltering> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<ReporttaskcreateFiltering> filtering) {
    this.filtering = filtering;
  }

  public TaskCreateBody metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public TaskCreateBody addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<String>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public TaskCreateBody orderField(String orderField) {
    this.orderField = orderField;
    return this;
  }

   /**
   * Get orderField
   * @return orderField
  **/
  @Schema(description = "")
  public String getOrderField() {
    return orderField;
  }

  public void setOrderField(String orderField) {
    this.orderField = orderField;
  }

  public TaskCreateBody orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @Schema(description = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public TaskCreateBody outputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * Get outputFormat
   * @return outputFormat
  **/
  @Schema(description = "")
  public String getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(String outputFormat) {
    this.outputFormat = outputFormat;
  }

  public TaskCreateBody queryLifetime(Boolean queryLifetime) {
    this.queryLifetime = queryLifetime;
    return this;
  }

   /**
   * Get queryLifetime
   * @return queryLifetime
  **/
  @Schema(description = "")
  public Boolean isQueryLifetime() {
    return queryLifetime;
  }

  public void setQueryLifetime(Boolean queryLifetime) {
    this.queryLifetime = queryLifetime;
  }

  public TaskCreateBody reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @Schema(required = true, description = "")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public TaskCreateBody serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @Schema(description = "")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public TaskCreateBody startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCreateBody taskCreateBody = (TaskCreateBody) o;
    return Objects.equals(this.advertiserId, taskCreateBody.advertiserId) &&
        Objects.equals(this.advertiserIds, taskCreateBody.advertiserIds) &&
        Objects.equals(this.dataLevel, taskCreateBody.dataLevel) &&
        Objects.equals(this.dimensions, taskCreateBody.dimensions) &&
        Objects.equals(this.enableReportTitleTranslation, taskCreateBody.enableReportTitleTranslation) &&
        Objects.equals(this.endDate, taskCreateBody.endDate) &&
        Objects.equals(this.fileName, taskCreateBody.fileName) &&
        Objects.equals(this.filtering, taskCreateBody.filtering) &&
        Objects.equals(this.metrics, taskCreateBody.metrics) &&
        Objects.equals(this.orderField, taskCreateBody.orderField) &&
        Objects.equals(this.orderType, taskCreateBody.orderType) &&
        Objects.equals(this.outputFormat, taskCreateBody.outputFormat) &&
        Objects.equals(this.queryLifetime, taskCreateBody.queryLifetime) &&
        Objects.equals(this.reportType, taskCreateBody.reportType) &&
        Objects.equals(this.serviceType, taskCreateBody.serviceType) &&
        Objects.equals(this.startDate, taskCreateBody.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserIds, dataLevel, dimensions, enableReportTitleTranslation, endDate, fileName, filtering, metrics, orderField, orderType, outputFormat, queryLifetime, reportType, serviceType, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCreateBody {\n");
    
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    dataLevel: ").append(toIndentedString(dataLevel)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    enableReportTitleTranslation: ").append(toIndentedString(enableReportTitleTranslation)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    queryLifetime: ").append(toIndentedString(queryLifetime)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
