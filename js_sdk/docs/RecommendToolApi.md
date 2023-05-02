# js_sdk.RecommendToolApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toolTargetingCategoryRecommend**](RecommendToolApi.md#toolTargetingCategoryRecommend) | **POST** /open_api/v1.3/tool/targeting_category/recommend/ | Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736275204260866)

<a name="toolTargetingCategoryRecommend"></a>
# **toolTargetingCategoryRecommend**
> InlineResponse200 toolTargetingCategoryRecommend(Access_Token, opts)

Get recommended interest and action categories [Tool targeting category](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1736275204260866)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.RecommendToolApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.TargetingCategoryRecommendBody() // TargetingCategoryRecommendBody | Tool recommend body parameters
};
apiInstance.toolTargetingCategoryRecommend(Access_Token, opts, (error, data, response) => {
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
 **body** | [**TargetingCategoryRecommendBody**](TargetingCategoryRecommendBody.md)| Tool recommend body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

