"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.BCApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bc_advertiser_create**](BCApi.md#bc_advertiser_create) | **POST** /open_api/v1.3/bc/advertiser/create/ | Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
[**bc_asset_get**](BCApi.md#bc_asset_get) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)
[**bc_get**](BCApi.md#bc_get) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)
[**bc_image_upload**](BCApi.md#bc_image_upload) | **POST** /open_api/v1.3/bc/image/upload/ | Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)

# **bc_advertiser_create**
> InlineResponse200 bc_advertiser_create(access_token, body=body)

Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id=1739939020318721)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdvertiserCreateBody() # AdvertiserCreateBody | BC advertiser create body parameters (optional)

try:
    # Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id=1739939020318721)
    api_response = api_instance.bc_advertiser_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_advertiser_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdvertiserCreateBody**](AdvertiserCreateBody.md)| BC advertiser create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_get**
> InlineResponse200 bc_asset_get(bc_id, asset_type, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)

Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id=1739432717798401)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
asset_type = 'asset_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)
filtering = NULL # object |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id=1739432717798401)
    api_response = api_instance.bc_asset_get(bc_id, asset_type, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **asset_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 
 **filtering** | [**object**](object.md)|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_get**
> InlineResponse200 bc_get(access_token, bc_id=bc_id, scene=scene, filtering=filtering, page=page, page_size=page_size)

Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id=1737115687501826)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
bc_id = 'bc_id_example' # str |  (optional)
scene = 'SINGLE_ACCOUNT' # str |  (optional) (default to SINGLE_ACCOUNT)
filtering = NULL # object |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id=1737115687501826)
    api_response = api_instance.bc_get(access_token, bc_id=bc_id, scene=scene, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **bc_id** | **str**|  | [optional] 
 **scene** | **str**|  | [optional] [default to SINGLE_ACCOUNT]
 **filtering** | [**object**](object.md)|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_image_upload**
> InlineResponse200 bc_image_upload(access_token, bc_id=bc_id, image_file=image_file)

Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id=1739938996913218)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
bc_id = 'bc_id_example' # str |  (optional)
image_file = 'image_file_example' # str |  (optional)

try:
    # Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id=1739938996913218)
    api_response = api_instance.bc_image_upload(access_token, bc_id=bc_id, image_file=image_file)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_image_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **bc_id** | **str**|  | [optional] 
 **image_file** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

