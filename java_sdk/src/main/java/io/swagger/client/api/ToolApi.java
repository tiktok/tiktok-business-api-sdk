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

import business_api_client.BidRecommendBody;
import business_api_client.InlineResponse200;
import business_api_client.TargetingInfoBody;
import business_api_client.TargetingSearchBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2025-03-21T10:49:20.864324-07:00[America/Los_Angeles]")public class ToolApi {
  private ApiClient apiClient;

  public ToolApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ToolApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get available locations by advertiser ID [Search Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1773644763581441)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param language The language you want the returned region name to be translated into. Default value: en Currently, we only support zh, fr, es, ko, vi, en, hi, it, tr, ru, ja, id, de, ms, ar, and th Note: If you do not pass in one of the supported values above, it will return as the default en. (optional, default to en)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response searchRegion(String advertiserId, String accessToken, String language) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling searchRegion");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling searchRegion");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/search/region/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));

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
   * Get action categories [Tool action](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737166752522241)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param specialIndustries Ad categories. Enum values:&#x60;HOUSING&#x60;: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. &#x60;EMPLOYMENT&#x60;: Ads for job offers, internship, professional certification programs or other related opportunities. &#x60;CREDIT&#x60;: Ads for credit card offers, auto loans, long-term financing or other related opportunities.Note: This field is only supported for advertisers who are registered in America or Canada (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolActionCategory(String advertiserId, String accessToken, List<String> specialIndustries) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolActionCategory");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolActionCategory");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/action_category/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "special_industries", specialIndustries));

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
   * Get a suggested bid [Tool Bid Recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737107845597186)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolBidRecommend(String accessToken, BidRecommendBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolBidRecommend");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/bid/recommend/";

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
   * Get the authorization status of a Brand Safety partner [Tool Brand_safety Partner Authorize Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738456743621634)
   * 
   * @param partner Brand Safety post bid measurement partner. Enum values: Zefr. (required)
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolBrandSafetyPartnerAuthorizeStatus(String partner, String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'partner' is set
    if (partner == null) {
      throw new ApiException(400, "Missing the required parameter 'partner' when calling toolBrandSafetyPartnerAuthorizeStatus");
    }
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolBrandSafetyPartnerAuthorizeStatus");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolBrandSafetyPartnerAuthorizeStatus");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/brand_safety/partner/authorize/status/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "partner", partner));
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
   * Get carriers [Tool carrier](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737168013095938)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolCarrier(String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolCarrier");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolCarrier");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/carrier/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Get available contextual tags [Tool Contextual_tag Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747118654465)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param objectiveType Advertising objective. Only supports REACH, VIDEO_VIEWS, RF_REACH. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param regionCodes Country or region codes. (optional)
   * @param brandSafetyType Brand safety type. Default value: STANDARD_INVENTORY. Enum values: EXPANDED_INVENTORY: Use TikTok&#x27;s brand safety solution. Expanded inventory means that your ads will appear next to content where most inappropriate content has been removed, and may contain some mature themes. In the next API version, EXPANDED_INVENTORY will replace NO_BRAND_SAFETY and will be the default brand safety option. STANDARD_INVENTORY: Use TikTok&#x27;s brand safety solution. Standard inventory means that ads will appear next to content that is appropriate for most brands. LIMITED_INVENTORY: Use TikTok&#x27;s brand safety solution. Limited inventory means that your ads will not appear next to content that contains mature themes. Note: Pre-bid first-party Brand Safety solutions for APP_PROMOTION, WEB_CONVERSIONS, TRAFFIC, LEAD_GENERATION objectives in Auction ads, and pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative. See Brand safety to learn about the supported advertising objectives for pre-bid Brand Safety filtering. (optional)
   * @param rfCampaignType Note: When objective_type is specified as RF_REACH, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Do not pass in this field when objective_type is not specified as RF_REACH. Enum values: STANDARD (Reach &amp; Frequency campaign), PULSE（TikTok Pulse campaign） (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolContextualTagGet(String advertiserId, String objectiveType, String accessToken, List<String> regionCodes, String brandSafetyType, String rfCampaignType) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolContextualTagGet");
    }
    // verify the required parameter 'objectiveType' is set
    if (objectiveType == null) {
      throw new ApiException(400, "Missing the required parameter 'objectiveType' when calling toolContextualTagGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolContextualTagGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/contextual_tag/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objective_type", objectiveType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "region_codes", regionCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "brand_safety_type", brandSafetyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rf_campaign_type", rfCampaignType));

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
   * Get details of contextual tags [Tool Contextual_tag Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1747747180830722)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param contextualTagIds Contextual tag IDs. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolContextualTagInfo(String advertiserId, List<String> contextualTagIds, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolContextualTagInfo");
    }
    // verify the required parameter 'contextualTagIds' is set
    if (contextualTagIds == null) {
      throw new ApiException(400, "Missing the required parameter 'contextualTagIds' when calling toolContextualTagInfo");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolContextualTagInfo");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/contextual_tag/info/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "contextual_tag_ids", contextualTagIds));

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
   * Get device models [Tool device model](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737172880570369)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolDeviceModel(String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolDeviceModel");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolDeviceModel");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/device_model/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Get targeting hashtags by ID [Tool Hashtag Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736280889167874)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param keywordIds List of keyword IDs (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolHashtagGet(String advertiserId, List<String> keywordIds, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolHashtagGet");
    }
    // verify the required parameter 'keywordIds' is set
    if (keywordIds == null) {
      throw new ApiException(400, "Missing the required parameter 'keywordIds' when calling toolHashtagGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolHashtagGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/hashtag/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "keyword_ids", keywordIds));

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
   * Search for targeting hashtags [Tool Hashtag Recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736271339521025)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param keywords Keywords that you want to get recommended hashtags for. If you specify multiple unrelated keywords and set operator to AND, it is possible that no recommended hashtags are returned. Max size: 10. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param operator The operator to be used between the keywords. Enum values: AND: Recommended hashtags will be generated based on all the keywords specified in keywords. OR: Recommended hashtags will be generated separately for each individual keyword in keywords. Default value: AND. (optional, default to AND)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolHashtagRecommend(String advertiserId, List<String> keywords, String accessToken, String operator) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolHashtagRecommend");
    }
    // verify the required parameter 'keywords' is set
    if (keywords == null) {
      throw new ApiException(400, "Missing the required parameter 'keywords' when calling toolHashtagRecommend");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolHashtagRecommend");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/hashtag/recommend/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "keywords", keywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operator", operator));

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
   * Get interest categories [Tool Interest category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174348712961)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param version Version of interest category. Enum values:&#x60;1&#x60;(&#x60;interest_category&#x60;), &#x60;2&#x60; (&#x60;interest_category_v2&#x60;)。Default: &#x60;2&#x60; (optional)
   * @param placements The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). The interest categories available for different placements may be different, and the field only takes effect when &#x60;version&#x60; &#x3D; &#x60;2&#x60;. (optional)
   * @param specialIndustries Defines ad categories. Enum values:&#x60;HOUSING&#x60;: Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities. &#x60;EMPLOYMENT&#x60;: Ads for job offers, internship, professional certification programs or other related opportunities. &#x60;CREDIT&#x60;: Ads for credit card offers, auto loans, long-term financing or other related opportunities. Note: This field is only supported for advertisers who are registered in America or Canada (optional)
   * @param language Category name language in repsonse. Default value: &#x60;en&#x60;. Supported languages: &#x60;en&#x60;, &#x60; zh&#x60;, &#x60; ja&#x60;, &#x60; de&#x60;, &#x60; es&#x60;, &#x60; fr&#x60;, &#x60; id&#x60;, &#x60; it&#x60;, &#x60; ko&#x60;, &#x60; ru&#x60;, &#x60; th&#x60;, &#x60; tr&#x60;, &#x60; vi&#x60;, &#x60; ar&#x60;, &#x60; pt&#x60;, &#x60; ms&#x60;.For details, see [Enumeration - Language Code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolInterestCategory(String advertiserId, String accessToken, Integer version, List<String> placements, List<String> specialIndustries, String language) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolInterestCategory");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolInterestCategory");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/interest_category/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "placements", placements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "special_industries", specialIndustries));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));

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
   * Get additional interest categories by ID [Tool Interest_keyword Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1763590894544897)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param filtering Filtering conditions. (optional)
   * @param keywordQuery Information of the additional interest category you want to get. Max size &#x3D; 50. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolInterestKeywordGet(String advertiserId, String accessToken, Object filtering, List<Object> keywordQuery) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolInterestKeywordGet");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolInterestKeywordGet");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/interest_keyword/get/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filtering", filtering));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "keyword_query", keywordQuery));

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
   * Get interest keywords [Tool kyword recommend](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737180852720642)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param keyword Seed keyword that you use to get recommended keywords. You can specify only one seed keyword (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param language Keyword language. Default value: &#x60;en&#x60;. Note that target audience languages are not limited by keyword languages. You can use English keywords to target audience that do not speak English. Supported languages: &#x60;fr&#x60;, &#x60;id&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;ms&#x60;, &#x60;ar&#x60;, &#x60;vi&#x60;, &#x60;en&#x60;, &#x60;ru&#x60;, &#x60;es&#x60;, &#x60;th&#x60;, &#x60;tr&#x60;, &#x60;hi&#x60;, &#x60;zh&#x60;, &#x60;de&#x60;, &#x60;ko&#x60; (optional)
   * @param limit Number of recommended keywords you want to get. Default value: 50. Value range: 1-50 (optional)
   * @param mode Search mode. Enum values: &#x60;FUZZ_MATCH&#x60;, &#x60;SEMANTIC_RECOMMEND&#x60;. Default value: &#x60;FUZZ_MATCH&#x60; (optional)
   * @param audienceType Audience type. Enum values: &#x60;GENERAL_INTEREST&#x60;: General interest. The audiences have a general, long-term interest in a video category. &#x60;PURCHASE_INTENTION&#x60;: Purchase intent. The audiences recent behavior suggests they may buy something related to a content category. Default value: &#x60;GENERAL_INTEREST&#x60; (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolInterestKeywordRecommend(String advertiserId, String keyword, String accessToken, String language, Integer limit, String mode, String audienceType) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolInterestKeywordRecommend");
    }
    // verify the required parameter 'keyword' is set
    if (keyword == null) {
      throw new ApiException(400, "Missing the required parameter 'keyword' when calling toolInterestKeywordRecommend");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolInterestKeywordRecommend");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/interest_keyword/recommend/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyword", keyword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mode", mode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "audience_type", audienceType));

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
   * Get languages [Tool Language](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737188554152962)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolLanguage(String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolLanguage");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolLanguage");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/language/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Get a TikTok in-app link [Tool Open_url](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738457335681026)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param url Open URL that you want to get the internal link for. (required)
   * @param urlType Type of the open TikTok URL. Enum: USER_PROFILE VIDEO: Video detail page HASHTAG_CHALLENGE: Hashtag challenge page MUSIC: Music page STICKER: Sticker (special effect) page STICKER_SHOOTER: Shoot a video with a sticker (special effect). (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolOpenUrl(String advertiserId, String url, String urlType, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolOpenUrl");
    }
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling toolOpenUrl");
    }
    // verify the required parameter 'urlType' is set
    if (urlType == null) {
      throw new ApiException(400, "Missing the required parameter 'urlType' when calling toolOpenUrl");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolOpenUrl");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/open_url/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url_type", urlType));

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
   * Get OS versions [Tool Os_version](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738308662898689)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param osType OS type. Enum values: ANDROID,IOS. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolOsVersion(String advertiserId, String osType, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolOsVersion");
    }
    // verify the required parameter 'osType' is set
    if (osType == null) {
      throw new ApiException(400, "Missing the required parameter 'osType' when calling toolOsVersion");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolOsVersion");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/os_version/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "os_type", osType));

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
   * Get region calling codes and region codes for phone numbers [Tool Phone_region_code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1774488637039618)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolPhoneRegionCode(String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolPhoneRegionCode");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolPhoneRegionCode");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/phone_region_code/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Get available locations [Tool Region](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737189539571713)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param placements The apps where you want to deliver your ads. For enum values, see [Enumeration - Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) (required)
   * @param objectiveType Your objective type. For enum values and descriptions, see [Objectives](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737585562434561) (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param promotionTargetType Valid when &#x60;objective_type&#x60; is &#x60;LEAD_GENERATION&#x60;. The promotion type for Lead Generation objective. Enum values: &#x60;INSTANT_PAGE&#x60;：Instant Form. To create a fast-loading in-app TikTok Instant Form to collect more leads. &#x60;EXTERNAL_WEBSITE&#x60;：Website Form. To use a landing page that has the Website Form or the TikTok Instant Page that redirects to the website with the Website Form to collect more leads.Note: The field is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative (optional)
   * @param operatingSystem Operating systems that you want to target. Enum values: &#x60;ANDROID&#x60;, &#x60;IOS&#x60; (optional)
   * @param brandSafetyType Brand safety type. Valid only when &#x60;placements&#x60; is set as &#x60;PLACEMENT_TIKTOK&#x60;. Default value: &#x60;NO_BRAND_SAFETY&#x60; (optional)
   * @param brandSafetyPartner Brand safety partner. Required when &#x60;brand_safety_type&#x60; is &#x60;THIRD_PARTY&#x60;, and &#x60;placements&#x60; needs to be set as &#x60;PLACEMENT_TIKTOK&#x60;. Enum values: &#x60;IAS&#x60;, &#x60;OPEN_SLATE&#x60;.Note: Pre-bid third-party brand safety solutions are currently allowlist-only features. If you would like to access them, please contact your TikTok representative (optional)
   * @param levelRange Location level you want to get. Enum values: &#x60;ALL&#x60;: all levels&#x60;TO_COUNTRY&#x60;: only country or region level &#x60;TO_PROVINCE&#x60;: country and province level; DMA and Metropolitan are at province level.&#x60;TO_CITY&#x60;: country, province, and city levels&#x60;TO_DISTRICT&#x60;: country, province, city, and district levels. (optional)
   * @param rfCampaignType When &#x60;objective_type&#x60; is specified as &#x60;RF_REACH&#x60;, use this field to set the campaign as a TikTok Pulse campaign, then you can get available premium contextual tags. Enum values: &#x60;STANDARD&#x60; (Reach &amp; Frequency campaign), &#x60;PULSE&#x60; (TikTok Pulse campaign). If you set this field as &#x60;PULSE&#x60;, only one location ID (&#x60;location_id&#x60;) will be returned.Note: Do not pass in this field when &#x60;objective_type&#x60; is not specified as &#x60;RF_REACH&#x60;. You need to pass the &#x60;location_id&#x60; value returned in this endpoint to &#x60;location_ids&#x60; when you use [/adgroup/rf/create/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738235338194945) to create a TikTok Pulse ad group. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolRegion(String advertiserId, List<String> placements, String objectiveType, String accessToken, String promotionTargetType, String operatingSystem, String brandSafetyType, String brandSafetyPartner, String levelRange, String rfCampaignType) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolRegion");
    }
    // verify the required parameter 'placements' is set
    if (placements == null) {
      throw new ApiException(400, "Missing the required parameter 'placements' when calling toolRegion");
    }
    // verify the required parameter 'objectiveType' is set
    if (objectiveType == null) {
      throw new ApiException(400, "Missing the required parameter 'objectiveType' when calling toolRegion");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolRegion");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/region/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "placements", placements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objective_type", objectiveType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "promotion_target_type", promotionTargetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operating_system", operatingSystem));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "brand_safety_type", brandSafetyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "brand_safety_partner", brandSafetyPartner));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level_range", levelRange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rf_campaign_type", rfCampaignType));

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
   * Obtain details about location targeting tags by ID [Tool Targeting Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1761237001980929)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolTargetingInfo(String accessToken, TargetingInfoBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolTargetingInfo");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/targeting/info/";

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
   * Get internet service providers [Tool Targeting List](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1762962378261506)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param locationIds IDs of the locations that you want to get the supported ISP IDs for. Max size: 1000. To find out the list of location IDs, see Location IDs. Note: You need to pass location IDs at the country or region level. To get the available locations and corresponding IDs based on your placement and objective, use the /tool/region/ and the returned level for location IDs at the country or region level will be COUNTRY. (required)
   * @param scene The targeting type that the targeting tags are used for. The allowed enum values: ISP ( Internet Service Provider targeting). (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolTargetingList(String advertiserId, List<String> locationIds, String scene, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolTargetingList");
    }
    // verify the required parameter 'locationIds' is set
    if (locationIds == null) {
      throw new ApiException(400, "Missing the required parameter 'locationIds' when calling toolTargetingList");
    }
    // verify the required parameter 'scene' is set
    if (scene == null) {
      throw new ApiException(400, "Missing the required parameter 'scene' when calling toolTargetingList");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolTargetingList");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/targeting/list/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "location_ids", locationIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scene", scene));

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
   * Search for location targeting tags [Tool Targeting Search](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1761236883355649)
   * 
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param body  (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolTargetingSearch(String accessToken, TargetingSearchBody body) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = body;
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolTargetingSearch");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/targeting/search/";

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
   * Get time zones [Tool Timezone](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738455961470977)
   * 
   * @param advertiserId Advertiser ID (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolTimezone(String advertiserId, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolTimezone");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolTimezone");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/timezone/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * Get the verification results of a URL [Tool Url_validate](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1774487686007810)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param url The URL that you want to get verification results for. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolUrlValidate(String advertiserId, String url, String accessToken) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolUrlValidate");
    }
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling toolUrlValidate");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolUrlValidate");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/url_validate/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));

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
   * Check Value-Based Optimization eligibility [Tool Vbo_status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1770016073586753)
   * 
   * @param advertiserId Advertiser ID. (required)
   * @param objectiveType Advertising objective. Set this field to APP_PROMOTION, WEB_CONVERSIONS, or PRODUCT_SALES. When you set this field to any other objective, vo_status will be NOT_SUPPORT because these objectives are not supported for VBO. For enum values and descriptions, see Objectives. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id. (required)
   * @param promotionType Promotion type and you can decide where you&#x27;d like to promote your products using this field. For enum values, see Enumeration - Promotion Type. Note: When objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING, do not pass in pixel_id or app_id. Otherwise, pass in either pixel_id or app_id. (required)
   * @param placements The apps where you want to deliver your ads. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported. (required)
   * @param accessToken Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). (required)
   * @param pixelId Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. Pixel ID. When you pass in this field, you need to specify optimization_event at the same time. To get Pixel IDs, use the /pixel/list/ endpoint. (optional)
   * @param appId Not supported when objective_type is set to PRODUCT_SALES and promotion_type is set to LIVE_SHOPPING or VIDEO_SHOPPING. Otherwise, pass in either pixel_id or app_id. The Application ID of the promoted app. To get App IDs, use the /app/list/ endpoint. (optional)
   * @param optimizationEvent Required when pixel_id is passed. Ignored when app_id is passed. Conversion event for the ad group. See Conversion events for more. (optional)
   * @param ios14QuotaType Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. We recommend using campaign_type alone when you specify an iOS 14 Dedicated Campaign. campaign_type as REGULAR_CAMPAIGN or ios14_quota_type as UNOCCUPIED both indicate a non-iOS 14 Dedicated Campaign. campaign_type as IOS14_CAMPAIGN or ios14_quota_type as OCCUPIED both indicate an iOS 14 Dedicated Campaign. Whether the campaign will be counted towards the iOS 14 Dedicated Campaign quota. Enum values: OCCUPIED: The campaign is an iOS 14 Dedicated Campaign. UNOCCUPIED: The campaign is not an iOS 14 Dedicated Campaign. (optional)
   * @param appPromotionType Required when objective_type is APP_PROMOTION. App promotion type. Enum values: APP_INSTALL: Get new users to install your app. APP_RETARGETING: Re-engage existing users to take action in your app. Note: Only the enum value APP_INSTALL can be used in an iOS14 Dedicated Campaign. (optional)
   * @param storeId Valid only when objective_type is PRODUCT_SALES. ID of the TikTok Shop. Note: To get the TikTok Shop ID, you can use /bc/asset/get/: When in the response asset_type is TIKTOK_SHOP, the returned asset_id is the TikTok Shop ID. (optional)
   * @param campaignAppProfilePageState Whether to use App Profile Page at the campaign level to optimize delivery. Enum values: ON, OFF. You can use the field only when objective_type is APP_PROMOTION and your campaign is an iOS14 Dedicated Campaign (ios14_quota_type &#x3D;OCCUPIED). Otherwise, an error will occur. (optional)
   * @param isSmartPerformanceCampaign Whether the campaign is a Smart+ Campaign or not. Enum values: true, false. (optional)
   * @param budgetOptimizeOn Whether to enable Campaign Budget Optimization (CBO). Enum values: true, false. For details about CBO, see Campaign Budget Optimization. (optional, default to false)
   * @param campaignType Do not pass campaign_type and ios14_quota_type at the same time. If both fields are passed, ios14_quota_type will be ignored. Campaign type. Enums values: REGULAR_CAMPAIGN: non-iOS 14 Dedicated Campaign. IOS14_CAMPAIGN: iOS 14 Dedicated Campaign. The value IOS14_CAMPAIGN can only be used when: objective_type is PRODUCT_SALES. objective_type is APP_PROMOTION and app_promotion_type is APP_INSTALL. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public Response toolVboStatus(String advertiserId, String objectiveType, String promotionType, List<String> placements, String accessToken, String pixelId, String appId, String optimizationEvent, String ios14QuotaType, String appPromotionType, String storeId, String campaignAppProfilePageState, Boolean isSmartPerformanceCampaign, Boolean budgetOptimizeOn, String campaignType) throws ApiException, SDKException, SDKExceptionForEvent {
    Object localVarPostBody = null;
    // verify the required parameter 'advertiserId' is set
    if (advertiserId == null) {
      throw new ApiException(400, "Missing the required parameter 'advertiserId' when calling toolVboStatus");
    }
    // verify the required parameter 'objectiveType' is set
    if (objectiveType == null) {
      throw new ApiException(400, "Missing the required parameter 'objectiveType' when calling toolVboStatus");
    }
    // verify the required parameter 'promotionType' is set
    if (promotionType == null) {
      throw new ApiException(400, "Missing the required parameter 'promotionType' when calling toolVboStatus");
    }
    // verify the required parameter 'placements' is set
    if (placements == null) {
      throw new ApiException(400, "Missing the required parameter 'placements' when calling toolVboStatus");
    }
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling toolVboStatus");
    }
    // create path and map variables
    String localVarPath = "/open_api/v1.3/tool/vbo_status/";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "advertiser_id", advertiserId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "objective_type", objectiveType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "promotion_type", promotionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "placements", placements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pixel_id", pixelId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "optimization_event", optimizationEvent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ios14_quota_type", ios14QuotaType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_promotion_type", appPromotionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "store_id", storeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "campaign_app_profile_page_state", campaignAppProfilePageState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_smart_performance_campaign", isSmartPerformanceCampaign));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "budget_optimize_on", budgetOptimizeOn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "campaign_type", campaignType));

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
