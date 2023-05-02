# js_sdk.BcPaymentApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserBalanceGet**](BcPaymentApi.md#advertiserBalanceGet) | **GET** /open_api/v1.3/advertiser/balance/get/ | Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939106470913)
[**advertiserTransactionGet**](BcPaymentApi.md#advertiserTransactionGet) | **GET** /open_api/v1.3/advertiser/transaction/get/ | Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939116353538)
[**bcBalanceGet**](BcPaymentApi.md#bcBalanceGet) | **GET** /open_api/v1.3/bc/balance/get/ | Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939128198145)
[**bcTransactionGet**](BcPaymentApi.md#bcTransactionGet) | **GET** /open_api/v1.3/bc/transaction/get/ | Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939140408322)
[**bcTransfer**](BcPaymentApi.md#bcTransfer) | **POST** /open_api/v1.3/bc/transfer/ | Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939095321601)

<a name="advertiserBalanceGet"></a>
# **advertiserBalanceGet**
> InlineResponse200 advertiserBalanceGet(bc_id, Access_Token, opts)

Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939106470913)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | Business Center ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringAdvertiserBalanceGet(), // FilteringAdvertiserBalanceGet | Filtering conditions.
  'page': 56, // Number | Current number of page
  'page_size': 56 // Number | Page size.
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
 **bc_id** | **String**| Business Center ID. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringAdvertiserBalanceGet**](FilteringAdvertiserBalanceGet.md)| Filtering conditions. | [optional] 
 **page** | **Number**| Current number of page | [optional] 
 **page_size** | **Number**| Page size. | [optional] 

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

Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939116353538)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | Business Center ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringAdvertiserTransactionGet(), // FilteringAdvertiserTransactionGet | Filtering conditions
  'page': 56, // Number | Current page
  'page_size': 56 // Number | Page size,
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
 **bc_id** | **String**| Business Center ID. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringAdvertiserTransactionGet**](FilteringAdvertiserTransactionGet.md)| Filtering conditions | [optional] 
 **page** | **Number**| Current page | [optional] 
 **page_size** | **Number**| Page size, | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcBalanceGet"></a>
# **bcBalanceGet**
> InlineResponse200 bcBalanceGet(bc_id, Access_Token)

Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939128198145)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | Business Center ID
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.bcBalanceGet(bc_id, Access_Token, (error, data, response) => {
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
 **bc_id** | **String**| Business Center ID |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

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

Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939140408322)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let bc_id = "bc_id_example"; // String | Business Center ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringBCTransactionGet(), // FilteringBCTransactionGet | Filtering conditions
  'start_date': "start_date_example", // String | Start date of transaction records that you want to get, in the format of \"YYYY-MM-DD\". The default value is the date 90 days earlier.
  'end_date': "end_date_example", // String | End date of transaction records that you want to get, in the format of \"YYYY-MM-DD\". The default value is the date today.
  'page': 56, // Number | Page number
  'page_size': 56 // Number | Page size. Value range- 1-50
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
 **bc_id** | **String**| Business Center ID. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **filtering** | [**FilteringBCTransactionGet**](FilteringBCTransactionGet.md)| Filtering conditions | [optional] 
 **start_date** | **String**| Start date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date 90 days earlier. | [optional] 
 **end_date** | **String**| End date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date today. | [optional] 
 **page** | **Number**| Page number | [optional] 
 **page_size** | **Number**| Page size. Value range- 1-50 | [optional] 

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

Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939095321601)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.BcPaymentApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.BcTransferBody() // BcTransferBody | BC transfer parameters
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
 **body** | [**BcTransferBody**](BcTransferBody.md)| BC transfer parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

