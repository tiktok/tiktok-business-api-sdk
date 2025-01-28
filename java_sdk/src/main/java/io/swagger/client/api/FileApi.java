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

import java.io.File;
import business_api_client.FilteringVideoAdSearch;
import business_api_client.InlineResponse200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-01-27T17:23:30.114869-08:00[America/Los_Angeles]")public class FileApi {
  private ApiClient apiClient;

  public FileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param advertiserId  (optional)
   * @param fileId  (optional)
   * @param fileName  (optional)
   * @param imageFile  (optional)
   * @param imageSignature  (optional)
   * @param imageUrl  (optional)
   * @param uploadType  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response adImageUpload(String accessToken, String advertiserId, String fileId, String fileName, File imageFile, String imageSignature, String imageUrl, String uploadType) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling adImageUpload");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/file/image/ad/upload/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (advertiserId != null)
      localVarFormParams.put("advertiser_id", advertiserId);
    if (fileId != null)
      localVarFormParams.put("file_id", fileId);
    if (fileName != null)
      localVarFormParams.put("file_name", fileName);
    if (imageFile != null)
      localVarFormParams.put("image_file", imageFile);
    if (imageSignature != null)
      localVarFormParams.put("image_signature", imageSignature);
    if (imageUrl != null)
      localVarFormParams.put("image_url", imageUrl);
    if (uploadType != null)
      localVarFormParams.put("upload_type", uploadType);

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
   * The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050161973250) from the Asset Library.
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param videoIds Video ID list. Up to 60 IDs per request. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response adVideoInfo(String advertiserId, List<String> videoIds, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling adVideoInfo");
    }
    // verify the required parameter 'videoIds' is set
    if (videoIds == null) {
      throw new ApiException(400, "Missing the required parameter 'videoIds' when calling adVideoInfo");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling adVideoInfo");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/file/video/ad/info/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "video_ids", videoIds));

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
   * The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.
   * 
   * @param advertiserId Video ID list. Up to 60 IDs per request. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param filtering Filters on the data. This parameter is an array of filter objects. (optional)
   * @param page Current page number. Default value: 1. Value range: ≥ 1. (optional)
   * @param pageSize Page size. Default value: 20. Value range: 1-100. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response adVideoSearch(String advertiserId, String accessToken, FilteringVideoAdSearch filtering, Integer page, Integer pageSize) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling adVideoSearch");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling adVideoSearch");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/file/video/ad/search/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
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
   * The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param advertiserId  (optional)
   * @param autoBindEnabled  (optional)
   * @param autoFixEnabled  (optional)
   * @param fileId  (optional)
   * @param fileName  (optional)
   * @param flawDetect  (optional)
   * @param isThirdParty  (optional)
   * @param uploadType  (optional)
   * @param videoFile  (optional)
   * @param videoId  (optional)
   * @param videoSignature  (optional)
   * @param videoUrl  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response adVideoUpload(String accessToken, String advertiserId, Boolean autoBindEnabled, Boolean autoFixEnabled, String fileId, String fileName, Boolean flawDetect, Boolean isThirdParty, String uploadType, File videoFile, String videoId, String videoSignature, String videoUrl) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling adVideoUpload");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/file/video/ad/upload/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accessToken != null)
      localVarHeaderParams.put("Access-Token", apiClient.parameterToString(accessToken));
    if (advertiserId != null)
      localVarFormParams.put("advertiser_id", advertiserId);
    if (autoBindEnabled != null)
      localVarFormParams.put("auto_bind_enabled", autoBindEnabled);
    if (autoFixEnabled != null)
      localVarFormParams.put("auto_fix_enabled", autoFixEnabled);
    if (fileId != null)
      localVarFormParams.put("file_id", fileId);
    if (fileName != null)
      localVarFormParams.put("file_name", fileName);
    if (flawDetect != null)
      localVarFormParams.put("flaw_detect", flawDetect);
    if (isThirdParty != null)
      localVarFormParams.put("is_third_party", isThirdParty);
    if (uploadType != null)
      localVarFormParams.put("upload_type", uploadType);
    if (videoFile != null)
      localVarFormParams.put("video_file", videoFile);
    if (videoId != null)
      localVarFormParams.put("video_id", videoId);
    if (videoSignature != null)
      localVarFormParams.put("video_signature", videoSignature);
    if (videoUrl != null)
      localVarFormParams.put("video_url", videoUrl);

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
   * Get image information. [File Image Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740051721711618)
   * 
   * @param advertiserId  (required)
   * @param imageIds  (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response fileImageAdInfo(String advertiserId, List<String> imageIds, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling fileImageAdInfo");
    }
    // verify the required parameter 'imageIds' is set
    if (imageIds == null) {
      throw new ApiException(400, "Missing the required parameter 'imageIds' when calling fileImageAdInfo");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling fileImageAdInfo");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/file/image/ad/info/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "image_ids", imageIds));

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
