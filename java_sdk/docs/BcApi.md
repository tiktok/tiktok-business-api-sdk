# BcApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bcAdvertiserCreate**](BcApi.md#bcAdvertiserCreate) | **POST** /open_api/v1.3/bc/advertiser/create/ | Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
[**bcAssetGet**](BcApi.md#bcAssetGet) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)
[**bcGet**](BcApi.md#bcGet) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)
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
> Response bcAssetGet(bcId, assetType, accessToken, childBcId, filtering, page, pageSize)

Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcApi;


BcApi apiInstance = new BcApi();
String bcId = "bcId_example"; // String | 
String assetType = "assetType_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String childBcId = "childBcId_example"; // String | 
Object filtering = null; // Object | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.bcAssetGet(bcId, assetType, accessToken, childBcId, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcApi#bcAssetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**|  |[required] 
 **assetType** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **childBcId** | **String**|  | [optional]
 **filtering** | [**Object**](Object.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1] [enum: 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 50]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcGet"></a>
# **bcGet**
> Response bcGet(accessToken, bcId, scene, filtering, page, pageSize)

Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcApi;


BcApi apiInstance = new BcApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String bcId = "bcId_example"; // String | 
String scene = "SINGLE_ACCOUNT"; // String | 
Object filtering = null; // Object | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.bcGet(accessToken, bcId, scene, filtering, page, pageSize);
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
 **bcId** | **String**|  | [optional]
 **scene** | **String**|  | [optional] [default to SINGLE_ACCOUNT]
 **filtering** | [**Object**](Object.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 50]

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

