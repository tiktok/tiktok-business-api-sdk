# AdApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adCreate**](AdApi.md#adCreate) | **POST** /open_api/v1.3/ad/create/ | Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953377508354)
[**adGet**](AdApi.md#adGet) | **GET** /open_api/v1.3/ad/get/ | Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1735735588640770)
[**adStatusUpdate**](AdApi.md#adStatusUpdate) | **POST** /open_api/v1.3/ad/status/update/ | To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)
[**adUpdate**](AdApi.md#adUpdate) | **POST** /open_api/v1.3/ad/update/ | Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

<a name="adCreate"></a>
# **adCreate**
> Response adCreate(accessToken, body)

Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953377508354)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdCreateBody body = new AdCreateBody(); // AdCreateBody | Ad create body parameters
try {
    Response result = apiInstance.adCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#adCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdCreateBody**](AdCreateBody.md)| Ad create body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adGet"></a>
# **adGet**
> Response adGet(advertiserId, accessToken, filtering, page, pageSize, fields)

Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1735735588640770)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringAdGet filtering = new FilteringAdGet(); // FilteringAdGet | Filters on the data. This parameter is an array of filter objects.
Integer page = 56; // Integer | Current page number
Integer pageSize = 56; // Integer | Page size
List<String> fields = Arrays.asList("fields_example"); // List<String> | Fields that you want to get. For the list of fields that you can specify, see the fields under `list` in the response. If not set, all fields are returned by default.
try {
    Response result = apiInstance.adGet(advertiserId, accessToken, filtering, page, pageSize, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#adGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringAdGet**](FilteringAdGet.md)| Filters on the data. This parameter is an array of filter objects. | [optional]
 **page** | **Integer**| Current page number | [optional]
 **pageSize** | **Integer**| Page size | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Fields that you want to get. For the list of fields that you can specify, see the fields under &#x60;list&#x60; in the response. If not set, all fields are returned by default. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adStatusUpdate"></a>
# **adStatusUpdate**
> Response adStatusUpdate(accessToken, body)

To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdStatusUpdateBody body = new AdStatusUpdateBody(); // AdStatusUpdateBody | Ad status update body parameters
try {
    Response result = apiInstance.adStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#adStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdStatusUpdateBody**](AdStatusUpdateBody.md)| Ad status update body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adUpdate"></a>
# **adUpdate**
> Response adUpdate(accessToken, body)

Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdUpdateBody body = new AdUpdateBody(); // AdUpdateBody | Ad create body parameters
try {
    Response result = apiInstance.adUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#adUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdUpdateBody**](AdUpdateBody.md)| Ad create body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

