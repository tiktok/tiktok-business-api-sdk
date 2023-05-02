# js_sdk.IdentityApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identityCreate**](IdentityApi.md#identityCreate) | **POST** /open_api/v1.3/identity/create/ | Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740654203526146)
[**identityGet**](IdentityApi.md#identityGet) | **GET** /open_api/v1.3/identity/get/ | Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740218420781057)
[**identityVideoInfo**](IdentityApi.md#identityVideoInfo) | **GET** /open_api/v1.3/identity/video/info/ | Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)

<a name="identityCreate"></a>
# **identityCreate**
> InlineResponse200 identityCreate(Access_Token, opts)

Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740654203526146)

https://ads.tiktok.com/marketing_api/search?s&#x3D;identity%2Fcreate%2F&amp;type&#x3D;0&amp;version&#x3D;1.3

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.IdentityApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.IdentityCreateBody() // IdentityCreateBody | Identity create body parameters.
};
apiInstance.identityCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**IdentityCreateBody**](IdentityCreateBody.md)| Identity create body parameters. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="identityGet"></a>
# **identityGet**
> InlineResponse200 identityGet(advertiser_id, Access_Token, opts)

Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740218420781057)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.IdentityApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'identity_type': "identity_type_example", // String | Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details.
  'identity_authorized_bc_id': "identity_authorized_bc_id_example", // String | Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT.
  'page': 56, // Number | Page number.
  'page_size': 56 // Number | Number of results on each page.
};
apiInstance.identityGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **identity_type** | **String**| Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details. | [optional] 
 **identity_authorized_bc_id** | **String**| Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT. | [optional] 
 **page** | **Number**| Page number. | [optional] 
 **page_size** | **Number**| Number of results on each page. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identityVideoInfo"></a>
# **identityVideoInfo**
> InlineResponse200 identityVideoInfo(Access_Token, advertiser_id, identity_type, identity_id, item_id, opts)

Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)

https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.IdentityApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let identity_type = "identity_type_example"; // String | Identity type. Enum: `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`. See [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097) for details.
let identity_id = "identity_id_example"; // String | Identity ID
let item_id = "item_id_example"; // String | TikTok post ID
let opts = { 
  'identity_authorized_bc_id': "identity_authorized_bc_id_example" // String | The identity ID of a TikTok account that a Business Center is authorized to access. Required when` identity_type` is `BC_AUTH_TT`. 
};
apiInstance.identityVideoInfo(Access_Token, advertiser_id, identity_type, identity_id, item_id, opts, (error, data, response) => {
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
 **advertiser_id** | **String**| Advertiser ID |[required]  
 **identity_type** | **String**| Identity type. Enum: &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;, &#x60;BC_AUTH_TT&#x60;. See [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097) for details. |[required]  
 **identity_id** | **String**| Identity ID |[required]  
 **item_id** | **String**| TikTok post ID |[required]  
 **identity_authorized_bc_id** | **String**| The identity ID of a TikTok account that a Business Center is authorized to access. Required when&#x60; identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;.  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

