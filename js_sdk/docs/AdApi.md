# js_sdk.AdApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adCreate**](AdApi.md#adCreate) | **POST** /open_api/v1.3/ad/create/ | Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953377508354)
[**adGet**](AdApi.md#adGet) | **GET** /open_api/v1.3/ad/get/ | Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1735735588640770)
[**adStatusUpdate**](AdApi.md#adStatusUpdate) | **POST** /open_api/v1.3/ad/status/update/ | Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953422970882)
[**adUpdate**](AdApi.md#adUpdate) | **POST** /open_api/v1.3/ad/update/ | Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953405142018)
[**smartPlusAdAppeal**](AdApi.md#smartPlusAdAppeal) | **POST** /open_api/v1.3/smart_plus/ad/appeal/ | Submit ad appeal [Smart Plus Ad Appeal]
[**smartPlusAdCreate**](AdApi.md#smartPlusAdCreate) | **POST** /open_api/v1.3/smart_plus/ad/create/ | Create a new ad [Smart Plus Ad Create]
[**smartPlusAdGet**](AdApi.md#smartPlusAdGet) | **GET** /open_api/v1.3/smart_plus/ad/get/ | Retrieve ad details [Smart Plus Ad Get]
[**smartPlusAdMaterialStatusUpdate**](AdApi.md#smartPlusAdMaterialStatusUpdate) | **POST** /open_api/v1.3/smart_plus/ad/material_status/update/ | Update ad material status [Smart Plus Ad Material Status Update]
[**smartPlusAdReviewInfo**](AdApi.md#smartPlusAdReviewInfo) | **GET** /open_api/v1.3/smart_plus/ad/review_info/ | Get ad review info [Smart Plus Ad Review Info]
[**smartPlusAdStatusUpdate**](AdApi.md#smartPlusAdStatusUpdate) | **POST** /open_api/v1.3/smart_plus/ad/status/update/ | Update ad status [Smart Plus Ad Status Update]
[**smartPlusAdUpdate**](AdApi.md#smartPlusAdUpdate) | **POST** /open_api/v1.3/smart_plus/ad/update/ | Update an ad [Smart Plus Ad Update]
[**smartPlusMaterialReviewInfo**](AdApi.md#smartPlusMaterialReviewInfo) | **GET** /open_api/v1.3/smart_plus/material/review_info/ | Get material review info [Smart Plus Material Review Info]

<a name="adCreate"></a>
# **adCreate**
> InlineResponse200 adCreate(Access_Token, opts)

Create ad. [Ad Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953377508354)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdCreateBody() // AdCreateBody | 
};
apiInstance.adCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdCreateBody**](AdCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adGet"></a>
# **adGet**
> InlineResponse200 adGet(advertiser_id, Access_Token, opts)

Get ads. [Ad Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1735735588640770)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringAdGet(), // FilteringAdGet | 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'fields': ["fields_example"], // [String] | 
  'exclude_field_types_in_response': ["exclude_field_types_in_response_example"] // [String] | 
};
apiInstance.adGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **filtering** | [**FilteringAdGet**](FilteringAdGet.md)|  | [optional] 
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

<a name="adStatusUpdate"></a>
# **adStatusUpdate**
> InlineResponse200 adStatusUpdate(Access_Token, opts)

Update ad status. [Ad Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953422970882)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdStatusUpdateBody() // AdStatusUpdateBody | 
};
apiInstance.adStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdStatusUpdateBody**](AdStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adUpdate"></a>
# **adUpdate**
> InlineResponse200 adUpdate(Access_Token, opts)

Update ad. [Ad Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739953405142018)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdUpdateBody() // AdUpdateBody | 
};
apiInstance.adUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdUpdateBody**](AdUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdAppeal"></a>
# **smartPlusAdAppeal**
> InlineResponse200 smartPlusAdAppeal(Access_Token, opts)

Submit ad appeal [Smart Plus Ad Appeal]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdAppealBody() // SmartPlusAdAppealBody | 
};
apiInstance.smartPlusAdAppeal(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdAppealBody**](SmartPlusAdAppealBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdCreate"></a>
# **smartPlusAdCreate**
> InlineResponse200 smartPlusAdCreate(Access_Token, opts)

Create a new ad [Smart Plus Ad Create]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdCreateBody() // SmartPlusAdCreateBody | 
};
apiInstance.smartPlusAdCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdCreateBody**](SmartPlusAdCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdGet"></a>
# **smartPlusAdGet**
> InlineResponse200 smartPlusAdGet(advertiser_id, Access_Token, opts)

Retrieve ad details [Smart Plus Ad Get]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringSmartPlusAdGet(), // FilteringSmartPlusAdGet | 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'fields': ["fields_example"] // [String] | 
};
apiInstance.smartPlusAdGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **filtering** | [**FilteringSmartPlusAdGet**](FilteringSmartPlusAdGet.md)|  | [optional] 
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

<a name="smartPlusAdMaterialStatusUpdate"></a>
# **smartPlusAdMaterialStatusUpdate**
> InlineResponse200 smartPlusAdMaterialStatusUpdate(Access_Token, opts)

Update ad material status [Smart Plus Ad Material Status Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdMaterialStatusUpdateBody() // SmartPlusAdMaterialStatusUpdateBody | 
};
apiInstance.smartPlusAdMaterialStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdMaterialStatusUpdateBody**](SmartPlusAdMaterialStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdReviewInfo"></a>
# **smartPlusAdReviewInfo**
> InlineResponse200 smartPlusAdReviewInfo(advertiser_id, smart_plus_ad_ids, Access_Token, opts)

Get ad review info [Smart Plus Ad Review Info]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let advertiser_id = "advertiser_id_example"; // String | 
let smart_plus_ad_ids = ["smart_plus_ad_ids_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'extra_info_setting': new js_sdk.ExtraInfoSettingSmartPlusAdReviewInfo(), // ExtraInfoSettingSmartPlusAdReviewInfo | 
  'lang': "\"\"", // String | 
  'context_info': new js_sdk.ContextInfoSmartPlusAdReviewInfo() // ContextInfoSmartPlusAdReviewInfo | 
};
apiInstance.smartPlusAdReviewInfo(advertiser_id, smart_plus_ad_ids, Access_Token, opts, (error, data, response) => {
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
 **smart_plus_ad_ids** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **extra_info_setting** | [**ExtraInfoSettingSmartPlusAdReviewInfo**](ExtraInfoSettingSmartPlusAdReviewInfo.md)|  | [optional] 
 **lang** | **String**|  | [optional] [default to &quot;&quot;]
 **context_info** | [**ContextInfoSmartPlusAdReviewInfo**](ContextInfoSmartPlusAdReviewInfo.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusAdStatusUpdate"></a>
# **smartPlusAdStatusUpdate**
> InlineResponse200 smartPlusAdStatusUpdate(Access_Token, opts)

Update ad status [Smart Plus Ad Status Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdStatusUpdateBody() // SmartPlusAdStatusUpdateBody | 
};
apiInstance.smartPlusAdStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdStatusUpdateBody**](SmartPlusAdStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusAdUpdate"></a>
# **smartPlusAdUpdate**
> InlineResponse200 smartPlusAdUpdate(Access_Token, opts)

Update an ad [Smart Plus Ad Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusAdUpdateBody() // SmartPlusAdUpdateBody | 
};
apiInstance.smartPlusAdUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusAdUpdateBody**](SmartPlusAdUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusMaterialReviewInfo"></a>
# **smartPlusMaterialReviewInfo**
> InlineResponse200 smartPlusMaterialReviewInfo(advertiser_id, ad_material_ids, Access_Token, opts)

Get material review info [Smart Plus Material Review Info]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let advertiser_id = "advertiser_id_example"; // String | 
let ad_material_ids = ["ad_material_ids_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'extra_info_setting': new js_sdk.ExtraInfoSettingSmartPlusMaterialReviewInfo(), // ExtraInfoSettingSmartPlusMaterialReviewInfo | 
  'lang': "\"\"", // String | 
  'context_info': new js_sdk.ContextInfoSmartPlusMaterialReviewInfo() // ContextInfoSmartPlusMaterialReviewInfo | 
};
apiInstance.smartPlusMaterialReviewInfo(advertiser_id, ad_material_ids, Access_Token, opts, (error, data, response) => {
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
 **ad_material_ids** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **extra_info_setting** | [**ExtraInfoSettingSmartPlusMaterialReviewInfo**](ExtraInfoSettingSmartPlusMaterialReviewInfo.md)|  | [optional] 
 **lang** | **String**|  | [optional] [default to &quot;&quot;]
 **context_info** | [**ContextInfoSmartPlusMaterialReviewInfo**](ContextInfoSmartPlusMaterialReviewInfo.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

