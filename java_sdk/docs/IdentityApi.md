# IdentityApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identityCreate**](IdentityApi.md#identityCreate) | **POST** /open_api/v1.3/identity/create/ | Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740654203526146)
[**identityGet**](IdentityApi.md#identityGet) | **GET** /open_api/v1.3/identity/get/ | Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740218420781057)
[**identityVideoInfo**](IdentityApi.md#identityVideoInfo) | **GET** /open_api/v1.3/identity/video/info/ | Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)

<a name="identityCreate"></a>
# **identityCreate**
> Response identityCreate(accessToken, body)

Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740654203526146)

https://ads.tiktok.com/marketing_api/search?s&#x3D;identity%2Fcreate%2F&amp;type&#x3D;0&amp;version&#x3D;1.3

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
IdentityCreateBody body = new IdentityCreateBody(); // IdentityCreateBody | Identity create body parameters.
try {
    Response result = apiInstance.identityCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identityCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**IdentityCreateBody**](IdentityCreateBody.md)| Identity create body parameters. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="identityGet"></a>
# **identityGet**
> Response identityGet(advertiserId, accessToken, identityType, identityAuthorizedBcId, page, pageSize)

Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740218420781057)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String identityType = "identityType_example"; // String | Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details.
String identityAuthorizedBcId = "identityAuthorizedBcId_example"; // String | Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT.
Integer page = 56; // Integer | Page number.
Integer pageSize = 56; // Integer | Number of results on each page.
try {
    Response result = apiInstance.identityGet(advertiserId, accessToken, identityType, identityAuthorizedBcId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **identityType** | **String**| Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details. | [optional]
 **identityAuthorizedBcId** | **String**| Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT. | [optional]
 **page** | **Integer**| Page number. | [optional]
 **pageSize** | **Integer**| Number of results on each page. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identityVideoInfo"></a>
# **identityVideoInfo**
> Response identityVideoInfo(accessToken, advertiserId, identityType, identityId, itemId, identityAuthorizedBcId)

Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)

https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String identityType = "identityType_example"; // String | Identity type. Enum: `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`. See [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097) for details.
String identityId = "identityId_example"; // String | Identity ID
String itemId = "itemId_example"; // String | TikTok post ID
String identityAuthorizedBcId = "identityAuthorizedBcId_example"; // String | The identity ID of a TikTok account that a Business Center is authorized to access. Required when` identity_type` is `BC_AUTH_TT`. 
try {
    Response result = apiInstance.identityVideoInfo(accessToken, advertiserId, identityType, identityId, itemId, identityAuthorizedBcId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#identityVideoInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **advertiserId** | **String**| Advertiser ID |[required] 
 **identityType** | **String**| Identity type. Enum: &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;, &#x60;BC_AUTH_TT&#x60;. See [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097) for details. |[required] 
 **identityId** | **String**| Identity ID |[required] 
 **itemId** | **String**| TikTok post ID |[required] 
 **identityAuthorizedBcId** | **String**| The identity ID of a TikTok account that a Business Center is authorized to access. Required when&#x60; identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;.  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

