# AdgroupApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adgroupCreate**](AdgroupApi.md#adgroupCreate) | **POST** /open_api/v1.3/adgroup/create/ | Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739499616346114)
[**adgroupGet**](AdgroupApi.md#adgroupGet) | **GET** /open_api/v1.3/adgroup/get/ | Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739314558673922)
[**adgroupQuota**](AdgroupApi.md#adgroupQuota) | **GET** /open_api/v1.3/adgroup/quota/ | Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)
[**adgroupStatusUpdate**](AdgroupApi.md#adgroupStatusUpdate) | **POST** /open_api/v1.3/adgroup/status/update/ | Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739591716326402)
[**adgroupUpdate**](AdgroupApi.md#adgroupUpdate) | **POST** /open_api/v1.3/adgroup/update/ | Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739586761631745)
[**smartPlusAdgroupCreate**](AdgroupApi.md#smartPlusAdgroupCreate) | **POST** /open_api/v1.3/smart_plus/adgroup/create/ | Create a new ad group [Smart Plus AdGroup Create]
[**smartPlusAdgroupGet**](AdgroupApi.md#smartPlusAdgroupGet) | **GET** /open_api/v1.3/smart_plus/adgroup/get/ | Retrieve ad group details [Smart Plus AdGroup Get]
[**smartPlusAdgroupStatusUpdate**](AdgroupApi.md#smartPlusAdgroupStatusUpdate) | **POST** /open_api/v1.3/smart_plus/adgroup/status/update/ | Update ad group status [Smart Plus AdGroup Status Update]
[**smartPlusAdgroupUpdate**](AdgroupApi.md#smartPlusAdgroupUpdate) | **POST** /open_api/v1.3/smart_plus/adgroup/update/ | Update an ad group [Smart Plus AdGroup Update]

<a name="adgroupCreate"></a>
# **adgroupCreate**
> Response adgroupCreate(accessToken, body)

Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739499616346114)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdgroupCreateBody body = new AdgroupCreateBody(); // AdgroupCreateBody | 
try {
    Response result = apiInstance.adgroupCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#adgroupCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdgroupCreateBody**](AdgroupCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adgroupGet"></a>
# **adgroupGet**
> Response adgroupGet(advertiserId, accessToken, filtering, page, pageSize, fields, excludeFieldTypesInResponse)

Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739314558673922)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringAdgroupGet filtering = new FilteringAdgroupGet(); // FilteringAdgroupGet | 
Integer page = 1; // Integer | 
Integer pageSize = 10; // Integer | 
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
List<String> excludeFieldTypesInResponse = Arrays.asList("excludeFieldTypesInResponse_example"); // List<String> | 
try {
    Response result = apiInstance.adgroupGet(advertiserId, accessToken, filtering, page, pageSize, fields, excludeFieldTypesInResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#adgroupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringAdgroupGet**](FilteringAdgroupGet.md)|  | [optional]
 **page** | **Integer**|  | [optional] [default to 1] [enum: 1]
 **pageSize** | **Integer**|  | [optional] [default to 10] [enum: 1, 1000]
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **excludeFieldTypesInResponse** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adgroupQuota"></a>
# **adgroupQuota**
> Response adgroupQuota(advertiserId, accessToken)

Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.adgroupQuota(advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#adgroupQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adgroupStatusUpdate"></a>
# **adgroupStatusUpdate**
> Response adgroupStatusUpdate(accessToken, body)

Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739591716326402)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdgroupStatusUpdateBody body = new AdgroupStatusUpdateBody(); // AdgroupStatusUpdateBody | 
try {
    Response result = apiInstance.adgroupStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#adgroupStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdgroupStatusUpdateBody**](AdgroupStatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adgroupUpdate"></a>
# **adgroupUpdate**
> Response adgroupUpdate(accessToken, body)

Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739586761631745)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdgroupUpdateBody body = new AdgroupUpdateBody(); // AdgroupUpdateBody | 
try {
    Response result = apiInstance.adgroupUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#adgroupUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdgroupUpdateBody**](AdgroupUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdgroupCreate"></a>
# **smartPlusAdgroupCreate**
> Response smartPlusAdgroupCreate(accessToken, body)

Create a new ad group [Smart Plus AdGroup Create]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdgroupCreateBody body = new SmartPlusAdgroupCreateBody(); // SmartPlusAdgroupCreateBody | 
try {
    Response result = apiInstance.smartPlusAdgroupCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#smartPlusAdgroupCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdgroupCreateBody**](SmartPlusAdgroupCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdgroupGet"></a>
# **smartPlusAdgroupGet**
> Response smartPlusAdgroupGet(advertiserId, accessToken, filtering, page, pageSize, fields)

Retrieve ad group details [Smart Plus AdGroup Get]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringSmartPlusAdgroupGet filtering = new FilteringSmartPlusAdgroupGet(); // FilteringSmartPlusAdgroupGet | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
try {
    Response result = apiInstance.smartPlusAdgroupGet(advertiserId, accessToken, filtering, page, pageSize, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#smartPlusAdgroupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringSmartPlusAdgroupGet**](FilteringSmartPlusAdgroupGet.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 1000]
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusAdgroupStatusUpdate"></a>
# **smartPlusAdgroupStatusUpdate**
> Response smartPlusAdgroupStatusUpdate(accessToken, body)

Update ad group status [Smart Plus AdGroup Status Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdgroupStatusUpdateBody body = new SmartPlusAdgroupStatusUpdateBody(); // SmartPlusAdgroupStatusUpdateBody | 
try {
    Response result = apiInstance.smartPlusAdgroupStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#smartPlusAdgroupStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdgroupStatusUpdateBody**](SmartPlusAdgroupStatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdgroupUpdate"></a>
# **smartPlusAdgroupUpdate**
> Response smartPlusAdgroupUpdate(accessToken, body)

Update an ad group [Smart Plus AdGroup Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdgroupUpdateBody body = new SmartPlusAdgroupUpdateBody(); // SmartPlusAdgroupUpdateBody | 
try {
    Response result = apiInstance.smartPlusAdgroupUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#smartPlusAdgroupUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdgroupUpdateBody**](SmartPlusAdgroupUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

