# js_sdk.FileApi

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
> InlineResponse200 adImageInfo(advertiser_id, image_ids, Access_Token)

The function is used to obtain the information of images from the Asset Library. [File image info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740051721711618)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.FileApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let image_ids = ["image_ids_example"]; // [String] | Image ID list. Up to 100 IDs per request.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.adImageInfo(advertiser_id, image_ids, Access_Token, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**| Advertiser ID. |[required]  
 **image_ids** | [**[String]**](String.md)| Image ID list. Up to 100 IDs per request. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adImageUpload"></a>
# **adImageUpload**
> InlineResponse200 adImageUpload(Access_Token, opts)

The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.FileApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'advertiser_id': "advertiser_id_example", // String | 
  'file_id': "file_id_example", // String | 
  'file_name': "file_name_example", // String | 
  'image_file': "image_file_example", // Blob | 
  'image_signature': "image_signature_example", // String | 
  'image_url': "image_url_example", // String | 
  'upload_type': "upload_type_example" // String | 
};
apiInstance.adImageUpload(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
**advertiser_id** | **String** | Advertiser ID | [required] 
**file_id** | **String** | The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. | [optional] 
**file_name** | **String** | Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off. | [optional] 
**image_file** | **Blob** | Picture file, required when upload_type is UPLOAD_BY_FILE. | [optional] 
**image_signature** | **String** | Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**image_url** | **String** | Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. | [optional] 
**upload_type** | **String** | Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID. | [optional] 


### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="adVideoInfo"></a>
# **adVideoInfo**
> InlineResponse200 adVideoInfo(advertiser_id, video_ids, Access_Token)

The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050161973250) from the Asset Library.

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.FileApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let video_ids = ["video_ids_example"]; // [String] | Video ID list. Up to 60 IDs per request.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.adVideoInfo(advertiser_id, video_ids, Access_Token, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**| Advertiser ID. |[required]  
 **video_ids** | [**[String]**](String.md)| Video ID list. Up to 60 IDs per request. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adVideoSearch"></a>
# **adVideoSearch**
> InlineResponse200 adVideoSearch(advertiser_id, Access_Token, opts)

The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.FileApi();
let advertiser_id = "advertiser_id_example"; // String | Video ID list. Up to 60 IDs per request.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringVideoAdSearch(), // FilteringVideoAdSearch | Filters on the data. This parameter is an array of filter objects.
  'page': 56, // Number | Current page number. Default value: 1. Value range: ≥ 1.
  'page_size': 56 // Number | Page size. Default value: 20. Value range: 1-100.
};
apiInstance.adVideoSearch(advertiser_id, Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**| Video ID list. Up to 60 IDs per request. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringVideoAdSearch**](FilteringVideoAdSearch.md)| Filters on the data. This parameter is an array of filter objects. | [optional] 
 **page** | **Number**| Current page number. Default value: 1. Value range: ≥ 1. | [optional] 
 **page_size** | **Number**| Page size. Default value: 20. Value range: 1-100. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adVideoUpload"></a>
# **adVideoUpload**
> InlineResponse200 adVideoUpload(Access_Token, opts)

The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.FileApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'advertiser_id': "advertiser_id_example", // String | 
  'auto_bind_enabled': true, // Boolean | 
  'auto_fix_enabled': true, // Boolean | 
  'file_id': "file_id_example", // String | 
  'file_name': "file_name_example", // String | 
  'flaw_detect': true, // Boolean | 
  'is_third_party': true, // Boolean | 
  'upload_type': "upload_type_example", // String | 
  'video_file': "video_file_example", // Blob | 
  'video_id': "video_id_example", // String | 
  'video_signature': "video_signature_example", // String | 
  'video_url': "video_url_example" // String | 
};
apiInstance.adVideoUpload(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
**advertiser_id** | **String** | Advertiser ID | [required] 
**auto_bind_enabled** | **Boolean** | Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect &#x3D; True and auto_fix_enabled &#x3D; True. | [optional] 
**auto_fix_enabled** | **Boolean** | Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled &#x3D; False, then well return an error message with flaw types indicated. \\n auto_fix_enabled &#x3D;True, then well automatically fix all the issues and return fix_task_id and flaw_types. | [optional] 
**file_id** | **String** | The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. | [optional] 
**file_name** | **String** | Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again. | [optional] 
**flaw_detect** | **Boolean** | Whether to automatically detect an issue in your video. Default value is False. | [optional] 
**is_third_party** | **Boolean** | The video is third party or not. | [optional] 
**upload_type** | **String** | Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID. | [optional] 
**video_file** | **Blob** | Video file. Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**video_id** | **String** | Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID. | [optional] 
**video_signature** | **String** | Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**video_url** | **String** | Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

