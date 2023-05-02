# BcPaymentApi

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
> Response advertiserBalanceGet(bcId, accessToken, filtering, page, pageSize)

Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939106470913)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | Business Center ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringAdvertiserBalanceGet filtering = new FilteringAdvertiserBalanceGet(); // FilteringAdvertiserBalanceGet | Filtering conditions.
Integer page = 56; // Integer | Current number of page
Integer pageSize = 56; // Integer | Page size.
try {
    Response result = apiInstance.advertiserBalanceGet(bcId, accessToken, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#advertiserBalanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**| Business Center ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringAdvertiserBalanceGet**](FilteringAdvertiserBalanceGet.md)| Filtering conditions. | [optional]
 **page** | **Integer**| Current number of page | [optional]
 **pageSize** | **Integer**| Page size. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiserTransactionGet"></a>
# **advertiserTransactionGet**
> Response advertiserTransactionGet(bcId, accessToken, filtering, page, pageSize)

Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939116353538)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | Business Center ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringAdvertiserTransactionGet filtering = new FilteringAdvertiserTransactionGet(); // FilteringAdvertiserTransactionGet | Filtering conditions
Integer page = 56; // Integer | Current page
Integer pageSize = 56; // Integer | Page size,
try {
    Response result = apiInstance.advertiserTransactionGet(bcId, accessToken, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#advertiserTransactionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**| Business Center ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringAdvertiserTransactionGet**](FilteringAdvertiserTransactionGet.md)| Filtering conditions | [optional]
 **page** | **Integer**| Current page | [optional]
 **pageSize** | **Integer**| Page size, | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcBalanceGet"></a>
# **bcBalanceGet**
> Response bcBalanceGet(bcId, accessToken)

Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939128198145)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | Business Center ID
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.bcBalanceGet(bcId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#bcBalanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**| Business Center ID |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcTransactionGet"></a>
# **bcTransactionGet**
> Response bcTransactionGet(bcId, accessToken, filtering, startDate, endDate, page, pageSize)

Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939140408322)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | Business Center ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringBCTransactionGet filtering = new FilteringBCTransactionGet(); // FilteringBCTransactionGet | Filtering conditions
String startDate = "startDate_example"; // String | Start date of transaction records that you want to get, in the format of \"YYYY-MM-DD\". The default value is the date 90 days earlier.
String endDate = "endDate_example"; // String | End date of transaction records that you want to get, in the format of \"YYYY-MM-DD\". The default value is the date today.
Integer page = 56; // Integer | Page number
Integer pageSize = 56; // Integer | Page size. Value range- 1-50
try {
    Response result = apiInstance.bcTransactionGet(bcId, accessToken, filtering, startDate, endDate, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#bcTransactionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**| Business Center ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringBCTransactionGet**](FilteringBCTransactionGet.md)| Filtering conditions | [optional]
 **startDate** | **String**| Start date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date 90 days earlier. | [optional]
 **endDate** | **String**| End date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date today. | [optional]
 **page** | **Integer**| Page number | [optional]
 **pageSize** | **Integer**| Page size. Value range- 1-50 | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcTransfer"></a>
# **bcTransfer**
> Response bcTransfer(accessToken, body)

Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939095321601)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
BcTransferBody body = new BcTransferBody(); // BcTransferBody | BC transfer parameters
try {
    Response result = apiInstance.bcTransfer(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#bcTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**BcTransferBody**](BcTransferBody.md)| BC transfer parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

