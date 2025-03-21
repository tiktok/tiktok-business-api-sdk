# js_sdk.AccountManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserInfo**](AccountManagementApi.md#advertiserInfo) | **GET** /open_api/v1.3/advertiser/info/ | Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1739593083610113)
[**advertiserUpdate**](AccountManagementApi.md#advertiserUpdate) | **POST** /open_api/v1.3/advertiser/update/ | Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939050770434)
[**pangleAudiencePackageGet**](AccountManagementApi.md#pangleAudiencePackageGet) | **GET** /open_api/v1.3/pangle_audience_package/get/ | Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040177229826)
[**pangleBlockListGet**](AccountManagementApi.md#pangleBlockListGet) | **GET** /open_api/v1.3/pangle_block_list/get/ | Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740039957181441)
[**pangleBlockListUpdate**](AccountManagementApi.md#pangleBlockListUpdate) | **POST** /open_api/v1.3/pangle_block_list/update/ | Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040139110466)
[**termCheck**](AccountManagementApi.md#termCheck) | **GET** /open_api/v1.3/term/check/ | Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192304571394)
[**termConfirm**](AccountManagementApi.md#termConfirm) | **POST** /open_api/v1.3/term/confirm/ | Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192284435457)
[**termGet**](AccountManagementApi.md#termGet) | **GET** /open_api/v1.3/term/get/ | Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737191909315585)

<a name="advertiserInfo"></a>
# **advertiserInfo**
> InlineResponse200 advertiserInfo(advertiser_ids, Access_Token, opts)

Get ad account details. [Advertiser Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1739593083610113)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let advertiser_ids = ["advertiser_ids_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'fields': ["fields_example"] // [String] | 
};
apiInstance.advertiserInfo(advertiser_ids, Access_Token, opts, (error, data, response) => {
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
 **advertiser_ids** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **fields** | [**[String]**](String.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiserUpdate"></a>
# **advertiserUpdate**
> InlineResponse200 advertiserUpdate(Access_Token, opts)

Update an ad account. [Advertiser Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939050770434)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdvertiserUpdateBody() // AdvertiserUpdateBody | 
};
apiInstance.advertiserUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdvertiserUpdateBody**](AdvertiserUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pangleAudiencePackageGet"></a>
# **pangleAudiencePackageGet**
> InlineResponse200 pangleAudiencePackageGet(advertiser_id, Access_Token)

Get the Pangle audience packages. [Pangle Audience Package Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040177229826)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.pangleAudiencePackageGet(advertiser_id, Access_Token, (error, data, response) => {
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

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pangleBlockListGet"></a>
# **pangleBlockListGet**
> InlineResponse200 pangleBlockListGet(advertiser_id, Access_Token)

Get the Pangle block list. [Pangle Block List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740039957181441)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.pangleBlockListGet(advertiser_id, Access_Token, (error, data, response) => {
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

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pangleBlockListUpdate"></a>
# **pangleBlockListUpdate**
> InlineResponse200 pangleBlockListUpdate(Access_Token, opts)

Update the Pangle block list. [Pangle Block List Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740040139110466)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PangleBlockListUpdateBody() // PangleBlockListUpdateBody | 
};
apiInstance.pangleBlockListUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PangleBlockListUpdateBody**](PangleBlockListUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="termCheck"></a>
# **termCheck**
> InlineResponse200 termCheck(advertiser_id, term_type, Access_Token)

Check the status of Terms. [Term Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192304571394)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let term_type = "term_type_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.termCheck(advertiser_id, term_type, Access_Token, (error, data, response) => {
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
 **term_type** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="termConfirm"></a>
# **termConfirm**
> InlineResponse200 termConfirm(Access_Token, opts)

Sign Terms. [Term Confirm](https://business-api.tiktok.com/portal/docs?id&#x3D;1737192284435457)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.TermConfirmBody() // TermConfirmBody | 
};
apiInstance.termConfirm(Access_Token, opts, (error, data, response) => {
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
 **body** | [**TermConfirmBody**](TermConfirmBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="termGet"></a>
# **termGet**
> InlineResponse200 termGet(advertiser_id, term_type, Access_Token, opts)

Get Terms. [Term Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737191909315585)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let term_type = "term_type_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'lang': "EN" // String | 
};
apiInstance.termGet(advertiser_id, term_type, Access_Token, opts, (error, data, response) => {
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
 **term_type** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **lang** | **String**|  | [optional] [default to EN]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

