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

import business_api_client.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-02-14T16:22:03.186437-08:00[America/Los_Angeles]")public class MeasurementApi {
  private ApiClient apiClient;

  public MeasurementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MeasurementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param appPlatformIds List of app platform ID for filter purpose (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response appList(String advertiserId, String accessToken, List<String> appPlatformIds) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling appList");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling appList");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/app/list/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "app_platform_ids", appPlatformIds));

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
   * Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)
   * 
   * @param appId Your App ID, obtained after successfully creating your app (required)
   * @param advertiserId Advertiser ID (required)
   * @param placement Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) (required)
   * @param optimizationGoal Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) for more (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param objective Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) (optional)
   * @param availableOnly Whether to return only available conversion events. The default value: &#x60;True&#x60; (only return available conversion events) (optional)
   * @param isSkan Whether the app is using Skan features (optional)
   * @param appPromotionType App promotion type. Required when &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60;. Enum values: &#x60;APP_INSTALL&#x60;, &#x60;APP_RETARGETING&#x60;. Note: &#x60;APP_INSTALL&#x60; can be used in an iOS14 Dedicated Campaign, while &#x60;APP_RETARGETING&#x60; cannot be used (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response appOptimizationEvent(String appId, String advertiserId, List<String> placement, String optimizationGoal, String accessToken, String objective, Boolean availableOnly, Boolean isSkan, String appPromotionType) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling appOptimizationEvent");
    }
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling appOptimizationEvent");
    }
    // verify the required parameter 'placement' is set
    if (placement == null) {
      throw new ApiException(400, "Missing the required parameter 'placement' when calling appOptimizationEvent");
    }
    // verify the required parameter 'optimizationGoal' is set
    if (optimizationGoal == null) {
      throw new ApiException(400, "Missing the required parameter 'optimizationGoal' when calling appOptimizationEvent");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling appOptimizationEvent");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/app/optimization_event/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "placement", placement));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "optimization_goal", optimizationGoal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objective", objective));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "available_only", availableOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_skan", isSkan));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_promotion_type", appPromotionType));

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
