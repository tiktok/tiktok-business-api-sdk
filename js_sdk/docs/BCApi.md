# js_sdk.BCApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bcAdvertiserCreate**](BCApi.md#bcAdvertiserCreate) | **POST** /open_api/v1.3/bc/advertiser/create/ | Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
[**bcAssetGet**](BCApi.md#bcAssetGet) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)
[**bcGet**](BCApi.md#bcGet) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)
[**bcImageUpload**](BCApi.md#bcImageUpload) | **POST** /open_api/v1.3/bc/image/upload/ | Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)

<a name="bcAdvertiserCreate"></a>
# **bcAdvertiserCreate**
> InlineResponse200 bcAdvertiserCreate(Access_Token, opts)

Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BCApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdvertiserCreateBody() // AdvertiserCreateBody | BC advertiser create body parameters
};
apiInstance.bcAdvertiserCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdvertiserCreateBody**](AdvertiserCreateBody.md)| BC advertiser create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bcAssetGet"></a>
# **bcAssetGet**
> InlineResponse200 bcAssetGet(bc_id, asset_type, Access_Token, opts)

Get assets [BC asset get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739432717798401)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BCApi();
let bc_id = "bc_id_example"; // String | Business Center ID
let asset_type = "asset_type_example"; // String | Type of asset that you want to get. Enum values: `CATALOG`, `ADVERTISER`, `PIXEL`, `LEAD`, `TT_ACCOUNT`(corresponds to `BC_AUTH_TT`, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097), `TIKTOK_SHOP` (TikTok shop) , `STOREFRONT`( TikTok Storefront (third-party store))
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.Filtering(), // Filtering | Filtering conditions. Use either `user_id` or `user_email` as filter.Note: You cannot use `user_id` and `user_email` at the same time.If you do not specify any filter values, the system will pass in to the `user_id` field the user ID of the TikTok for Business account that gives you the authentication code (`auth_code`)
  'page': 56, // Number | Current page number. Default value: 1
  'page_size': 56 // Number | Page size, in the range of 1-50. Default value: 10
};
apiInstance.bcAssetGet(bc_id, asset_type, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**| Business Center ID |[required]  
 **asset_type** | **String**| Type of asset that you want to get. Enum values: &#x60;CATALOG&#x60;, &#x60;ADVERTISER&#x60;, &#x60;PIXEL&#x60;, &#x60;LEAD&#x60;, &#x60;TT_ACCOUNT&#x60;(corresponds to &#x60;BC_AUTH_TT&#x60;, and learn more from [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097), &#x60;TIKTOK_SHOP&#x60; (TikTok shop) , &#x60;STOREFRONT&#x60;( TikTok Storefront (third-party store)) |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**Filtering**](Filtering.md)| Filtering conditions. Use either &#x60;user_id&#x60; or &#x60;user_email&#x60; as filter.Note: You cannot use &#x60;user_id&#x60; and &#x60;user_email&#x60; at the same time.If you do not specify any filter values, the system will pass in to the &#x60;user_id&#x60; field the user ID of the TikTok for Business account that gives you the authentication code (&#x60;auth_code&#x60;) | [optional] 
 **page** | **Number**| Current page number. Default value: 1 | [optional] 
 **page_size** | **Number**| Page size, in the range of 1-50. Default value: 10 | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcGet"></a>
# **bcGet**
> InlineResponse200 bcGet(Access_Token, opts)

Get Business Centers [BC get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737115687501826)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BCApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'bc_id': "bc_id_example", // String | The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in
  'page': 56, // Number | Current number of pages. Default value: 1. Value range : ≥ 1
  'page_size': 56 // Number | Page size. Default value: 10. Value range: 1-50
};
apiInstance.bcGet(Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**| The Business Center ID. When not passed, returns the user entire list of Business Centers by default, and returns the specified Business Center account when passed in | [optional] 
 **page** | **Number**| Current number of pages. Default value: 1. Value range : ≥ 1 | [optional] 
 **page_size** | **Number**| Page size. Default value: 10. Value range: 1-50 | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcImageUpload"></a>
# **bcImageUpload**
> InlineResponse200 bcImageUpload(Access_Token, opts)

Upload a business certificate [BC image upload](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739938996913218)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BCApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'bc_id': "bc_id_example", // String | 
  'image_file': "image_file_example" // Blob | 
};
apiInstance.bcImageUpload(Access_Token, opts, (error, data, response) => {
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
**bc_id** | **String** | Business Center ID | [required] 
**image_file** | **Blob** | The certificate image file to be uploaded. Supported picture format: JPG/JPEG/PNG. The maximum file size is 10 MB | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json
