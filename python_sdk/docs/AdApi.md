"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AdApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_create**](AdApi.md#ad_create) | **POST** /open_api/v1.3/ad/create/ | Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953377508354)
[**ad_get**](AdApi.md#ad_get) | **GET** /open_api/v1.3/ad/get/ | Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1735735588640770)
[**ad_status_update**](AdApi.md#ad_status_update) | **POST** /open_api/v1.3/ad/status/update/ | To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)
[**ad_update**](AdApi.md#ad_update) | **POST** /open_api/v1.3/ad/update/ | Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

# **ad_create**
> InlineResponse200 ad_create(access_token, body=body)

Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id=1739953377508354)

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
body = business_api_client.AdCreateBody() # AdCreateBody | Ad create body parameters (optional)

try:
    # Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id=1739953377508354)
    api_response = api_instance.ad_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdCreateBody**](AdCreateBody.md)| Ad create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_get**
> InlineResponse200 ad_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)

Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id=1735735588640770)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdGet() # FilteringAdGet | Filters on the data. This parameter is an array of filter objects. (optional)
page = 56 # int | Current page number (optional)
page_size = 56 # int | Page size (optional)
fields = ['fields_example'] # list[str] | Fields that you want to get. For the list of fields that you can specify, see the fields under `list` in the response. If not set, all fields are returned by default. (optional)

try:
    # Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id=1735735588640770)
    api_response = api_instance.ad_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdGet**](FilteringAdGet.md)| Filters on the data. This parameter is an array of filter objects. | [optional] 
 **page** | **int**| Current page number | [optional] 
 **page_size** | **int**| Page size | [optional] 
 **fields** | [**list[str]**](str.md)| Fields that you want to get. For the list of fields that you can specify, see the fields under &#x60;list&#x60; in the response. If not set, all fields are returned by default. | [optional] 

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

To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id=1739953422970882)

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
body = business_api_client.AdStatusUpdateBody() # AdStatusUpdateBody | Ad status update body parameters (optional)

try:
    # To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id=1739953422970882)
    api_response = api_instance.ad_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdStatusUpdateBody**](AdStatusUpdateBody.md)| Ad status update body parameters | [optional] 

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

Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id=1739953422970882)

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
body = business_api_client.AdUpdateBody() # AdUpdateBody | Ad create body parameters (optional)

try:
    # Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id=1739953422970882)
    api_response = api_instance.ad_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdApi->ad_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdUpdateBody**](AdUpdateBody.md)| Ad create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

