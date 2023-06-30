# js_sdk.AdAcoApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAcoCreate**](AdAcoApi.md#adAcoCreate) | **POST** /open_api/v1.3/ad/aco/create/ | Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473063234626)
[**adAcoGet**](AdAcoApi.md#adAcoGet) | **GET** /open_api/v1.3/ad/aco/get/ | Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473020978177)
[**adAcoMaterialStatusUpdate**](AdAcoApi.md#adAcoMaterialStatusUpdate) | **POST** /open_api/v1.3/ad/aco/material_status/update/ | Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739506701165570)
[**adAcoUpdate**](AdAcoApi.md#adAcoUpdate) | **POST** /open_api/v1.3/ad/aco/update/ | Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473077112833)

<a name="adAcoCreate"></a>
# **adAcoCreate**
> InlineResponse200 adAcoCreate(Access_Token, opts)

Create an ACO ad by uploading necessary ad creatives to the library. [Ad Aco Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473063234626)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdAcoApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdAcoBody() // AdAcoBody | Ad Aco update parameters.
};
apiInstance.adAcoCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdAcoBody**](AdAcoBody.md)| Ad Aco update parameters. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adAcoGet"></a>
# **adAcoGet**
> InlineResponse200 adAcoGet(advertiser_id, adgroup_ids, Access_Token, opts)

Get creative materials for an ACO ad, including call-to-actions, texts, ad names, images, or video materials. [Ad Aco Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473020978177)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdAcoApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let adgroup_ids = ["adgroup_ids_example"]; // [String] | A list of ad group IDs. Quantity- 1-100.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'exclude_field_types_in_response': ["exclude_field_types_in_response_example"] // [String] | The type of fields that you want to remove from the response.
};
apiInstance.adAcoGet(advertiser_id, adgroup_ids, Access_Token, opts, (error, data, response) => {
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
 **adgroup_ids** | [**[String]**](String.md)| A list of ad group IDs. Quantity- 1-100. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **exclude_field_types_in_response** | [**[String]**](String.md)| The type of fields that you want to remove from the response. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="adAcoMaterialStatusUpdate"></a>
# **adAcoMaterialStatusUpdate**
> InlineResponse200 adAcoMaterialStatusUpdate(Access_Token, opts)

Update the status of creative materials for an ACO ad, including ad texts, images, and video materials [Update materials](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739506701165570)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdAcoApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.MaterialStatusUpdateBody() // MaterialStatusUpdateBody | Ad Aco material status body
};
apiInstance.adAcoMaterialStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**MaterialStatusUpdateBody**](MaterialStatusUpdateBody.md)| Ad Aco material status body | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="adAcoUpdate"></a>
# **adAcoUpdate**
> InlineResponse200 adAcoUpdate(Access_Token, opts)

Modify ACO ad creatives. [Update ACO](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739473077112833)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AdAcoApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AdAcoUpdateBody() // AdAcoUpdateBody | Ad Aco update parameters
};
apiInstance.adAcoUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AdAcoUpdateBody**](AdAcoUpdateBody.md)| Ad Aco update parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

