"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.MeasurementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**app_list**](MeasurementApi.md#app_list) | **GET** /open_api/v1.3/app/list/ | Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)
[**app_optimization_event**](MeasurementApi.md#app_optimization_event) | **GET** /open_api/v1.3/app/optimization_event/ | Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)

# **app_list**
> InlineResponse200 app_list(advertiser_id, access_token, app_platform_ids=app_platform_ids)

Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id=1740859313270786)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
app_platform_ids = ['app_platform_ids_example'] # list[str] | List of app platform ID for filter purpose (optional)

try:
    # Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id=1740859313270786)
    api_response = api_instance.app_list(advertiser_id, access_token, app_platform_ids=app_platform_ids)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->app_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **app_platform_ids** | [**list[str]**](str.md)| List of app platform ID for filter purpose | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **app_optimization_event**
> InlineResponse200 app_optimization_event(app_id, advertiser_id, placement, optimization_goal, access_token, objective=objective, available_only=available_only, is_skan=is_skan, app_promotion_type=app_promotion_type)

Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id=1740859338750977)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
app_id = 'app_id_example' # str | Your App ID, obtained after successfully creating your app
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
placement = ['placement_example'] # list[str] | Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138)
optimization_goal = 'optimization_goal_example' # str | Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) for more
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
objective = 'objective_example' # str | Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) (optional)
available_only = true # bool | Whether to return only available conversion events. The default value: `True` (only return available conversion events) (optional)
is_skan = true # bool | Whether the app is using Skan features (optional)
app_promotion_type = 'app_promotion_type_example' # str | App promotion type. Required when `objective_type` is `APP_PROMOTION`. Enum values: `APP_INSTALL`, `APP_RETARGETING`. Note: `APP_INSTALL` can be used in an iOS14 Dedicated Campaign, while `APP_RETARGETING` cannot be used (optional)

try:
    # Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id=1740859338750977)
    api_response = api_instance.app_optimization_event(app_id, advertiser_id, placement, optimization_goal, access_token, objective=objective, available_only=available_only, is_skan=is_skan, app_promotion_type=app_promotion_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->app_optimization_event: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**| Your App ID, obtained after successfully creating your app | [required]
 **advertiser_id** | **str**| Advertiser ID | [required]
 **placement** | [**list[str]**](str.md)| Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) | [required]
 **optimization_goal** | **str**| Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) for more | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **objective** | **str**| Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) | [optional] 
 **available_only** | **bool**| Whether to return only available conversion events. The default value: &#x60;True&#x60; (only return available conversion events) | [optional] 
 **is_skan** | **bool**| Whether the app is using Skan features | [optional] 
 **app_promotion_type** | **str**| App promotion type. Required when &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60;. Enum values: &#x60;APP_INSTALL&#x60;, &#x60;APP_RETARGETING&#x60;. Note: &#x60;APP_INSTALL&#x60; can be used in an iOS14 Dedicated Campaign, while &#x60;APP_RETARGETING&#x60; cannot be used | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

