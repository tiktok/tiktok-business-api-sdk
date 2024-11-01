# js_sdk.AdgroupApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adgroupCreate**](AdgroupApi.md#adgroupCreate) | **POST** /open_api/v1.3/adgroup/create/ | Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739499616346114)
[**adgroupGet**](AdgroupApi.md#adgroupGet) | **GET** /open_api/v1.3/adgroup/get/ | Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739314558673922)
[**adgroupQuota**](AdgroupApi.md#adgroupQuota) | **GET** /open_api/v1.3/adgroup/quota/ | Get the dynamic quota [Adgroup Quota](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1768463039162369)
[**adgroupStatusUpdate**](AdgroupApi.md#adgroupStatusUpdate) | **POST** /open_api/v1.3/adgroup/status/update/ | Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739591716326402)
[**adgroupUpdate**](AdgroupApi.md#adgroupUpdate) | **POST** /open_api/v1.3/adgroup/update/ | Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739586761631745)

<a name="adgroupCreate"></a>
# **adgroupCreate**
> InlineResponse200 adgroupCreate(Access_Token, opts)

Create an ad group. At the ad group level, you can configure placement, audience settings (see Ad Targeting), budget, schedules, as well as bidding and optimization options for ads. To learn about the procedure and the essential data fields to create an ad group, see Create an Ad Group. [Ad Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739499616346114)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdgroupCreateBody() // AdgroupCreateBody | Adgroup create body parameters
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
 **body** | [**AdgroupCreateBody**](AdgroupCreateBody.md)| Adgroup create body parameters | [optional] 

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

Obtain detailed information of an ad group or ad groups. [Adgroup get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739314558673922)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringAdgroupGet(), // FilteringAdgroupGet | Filter conditions. Set these conditions according to your requirements. If not set, all ad groups under the advertiser will be returned. The request can be filtered by
  'page': 56, // Number | Current page number. Default value is `1`
  'page_size': 56, // Number | Page size. Default value is- `10`. Range of values- `1-1000`
  'fields': ["fields_example"] // [String] | 
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
 **advertiser_id** | **String**| Advertiser ID |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringAdgroupGet**](FilteringAdgroupGet.md)| Filter conditions. Set these conditions according to your requirements. If not set, all ad groups under the advertiser will be returned. The request can be filtered by | [optional] 
 **page** | **Number**| Current page number. Default value is &#x60;1&#x60; | [optional] 
 **page_size** | **Number**| Page size. Default value is- &#x60;10&#x60;. Range of values- &#x60;1-1000&#x60; | [optional] 
 **fields** | [**[String]**](String.md)|  | [optional] 

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

Enable, disable or delete an ad group. [Adgroup status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739591716326402)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdgroupStatusUpdateBody() // AdgroupStatusUpdateBody | Adgroup status update body parameters
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
 **body** | [**AdgroupStatusUpdateBody**](AdgroupStatusUpdateBody.md)| Adgroup status update body parameters | [optional] 

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

Obtain detailed information of an ad group or ad groups. [Adgroup update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739586761631745)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdgroupApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdgroupUpdateBody() // AdgroupUpdateBody | Adgroup update body parameters
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
 **body** | [**AdgroupUpdateBody**](AdgroupUpdateBody.md)| Adgroup update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

