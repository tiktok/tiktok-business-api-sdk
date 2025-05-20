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

import business_api_client.DateRange;
import business_api_client.EventCreateBody;
import business_api_client.EventDeleteBody;
import business_api_client.EventUpdateBody;
import business_api_client.FilteringPixelList;
import business_api_client.InlineResponse200;
import business_api_client.OfflineCreateBody;
import business_api_client.OfflineDeleteBody;
import business_api_client.OfflineUpdateBody;
import business_api_client.PixelCreateBody;
import business_api_client.PixelUpdateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-05-20T12:00:30.004772-07:00[America/Los_Angeles]")public class MeasurementApi {
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
   * Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1758427576470529)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response offlineCreate(String accessToken, OfflineCreateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling offlineCreate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/offline/create/";

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
   * Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596790860802)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response offlineDelete(String accessToken, OfflineDeleteBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling offlineDelete");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/offline/delete/";

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
   * Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596808589313)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param advertiserId  (optional)
   * @param eventSetIds  (optional)
   * @param name  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response offlineGet(String accessToken, String advertiserId, List<String> eventSetIds, String name) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling offlineGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/offline/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "event_set_ids", eventSetIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

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
   * Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596741157889)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response offlineUpdate(String accessToken, OfflineUpdateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling offlineUpdate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/offline/update/";

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
   * Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858779758593)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelCreate(String accessToken, PixelCreateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelCreate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/create/";

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
   * Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858807646209)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelEventCreate(String accessToken, EventCreateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelEventCreate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/event/create/";

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
   * Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858862104578)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelEventDelete(String accessToken, EventDeleteBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelEventDelete");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/event/delete/";

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
   * View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858904557570)
   * 
   * @param advertiserId  (required)
   * @param pixelIds  (required)
   * @param dateRange  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelEventStats(String advertiserId, List<String> pixelIds, DateRange dateRange, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling pixelEventStats");
    }
    // verify the required parameter 'pixelIds' is set
    if (pixelIds == null) {
      throw new ApiException(400, "Missing the required parameter 'pixelIds' when calling pixelEventStats");
    }
    // verify the required parameter 'dateRange' is set
    if (dateRange == null) {
      throw new ApiException(400, "Missing the required parameter 'dateRange' when calling pixelEventStats");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelEventStats");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/event/stats/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "pixel_ids", pixelIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_range", dateRange));

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
   * Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858823774210)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelEventUpdate(String accessToken, EventUpdateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelEventUpdate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/event/update/";

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
   * Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858697598978)
   * 
   * @param advertiserId  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param pixelId  (optional)
   * @param code  (optional)
   * @param name  (optional)
   * @param orderBy  (optional, default to EARLIEST_CREATE)
   * @param filtering  (optional)
   * @param page  (optional)
   * @param pageSize  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelList(String advertiserId, String accessToken, String pixelId, String code, String name, String orderBy, FilteringPixelList filtering, Long page, Long pageSize) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling pixelList");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelList");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/list/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pixel_id", pixelId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_by", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filtering", filtering));
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
   * Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858799524865)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response pixelUpdate(String accessToken, PixelUpdateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling pixelUpdate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/pixel/update/";

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
}
