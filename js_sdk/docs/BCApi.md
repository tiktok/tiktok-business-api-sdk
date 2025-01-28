# js_sdk.BCApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bcAdvertiserCreate**](BCApi.md#bcAdvertiserCreate) | **POST** /open_api/v1.3/bc/advertiser/create/ | Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
[**bcAssetGet**](BCApi.md#bcAssetGet) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)
[**bcGet**](BCApi.md#bcGet) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)
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

Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BCApi();
let bc_id = "bc_id_example"; // String | 
let asset_type = "asset_type_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'child_bc_id': "child_bc_id_example", // String | 
  'filtering': null, // Object | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
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
 **bc_id** | **String**|  |[required]  
 **asset_type** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **child_bc_id** | **String**|  | [optional] 
 **filtering** | [**Object**](Object.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

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

Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BCApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'bc_id': "bc_id_example", // String | 
  'scene': "SINGLE_ACCOUNT", // String | 
  'filtering': null, // Object | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
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
 **bc_id** | **String**|  | [optional] 
 **scene** | **String**|  | [optional] [default to SINGLE_ACCOUNT]
 **filtering** | [**Object**](Object.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

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
 **bc_id** | **String**|  | [optional] 
 **image_file** | **Blob**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

