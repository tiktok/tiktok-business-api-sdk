# AuthenticationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth2AccessToken**](AuthenticationApi.md#oauth2AccessToken) | **POST** /open_api/v1.3/oauth2/access_token/ | Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739965703387137)
[**oauth2AdvertiserGet**](AuthenticationApi.md#oauth2AdvertiserGet) | **GET** /open_api/v1.3/oauth2/advertiser/get/ | Get a list of advertisers that have granted you permission to manage their accounts. [Authentication Oauth2 Advertiser Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738455508553729)

<a name="oauth2AccessToken"></a>
# **oauth2AccessToken**
> Response oauth2AccessToken(body)

Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739965703387137)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
Oauth2AccessTokenBody body = new Oauth2AccessTokenBody(); // Oauth2AccessTokenBody | Oauth2 Access token Body parameters
try {
    Response result = apiInstance.oauth2AccessToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#oauth2AccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Oauth2AccessTokenBody**](Oauth2AccessTokenBody.md)| Oauth2 Access token Body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oauth2AdvertiserGet"></a>
# **oauth2AdvertiserGet**
> Response oauth2AdvertiserGet(appId, secret, accessToken)

Get a list of advertisers that have granted you permission to manage their accounts. [Authentication Oauth2 Advertiser Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738455508553729)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String appId = "appId_example"; // String | 
String secret = "secret_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.oauth2AdvertiserGet(appId, secret, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#oauth2AdvertiserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |[required] 
 **secret** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

