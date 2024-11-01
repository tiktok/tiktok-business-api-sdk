# BcApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bcAdvertiserCreate**](BcApi.md#bcAdvertiserCreate) | **POST** /open_api/v1.3/bc/advertiser/create/ | Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
[**bcAssetGet**](BcApi.md#bcAssetGet) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)
[**bcGet**](BcApi.md#bcGet) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)
[**bcImageUpload**](BcApi.md#bcImageUpload) | **POST** /open_api/v1.3/bc/image/upload/ | Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)

<a name="bcAdvertiserCreate"></a>
# **bcAdvertiserCreate**
> Response bcAdvertiserCreate(accessToken, body)

Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcApi;


BcApi apiInstance = new BcApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdvertiserCreateBody body = new AdvertiserCreateBody(); // AdvertiserCreateBody | BC advertiser create body parameters
try {
    Response result = apiInstance.bcAdvertiserCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcApi#bcAdvertiserCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdvertiserCreateBody**](AdvertiserCreateBody.md)| BC advertiser create body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bcAssetGet"></a>
# **bcAssetGet**
> Response bcAssetGet(bcId, assetType, accessToken, filtering, page, pageSize)

Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcApi;


BcApi apiInstance = new BcApi();
String bcId = "bcId_example"; // String | Business Center ID
String assetType = "assetType_example"; // String | Type of asset that you want to get. Enum values: `CATALOG`, `ADVERTISER`, `PIXEL`, `LEAD`, `TT_ACCOUNT`(corresponds to `BC_AUTH_TT`, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097), `TIKTOK_SHOP` (TikTok shop) , `STOREFRONT`( TikTok Storefront (third-party store))
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Filtering filtering = new Filtering(); // Filtering | Filtering conditions. Use either `user_id` or `user_email` as filter.Note: You cannot use `user_id` and `user_email` at the same time.If you do not specify any filter values, the system will pass in to the `user_id` field the user ID of the TikTok for Business account that gives you the authentication code (`auth_code`)
Integer page = 56; // Integer | Current page number. Default value: 1
Integer pageSize = 56; // Integer | Page size, in the range of 1-50. Default value: 10
try {
    Response result = apiInstance.bcAssetGet(bcId, assetType, accessToken, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcApi#bcAssetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**| Business Center ID |[required] 
 **assetType** | **String**| Type of asset that you want to get. Enum values: &#x60;CATALOG&#x60;, &#x60;ADVERTISER&#x60;, &#x60;PIXEL&#x60;, &#x60;LEAD&#x60;, &#x60;TT_ACCOUNT&#x60;(corresponds to &#x60;BC_AUTH_TT&#x60;, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097), &#x60;TIKTOK_SHOP&#x60; (TikTok shop) , &#x60;STOREFRONT&#x60;( TikTok Storefront (third-party store)) |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**Filtering**](Filtering.md)| Filtering conditions. Use either &#x60;user_id&#x60; or &#x60;user_email&#x60; as filter.Note: You cannot use &#x60;user_id&#x60; and &#x60;user_email&#x60; at the same time.If you do not specify any filter values, the system will pass in to the &#x60;user_id&#x60; field the user ID of the TikTok for Business account that gives you the authentication code (&#x60;auth_code&#x60;) | [optional]
 **page** | **Integer**| Current page number. Default value: 1 | [optional]
 **pageSize** | **Integer**| Page size, in the range of 1-50. Default value: 10 | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcGet"></a>
# **bcGet**
> Response bcGet(accessToken, bcId, page, pageSize)

Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcApi;


BcApi apiInstance = new BcApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String bcId = "bcId_example"; // String | The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in
Integer page = 56; // Integer | Current number of pages. Default value: 1. Value range : ≥ 1
Integer pageSize = 56; // Integer | Page size. Default value: 10. Value range: 1-50
try {
    Response result = apiInstance.bcGet(accessToken, bcId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcApi#bcGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **bcId** | **String**| The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in | [optional]
 **page** | **Integer**| Current number of pages. Default value: 1. Value range : ≥ 1 | [optional]
 **pageSize** | **Integer**| Page size. Default value: 10. Value range: 1-50 | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcImageUpload"></a>
# **bcImageUpload**
> Response bcImageUpload(accessToken, bcId, imageFile)

Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcApi;


BcApi apiInstance = new BcApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String bcId = "bcId_example"; // String | 
File imageFile = new File("imageFile_example"); // File | 
try {
    Response result = apiInstance.bcImageUpload(accessToken, bcId, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcApi#bcImageUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **bcId** | **String**|  | [optional]
 **imageFile** | **File**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

