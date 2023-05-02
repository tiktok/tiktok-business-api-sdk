"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.RecommendToolApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tool_targeting_category_recommend**](RecommendToolApi.md#tool_targeting_category_recommend) | **POST** /open_api/v1.3/tool/targeting_category/recommend/ | Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736275204260866)

# **tool_targeting_category_recommend**
> InlineResponse200 tool_targeting_category_recommend(access_token, body=body)

Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id=1736275204260866)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.RecommendToolApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.TargetingCategoryRecommendBody() # TargetingCategoryRecommendBody | Tool recommend body parameters (optional)

try:
    # Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id=1736275204260866)
    api_response = api_instance.tool_targeting_category_recommend(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RecommendToolApi->tool_targeting_category_recommend: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**TargetingCategoryRecommendBody**](TargetingCategoryRecommendBody.md)| Tool recommend body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

