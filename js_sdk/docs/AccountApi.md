# js_sdk.AccountApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserUpdate**](AccountApi.md#advertiserUpdate) | **POST** /open_api/v1.3/advertiser/update/ | Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939050770434)

<a name="advertiserUpdate"></a>
# **advertiserUpdate**
> InlineResponse200 advertiserUpdate(Access_Token, opts)

Update an ad account [Advertiser Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939050770434)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AccountApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdvertiserUpdateBody() // AdvertiserUpdateBody | Advertiser update body parameters
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
 **body** | [**AdvertiserUpdateBody**](AdvertiserUpdateBody.md)| Advertiser update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

