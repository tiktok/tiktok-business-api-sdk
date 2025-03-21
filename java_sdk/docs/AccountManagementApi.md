# AccountManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserInfo**](AccountManagementApi.md#advertiserInfo) | **GET** /open_api/v1.3/advertiser/info/ | Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1739593083610113)
[**advertiserUpdate**](AccountManagementApi.md#advertiserUpdate) | **POST** /open_api/v1.3/advertiser/update/ | Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939050770434)
[**pangleAudiencePackageGet**](AccountManagementApi.md#pangleAudiencePackageGet) | **GET** /open_api/v1.3/pangle_audience_package/get/ | Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040177229826)
[**pangleBlockListGet**](AccountManagementApi.md#pangleBlockListGet) | **GET** /open_api/v1.3/pangle_block_list/get/ | Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740039957181441)
[**pangleBlockListUpdate**](AccountManagementApi.md#pangleBlockListUpdate) | **POST** /open_api/v1.3/pangle_block_list/update/ | Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040139110466)
[**termCheck**](AccountManagementApi.md#termCheck) | **GET** /open_api/v1.3/term/check/ | Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192304571394)
[**termConfirm**](AccountManagementApi.md#termConfirm) | **POST** /open_api/v1.3/term/confirm/ | Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192284435457)
[**termGet**](AccountManagementApi.md#termGet) | **GET** /open_api/v1.3/term/get/ | Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737191909315585)

<a name="advertiserInfo"></a>
# **advertiserInfo**
> Response advertiserInfo(advertiserIds, accessToken, fields)

Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1739593083610113)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
List<String> advertiserIds = Arrays.asList("advertiserIds_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> fields = Arrays.asList("fields_example"); // List<String> | 
try {
    Response result = apiInstance.advertiserInfo(advertiserIds, accessToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#advertiserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **fields** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiserUpdate"></a>
# **advertiserUpdate**
> Response advertiserUpdate(accessToken, body)

Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939050770434)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AdvertiserUpdateBody body = new AdvertiserUpdateBody(); // AdvertiserUpdateBody | 
try {
    Response result = apiInstance.advertiserUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#advertiserUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AdvertiserUpdateBody**](AdvertiserUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pangleAudiencePackageGet"></a>
# **pangleAudiencePackageGet**
> Response pangleAudiencePackageGet(advertiserId, accessToken)

Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040177229826)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.pangleAudiencePackageGet(advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#pangleAudiencePackageGet");
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

<a name="pangleBlockListGet"></a>
# **pangleBlockListGet**
> Response pangleBlockListGet(advertiserId, accessToken)

Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740039957181441)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.pangleBlockListGet(advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#pangleBlockListGet");
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

<a name="pangleBlockListUpdate"></a>
# **pangleBlockListUpdate**
> Response pangleBlockListUpdate(accessToken, body)

Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040139110466)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PangleBlockListUpdateBody body = new PangleBlockListUpdateBody(); // PangleBlockListUpdateBody | 
try {
    Response result = apiInstance.pangleBlockListUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#pangleBlockListUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PangleBlockListUpdateBody**](PangleBlockListUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="termCheck"></a>
# **termCheck**
> Response termCheck(advertiserId, termType, accessToken)

Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192304571394)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String termType = "termType_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.termCheck(advertiserId, termType, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#termCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **termType** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="termConfirm"></a>
# **termConfirm**
> Response termConfirm(accessToken, body)

Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192284435457)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
TermConfirmBody body = new TermConfirmBody(); // TermConfirmBody | 
try {
    Response result = apiInstance.termConfirm(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#termConfirm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**TermConfirmBody**](TermConfirmBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="termGet"></a>
# **termGet**
> Response termGet(advertiserId, termType, accessToken, lang)

Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737191909315585)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AccountManagementApi;


AccountManagementApi apiInstance = new AccountManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String termType = "termType_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String lang = "EN"; // String | 
try {
    Response result = apiInstance.termGet(advertiserId, termType, accessToken, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#termGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **termType** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **lang** | **String**|  | [optional] [default to EN]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

