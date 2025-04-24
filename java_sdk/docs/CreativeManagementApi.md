# CreativeManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creativeAssetDelete**](CreativeManagementApi.md#creativeAssetDelete) | **POST** /open_api/v1.3/creative/asset/delete/ | Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1797202997456897)
[**creativeAssetShare**](CreativeManagementApi.md#creativeAssetShare) | **POST** /open_api/v1.3/creative/asset/share/ | SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1773192725768193)
[**creativeImageEdit**](CreativeManagementApi.md#creativeImageEdit) | **POST** /open_api/v1.3/creative/image/edit/ | Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id&#x3D;1739067107903489)
[**creativePortfolioCreate**](CreativeManagementApi.md#creativePortfolioCreate) | **POST** /open_api/v1.3/creative/portfolio/create/ | Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739091950439426)
[**creativePortfolioGet**](CreativeManagementApi.md#creativePortfolioGet) | **GET** /open_api/v1.3/creative/portfolio/get/ | Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739092113671170)
[**creativePortfolioList**](CreativeManagementApi.md#creativePortfolioList) | **GET** /open_api/v1.3/creative/portfolio/list/ | Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id&#x3D;1766324010279938)
[**creativeShareableLinkCreate**](CreativeManagementApi.md#creativeShareableLinkCreate) | **POST** /open_api/v1.3/creative/shareable_link/create/ | 
[**creativeSmartTextGenerate**](CreativeManagementApi.md#creativeSmartTextGenerate) | **POST** /open_api/v1.3/creative/smart_text/generate/ | Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id&#x3D;1739084248002626)
[**discoveryDetail**](CreativeManagementApi.md#discoveryDetail) | **GET** /open_api/v1.3/discovery/detail/ | Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119047070721)
[**discoveryTrendingList**](CreativeManagementApi.md#discoveryTrendingList) | **GET** /open_api/v1.3/discovery/trending_list/ | Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119032526849)
[**playableDelete**](CreativeManagementApi.md#playableDelete) | **POST** /open_api/v1.3/playable/delete/ | Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1737733368940546)
[**playableGet**](CreativeManagementApi.md#playableGet) | **GET** /open_api/v1.3/playable/get/ | Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732758495234)
[**playableSave**](CreativeManagementApi.md#playableSave) | **POST** /open_api/v1.3/playable/save/ | Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732203851777)
[**playableUpload**](CreativeManagementApi.md#playableUpload) | **POST** /open_api/v1.3/playable/upload/ | You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1737730926765057)
[**playableValidate**](CreativeManagementApi.md#playableValidate) | **GET** /open_api/v1.3/playable/validate/ | Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732054892545)

<a name="creativeAssetDelete"></a>
# **creativeAssetDelete**
> Response creativeAssetDelete(accessToken, body)

Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1797202997456897)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CreativeAssetDeleteBody body = new CreativeAssetDeleteBody(); // CreativeAssetDeleteBody | 
try {
    Response result = apiInstance.creativeAssetDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativeAssetDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CreativeAssetDeleteBody**](CreativeAssetDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativeAssetShare"></a>
# **creativeAssetShare**
> Response creativeAssetShare(accessToken, body)

SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1773192725768193)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AssetShareBody body = new AssetShareBody(); // AssetShareBody | 
try {
    Response result = apiInstance.creativeAssetShare(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativeAssetShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AssetShareBody**](AssetShareBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativeImageEdit"></a>
# **creativeImageEdit**
> Response creativeImageEdit(accessToken, body)

Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id&#x3D;1739067107903489)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
ImageEditBody body = new ImageEditBody(); // ImageEditBody | 
try {
    Response result = apiInstance.creativeImageEdit(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativeImageEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**ImageEditBody**](ImageEditBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativePortfolioCreate"></a>
# **creativePortfolioCreate**
> Response creativePortfolioCreate(accessToken, body)

Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739091950439426)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PortfolioCreateBody body = new PortfolioCreateBody(); // PortfolioCreateBody | 
try {
    Response result = apiInstance.creativePortfolioCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativePortfolioCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PortfolioCreateBody**](PortfolioCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativePortfolioGet"></a>
# **creativePortfolioGet**
> Response creativePortfolioGet(advertiserId, creativePortfolioId, accessToken)

Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739092113671170)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String creativePortfolioId = "creativePortfolioId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.creativePortfolioGet(advertiserId, creativePortfolioId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativePortfolioGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **creativePortfolioId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="creativePortfolioList"></a>
# **creativePortfolioList**
> Response creativePortfolioList(advertiserId, accessToken, filtering, page, pageSize)

Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id&#x3D;1766324010279938)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringCreativePortfolioList filtering = new FilteringCreativePortfolioList(); // FilteringCreativePortfolioList | 
Long page = 1L; // Long | 
Long pageSize = 20L; // Long | 
try {
    Response result = apiInstance.creativePortfolioList(advertiserId, accessToken, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativePortfolioList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringCreativePortfolioList**](FilteringCreativePortfolioList.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1] [enum: ]
 **pageSize** | **Long**|  | [optional] [default to 20] [enum: ]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="creativeShareableLinkCreate"></a>
# **creativeShareableLinkCreate**
> Response creativeShareableLinkCreate(accessToken, body)



### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
ShareableLinkCreateBody body = new ShareableLinkCreateBody(); // ShareableLinkCreateBody | 
try {
    Response result = apiInstance.creativeShareableLinkCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativeShareableLinkCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**ShareableLinkCreateBody**](ShareableLinkCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativeSmartTextGenerate"></a>
# **creativeSmartTextGenerate**
> Response creativeSmartTextGenerate(accessToken, body)

Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id&#x3D;1739084248002626)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartTextGenerateBody body = new SmartTextGenerateBody(); // SmartTextGenerateBody | 
try {
    Response result = apiInstance.creativeSmartTextGenerate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#creativeSmartTextGenerate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartTextGenerateBody**](SmartTextGenerateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="discoveryDetail"></a>
# **discoveryDetail**
> Response discoveryDetail(hashtagId, discoveryType, countryCode, dateRange, advertiserId, accessToken)

Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119047070721)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String hashtagId = "hashtagId_example"; // String | 
String discoveryType = "discoveryType_example"; // String | 
String countryCode = "countryCode_example"; // String | 
String dateRange = "dateRange_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.discoveryDetail(hashtagId, discoveryType, countryCode, dateRange, advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#discoveryDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hashtagId** | **String**|  |[required] 
 **discoveryType** | **String**|  |[required] 
 **countryCode** | **String**|  |[required] 
 **dateRange** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="discoveryTrendingList"></a>
# **discoveryTrendingList**
> Response discoveryTrendingList(discoveryType, advertiserId, accessToken, countryCode, categoryName, dateRange)

Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119032526849)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String discoveryType = "discoveryType_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String countryCode = "US"; // String | 
String categoryName = "ALL"; // String | 
String dateRange = "7DAY"; // String | 
try {
    Response result = apiInstance.discoveryTrendingList(discoveryType, advertiserId, accessToken, countryCode, categoryName, dateRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#discoveryTrendingList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discoveryType** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **countryCode** | **String**|  | [optional] [default to US]
 **categoryName** | **String**|  | [optional] [default to ALL]
 **dateRange** | **String**|  | [optional] [default to 7DAY]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playableDelete"></a>
# **playableDelete**
> Response playableDelete(accessToken, body)

Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1737733368940546)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PlayableDeleteBody body = new PlayableDeleteBody(); // PlayableDeleteBody | 
try {
    Response result = apiInstance.playableDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#playableDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PlayableDeleteBody**](PlayableDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playableGet"></a>
# **playableGet**
> Response playableGet(advertiserId, accessToken, playableId, playableUrl, playableName, status, operationStatus, page, pageSize)

Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732758495234)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String playableId = "playableId_example"; // String | 
String playableUrl = "playableUrl_example"; // String | 
String playableName = "playableName_example"; // String | 
String status = "status_example"; // String | 
String operationStatus = "SAVED"; // String | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.playableGet(advertiserId, accessToken, playableId, playableUrl, playableName, status, operationStatus, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#playableGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **playableId** | **String**|  | [optional]
 **playableUrl** | **String**|  | [optional]
 **playableName** | **String**|  | [optional]
 **status** | **String**|  | [optional]
 **operationStatus** | **String**|  | [optional] [default to SAVED]
 **page** | **Long**|  | [optional] [default to 1] [enum: ]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: ]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playableSave"></a>
# **playableSave**
> Response playableSave(accessToken, body)

Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732203851777)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PlayableSaveBody body = new PlayableSaveBody(); // PlayableSaveBody | 
try {
    Response result = apiInstance.playableSave(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#playableSave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PlayableSaveBody**](PlayableSaveBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playableUpload"></a>
# **playableUpload**
> Response playableUpload(accessToken, advertiserId, fileId, playablePackage, uploadType)

You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1737730926765057)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String advertiserId = "advertiserId_example"; // String | 
String fileId = "fileId_example"; // String | 
File playablePackage = new File("playablePackage_example"); // File | 
String uploadType = "uploadType_example"; // String | 
try {
    Response result = apiInstance.playableUpload(accessToken, advertiserId, fileId, playablePackage, uploadType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#playableUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **advertiserId** | **String**|  | [optional]
 **fileId** | **String**|  | [optional]
 **playablePackage** | **File**|  | [optional]
 **uploadType** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="playableValidate"></a>
# **playableValidate**
> Response playableValidate(advertiserId, playableId, accessToken)

Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732054892545)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeManagementApi;


CreativeManagementApi apiInstance = new CreativeManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String playableId = "playableId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.playableValidate(advertiserId, playableId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeManagementApi#playableValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **playableId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

