/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */
package io.swagger.client.api;

import business_api.ApiException;
import business_api.SDKException;
import business_api.SDKExceptionForEvent;
import business_api.Response;
import business_api.ApiClient;
import business_api.Configuration;
import business_api.Pair;

import javax.ws.rs.core.GenericType;

import business_api_client.ContextInfoGmvMaxReportGet;
import business_api_client.FilteringGmvMaxReportGet;
import business_api_client.FilteringSmartPlusMaterialReportBreakdown;
import business_api_client.FilteringSmartPlusMaterialReportOverview;
import business_api_client.InlineResponse200;
import business_api_client.ReportTaskCreateBody;
import business_api_client.TaskCancelBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-12-02T15:00:15.368932-08:00[America/Los_Angeles]")public class ReportingApi {
  private ApiClient apiClient;

  public ReportingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get GMV Max report [Smart Plus GMV Max Report Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1824721673497601)
   * 
   * @param advertiserId  (required)
   * @param storeIds  (required)
   * @param dimensions  (required)
   * @param metrics  (required)
   * @param startDate  (required)
   * @param endDate  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param enableTotalMetrics  (optional, default to false)
   * @param filtering  (optional)
   * @param sortField  (optional)
   * @param sortType  (optional, default to DESC)
   * @param page  (optional, default to 1)
   * @param pageSize  (optional, default to 10)
   * @param contextInfo  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response gmvMaxReportGet(String advertiserId, List<String> storeIds, List<String> dimensions, List<String> metrics, String startDate, String endDate, String accessToken, Boolean enableTotalMetrics, FilteringGmvMaxReportGet filtering, String sortField, String sortType, Long page, Long pageSize, ContextInfoGmvMaxReportGet contextInfo) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling gmvMaxReportGet");
    }
    // verify the required parameter 'storeIds' is set
    if (storeIds == null) {
      throw new ApiException(400, "Missing the required parameter 'storeIds' when calling gmvMaxReportGet");
    }
    // verify the required parameter 'dimensions' is set
    if (dimensions == null) {
      throw new ApiException(400, "Missing the required parameter 'dimensions' when calling gmvMaxReportGet");
    }
    // verify the required parameter 'metrics' is set
    if (metrics == null) {
      throw new ApiException(400, "Missing the required parameter 'metrics' when calling gmvMaxReportGet");
    }
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling gmvMaxReportGet");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling gmvMaxReportGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling gmvMaxReportGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/gmv_max/report/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "store_ids", storeIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dimensions", dimensions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable_total_metrics", enableTotalMetrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filtering", filtering));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_type", sortType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "context_info", contextInfo));

    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
  /**
   * Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)
   * 
   * @param reportType  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param page  (optional, default to 1)
   * @param pageSize  (optional, default to 10)
   * @param enableTotalMetrics  (optional, default to false)
   * @param multiAdvReportInUtcTime  (optional, default to false)
   * @param queryMode  (optional)
   * @param advertiserId  (optional)
   * @param advertiserIds  (optional)
   * @param bcId  (optional)
   * @param serviceType  (optional)
   * @param dataLevel  (optional)
   * @param dimensions  (optional)
   * @param metrics  (optional)
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @param queryLifetime  (optional)
   * @param orderField  (optional)
   * @param orderType  (optional)
   * @param filtering  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response reportIntegratedGet(String reportType, String accessToken, Long page, Long pageSize, Boolean enableTotalMetrics, Boolean multiAdvReportInUtcTime, String queryMode, String advertiserId, List<String> advertiserIds, String bcId, String serviceType, String dataLevel, List<String> dimensions, List<String> metrics, String startDate, String endDate, Boolean queryLifetime, String orderField, String orderType, List<Object> filtering) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'reportType' is set
    if (reportType == null) {
      throw new ApiException(400, "Missing the required parameter 'reportType' when calling reportIntegratedGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling reportIntegratedGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/report/integrated/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable_total_metrics", enableTotalMetrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multi_adv_report_in_utc_time", multiAdvReportInUtcTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_mode", queryMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "advertiser_ids", advertiserIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bc_id", bcId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "service_type", serviceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "report_type", reportType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_level", dataLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dimensions", dimensions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_lifetime", queryLifetime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_field", orderField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_type", orderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filtering", filtering));

    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
  /**
   * Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response reportTaskCancel(String accessToken, TaskCancelBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling reportTaskCancel");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/report/task/cancel/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
  /**
   * Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)
   * 
   * @param taskId  (required)
   * @param advertiserId  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response reportTaskCheck(String taskId, String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling reportTaskCheck");
    }
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling reportTaskCheck");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling reportTaskCheck");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/report/task/check/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "task_id", taskId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));

    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
  /**
   * 
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response reportTaskCreate(String accessToken, ReportTaskCreateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling reportTaskCreate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/report/task/create/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
  /**
   * Get breakdown of material reports [Smart Plus Material Report Breakdown]
   * 
   * @param advertiserId  (required)
   * @param dimensions  (required)
   * @param startDate  (required)
   * @param endDate  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param metrics  (optional)
   * @param filtering  (optional)
   * @param sortField  (optional, default to spend)
   * @param sortType  (optional, default to DESC)
   * @param page  (optional, default to 1)
   * @param pageSize  (optional, default to 10)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response smartPlusMaterialReportBreakdown(String advertiserId, List<String> dimensions, String startDate, String endDate, String accessToken, List<String> metrics, FilteringSmartPlusMaterialReportBreakdown filtering, String sortField, String sortType, Long page, Long pageSize) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling smartPlusMaterialReportBreakdown");
    }
    // verify the required parameter 'dimensions' is set
    if (dimensions == null) {
      throw new ApiException(400, "Missing the required parameter 'dimensions' when calling smartPlusMaterialReportBreakdown");
    }
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling smartPlusMaterialReportBreakdown");
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling smartPlusMaterialReportBreakdown");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling smartPlusMaterialReportBreakdown");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/smart_plus/material_report/breakdown/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dimensions", dimensions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filtering", filtering));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_type", sortType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
  /**
   * Get overview of material reports [Smart Plus Material Report Overview]
   * 
   * @param advertiserId  (required)
   * @param dimensions  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param metrics  (optional)
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @param queryLifetime  (optional, default to false)
   * @param filtering  (optional)
   * @param sortField  (optional, default to spend)
   * @param sortType  (optional, default to DESC)
   * @param page  (optional, default to 1)
   * @param pageSize  (optional, default to 10)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response smartPlusMaterialReportOverview(String advertiserId, List<String> dimensions, String accessToken, List<String> metrics, String startDate, String endDate, Boolean queryLifetime, FilteringSmartPlusMaterialReportOverview filtering, String sortField, String sortType, Long page, Long pageSize) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling smartPlusMaterialReportOverview");
    }
    // verify the required parameter 'dimensions' is set
    if (dimensions == null) {
      throw new ApiException(400, "Missing the required parameter 'dimensions' when calling smartPlusMaterialReportOverview");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling smartPlusMaterialReportOverview");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/smart_plus/material_report/overview/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dimensions", dimensions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_lifetime", queryLifetime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filtering", filtering));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_type", sortType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/pixel")) {
          throw new SDKExceptionForEvent(response.getRequestId(), response.getCode(), response.getMessage(), response.getData());
      }
      throw new SDKException(response.getRequestId(), response.getCode(), response.getMessage());
    }
      Response return_response = new Response();
    return_response.setData(response.getData());
    return_response.setRequestId(response.getRequestId());

    return return_response;
  }
}
