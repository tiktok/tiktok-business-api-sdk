# RecommendToolApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toolTargetingCategoryRecommend**](RecommendToolApi.md#toolTargetingCategoryRecommend) | **POST** /open_api/v1.3/tool/targeting_category/recommend/ | Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736275204260866)

<a name="toolTargetingCategoryRecommend"></a>
# **toolTargetingCategoryRecommend**
> Response toolTargetingCategoryRecommend(accessToken, body)

Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736275204260866)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.RecommendToolApi;


RecommendToolApi apiInstance = new RecommendToolApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
TargetingCategoryRecommendBody body = new TargetingCategoryRecommendBody(); // TargetingCategoryRecommendBody | Tool recommend body parameters
try {
    Response result = apiInstance.toolTargetingCategoryRecommend(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecommendToolApi#toolTargetingCategoryRecommend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**TargetingCategoryRecommendBody**](TargetingCategoryRecommendBody.md)| Tool recommend body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

