# js_sdk.VideoApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gmvMaxVideoGet**](VideoApi.md#gmvMaxVideoGet) | **GET** /open_api/v1.3/gmv_max/video/get/ | Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)

<a name="gmvMaxVideoGet"></a>
# **gmvMaxVideoGet**
> InlineResponse200 gmvMaxVideoGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token, opts)

Get GMV Max video info [Smart Plus GMV Max Video Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001168512129)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.VideoApi();
let advertiser_id = "advertiser_id_example"; // String | 
let store_id = "store_id_example"; // String | 
let store_authorized_bc_id = "store_authorized_bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'spu_id_list': ["spu_id_list_example"], // [String] | 
  'identity_list': [new js_sdk.IdentityList()], // [IdentityList] | 
  'need_auth_code_video': true, // Boolean | 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'custom_posts_eligible': true, // Boolean | 
  'sort_field': "sort_field_example", // String | 
  'sort_type': "DESC", // String | 
  'keyword': "keyword_example" // String | 
};
apiInstance.gmvMaxVideoGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token, opts, (error, data, response) => {
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
 **store_id** | **String**|  |[required]  
 **store_authorized_bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **spu_id_list** | [**[String]**](String.md)|  | [optional] 
 **identity_list** | [**[IdentityList]**](IdentityList.md)|  | [optional] 
 **need_auth_code_video** | **Boolean**|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]
 **custom_posts_eligible** | **Boolean**|  | [optional] 
 **sort_field** | **String**|  | [optional] 
 **sort_type** | **String**|  | [optional] [default to DESC]
 **keyword** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

