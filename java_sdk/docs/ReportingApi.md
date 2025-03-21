# ReportingApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportIntegratedGet**](ReportingApi.md#reportIntegratedGet) | **GET** /open_api/v1.3/report/integrated/get/ | Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)
[**reportTaskCancel**](ReportingApi.md#reportTaskCancel) | **POST** /open_api/v1.3/report/task/cancel/ | Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)
[**reportTaskCheck**](ReportingApi.md#reportTaskCheck) | **GET** /open_api/v1.3/report/task/check/ | Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)
[**reportTaskCreate**](ReportingApi.md#reportTaskCreate) | **POST** /open_api/v1.3/report/task/create/ | 

<a name="reportIntegratedGet"></a>
# **reportIntegratedGet**
> Response reportIntegratedGet(reportType, accessToken, page, pageSize, enableTotalMetrics, multiAdvReportInUtcTime, queryMode, advertiserId, advertiserIds, bcId, serviceType, dataLevel, dimensions, metrics, startDate, endDate, queryLifetime, orderField, orderType, filtering)

Run a synchronous report. [Report Integrated Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302848100353)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.ReportingApi;


ReportingApi apiInstance = new ReportingApi();
String reportType = "reportType_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
Boolean enableTotalMetrics = false; // Boolean | 
Boolean multiAdvReportInUtcTime = false; // Boolean | 
String queryMode = "queryMode_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
List<String> advertiserIds = Arrays.asList("advertiserIds_example"); // List<String> | 
String bcId = "bcId_example"; // String | 
String serviceType = "serviceType_example"; // String | 
String dataLevel = "dataLevel_example"; // String | 
List<String> dimensions = Arrays.asList("dimensions_example"); // List<String> | 
List<String> metrics = Arrays.asList("metrics_example"); // List<String> | 
String startDate = "startDate_example"; // String | 
String endDate = "endDate_example"; // String | 
Boolean queryLifetime = true; // Boolean | 
String orderField = "orderField_example"; // String | 
String orderType = "orderType_example"; // String | 
FilteringReportIntegratedGet filtering = new FilteringReportIntegratedGet(); // FilteringReportIntegratedGet | 
try {
    Response result = apiInstance.reportIntegratedGet(reportType, accessToken, page, pageSize, enableTotalMetrics, multiAdvReportInUtcTime, queryMode, advertiserId, advertiserIds, bcId, serviceType, dataLevel, dimensions, metrics, startDate, endDate, queryLifetime, orderField, orderType, filtering);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#reportIntegratedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **page** | **Long**|  | [optional] [default to 1] [enum: 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 1000]
 **enableTotalMetrics** | **Boolean**|  | [optional] [default to false]
 **multiAdvReportInUtcTime** | **Boolean**|  | [optional] [default to false]
 **queryMode** | **String**|  | [optional]
 **advertiserId** | **String**|  | [optional]
 **advertiserIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **bcId** | **String**|  | [optional]
 **serviceType** | **String**|  | [optional]
 **dataLevel** | **String**|  | [optional]
 **dimensions** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **metrics** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **startDate** | **String**|  | [optional]
 **endDate** | **String**|  | [optional]
 **queryLifetime** | **Boolean**|  | [optional]
 **orderField** | **String**|  | [optional]
 **orderType** | **String**|  | [optional]
 **filtering** | [**FilteringReportIntegratedGet**](FilteringReportIntegratedGet.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportTaskCancel"></a>
# **reportTaskCancel**
> Response reportTaskCancel(accessToken, body)

Cancel an asynchronous report task. [Report Task Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1803615367145537)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.ReportingApi;


ReportingApi apiInstance = new ReportingApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
TaskCancelBody body = new TaskCancelBody(); // TaskCancelBody | 
try {
    Response result = apiInstance.reportTaskCancel(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#reportTaskCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**TaskCancelBody**](TaskCancelBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reportTaskCheck"></a>
# **reportTaskCheck**
> Response reportTaskCheck(taskId, advertiserId, accessToken)

Get the status of an async report task. [Report Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1740302781443073)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.ReportingApi;


ReportingApi apiInstance = new ReportingApi();
String taskId = "taskId_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.reportTaskCheck(taskId, advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#reportTaskCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reportTaskCreate"></a>
# **reportTaskCreate**
> Response reportTaskCreate(accessToken, body)



### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.ReportingApi;


ReportingApi apiInstance = new ReportingApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
TaskCreateBody body = new TaskCreateBody(); // TaskCreateBody | 
try {
    Response result = apiInstance.reportTaskCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#reportTaskCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**TaskCreateBody**](TaskCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

