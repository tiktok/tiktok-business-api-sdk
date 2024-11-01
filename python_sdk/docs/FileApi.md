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
 **advertiser_id** | **str**|  | [optional] 
 **file_id** | **str**|  | [optional] 
 **file_name** | **str**|  | [optional] 
 **image_file** | **str**|  | [optional] 
 **image_signature** | **str**|  | [optional] 
 **image_url** | **str**|  | [optional] 
 **upload_type** | **str**|  | [optional] 

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
 **advertiser_id** | **str**|  | [optional] 
 **auto_bind_enabled** | **bool**|  | [optional] 
 **auto_fix_enabled** | **bool**|  | [optional] 
 **file_id** | **str**|  | [optional] 
 **file_name** | **str**|  | [optional] 
 **flaw_detect** | **bool**|  | [optional] 
 **is_third_party** | **bool**|  | [optional] 
 **upload_type** | **str**|  | [optional] 
 **video_file** | **str**|  | [optional] 
 **video_id** | **str**|  | [optional] 
 **video_signature** | **str**|  | [optional] 
 **video_url** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

