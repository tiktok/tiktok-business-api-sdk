"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.BcPaymentApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_balance_get**](BcPaymentApi.md#advertiser_balance_get) | **GET** /open_api/v1.3/advertiser/balance/get/ | Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939106470913)
[**advertiser_transaction_get**](BcPaymentApi.md#advertiser_transaction_get) | **GET** /open_api/v1.3/advertiser/transaction/get/ | Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939116353538)
[**bc_balance_get**](BcPaymentApi.md#bc_balance_get) | **GET** /open_api/v1.3/bc/balance/get/ | Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939128198145)
[**bc_transaction_get**](BcPaymentApi.md#bc_transaction_get) | **GET** /open_api/v1.3/bc/transaction/get/ | Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939140408322)
[**bc_transfer**](BcPaymentApi.md#bc_transfer) | **POST** /open_api/v1.3/bc/transfer/ | Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939095321601)

# **advertiser_balance_get**
> InlineResponse200 advertiser_balance_get(bc_id, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)

Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939106470913)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)
filtering = NULL # object |  (optional)
page = 789 # int |  (optional)
page_size = 789 # int |  (optional)

try:
    # Get ad account balance and budget. [BcPayment Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939106470913)
    api_response = api_instance.advertiser_balance_get(bc_id, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->advertiser_balance_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 
 **filtering** | [**object**](object.md)|  | [optional] 
 **page** | **int**|  | [optional] 
 **page_size** | **int**|  | [optional] 

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

Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939116353538)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 789 # int | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = NULL # object |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get transaction records of an ad account. [BcPayment Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939116353538)
    api_response = api_instance.advertiser_transaction_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->advertiser_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **int**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**object**](object.md)|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_balance_get**
> InlineResponse200 bc_balance_get(bc_id, access_token, child_bc_id=child_bc_id)

Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939128198145)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)

try:
    # Get the balance of a Business Center. [BcPayment BC Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939128198145)
    api_response = api_instance.bc_balance_get(bc_id, access_token, child_bc_id=child_bc_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->bc_balance_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 

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

Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939140408322)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BcPaymentApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = NULL # object |  (optional)
start_date = '2013-10-20' # date |  (optional)
end_date = '2013-10-20' # date |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get transaction records of a Business Center. [BcPayment BC Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939140408322)
    api_response = api_instance.bc_transaction_get(bc_id, access_token, filtering=filtering, start_date=start_date, end_date=end_date, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->bc_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**object**](object.md)|  | [optional] 
 **start_date** | **date**|  | [optional] 
 **end_date** | **date**|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]

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

Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id=1739939095321601)

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
body = business_api_client.BcTransferBody() # BcTransferBody |  (optional)

try:
    # Process payments to recharge or deduct money from an ad account in a Business Center. [BcPayment BC Transfer](https://business-api.tiktok.com/portal/docs?id=1739939095321601)
    api_response = api_instance.bc_transfer(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BcPaymentApi->bc_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BcTransferBody**](BcTransferBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

