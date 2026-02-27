# AudienceApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightOverlap**](AudienceApi.md#audienceInsightOverlap) | **GET** /open_api/v1.3/audience/insight/overlap/ | Get details of audience overlap. [Audience Insight Overlap](https://business-api.tiktok.com/portal/docs?id&#x3D;1797023590780930)
[**dmpCustomAudienceApply**](AudienceApi.md#dmpCustomAudienceApply) | **POST** /open_api/v1.3/dmp/custom_audience/apply/ | Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
[**dmpCustomAudienceApplyLog**](AudienceApi.md#dmpCustomAudienceApplyLog) | **GET** /open_api/v1.3/dmp/custom_audience/apply/log/ | Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758615737388033)
[**dmpCustomAudienceCreate**](AudienceApi.md#dmpCustomAudienceCreate) | **POST** /open_api/v1.3/dmp/custom_audience/create/ | Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940570793985)
[**dmpCustomAudienceDelete**](AudienceApi.md#dmpCustomAudienceDelete) | **POST** /open_api/v1.3/dmp/custom_audience/delete/ | Delete audiences [Dmp Custom_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940539757569)
[**dmpCustomAudienceFileUpload**](AudienceApi.md#dmpCustomAudienceFileUpload) | **POST** /open_api/v1.3/dmp/custom_audience/file/upload/ | Upload a data file [Dmp Custom_audience File Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940567842818)
[**dmpCustomAudienceGet**](AudienceApi.md#dmpCustomAudienceGet) | **GET** /open_api/v1.3/dmp/custom_audience/get/ | Obtain the details of specified audiences [Dmp Custom_audience Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940507792385)
[**dmpCustomAudienceList**](AudienceApi.md#dmpCustomAudienceList) | **GET** /open_api/v1.3/dmp/custom_audience/list/ | Get all audiences [Dmp Custom_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940506015746)
[**dmpCustomAudienceLookalikeCreate**](AudienceApi.md#dmpCustomAudienceLookalikeCreate) | **POST** /open_api/v1.3/dmp/custom_audience/lookalike/create/ | Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940511844353)
[**dmpCustomAudienceLookalikeUpdate**](AudienceApi.md#dmpCustomAudienceLookalikeUpdate) | **POST** /open_api/v1.3/dmp/custom_audience/lookalike/update/ | Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758616888158209)
[**dmpCustomAudienceRuleCreate**](AudienceApi.md#dmpCustomAudienceRuleCreate) | **POST** /open_api/v1.3/dmp/custom_audience/rule/create/ | Create an audience by rules [Dmp Custom_audience Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940509849601)
[**dmpCustomAudienceShare**](AudienceApi.md#dmpCustomAudienceShare) | **POST** /open_api/v1.3/dmp/custom_audience/share/ | Share custom audiences with other advertisers [Dmp Custom_audience Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245803888706)
[**dmpCustomAudienceShareCancel**](AudienceApi.md#dmpCustomAudienceShareCancel) | **POST** /open_api/v1.3/dmp/custom_audience/share/cancel/ | Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245829978113)
[**dmpCustomAudienceShareLog**](AudienceApi.md#dmpCustomAudienceShareLog) | **GET** /open_api/v1.3/dmp/custom_audience/share/log/ | Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
[**dmpCustomAudienceUpdate**](AudienceApi.md#dmpCustomAudienceUpdate) | **POST** /open_api/v1.3/dmp/custom_audience/update/ | Update the details of an audience [Dmp Custom_audience Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940572667906)
[**dmpSavedAudienceCreate**](AudienceApi.md#dmpSavedAudienceCreate) | **POST** /open_api/v1.3/dmp/saved_audience/create/ | Create a Saved Audience [Dmp Saved_audience Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154541898754)
[**dmpSavedAudienceDelete**](AudienceApi.md#dmpSavedAudienceDelete) | **POST** /open_api/v1.3/dmp/saved_audience/delete/ | Delete Saved Audiences [Dmp Saved_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154666312706)
[**dmpSavedAudienceList**](AudienceApi.md#dmpSavedAudienceList) | **GET** /open_api/v1.3/dmp/saved_audience/list/ | Get the details of Saved Audiences [Dmp Saved_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154619404290)

<a name="audienceInsightOverlap"></a>
# **audienceInsightOverlap**
> Response audienceInsightOverlap(advertiserId, benchmarkCustomAudienceId, accessToken, comparisonCustomAudienceIds)

Get details of audience overlap. [Audience Insight Overlap](https://business-api.tiktok.com/portal/docs?id&#x3D;1797023590780930)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | 
String benchmarkCustomAudienceId = "benchmarkCustomAudienceId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> comparisonCustomAudienceIds = Arrays.asList("comparisonCustomAudienceIds_example"); // List<String> | 
try {
    Response result = apiInstance.audienceInsightOverlap(advertiserId, benchmarkCustomAudienceId, accessToken, comparisonCustomAudienceIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#audienceInsightOverlap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **benchmarkCustomAudienceId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **comparisonCustomAudienceIds** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceApply"></a>
# **dmpCustomAudienceApply**
> Response dmpCustomAudienceApply(accessToken, body)

Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CustomAudienceApplyBody body = new CustomAudienceApplyBody(); // CustomAudienceApplyBody | 
try {
    Response result = apiInstance.dmpCustomAudienceApply(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceApply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CustomAudienceApplyBody**](CustomAudienceApplyBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceApplyLog"></a>
# **dmpCustomAudienceApplyLog**
> Response dmpCustomAudienceApplyLog(advertiserId, customAudienceIds, accessToken, page, pageSize, timezone, contextInfo)

Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758615737388033)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
List<String> customAudienceIds = Arrays.asList("customAudienceIds_example"); // List<String> | A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Integer page = 1; // Integer | Current page number. Default value: 1.
Integer pageSize = 10; // Integer | Page size. Default value: 10.
String timezone = "timezone_example"; // String | The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used.
Object contextInfo = null; // Object | 
try {
    Response result = apiInstance.dmpCustomAudienceApplyLog(advertiserId, customAudienceIds, accessToken, page, pageSize, timezone, contextInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceApplyLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **customAudienceIds** | [**List&lt;String&gt;**](String.md)| A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **page** | **Integer**| Current page number. Default value: 1. | [optional] [default to 1]
 **pageSize** | **Integer**| Page size. Default value: 10. | [optional] [default to 10]
 **timezone** | **String**| The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used. | [optional]
 **contextInfo** | [**Object**](Object.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceCreate"></a>
# **dmpCustomAudienceCreate**
> Response dmpCustomAudienceCreate(accessToken, body)

Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940570793985)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CustomAudienceCreateBody body = new CustomAudienceCreateBody(); // CustomAudienceCreateBody | 
try {
    Response result = apiInstance.dmpCustomAudienceCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CustomAudienceCreateBody**](CustomAudienceCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceDelete"></a>
# **dmpCustomAudienceDelete**
> Response dmpCustomAudienceDelete(accessToken, body)

Delete audiences [Dmp Custom_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940539757569)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CustomAudienceDeleteBody body = new CustomAudienceDeleteBody(); // CustomAudienceDeleteBody | 
try {
    Response result = apiInstance.dmpCustomAudienceDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CustomAudienceDeleteBody**](CustomAudienceDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceFileUpload"></a>
# **dmpCustomAudienceFileUpload**
> Response dmpCustomAudienceFileUpload(accessToken, advertiserId, calculateType, contextInfo, file, fileName, fileSignature)

Upload a data file [Dmp Custom_audience File Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940567842818)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String advertiserId = "advertiserId_example"; // String | 
String calculateType = "calculateType_example"; // String | 
DmpcustomAudiencefileuploadContextInfo contextInfo = new DmpcustomAudiencefileuploadContextInfo(); // DmpcustomAudiencefileuploadContextInfo | 
File file = new File("file_example"); // File | 
String fileName = "fileName_example"; // String | 
String fileSignature = "fileSignature_example"; // String | 
try {
    Response result = apiInstance.dmpCustomAudienceFileUpload(accessToken, advertiserId, calculateType, contextInfo, file, fileName, fileSignature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceFileUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **advertiserId** | **String**|  | [optional]
 **calculateType** | **String**|  | [optional]
 **contextInfo** | [**DmpcustomAudiencefileuploadContextInfo**](DmpcustomAudiencefileuploadContextInfo.md)|  | [optional]
 **file** | **File**|  | [optional]
 **fileName** | **String**|  | [optional]
 **fileSignature** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="dmpCustomAudienceGet"></a>
# **dmpCustomAudienceGet**
> Response dmpCustomAudienceGet(advertiserId, customAudienceIds, accessToken, historySize)

Obtain the details of specified audiences [Dmp Custom_audience Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940507792385)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
List<String> customAudienceIds = Arrays.asList("customAudienceIds_example"); // List<String> | A list of Audience IDs. Length range is [1, 100] .
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Integer historySize = 56; // Integer | The size of the history data which the user requests.
try {
    Response result = apiInstance.dmpCustomAudienceGet(advertiserId, customAudienceIds, accessToken, historySize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **customAudienceIds** | [**List&lt;String&gt;**](String.md)| A list of Audience IDs. Length range is [1, 100] . |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **historySize** | **Integer**| The size of the history data which the user requests. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceList"></a>
# **dmpCustomAudienceList**
> Response dmpCustomAudienceList(advertiserId, accessToken, customAudienceIds, page, pageSize)

Get all audiences [Dmp Custom_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940506015746)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> customAudienceIds = Arrays.asList("customAudienceIds_example"); // List<String> | A list of Audience IDs. Length range is [1, 100].
Integer page = 1; // Integer | Current page number. Default value: 1. Value range: ≥ 1.
Integer pageSize = 10; // Integer | Page size. Defaults is 10. Value range: 1-100.
try {
    Response result = apiInstance.dmpCustomAudienceList(advertiserId, accessToken, customAudienceIds, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **customAudienceIds** | [**List&lt;String&gt;**](String.md)| A list of Audience IDs. Length range is [1, 100]. | [optional]
 **page** | **Integer**| Current page number. Default value: 1. Value range: ≥ 1. | [optional] [default to 1] [enum: 1]
 **pageSize** | **Integer**| Page size. Defaults is 10. Value range: 1-100. | [optional] [default to 10] [enum: 1, 100]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceLookalikeCreate"></a>
# **dmpCustomAudienceLookalikeCreate**
> Response dmpCustomAudienceLookalikeCreate(accessToken, body)

Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940511844353)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
LookalikeCreateBody body = new LookalikeCreateBody(); // LookalikeCreateBody | 
try {
    Response result = apiInstance.dmpCustomAudienceLookalikeCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceLookalikeCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**LookalikeCreateBody**](LookalikeCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceLookalikeUpdate"></a>
# **dmpCustomAudienceLookalikeUpdate**
> Response dmpCustomAudienceLookalikeUpdate(accessToken, body)

Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758616888158209)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
LookalikeUpdateBody body = new LookalikeUpdateBody(); // LookalikeUpdateBody | 
try {
    Response result = apiInstance.dmpCustomAudienceLookalikeUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceLookalikeUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**LookalikeUpdateBody**](LookalikeUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceRuleCreate"></a>
# **dmpCustomAudienceRuleCreate**
> Response dmpCustomAudienceRuleCreate(accessToken, body)

Create an audience by rules [Dmp Custom_audience Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940509849601)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
RuleCreateBody body = new RuleCreateBody(); // RuleCreateBody | 
try {
    Response result = apiInstance.dmpCustomAudienceRuleCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceRuleCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**RuleCreateBody**](RuleCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceShare"></a>
# **dmpCustomAudienceShare**
> Response dmpCustomAudienceShare(accessToken, body)

Share custom audiences with other advertisers [Dmp Custom_audience Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245803888706)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CustomAudienceShareBody body = new CustomAudienceShareBody(); // CustomAudienceShareBody | 
try {
    Response result = apiInstance.dmpCustomAudienceShare(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CustomAudienceShareBody**](CustomAudienceShareBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceShareCancel"></a>
# **dmpCustomAudienceShareCancel**
> Response dmpCustomAudienceShareCancel(accessToken, body)

Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245829978113)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
ShareCancelBody body = new ShareCancelBody(); // ShareCancelBody | 
try {
    Response result = apiInstance.dmpCustomAudienceShareCancel(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceShareCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**ShareCancelBody**](ShareCancelBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceShareLog"></a>
# **dmpCustomAudienceShareLog**
> Response dmpCustomAudienceShareLog(advertiserId, customAudienceId, accessToken, contextInfo)

Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
String customAudienceId = "customAudienceId_example"; // String | Custom audiences that you want to get sharing log for.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Object contextInfo = null; // Object | 
try {
    Response result = apiInstance.dmpCustomAudienceShareLog(advertiserId, customAudienceId, accessToken, contextInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceShareLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **customAudienceId** | **String**| Custom audiences that you want to get sharing log for. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **contextInfo** | [**Object**](Object.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceUpdate"></a>
# **dmpCustomAudienceUpdate**
> Response dmpCustomAudienceUpdate(accessToken, body)

Update the details of an audience [Dmp Custom_audience Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940572667906)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CustomAudienceUpdateBody body = new CustomAudienceUpdateBody(); // CustomAudienceUpdateBody | 
try {
    Response result = apiInstance.dmpCustomAudienceUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpCustomAudienceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CustomAudienceUpdateBody**](CustomAudienceUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpSavedAudienceCreate"></a>
# **dmpSavedAudienceCreate**
> Response dmpSavedAudienceCreate(accessToken, body)

Create a Saved Audience [Dmp Saved_audience Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154541898754)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SavedAudienceCreateBody body = new SavedAudienceCreateBody(); // SavedAudienceCreateBody | 
try {
    Response result = apiInstance.dmpSavedAudienceCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpSavedAudienceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SavedAudienceCreateBody**](SavedAudienceCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpSavedAudienceDelete"></a>
# **dmpSavedAudienceDelete**
> Response dmpSavedAudienceDelete(accessToken, body)

Delete Saved Audiences [Dmp Saved_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154666312706)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
SavedAudienceDeleteBody body = new SavedAudienceDeleteBody(); // SavedAudienceDeleteBody | 
try {
    Response result = apiInstance.dmpSavedAudienceDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpSavedAudienceDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**SavedAudienceDeleteBody**](SavedAudienceDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpSavedAudienceList"></a>
# **dmpSavedAudienceList**
> Response dmpSavedAudienceList(advertiserId, accessToken, savedAudienceIds, page, pageSize)

Get the details of Saved Audiences [Dmp Saved_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154619404290)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> savedAudienceIds = Arrays.asList("savedAudienceIds_example"); // List<String> | IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/.
Integer page = 1; // Integer | 
Integer pageSize = 10; // Integer | 
try {
    Response result = apiInstance.dmpSavedAudienceList(advertiserId, accessToken, savedAudienceIds, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudienceApi#dmpSavedAudienceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **savedAudienceIds** | [**List&lt;String&gt;**](String.md)| IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/. | [optional]
 **page** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 10] [enum: 1, 100]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

