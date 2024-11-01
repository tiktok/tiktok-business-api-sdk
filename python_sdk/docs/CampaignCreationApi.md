"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.CampaignCreationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaign_create**](CampaignCreationApi.md#campaign_create) | **POST** /open_api/v1.3/campaign/create/ | To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)
[**campaign_get**](CampaignCreationApi.md#campaign_get) | **GET** /open_api/v1.3/campaign/get/ | Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)
[**campaign_status_update**](CampaignCreationApi.md#campaign_status_update) | **POST** /open_api/v1.3/campaign/status/update/ | Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)
[**campaign_update**](CampaignCreationApi.md#campaign_update) | **POST** /open_api/v1.3/campaign/update/ | To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)

# **campaign_create**
> InlineResponse200 campaign_create(access_token, body=body)

To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id=1739318962329602)

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
body = business_api_client.CampaignCreateBody() # CampaignCreateBody | Campaign create body parameters (optional)

try:
    # To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id=1739318962329602)
    api_response = api_instance.campaign_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CampaignCreateBody**](CampaignCreateBody.md)| Campaign create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_get**
> InlineResponse200 campaign_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)

Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id=1739315828649986)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CampaignCreationApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringCampaignGet() # FilteringCampaignGet | Filtering Parameters (optional)
page = 56 # int | Current page (optional)
page_size = 56 # int | Page size (optional)
fields = ['fields_example'] # list[str] | Supported values include`campaign_id `, ` campaign_name `, ` advertiser_id `, `budget `, `budget_mode `, `status `, `operation_status`, `objective `, `objective_type `, `create_time `, `modify_time`, `is_new_structure`, `campaign_app_profile_page_state` , `special_industries`, `secondary_status`.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default. (optional)

try:
    # Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id=1739315828649986)
    api_response = api_instance.campaign_get(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size, fields=fields)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringCampaignGet**](FilteringCampaignGet.md)| Filtering Parameters | [optional] 
 **page** | **int**| Current page | [optional] 
 **page_size** | **int**| Page size | [optional] 
 **fields** | [**list[str]**](str.md)| Supported values include&#x60;campaign_id &#x60;, &#x60; campaign_name &#x60;, &#x60; advertiser_id &#x60;, &#x60;budget &#x60;, &#x60;budget_mode &#x60;, &#x60;status &#x60;, &#x60;operation_status&#x60;, &#x60;objective &#x60;, &#x60;objective_type &#x60;, &#x60;create_time &#x60;, &#x60;modify_time&#x60;, &#x60;is_new_structure&#x60;, &#x60;campaign_app_profile_page_state&#x60; , &#x60;special_industries&#x60;, &#x60;secondary_status&#x60;.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_status_update**
> InlineResponse200 campaign_status_update(access_token, body=body)

Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id=1739320994354178)

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
body = business_api_client.CampaignStatusUpdateBody() # CampaignStatusUpdateBody | Campaign status update body parameters (optional)

try:
    # Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id=1739320994354178)
    api_response = api_instance.campaign_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CampaignStatusUpdateBody**](CampaignStatusUpdateBody.md)| Campaign status update body parameters | [optional] 

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

To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id=1739320422086657)

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
body = business_api_client.CampaignUpdateBody() # CampaignUpdateBody | Campaign update body parameters (optional)

try:
    # To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id=1739320422086657)
    api_response = api_instance.campaign_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CampaignCreationApi->campaign_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CampaignUpdateBody**](CampaignUpdateBody.md)| Campaign update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

