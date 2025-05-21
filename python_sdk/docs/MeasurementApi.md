"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.MeasurementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offline_create**](MeasurementApi.md#offline_create) | **POST** /open_api/v1.3/offline/create/ | Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1758427576470529)
[**offline_delete**](MeasurementApi.md#offline_delete) | **POST** /open_api/v1.3/offline/delete/ | Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596790860802)
[**offline_get**](MeasurementApi.md#offline_get) | **GET** /open_api/v1.3/offline/get/ | Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596808589313)
[**offline_update**](MeasurementApi.md#offline_update) | **POST** /open_api/v1.3/offline/update/ | Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596741157889)
[**pixel_create**](MeasurementApi.md#pixel_create) | **POST** /open_api/v1.3/pixel/create/ | Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858779758593)
[**pixel_event_create**](MeasurementApi.md#pixel_event_create) | **POST** /open_api/v1.3/pixel/event/create/ | Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858807646209)
[**pixel_event_delete**](MeasurementApi.md#pixel_event_delete) | **POST** /open_api/v1.3/pixel/event/delete/ | Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858862104578)
[**pixel_event_stats**](MeasurementApi.md#pixel_event_stats) | **GET** /open_api/v1.3/pixel/event/stats/ | View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858904557570)
[**pixel_event_update**](MeasurementApi.md#pixel_event_update) | **POST** /open_api/v1.3/pixel/event/update/ | Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858823774210)
[**pixel_list**](MeasurementApi.md#pixel_list) | **GET** /open_api/v1.3/pixel/list/ | Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858697598978)
[**pixel_update**](MeasurementApi.md#pixel_update) | **POST** /open_api/v1.3/pixel/update/ | Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858799524865)

# **offline_create**
> InlineResponse200 offline_create(access_token, body=body)

Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id=1758427576470529)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.OfflineCreateBody() # OfflineCreateBody |  (optional)

try:
    # Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id=1758427576470529)
    api_response = api_instance.offline_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->offline_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**OfflineCreateBody**](OfflineCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offline_delete**
> InlineResponse200 offline_delete(access_token, body=body)

Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id=1765596790860802)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.OfflineDeleteBody() # OfflineDeleteBody |  (optional)

try:
    # Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id=1765596790860802)
    api_response = api_instance.offline_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->offline_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**OfflineDeleteBody**](OfflineDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offline_get**
> InlineResponse200 offline_get(access_token, advertiser_id=advertiser_id, event_set_ids=event_set_ids, name=name)

Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id=1765596808589313)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
advertiser_id = 'advertiser_id_example' # str |  (optional)
event_set_ids = ['event_set_ids_example'] # list[str] |  (optional)
name = 'name_example' # str |  (optional)

try:
    # Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id=1765596808589313)
    api_response = api_instance.offline_get(access_token, advertiser_id=advertiser_id, event_set_ids=event_set_ids, name=name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->offline_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **advertiser_id** | **str**|  | [optional] 
 **event_set_ids** | [**list[str]**](str.md)|  | [optional] 
 **name** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **offline_update**
> InlineResponse200 offline_update(access_token, body=body)

Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id=1765596741157889)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.OfflineUpdateBody() # OfflineUpdateBody |  (optional)

try:
    # Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id=1765596741157889)
    api_response = api_instance.offline_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->offline_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**OfflineUpdateBody**](OfflineUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_create**
> InlineResponse200 pixel_create(access_token, body=body)

Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id=1740858779758593)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PixelCreateBody() # PixelCreateBody |  (optional)

try:
    # Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id=1740858779758593)
    api_response = api_instance.pixel_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PixelCreateBody**](PixelCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_event_create**
> InlineResponse200 pixel_event_create(access_token, body=body)

Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id=1740858807646209)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.EventCreateBody() # EventCreateBody |  (optional)

try:
    # Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id=1740858807646209)
    api_response = api_instance.pixel_event_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_event_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**EventCreateBody**](EventCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_event_delete**
> InlineResponse200 pixel_event_delete(access_token, body=body)

Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id=1740858862104578)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.EventDeleteBody() # EventDeleteBody |  (optional)

try:
    # Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id=1740858862104578)
    api_response = api_instance.pixel_event_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_event_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**EventDeleteBody**](EventDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_event_stats**
> InlineResponse200 pixel_event_stats(advertiser_id, pixel_ids, date_range, access_token)

View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id=1740858904557570)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
advertiser_id = 'advertiser_id_example' # str | 
pixel_ids = ['pixel_ids_example'] # list[str] | 
date_range = business_api_client.DateRange() # DateRange | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id=1740858904557570)
    api_response = api_instance.pixel_event_stats(advertiser_id, pixel_ids, date_range, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_event_stats: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **pixel_ids** | [**list[str]**](str.md)|  | [required]
 **date_range** | [**DateRange**](DateRange.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_event_update**
> InlineResponse200 pixel_event_update(access_token, body=body)

Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id=1740858823774210)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.EventUpdateBody() # EventUpdateBody |  (optional)

try:
    # Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id=1740858823774210)
    api_response = api_instance.pixel_event_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_event_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**EventUpdateBody**](EventUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_list**
> InlineResponse200 pixel_list(advertiser_id, access_token, pixel_id=pixel_id, code=code, name=name, order_by=order_by, filtering=filtering, page=page, page_size=page_size)

Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id=1740858697598978)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
pixel_id = 'pixel_id_example' # str |  (optional)
code = 'code_example' # str |  (optional)
name = 'name_example' # str |  (optional)
order_by = 'EARLIEST_CREATE' # str |  (optional) (default to EARLIEST_CREATE)
filtering = business_api_client.FilteringPixelList() # FilteringPixelList |  (optional)
page = 789 # int |  (optional)
page_size = 789 # int |  (optional)

try:
    # Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id=1740858697598978)
    api_response = api_instance.pixel_list(advertiser_id, access_token, pixel_id=pixel_id, code=code, name=name, order_by=order_by, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **pixel_id** | **str**|  | [optional] 
 **code** | **str**|  | [optional] 
 **name** | **str**|  | [optional] 
 **order_by** | **str**|  | [optional] [default to EARLIEST_CREATE]
 **filtering** | [**FilteringPixelList**](FilteringPixelList.md)|  | [optional] 
 **page** | **int**|  | [optional] 
 **page_size** | **int**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pixel_update**
> InlineResponse200 pixel_update(access_token, body=body)

Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id=1740858799524865)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.MeasurementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PixelUpdateBody() # PixelUpdateBody |  (optional)

try:
    # Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id=1740858799524865)
    api_response = api_instance.pixel_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MeasurementApi->pixel_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PixelUpdateBody**](PixelUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

