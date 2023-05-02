"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AccountApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_update**](AccountApi.md#advertiser_update) | **POST** /open_api/v1.3/advertiser/update/ | Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939050770434)

# **advertiser_update**
> InlineResponse200 advertiser_update(access_token, body=body)

Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id=1739939050770434)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AccountApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdvertiserUpdateBody() # AdvertiserUpdateBody | Advertiser update body parameters (optional)

try:
    # Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id=1739939050770434)
    api_response = api_instance.advertiser_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->advertiser_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdvertiserUpdateBody**](AdvertiserUpdateBody.md)| Advertiser update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

