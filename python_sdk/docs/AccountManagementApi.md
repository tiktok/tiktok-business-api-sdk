"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AccountManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_info**](AccountManagementApi.md#advertiser_info) | **GET** /open_api/v1.3/advertiser/info/ | Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1739593083610113)
[**advertiser_update**](AccountManagementApi.md#advertiser_update) | **POST** /open_api/v1.3/advertiser/update/ | Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939050770434)
[**pangle_audience_package_get**](AccountManagementApi.md#pangle_audience_package_get) | **GET** /open_api/v1.3/pangle_audience_package/get/ | Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040177229826)
[**pangle_block_list_get**](AccountManagementApi.md#pangle_block_list_get) | **GET** /open_api/v1.3/pangle_block_list/get/ | Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740039957181441)
[**pangle_block_list_update**](AccountManagementApi.md#pangle_block_list_update) | **POST** /open_api/v1.3/pangle_block_list/update/ | Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040139110466)
[**term_check**](AccountManagementApi.md#term_check) | **GET** /open_api/v1.3/term/check/ | Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192304571394)
[**term_confirm**](AccountManagementApi.md#term_confirm) | **POST** /open_api/v1.3/term/confirm/ | Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192284435457)
[**term_get**](AccountManagementApi.md#term_get) | **GET** /open_api/v1.3/term/get/ | Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737191909315585)

# **advertiser_info**
> InlineResponse200 advertiser_info(advertiser_ids, access_token, fields=fields)

Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id=1739593083610113)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
advertiser_ids = ['advertiser_ids_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
fields = ['fields_example'] # list[str] |  (optional)

try:
    # Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id=1739593083610113)
    api_response = api_instance.advertiser_info(advertiser_ids, access_token, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->advertiser_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_ids** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **fields** | [**list[str]**](str.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_update**
> InlineResponse200 advertiser_update(access_token, body=body)

Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id=1739939050770434)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdvertiserUpdateBody() # AdvertiserUpdateBody |  (optional)

try:
    # Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id=1739939050770434)
    api_response = api_instance.advertiser_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->advertiser_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdvertiserUpdateBody**](AdvertiserUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pangle_audience_package_get**
> InlineResponse200 pangle_audience_package_get(advertiser_id, access_token)

Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id=1740040177229826)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id=1740040177229826)
    api_response = api_instance.pangle_audience_package_get(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->pangle_audience_package_get: %s\n" % e)
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

# **pangle_block_list_get**
> InlineResponse200 pangle_block_list_get(advertiser_id, access_token)

Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id=1740039957181441)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id=1740039957181441)
    api_response = api_instance.pangle_block_list_get(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->pangle_block_list_get: %s\n" % e)
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

# **pangle_block_list_update**
> InlineResponse200 pangle_block_list_update(access_token, body=body)

Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id=1740040139110466)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PangleBlockListUpdateBody() # PangleBlockListUpdateBody |  (optional)

try:
    # Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id=1740040139110466)
    api_response = api_instance.pangle_block_list_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->pangle_block_list_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PangleBlockListUpdateBody**](PangleBlockListUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **term_check**
> InlineResponse200 term_check(advertiser_id, term_type, access_token)

Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id=1737192304571394)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
term_type = 'term_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id=1737192304571394)
    api_response = api_instance.term_check(advertiser_id, term_type, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->term_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **term_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **term_confirm**
> InlineResponse200 term_confirm(access_token, body=body)

Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id=1737192284435457)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.TermConfirmBody() # TermConfirmBody |  (optional)

try:
    # Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id=1737192284435457)
    api_response = api_instance.term_confirm(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->term_confirm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**TermConfirmBody**](TermConfirmBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **term_get**
> InlineResponse200 term_get(advertiser_id, term_type, access_token, lang=lang)

Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id=1737191909315585)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
term_type = 'term_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
lang = 'EN' # str |  (optional) (default to EN)

try:
    # Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id=1737191909315585)
    api_response = api_instance.term_get(advertiser_id, term_type, access_token, lang=lang)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountManagementApi->term_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **term_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **lang** | **str**|  | [optional] [default to EN]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

