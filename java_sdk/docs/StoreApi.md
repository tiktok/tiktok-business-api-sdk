# StoreApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gmvMaxExclusiveAuthorizationCreate**](StoreApi.md#gmvMaxExclusiveAuthorizationCreate) | **POST** /open_api/v1.3/gmv_max/exclusive_authorization/create/ | Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001200356354)
[**gmvMaxExclusiveAuthorizationGet**](StoreApi.md#gmvMaxExclusiveAuthorizationGet) | **GET** /open_api/v1.3/gmv_max/exclusive_authorization/get/ | Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001184635905)
[**gmvMaxStoreList**](StoreApi.md#gmvMaxStoreList) | **GET** /open_api/v1.3/gmv_max/store/list/ | Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001044479041)
[**gmvMaxStoreShopAdUsageCheck**](StoreApi.md#gmvMaxStoreShopAdUsageCheck) | **GET** /open_api/v1.3/gmv_max/store/shop_ad_usage_check/ | Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001084174338)

<a name="gmvMaxExclusiveAuthorizationCreate"></a>
# **gmvMaxExclusiveAuthorizationCreate**
> Response gmvMaxExclusiveAuthorizationCreate(accessToken, body)

Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001200356354)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
ExclusiveAuthorizationCreateBody body = new ExclusiveAuthorizationCreateBody(); // ExclusiveAuthorizationCreateBody | 
try {
    Response result = apiInstance.gmvMaxExclusiveAuthorizationCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#gmvMaxExclusiveAuthorizationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**ExclusiveAuthorizationCreateBody**](ExclusiveAuthorizationCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gmvMaxExclusiveAuthorizationGet"></a>
# **gmvMaxExclusiveAuthorizationGet**
> Response gmvMaxExclusiveAuthorizationGet(advertiserId, storeId, storeAuthorizedBcId, accessToken)

Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001184635905)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
String advertiserId = "advertiserId_example"; // String | 
String storeId = "storeId_example"; // String | 
String storeAuthorizedBcId = "storeAuthorizedBcId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.gmvMaxExclusiveAuthorizationGet(advertiserId, storeId, storeAuthorizedBcId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#gmvMaxExclusiveAuthorizationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **storeId** | **String**|  |[required] 
 **storeAuthorizedBcId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxStoreList"></a>
# **gmvMaxStoreList**
> Response gmvMaxStoreList(advertiserId, accessToken)

Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001044479041)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.gmvMaxStoreList(advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#gmvMaxStoreList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxStoreShopAdUsageCheck"></a>
# **gmvMaxStoreShopAdUsageCheck**
> Response gmvMaxStoreShopAdUsageCheck(advertiserId, storeId, accessToken)

Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001084174338)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.StoreApi;


StoreApi apiInstance = new StoreApi();
String advertiserId = "advertiserId_example"; // String | 
String storeId = "storeId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.gmvMaxStoreShopAdUsageCheck(advertiserId, storeId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#gmvMaxStoreShopAdUsageCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **storeId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

