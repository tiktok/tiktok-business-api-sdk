"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AudienceApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dmp_custom_audience_list**](AudienceApi.md#dmp_custom_audience_list) | **GET** /open_api/v1.3/dmp/custom_audience/list/ | Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)

# **dmp_custom_audience_list**
> InlineResponse200 dmp_custom_audience_list(advertiser_id, access_token, custom_audience_ids=custom_audience_ids, page=page, page_size=page_size)

Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AudienceApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
custom_audience_ids = ['custom_audience_ids_example'] # list[str] | A list of Audience IDs. Length range is [1, 100] (optional)
page = 56 # int | Current page number. Default value: 1. Value range: ≥ 1 (optional)
page_size = 56 # int | Page size. Defaults is 10. Value range: 1-100 (optional)

try:
    # Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id=1739940506015746)
    api_response = api_instance.dmp_custom_audience_list(advertiser_id, access_token, custom_audience_ids=custom_audience_ids, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AudienceApi->dmp_custom_audience_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **custom_audience_ids** | [**list[str]**](str.md)| A list of Audience IDs. Length range is [1, 100] | [optional] 
 **page** | **int**| Current page number. Default value: 1. Value range: ≥ 1 | [optional] 
 **page_size** | **int**| Page size. Defaults is 10. Value range: 1-100 | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

