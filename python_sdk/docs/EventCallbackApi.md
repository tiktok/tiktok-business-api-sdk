"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.EventCallbackApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pixel_batch**](EventCallbackApi.md#pixel_batch) | **POST** /open_api/v1.3/pixel/batch/ | Pixel Track server-to-server batch api
[**pixel_track**](EventCallbackApi.md#pixel_track) | **POST** /open_api/v1.3/pixel/track/ | Pixel Track server-to-server api

# **pixel_batch**
> InlineResponse200 pixel_batch(access_token, body=body)

Pixel Track server-to-server batch api

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.EventCallbackApi()
access_token = 'access_token_example' # str | Authorized Access Token. Option1: [Recommended] Can be obtained in Events Manger under Assets->Event-> Website Pixel->Select any pixel in TikTok Ads Manager: https://ads.tiktok.com/i18n/ as described in [Get Started](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929). Please be aware that only an Admin or Operator role can generate a token. Option2: with your own developer app, refer to [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162) 
body = business_api_client.PixelBatchBody() # PixelBatchBody | Pixel batch update body parameters (optional)

try:
    # Pixel Track server-to-server batch api
    api_response = api_instance.pixel_batch(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventCallbackApi->pixel_batch: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized Access Token. Option1: [Recommended] Can be obtained in Events Manger under Assets-&gt;Event-&gt; Website Pixel-&gt;Select any pixel in TikTok Ads Manager: https://ads.tiktok.com/i18n/ as described in [Get Started](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584855420929). Please be aware that only an Admin or Operator role can generate a token. Option2: with your own developer app, refer to [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162)  | [required]
 **body** | [**PixelBatchBody**](PixelBatchBody.md)| Pixel batch update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_track**
> InlineResponse200 pixel_track(access_token, body=body)

Pixel Track server-to-server api

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.EventCallbackApi()
access_token = 'access_token_example' # str | Authorized Access Token. Option1: [Recommended] Can be obtained in Events Manger under Assets->Event-> Website Pixel->Select any pixel in TikTok Ads Manager: https://ads.tiktok.com/i18n/ as described in [Get Started](https://ads.tiktok.com/marketing_api/docs?id=1739584855420929). Please be aware that only an Admin or Operator role can generate a token. Option2: with your own developer app, refer to [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162) 
body = business_api_client.PixelTrackBody() # PixelTrackBody | Pixel track body parameters (optional)

try:
    # Pixel Track server-to-server api
    api_response = api_instance.pixel_track(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventCallbackApi->pixel_track: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized Access Token. Option1: [Recommended] Can be obtained in Events Manger under Assets-&gt;Event-&gt; Website Pixel-&gt;Select any pixel in TikTok Ads Manager: https://ads.tiktok.com/i18n/ as described in [Get Started](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584855420929). Please be aware that only an Admin or Operator role can generate a token. Option2: with your own developer app, refer to [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162)  | [required]
 **body** | [**PixelTrackBody**](PixelTrackBody.md)| Pixel track body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

