# AdApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adCreate**](AdApi.md#adCreate) | **POST** /open_api/v1.3/ad/create/ | Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953377508354)
[**adGet**](AdApi.md#adGet) | **GET** /open_api/v1.3/ad/get/ | Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1735735588640770)
[**adStatusUpdate**](AdApi.md#adStatusUpdate) | **POST** /open_api/v1.3/ad/status/update/ | Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953422970882)
[**adUpdate**](AdApi.md#adUpdate) | **POST** /open_api/v1.3/ad/update/ | Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953405142018)
[**smartPlusAdAppeal**](AdApi.md#smartPlusAdAppeal) | **POST** /open_api/v1.3/smart_plus/ad/appeal/ | Submit ad appeal [Smart Plus Ad Appeal]
[**smartPlusAdCreate**](AdApi.md#smartPlusAdCreate) | **POST** /open_api/v1.3/smart_plus/ad/create/ | Create a new ad [Smart Plus Ad Create]
[**smartPlusAdGet**](AdApi.md#smartPlusAdGet) | **GET** /open_api/v1.3/smart_plus/ad/get/ | Retrieve ad details [Smart Plus Ad Get]
[**smartPlusAdMaterialStatusUpdate**](AdApi.md#smartPlusAdMaterialStatusUpdate) | **POST** /open_api/v1.3/smart_plus/ad/material_status/update/ | Update ad material status [Smart Plus Ad Material Status Update]
[**smartPlusAdReviewInfo**](AdApi.md#smartPlusAdReviewInfo) | **GET** /open_api/v1.3/smart_plus/ad/review_info/ | Get ad review info [Smart Plus Ad Review Info]
[**smartPlusAdStatusUpdate**](AdApi.md#smartPlusAdStatusUpdate) | **POST** /open_api/v1.3/smart_plus/ad/status/update/ | Update ad status [Smart Plus Ad Status Update]
[**smartPlusAdUpdate**](AdApi.md#smartPlusAdUpdate) | **POST** /open_api/v1.3/smart_plus/ad/update/ | Update an ad [Smart Plus Ad Update]
[**smartPlusMaterialReviewInfo**](AdApi.md#smartPlusMaterialReviewInfo) | **GET** /open_api/v1.3/smart_plus/material/review_info/ | Get material review info [Smart Plus Material Review Info]

<a name="adCreate"></a>
# **adCreate**
> Response adCreate(accessToken, body)

Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953377508354)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdCreateBody body = new AdCreateBody(); // AdCreateBody | 
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
 **body** | [**AdCreateBody**](AdCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adGet"></a>
# **adGet**
> Response adGet(advertiserId, accessToken, filtering, page, pageSize, fields, excludeFieldTypesInResponse)

Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1735735588640770)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringAdGet filtering = new FilteringAdGet(); // FilteringAdGet | 
Integer page = 1; // Integer | 
Integer pageSize = 10; // Integer | 
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
List<String> excludeFieldTypesInResponse = Arrays.asList("excludeFieldTypesInResponse_example"); // List<String> | 
try {
    Response result = apiInstance.adGet(advertiserId, accessToken, filtering, page, pageSize, fields, excludeFieldTypesInResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#adGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringAdGet**](FilteringAdGet.md)|  | [optional]
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

<a name="adStatusUpdate"></a>
# **adStatusUpdate**
> Response adStatusUpdate(accessToken, body)

Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953422970882)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdStatusUpdateBody body = new AdStatusUpdateBody(); // AdStatusUpdateBody | 
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
 **body** | [**AdStatusUpdateBody**](AdStatusUpdateBody.md)|  | [optional]

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

Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953405142018)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdUpdateBody body = new AdUpdateBody(); // AdUpdateBody | 
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
 **body** | [**AdUpdateBody**](AdUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdAppeal"></a>
# **smartPlusAdAppeal**
> Response smartPlusAdAppeal(accessToken, body)

Submit ad appeal [Smart Plus Ad Appeal]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdAppealBody body = new SmartPlusAdAppealBody(); // SmartPlusAdAppealBody | 
try {
    Response result = apiInstance.smartPlusAdAppeal(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdAppeal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdAppealBody**](SmartPlusAdAppealBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdCreate"></a>
# **smartPlusAdCreate**
> Response smartPlusAdCreate(accessToken, body)

Create a new ad [Smart Plus Ad Create]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdCreateBody body = new SmartPlusAdCreateBody(); // SmartPlusAdCreateBody | 
try {
    Response result = apiInstance.smartPlusAdCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdCreateBody**](SmartPlusAdCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdGet"></a>
# **smartPlusAdGet**
> Response smartPlusAdGet(advertiserId, accessToken, filtering, page, pageSize, fields)

Retrieve ad details [Smart Plus Ad Get]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringSmartPlusAdGet filtering = new FilteringSmartPlusAdGet(); // FilteringSmartPlusAdGet | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
try {
    Response result = apiInstance.smartPlusAdGet(advertiserId, accessToken, filtering, page, pageSize, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringSmartPlusAdGet**](FilteringSmartPlusAdGet.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 100]
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusAdMaterialStatusUpdate"></a>
# **smartPlusAdMaterialStatusUpdate**
> Response smartPlusAdMaterialStatusUpdate(accessToken, body)

Update ad material status [Smart Plus Ad Material Status Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdMaterialStatusUpdateBody body = new SmartPlusAdMaterialStatusUpdateBody(); // SmartPlusAdMaterialStatusUpdateBody | 
try {
    Response result = apiInstance.smartPlusAdMaterialStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdMaterialStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdMaterialStatusUpdateBody**](SmartPlusAdMaterialStatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdReviewInfo"></a>
# **smartPlusAdReviewInfo**
> Response smartPlusAdReviewInfo(advertiserId, smartPlusAdIds, accessToken, extraInfoSetting, lang, contextInfo)

Get ad review info [Smart Plus Ad Review Info]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> smartPlusAdIds = Arrays.asList("smartPlusAdIds_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
ExtraInfoSettingSmartPlusAdReviewInfo extraInfoSetting = new ExtraInfoSettingSmartPlusAdReviewInfo(); // ExtraInfoSettingSmartPlusAdReviewInfo | 
String lang = "\"\""; // String | 
ContextInfoSmartPlusAdReviewInfo contextInfo = new ContextInfoSmartPlusAdReviewInfo(); // ContextInfoSmartPlusAdReviewInfo | 
try {
    Response result = apiInstance.smartPlusAdReviewInfo(advertiserId, smartPlusAdIds, accessToken, extraInfoSetting, lang, contextInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdReviewInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **smartPlusAdIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **extraInfoSetting** | [**ExtraInfoSettingSmartPlusAdReviewInfo**](ExtraInfoSettingSmartPlusAdReviewInfo.md)|  | [optional]
 **lang** | **String**|  | [optional] [default to &quot;&quot;]
 **contextInfo** | [**ContextInfoSmartPlusAdReviewInfo**](ContextInfoSmartPlusAdReviewInfo.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusAdStatusUpdate"></a>
# **smartPlusAdStatusUpdate**
> Response smartPlusAdStatusUpdate(accessToken, body)

Update ad status [Smart Plus Ad Status Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdStatusUpdateBody body = new SmartPlusAdStatusUpdateBody(); // SmartPlusAdStatusUpdateBody | 
try {
    Response result = apiInstance.smartPlusAdStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdStatusUpdateBody**](SmartPlusAdStatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdUpdate"></a>
# **smartPlusAdUpdate**
> Response smartPlusAdUpdate(accessToken, body)

Update an ad [Smart Plus Ad Update]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SmartPlusAdUpdateBody body = new SmartPlusAdUpdateBody(); // SmartPlusAdUpdateBody | 
try {
    Response result = apiInstance.smartPlusAdUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusAdUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SmartPlusAdUpdateBody**](SmartPlusAdUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusMaterialReviewInfo"></a>
# **smartPlusMaterialReviewInfo**
> Response smartPlusMaterialReviewInfo(advertiserId, adMaterialIds, accessToken, extraInfoSetting, lang, contextInfo)

Get material review info [Smart Plus Material Review Info]

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AdApi;


AdApi apiInstance = new AdApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> adMaterialIds = Arrays.asList("adMaterialIds_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
ExtraInfoSettingSmartPlusMaterialReviewInfo extraInfoSetting = new ExtraInfoSettingSmartPlusMaterialReviewInfo(); // ExtraInfoSettingSmartPlusMaterialReviewInfo | 
String lang = "\"\""; // String | 
ContextInfoSmartPlusMaterialReviewInfo contextInfo = new ContextInfoSmartPlusMaterialReviewInfo(); // ContextInfoSmartPlusMaterialReviewInfo | 
try {
    Response result = apiInstance.smartPlusMaterialReviewInfo(advertiserId, adMaterialIds, accessToken, extraInfoSetting, lang, contextInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdApi#smartPlusMaterialReviewInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **adMaterialIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **extraInfoSetting** | [**ExtraInfoSettingSmartPlusMaterialReviewInfo**](ExtraInfoSettingSmartPlusMaterialReviewInfo.md)|  | [optional]
 **lang** | **String**|  | [optional] [default to &quot;&quot;]
 **contextInfo** | [**ContextInfoSmartPlusMaterialReviewInfo**](ContextInfoSmartPlusMaterialReviewInfo.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

