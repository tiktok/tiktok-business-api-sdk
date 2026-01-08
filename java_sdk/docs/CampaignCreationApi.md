# CampaignCreationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignCreate**](CampaignCreationApi.md#campaignCreate) | **POST** /open_api/v1.3/campaign/create/ | Create campaign. [Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739318962329602)
[**campaignGet**](CampaignCreationApi.md#campaignGet) | **GET** /open_api/v1.3/campaign/get/ | Get campaigns. [Campaign Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739315828649986)
[**campaignGmvMaxCreate**](CampaignCreationApi.md#campaignGmvMaxCreate) | **POST** /open_api/v1.3/campaign/gmv_max/create/ | Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000988713089)
[**campaignGmvMaxInfo**](CampaignCreationApi.md#campaignGmvMaxInfo) | **GET** /open_api/v1.3/campaign/gmv_max/info/ | Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000968821762)
[**campaignGmvMaxSessionCreate**](CampaignCreationApi.md#campaignGmvMaxSessionCreate) | **POST** /open_api/v1.3/campaign/gmv_max/session/create/ | Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246967275522)
[**campaignGmvMaxSessionDelete**](CampaignCreationApi.md#campaignGmvMaxSessionDelete) | **POST** /open_api/v1.3/campaign/gmv_max/session/delete/ | Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246983475217)
[**campaignGmvMaxSessionGet**](CampaignCreationApi.md#campaignGmvMaxSessionGet) | **GET** /open_api/v1.3/campaign/gmv_max/session/get/ | Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247031331842)
[**campaignGmvMaxSessionList**](CampaignCreationApi.md#campaignGmvMaxSessionList) | **GET** /open_api/v1.3/campaign/gmv_max/session/list/ | Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246996436162)
[**campaignGmvMaxSessionUpdate**](CampaignCreationApi.md#campaignGmvMaxSessionUpdate) | **POST** /open_api/v1.3/campaign/gmv_max/session/update/ | Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247009119233)
[**campaignGmvMaxUpdate**](CampaignCreationApi.md#campaignGmvMaxUpdate) | **POST** /open_api/v1.3/campaign/gmv_max/update/ | Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001009002497)
[**campaignStatusUpdate**](CampaignCreationApi.md#campaignStatusUpdate) | **POST** /open_api/v1.3/campaign/status/update/ | Update campaign status. [Campaign Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739320994354178)
[**campaignUpdate**](CampaignCreationApi.md#campaignUpdate) | **POST** /open_api/v1.3/campaign/update/ | Update campaign. [Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739320422086657)
[**gmvMaxBidRecommend**](CampaignCreationApi.md#gmvMaxBidRecommend) | **GET** /open_api/v1.3/gmv_max/bid/recommend/ | Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001024720897)
[**gmvMaxCustomAnchorVideoListGet**](CampaignCreationApi.md#gmvMaxCustomAnchorVideoListGet) | **GET** /open_api/v1.3/gmv_max/custom_anchor_video_list/get/ | Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1830215925061633)
[**gmvMaxOccupiedCustomShopAdsList**](CampaignCreationApi.md#gmvMaxOccupiedCustomShopAdsList) | **GET** /open_api/v1.3/gmv_max/occupied_custom_shop_ads/list/ | Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001136924674)
[**smartPlusCampaignCreate**](CampaignCreationApi.md#smartPlusCampaignCreate) | **POST** /open_api/v1.3/smart_plus/campaign/create/ | Create a new campaign [Smart Plus Campaign Create]
[**smartPlusCampaignGet**](CampaignCreationApi.md#smartPlusCampaignGet) | **GET** /open_api/v1.3/smart_plus/campaign/get/ | Retrieve campaign details [Smart Plus Campaign Get]
[**smartPlusCampaignStatusUpdate**](CampaignCreationApi.md#smartPlusCampaignStatusUpdate) | **POST** /open_api/v1.3/smart_plus/campaign/status/update/ | Update campaign status [Smart Plus Campaign Status Update]
[**smartPlusCampaignUpdate**](CampaignCreationApi.md#smartPlusCampaignUpdate) | **POST** /open_api/v1.3/smart_plus/campaign/update/ | Update an existing campaign [Smart Plus Campaign Update]

<a name="campaignCreate"></a>
# **campaignCreate**
> Response campaignCreate(accessToken, body)

Create campaign. [Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739318962329602)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CampaignCreateBody body = new CampaignCreateBody(); // CampaignCreateBody | 
try {
    Response result = apiInstance.campaignCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CampaignCreateBody**](CampaignCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGet"></a>
# **campaignGet**
> Response campaignGet(advertiserId, accessToken, filtering, page, pageSize, fields, excludeFieldTypesInResponse)

Get campaigns. [Campaign Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739315828649986)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringCampaignGet filtering = new FilteringCampaignGet(); // FilteringCampaignGet | 
Integer page = 1; // Integer | 
Integer pageSize = 10; // Integer | 
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
List<String> excludeFieldTypesInResponse = Arrays.asList("excludeFieldTypesInResponse_example"); // List<String> | 
try {
    Response result = apiInstance.campaignGet(advertiserId, accessToken, filtering, page, pageSize, fields, excludeFieldTypesInResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringCampaignGet**](FilteringCampaignGet.md)|  | [optional]
 **page** | **Integer**|  | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**|  | [optional] [default to 10] [enum: ]
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **excludeFieldTypesInResponse** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxCreate"></a>
# **campaignGmvMaxCreate**
> Response campaignGmvMaxCreate(accessToken, body)

Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000988713089)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
GmvMaxCreateBody body = new GmvMaxCreateBody(); // GmvMaxCreateBody | 
try {
    Response result = apiInstance.campaignGmvMaxCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**GmvMaxCreateBody**](GmvMaxCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxInfo"></a>
# **campaignGmvMaxInfo**
> Response campaignGmvMaxInfo(advertiserId, campaignId, accessToken)

Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000968821762)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | 
String campaignId = "campaignId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.campaignGmvMaxInfo(advertiserId, campaignId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **campaignId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxSessionCreate"></a>
# **campaignGmvMaxSessionCreate**
> Response campaignGmvMaxSessionCreate(accessToken, body)

Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246967275522)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SessionCreateBody body = new SessionCreateBody(); // SessionCreateBody | 
try {
    Response result = apiInstance.campaignGmvMaxSessionCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxSessionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SessionCreateBody**](SessionCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxSessionDelete"></a>
# **campaignGmvMaxSessionDelete**
> Response campaignGmvMaxSessionDelete(accessToken, body)

Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246983475217)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SessionDeleteBody body = new SessionDeleteBody(); // SessionDeleteBody | 
try {
    Response result = apiInstance.campaignGmvMaxSessionDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxSessionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SessionDeleteBody**](SessionDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxSessionGet"></a>
# **campaignGmvMaxSessionGet**
> Response campaignGmvMaxSessionGet(advertiserId, sessionIds, accessToken)

Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247031331842)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> sessionIds = Arrays.asList("sessionIds_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.campaignGmvMaxSessionGet(advertiserId, sessionIds, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxSessionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **sessionIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxSessionList"></a>
# **campaignGmvMaxSessionList**
> Response campaignGmvMaxSessionList(campaignId, advertiserId, accessToken)

Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246996436162)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String campaignId = "campaignId_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.campaignGmvMaxSessionList(campaignId, advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxSessionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxSessionUpdate"></a>
# **campaignGmvMaxSessionUpdate**
> Response campaignGmvMaxSessionUpdate(accessToken, body)

Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247009119233)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SessionUpdateBody body = new SessionUpdateBody(); // SessionUpdateBody | 
try {
    Response result = apiInstance.campaignGmvMaxSessionUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxSessionUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SessionUpdateBody**](SessionUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxUpdate"></a>
# **campaignGmvMaxUpdate**
> Response campaignGmvMaxUpdate(accessToken, body)

Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001009002497)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
GmvMaxUpdateBody body = new GmvMaxUpdateBody(); // GmvMaxUpdateBody | 
try {
    Response result = apiInstance.campaignGmvMaxUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGmvMaxUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**GmvMaxUpdateBody**](GmvMaxUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignStatusUpdate"></a>
# **campaignStatusUpdate**
> Response campaignStatusUpdate(accessToken, body)

Update campaign status. [Campaign Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739320994354178)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CampaignStatusUpdateBody body = new CampaignStatusUpdateBody(); // CampaignStatusUpdateBody | 
try {
    Response result = apiInstance.campaignStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CampaignStatusUpdateBody**](CampaignStatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignUpdate"></a>
# **campaignUpdate**
> Response campaignUpdate(accessToken, body)

Update campaign. [Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739320422086657)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CampaignUpdateBody body = new CampaignUpdateBody(); // CampaignUpdateBody | 
try {
    Response result = apiInstance.campaignUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CampaignUpdateBody**](CampaignUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gmvMaxBidRecommend"></a>
# **gmvMaxBidRecommend**
> Response gmvMaxBidRecommend(advertiserId, storeId, shoppingAdsType, optimizationGoal, accessToken, itemGroupIds, identityId)

Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001024720897)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | 
String storeId = "storeId_example"; // String | 
String shoppingAdsType = "shoppingAdsType_example"; // String | 
String optimizationGoal = "optimizationGoal_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> itemGroupIds = Arrays.asList("itemGroupIds_example"); // List<String> | 
String identityId = "identityId_example"; // String | 
try {
    Response result = apiInstance.gmvMaxBidRecommend(advertiserId, storeId, shoppingAdsType, optimizationGoal, accessToken, itemGroupIds, identityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#gmvMaxBidRecommend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **storeId** | **String**|  |[required] 
 **shoppingAdsType** | **String**|  |[required] 
 **optimizationGoal** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **itemGroupIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **identityId** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxCustomAnchorVideoListGet"></a>
# **gmvMaxCustomAnchorVideoListGet**
> Response gmvMaxCustomAnchorVideoListGet(advertiserId, campaignCustomAnchorVideoId, customAnchorVideoList, accessToken)

Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1830215925061633)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
Long advertiserId = 789L; // Long | 
Long campaignCustomAnchorVideoId = 789L; // Long | 
List<CustomAnchorVideoList> customAnchorVideoList = Arrays.asList(new CustomAnchorVideoList()); // List<CustomAnchorVideoList> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.gmvMaxCustomAnchorVideoListGet(advertiserId, campaignCustomAnchorVideoId, customAnchorVideoList, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#gmvMaxCustomAnchorVideoListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **Long**|  |[required] 
 **campaignCustomAnchorVideoId** | **Long**|  |[required] 
 **customAnchorVideoList** | [**List&lt;CustomAnchorVideoList&gt;**](CustomAnchorVideoList.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxOccupiedCustomShopAdsList"></a>
# **gmvMaxOccupiedCustomShopAdsList**
> Response gmvMaxOccupiedCustomShopAdsList(advertiserId, storeId, assetIds, occupiedAssetType, accessToken)

Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001136924674)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | 
String storeId = "storeId_example"; // String | 
List<String> assetIds = Arrays.asList("assetIds_example"); // List<String> | 
String occupiedAssetType = "occupiedAssetType_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.gmvMaxOccupiedCustomShopAdsList(advertiserId, storeId, assetIds, occupiedAssetType, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#gmvMaxOccupiedCustomShopAdsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **storeId** | **String**|  |[required] 
 **assetIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **occupiedAssetType** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusCampaignCreate"></a>
# **smartPlusCampaignCreate**
> Response smartPlusCampaignCreate(accessToken, body)

Create a new campaign [Smart Plus Campaign Create]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusCampaignCreateBody body = new SmartPlusCampaignCreateBody(); // SmartPlusCampaignCreateBody | 
try {
    Response result = apiInstance.smartPlusCampaignCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#smartPlusCampaignCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusCampaignCreateBody**](SmartPlusCampaignCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusCampaignGet"></a>
# **smartPlusCampaignGet**
> Response smartPlusCampaignGet(advertiserId, accessToken, fields, filtering, page, pageSize)

Retrieve campaign details [Smart Plus Campaign Get]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
FilteringSmartPlusCampaignGet filtering = new FilteringSmartPlusCampaignGet(); // FilteringSmartPlusCampaignGet | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.smartPlusCampaignGet(advertiserId, accessToken, fields, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#smartPlusCampaignGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **filtering** | [**FilteringSmartPlusCampaignGet**](FilteringSmartPlusCampaignGet.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: ]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusCampaignStatusUpdate"></a>
# **smartPlusCampaignStatusUpdate**
> Response smartPlusCampaignStatusUpdate(accessToken, body)

Update campaign status [Smart Plus Campaign Status Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusCampaignStatusUpdateBody body = new SmartPlusCampaignStatusUpdateBody(); // SmartPlusCampaignStatusUpdateBody | 
try {
    Response result = apiInstance.smartPlusCampaignStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#smartPlusCampaignStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusCampaignStatusUpdateBody**](SmartPlusCampaignStatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusCampaignUpdate"></a>
# **smartPlusCampaignUpdate**
> Response smartPlusCampaignUpdate(accessToken, body)

Update an existing campaign [Smart Plus Campaign Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusCampaignUpdateBody body = new SmartPlusCampaignUpdateBody(); // SmartPlusCampaignUpdateBody | 
try {
    Response result = apiInstance.smartPlusCampaignUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#smartPlusCampaignUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusCampaignUpdateBody**](SmartPlusCampaignUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

