# AdAcoApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAcoCreate**](AdAcoApi.md#adAcoCreate) | **POST** /open_api/v1.3/ad/aco/create/ | Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473063234626)
[**adAcoGet**](AdAcoApi.md#adAcoGet) | **GET** /open_api/v1.3/ad/aco/get/ | Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473020978177)
[**adAcoMaterialStatusUpdate**](AdAcoApi.md#adAcoMaterialStatusUpdate) | **POST** /open_api/v1.3/ad/aco/material_status/update/ | Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739506701165570)
[**adAcoUpdate**](AdAcoApi.md#adAcoUpdate) | **POST** /open_api/v1.3/ad/aco/update/ | Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473077112833)

<a name="adAcoCreate"></a>
# **adAcoCreate**
> Response adAcoCreate(accessToken, body)

Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473063234626)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdAcoApi;


AdAcoApi apiInstance = new AdAcoApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdAcoBody body = new AdAcoBody(); // AdAcoBody | Ad Aco update parameters.
try {
    Response result = apiInstance.adAcoCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAcoApi#adAcoCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdAcoBody**](AdAcoBody.md)| Ad Aco update parameters. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adAcoGet"></a>
# **adAcoGet**
> Response adAcoGet(advertiserId, adgroupIds, accessToken, excludeFieldTypesInResponse)

Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473020978177)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdAcoApi;


AdAcoApi apiInstance = new AdAcoApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
List<String> adgroupIds = Arrays.asList("adgroupIds_example"); // List<String> | A list of ad group IDs. Quantity- 1-100.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> excludeFieldTypesInResponse = Arrays.asList("excludeFieldTypesInResponse_example"); // List<String> | The type of fields that you want to remove from the response.
try {
    Response result = apiInstance.adAcoGet(advertiserId, adgroupIds, accessToken, excludeFieldTypesInResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAcoApi#adAcoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **adgroupIds** | [**List&lt;String&gt;**](String.md)| A list of ad group IDs. Quantity- 1-100. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **excludeFieldTypesInResponse** | [**List&lt;String&gt;**](String.md)| The type of fields that you want to remove from the response. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adAcoMaterialStatusUpdate"></a>
# **adAcoMaterialStatusUpdate**
> Response adAcoMaterialStatusUpdate(accessToken, body)

Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739506701165570)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdAcoApi;


AdAcoApi apiInstance = new AdAcoApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
MaterialStatusUpdateBody body = new MaterialStatusUpdateBody(); // MaterialStatusUpdateBody | Ad Aco material status body
try {
    Response result = apiInstance.adAcoMaterialStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAcoApi#adAcoMaterialStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**MaterialStatusUpdateBody**](MaterialStatusUpdateBody.md)| Ad Aco material status body | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adAcoUpdate"></a>
# **adAcoUpdate**
> Response adAcoUpdate(accessToken, body)

Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473077112833)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdAcoApi;


AdAcoApi apiInstance = new AdAcoApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdAcoUpdateBody body = new AdAcoUpdateBody(); // AdAcoUpdateBody | Ad Aco update parameters
try {
    Response result = apiInstance.adAcoUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAcoApi#adAcoUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdAcoUpdateBody**](AdAcoUpdateBody.md)| Ad Aco update parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

