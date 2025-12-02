# VideoApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gmvMaxVideoGet**](VideoApi.md#gmvMaxVideoGet) | **GET** /open_api/v1.3/gmv_max/video/get/ | Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)

<a name="gmvMaxVideoGet"></a>
# **gmvMaxVideoGet**
> Response gmvMaxVideoGet(advertiserId, storeId, storeAuthorizedBcId, accessToken, spuIdList, identityList, needAuthCodeVideo, page, pageSize, customPostsEligible, sortField, sortType, keyword)

Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.VideoApi;


VideoApi apiInstance = new VideoApi();
String advertiserId = "advertiserId_example"; // String | 
String storeId = "storeId_example"; // String | 
String storeAuthorizedBcId = "storeAuthorizedBcId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> spuIdList = Arrays.asList("spuIdList_example"); // List<String> | 
List<IdentityList> identityList = Arrays.asList(new IdentityList()); // List<IdentityList> | 
Boolean needAuthCodeVideo = true; // Boolean | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
Boolean customPostsEligible = true; // Boolean | 
String sortField = "sortField_example"; // String | 
String sortType = "DESC"; // String | 
String keyword = "keyword_example"; // String | 
try {
    Response result = apiInstance.gmvMaxVideoGet(advertiserId, storeId, storeAuthorizedBcId, accessToken, spuIdList, identityList, needAuthCodeVideo, page, pageSize, customPostsEligible, sortField, sortType, keyword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoApi#gmvMaxVideoGet");
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
 **spuIdList** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **identityList** | [**List&lt;IdentityList&gt;**](IdentityList.md)|  | [optional]
 **needAuthCodeVideo** | **Boolean**|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: ]
 **customPostsEligible** | **Boolean**|  | [optional]
 **sortField** | **String**|  | [optional]
 **sortType** | **String**|  | [optional] [default to DESC]
 **keyword** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

