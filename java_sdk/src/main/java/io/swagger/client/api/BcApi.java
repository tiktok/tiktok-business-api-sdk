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

import business_api_client.AdvertiserCreateBody;
import java.io.File;
import business_api_client.Filtering;
import business_api_client.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-04-18T10:46:48.851395-07:00[America/Los_Angeles]")public class BcApi {
  private ApiClient apiClient;

  public BcApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BcApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body BC advertiser create body parameters (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response bcAdvertiserCreate(String accessToken, AdvertiserCreateBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling bcAdvertiserCreate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/bc/advertiser/create/";

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
      if (localVarPath.startsWith("/open_api/v1.3/pixel")) {
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
   * Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)
   * 
   * @param bcId Business Center ID (required)
   * @param assetType Type of asset that you want to get. Enum values: &#x60;CATALOG&#x60;, &#x60;ADVERTISER&#x60;, &#x60;PIXEL&#x60;, &#x60;LEAD&#x60;, &#x60;TT_ACCOUNT&#x60;(corresponds to &#x60;BC_AUTH_TT&#x60;, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097), &#x60;TIKTOK_SHOP&#x60; (TikTok shop) , &#x60;STOREFRONT&#x60;( TikTok Storefront (third-party store)) (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param filtering Filtering conditions. Use either &#x60;user_id&#x60; or &#x60;user_email&#x60; as filter.Note: You cannot use &#x60;user_id&#x60; and &#x60;user_email&#x60; at the same time.If you do not specify any filter values, the system will pass in to the &#x60;user_id&#x60; field the user ID of the TikTok for Business account that gives you the authentication code (&#x60;auth_code&#x60;) (optional)
   * @param page Current page number. Default value: 1 (optional)
   * @param pageSize Page size, in the range of 1-50. Default value: 10 (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response bcAssetGet(String bcId, String assetType, String accessToken, Filtering filtering, Integer page, Integer pageSize) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'bcId' is set
    if (bcId == null) {
      throw new ApiException(400, "Missing the required parameter 'bcId' when calling bcAssetGet");
    }
    // verify the required parameter 'assetType' is set
    if (assetType == null) {
      throw new ApiException(400, "Missing the required parameter 'assetType' when calling bcAssetGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling bcAssetGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/bc/asset/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bc_id", bcId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset_type", assetType));
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
      if (localVarPath.startsWith("/open_api/v1.3/pixel")) {
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
   * Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param bcId The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in (optional)
   * @param page Current number of pages. Default value: 1. Value range : ≥ 1 (optional)
   * @param pageSize Page size. Default value: 10. Value range: 1-50 (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response bcGet(String accessToken, String bcId, Integer page, Integer pageSize) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling bcGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/bc/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bc_id", bcId));
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
      if (localVarPath.startsWith("/open_api/v1.3/pixel")) {
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
   * Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param bcId  (optional)
   * @param imageFile  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response bcImageUpload(String accessToken, String bcId, File imageFile) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling bcImageUpload");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/bc/image/upload/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (bcId != null)
      localVarFormParams.put("bc_id", bcId);
    if (imageFile != null)
      localVarFormParams.put("image_file", imageFile);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    InlineResponse200 response = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      if(response.getCode() != 0)
    {
      if (localVarPath.startsWith("/open_api/v1.3/pixel")) {
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
