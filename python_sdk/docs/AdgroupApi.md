"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AdgroupApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adgroup_create**](AdgroupApi.md#adgroup_create) | **POST** /open_api/v1.3/adgroup/create/ | Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739499616346114)
[**adgroup_get**](AdgroupApi.md#adgroup_get) | **GET** /open_api/v1.3/adgroup/get/ | Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739314558673922)
[**adgroup_quota**](AdgroupApi.md#adgroup_quota) | **GET** /open_api/v1.3/adgroup/quota/ | Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)
[**adgroup_status_update**](AdgroupApi.md#adgroup_status_update) | **POST** /open_api/v1.3/adgroup/status/update/ | Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739591716326402)
[**adgroup_update**](AdgroupApi.md#adgroup_update) | **POST** /open_api/v1.3/adgroup/update/ | Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739586761631745)

# **adgroup_create**
> InlineResponse200 adgroup_create(access_token, body=body)

Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id=1739499616346114)

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
body = business_api_client.AdgroupCreateBody() # AdgroupCreateBody | Adgroup create body parameters (optional)

try:
    # Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id=1739499616346114)
    api_response = api_instance.adgroup_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdgroupCreateBody**](AdgroupCreateBody.md)| Adgroup create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adgroup_get**
> InlineResponse200 adgroup_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)

Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id=1739314558673922)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AdgroupApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdgroupGet() # FilteringAdgroupGet | Filter conditions. Set these conditions according to your requirements. If not set, all ad groups under the advertiser will be returned. The request can be filtered by (optional)
page = 56 # int | Current page number. Default value is `1` (optional)
page_size = 56 # int | Page size. Default value is- `10`. Range of values- `1-1000` (optional)
fields = ['fields_example'] # list[str] |  (optional)

try:
    # Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id=1739314558673922)
    api_response = api_instance.adgroup_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdgroupGet**](FilteringAdgroupGet.md)| Filter conditions. Set these conditions according to your requirements. If not set, all ad groups under the advertiser will be returned. The request can be filtered by | [optional] 
 **page** | **int**| Current page number. Default value is &#x60;1&#x60; | [optional] 
 **page_size** | **int**| Page size. Default value is- &#x60;10&#x60;. Range of values- &#x60;1-1000&#x60; | [optional] 
 **fields** | [**list[str]**](str.md)|  | [optional] 

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

Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id=1739591716326402)

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
body = business_api_client.AdgroupStatusUpdateBody() # AdgroupStatusUpdateBody | Adgroup status update body parameters (optional)

try:
    # Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id=1739591716326402)
    api_response = api_instance.adgroup_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdgroupStatusUpdateBody**](AdgroupStatusUpdateBody.md)| Adgroup status update body parameters | [optional] 

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

Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id=1739586761631745)

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
body = business_api_client.AdgroupUpdateBody() # AdgroupUpdateBody | Adgroup update body parameters (optional)

try:
    # Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id=1739586761631745)
    api_response = api_instance.adgroup_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdgroupApi->adgroup_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdgroupUpdateBody**](AdgroupUpdateBody.md)| Adgroup update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

