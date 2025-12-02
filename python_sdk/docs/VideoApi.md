"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.VideoApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gmv_max_video_get**](VideoApi.md#gmv_max_video_get) | **GET** /open_api/v1.3/gmv_max/video/get/ | Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)

# **gmv_max_video_get**
> InlineResponse200 gmv_max_video_get(advertiser_id, store_id, store_authorized_bc_id, access_token, spu_id_list=spu_id_list, identity_list=identity_list, need_auth_code_video=need_auth_code_video, page=page, page_size=page_size, custom_posts_eligible=custom_posts_eligible, sort_field=sort_field, sort_type=sort_type, keyword=keyword)

Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id=1822001168512129)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.VideoApi()
advertiser_id = 'advertiser_id_example' # str | 
store_id = 'store_id_example' # str | 
store_authorized_bc_id = 'store_authorized_bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
spu_id_list = ['spu_id_list_example'] # list[str] |  (optional)
identity_list = [business_api_client.IdentityList()] # list[IdentityList] |  (optional)
need_auth_code_video = true # bool |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
custom_posts_eligible = true # bool |  (optional)
sort_field = 'sort_field_example' # str |  (optional)
sort_type = 'DESC' # str |  (optional) (default to DESC)
keyword = 'keyword_example' # str |  (optional)

try:
    # Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id=1822001168512129)
    api_response = api_instance.gmv_max_video_get(advertiser_id, store_id, store_authorized_bc_id, access_token, spu_id_list=spu_id_list, identity_list=identity_list, need_auth_code_video=need_auth_code_video, page=page, page_size=page_size, custom_posts_eligible=custom_posts_eligible, sort_field=sort_field, sort_type=sort_type, keyword=keyword)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VideoApi->gmv_max_video_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **store_id** | **str**|  | [required]
 **store_authorized_bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **spu_id_list** | [**list[str]**](str.md)|  | [optional] 
 **identity_list** | [**list[IdentityList]**](IdentityList.md)|  | [optional] 
 **need_auth_code_video** | **bool**|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]
 **custom_posts_eligible** | **bool**|  | [optional] 
 **sort_field** | **str**|  | [optional] 
 **sort_type** | **str**|  | [optional] [default to DESC]
 **keyword** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

