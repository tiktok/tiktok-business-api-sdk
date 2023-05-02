# AccountApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserUpdate**](AccountApi.md#advertiserUpdate) | **POST** /open_api/v1.3/advertiser/update/ | Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939050770434)

<a name="advertiserUpdate"></a>
# **advertiserUpdate**
> Response advertiserUpdate(accessToken, body)

Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939050770434)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdvertiserUpdateBody body = new AdvertiserUpdateBody(); // AdvertiserUpdateBody | Advertiser update body parameters
try {
    Response result = apiInstance.advertiserUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#advertiserUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdvertiserUpdateBody**](AdvertiserUpdateBody.md)| Advertiser update body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

