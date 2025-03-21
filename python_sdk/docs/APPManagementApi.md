"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.APPManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**app_create**](APPManagementApi.md#app_create) | **POST** /open_api/v1.3/app/create/ | Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859280958466)
[**app_info**](APPManagementApi.md#app_info) | **GET** /open_api/v1.3/app/info/ | Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859272887297)
[**app_list**](APPManagementApi.md#app_list) | **GET** /open_api/v1.3/app/list/ | Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859313270786)
[**app_optimization_event**](APPManagementApi.md#app_optimization_event) | **GET** /open_api/v1.3/app/optimization_event/ | Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859338750977)
[**app_optimization_event_retargeting**](APPManagementApi.md#app_optimization_event_retargeting) | **GET** /open_api/v1.3/app/optimization_event/retargeting/ | Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859371033601)
[**app_update**](APPManagementApi.md#app_update) | **POST** /open_api/v1.3/app/update/ | Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859300069378)

# **app_create**
> InlineResponse200 app_create(access_token, body=body)

Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id=1740859280958466)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.APPManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AppCreateBody() # AppCreateBody |  (optional)

try:
    # Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id=1740859280958466)
    api_response = api_instance.app_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling APPManagementApi->app_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AppCreateBody**](AppCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **app_info**
> InlineResponse200 app_info(advertiser_id, app_id, access_token)

Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id=1740859272887297)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.APPManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
app_id = 'app_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id=1740859272887297)
    api_response = api_instance.app_info(advertiser_id, app_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling APPManagementApi->app_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **app_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **app_list**
> InlineResponse200 app_list(advertiser_id, access_token, app_platform_ids=app_platform_ids)

Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id=1740859313270786)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.APPManagementApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
app_platform_ids = ['app_platform_ids_example'] # list[str] | List of app platform ID for filter purpose. (optional)

try:
    # Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id=1740859313270786)
    api_response = api_instance.app_list(advertiser_id, access_token, app_platform_ids=app_platform_ids)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling APPManagementApi->app_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **app_platform_ids** | [**list[str]**](str.md)| List of app platform ID for filter purpose. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **app_optimization_event**
> InlineResponse200 app_optimization_event(app_id, advertiser_id, optimization_goal, access_token, placement=placement, placement_type=placement_type, objective=objective, available_only=available_only, is_skan=is_skan, app_promotion_type=app_promotion_type)

Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id=1740859338750977)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.APPManagementApi()
app_id = 'app_id_example' # str | Your App ID, obtained after successfully creating your app.
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
optimization_goal = 'optimization_goal_example' # str | Optimization goal. For enum values, see Enumeration-Optimization Goal for more
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
placement = ['placement_example'] # list[str] | The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don't select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they've been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type = PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported. (optional)
placement_type = 'placement_type_example' # str | 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。 (optional)
objective = 'objective_example' # str | Advertising Objective. For enum values, see Enumeration-Advertising Objective (optional)
available_only = true # bool | Whether to return only available conversion events. The default value: True (only return available conversion events) (optional)
is_skan = true # bool | Whether the app is using Skan features. (optional)
app_promotion_type = 'app_promotion_type_example' # str | App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used. (optional)

try:
    # Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id=1740859338750977)
    api_response = api_instance.app_optimization_event(app_id, advertiser_id, optimization_goal, access_token, placement=placement, placement_type=placement_type, objective=objective, available_only=available_only, is_skan=is_skan, app_promotion_type=app_promotion_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling APPManagementApi->app_optimization_event: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**| Your App ID, obtained after successfully creating your app. | [required]
 **advertiser_id** | **str**| Advertiser ID | [required]
 **optimization_goal** | **str**| Optimization goal. For enum values, see Enumeration-Optimization Goal for more | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **placement** | [**list[str]**](str.md)| The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don&#x27;t select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they&#x27;ve been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported. | [optional] 
 **placement_type** | **str**| 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。 | [optional] 
 **objective** | **str**| Advertising Objective. For enum values, see Enumeration-Advertising Objective | [optional] 
 **available_only** | **bool**| Whether to return only available conversion events. The default value: True (only return available conversion events) | [optional] 
 **is_skan** | **bool**| Whether the app is using Skan features. | [optional] 
 **app_promotion_type** | **str**| App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **app_optimization_event_retargeting**
> InlineResponse200 app_optimization_event_retargeting(app_id, advertiser_id, access_token)

Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id=1740859371033601)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.APPManagementApi()
app_id = 'app_id_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id=1740859371033601)
    api_response = api_instance.app_optimization_event_retargeting(app_id, advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling APPManagementApi->app_optimization_event_retargeting: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**|  | [required]
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

# **app_update**
> InlineResponse200 app_update(access_token, body=body)

Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id=1740859300069378)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.APPManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AppUpdateBody() # AppUpdateBody |  (optional)

try:
    # Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id=1740859300069378)
    api_response = api_instance.app_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling APPManagementApi->app_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AppUpdateBody**](AppUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

