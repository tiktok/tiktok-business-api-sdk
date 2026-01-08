# js_sdk.AdgroupApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adgroupCreate**](AdgroupApi.md#adgroupCreate) | **POST** /open_api/v1.3/adgroup/create/ | Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739499616346114)
[**adgroupGet**](AdgroupApi.md#adgroupGet) | **GET** /open_api/v1.3/adgroup/get/ | Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739314558673922)
[**adgroupQuota**](AdgroupApi.md#adgroupQuota) | **GET** /open_api/v1.3/adgroup/quota/ | Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)
[**adgroupStatusUpdate**](AdgroupApi.md#adgroupStatusUpdate) | **POST** /open_api/v1.3/adgroup/status/update/ | Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739591716326402)
[**adgroupUpdate**](AdgroupApi.md#adgroupUpdate) | **POST** /open_api/v1.3/adgroup/update/ | Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739586761631745)
[**smartPlusAdgroupCreate**](AdgroupApi.md#smartPlusAdgroupCreate) | **POST** /open_api/v1.3/smart_plus/adgroup/create/ | Create a new ad group [Smart Plus AdGroup Create]
[**smartPlusAdgroupGet**](AdgroupApi.md#smartPlusAdgroupGet) | **GET** /open_api/v1.3/smart_plus/adgroup/get/ | Retrieve ad group details [Smart Plus AdGroup Get]
[**smartPlusAdgroupStatusUpdate**](AdgroupApi.md#smartPlusAdgroupStatusUpdate) | **POST** /open_api/v1.3/smart_plus/adgroup/status/update/ | Update ad group status [Smart Plus AdGroup Status Update]
[**smartPlusAdgroupUpdate**](AdgroupApi.md#smartPlusAdgroupUpdate) | **POST** /open_api/v1.3/smart_plus/adgroup/update/ | Update an ad group [Smart Plus AdGroup Update]

<a name="adgroupCreate"></a>
# **adgroupCreate**
> InlineResponse200 adgroupCreate(Access_Token, opts)

Create adgroup. [Adgroup Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739499616346114)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdgroupCreateBody() // AdgroupCreateBody | 
};
apiInstance.adgroupCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdgroupCreateBody**](AdgroupCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adgroupGet"></a>
# **adgroupGet**
> InlineResponse200 adgroupGet(advertiser_id, Access_Token, opts)

Get adgroups. [Adgroup Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739314558673922)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringAdgroupGet(), // FilteringAdgroupGet | 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'fields': ["fields_example"], // [String] | 
  'exclude_field_types_in_response': ["exclude_field_types_in_response_example"] // [String] | 
};
apiInstance.adgroupGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringAdgroupGet**](FilteringAdgroupGet.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]
 **fields** | [**[String]**](String.md)|  | [optional] 
 **exclude_field_types_in_response** | [**[String]**](String.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adgroupQuota"></a>
# **adgroupQuota**
> InlineResponse200 adgroupQuota(advertiser_id, Access_Token)

Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.adgroupQuota(advertiser_id, Access_Token, (error, data, response) => {
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
 **advertiser_id** | **String**| Advertiser ID. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adgroupStatusUpdate"></a>
# **adgroupStatusUpdate**
> InlineResponse200 adgroupStatusUpdate(Access_Token, opts)

Update adgroup status. [Adgroup Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739591716326402)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdgroupStatusUpdateBody() // AdgroupStatusUpdateBody | 
};
apiInstance.adgroupStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdgroupStatusUpdateBody**](AdgroupStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adgroupUpdate"></a>
# **adgroupUpdate**
> InlineResponse200 adgroupUpdate(Access_Token, opts)

Update adgroup. [Adgroup Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739586761631745)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdgroupUpdateBody() // AdgroupUpdateBody | 
};
apiInstance.adgroupUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdgroupUpdateBody**](AdgroupUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdgroupCreate"></a>
# **smartPlusAdgroupCreate**
> InlineResponse200 smartPlusAdgroupCreate(Access_Token, opts)

Create a new ad group [Smart Plus AdGroup Create]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdgroupCreateBody() // SmartPlusAdgroupCreateBody | 
};
apiInstance.smartPlusAdgroupCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdgroupCreateBody**](SmartPlusAdgroupCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdgroupGet"></a>
# **smartPlusAdgroupGet**
> InlineResponse200 smartPlusAdgroupGet(advertiser_id, Access_Token, opts)

Retrieve ad group details [Smart Plus AdGroup Get]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringSmartPlusAdgroupGet(), // FilteringSmartPlusAdgroupGet | 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'fields': ["fields_example"] // [String] | 
};
apiInstance.smartPlusAdgroupGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringSmartPlusAdgroupGet**](FilteringSmartPlusAdgroupGet.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]
 **fields** | [**[String]**](String.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusAdgroupStatusUpdate"></a>
# **smartPlusAdgroupStatusUpdate**
> InlineResponse200 smartPlusAdgroupStatusUpdate(Access_Token, opts)

Update ad group status [Smart Plus AdGroup Status Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdgroupStatusUpdateBody() // SmartPlusAdgroupStatusUpdateBody | 
};
apiInstance.smartPlusAdgroupStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdgroupStatusUpdateBody**](SmartPlusAdgroupStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdgroupUpdate"></a>
# **smartPlusAdgroupUpdate**
> InlineResponse200 smartPlusAdgroupUpdate(Access_Token, opts)

Update an ad group [Smart Plus AdGroup Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdgroupUpdateBody() // SmartPlusAdgroupUpdateBody | 
};
apiInstance.smartPlusAdgroupUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdgroupUpdateBody**](SmartPlusAdgroupUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

