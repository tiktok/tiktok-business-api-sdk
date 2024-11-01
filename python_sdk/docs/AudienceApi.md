"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AudienceApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dmp_custom_audience_apply**](AudienceApi.md#dmp_custom_audience_apply) | **POST** /open_api/v1.3/dmp/custom_audience/apply/ | Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
[**dmp_custom_audience_apply_log**](AudienceApi.md#dmp_custom_audience_apply_log) | **GET** /open_api/v1.3/dmp/custom_audience/apply/log/ | Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758615737388033)
[**dmp_custom_audience_create**](AudienceApi.md#dmp_custom_audience_create) | **POST** /open_api/v1.3/dmp/custom_audience/create/ | Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940570793985)
[**dmp_custom_audience_delete**](AudienceApi.md#dmp_custom_audience_delete) | **POST** /open_api/v1.3/dmp/custom_audience/delete/ | Delete audiences [Dmp Custom_audience Delete](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940539757569)
[**dmp_custom_audience_file_upload**](AudienceApi.md#dmp_custom_audience_file_upload) | **POST** /open_api/v1.3/dmp/custom_audience/file/upload/ | Upload a data file [Dmp Custom_audience File Upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940567842818)
[**dmp_custom_audience_get**](AudienceApi.md#dmp_custom_audience_get) | **GET** /open_api/v1.3/dmp/custom_audience/get/ | Obtain the details of specified audiences [Dmp Custom_audience Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940507792385)
[**dmp_custom_audience_list**](AudienceApi.md#dmp_custom_audience_list) | **GET** /open_api/v1.3/dmp/custom_audience/list/ | Get all audiences [Dmp Custom_audience List](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)
[**dmp_custom_audience_lookalike_create**](AudienceApi.md#dmp_custom_audience_lookalike_create) | **POST** /open_api/v1.3/dmp/custom_audience/lookalike/create/ | Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940511844353)
[**dmp_custom_audience_lookalike_update**](AudienceApi.md#dmp_custom_audience_lookalike_update) | **POST** /open_api/v1.3/dmp/custom_audience/lookalike/update/ | Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758616888158209)
[**dmp_custom_audience_rule_create**](AudienceApi.md#dmp_custom_audience_rule_create) | **POST** /open_api/v1.3/dmp/custom_audience/rule/create/ | Create an audience by rules [Dmp Custom_audience Rule Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940509849601)
[**dmp_custom_audience_share**](AudienceApi.md#dmp_custom_audience_share) | **POST** /open_api/v1.3/dmp/custom_audience/share/ | Share custom audiences with other advertisers [Dmp Custom_audience Share](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245803888706)
[**dmp_custom_audience_share_cancel**](AudienceApi.md#dmp_custom_audience_share_cancel) | **POST** /open_api/v1.3/dmp/custom_audience/share/cancel/ | Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245829978113)
[**dmp_custom_audience_share_log**](AudienceApi.md#dmp_custom_audience_share_log) | **GET** /open_api/v1.3/dmp/custom_audience/share/log/ | Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
[**dmp_custom_audience_update**](AudienceApi.md#dmp_custom_audience_update) | **POST** /open_api/v1.3/dmp/custom_audience/update/ | Update the details of an audience [Dmp Custom_audience Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940572667906)
[**dmp_saved_audience_create**](AudienceApi.md#dmp_saved_audience_create) | **POST** /open_api/v1.3/dmp/saved_audience/create/ | Create a Saved Audience [Dmp Saved_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1780154541898754)
[**dmp_saved_audience_delete**](AudienceApi.md#dmp_saved_audience_delete) | **POST** /open_api/v1.3/dmp/saved_audience/delete/ | Delete Saved Audiences [Dmp Saved_audience Delete](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1780154666312706)
[**dmp_saved_audience_list**](AudienceApi.md#dmp_saved_audience_list) | **GET** /open_api/v1.3/dmp/saved_audience/list/ | Get the details of Saved Audiences [Dmp Saved_audience List](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1780154619404290)

# **dmp_custom_audience_apply**
> InlineResponse200 dmp_custom_audience_apply(access_token, body=body)

Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id=1740245827044354)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CustomAudienceApplyBody() # CustomAudienceApplyBody |  (optional)

try:
    # Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id=1740245827044354)
    api_response = api_instance.dmp_custom_audience_apply(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_apply: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CustomAudienceApplyBody**](CustomAudienceApplyBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_apply_log**
> InlineResponse200 dmp_custom_audience_apply_log(advertiser_id, custom_audience_ids, access_token, page=page, page_size=page_size, timezone=timezone, context_info=context_info)

Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id=1758615737388033)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
custom_audience_ids = ['custom_audience_ids_example'] # list[str] | A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
page = 1 # int | Current page number. Default value: 1. (optional) (default to 1)
page_size = 10 # int | Page size. Default value: 10. (optional) (default to 10)
timezone = 'timezone_example' # str | The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used. (optional)
context_info = NULL # object |  (optional)

try:
    # Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id=1758615737388033)
    api_response = api_instance.dmp_custom_audience_apply_log(advertiser_id, custom_audience_ids, access_token, page=page, page_size=page_size, timezone=timezone, context_info=context_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_apply_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **custom_audience_ids** | [**list[str]**](str.md)| A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **page** | **int**| Current page number. Default value: 1. | [optional] [default to 1]
 **page_size** | **int**| Page size. Default value: 10. | [optional] [default to 10]
 **timezone** | **str**| The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used. | [optional] 
 **context_info** | [**object**](object.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_create**
> InlineResponse200 dmp_custom_audience_create(access_token, body=body)

Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id=1739940570793985)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CustomAudienceCreateBody() # CustomAudienceCreateBody |  (optional)

try:
    # Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id=1739940570793985)
    api_response = api_instance.dmp_custom_audience_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CustomAudienceCreateBody**](CustomAudienceCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_delete**
> InlineResponse200 dmp_custom_audience_delete(access_token, body=body)

Delete audiences [Dmp Custom_audience Delete](https://ads.tiktok.com/marketing_api/docs?id=1739940539757569)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CustomAudienceDeleteBody() # CustomAudienceDeleteBody |  (optional)

try:
    # Delete audiences [Dmp Custom_audience Delete](https://ads.tiktok.com/marketing_api/docs?id=1739940539757569)
    api_response = api_instance.dmp_custom_audience_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CustomAudienceDeleteBody**](CustomAudienceDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_file_upload**
> InlineResponse200 dmp_custom_audience_file_upload(access_token, advertiser_id=advertiser_id, calculate_type=calculate_type, context_info=context_info, file=file, file_name=file_name, file_signature=file_signature)

Upload a data file [Dmp Custom_audience File Upload](https://ads.tiktok.com/marketing_api/docs?id=1739940567842818)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
advertiser_id = 'advertiser_id_example' # str |  (optional)
calculate_type = 'calculate_type_example' # str |  (optional)
context_info = business_api_client.OpenApiv13dmpcustomAudiencefileuploadContextInfo() # OpenApiv13dmpcustomAudiencefileuploadContextInfo |  (optional)
file = 'file_example' # str |  (optional)
file_name = 'file_name_example' # str |  (optional)
file_signature = 'file_signature_example' # str |  (optional)

try:
    # Upload a data file [Dmp Custom_audience File Upload](https://ads.tiktok.com/marketing_api/docs?id=1739940567842818)
    api_response = api_instance.dmp_custom_audience_file_upload(access_token, advertiser_id=advertiser_id, calculate_type=calculate_type, context_info=context_info, file=file, file_name=file_name, file_signature=file_signature)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_file_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **advertiser_id** | **str**|  | [optional] 
 **calculate_type** | **str**|  | [optional] 
 **context_info** | [**OpenApiv13dmpcustomAudiencefileuploadContextInfo**](OpenApiv13dmpcustomAudiencefileuploadContextInfo.md)|  | [optional] 
 **file** | **str**|  | [optional] 
 **file_name** | **str**|  | [optional] 
 **file_signature** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_get**
> InlineResponse200 dmp_custom_audience_get(advertiser_id, custom_audience_ids, access_token, history_size=history_size)

Obtain the details of specified audiences [Dmp Custom_audience Get](https://ads.tiktok.com/marketing_api/docs?id=1739940507792385)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
custom_audience_ids = ['custom_audience_ids_example'] # list[str] | A list of Audience IDs. Length range is [1, 100] .
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
history_size = 56 # int | The size of the history data which the user requests. (optional)

try:
    # Obtain the details of specified audiences [Dmp Custom_audience Get](https://ads.tiktok.com/marketing_api/docs?id=1739940507792385)
    api_response = api_instance.dmp_custom_audience_get(advertiser_id, custom_audience_ids, access_token, history_size=history_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **custom_audience_ids** | [**list[str]**](str.md)| A list of Audience IDs. Length range is [1, 100] . | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **history_size** | **int**| The size of the history data which the user requests. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_list**
> InlineResponse200 dmp_custom_audience_list(advertiser_id, access_token, custom_audience_ids=custom_audience_ids, page=page, page_size=page_size)

Get all audiences [Dmp Custom_audience List](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
custom_audience_ids = ['custom_audience_ids_example'] # list[str] | A list of Audience IDs. Length range is [1, 100]. (optional)
page = 1 # int | Current page number. Default value: 1. Value range: ≥ 1. (optional) (default to 1)
page_size = 10 # int | Page size. Defaults is 10. Value range: 1-100. (optional) (default to 10)

try:
    # Get all audiences [Dmp Custom_audience List](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746)
    api_response = api_instance.dmp_custom_audience_list(advertiser_id, access_token, custom_audience_ids=custom_audience_ids, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **custom_audience_ids** | [**list[str]**](str.md)| A list of Audience IDs. Length range is [1, 100]. | [optional] 
 **page** | **int**| Current page number. Default value: 1. Value range: ≥ 1. | [optional] [default to 1]
 **page_size** | **int**| Page size. Defaults is 10. Value range: 1-100. | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_lookalike_create**
> InlineResponse200 dmp_custom_audience_lookalike_create(access_token, body=body)

Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://ads.tiktok.com/marketing_api/docs?id=1739940511844353)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.LookalikeCreateBody() # LookalikeCreateBody |  (optional)

try:
    # Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://ads.tiktok.com/marketing_api/docs?id=1739940511844353)
    api_response = api_instance.dmp_custom_audience_lookalike_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_lookalike_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**LookalikeCreateBody**](LookalikeCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_lookalike_update**
> InlineResponse200 dmp_custom_audience_lookalike_update(access_token, body=body)

Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id=1758616888158209)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.LookalikeUpdateBody() # LookalikeUpdateBody |  (optional)

try:
    # Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id=1758616888158209)
    api_response = api_instance.dmp_custom_audience_lookalike_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_lookalike_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**LookalikeUpdateBody**](LookalikeUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_rule_create**
> InlineResponse200 dmp_custom_audience_rule_create(access_token, body=body)

Create an audience by rules [Dmp Custom_audience Rule Create](https://ads.tiktok.com/marketing_api/docs?id=1739940509849601)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.RuleCreateBody() # RuleCreateBody |  (optional)

try:
    # Create an audience by rules [Dmp Custom_audience Rule Create](https://ads.tiktok.com/marketing_api/docs?id=1739940509849601)
    api_response = api_instance.dmp_custom_audience_rule_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_rule_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**RuleCreateBody**](RuleCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_share**
> InlineResponse200 dmp_custom_audience_share(access_token, body=body)

Share custom audiences with other advertisers [Dmp Custom_audience Share](https://ads.tiktok.com/marketing_api/docs?id=1740245803888706)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CustomAudienceShareBody() # CustomAudienceShareBody |  (optional)

try:
    # Share custom audiences with other advertisers [Dmp Custom_audience Share](https://ads.tiktok.com/marketing_api/docs?id=1740245803888706)
    api_response = api_instance.dmp_custom_audience_share(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_share: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CustomAudienceShareBody**](CustomAudienceShareBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_share_cancel**
> InlineResponse200 dmp_custom_audience_share_cancel(access_token, body=body)

Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://ads.tiktok.com/marketing_api/docs?id=1740245829978113)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ShareCancelBody() # ShareCancelBody |  (optional)

try:
    # Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://ads.tiktok.com/marketing_api/docs?id=1740245829978113)
    api_response = api_instance.dmp_custom_audience_share_cancel(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_share_cancel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ShareCancelBody**](ShareCancelBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_share_log**
> InlineResponse200 dmp_custom_audience_share_log(advertiser_id, custom_audience_id, access_token, context_info=context_info)

Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id=1740245827044354)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
custom_audience_id = 'custom_audience_id_example' # str | Custom audiences that you want to get sharing log for.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
context_info = NULL # object |  (optional)

try:
    # Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id=1740245827044354)
    api_response = api_instance.dmp_custom_audience_share_log(advertiser_id, custom_audience_id, access_token, context_info=context_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_share_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **custom_audience_id** | **str**| Custom audiences that you want to get sharing log for. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **context_info** | [**object**](object.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_custom_audience_update**
> InlineResponse200 dmp_custom_audience_update(access_token, body=body)

Update the details of an audience [Dmp Custom_audience Update](https://ads.tiktok.com/marketing_api/docs?id=1739940572667906)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CustomAudienceUpdateBody() # CustomAudienceUpdateBody |  (optional)

try:
    # Update the details of an audience [Dmp Custom_audience Update](https://ads.tiktok.com/marketing_api/docs?id=1739940572667906)
    api_response = api_instance.dmp_custom_audience_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CustomAudienceUpdateBody**](CustomAudienceUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_saved_audience_create**
> InlineResponse200 dmp_saved_audience_create(access_token, body=body)

Create a Saved Audience [Dmp Saved_audience Create](https://ads.tiktok.com/marketing_api/docs?id=1780154541898754)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SavedAudienceCreateBody() # SavedAudienceCreateBody |  (optional)

try:
    # Create a Saved Audience [Dmp Saved_audience Create](https://ads.tiktok.com/marketing_api/docs?id=1780154541898754)
    api_response = api_instance.dmp_saved_audience_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_saved_audience_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SavedAudienceCreateBody**](SavedAudienceCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_saved_audience_delete**
> InlineResponse200 dmp_saved_audience_delete(access_token, body=body)

Delete Saved Audiences [Dmp Saved_audience Delete](https://ads.tiktok.com/marketing_api/docs?id=1780154666312706)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SavedAudienceDeleteBody() # SavedAudienceDeleteBody |  (optional)

try:
    # Delete Saved Audiences [Dmp Saved_audience Delete](https://ads.tiktok.com/marketing_api/docs?id=1780154666312706)
    api_response = api_instance.dmp_saved_audience_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_saved_audience_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SavedAudienceDeleteBody**](SavedAudienceDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dmp_saved_audience_list**
> InlineResponse200 dmp_saved_audience_list(advertiser_id, access_token, saved_audience_ids=saved_audience_ids, page=page, page_size=page_size)

Get the details of Saved Audiences [Dmp Saved_audience List](https://ads.tiktok.com/marketing_api/docs?id=1780154619404290)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
saved_audience_ids = ['saved_audience_ids_example'] # list[str] | IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/. (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get the details of Saved Audiences [Dmp Saved_audience List](https://ads.tiktok.com/marketing_api/docs?id=1780154619404290)
    api_response = api_instance.dmp_saved_audience_list(advertiser_id, access_token, saved_audience_ids=saved_audience_ids, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_saved_audience_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **saved_audience_ids** | [**list[str]**](str.md)| IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/. | [optional] 
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

