"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AdgroupApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adgroup_create**](AdgroupApi.md#adgroup_create) | **POST** /open_api/v1.3/adgroup/create/ | Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739499616346114)
[**adgroup_get**](AdgroupApi.md#adgroup_get) | **GET** /open_api/v1.3/adgroup/get/ | Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739314558673922)
[**adgroup_quota**](AdgroupApi.md#adgroup_quota) | **GET** /open_api/v1.3/adgroup/quota/ | Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)
[**adgroup_status_update**](AdgroupApi.md#adgroup_status_update) | **POST** /open_api/v1.3/adgroup/status/update/ | Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739591716326402)
[**adgroup_update**](AdgroupApi.md#adgroup_update) | **POST** /open_api/v1.3/adgroup/update/ | Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739586761631745)
[**smart_plus_adgroup_create**](AdgroupApi.md#smart_plus_adgroup_create) | **POST** /open_api/v1.3/smart_plus/adgroup/create/ | Create a new ad group [Smart Plus AdGroup Create]
[**smart_plus_adgroup_get**](AdgroupApi.md#smart_plus_adgroup_get) | **GET** /open_api/v1.3/smart_plus/adgroup/get/ | Retrieve ad group details [Smart Plus AdGroup Get]
[**smart_plus_adgroup_status_update**](AdgroupApi.md#smart_plus_adgroup_status_update) | **POST** /open_api/v1.3/smart_plus/adgroup/status/update/ | Update ad group status [Smart Plus AdGroup Status Update]
[**smart_plus_adgroup_update**](AdgroupApi.md#smart_plus_adgroup_update) | **POST** /open_api/v1.3/smart_plus/adgroup/update/ | Update an ad group [Smart Plus AdGroup Update]

# **adgroup_create**
> InlineResponse200 adgroup_create(access_token, body=body)

Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id=1739499616346114)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdgroupCreateBody() # AdgroupCreateBody |  (optional)

try:
    # Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id=1739499616346114)
    api_response = api_instance.adgroup_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdgroupCreateBody**](AdgroupCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adgroup_get**
> InlineResponse200 adgroup_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields, exclude_field_types_in_response=exclude_field_types_in_response)

Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id=1739314558673922)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdgroupGet() # FilteringAdgroupGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
fields = ['fields_example'] # list[str] |  (optional)
exclude_field_types_in_response = ['exclude_field_types_in_response_example'] # list[str] |  (optional)

try:
    # Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id=1739314558673922)
    api_response = api_instance.adgroup_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields, exclude_field_types_in_response=exclude_field_types_in_response)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdgroupGet**](FilteringAdgroupGet.md)|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]
 **fields** | [**list[str]**](str.md)|  | [optional] 
 **exclude_field_types_in_response** | [**list[str]**](str.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adgroup_quota**
> InlineResponse200 adgroup_quota(advertiser_id, access_token)

Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id=1768463039162369)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id=1768463039162369)
    api_response = api_instance.adgroup_quota(advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_quota: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adgroup_status_update**
> InlineResponse200 adgroup_status_update(access_token, body=body)

Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id=1739591716326402)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdgroupStatusUpdateBody() # AdgroupStatusUpdateBody |  (optional)

try:
    # Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id=1739591716326402)
    api_response = api_instance.adgroup_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdgroupStatusUpdateBody**](AdgroupStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adgroup_update**
> InlineResponse200 adgroup_update(access_token, body=body)

Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id=1739586761631745)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdgroupUpdateBody() # AdgroupUpdateBody |  (optional)

try:
    # Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id=1739586761631745)
    api_response = api_instance.adgroup_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdgroupUpdateBody**](AdgroupUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_adgroup_create**
> InlineResponse200 smart_plus_adgroup_create(access_token, body=body)

Create a new ad group [Smart Plus AdGroup Create]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdgroupCreateBody() # SmartPlusAdgroupCreateBody |  (optional)

try:
    # Create a new ad group [Smart Plus AdGroup Create]
    api_response = api_instance.smart_plus_adgroup_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->smart_plus_adgroup_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdgroupCreateBody**](SmartPlusAdgroupCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_adgroup_get**
> InlineResponse200 smart_plus_adgroup_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)

Retrieve ad group details [Smart Plus AdGroup Get]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringSmartPlusAdgroupGet() # FilteringSmartPlusAdgroupGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
fields = ['fields_example'] # list[str] |  (optional)

try:
    # Retrieve ad group details [Smart Plus AdGroup Get]
    api_response = api_instance.smart_plus_adgroup_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->smart_plus_adgroup_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringSmartPlusAdgroupGet**](FilteringSmartPlusAdgroupGet.md)|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]
 **fields** | [**list[str]**](str.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_adgroup_status_update**
> InlineResponse200 smart_plus_adgroup_status_update(access_token, body=body)

Update ad group status [Smart Plus AdGroup Status Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdgroupStatusUpdateBody() # SmartPlusAdgroupStatusUpdateBody |  (optional)

try:
    # Update ad group status [Smart Plus AdGroup Status Update]
    api_response = api_instance.smart_plus_adgroup_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->smart_plus_adgroup_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdgroupStatusUpdateBody**](SmartPlusAdgroupStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_adgroup_update**
> InlineResponse200 smart_plus_adgroup_update(access_token, body=body)

Update an ad group [Smart Plus AdGroup Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdgroupUpdateBody() # SmartPlusAdgroupUpdateBody |  (optional)

try:
    # Update an ad group [Smart Plus AdGroup Update]
    api_response = api_instance.smart_plus_adgroup_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->smart_plus_adgroup_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdgroupUpdateBody**](SmartPlusAdgroupUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

