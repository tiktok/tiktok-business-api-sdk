# js_sdk.StoreApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gmvMaxExclusiveAuthorizationCreate**](StoreApi.md#gmvMaxExclusiveAuthorizationCreate) | **POST** /open_api/v1.3/gmv_max/exclusive_authorization/create/ | Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001200356354)
[**gmvMaxExclusiveAuthorizationGet**](StoreApi.md#gmvMaxExclusiveAuthorizationGet) | **GET** /open_api/v1.3/gmv_max/exclusive_authorization/get/ | Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001184635905)
[**gmvMaxStoreList**](StoreApi.md#gmvMaxStoreList) | **GET** /open_api/v1.3/gmv_max/store/list/ | Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001044479041)
[**gmvMaxStoreShopAdUsageCheck**](StoreApi.md#gmvMaxStoreShopAdUsageCheck) | **GET** /open_api/v1.3/gmv_max/store/shop_ad_usage_check/ | Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001084174338)

<a name="gmvMaxExclusiveAuthorizationCreate"></a>
# **gmvMaxExclusiveAuthorizationCreate**
> InlineResponse200 gmvMaxExclusiveAuthorizationCreate(Access_Token, opts)

Create GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001200356354)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.StoreApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ExclusiveAuthorizationCreateBody() // ExclusiveAuthorizationCreateBody | 
};
apiInstance.gmvMaxExclusiveAuthorizationCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**ExclusiveAuthorizationCreateBody**](ExclusiveAuthorizationCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gmvMaxExclusiveAuthorizationGet"></a>
# **gmvMaxExclusiveAuthorizationGet**
> InlineResponse200 gmvMaxExclusiveAuthorizationGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token)

Get GMV Max exclusive authorization [Smart Plus GMV Max Exclusive Authorization Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001184635905)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.StoreApi();
let advertiser_id = "advertiser_id_example"; // String | 
let store_id = "store_id_example"; // String | 
let store_authorized_bc_id = "store_authorized_bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.gmvMaxExclusiveAuthorizationGet(advertiser_id, store_id, store_authorized_bc_id, Access_Token, (error, data, response) => {
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

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxStoreList"></a>
# **gmvMaxStoreList**
> InlineResponse200 gmvMaxStoreList(advertiser_id, Access_Token)

Get GMV Max store list [Smart Plus GMV Max Store List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001044479041)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.StoreApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.gmvMaxStoreList(advertiser_id, Access_Token, (error, data, response) => {
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
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxStoreShopAdUsageCheck"></a>
# **gmvMaxStoreShopAdUsageCheck**
> InlineResponse200 gmvMaxStoreShopAdUsageCheck(advertiser_id, store_id, Access_Token)

Check GMV Max shop ad usage [Smart Plus GMV Max Shop Ad Usage Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001084174338)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.StoreApi();
let advertiser_id = "advertiser_id_example"; // String | 
let store_id = "store_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.gmvMaxStoreShopAdUsageCheck(advertiser_id, store_id, Access_Token, (error, data, response) => {
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
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

