"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AdApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_create**](AdApi.md#ad_create) | **POST** /open_api/v1.3/ad/create/ | Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953377508354)
[**ad_get**](AdApi.md#ad_get) | **GET** /open_api/v1.3/ad/get/ | Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1735735588640770)
[**ad_status_update**](AdApi.md#ad_status_update) | **POST** /open_api/v1.3/ad/status/update/ | Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953422970882)
[**ad_update**](AdApi.md#ad_update) | **POST** /open_api/v1.3/ad/update/ | Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953405142018)
[**smart_plus_ad_appeal**](AdApi.md#smart_plus_ad_appeal) | **POST** /open_api/v1.3/smart_plus/ad/appeal/ | Submit ad appeal [Smart Plus Ad Appeal]
[**smart_plus_ad_create**](AdApi.md#smart_plus_ad_create) | **POST** /open_api/v1.3/smart_plus/ad/create/ | Create a new ad [Smart Plus Ad Create]
[**smart_plus_ad_get**](AdApi.md#smart_plus_ad_get) | **GET** /open_api/v1.3/smart_plus/ad/get/ | Retrieve ad details [Smart Plus Ad Get]
[**smart_plus_ad_material_status_update**](AdApi.md#smart_plus_ad_material_status_update) | **POST** /open_api/v1.3/smart_plus/ad/material_status/update/ | Update ad material status [Smart Plus Ad Material Status Update]
[**smart_plus_ad_review_info**](AdApi.md#smart_plus_ad_review_info) | **GET** /open_api/v1.3/smart_plus/ad/review_info/ | Get ad review info [Smart Plus Ad Review Info]
[**smart_plus_ad_status_update**](AdApi.md#smart_plus_ad_status_update) | **POST** /open_api/v1.3/smart_plus/ad/status/update/ | Update ad status [Smart Plus Ad Status Update]
[**smart_plus_ad_update**](AdApi.md#smart_plus_ad_update) | **POST** /open_api/v1.3/smart_plus/ad/update/ | Update an ad [Smart Plus Ad Update]
[**smart_plus_material_review_info**](AdApi.md#smart_plus_material_review_info) | **GET** /open_api/v1.3/smart_plus/material/review_info/ | Get material review info [Smart Plus Material Review Info]

# **ad_create**
> InlineResponse200 ad_create(access_token, body=body)

Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id=1739953377508354)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdCreateBody() # AdCreateBody |  (optional)

try:
    # Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id=1739953377508354)
    api_response = api_instance.ad_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdCreateBody**](AdCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_get**
> InlineResponse200 ad_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields, exclude_field_types_in_response=exclude_field_types_in_response)

Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id=1735735588640770)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdGet() # FilteringAdGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
fields = ['fields_example'] # list[str] |  (optional)
exclude_field_types_in_response = ['exclude_field_types_in_response_example'] # list[str] |  (optional)

try:
    # Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id=1735735588640770)
    api_response = api_instance.ad_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields, exclude_field_types_in_response=exclude_field_types_in_response)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdGet**](FilteringAdGet.md)|  | [optional] 
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

# **ad_status_update**
> InlineResponse200 ad_status_update(access_token, body=body)

Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id=1739953422970882)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdStatusUpdateBody() # AdStatusUpdateBody |  (optional)

try:
    # Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id=1739953422970882)
    api_response = api_instance.ad_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdStatusUpdateBody**](AdStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_update**
> InlineResponse200 ad_update(access_token, body=body)

Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id=1739953405142018)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdUpdateBody() # AdUpdateBody |  (optional)

try:
    # Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id=1739953405142018)
    api_response = api_instance.ad_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdUpdateBody**](AdUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_ad_appeal**
> InlineResponse200 smart_plus_ad_appeal(access_token, body=body)

Submit ad appeal [Smart Plus Ad Appeal]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdAppealBody() # SmartPlusAdAppealBody |  (optional)

try:
    # Submit ad appeal [Smart Plus Ad Appeal]
    api_response = api_instance.smart_plus_ad_appeal(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_appeal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdAppealBody**](SmartPlusAdAppealBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_ad_create**
> InlineResponse200 smart_plus_ad_create(access_token, body=body)

Create a new ad [Smart Plus Ad Create]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdCreateBody() # SmartPlusAdCreateBody |  (optional)

try:
    # Create a new ad [Smart Plus Ad Create]
    api_response = api_instance.smart_plus_ad_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdCreateBody**](SmartPlusAdCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_ad_get**
> InlineResponse200 smart_plus_ad_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)

Retrieve ad details [Smart Plus Ad Get]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringSmartPlusAdGet() # FilteringSmartPlusAdGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
fields = ['fields_example'] # list[str] |  (optional)

try:
    # Retrieve ad details [Smart Plus Ad Get]
    api_response = api_instance.smart_plus_ad_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringSmartPlusAdGet**](FilteringSmartPlusAdGet.md)|  | [optional] 
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

# **smart_plus_ad_material_status_update**
> InlineResponse200 smart_plus_ad_material_status_update(access_token, body=body)

Update ad material status [Smart Plus Ad Material Status Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdMaterialStatusUpdateBody() # SmartPlusAdMaterialStatusUpdateBody |  (optional)

try:
    # Update ad material status [Smart Plus Ad Material Status Update]
    api_response = api_instance.smart_plus_ad_material_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_material_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdMaterialStatusUpdateBody**](SmartPlusAdMaterialStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_ad_review_info**
> InlineResponse200 smart_plus_ad_review_info(advertiser_id, smart_plus_ad_ids, access_token, extra_info_setting=extra_info_setting, lang=lang, context_info=context_info)

Get ad review info [Smart Plus Ad Review Info]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
advertiser_id = 'advertiser_id_example' # str | 
smart_plus_ad_ids = ['smart_plus_ad_ids_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
extra_info_setting = business_api_client.ExtraInfoSettingSmartPlusAdReviewInfo() # ExtraInfoSettingSmartPlusAdReviewInfo |  (optional)
lang = '\"\"' # str |  (optional) (default to "")
context_info = business_api_client.ContextInfoSmartPlusAdReviewInfo() # ContextInfoSmartPlusAdReviewInfo |  (optional)

try:
    # Get ad review info [Smart Plus Ad Review Info]
    api_response = api_instance.smart_plus_ad_review_info(advertiser_id, smart_plus_ad_ids, access_token, extra_info_setting=extra_info_setting, lang=lang, context_info=context_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_review_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **smart_plus_ad_ids** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **extra_info_setting** | [**ExtraInfoSettingSmartPlusAdReviewInfo**](ExtraInfoSettingSmartPlusAdReviewInfo.md)|  | [optional] 
 **lang** | **str**|  | [optional] [default to &quot;&quot;]
 **context_info** | [**ContextInfoSmartPlusAdReviewInfo**](ContextInfoSmartPlusAdReviewInfo.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_ad_status_update**
> InlineResponse200 smart_plus_ad_status_update(access_token, body=body)

Update ad status [Smart Plus Ad Status Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdStatusUpdateBody() # SmartPlusAdStatusUpdateBody |  (optional)

try:
    # Update ad status [Smart Plus Ad Status Update]
    api_response = api_instance.smart_plus_ad_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdStatusUpdateBody**](SmartPlusAdStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_ad_update**
> InlineResponse200 smart_plus_ad_update(access_token, body=body)

Update an ad [Smart Plus Ad Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusAdUpdateBody() # SmartPlusAdUpdateBody |  (optional)

try:
    # Update an ad [Smart Plus Ad Update]
    api_response = api_instance.smart_plus_ad_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_ad_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusAdUpdateBody**](SmartPlusAdUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_material_review_info**
> InlineResponse200 smart_plus_material_review_info(advertiser_id, ad_material_ids, access_token, extra_info_setting=extra_info_setting, lang=lang, context_info=context_info)

Get material review info [Smart Plus Material Review Info]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
advertiser_id = 'advertiser_id_example' # str | 
ad_material_ids = ['ad_material_ids_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
extra_info_setting = business_api_client.ExtraInfoSettingSmartPlusMaterialReviewInfo() # ExtraInfoSettingSmartPlusMaterialReviewInfo |  (optional)
lang = '\"\"' # str |  (optional) (default to "")
context_info = business_api_client.ContextInfoSmartPlusMaterialReviewInfo() # ContextInfoSmartPlusMaterialReviewInfo |  (optional)

try:
    # Get material review info [Smart Plus Material Review Info]
    api_response = api_instance.smart_plus_material_review_info(advertiser_id, ad_material_ids, access_token, extra_info_setting=extra_info_setting, lang=lang, context_info=context_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->smart_plus_material_review_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **ad_material_ids** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **extra_info_setting** | [**ExtraInfoSettingSmartPlusMaterialReviewInfo**](ExtraInfoSettingSmartPlusMaterialReviewInfo.md)|  | [optional] 
 **lang** | **str**|  | [optional] [default to &quot;&quot;]
 **context_info** | [**ContextInfoSmartPlusMaterialReviewInfo**](ContextInfoSmartPlusMaterialReviewInfo.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

