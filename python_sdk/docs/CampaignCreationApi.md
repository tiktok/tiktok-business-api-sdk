"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.CampaignCreationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaign_create**](CampaignCreationApi.md#campaign_create) | **POST** /open_api/v1.3/campaign/create/ | Create campaign. [Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739318962329602)
[**campaign_get**](CampaignCreationApi.md#campaign_get) | **GET** /open_api/v1.3/campaign/get/ | Get campaigns. [Campaign Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739315828649986)
[**campaign_gmv_max_create**](CampaignCreationApi.md#campaign_gmv_max_create) | **POST** /open_api/v1.3/campaign/gmv_max/create/ | Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000988713089)
[**campaign_gmv_max_info**](CampaignCreationApi.md#campaign_gmv_max_info) | **GET** /open_api/v1.3/campaign/gmv_max/info/ | Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000968821762)
[**campaign_gmv_max_session_create**](CampaignCreationApi.md#campaign_gmv_max_session_create) | **POST** /open_api/v1.3/campaign/gmv_max/session/create/ | Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246967275522)
[**campaign_gmv_max_session_delete**](CampaignCreationApi.md#campaign_gmv_max_session_delete) | **POST** /open_api/v1.3/campaign/gmv_max/session/delete/ | Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246983475217)
[**campaign_gmv_max_session_get**](CampaignCreationApi.md#campaign_gmv_max_session_get) | **GET** /open_api/v1.3/campaign/gmv_max/session/get/ | Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247031331842)
[**campaign_gmv_max_session_list**](CampaignCreationApi.md#campaign_gmv_max_session_list) | **GET** /open_api/v1.3/campaign/gmv_max/session/list/ | Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246996436162)
[**campaign_gmv_max_session_update**](CampaignCreationApi.md#campaign_gmv_max_session_update) | **POST** /open_api/v1.3/campaign/gmv_max/session/update/ | Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247009119233)
[**campaign_gmv_max_update**](CampaignCreationApi.md#campaign_gmv_max_update) | **POST** /open_api/v1.3/campaign/gmv_max/update/ | Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001009002497)
[**campaign_status_update**](CampaignCreationApi.md#campaign_status_update) | **POST** /open_api/v1.3/campaign/status/update/ | Update campaign status. [Campaign Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739320994354178)
[**campaign_update**](CampaignCreationApi.md#campaign_update) | **POST** /open_api/v1.3/campaign/update/ | Update campaign. [Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739320422086657)
[**gmv_max_bid_recommend**](CampaignCreationApi.md#gmv_max_bid_recommend) | **GET** /open_api/v1.3/gmv_max/bid/recommend/ | Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001024720897)
[**gmv_max_custom_anchor_video_list_get**](CampaignCreationApi.md#gmv_max_custom_anchor_video_list_get) | **GET** /open_api/v1.3/gmv_max/custom_anchor_video_list/get/ | Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1830215925061633)
[**gmv_max_occupied_custom_shop_ads_list**](CampaignCreationApi.md#gmv_max_occupied_custom_shop_ads_list) | **GET** /open_api/v1.3/gmv_max/occupied_custom_shop_ads/list/ | Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001136924674)
[**smart_plus_campaign_create**](CampaignCreationApi.md#smart_plus_campaign_create) | **POST** /open_api/v1.3/smart_plus/campaign/create/ | Create a new campaign [Smart Plus Campaign Create]
[**smart_plus_campaign_get**](CampaignCreationApi.md#smart_plus_campaign_get) | **GET** /open_api/v1.3/smart_plus/campaign/get/ | Retrieve campaign details [Smart Plus Campaign Get]
[**smart_plus_campaign_status_update**](CampaignCreationApi.md#smart_plus_campaign_status_update) | **POST** /open_api/v1.3/smart_plus/campaign/status/update/ | Update campaign status [Smart Plus Campaign Status Update]
[**smart_plus_campaign_update**](CampaignCreationApi.md#smart_plus_campaign_update) | **POST** /open_api/v1.3/smart_plus/campaign/update/ | Update an existing campaign [Smart Plus Campaign Update]

# **campaign_create**
> InlineResponse200 campaign_create(access_token, body=body)

Create campaign. [Campaign Create](https://business-api.tiktok.com/portal/docs?id=1739318962329602)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CampaignCreateBody() # CampaignCreateBody |  (optional)

try:
    # Create campaign. [Campaign Create](https://business-api.tiktok.com/portal/docs?id=1739318962329602)
    api_response = api_instance.campaign_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CampaignCreateBody**](CampaignCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_get**
> InlineResponse200 campaign_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields, exclude_field_types_in_response=exclude_field_types_in_response)

Get campaigns. [Campaign Get](https://business-api.tiktok.com/portal/docs?id=1739315828649986)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringCampaignGet() # FilteringCampaignGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
fields = ['fields_example'] # list[str] |  (optional)
exclude_field_types_in_response = ['exclude_field_types_in_response_example'] # list[str] |  (optional)

try:
    # Get campaigns. [Campaign Get](https://business-api.tiktok.com/portal/docs?id=1739315828649986)
    api_response = api_instance.campaign_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields, exclude_field_types_in_response=exclude_field_types_in_response)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringCampaignGet**](FilteringCampaignGet.md)|  | [optional] 
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

# **campaign_gmv_max_create**
> InlineResponse200 campaign_gmv_max_create(access_token, body=body)

Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id=1822000988713089)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.GmvMaxCreateBody() # GmvMaxCreateBody |  (optional)

try:
    # Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id=1822000988713089)
    api_response = api_instance.campaign_gmv_max_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**GmvMaxCreateBody**](GmvMaxCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_info**
> InlineResponse200 campaign_gmv_max_info(advertiser_id, campaign_id, access_token)

Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id=1822000968821762)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | 
campaign_id = 'campaign_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id=1822000968821762)
    api_response = api_instance.campaign_gmv_max_info(advertiser_id, campaign_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **campaign_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_session_create**
> InlineResponse200 campaign_gmv_max_session_create(access_token, body=body)

Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id=1835246967275522)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SessionCreateBody() # SessionCreateBody |  (optional)

try:
    # Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id=1835246967275522)
    api_response = api_instance.campaign_gmv_max_session_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_session_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SessionCreateBody**](SessionCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_session_delete**
> InlineResponse200 campaign_gmv_max_session_delete(access_token, body=body)

Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id=1835246983475217)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SessionDeleteBody() # SessionDeleteBody |  (optional)

try:
    # Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id=1835246983475217)
    api_response = api_instance.campaign_gmv_max_session_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_session_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SessionDeleteBody**](SessionDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_session_get**
> InlineResponse200 campaign_gmv_max_session_get(advertiser_id, session_ids, access_token)

Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id=1835247031331842)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | 
session_ids = ['session_ids_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id=1835247031331842)
    api_response = api_instance.campaign_gmv_max_session_get(advertiser_id, session_ids, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_session_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **session_ids** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_session_list**
> InlineResponse200 campaign_gmv_max_session_list(campaign_id, advertiser_id, access_token)

Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id=1835246996436162)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
campaign_id = 'campaign_id_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id=1835246996436162)
    api_response = api_instance.campaign_gmv_max_session_list(campaign_id, advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_session_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **str**|  | [required]
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_session_update**
> InlineResponse200 campaign_gmv_max_session_update(access_token, body=body)

Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id=1835247009119233)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SessionUpdateBody() # SessionUpdateBody |  (optional)

try:
    # Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id=1835247009119233)
    api_response = api_instance.campaign_gmv_max_session_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_session_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SessionUpdateBody**](SessionUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_gmv_max_update**
> InlineResponse200 campaign_gmv_max_update(access_token, body=body)

Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id=1822001009002497)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.GmvMaxUpdateBody() # GmvMaxUpdateBody |  (optional)

try:
    # Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id=1822001009002497)
    api_response = api_instance.campaign_gmv_max_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_gmv_max_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**GmvMaxUpdateBody**](GmvMaxUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_status_update**
> InlineResponse200 campaign_status_update(access_token, body=body)

Update campaign status. [Campaign Status Update](https://business-api.tiktok.com/portal/docs?id=1739320994354178)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CampaignStatusUpdateBody() # CampaignStatusUpdateBody |  (optional)

try:
    # Update campaign status. [Campaign Status Update](https://business-api.tiktok.com/portal/docs?id=1739320994354178)
    api_response = api_instance.campaign_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CampaignStatusUpdateBody**](CampaignStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_update**
> InlineResponse200 campaign_update(access_token, body=body)

Update campaign. [Campaign Update](https://business-api.tiktok.com/portal/docs?id=1739320422086657)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CampaignUpdateBody() # CampaignUpdateBody |  (optional)

try:
    # Update campaign. [Campaign Update](https://business-api.tiktok.com/portal/docs?id=1739320422086657)
    api_response = api_instance.campaign_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CampaignUpdateBody**](CampaignUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gmv_max_bid_recommend**
> InlineResponse200 gmv_max_bid_recommend(advertiser_id, store_id, shopping_ads_type, optimization_goal, access_token, item_group_ids=item_group_ids, identity_id=identity_id)

Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id=1822001024720897)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | 
store_id = 'store_id_example' # str | 
shopping_ads_type = 'shopping_ads_type_example' # str | 
optimization_goal = 'optimization_goal_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
item_group_ids = ['item_group_ids_example'] # list[str] |  (optional)
identity_id = 'identity_id_example' # str |  (optional)

try:
    # Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id=1822001024720897)
    api_response = api_instance.gmv_max_bid_recommend(advertiser_id, store_id, shopping_ads_type, optimization_goal, access_token, item_group_ids=item_group_ids, identity_id=identity_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->gmv_max_bid_recommend: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **store_id** | **str**|  | [required]
 **shopping_ads_type** | **str**|  | [required]
 **optimization_goal** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **item_group_ids** | [**list[str]**](str.md)|  | [optional] 
 **identity_id** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gmv_max_custom_anchor_video_list_get**
> InlineResponse200 gmv_max_custom_anchor_video_list_get(advertiser_id, campaign_custom_anchor_video_id, custom_anchor_video_list, access_token)

Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id=1830215925061633)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 789 # int | 
campaign_custom_anchor_video_id = 789 # int | 
custom_anchor_video_list = [business_api_client.CustomAnchorVideoList()] # list[CustomAnchorVideoList] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id=1830215925061633)
    api_response = api_instance.gmv_max_custom_anchor_video_list_get(advertiser_id, campaign_custom_anchor_video_id, custom_anchor_video_list, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->gmv_max_custom_anchor_video_list_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **int**|  | [required]
 **campaign_custom_anchor_video_id** | **int**|  | [required]
 **custom_anchor_video_list** | [**list[CustomAnchorVideoList]**](CustomAnchorVideoList.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gmv_max_occupied_custom_shop_ads_list**
> InlineResponse200 gmv_max_occupied_custom_shop_ads_list(advertiser_id, store_id, asset_ids, occupied_asset_type, access_token)

Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id=1822001136924674)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | 
store_id = 'store_id_example' # str | 
asset_ids = ['asset_ids_example'] # list[str] | 
occupied_asset_type = 'occupied_asset_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id=1822001136924674)
    api_response = api_instance.gmv_max_occupied_custom_shop_ads_list(advertiser_id, store_id, asset_ids, occupied_asset_type, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->gmv_max_occupied_custom_shop_ads_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **store_id** | **str**|  | [required]
 **asset_ids** | [**list[str]**](str.md)|  | [required]
 **occupied_asset_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_campaign_create**
> InlineResponse200 smart_plus_campaign_create(access_token, body=body)

Create a new campaign [Smart Plus Campaign Create]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusCampaignCreateBody() # SmartPlusCampaignCreateBody |  (optional)

try:
    # Create a new campaign [Smart Plus Campaign Create]
    api_response = api_instance.smart_plus_campaign_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->smart_plus_campaign_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusCampaignCreateBody**](SmartPlusCampaignCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_campaign_get**
> InlineResponse200 smart_plus_campaign_get(advertiser_id, access_token, fields=fields, filtering=filtering, page=page, page_size=page_size)

Retrieve campaign details [Smart Plus Campaign Get]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
fields = ['fields_example'] # list[str] |  (optional)
filtering = business_api_client.FilteringSmartPlusCampaignGet() # FilteringSmartPlusCampaignGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Retrieve campaign details [Smart Plus Campaign Get]
    api_response = api_instance.smart_plus_campaign_get(advertiser_id, access_token, fields=fields, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->smart_plus_campaign_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **fields** | [**list[str]**](str.md)|  | [optional] 
 **filtering** | [**FilteringSmartPlusCampaignGet**](FilteringSmartPlusCampaignGet.md)|  | [optional] 
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

# **smart_plus_campaign_status_update**
> InlineResponse200 smart_plus_campaign_status_update(access_token, body=body)

Update campaign status [Smart Plus Campaign Status Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusCampaignStatusUpdateBody() # SmartPlusCampaignStatusUpdateBody |  (optional)

try:
    # Update campaign status [Smart Plus Campaign Status Update]
    api_response = api_instance.smart_plus_campaign_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->smart_plus_campaign_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusCampaignStatusUpdateBody**](SmartPlusCampaignStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_campaign_update**
> InlineResponse200 smart_plus_campaign_update(access_token, body=body)

Update an existing campaign [Smart Plus Campaign Update]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartPlusCampaignUpdateBody() # SmartPlusCampaignUpdateBody |  (optional)

try:
    # Update an existing campaign [Smart Plus Campaign Update]
    api_response = api_instance.smart_plus_campaign_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->smart_plus_campaign_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartPlusCampaignUpdateBody**](SmartPlusCampaignUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

