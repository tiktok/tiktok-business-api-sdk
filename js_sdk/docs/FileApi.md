# js_sdk.FileApi

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
 **advertiser_id** | **String**|  | [optional] 
 **file_id** | **String**|  | [optional] 
 **file_name** | **String**|  | [optional] 
 **image_file** | **Blob**|  | [optional] 
 **image_signature** | **String**|  | [optional] 
 **image_url** | **String**|  | [optional] 
 **upload_type** | **String**|  | [optional] 

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
 **advertiser_id** | **String**|  | [optional] 
 **auto_bind_enabled** | **Boolean**|  | [optional] 
 **auto_fix_enabled** | **Boolean**|  | [optional] 
 **file_id** | **String**|  | [optional] 
 **file_name** | **String**|  | [optional] 
 **flaw_detect** | **Boolean**|  | [optional] 
 **is_third_party** | **Boolean**|  | [optional] 
 **upload_type** | **String**|  | [optional] 
 **video_file** | **Blob**|  | [optional] 
 **video_id** | **String**|  | [optional] 
 **video_signature** | **String**|  | [optional] 
 **video_url** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="fileImageAdInfo"></a>
# **fileImageAdInfo**
> InlineResponse200 fileImageAdInfo(advertiser_id, image_ids, Access_Token)

Get image information. [File Image Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740051721711618)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.FileApi();
let advertiser_id = "advertiser_id_example"; // String | 
let image_ids = ["image_ids_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.fileImageAdInfo(advertiser_id, image_ids, Access_Token, (error, data, response) => {
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
 **advertiser_id** | **String**|  |[required]  
 **image_ids** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

