"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.FileApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_image_info**](FileApi.md#ad_image_info) | **GET** /open_api/v1.3/file/image/ad/info/ | The function is used to obtain the information of images from the Asset Library. [File image info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740051721711618)
[**ad_image_upload**](FileApi.md#ad_image_upload) | **POST** /open_api/v1.3/file/image/ad/upload/ | The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739067433456642)
[**ad_video_info**](FileApi.md#ad_video_info) | **GET** /open_api/v1.3/file/video/ad/info/ | The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740050161973250) from the Asset Library.
[**ad_video_search**](FileApi.md#ad_video_search) | **GET** /open_api/v1.3/file/video/ad/search/ | The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.
[**ad_video_upload**](FileApi.md#ad_video_upload) | **POST** /open_api/v1.3/file/video/ad/upload/ | The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737587322856449)

# **ad_image_info**
> InlineResponse200 ad_image_info(advertiser_id, image_ids, access_token)

The function is used to obtain the information of images from the Asset Library. [File image info](https://ads.tiktok.com/marketing_api/docs?id=1740051721711618)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.FileApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
image_ids = ['image_ids_example'] # list[str] | Image ID list. Up to 100 IDs per request.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # The function is used to obtain the information of images from the Asset Library. [File image info](https://ads.tiktok.com/marketing_api/docs?id=1740051721711618)
    api_response = api_instance.ad_image_info(advertiser_id, image_ids, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FileApi->ad_image_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **image_ids** | [**list[str]**](str.md)| Image ID list. Up to 100 IDs per request. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_image_upload**
> InlineResponse200 ad_image_upload(access_token, advertiser_id=advertiser_id, file_id=file_id, file_name=file_name, image_file=image_file, image_signature=image_signature, image_url=image_url, upload_type=upload_type)

The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.FileApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
advertiser_id = 'advertiser_id_example' # str |  (optional)
file_id = 'file_id_example' # str |  (optional)
file_name = 'file_name_example' # str |  (optional)
image_file = 'image_file_example' # str |  (optional)
image_signature = 'image_signature_example' # str |  (optional)
image_url = 'image_url_example' # str |  (optional)
upload_type = 'upload_type_example' # str |  (optional)

try:
    # The function is used to  to upload pictures to the Asset Library and use the obtained image ID for creating ads. [File image Upload](https://ads.tiktok.com/marketing_api/docs?id=1739067433456642)
    api_response = api_instance.ad_image_upload(access_token, advertiser_id=advertiser_id, file_id=file_id, file_name=file_name, image_file=image_file, image_signature=image_signature, image_url=image_url, upload_type=upload_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FileApi->ad_image_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
**advertiser_id** | **str** | Advertiser ID | [required] 
**file_id** | **str** | The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. | [optional] 
**file_name** | **str** | Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off. | [optional] 
**image_file** | **str** | Picture file, required when upload_type is UPLOAD_BY_FILE. | [optional] 
**image_signature** | **str** | Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**image_url** | **str** | Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. | [optional] 
**upload_type** | **str** | Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_video_info**
> InlineResponse200 ad_video_info(advertiser_id, video_ids, access_token)

The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id=1740050161973250) from the Asset Library.

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.FileApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
video_ids = ['video_ids_example'] # list[str] | Video ID list. Up to 60 IDs per request.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # The function is used to get the information about a list of videos [File Video Ad Info](https://ads.tiktok.com/marketing_api/docs?id=1740050161973250) from the Asset Library.
    api_response = api_instance.ad_video_info(advertiser_id, video_ids, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FileApi->ad_video_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **video_ids** | [**list[str]**](str.md)| Video ID list. Up to 60 IDs per request. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_video_search**
> InlineResponse200 ad_video_search(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size)

The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.FileApi()
advertiser_id = 'advertiser_id_example' # str | Video ID list. Up to 60 IDs per request.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringVideoAdSearch() # FilteringVideoAdSearch | Filters on the data. This parameter is an array of filter objects. (optional)
page = 56 # int | Current page number. Default value: 1. Value range: ≥ 1. (optional)
page_size = 56 # int | Page size. Default value: 20. Value range: 1-100. (optional)

try:
    # The function is used to to search for video creatives in the Asset Library of an ad account. [File Video Search](to search for video creatives in the Asset Library of an ad account.) Library.
    api_response = api_instance.ad_video_search(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FileApi->ad_video_search: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Video ID list. Up to 60 IDs per request. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringVideoAdSearch**](FilteringVideoAdSearch.md)| Filters on the data. This parameter is an array of filter objects. | [optional] 
 **page** | **int**| Current page number. Default value: 1. Value range: ≥ 1. | [optional] 
 **page_size** | **int**| Page size. Default value: 20. Value range: 1-100. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_video_upload**
> InlineResponse200 ad_video_upload(access_token, advertiser_id=advertiser_id, auto_bind_enabled=auto_bind_enabled, auto_fix_enabled=auto_fix_enabled, file_id=file_id, file_name=file_name, flaw_detect=flaw_detect, is_third_party=is_third_party, upload_type=upload_type, video_file=video_file, video_id=video_id, video_signature=video_signature, video_url=video_url)

The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.FileApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
advertiser_id = 'advertiser_id_example' # str |  (optional)
auto_bind_enabled = true # bool |  (optional)
auto_fix_enabled = true # bool |  (optional)
file_id = 'file_id_example' # str |  (optional)
file_name = 'file_name_example' # str |  (optional)
flaw_detect = true # bool |  (optional)
is_third_party = true # bool |  (optional)
upload_type = 'upload_type_example' # str |  (optional)
video_file = 'video_file_example' # str |  (optional)
video_id = 'video_id_example' # str |  (optional)
video_signature = 'video_signature_example' # str |  (optional)
video_url = 'video_url_example' # str |  (optional)

try:
    # The function is used to upload a video to the Asset Library and use the obtained video ID for creating ads. [File Video Upload](https://ads.tiktok.com/marketing_api/docs?id=1737587322856449)
    api_response = api_instance.ad_video_upload(access_token, advertiser_id=advertiser_id, auto_bind_enabled=auto_bind_enabled, auto_fix_enabled=auto_fix_enabled, file_id=file_id, file_name=file_name, flaw_detect=flaw_detect, is_third_party=is_third_party, upload_type=upload_type, video_file=video_file, video_id=video_id, video_signature=video_signature, video_url=video_url)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FileApi->ad_video_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
**advertiser_id** | **str** | Advertiser ID | [required] 
**auto_bind_enabled** | **bool** | Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect &#x3D; True and auto_fix_enabled &#x3D; True. | [optional] 
**auto_fix_enabled** | **bool** | Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled &#x3D; False, then well return an error message with flaw types indicated. \\n auto_fix_enabled &#x3D;True, then well automatically fix all the issues and return fix_task_id and flaw_types. | [optional] 
**file_id** | **str** | The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. | [optional] 
**file_name** | **str** | Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again. | [optional] 
**flaw_detect** | **bool** | Whether to automatically detect an issue in your video. Default value is False. | [optional] 
**is_third_party** | **bool** | The video is third party or not. | [optional] 
**upload_type** | **str** | Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID. | [optional] 
**video_file** | **str** | Video file. Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**video_id** | **str** | Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID. | [optional] 
**video_signature** | **str** | Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**video_url** | **str** | Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file. | [optional] 


### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

