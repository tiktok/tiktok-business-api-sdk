# js_sdk.EventCallbackApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pixelBatch**](EventCallbackApi.md#pixelBatch) | **POST** /open_api/v1.3/pixel/batch/ | Pixel Track server-to-server batch api
[**pixelTrack**](EventCallbackApi.md#pixelTrack) | **POST** /open_api/v1.3/pixel/track/ | Pixel Track server-to-server api

<a name="pixelBatch"></a>
# **pixelBatch**
> InlineResponse200 pixelBatch(Access_Token, opts)

Pixel Track server-to-server batch api

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.EventCallbackApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PixelBatchBody() // PixelBatchBody | Pixel batch update body parameters
};
apiInstance.pixelBatch(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PixelBatchBody**](PixelBatchBody.md)| Pixel batch update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelTrack"></a>
# **pixelTrack**
> InlineResponse200 pixelTrack(Access_Token, opts)

Pixel Track server-to-server api

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.EventCallbackApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PixelTrackBody() // PixelTrackBody | Pixel track body parameters
};
apiInstance.pixelTrack(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PixelTrackBody**](PixelTrackBody.md)| Pixel track body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

