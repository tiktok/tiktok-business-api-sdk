# js_sdk.AuthenticationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth2AccessToken**](AuthenticationApi.md#oauth2AccessToken) | **POST** /open_api/v1.3/oauth2/access_token/ | Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739965703387137)
[**oauth2AdvertiserGet**](AuthenticationApi.md#oauth2AdvertiserGet) | **GET** /open_api/v1.3/oauth2/advertiser/get/ | Get a list of advertisers that have granted you permission to manage their accounts. [Authentication Oauth2 Advertiser Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738455508553729)

<a name="oauth2AccessToken"></a>
# **oauth2AccessToken**
> InlineResponse200 oauth2AccessToken(opts)

Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739965703387137)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AuthenticationApi();
let opts = { 
  'body': new js_sdk.Oauth2AccessTokenBody() // Oauth2AccessTokenBody | Oauth2 Access token Body parameters
};
apiInstance.oauth2AccessToken(opts, (error, data, response) => {
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
 **body** | [**Oauth2AccessTokenBody**](Oauth2AccessTokenBody.md)| Oauth2 Access token Body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauth2AdvertiserGet"></a>
# **oauth2AdvertiserGet**
> InlineResponse200 oauth2AdvertiserGet(app_id, secret, Access_Token)

Get a list of advertisers that have granted you permission to manage their accounts. [Authentication Oauth2 Advertiser Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738455508553729)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AuthenticationApi();
let app_id = "app_id_example"; // String | 
let secret = "secret_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.oauth2AdvertiserGet(app_id, secret, Access_Token, (error, data, response) => {
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
 **app_id** | **String**|  |[required]  
 **secret** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

