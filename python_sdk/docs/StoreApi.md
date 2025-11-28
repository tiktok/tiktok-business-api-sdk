"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.StoreApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gmv_max_exclusive_authorization_create**](StoreApi.md#gmv_max_exclusive_authorization_create) | **POST** /open_api/v1.3/gmv_max/exclusive_authorization/create/ | Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001200356354)
[**gmv_max_exclusive_authorization_get**](StoreApi.md#gmv_max_exclusive_authorization_get) | **GET** /open_api/v1.3/gmv_max/exclusive_authorization/get/ | Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001184635905)
[**gmv_max_store_list**](StoreApi.md#gmv_max_store_list) | **GET** /open_api/v1.3/gmv_max/store/list/ | Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001044479041)
[**gmv_max_store_shop_ad_usage_check**](StoreApi.md#gmv_max_store_shop_ad_usage_check) | **GET** /open_api/v1.3/gmv_max/store/shop_ad_usage_check/ | Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001084174338)

# **gmv_max_exclusive_authorization_create**
> InlineResponse200 gmv_max_exclusive_authorization_create(access_token, body=body)

Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id=1822001200356354)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.StoreApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ExclusiveAuthorizationCreateBody() # ExclusiveAuthorizationCreateBody |  (optional)

try:
    # Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id=1822001200356354)
    api_response = api_instance.gmv_max_exclusive_authorization_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StoreApi->gmv_max_exclusive_authorization_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ExclusiveAuthorizationCreateBody**](ExclusiveAuthorizationCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gmv_max_exclusive_authorization_get**
> InlineResponse200 gmv_max_exclusive_authorization_get(advertiser_id, store_id, store_authorized_bc_id, access_token)

Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id=1822001184635905)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.StoreApi()
advertiser_id = 'advertiser_id_example' # str | 
store_id = 'store_id_example' # str | 
store_authorized_bc_id = 'store_authorized_bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id=1822001184635905)
    api_response = api_instance.gmv_max_exclusive_authorization_get(advertiser_id, store_id, store_authorized_bc_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StoreApi->gmv_max_exclusive_authorization_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **store_id** | **str**|  | [required]
 **store_authorized_bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gmv_max_store_list**
> InlineResponse200 gmv_max_store_list(advertiser_id, access_token)

Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id=1822001044479041)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.StoreApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id=1822001044479041)
    api_response = api_instance.gmv_max_store_list(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StoreApi->gmv_max_store_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gmv_max_store_shop_ad_usage_check**
> InlineResponse200 gmv_max_store_shop_ad_usage_check(advertiser_id, store_id, access_token)

Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id=1822001084174338)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.StoreApi()
advertiser_id = 'advertiser_id_example' # str | 
store_id = 'store_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id=1822001084174338)
    api_response = api_instance.gmv_max_store_shop_ad_usage_check(advertiser_id, store_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StoreApi->gmv_max_store_shop_ad_usage_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **store_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

