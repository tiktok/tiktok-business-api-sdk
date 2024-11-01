# EventCallbackApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pixelBatch**](EventCallbackApi.md#pixelBatch) | **POST** /open_api/v1.3/pixel/batch/ | Pixel Track server-to-server batch api
[**pixelTrack**](EventCallbackApi.md#pixelTrack) | **POST** /open_api/v1.3/pixel/track/ | Pixel Track server-to-server api

<a name="pixelBatch"></a>
# **pixelBatch**
> Response pixelBatch(accessToken, body)

Pixel Track server-to-server batch api

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.EventCallbackApi;


EventCallbackApi apiInstance = new EventCallbackApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PixelBatchBody body = new PixelBatchBody(); // PixelBatchBody | Pixel batch update body parameters
try {
    Response result = apiInstance.pixelBatch(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventCallbackApi#pixelBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PixelBatchBody**](PixelBatchBody.md)| Pixel batch update body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelTrack"></a>
# **pixelTrack**
> Response pixelTrack(accessToken, body)

Pixel Track server-to-server api

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.EventCallbackApi;


EventCallbackApi apiInstance = new EventCallbackApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PixelTrackBody body = new PixelTrackBody(); // PixelTrackBody | Pixel track body parameters
try {
    Response result = apiInstance.pixelTrack(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventCallbackApi#pixelTrack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PixelTrackBody**](PixelTrackBody.md)| Pixel track body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

