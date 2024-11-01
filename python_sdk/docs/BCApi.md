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
[**bc_asset_get**](BCApi.md#bc_asset_get) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)
[**bc_get**](BCApi.md#bc_get) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)
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
> InlineResponse200 bc_asset_get(bc_id, asset_type, access_token, filtering=filtering, page=page, page_size=page_size)

Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id=1739432717798401)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | Business Center ID
asset_type = 'asset_type_example' # str | Type of asset that you want to get. Enum values: `CATALOG`, `ADVERTISER`, `PIXEL`, `LEAD`, `TT_ACCOUNT`(corresponds to `BC_AUTH_TT`, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097), `TIKTOK_SHOP` (TikTok shop) , `STOREFRONT`( TikTok Storefront (third-party store))
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.Filtering() # Filtering | Filtering conditions. Use either `user_id` or `user_email` as filter.Note: You cannot use `user_id` and `user_email` at the same time.If you do not specify any filter values, the system will pass in to the `user_id` field the user ID of the TikTok for Business account that gives you the authentication code (`auth_code`) (optional)
page = 56 # int | Current page number. Default value: 1 (optional)
page_size = 56 # int | Page size, in the range of 1-50. Default value: 10 (optional)

try:
    # Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id=1739432717798401)
    api_response = api_instance.bc_asset_get(bc_id, asset_type, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**| Business Center ID | [required]
 **asset_type** | **str**| Type of asset that you want to get. Enum values: &#x60;CATALOG&#x60;, &#x60;ADVERTISER&#x60;, &#x60;PIXEL&#x60;, &#x60;LEAD&#x60;, &#x60;TT_ACCOUNT&#x60;(corresponds to &#x60;BC_AUTH_TT&#x60;, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097), &#x60;TIKTOK_SHOP&#x60; (TikTok shop) , &#x60;STOREFRONT&#x60;( TikTok Storefront (third-party store)) | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**Filtering**](Filtering.md)| Filtering conditions. Use either &#x60;user_id&#x60; or &#x60;user_email&#x60; as filter.Note: You cannot use &#x60;user_id&#x60; and &#x60;user_email&#x60; at the same time.If you do not specify any filter values, the system will pass in to the &#x60;user_id&#x60; field the user ID of the TikTok for Business account that gives you the authentication code (&#x60;auth_code&#x60;) | [optional] 
 **page** | **int**| Current page number. Default value: 1 | [optional] 
 **page_size** | **int**| Page size, in the range of 1-50. Default value: 10 | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_get**
> InlineResponse200 bc_get(access_token, bc_id=bc_id, page=page, page_size=page_size)

Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id=1737115687501826)

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
bc_id = 'bc_id_example' # str | The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in (optional)
page = 56 # int | Current number of pages. Default value: 1. Value range : ≥ 1 (optional)
page_size = 56 # int | Page size. Default value: 10. Value range: 1-50 (optional)

try:
    # Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id=1737115687501826)
    api_response = api_instance.bc_get(access_token, bc_id=bc_id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **bc_id** | **str**| The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in | [optional] 
 **page** | **int**| Current number of pages. Default value: 1. Value range : ≥ 1 | [optional] 
 **page_size** | **int**| Page size. Default value: 10. Value range: 1-50 | [optional] 

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

