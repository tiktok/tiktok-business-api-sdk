# js_sdk.AudienceApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dmpCustomAudienceApply**](AudienceApi.md#dmpCustomAudienceApply) | **POST** /open_api/v1.3/dmp/custom_audience/apply/ | Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
[**dmpCustomAudienceApplyLog**](AudienceApi.md#dmpCustomAudienceApplyLog) | **GET** /open_api/v1.3/dmp/custom_audience/apply/log/ | Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758615737388033)
[**dmpCustomAudienceCreate**](AudienceApi.md#dmpCustomAudienceCreate) | **POST** /open_api/v1.3/dmp/custom_audience/create/ | Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940570793985)
[**dmpCustomAudienceDelete**](AudienceApi.md#dmpCustomAudienceDelete) | **POST** /open_api/v1.3/dmp/custom_audience/delete/ | Delete audiences [Dmp Custom_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940539757569)
[**dmpCustomAudienceFileUpload**](AudienceApi.md#dmpCustomAudienceFileUpload) | **POST** /open_api/v1.3/dmp/custom_audience/file/upload/ | Upload a data file [Dmp Custom_audience File Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940567842818)
[**dmpCustomAudienceGet**](AudienceApi.md#dmpCustomAudienceGet) | **GET** /open_api/v1.3/dmp/custom_audience/get/ | Obtain the details of specified audiences [Dmp Custom_audience Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940507792385)
[**dmpCustomAudienceList**](AudienceApi.md#dmpCustomAudienceList) | **GET** /open_api/v1.3/dmp/custom_audience/list/ | Get all audiences [Dmp Custom_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940506015746)
[**dmpCustomAudienceLookalikeCreate**](AudienceApi.md#dmpCustomAudienceLookalikeCreate) | **POST** /open_api/v1.3/dmp/custom_audience/lookalike/create/ | Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940511844353)
[**dmpCustomAudienceLookalikeUpdate**](AudienceApi.md#dmpCustomAudienceLookalikeUpdate) | **POST** /open_api/v1.3/dmp/custom_audience/lookalike/update/ | Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758616888158209)
[**dmpCustomAudienceRuleCreate**](AudienceApi.md#dmpCustomAudienceRuleCreate) | **POST** /open_api/v1.3/dmp/custom_audience/rule/create/ | Create an audience by rules [Dmp Custom_audience Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940509849601)
[**dmpCustomAudienceShare**](AudienceApi.md#dmpCustomAudienceShare) | **POST** /open_api/v1.3/dmp/custom_audience/share/ | Share custom audiences with other advertisers [Dmp Custom_audience Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245803888706)
[**dmpCustomAudienceShareCancel**](AudienceApi.md#dmpCustomAudienceShareCancel) | **POST** /open_api/v1.3/dmp/custom_audience/share/cancel/ | Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245829978113)
[**dmpCustomAudienceShareLog**](AudienceApi.md#dmpCustomAudienceShareLog) | **GET** /open_api/v1.3/dmp/custom_audience/share/log/ | Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)
[**dmpCustomAudienceUpdate**](AudienceApi.md#dmpCustomAudienceUpdate) | **POST** /open_api/v1.3/dmp/custom_audience/update/ | Update the details of an audience [Dmp Custom_audience Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940572667906)
[**dmpSavedAudienceCreate**](AudienceApi.md#dmpSavedAudienceCreate) | **POST** /open_api/v1.3/dmp/saved_audience/create/ | Create a Saved Audience [Dmp Saved_audience Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154541898754)
[**dmpSavedAudienceDelete**](AudienceApi.md#dmpSavedAudienceDelete) | **POST** /open_api/v1.3/dmp/saved_audience/delete/ | Delete Saved Audiences [Dmp Saved_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154666312706)
[**dmpSavedAudienceList**](AudienceApi.md#dmpSavedAudienceList) | **GET** /open_api/v1.3/dmp/saved_audience/list/ | Get the details of Saved Audiences [Dmp Saved_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154619404290)

<a name="dmpCustomAudienceApply"></a>
# **dmpCustomAudienceApply**
> InlineResponse200 dmpCustomAudienceApply(Access_Token, opts)

Apply a shared custom audience [Dmp Custom_audience Apply](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CustomAudienceApplyBody() // CustomAudienceApplyBody | 
};
apiInstance.dmpCustomAudienceApply(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CustomAudienceApplyBody**](CustomAudienceApplyBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceApplyLog"></a>
# **dmpCustomAudienceApplyLog**
> InlineResponse200 dmpCustomAudienceApplyLog(advertiser_id, custom_audience_ids, Access_Token, opts)

Get the latest application log of custom audiences [Dmp Custom_audience Apply Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758615737388033)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let custom_audience_ids = ["custom_audience_ids_example"]; // [String] | A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'page': 1, // Number | Current page number. Default value: 1.
  'page_size': 10, // Number | Page size. Default value: 10.
  'timezone': "timezone_example", // String | The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used.
  'context_info': null // Object | 
};
apiInstance.dmpCustomAudienceApplyLog(advertiser_id, custom_audience_ids, Access_Token, opts, (error, data, response) => {
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
 **custom_audience_ids** | [**[String]**](String.md)| A list of custom audience IDs. Note The advertiser must be the owner of the custom_audience_ids. Otherwise, an error will occur. You can use the is_creator field returned in /dmp/custom_audience/list/ and /dmp/custom_audience/get/ to check whether this advertiser is the owner of this audience. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **page** | **Number**| Current page number. Default value: 1. | [optional] [default to 1]
 **page_size** | **Number**| Page size. Default value: 10. | [optional] [default to 10]
 **timezone** | **String**| The timezone of returned value. For enum values, see Appendix - Time Zone. If not specified, UTC will be used. | [optional] 
 **context_info** | [**Object**](Object.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceCreate"></a>
# **dmpCustomAudienceCreate**
> InlineResponse200 dmpCustomAudienceCreate(Access_Token, opts)

Create an audience by file [Dmp Custom_audience Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940570793985)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CustomAudienceCreateBody() // CustomAudienceCreateBody | 
};
apiInstance.dmpCustomAudienceCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CustomAudienceCreateBody**](CustomAudienceCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceDelete"></a>
# **dmpCustomAudienceDelete**
> InlineResponse200 dmpCustomAudienceDelete(Access_Token, opts)

Delete audiences [Dmp Custom_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940539757569)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CustomAudienceDeleteBody() // CustomAudienceDeleteBody | 
};
apiInstance.dmpCustomAudienceDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CustomAudienceDeleteBody**](CustomAudienceDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceFileUpload"></a>
# **dmpCustomAudienceFileUpload**
> InlineResponse200 dmpCustomAudienceFileUpload(Access_Token, opts)

Upload a data file [Dmp Custom_audience File Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940567842818)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'advertiser_id': "advertiser_id_example", // String | 
  'calculate_type': "calculate_type_example", // String | 
  'context_info': new js_sdk.DmpcustomAudiencefileuploadContextInfo(), // DmpcustomAudiencefileuploadContextInfo | 
  'file': "file_example", // Blob | 
  'file_name': "file_name_example", // String | 
  'file_signature': "file_signature_example" // String | 
};
apiInstance.dmpCustomAudienceFileUpload(Access_Token, opts, (error, data, response) => {
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
 **advertiser_id** | **String**|  | [optional] 
 **calculate_type** | **String**|  | [optional] 
 **context_info** | [**DmpcustomAudiencefileuploadContextInfo**](DmpcustomAudiencefileuploadContextInfo.md)|  | [optional] 
 **file** | **Blob**|  | [optional] 
 **file_name** | **String**|  | [optional] 
 **file_signature** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="dmpCustomAudienceGet"></a>
# **dmpCustomAudienceGet**
> InlineResponse200 dmpCustomAudienceGet(advertiser_id, custom_audience_ids, Access_Token, opts)

Obtain the details of specified audiences [Dmp Custom_audience Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940507792385)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let custom_audience_ids = ["custom_audience_ids_example"]; // [String] | A list of Audience IDs. Length range is [1, 100] .
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'history_size': 56 // Number | The size of the history data which the user requests.
};
apiInstance.dmpCustomAudienceGet(advertiser_id, custom_audience_ids, Access_Token, opts, (error, data, response) => {
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
 **custom_audience_ids** | [**[String]**](String.md)| A list of Audience IDs. Length range is [1, 100] . |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **history_size** | **Number**| The size of the history data which the user requests. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceList"></a>
# **dmpCustomAudienceList**
> InlineResponse200 dmpCustomAudienceList(advertiser_id, Access_Token, opts)

Get all audiences [Dmp Custom_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940506015746)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'custom_audience_ids': ["custom_audience_ids_example"], // [String] | A list of Audience IDs. Length range is [1, 100].
  'page': 1, // Number | Current page number. Default value: 1. Value range: ≥ 1.
  'page_size': 10 // Number | Page size. Defaults is 10. Value range: 1-100.
};
apiInstance.dmpCustomAudienceList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **custom_audience_ids** | [**[String]**](String.md)| A list of Audience IDs. Length range is [1, 100]. | [optional] 
 **page** | **Number**| Current page number. Default value: 1. Value range: ≥ 1. | [optional] [default to 1]
 **page_size** | **Number**| Page size. Defaults is 10. Value range: 1-100. | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceLookalikeCreate"></a>
# **dmpCustomAudienceLookalikeCreate**
> InlineResponse200 dmpCustomAudienceLookalikeCreate(Access_Token, opts)

Create a lookalike audience [Dmp Custom_audience Lookalike Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940511844353)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.LookalikeCreateBody() // LookalikeCreateBody | 
};
apiInstance.dmpCustomAudienceLookalikeCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**LookalikeCreateBody**](LookalikeCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceLookalikeUpdate"></a>
# **dmpCustomAudienceLookalikeUpdate**
> InlineResponse200 dmpCustomAudienceLookalikeUpdate(Access_Token, opts)

Manually refresh a Lookalike Audience [Dmp Custom_audience Lookalike Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1758616888158209)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.LookalikeUpdateBody() // LookalikeUpdateBody | 
};
apiInstance.dmpCustomAudienceLookalikeUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**LookalikeUpdateBody**](LookalikeUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceRuleCreate"></a>
# **dmpCustomAudienceRuleCreate**
> InlineResponse200 dmpCustomAudienceRuleCreate(Access_Token, opts)

Create an audience by rules [Dmp Custom_audience Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940509849601)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.RuleCreateBody() // RuleCreateBody | 
};
apiInstance.dmpCustomAudienceRuleCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**RuleCreateBody**](RuleCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceShare"></a>
# **dmpCustomAudienceShare**
> InlineResponse200 dmpCustomAudienceShare(Access_Token, opts)

Share custom audiences with other advertisers [Dmp Custom_audience Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245803888706)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CustomAudienceShareBody() // CustomAudienceShareBody | 
};
apiInstance.dmpCustomAudienceShare(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CustomAudienceShareBody**](CustomAudienceShareBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceShareCancel"></a>
# **dmpCustomAudienceShareCancel**
> InlineResponse200 dmpCustomAudienceShareCancel(Access_Token, opts)

Stop sharing custom audiences with other advertisers [Dmp Custom_audience Share Cancel](https://business-api.tiktok.com/portal/docs?id&#x3D;1740245829978113)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ShareCancelBody() // ShareCancelBody | 
};
apiInstance.dmpCustomAudienceShareCancel(Access_Token, opts, (error, data, response) => {
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
 **body** | [**ShareCancelBody**](ShareCancelBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpCustomAudienceShareLog"></a>
# **dmpCustomAudienceShareLog**
> InlineResponse200 dmpCustomAudienceShareLog(advertiser_id, custom_audience_id, Access_Token, opts)

Get the sharing log of a custom audience [Dmp Custom_audience Share Log](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740245827044354)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let custom_audience_id = "custom_audience_id_example"; // String | Custom audiences that you want to get sharing log for.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'context_info': null // Object | 
};
apiInstance.dmpCustomAudienceShareLog(advertiser_id, custom_audience_id, Access_Token, opts, (error, data, response) => {
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
 **custom_audience_id** | **String**| Custom audiences that you want to get sharing log for. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **context_info** | [**Object**](Object.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dmpCustomAudienceUpdate"></a>
# **dmpCustomAudienceUpdate**
> InlineResponse200 dmpCustomAudienceUpdate(Access_Token, opts)

Update the details of an audience [Dmp Custom_audience Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739940572667906)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CustomAudienceUpdateBody() // CustomAudienceUpdateBody | 
};
apiInstance.dmpCustomAudienceUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CustomAudienceUpdateBody**](CustomAudienceUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpSavedAudienceCreate"></a>
# **dmpSavedAudienceCreate**
> InlineResponse200 dmpSavedAudienceCreate(Access_Token, opts)

Create a Saved Audience [Dmp Saved_audience Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154541898754)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SavedAudienceCreateBody() // SavedAudienceCreateBody | 
};
apiInstance.dmpSavedAudienceCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SavedAudienceCreateBody**](SavedAudienceCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpSavedAudienceDelete"></a>
# **dmpSavedAudienceDelete**
> InlineResponse200 dmpSavedAudienceDelete(Access_Token, opts)

Delete Saved Audiences [Dmp Saved_audience Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154666312706)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SavedAudienceDeleteBody() // SavedAudienceDeleteBody | 
};
apiInstance.dmpSavedAudienceDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SavedAudienceDeleteBody**](SavedAudienceDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dmpSavedAudienceList"></a>
# **dmpSavedAudienceList**
> InlineResponse200 dmpSavedAudienceList(advertiser_id, Access_Token, opts)

Get the details of Saved Audiences [Dmp Saved_audience List](https://business-api.tiktok.com/portal/docs?id&#x3D;1780154619404290)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'saved_audience_ids': ["saved_audience_ids_example"], // [String] | IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/.
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.dmpSavedAudienceList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **saved_audience_ids** | [**[String]**](String.md)| IDs of Saved Audiences. Max size: 100. To create Saved Audiences and obtain the Saved Audience IDs, use /dmp/saved_audience/create/. | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

