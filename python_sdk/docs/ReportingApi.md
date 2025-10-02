"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.ReportingApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_integrated_get**](ReportingApi.md#report_integrated_get) | **GET** /open_api/v1.3/report/integrated/get/ | Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)
[**report_task_cancel**](ReportingApi.md#report_task_cancel) | **POST** /open_api/v1.3/report/task/cancel/ | Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)
[**report_task_check**](ReportingApi.md#report_task_check) | **GET** /open_api/v1.3/report/task/check/ | Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)
[**report_task_create**](ReportingApi.md#report_task_create) | **POST** /open_api/v1.3/report/task/create/ | 
[**smart_plus_material_report_breakdown**](ReportingApi.md#smart_plus_material_report_breakdown) | **GET** /open_api/v1.3/smart_plus/material_report/breakdown/ | Get breakdown of material reports [Smart Plus Material Report Breakdown]
[**smart_plus_material_report_overview**](ReportingApi.md#smart_plus_material_report_overview) | **GET** /open_api/v1.3/smart_plus/material_report/overview/ | Get overview of material reports [Smart Plus Material Report Overview]

# **report_integrated_get**
> InlineResponse200 report_integrated_get(report_type, access_token, page=page, page_size=page_size, enable_total_metrics=enable_total_metrics, multi_adv_report_in_utc_time=multi_adv_report_in_utc_time, query_mode=query_mode, advertiser_id=advertiser_id, advertiser_ids=advertiser_ids, bc_id=bc_id, service_type=service_type, data_level=data_level, dimensions=dimensions, metrics=metrics, start_date=start_date, end_date=end_date, query_lifetime=query_lifetime, order_field=order_field, order_type=order_type, filtering=filtering)

Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id=1740302848100353)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
report_type = 'report_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
enable_total_metrics = false # bool |  (optional) (default to false)
multi_adv_report_in_utc_time = false # bool |  (optional) (default to false)
query_mode = 'query_mode_example' # str |  (optional)
advertiser_id = 'advertiser_id_example' # str |  (optional)
advertiser_ids = ['advertiser_ids_example'] # list[str] |  (optional)
bc_id = 'bc_id_example' # str |  (optional)
service_type = 'service_type_example' # str |  (optional)
data_level = 'data_level_example' # str |  (optional)
dimensions = ['dimensions_example'] # list[str] |  (optional)
metrics = ['metrics_example'] # list[str] |  (optional)
start_date = 'start_date_example' # str |  (optional)
end_date = 'end_date_example' # str |  (optional)
query_lifetime = true # bool |  (optional)
order_field = 'order_field_example' # str |  (optional)
order_type = 'order_type_example' # str |  (optional)
filtering = NULL # list[object] |  (optional)

try:
    # Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id=1740302848100353)
    api_response = api_instance.report_integrated_get(report_type, access_token, page=page, page_size=page_size, enable_total_metrics=enable_total_metrics, multi_adv_report_in_utc_time=multi_adv_report_in_utc_time, query_mode=query_mode, advertiser_id=advertiser_id, advertiser_ids=advertiser_ids, bc_id=bc_id, service_type=service_type, data_level=data_level, dimensions=dimensions, metrics=metrics, start_date=start_date, end_date=end_date, query_lifetime=query_lifetime, order_field=order_field, order_type=order_type, filtering=filtering)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->report_integrated_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]
 **enable_total_metrics** | **bool**|  | [optional] [default to false]
 **multi_adv_report_in_utc_time** | **bool**|  | [optional] [default to false]
 **query_mode** | **str**|  | [optional] 
 **advertiser_id** | **str**|  | [optional] 
 **advertiser_ids** | [**list[str]**](str.md)|  | [optional] 
 **bc_id** | **str**|  | [optional] 
 **service_type** | **str**|  | [optional] 
 **data_level** | **str**|  | [optional] 
 **dimensions** | [**list[str]**](str.md)|  | [optional] 
 **metrics** | [**list[str]**](str.md)|  | [optional] 
 **start_date** | **str**|  | [optional] 
 **end_date** | **str**|  | [optional] 
 **query_lifetime** | **bool**|  | [optional] 
 **order_field** | **str**|  | [optional] 
 **order_type** | **str**|  | [optional] 
 **filtering** | [**list[object]**](object.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **report_task_cancel**
> InlineResponse200 report_task_cancel(access_token, body=body)

Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id=1803615367145537)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.TaskCancelBody() # TaskCancelBody |  (optional)

try:
    # Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id=1803615367145537)
    api_response = api_instance.report_task_cancel(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->report_task_cancel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**TaskCancelBody**](TaskCancelBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **report_task_check**
> InlineResponse200 report_task_check(task_id, advertiser_id, access_token)

Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id=1740302781443073)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
task_id = 'task_id_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id=1740302781443073)
    api_response = api_instance.report_task_check(task_id, advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->report_task_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **str**|  | [required]
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

# **report_task_create**
> InlineResponse200 report_task_create(access_token, body=body)



### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ReportTaskCreateBody() # ReportTaskCreateBody |  (optional)

try:
    api_response = api_instance.report_task_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->report_task_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ReportTaskCreateBody**](ReportTaskCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smart_plus_material_report_breakdown**
> InlineResponse200 smart_plus_material_report_breakdown(advertiser_id, dimensions, start_date, end_date, access_token, metrics=metrics, filtering=filtering, sort_field=sort_field, sort_type=sort_type, page=page, page_size=page_size)

Get breakdown of material reports [Smart Plus Material Report Breakdown]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
advertiser_id = 'advertiser_id_example' # str | 
dimensions = ['dimensions_example'] # list[str] | 
start_date = 'start_date_example' # str | 
end_date = 'end_date_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
metrics = ['metrics_example'] # list[str] |  (optional)
filtering = business_api_client.FilteringSmartPlusMaterialReportBreakdown() # FilteringSmartPlusMaterialReportBreakdown |  (optional)
sort_field = 'spend' # str |  (optional) (default to spend)
sort_type = 'DESC' # str |  (optional) (default to DESC)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get breakdown of material reports [Smart Plus Material Report Breakdown]
    api_response = api_instance.smart_plus_material_report_breakdown(advertiser_id, dimensions, start_date, end_date, access_token, metrics=metrics, filtering=filtering, sort_field=sort_field, sort_type=sort_type, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->smart_plus_material_report_breakdown: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **dimensions** | [**list[str]**](str.md)|  | [required]
 **start_date** | **str**|  | [required]
 **end_date** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **metrics** | [**list[str]**](str.md)|  | [optional] 
 **filtering** | [**FilteringSmartPlusMaterialReportBreakdown**](FilteringSmartPlusMaterialReportBreakdown.md)|  | [optional] 
 **sort_field** | **str**|  | [optional] [default to spend]
 **sort_type** | **str**|  | [optional] [default to DESC]
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

# **smart_plus_material_report_overview**
> InlineResponse200 smart_plus_material_report_overview(advertiser_id, dimensions, access_token, metrics=metrics, start_date=start_date, end_date=end_date, query_lifetime=query_lifetime, filtering=filtering, sort_field=sort_field, sort_type=sort_type, page=page, page_size=page_size)

Get overview of material reports [Smart Plus Material Report Overview]

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
advertiser_id = 'advertiser_id_example' # str | 
dimensions = ['dimensions_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
metrics = ['metrics_example'] # list[str] |  (optional)
start_date = 'start_date_example' # str |  (optional)
end_date = 'end_date_example' # str |  (optional)
query_lifetime = false # bool |  (optional) (default to false)
filtering = business_api_client.FilteringSmartPlusMaterialReportOverview() # FilteringSmartPlusMaterialReportOverview |  (optional)
sort_field = 'spend' # str |  (optional) (default to spend)
sort_type = 'DESC' # str |  (optional) (default to DESC)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get overview of material reports [Smart Plus Material Report Overview]
    api_response = api_instance.smart_plus_material_report_overview(advertiser_id, dimensions, access_token, metrics=metrics, start_date=start_date, end_date=end_date, query_lifetime=query_lifetime, filtering=filtering, sort_field=sort_field, sort_type=sort_type, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->smart_plus_material_report_overview: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **dimensions** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **metrics** | [**list[str]**](str.md)|  | [optional] 
 **start_date** | **str**|  | [optional] 
 **end_date** | **str**|  | [optional] 
 **query_lifetime** | **bool**|  | [optional] [default to false]
 **filtering** | [**FilteringSmartPlusMaterialReportOverview**](FilteringSmartPlusMaterialReportOverview.md)|  | [optional] 
 **sort_field** | **str**|  | [optional] [default to spend]
 **sort_type** | **str**|  | [optional] [default to DESC]
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

