"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AdAcoApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_aco_create**](AdAcoApi.md#ad_aco_create) | **POST** /open_api/v1.3/ad/aco/create/ | Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473063234626)
[**ad_aco_get**](AdAcoApi.md#ad_aco_get) | **GET** /open_api/v1.3/ad/aco/get/ | Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473020978177)
[**ad_aco_material_status_update**](AdAcoApi.md#ad_aco_material_status_update) | **POST** /open_api/v1.3/ad/aco/material_status/update/ | Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739506701165570)
[**ad_aco_update**](AdAcoApi.md#ad_aco_update) | **POST** /open_api/v1.3/ad/aco/update/ | Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473077112833)

# **ad_aco_create**
> InlineResponse200 ad_aco_create(access_token, body=body)

Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id=1739473063234626)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdAcoApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdAcoBody() # AdAcoBody | Ad Aco update parameters. (optional)

try:
    # Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id=1739473063234626)
    api_response = api_instance.ad_aco_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdAcoApi->ad_aco_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdAcoBody**](AdAcoBody.md)| Ad Aco update parameters. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_aco_get**
> InlineResponse200 ad_aco_get(advertiser_id, adgroup_ids, access_token, exclude_field_types_in_response=exclude_field_types_in_response)

Get creative materials for an ACO ad, including calls to action, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id=1739473020978177)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdAcoApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
adgroup_ids = ['adgroup_ids_example'] # list[str] | A list of ad group IDs. Quantity- 1-100.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
exclude_field_types_in_response = ['exclude_field_types_in_response_example'] # list[str] | The type of fields that you want to remove from the response. (optional)

try:
    # Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id=1739473020978177)
    api_response = api_instance.ad_aco_get(advertiser_id, adgroup_ids, access_token, exclude_field_types_in_response=exclude_field_types_in_response)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdAcoApi->ad_aco_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **adgroup_ids** | [**list[str]**](str.md)| A list of ad group IDs. Quantity- 1-100. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **exclude_field_types_in_response** | [**list[str]**](str.md)| The type of fields to remove from the response. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_aco_material_status_update**
> InlineResponse200 ad_aco_material_status_update(access_token, body=body)

Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id=1739506701165570)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdAcoApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.MaterialStatusUpdateBody() # MaterialStatusUpdateBody | Ad Aco material status body (optional)

try:
    # Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id=1739506701165570)
    api_response = api_instance.ad_aco_material_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdAcoApi->ad_aco_material_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**MaterialStatusUpdateBody**](MaterialStatusUpdateBody.md)| Ad Aco material status body | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_aco_update**
> InlineResponse200 ad_aco_update(access_token, body=body)

Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id=1739473077112833)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdAcoApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdAcoUpdateBody() # AdAcoUpdateBody | Ad Aco update parameters (optional)

try:
    # Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id=1739473077112833)
    api_response = api_instance.ad_aco_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdAcoApi->ad_aco_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdAcoUpdateBody**](AdAcoUpdateBody.md)| Ad Aco update parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

