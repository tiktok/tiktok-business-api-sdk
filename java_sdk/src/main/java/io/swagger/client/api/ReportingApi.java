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

import business_api_client.FilteringReportIntegratedGet;
import business_api_client.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")public class ReportingApi {
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
   * Create a synchronous report task.  This endpoint can currently return the reporting data of up to 10,000 advertisements. If your number of advertisements exceeds 10,000, please use campaign_ids / adgroup_ids / ad_ids as a filter to obtain the reporting data of all advertisements in batches. Additionally, with CHUNK mode on, up to 20,000 advertisements can be returned. If you use campaign_ids / adgroup_ids / ad_ids as a filter, you can pass in up to 100 IDs at a time. [Reporting Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740302848100353)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param reportType Report type. Enum values- &#x60;BASIC&#x60; (basic report), &#x60;AUDIENCE&#x60; (audience report), &#x60;PLAYABLE_MATERIAL&#x60;  (playable ads report), &#x60;CATALOG&#x60; (DSA report). When &#x60;service_type&#x60; is &#x60;RESERVATION&#x60;, only &#x60;BASIC&#x60; report is supported. When &#x60;service_type&#x60; is &#x60;AUCTION&#x60;, &#x60;BASIC&#x60;, &#x60;AUDIENCE&#x60;, &#x60;PLAYABLE_MATERIAL&#x60;, and &#x60;CATALOG&#x60; reports are all supported. (required)
   * @param dimensions Grouping conditions. For example- &#x60;［\&quot;campaign_id\&quot;, \&quot;stat_time_day\&quot;］&#x60; indicates that both &#x60;campaign_id&#x60; and &#x60;stat_time_day&#x60; (days) are grouped. For supported dimensions for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param serviceType Ad service type. Enum values:&#x60;AUCTION&#x60;(Auction Ads), &#x60;RESERVATION&#x60;(Reservation Ads). Default value &#x60;AUCTION&#x60;. (optional)
   * @param dataLevel The data level that you&#x27;d like to query in reports. Required when &#x60;report_type&#x60; is &#x60;BASIC&#x60;,&#x60;AUDIENCE&#x60; or &#x60;CATALOG&#x60;. Enum values &#x60;AUCTION_AD&#x60; Auction Ads, Ad level. &#x60;AUCTION_ADGROUP&#x60; Auction Ads, Ad Group level. &#x60;AUCTION_CAMPAIGN&#x60; Auction Ads, Campaign level. &#x60;AUCTION_ADVERTISER&#x60; Auction Ads, Advertiser level. &#x60;RESERVATION_AD&#x60; Reservation Ads, Ad level. &#x60;RESERVATION_ADGROUP&#x60; Reservation Ads, Ad Group level. RESERVATION_CAMPAIGN&#x60; Reservation Ads, Campaign level. &#x60;RESERVATION_ADVERTISER&#x60; Reservation Ads, Advertiser level. (optional)
   * @param metrics Metrics to query. Different report types support different metrics.  For supported metrics for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). (optional)
   * @param orderField Sorting field. All supported metrics (excluding attribute metrics) support sorting. Not sorting by default. (optional)
   * @param orderType Sorting order. Enum values- &#x60;ASC&#x60;, &#x60;DESC&#x60;. Default value- &#x60;DESC&#x60;. (optional)
   * @param startDate Query start date (closed interval) in the format of &#x60;YYYY-MM-DD&#x60;. The date is based on the ad account time zone. This field is required when &#x60;query_lifetime&#x60; is &#x60;False&#x60;. (optional)
   * @param endDate Query end date (closed interval) in the format of &#x60;YYYY-MM-DD&#x60;. The date is based on the ad account time zone. This field is required when &#x60;query_lifetime&#x60; is &#x60;False&#x60;. (optional)
   * @param filtering Filtering conditions. Supported filtering conditions vary based on &#x60;service_type&#x60; and &#x60;data_level&#x60;. For filters supported in different report types, refer to the articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). (optional)
   * @param queryLifetime Whether to request the lifetime metrics.  Default value- &#x60;False&#x60;. If &#x60;query_lifetime&#x60; &#x3D; &#x60;True&#x60;, the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters will be ignored. The lifetime metric name is the same as the normal one. (optional)
   * @param page Current page number. Default value- &#x60;1&#x60; (optional)
   * @param pageSize Pagination size. Value range- 1-1000. Default value- &#x60;10&#x60;. (optional)
   * @param queryMode The way data is queried. Enum values- &#x60;REGULAR&#x60;, &#x60;CHUNK&#x60;. Default value- &#x60;REGULAR&#x60;.  With &#x60;CHUNK&#x60; mode on, data can be returned much faster in a more stable way. Meanwhile, pagination will not be working with &#x60;CHUNK&#x60;. (optional)
   * @param bcId The business center ID. If not provided, the default business center ID for the account will be used. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response reportIntegratedGet(String advertiserId, String reportType, List<String> dimensions, String accessToken, String serviceType, String dataLevel, List<String> metrics, String orderField, String orderType, String startDate, String endDate, List<FilteringReportIntegratedGet> filtering, Boolean queryLifetime, Integer page, Integer pageSize, String queryMode, String bcId) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling reportIntegratedGet");
    }
    // verify the required parameter 'reportType' is set
    if (reportType == null) {
      throw new ApiException(400, "Missing the required parameter 'reportType' when calling reportIntegratedGet");
    }
    // verify the required parameter 'dimensions' is set
    if (dimensions == null) {
      throw new ApiException(400, "Missing the required parameter 'dimensions' when calling reportIntegratedGet");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "service_type", serviceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "data_level", dataLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "report_type", reportType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "dimensions", dimensions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "metrics", metrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_field", orderField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_type", orderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filtering", filtering));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_lifetime", queryLifetime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_mode", queryMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bc_id", bcId));

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
