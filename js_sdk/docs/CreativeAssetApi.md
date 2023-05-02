# js_sdk.CreativeAssetApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creativePortfolioCreate**](CreativeAssetApi.md#creativePortfolioCreate) | **POST** /open_api/v1.3/creative/portfolio/create/ | Create a portfolio [Portfolio create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739091950439426)

<a name="creativePortfolioCreate"></a>
# **creativePortfolioCreate**
> InlineResponse200 creativePortfolioCreate(Access_Token, opts)

Create a portfolio [Portfolio create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739091950439426)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeAssetApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PortfolioCreateBody() // PortfolioCreateBody | Creative portfolio create body parameters
};
apiInstance.creativePortfolioCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PortfolioCreateBody**](PortfolioCreateBody.md)| Creative portfolio create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

