"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.BCApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_balance_get**](BCApi.md#advertiser_balance_get) | **GET** /open_api/v1.3/advertiser/balance/get/ | Get ad account balance and budget. [BC Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939106470913)
[**advertiser_transaction_get**](BCApi.md#advertiser_transaction_get) | **GET** /open_api/v1.3/advertiser/transaction/get/ | Get transaction records of an ad account. [BC Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939116353538)
[**bc_account_transaction_get**](BCApi.md#bc_account_transaction_get) | **GET** /open_api/v1.3/bc/account/transaction/get/ | Get the transaction records of a BC or ad accounts. [BC Account Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1792849810925569)
[**bc_advertiser_create**](BCApi.md#bc_advertiser_create) | **POST** /open_api/v1.3/bc/advertiser/create/ | Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739939020318721)
[**bc_asset_admin_delete**](BCApi.md#bc_asset_admin_delete) | **POST** /open_api/v1.3/bc/asset/admin/delete/ | Delete assets. [BC Asset Admin Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739657251102722)
[**bc_asset_admin_get**](BCApi.md#bc_asset_admin_get) | **GET** /open_api/v1.3/bc/asset/admin/get/ | Get assets of a Business Center as admins. [BC Asset Admin Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739433007779841)
[**bc_asset_assign**](BCApi.md#bc_asset_assign) | **POST** /open_api/v1.3/bc/asset/assign/ | Assign assets to a user. [BC Asset Assign](https://business-api.tiktok.com/portal/docs?id&#x3D;1739438211077121)
[**bc_asset_get**](BCApi.md#bc_asset_get) | **GET** /open_api/v1.3/bc/asset/get/ | Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739432717798401)
[**bc_asset_group_create**](BCApi.md#bc_asset_group_create) | **POST** /open_api/v1.3/bc/asset_group/create/ | Create an Asset Group in your Business Center. [BC Asset Group Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1749001658583105)
[**bc_asset_group_delete**](BCApi.md#bc_asset_group_delete) | **POST** /open_api/v1.3/bc/asset_group/delete/ | Remove members&#x27; access to an Asset Group. [BC Asset Group Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1749001673406466)
[**bc_asset_group_get**](BCApi.md#bc_asset_group_get) | **GET** /open_api/v1.3/bc/asset_group/get/ | Get the assets or members of an Asset Group in a Business Center. [BC Asset Group Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1749001669670913)
[**bc_asset_group_list**](BCApi.md#bc_asset_group_list) | **GET** /open_api/v1.3/bc/asset_group/list/ | Get all Asset Groups in your Business Center. [BC Asset Group List](https://business-api.tiktok.com/portal/docs?id&#x3D;1749001665910786)
[**bc_asset_group_update**](BCApi.md#bc_asset_group_update) | **POST** /open_api/v1.3/bc/asset_group/update/ | Update assets, members or the name of an Asset Group. [BC Asset Group Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1749001662156801)
[**bc_asset_member_get**](BCApi.md#bc_asset_member_get) | **GET** /open_api/v1.3/bc/asset/member/get/ | Get members by assets. [BC Asset Member Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739659558931458)
[**bc_asset_partner_get**](BCApi.md#bc_asset_partner_get) | **GET** /open_api/v1.3/bc/asset/partner/get/ | Get partners by assets. [BC Asset Partner Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739663268166722)
[**bc_asset_unassign**](BCApi.md#bc_asset_unassign) | **POST** /open_api/v1.3/bc/asset/unassign/ | Revoke the access to an asset from a user. [BC Asset Unassign](https://business-api.tiktok.com/portal/docs?id&#x3D;1739448126749698)
[**bc_balance_get**](BCApi.md#bc_balance_get) | **GET** /open_api/v1.3/bc/balance/get/ | Get the balance of a Business Center. [BC Balance Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939128198145)
[**bc_billing_group_create**](BCApi.md#bc_billing_group_create) | **POST** /open_api/v1.3/bc/billing_group/create/ | Create a billing group in a Business Center. [BC Billing Group Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738947780033537)
[**bc_billing_group_get**](BCApi.md#bc_billing_group_get) | **GET** /open_api/v1.3/bc/billing_group/get/ | Get all billing groups in a Business Center. [BC Billing Group Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738944324279297)
[**bc_billing_group_update**](BCApi.md#bc_billing_group_update) | **POST** /open_api/v1.3/bc/billing_group/update/ | Update settings of a billing group. [BC Billing Group Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738947843447809)
[**bc_get**](BCApi.md#bc_get) | **GET** /open_api/v1.3/bc/get/ | Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737115687501826)
[**bc_image_upload**](BCApi.md#bc_image_upload) | **POST** /open_api/v1.3/bc/image/upload/ | Upload certificate images for an ad account. [BC Image Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1739938996913218)
[**bc_invoice_unpaid_get**](BCApi.md#bc_invoice_unpaid_get) | **GET** /open_api/v1.3/bc/invoice/unpaid/get/ | Finance Managers and Finance Analysts of a Business Center account can use this endpoint to get total unpaid amount of their Business Center accounts. [BC Invoice Unpaid Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740295904843777)
[**bc_member_delete**](BCApi.md#bc_member_delete) | **POST** /open_api/v1.3/bc/member/delete/ | Delete member. [BC Member Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939482851329)
[**bc_member_get**](BCApi.md#bc_member_get) | **GET** /open_api/v1.3/bc/member/get/ | Get BC members. [BC Member Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939404802049)
[**bc_member_invite**](BCApi.md#bc_member_invite) | **POST** /open_api/v1.3/bc/member/invite/ | Invite members to BC. [BC Member Invite](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939455765505)
[**bc_member_update**](BCApi.md#bc_member_update) | **POST** /open_api/v1.3/bc/member/update/ | Update member information. [BC Member Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739696704424961)
[**bc_partner_add**](BCApi.md#bc_partner_add) | **POST** /open_api/v1.3/bc/partner/add/ | Add partner to Business Center. [BC Partner Add](https://business-api.tiktok.com/portal/docs?id&#x3D;1739662756510721)
[**bc_partner_asset_delete**](BCApi.md#bc_partner_asset_delete) | **POST** /open_api/v1.3/bc/partner/asset/delete/ | Cancel asset sharing. [BC Partner Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739662800930817)
[**bc_partner_asset_get**](BCApi.md#bc_partner_asset_get) | **GET** /open_api/v1.3/bc/partner/asset/get/ | Get partner assets. [BC Partner Asset Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739662828320769)
[**bc_partner_delete**](BCApi.md#bc_partner_delete) | **POST** /open_api/v1.3/bc/partner/delete/ | Delete partner. [BC Partner Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739662779301890)
[**bc_partner_get**](BCApi.md#bc_partner_get) | **GET** /open_api/v1.3/bc/partner/get/ | Get partners. [BC Partner Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739662727395330)
[**bc_pixel_link_get**](BCApi.md#bc_pixel_link_get) | **GET** /open_api/v1.3/bc/pixel/link/get/ | Use this endpoint to get a list of ad accounts that have been linked to the request pixel. [BC Pixel Link Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1753994966965249)
[**bc_pixel_link_update**](BCApi.md#bc_pixel_link_update) | **POST** /open_api/v1.3/bc/pixel/link/update/ | Use this endpoint to link and unlink pixel to advertiser accounts. [BC Pixel Link Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1753994950327297)
[**bc_pixel_transfer**](BCApi.md#bc_pixel_transfer) | **POST** /open_api/v1.3/bc/pixel/transfer/ | Transfer Pixel from Advertiser to BC. [BC Pixel Transfer](https://business-api.tiktok.com/portal/docs?id&#x3D;1753994928261122)
[**bc_transaction_get**](BCApi.md#bc_transaction_get) | **GET** /open_api/v1.3/bc/transaction/get/ | Get translaction records of a Business Center. [BC Transaction Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939140408322)
[**bc_transfer**](BCApi.md#bc_transfer) | **POST** /open_api/v1.3/bc/transfer/ | Process payments (recharge money to or deduct money from an ad account in a Business Center. [BC Transfer](https://business-api.tiktok.com/portal/docs?id&#x3D;1739939095321601)

# **advertiser_balance_get**
> InlineResponse200 advertiser_balance_get(bc_id, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)

Get ad account balance and budget. [BC Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939106470913)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)
filtering = business_api_client.FilteringAdvertiserBalanceGet() # FilteringAdvertiserBalanceGet |  (optional)
page = 789 # int |  (optional)
page_size = 789 # int |  (optional)

try:
    # Get ad account balance and budget. [BC Advertiser Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939106470913)
    api_response = api_instance.advertiser_balance_get(bc_id, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->advertiser_balance_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 
 **filtering** | [**FilteringAdvertiserBalanceGet**](FilteringAdvertiserBalanceGet.md)|  | [optional] 
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

Get transaction records of an ad account. [BC Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939116353538)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 789 # int | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringAdvertiserTransactionGet() # FilteringAdvertiserTransactionGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get transaction records of an ad account. [BC Advertiser Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939116353538)
    api_response = api_instance.advertiser_transaction_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->advertiser_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **int**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringAdvertiserTransactionGet**](FilteringAdvertiserTransactionGet.md)|  | [optional] 
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

# **bc_account_transaction_get**
> InlineResponse200 bc_account_transaction_get(access_token, bc_id=bc_id, child_bc_id=child_bc_id, transaction_level=transaction_level, filtering=filtering, page=page, page_size=page_size)

Get the transaction records of a BC or ad accounts. [BC Account Transaction Get](https://business-api.tiktok.com/portal/docs?id=1792849810925569)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
bc_id = 'bc_id_example' # str |  (optional)
child_bc_id = 'child_bc_id_example' # str |  (optional)
transaction_level = 'transaction_level_example' # str |  (optional)
filtering = business_api_client.FilteringBcAccountTransactionGet() # FilteringBcAccountTransactionGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get the transaction records of a BC or ad accounts. [BC Account Transaction Get](https://business-api.tiktok.com/portal/docs?id=1792849810925569)
    api_response = api_instance.bc_account_transaction_get(access_token, bc_id=bc_id, child_bc_id=child_bc_id, transaction_level=transaction_level, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_account_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **bc_id** | **str**|  | [optional] 
 **child_bc_id** | **str**|  | [optional] 
 **transaction_level** | **str**|  | [optional] 
 **filtering** | [**FilteringBcAccountTransactionGet**](FilteringBcAccountTransactionGet.md)|  | [optional] 
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

# **bc_advertiser_create**
> InlineResponse200 bc_advertiser_create(access_token, body=body)

Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id=1739939020318721)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdvertiserCreateBody() # AdvertiserCreateBody | BC advertiser create body parameters (optional)

try:
    # Create an ad account [BC advertiser create](https://ads.tiktok.com/marketing_api/docs?id=1739939020318721)
    api_response = api_instance.bc_advertiser_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_advertiser_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdvertiserCreateBody**](AdvertiserCreateBody.md)| BC advertiser create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_admin_delete**
> InlineResponse200 bc_asset_admin_delete(access_token, body=body)

Delete assets. [BC Asset Admin Delete](https://business-api.tiktok.com/portal/docs?id=1739657251102722)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AdminDeleteBody() # AdminDeleteBody |  (optional)

try:
    # Delete assets. [BC Asset Admin Delete](https://business-api.tiktok.com/portal/docs?id=1739657251102722)
    api_response = api_instance.bc_asset_admin_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_admin_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AdminDeleteBody**](AdminDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_admin_get**
> InlineResponse200 bc_asset_admin_get(bc_id, asset_type, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)

Get assets of a Business Center as admins. [BC Asset Admin Get](https://business-api.tiktok.com/portal/docs?id=1739433007779841)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
asset_type = 'asset_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)
filtering = business_api_client.FilteringBcAssetAdminGet() # FilteringBcAssetAdminGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get assets of a Business Center as admins. [BC Asset Admin Get](https://business-api.tiktok.com/portal/docs?id=1739433007779841)
    api_response = api_instance.bc_asset_admin_get(bc_id, asset_type, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_admin_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **asset_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 
 **filtering** | [**FilteringBcAssetAdminGet**](FilteringBcAssetAdminGet.md)|  | [optional] 
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

# **bc_asset_assign**
> InlineResponse200 bc_asset_assign(access_token, body=body)

Assign assets to a user. [BC Asset Assign](https://business-api.tiktok.com/portal/docs?id=1739438211077121)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetAssignBody() # AssetAssignBody |  (optional)

try:
    # Assign assets to a user. [BC Asset Assign](https://business-api.tiktok.com/portal/docs?id=1739438211077121)
    api_response = api_instance.bc_asset_assign(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_assign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetAssignBody**](AssetAssignBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_get**
> InlineResponse200 bc_asset_get(bc_id, asset_type, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)

Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id=1739432717798401)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
asset_type = 'asset_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)
filtering = business_api_client.FilteringBcAssetGet() # FilteringBcAssetGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get assets of a Business Center. [BC Asset Get](https://business-api.tiktok.com/portal/docs?id=1739432717798401)
    api_response = api_instance.bc_asset_get(bc_id, asset_type, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **asset_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 
 **filtering** | [**FilteringBcAssetGet**](FilteringBcAssetGet.md)|  | [optional] 
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

# **bc_asset_group_create**
> InlineResponse200 bc_asset_group_create(access_token, body=body)

Create an Asset Group in your Business Center. [BC Asset Group Create](https://business-api.tiktok.com/portal/docs?id=1749001658583105)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetGroupCreateBody() # AssetGroupCreateBody |  (optional)

try:
    # Create an Asset Group in your Business Center. [BC Asset Group Create](https://business-api.tiktok.com/portal/docs?id=1749001658583105)
    api_response = api_instance.bc_asset_group_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_group_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetGroupCreateBody**](AssetGroupCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_group_delete**
> InlineResponse200 bc_asset_group_delete(access_token, body=body)

Remove members' access to an Asset Group. [BC Asset Group Delete](https://business-api.tiktok.com/portal/docs?id=1749001673406466)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetGroupDeleteBody() # AssetGroupDeleteBody |  (optional)

try:
    # Remove members' access to an Asset Group. [BC Asset Group Delete](https://business-api.tiktok.com/portal/docs?id=1749001673406466)
    api_response = api_instance.bc_asset_group_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_group_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetGroupDeleteBody**](AssetGroupDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_group_get**
> InlineResponse200 bc_asset_group_get(bc_id, asset_group_id, query_entity, access_token, filtering=filtering, page=page, page_size=page_size)

Get the assets or members of an Asset Group in a Business Center. [BC Asset Group Get](https://business-api.tiktok.com/portal/docs?id=1749001669670913)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
asset_group_id = 'asset_group_id_example' # str | 
query_entity = 'query_entity_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBcAssetGroupGet() # FilteringBcAssetGroupGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get the assets or members of an Asset Group in a Business Center. [BC Asset Group Get](https://business-api.tiktok.com/portal/docs?id=1749001669670913)
    api_response = api_instance.bc_asset_group_get(bc_id, asset_group_id, query_entity, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_group_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **asset_group_id** | **str**|  | [required]
 **query_entity** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBcAssetGroupGet**](FilteringBcAssetGroupGet.md)|  | [optional] 
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

# **bc_asset_group_list**
> InlineResponse200 bc_asset_group_list(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)

Get all Asset Groups in your Business Center. [BC Asset Group List](https://business-api.tiktok.com/portal/docs?id=1749001665910786)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBcAssetGroupList() # FilteringBcAssetGroupList |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get all Asset Groups in your Business Center. [BC Asset Group List](https://business-api.tiktok.com/portal/docs?id=1749001665910786)
    api_response = api_instance.bc_asset_group_list(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_group_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBcAssetGroupList**](FilteringBcAssetGroupList.md)|  | [optional] 
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

# **bc_asset_group_update**
> InlineResponse200 bc_asset_group_update(access_token, body=body)

Update assets, members or the name of an Asset Group. [BC Asset Group Update](https://business-api.tiktok.com/portal/docs?id=1749001662156801)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetGroupUpdateBody() # AssetGroupUpdateBody |  (optional)

try:
    # Update assets, members or the name of an Asset Group. [BC Asset Group Update](https://business-api.tiktok.com/portal/docs?id=1749001662156801)
    api_response = api_instance.bc_asset_group_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_group_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetGroupUpdateBody**](AssetGroupUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_asset_member_get**
> InlineResponse200 bc_asset_member_get(bc_id, asset_type, asset_id, access_token, filtering=filtering, page=page, page_size=page_size)

Get members by assets. [BC Asset Member Get](https://business-api.tiktok.com/portal/docs?id=1739659558931458)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
asset_type = 'asset_type_example' # str | 
asset_id = 'asset_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBcAssetMemberGet() # FilteringBcAssetMemberGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get members by assets. [BC Asset Member Get](https://business-api.tiktok.com/portal/docs?id=1739659558931458)
    api_response = api_instance.bc_asset_member_get(bc_id, asset_type, asset_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_member_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **asset_type** | **str**|  | [required]
 **asset_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBcAssetMemberGet**](FilteringBcAssetMemberGet.md)|  | [optional] 
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

# **bc_asset_partner_get**
> InlineResponse200 bc_asset_partner_get(bc_id, asset_type, asset_id, access_token, filtering=filtering, page=page, page_size=page_size)

Get partners by assets. [BC Asset Partner Get](https://business-api.tiktok.com/portal/docs?id=1739663268166722)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
asset_type = 'asset_type_example' # str | 
asset_id = 'asset_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = NULL # object |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get partners by assets. [BC Asset Partner Get](https://business-api.tiktok.com/portal/docs?id=1739663268166722)
    api_response = api_instance.bc_asset_partner_get(bc_id, asset_type, asset_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_partner_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **asset_type** | **str**|  | [required]
 **asset_id** | **str**|  | [required]
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

# **bc_asset_unassign**
> InlineResponse200 bc_asset_unassign(access_token, body=body)

Revoke the access to an asset from a user. [BC Asset Unassign](https://business-api.tiktok.com/portal/docs?id=1739448126749698)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetUnassignBody() # AssetUnassignBody |  (optional)

try:
    # Revoke the access to an asset from a user. [BC Asset Unassign](https://business-api.tiktok.com/portal/docs?id=1739448126749698)
    api_response = api_instance.bc_asset_unassign(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_asset_unassign: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetUnassignBody**](AssetUnassignBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_balance_get**
> InlineResponse200 bc_balance_get(bc_id, access_token, child_bc_id=child_bc_id)

Get the balance of a Business Center. [BC Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939128198145)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)

try:
    # Get the balance of a Business Center. [BC Balance Get](https://business-api.tiktok.com/portal/docs?id=1739939128198145)
    api_response = api_instance.bc_balance_get(bc_id, access_token, child_bc_id=child_bc_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_balance_get: %s\n" % e)
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

# **bc_billing_group_create**
> InlineResponse200 bc_billing_group_create(access_token, body=body)

Create a billing group in a Business Center. [BC Billing Group Create](https://business-api.tiktok.com/portal/docs?id=1738947780033537)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BillingGroupCreateBody() # BillingGroupCreateBody |  (optional)

try:
    # Create a billing group in a Business Center. [BC Billing Group Create](https://business-api.tiktok.com/portal/docs?id=1738947780033537)
    api_response = api_instance.bc_billing_group_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_billing_group_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BillingGroupCreateBody**](BillingGroupCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_billing_group_get**
> InlineResponse200 bc_billing_group_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)

Get all billing groups in a Business Center. [BC Billing Group Get](https://business-api.tiktok.com/portal/docs?id=1738944324279297)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBcBillingGroupGet() # FilteringBcBillingGroupGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get all billing groups in a Business Center. [BC Billing Group Get](https://business-api.tiktok.com/portal/docs?id=1738944324279297)
    api_response = api_instance.bc_billing_group_get(bc_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_billing_group_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBcBillingGroupGet**](FilteringBcBillingGroupGet.md)|  | [optional] 
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

# **bc_billing_group_update**
> InlineResponse200 bc_billing_group_update(access_token, body=body)

Update settings of a billing group. [BC Billing Group Update](https://business-api.tiktok.com/portal/docs?id=1738947843447809)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BillingGroupUpdateBody() # BillingGroupUpdateBody |  (optional)

try:
    # Update settings of a billing group. [BC Billing Group Update](https://business-api.tiktok.com/portal/docs?id=1738947843447809)
    api_response = api_instance.bc_billing_group_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_billing_group_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BillingGroupUpdateBody**](BillingGroupUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_get**
> InlineResponse200 bc_get(access_token, bc_id=bc_id, scene=scene, filtering=filtering, page=page, page_size=page_size)

Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id=1737115687501826)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
bc_id = 'bc_id_example' # str |  (optional)
scene = 'SINGLE_ACCOUNT' # str |  (optional) (default to SINGLE_ACCOUNT)
filtering = business_api_client.FilteringBcGet() # FilteringBcGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get Business Centers that you have access to. [BC Get](https://business-api.tiktok.com/portal/docs?id=1737115687501826)
    api_response = api_instance.bc_get(access_token, bc_id=bc_id, scene=scene, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **bc_id** | **str**|  | [optional] 
 **scene** | **str**|  | [optional] [default to SINGLE_ACCOUNT]
 **filtering** | [**FilteringBcGet**](FilteringBcGet.md)|  | [optional] 
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

# **bc_image_upload**
> InlineResponse200 bc_image_upload(access_token, bc_id=bc_id, image_file=image_file)

Upload certificate images for an ad account. [BC Image Upload](https://business-api.tiktok.com/portal/docs?id=1739938996913218)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
bc_id = 'bc_id_example' # str |  (optional)
image_file = 'image_file_example' # str |  (optional)

try:
    # Upload certificate images for an ad account. [BC Image Upload](https://business-api.tiktok.com/portal/docs?id=1739938996913218)
    api_response = api_instance.bc_image_upload(access_token, bc_id=bc_id, image_file=image_file)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_image_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **bc_id** | **str**|  | [optional] 
 **image_file** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_invoice_unpaid_get**
> InlineResponse200 bc_invoice_unpaid_get(bc_id, invoice_type, access_token)

Finance Managers and Finance Analysts of a Business Center account can use this endpoint to get total unpaid amount of their Business Center accounts. [BC Invoice Unpaid Get](https://business-api.tiktok.com/portal/docs?id=1740295904843777)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
invoice_type = 'invoice_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Finance Managers and Finance Analysts of a Business Center account can use this endpoint to get total unpaid amount of their Business Center accounts. [BC Invoice Unpaid Get](https://business-api.tiktok.com/portal/docs?id=1740295904843777)
    api_response = api_instance.bc_invoice_unpaid_get(bc_id, invoice_type, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_invoice_unpaid_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **invoice_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_member_delete**
> InlineResponse200 bc_member_delete(access_token, body=body)

Delete member. [BC Member Delete](https://business-api.tiktok.com/portal/docs?id=1739939482851329)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.MemberDeleteBody() # MemberDeleteBody |  (optional)

try:
    # Delete member. [BC Member Delete](https://business-api.tiktok.com/portal/docs?id=1739939482851329)
    api_response = api_instance.bc_member_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_member_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**MemberDeleteBody**](MemberDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_member_get**
> InlineResponse200 bc_member_get(bc_id, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)

Get BC members. [BC Member Get](https://business-api.tiktok.com/portal/docs?id=1739939404802049)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
child_bc_id = 'child_bc_id_example' # str |  (optional)
filtering = business_api_client.FilteringBcMemberGet() # FilteringBcMemberGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get BC members. [BC Member Get](https://business-api.tiktok.com/portal/docs?id=1739939404802049)
    api_response = api_instance.bc_member_get(bc_id, access_token, child_bc_id=child_bc_id, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_member_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **child_bc_id** | **str**|  | [optional] 
 **filtering** | [**FilteringBcMemberGet**](FilteringBcMemberGet.md)|  | [optional] 
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

# **bc_member_invite**
> InlineResponse200 bc_member_invite(access_token, body=body)

Invite members to BC. [BC Member Invite](https://business-api.tiktok.com/portal/docs?id=1739939455765505)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.MemberInviteBody() # MemberInviteBody |  (optional)

try:
    # Invite members to BC. [BC Member Invite](https://business-api.tiktok.com/portal/docs?id=1739939455765505)
    api_response = api_instance.bc_member_invite(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_member_invite: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**MemberInviteBody**](MemberInviteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_member_update**
> InlineResponse200 bc_member_update(access_token, body=body)

Update member information. [BC Member Update](https://business-api.tiktok.com/portal/docs?id=1739696704424961)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.MemberUpdateBody() # MemberUpdateBody |  (optional)

try:
    # Update member information. [BC Member Update](https://business-api.tiktok.com/portal/docs?id=1739696704424961)
    api_response = api_instance.bc_member_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_member_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**MemberUpdateBody**](MemberUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_partner_add**
> InlineResponse200 bc_partner_add(access_token, body=body)

Add partner to Business Center. [BC Partner Add](https://business-api.tiktok.com/portal/docs?id=1739662756510721)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PartnerAddBody() # PartnerAddBody |  (optional)

try:
    # Add partner to Business Center. [BC Partner Add](https://business-api.tiktok.com/portal/docs?id=1739662756510721)
    api_response = api_instance.bc_partner_add(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_partner_add: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PartnerAddBody**](PartnerAddBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_partner_asset_delete**
> InlineResponse200 bc_partner_asset_delete(access_token, body=body)

Cancel asset sharing. [BC Partner Asset Delete](https://business-api.tiktok.com/portal/docs?id=1739662800930817)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetDeleteBody() # AssetDeleteBody |  (optional)

try:
    # Cancel asset sharing. [BC Partner Asset Delete](https://business-api.tiktok.com/portal/docs?id=1739662800930817)
    api_response = api_instance.bc_partner_asset_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_partner_asset_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetDeleteBody**](AssetDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_partner_asset_get**
> InlineResponse200 bc_partner_asset_get(bc_id, partner_id, asset_type, share_type, access_token, filtering=filtering, page=page, page_size=page_size)

Get partner assets. [BC Partner Asset Get](https://business-api.tiktok.com/portal/docs?id=1739662828320769)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
partner_id = 'partner_id_example' # str | 
asset_type = 'asset_type_example' # str | 
share_type = 'share_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBcPartnerAssetGet() # FilteringBcPartnerAssetGet |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get partner assets. [BC Partner Asset Get](https://business-api.tiktok.com/portal/docs?id=1739662828320769)
    api_response = api_instance.bc_partner_asset_get(bc_id, partner_id, asset_type, share_type, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_partner_asset_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **partner_id** | **str**|  | [required]
 **asset_type** | **str**|  | [required]
 **share_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBcPartnerAssetGet**](FilteringBcPartnerAssetGet.md)|  | [optional] 
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

# **bc_partner_delete**
> InlineResponse200 bc_partner_delete(access_token, body=body)

Delete partner. [BC Partner Delete](https://business-api.tiktok.com/portal/docs?id=1739662779301890)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PartnerDeleteBody() # PartnerDeleteBody |  (optional)

try:
    # Delete partner. [BC Partner Delete](https://business-api.tiktok.com/portal/docs?id=1739662779301890)
    api_response = api_instance.bc_partner_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_partner_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PartnerDeleteBody**](PartnerDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_partner_get**
> InlineResponse200 bc_partner_get(bc_id, access_token, page=page, page_size=page_size, filtering=filtering)

Get partners. [BC Partner Get](https://business-api.tiktok.com/portal/docs?id=1739662727395330)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
filtering = business_api_client.FilteringBcPartnerGet() # FilteringBcPartnerGet |  (optional)

try:
    # Get partners. [BC Partner Get](https://business-api.tiktok.com/portal/docs?id=1739662727395330)
    api_response = api_instance.bc_partner_get(bc_id, access_token, page=page, page_size=page_size, filtering=filtering)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_partner_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]
 **filtering** | [**FilteringBcPartnerGet**](FilteringBcPartnerGet.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_pixel_link_get**
> InlineResponse200 bc_pixel_link_get(bc_id, pixel_code, access_token, page=page, page_size=page_size)

Use this endpoint to get a list of ad accounts that have been linked to the request pixel. [BC Pixel Link Get](https://business-api.tiktok.com/portal/docs?id=1753994966965249)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
pixel_code = 'pixel_code_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Use this endpoint to get a list of ad accounts that have been linked to the request pixel. [BC Pixel Link Get](https://business-api.tiktok.com/portal/docs?id=1753994966965249)
    api_response = api_instance.bc_pixel_link_get(bc_id, pixel_code, access_token, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_pixel_link_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **pixel_code** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
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

# **bc_pixel_link_update**
> InlineResponse200 bc_pixel_link_update(access_token, body=body)

Use this endpoint to link and unlink pixel to advertiser accounts. [BC Pixel Link Update](https://business-api.tiktok.com/portal/docs?id=1753994950327297)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.LinkUpdateBody() # LinkUpdateBody |  (optional)

try:
    # Use this endpoint to link and unlink pixel to advertiser accounts. [BC Pixel Link Update](https://business-api.tiktok.com/portal/docs?id=1753994950327297)
    api_response = api_instance.bc_pixel_link_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_pixel_link_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**LinkUpdateBody**](LinkUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_pixel_transfer**
> InlineResponse200 bc_pixel_transfer(access_token, body=body)

Transfer Pixel from Advertiser to BC. [BC Pixel Transfer](https://business-api.tiktok.com/portal/docs?id=1753994928261122)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PixelTransferBody() # PixelTransferBody |  (optional)

try:
    # Transfer Pixel from Advertiser to BC. [BC Pixel Transfer](https://business-api.tiktok.com/portal/docs?id=1753994928261122)
    api_response = api_instance.bc_pixel_transfer(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_pixel_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PixelTransferBody**](PixelTransferBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bc_transaction_get**
> InlineResponse200 bc_transaction_get(bc_id, access_token, filtering=filtering, start_date=start_date, end_date=end_date, page=page, page_size=page_size)

Get translaction records of a Business Center. [BC Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939140408322)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringBcTransactionGet() # FilteringBcTransactionGet |  (optional)
start_date = 'start_date_example' # str |  (optional)
end_date = 'end_date_example' # str |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get translaction records of a Business Center. [BC Transaction Get](https://business-api.tiktok.com/portal/docs?id=1739939140408322)
    api_response = api_instance.bc_transaction_get(bc_id, access_token, filtering=filtering, start_date=start_date, end_date=end_date, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_transaction_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringBcTransactionGet**](FilteringBcTransactionGet.md)|  | [optional] 
 **start_date** | **str**|  | [optional] 
 **end_date** | **str**|  | [optional] 
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

Process payments (recharge money to or deduct money from an ad account in a Business Center. [BC Transfer](https://business-api.tiktok.com/portal/docs?id=1739939095321601)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.BCApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BcTransferBody() # BcTransferBody |  (optional)

try:
    # Process payments (recharge money to or deduct money from an ad account in a Business Center. [BC Transfer](https://business-api.tiktok.com/portal/docs?id=1739939095321601)
    api_response = api_instance.bc_transfer(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BCApi->bc_transfer: %s\n" % e)
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

