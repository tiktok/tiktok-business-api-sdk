# AdgroupApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adgroupCreate**](AdgroupApi.md#adgroupCreate) | **POST** /open_api/v1.3/adgroup/create/ | Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739499616346114)
[**adgroupGet**](AdgroupApi.md#adgroupGet) | **GET** /open_api/v1.3/adgroup/get/ | Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739314558673922)
[**adgroupQuota**](AdgroupApi.md#adgroupQuota) | **GET** /open_api/v1.3/adgroup/quota/ | Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)
[**adgroupStatusUpdate**](AdgroupApi.md#adgroupStatusUpdate) | **POST** /open_api/v1.3/adgroup/status/update/ | Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739591716326402)
[**adgroupUpdate**](AdgroupApi.md#adgroupUpdate) | **POST** /open_api/v1.3/adgroup/update/ | Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739586761631745)

<a name="adgroupCreate"></a>
# **adgroupCreate**
> Response adgroupCreate(accessToken, body)

Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739499616346114)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdgroupCreateBody body = new AdgroupCreateBody(); // AdgroupCreateBody | Adgroup create body parameters
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
 **body** | [**AdgroupCreateBody**](AdgroupCreateBody.md)| Adgroup create body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adgroupGet"></a>
# **adgroupGet**
> Response adgroupGet(advertiserId, accessToken, filtering, page, pageSize, fields)

Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739314558673922)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringAdgroupGet filtering = new FilteringAdgroupGet(); // FilteringAdgroupGet | Filter conditions. Set these conditions according to your requirements. If not set, all ad groups under the advertiser will be returned. The request can be filtered by
Integer page = 56; // Integer | Current page number. Default value is `1`
Integer pageSize = 56; // Integer | Page size. Default value is- `10`. Range of values- `1-1000`
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
try {
    Response result = apiInstance.adgroupGet(advertiserId, accessToken, filtering, page, pageSize, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdgroupApi#adgroupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringAdgroupGet**](FilteringAdgroupGet.md)| Filter conditions. Set these conditions according to your requirements. If not set, all ad groups under the advertiser will be returned. The request can be filtered by | [optional]
 **page** | **Integer**| Current page number. Default value is &#x60;1&#x60; | [optional]
 **pageSize** | **Integer**| Page size. Default value is- &#x60;10&#x60;. Range of values- &#x60;1-1000&#x60; | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]

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

Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739591716326402)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdgroupStatusUpdateBody body = new AdgroupStatusUpdateBody(); // AdgroupStatusUpdateBody | Adgroup status update body parameters
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
 **body** | [**AdgroupStatusUpdateBody**](AdgroupStatusUpdateBody.md)| Adgroup status update body parameters | [optional]

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

Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739586761631745)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdgroupApi;


AdgroupApi apiInstance = new AdgroupApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdgroupUpdateBody body = new AdgroupUpdateBody(); // AdgroupUpdateBody | Adgroup update body parameters
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
 **body** | [**AdgroupUpdateBody**](AdgroupUpdateBody.md)| Adgroup update body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

