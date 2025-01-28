# FileApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adImageUpload**](FileApi.md#adImageUpload) | **POST** /open_api/v1.3/file/image/ad/upload/ | The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642)
[**adVideoInfo**](FileApi.md#adVideoInfo) | **GET** /open_api/v1.3/file/video/ad/info/ | The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050161973250) from the Asset Library.
[**adVideoSearch**](FileApi.md#adVideoSearch) | **GET** /open_api/v1.3/file/video/ad/search/ | The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.
[**adVideoUpload**](FileApi.md#adVideoUpload) | **POST** /open_api/v1.3/file/video/ad/upload/ | The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)
[**fileImageAdInfo**](FileApi.md#fileImageAdInfo) | **GET** /open_api/v1.3/file/image/ad/info/ | Get image information. [File Image Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740051721711618)

<a name="adImageUpload"></a>
# **adImageUpload**
> Response adImageUpload(accessToken, advertiserId, fileId, fileName, imageFile, imageSignature, imageUrl, uploadType)

The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.FileApi;


FileApi apiInstance = new FileApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String advertiserId = "advertiserId_example"; // String | 
String fileId = "fileId_example"; // String | 
String fileName = "fileName_example"; // String | 
File imageFile = new File("imageFile_example"); // File | 
String imageSignature = "imageSignature_example"; // String | 
String imageUrl = "imageUrl_example"; // String | 
String uploadType = "uploadType_example"; // String | 
try {
    Response result = apiInstance.adImageUpload(accessToken, advertiserId, fileId, fileName, imageFile, imageSignature, imageUrl, uploadType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#adImageUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **advertiserId** | **String**|  | [optional]
 **fileId** | **String**|  | [optional]
 **fileName** | **String**|  | [optional]
 **imageFile** | **File**|  | [optional]
 **imageSignature** | **String**|  | [optional]
 **imageUrl** | **String**|  | [optional]
 **uploadType** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="adVideoInfo"></a>
# **adVideoInfo**
> Response adVideoInfo(advertiserId, videoIds, accessToken)

The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050161973250) from the Asset Library.

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.FileApi;


FileApi apiInstance = new FileApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
List<String> videoIds = Arrays.asList("videoIds_example"); // List<String> | Video ID list. Up to 60 IDs per request.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.adVideoInfo(advertiserId, videoIds, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#adVideoInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **videoIds** | [**List&lt;String&gt;**](String.md)| Video ID list. Up to 60 IDs per request. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adVideoSearch"></a>
# **adVideoSearch**
> Response adVideoSearch(advertiserId, accessToken, filtering, page, pageSize)

The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.FileApi;


FileApi apiInstance = new FileApi();
String advertiserId = "advertiserId_example"; // String | Video ID list. Up to 60 IDs per request.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringVideoAdSearch filtering = new FilteringVideoAdSearch(); // FilteringVideoAdSearch | Filters on the data. This parameter is an array of filter objects.
Integer page = 56; // Integer | Current page number. Default value: 1. Value range: ≥ 1.
Integer pageSize = 56; // Integer | Page size. Default value: 20. Value range: 1-100.
try {
    Response result = apiInstance.adVideoSearch(advertiserId, accessToken, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#adVideoSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Video ID list. Up to 60 IDs per request. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringVideoAdSearch**](FilteringVideoAdSearch.md)| Filters on the data. This parameter is an array of filter objects. | [optional]
 **page** | **Integer**| Current page number. Default value: 1. Value range: ≥ 1. | [optional]
 **pageSize** | **Integer**| Page size. Default value: 20. Value range: 1-100. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adVideoUpload"></a>
# **adVideoUpload**
> Response adVideoUpload(accessToken, advertiserId, autoBindEnabled, autoFixEnabled, fileId, fileName, flawDetect, isThirdParty, uploadType, videoFile, videoId, videoSignature, videoUrl)

The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.FileApi;


FileApi apiInstance = new FileApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String advertiserId = "advertiserId_example"; // String | 
Boolean autoBindEnabled = true; // Boolean | 
Boolean autoFixEnabled = true; // Boolean | 
String fileId = "fileId_example"; // String | 
String fileName = "fileName_example"; // String | 
Boolean flawDetect = true; // Boolean | 
Boolean isThirdParty = true; // Boolean | 
String uploadType = "uploadType_example"; // String | 
File videoFile = new File("videoFile_example"); // File | 
String videoId = "videoId_example"; // String | 
String videoSignature = "videoSignature_example"; // String | 
String videoUrl = "videoUrl_example"; // String | 
try {
    Response result = apiInstance.adVideoUpload(accessToken, advertiserId, autoBindEnabled, autoFixEnabled, fileId, fileName, flawDetect, isThirdParty, uploadType, videoFile, videoId, videoSignature, videoUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#adVideoUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **advertiserId** | **String**|  | [optional]
 **autoBindEnabled** | **Boolean**|  | [optional]
 **autoFixEnabled** | **Boolean**|  | [optional]
 **fileId** | **String**|  | [optional]
 **fileName** | **String**|  | [optional]
 **flawDetect** | **Boolean**|  | [optional]
 **isThirdParty** | **Boolean**|  | [optional]
 **uploadType** | **String**|  | [optional]
 **videoFile** | **File**|  | [optional]
 **videoId** | **String**|  | [optional]
 **videoSignature** | **String**|  | [optional]
 **videoUrl** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="fileImageAdInfo"></a>
# **fileImageAdInfo**
> Response fileImageAdInfo(advertiserId, imageIds, accessToken)

Get image information. [File Image Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740051721711618)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.FileApi;


FileApi apiInstance = new FileApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> imageIds = Arrays.asList("imageIds_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.fileImageAdInfo(advertiserId, imageIds, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#fileImageAdInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **imageIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

