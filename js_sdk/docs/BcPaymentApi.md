# js_sdk.BcPaymentApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserBalanceGet**](BcPaymentApi.md#advertiserBalanceGet) | **GET** /open_api/v1.3/advertiser/balance/get/ | Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939106470913)
[**advertiserTransactionGet**](BcPaymentApi.md#advertiserTransactionGet) | **GET** /open_api/v1.3/advertiser/transaction/get/ | Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939116353538)
[**bcBalanceGet**](BcPaymentApi.md#bcBalanceGet) | **GET** /open_api/v1.3/bc/balance/get/ | Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939128198145)
[**bcTransactionGet**](BcPaymentApi.md#bcTransactionGet) | **GET** /open_api/v1.3/bc/transaction/get/ | Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939140408322)
[**bcTransfer**](BcPaymentApi.md#bcTransfer) | **POST** /open_api/v1.3/bc/transfer/ | Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939095321601)

<a name="advertiserBalanceGet"></a>
# **advertiserBalanceGet**
> InlineResponse200 advertiserBalanceGet(bc_id, Access_Token, opts)

Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939106470913)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'child_bc_id': "child_bc_id_example", // String | 
  'filtering': null, // Object | 
  'page': 789, // Number | 
  'page_size': 789 // Number | 
};
apiInstance.advertiserBalanceGet(bc_id, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **child_bc_id** | **String**|  | [optional] 
 **filtering** | [**Object**](Object.md)|  | [optional] 
 **page** | **Number**|  | [optional] 
 **page_size** | **Number**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiserTransactionGet"></a>
# **advertiserTransactionGet**
> InlineResponse200 advertiserTransactionGet(bc_id, Access_Token, opts)

Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939116353538)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = 789; // Number | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': null, // Object | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.advertiserTransactionGet(bc_id, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **Number**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**Object**](Object.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcBalanceGet"></a>
# **bcBalanceGet**
> InlineResponse200 bcBalanceGet(bc_id, Access_Token, opts)

Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939128198145)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'child_bc_id': "child_bc_id_example" // String | 
};
apiInstance.bcBalanceGet(bc_id, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **child_bc_id** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcTransactionGet"></a>
# **bcTransactionGet**
> InlineResponse200 bcTransactionGet(bc_id, Access_Token, opts)

Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939140408322)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': null, // Object | 
  'start_date': new Date("2013-10-20"), // Date | 
  'end_date': new Date("2013-10-20"), // Date | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.bcTransactionGet(bc_id, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**Object**](Object.md)|  | [optional] 
 **start_date** | **Date**|  | [optional] 
 **end_date** | **Date**|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcTransfer"></a>
# **bcTransfer**
> InlineResponse200 bcTransfer(Access_Token, opts)

Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939095321601)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.BcTransferBody() // BcTransferBody | 
};
apiInstance.bcTransfer(Access_Token, opts, (error, data, response) => {
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
 **body** | [**BcTransferBody**](BcTransferBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

