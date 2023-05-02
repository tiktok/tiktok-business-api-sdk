# FileApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adImageInfo**](FileApi.md#adImageInfo) | **GET** /open_api/v1.3/file/image/ad/info/ | The function is used to obtain the information of images from the Asset Library. [File image info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740051721711618)
[**adImageUpload**](FileApi.md#adImageUpload) | **POST** /open_api/v1.3/file/image/ad/upload/ | The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642)
[**adVideoInfo**](FileApi.md#adVideoInfo) | **GET** /open_api/v1.3/file/video/ad/info/ | The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050161973250) from the Asset Library.
[**adVideoSearch**](FileApi.md#adVideoSearch) | **GET** /open_api/v1.3/file/video/ad/search/ | The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.
[**adVideoUpload**](FileApi.md#adVideoUpload) | **POST** /open_api/v1.3/file/video/ad/upload/ | The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)

<a name="adImageInfo"></a>
# **adImageInfo**
> Response adImageInfo(advertiserId, imageIds, accessToken)

The function is used to obtain the information of images from the Asset Library. [File image info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740051721711618)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.FileApi;


FileApi apiInstance = new FileApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
List<String> imageIds = Arrays.asList("imageIds_example"); // List<String> | Image ID list. Up to 100 IDs per request.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.adImageInfo(advertiserId, imageIds, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#adImageInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **imageIds** | [**List&lt;String&gt;**](String.md)| Image ID list. Up to 100 IDs per request. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
**advertiserId** | **String** | Advertiser ID |[required]  
**fileId** | **String** | The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. |  [optional]
**fileName** | **String** | Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off. |  [optional]
**imageFile** | [**File**](File.md) | Picture file, required when upload_type is UPLOAD_BY_FILE. |  [optional]
**imageSignature** | **String** | Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE. |  [optional]
**imageUrl** | **String** | Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. |  [optional]
**uploadType** | **String** | Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID. |  [optional]

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
**advertiserId** | **String** | Advertiser ID |  [required]
**autoBindEnabled** | **Boolean** | Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect &#x3D; True and auto_fix_enabled &#x3D; True. |  [optional]
**autoFixEnabled** | **Boolean** | Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled &#x3D; False, then well return an error message with flaw types indicated. \\n auto_fix_enabled &#x3D;True, then well automatically fix all the issues and return fix_task_id and flaw_types. |  [optional]
**fileId** | **String** | The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. |  [optional]
**fileName** | **String** | Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again. |  [optional]
**flawDetect** | **Boolean** | Whether to automatically detect an issue in your video. Default value is False. |  [optional]
**isThirdParty** | **Boolean** | The video is third party or not. |  [optional]
**uploadType** | **String** | Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID. |  [optional]
**videoFile** | [**File**](File.md) | Video file. Required when upload_type is UPLOAD_BY_FILE. |  [optional]
**videoId** | **String** | Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID. |  [optional]
**videoSignature** | **String** | Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE. |  [optional]
**videoUrl** | **String** | Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file. |  [optional]


### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

