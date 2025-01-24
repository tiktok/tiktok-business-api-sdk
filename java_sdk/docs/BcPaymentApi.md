# BcPaymentApi

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
> Response advertiserBalanceGet(bcId, accessToken, childBcId, filtering, page, pageSize)

Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939106470913)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String childBcId = "childBcId_example"; // String | 
Object filtering = null; // Object | 
Long page = 789L; // Long | 
Long pageSize = 789L; // Long | 
try {
    Response result = apiInstance.advertiserBalanceGet(bcId, accessToken, childBcId, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#advertiserBalanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **childBcId** | **String**|  | [optional]
 **filtering** | [**Object**](Object.md)|  | [optional]
 **page** | **Long**|  | [optional]
 **pageSize** | **Long**|  | [optional]

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

Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939116353538)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
Long bcId = 789L; // Long | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Object filtering = null; // Object | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
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
 **bcId** | **Long**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**Object**](Object.md)|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 50]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bcBalanceGet"></a>
# **bcBalanceGet**
> Response bcBalanceGet(bcId, accessToken, childBcId)

Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939128198145)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String childBcId = "childBcId_example"; // String | 
try {
    Response result = apiInstance.bcBalanceGet(bcId, accessToken, childBcId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BcPaymentApi#bcBalanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bcId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **childBcId** | **String**|  | [optional]

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

Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939140408322)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String bcId = "bcId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
Object filtering = null; // Object | 
LocalDate startDate = new LocalDate(); // LocalDate | 
LocalDate endDate = new LocalDate(); // LocalDate | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
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
 **bcId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**Object**](Object.md)|  | [optional]
 **startDate** | **LocalDate**|  | [optional]
 **endDate** | **LocalDate**|  | [optional]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 50]

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

Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939095321601)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.BcPaymentApi;


BcPaymentApi apiInstance = new BcPaymentApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
BcTransferBody body = new BcTransferBody(); // BcTransferBody | 
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
 **body** | [**BcTransferBody**](BcTransferBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

