"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.BcPaymentApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_balance_get**](BcPaymentApi.md#advertiser_balance_get) | **GET** /open_api/v1.3/advertiser/balance/get/ | Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939106470913)
[**advertiser_transaction_get**](BcPaymentApi.md#advertiser_transaction_get) | **GET** /open_api/v1.3/advertiser/transaction/get/ | Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939116353538)
[**bc_balance_get**](BcPaymentApi.md#bc_balance_get) | **GET** /open_api/v1.3/bc/balance/get/ | Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939128198145)
[**bc_transaction_get**](BcPaymentApi.md#bc_transaction_get) | **GET** /open_api/v1.3/bc/transaction/get/ | Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939140408322)
[**bc_transfer**](BcPaymentApi.md#bc_transfer) | **POST** /open_api/v1.3/bc/transfer/ | Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939095321601)

# **advertiser_balance_get**
> InlineResponse200 advertiser_balance_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)

Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id=1739939106470913)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | Business Center ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdvertiserBalanceGet() # FilteringAdvertiserBalanceGet | Filtering conditions. (optional)
page = 56 # int | Current number of page (optional)
page_size = 56 # int | Page size. (optional)

try:
    # Obtain the balance of ad accounts in the Business Center. This function only returns the ad accounts that the Business Center has administrator permissions over. [Advertiser balance get](https://ads.tiktok.com/marketing_api/docs?id=1739939106470913)
    api_response = api_instance.advertiser_balance_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->advertiser_balance_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**| Business Center ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdvertiserBalanceGet**](FilteringAdvertiserBalanceGet.md)| Filtering conditions. | [optional] 
 **page** | **int**| Current number of page | [optional] 
 **page_size** | **int**| Page size. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_transaction_get**
> InlineResponse200 advertiser_transaction_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)

Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id=1739939116353538)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | Business Center ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdvertiserTransactionGet() # FilteringAdvertiserTransactionGet | Filtering conditions (optional)
page = 56 # int | Current page (optional)
page_size = 56 # int | Page size, (optional)

try:
    # Get the transaction records of ad accounts in the Business Center. This function only returns the transaction records of ad accounts that the Business Center has administrator rights over. [Advertiser transaction Get](https://ads.tiktok.com/marketing_api/docs?id=1739939116353538)
    api_response = api_instance.advertiser_transaction_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->advertiser_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**| Business Center ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdvertiserTransactionGet**](FilteringAdvertiserTransactionGet.md)| Filtering conditions | [optional] 
 **page** | **int**| Current page | [optional] 
 **page_size** | **int**| Page size, | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_balance_get**
> InlineResponse200 bc_balance_get(bc_id, access_token)

Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id=1739939128198145)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | Business Center ID
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Obtain the balance of a Business Center. [Balance get](https://ads.tiktok.com/marketing_api/docs?id=1739939128198145)
    api_response = api_instance.bc_balance_get(bc_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->bc_balance_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**| Business Center ID | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_transaction_get**
> InlineResponse200 bc_transaction_get(bc_id, access_token, filtering=filtering, start_date=start_date, end_date=end_date, page=page, page_size=page_size)

Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id=1739939140408322)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | Business Center ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBCTransactionGet() # FilteringBCTransactionGet | Filtering conditions (optional)
start_date = 'start_date_example' # str | Start date of transaction records that you want to get, in the format of \"YYYY-MM-DD\". The default value is the date 90 days earlier. (optional)
end_date = 'end_date_example' # str | End date of transaction records that you want to get, in the format of \"YYYY-MM-DD\". The default value is the date today. (optional)
page = 56 # int | Page number (optional)
page_size = 56 # int | Page size. Value range- 1-50 (optional)

try:
    # Get the transaction records of your Business Centers. [Transaction get](https://ads.tiktok.com/marketing_api/docs?id=1739939140408322)
    api_response = api_instance.bc_transaction_get(bc_id, access_token, filtering=filtering, start_date=start_date, end_date=end_date, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->bc_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**| Business Center ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBCTransactionGet**](FilteringBCTransactionGet.md)| Filtering conditions | [optional] 
 **start_date** | **str**| Start date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date 90 days earlier. | [optional] 
 **end_date** | **str**| End date of transaction records that you want to get, in the format of \&quot;YYYY-MM-DD\&quot;. The default value is the date today. | [optional] 
 **page** | **int**| Page number | [optional] 
 **page_size** | **int**| Page size. Value range- 1-50 | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_transfer**
> InlineResponse200 bc_transfer(access_token, body=body)

Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id=1739939095321601)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BcTransferBody() # BcTransferBody | BC transfer parameters (optional)

try:
    # Recharge money to or deduct money from an ad account in a Business Center. [BC transfer](https://ads.tiktok.com/marketing_api/docs?id=1739939095321601)
    api_response = api_instance.bc_transfer(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->bc_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BcTransferBody**](BcTransferBody.md)| BC transfer parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

