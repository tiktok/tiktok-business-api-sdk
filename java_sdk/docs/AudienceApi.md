# AudienceApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dmpCustomAudienceList**](AudienceApi.md#dmpCustomAudienceList) | **GET** /open_api/v1.3/dmp/custom_audience/list/ | Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)

<a name="dmpCustomAudienceList"></a>
# **dmpCustomAudienceList**
> Response dmpCustomAudienceList(advertiserId, accessToken, customAudienceIds, page, pageSize)

Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AudienceApi;


AudienceApi apiInstance = new AudienceApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> customAudienceIds = Arrays.asList("customAudienceIds_example"); // List<String> | A list of Audience IDs. Length range is [1, 100]
Integer page = 56; // Integer | Current page number. Default value: 1. Value range: ≥ 1
Integer pageSize = 56; // Integer | Page size. Defaults is 10. Value range: 1-100
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
 **advertiserId** | **String**| Advertiser ID |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **customAudienceIds** | [**List&lt;String&gt;**](String.md)| A list of Audience IDs. Length range is [1, 100] | [optional]
 **page** | **Integer**| Current page number. Default value: 1. Value range: ≥ 1 | [optional]
 **pageSize** | **Integer**| Page size. Defaults is 10. Value range: 1-100 | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

