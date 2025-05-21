# js_sdk.ReportingApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportIntegratedGet**](ReportingApi.md#reportIntegratedGet) | **GET** /open_api/v1.3/report/integrated/get/ | Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)
[**reportTaskCancel**](ReportingApi.md#reportTaskCancel) | **POST** /open_api/v1.3/report/task/cancel/ | Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)
[**reportTaskCheck**](ReportingApi.md#reportTaskCheck) | **GET** /open_api/v1.3/report/task/check/ | Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)
[**reportTaskCreate**](ReportingApi.md#reportTaskCreate) | **POST** /open_api/v1.3/report/task/create/ | 

<a name="reportIntegratedGet"></a>
# **reportIntegratedGet**
> InlineResponse200 reportIntegratedGet(report_type, Access_Token, opts)

Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.ReportingApi();
let report_type = "report_type_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'enable_total_metrics': false, // Boolean | 
  'multi_adv_report_in_utc_time': false, // Boolean | 
  'query_mode': "query_mode_example", // String | 
  'advertiser_id': "advertiser_id_example", // String | 
  'advertiser_ids': ["advertiser_ids_example"], // [String] | 
  'bc_id': "bc_id_example", // String | 
  'service_type': "service_type_example", // String | 
  'data_level': "data_level_example", // String | 
  'dimensions': ["dimensions_example"], // [String] | 
  'metrics': ["metrics_example"], // [String] | 
  'start_date': "start_date_example", // String | 
  'end_date': "end_date_example", // String | 
  'query_lifetime': true, // Boolean | 
  'order_field': "order_field_example", // String | 
  'order_type': "order_type_example", // String | 
  'filtering': null // [Object] | 
};
apiInstance.reportIntegratedGet(report_type, Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_type** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]
 **enable_total_metrics** | **Boolean**|  | [optional] [default to false]
 **multi_adv_report_in_utc_time** | **Boolean**|  | [optional] [default to false]
 **query_mode** | **String**|  | [optional] 
 **advertiser_id** | **String**|  | [optional] 
 **advertiser_ids** | [**[String]**](String.md)|  | [optional] 
 **bc_id** | **String**|  | [optional] 
 **service_type** | **String**|  | [optional] 
 **data_level** | **String**|  | [optional] 
 **dimensions** | [**[String]**](String.md)|  | [optional] 
 **metrics** | [**[String]**](String.md)|  | [optional] 
 **start_date** | **String**|  | [optional] 
 **end_date** | **String**|  | [optional] 
 **query_lifetime** | **Boolean**|  | [optional] 
 **order_field** | **String**|  | [optional] 
 **order_type** | **String**|  | [optional] 
 **filtering** | [**[Object]**](Object.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportTaskCancel"></a>
# **reportTaskCancel**
> InlineResponse200 reportTaskCancel(Access_Token, opts)

Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.ReportingApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.TaskCancelBody() // TaskCancelBody | 
};
apiInstance.reportTaskCancel(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**TaskCancelBody**](TaskCancelBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportTaskCheck"></a>
# **reportTaskCheck**
> InlineResponse200 reportTaskCheck(task_id, advertiser_id, Access_Token)

Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.ReportingApi();
let task_id = "task_id_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.reportTaskCheck(task_id, advertiser_id, Access_Token, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportTaskCreate"></a>
# **reportTaskCreate**
> InlineResponse200 reportTaskCreate(Access_Token, opts)



### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.ReportingApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ReportTaskCreateBody() // ReportTaskCreateBody | 
};
apiInstance.reportTaskCreate(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**ReportTaskCreateBody**](ReportTaskCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

