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

import business_api_client.IdentityList;
import business_api_client.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-11-29T05:21:11.995104+05:30[Asia/Kolkata]")public class VideoApi {
  private ApiClient apiClient;

  public VideoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VideoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)
   * 
   * @param advertiserId  (required)
   * @param storeId  (required)
   * @param storeAuthorizedBcId  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param spuIdList  (optional)
   * @param identityList  (optional)
   * @param needAuthCodeVideo  (optional)
   * @param page  (optional, default to 1)
   * @param pageSize  (optional, default to 10)
   * @param customPostsEligible  (optional)
   * @param sortField  (optional)
   * @param sortType  (optional, default to DESC)
   * @param keyword  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response gmvMaxVideoGet(String advertiserId, String storeId, String storeAuthorizedBcId, String accessToken, List<String> spuIdList, List<IdentityList> identityList, Boolean needAuthCodeVideo, Long page, Long pageSize, Boolean customPostsEligible, String sortField, String sortType, String keyword) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling gmvMaxVideoGet");
    }
    // verify the required parameter 'storeId' is set
    if (storeId == null) {
      throw new ApiException(400, "Missing the required parameter 'storeId' when calling gmvMaxVideoGet");
    }
    // verify the required parameter 'storeAuthorizedBcId' is set
    if (storeAuthorizedBcId == null) {
      throw new ApiException(400, "Missing the required parameter 'storeAuthorizedBcId' when calling gmvMaxVideoGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling gmvMaxVideoGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/gmv_max/video/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "store_id", storeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "store_authorized_bc_id", storeAuthorizedBcId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "spu_id_list", spuIdList));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "identity_list", identityList));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "need_auth_code_video", needAuthCodeVideo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_posts_eligible", customPostsEligible));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_field", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_type", sortType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyword", keyword));

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
