# js_sdk.AdApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adCreate**](AdApi.md#adCreate) | **POST** /open_api/v1.3/ad/create/ | Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953377508354)
[**adGet**](AdApi.md#adGet) | **GET** /open_api/v1.3/ad/get/ | Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1735735588640770)
[**adStatusUpdate**](AdApi.md#adStatusUpdate) | **POST** /open_api/v1.3/ad/status/update/ | To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)
[**adUpdate**](AdApi.md#adUpdate) | **POST** /open_api/v1.3/ad/update/ | Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

<a name="adCreate"></a>
# **adCreate**
> InlineResponse200 adCreate(Access_Token, opts)

Upload your ad creatives (pictures, videos, texts, call-to-action) and create an ad. For different placements, the creative formats and requirements are different. Upload your ad creatives according to the placement requirements. Each ad group can have up to 20 ads. See here to learn about how to create ads. [Ad create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953377508354)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdCreateBody() // AdCreateBody | Ad create body parameters
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
 **body** | [**AdCreateBody**](AdCreateBody.md)| Ad create body parameters | [optional] 

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

Get the data of regular ads and ACO ads. [Ad get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1735735588640770)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringAdGet(), // FilteringAdGet | Filters on the data. This parameter is an array of filter objects.
  'page': 56, // Number | Current page number
  'page_size': 56, // Number | Page size
  'fields': ["fields_example"] // [String] | Fields that you want to get. For the list of fields that you can specify, see the fields under `list` in the response. If not set, all fields are returned by default.
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
 **advertiser_id** | **String**| Advertiser ID |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringAdGet**](FilteringAdGet.md)| Filters on the data. This parameter is an array of filter objects. | [optional] 
 **page** | **Number**| Current page number | [optional] 
 **page_size** | **Number**| Page size | [optional] 
 **fields** | [**[String]**](String.md)| Fields that you want to get. For the list of fields that you can specify, see the fields under &#x60;list&#x60; in the response. If not set, all fields are returned by default. | [optional] 

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

To enable, disable or delete an ad or ads [Ad status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdStatusUpdateBody() // AdStatusUpdateBody | Ad status update body parameters
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
 **body** | [**AdStatusUpdateBody**](AdStatusUpdateBody.md)| Ad status update body parameters | [optional] 

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

Modify your custom ad creatives such as call-to-action, ad name, text image and video material. To update ACO ads, use the /ad/aco/update/ endpoint. [Ad update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739953422970882)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdUpdateBody() // AdUpdateBody | Ad create body parameters
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
 **body** | [**AdUpdateBody**](AdUpdateBody.md)| Ad create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

