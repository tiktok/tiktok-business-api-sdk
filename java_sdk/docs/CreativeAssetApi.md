# CreativeAssetApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creativePortfolioCreate**](CreativeAssetApi.md#creativePortfolioCreate) | **POST** /open_api/v1.3/creative/portfolio/create/ | Create a portfolio [Portfolio create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739091950439426)

<a name="creativePortfolioCreate"></a>
# **creativePortfolioCreate**
> Response creativePortfolioCreate(accessToken, body)

Create a portfolio [Portfolio create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739091950439426)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CreativeAssetApi;


CreativeAssetApi apiInstance = new CreativeAssetApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PortfolioCreateBody body = new PortfolioCreateBody(); // PortfolioCreateBody | Creative portfolio create body parameters
try {
    Response result = apiInstance.creativePortfolioCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativeAssetApi#creativePortfolioCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PortfolioCreateBody**](PortfolioCreateBody.md)| Creative portfolio create body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

