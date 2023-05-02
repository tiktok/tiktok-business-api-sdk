"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.IdentityApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identity_create**](IdentityApi.md#identity_create) | **POST** /open_api/v1.3/identity/create/ | Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740654203526146)
[**identity_get**](IdentityApi.md#identity_get) | **GET** /open_api/v1.3/identity/get/ | Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid&#x3D;uraumvplog&amp;id&#x3D;1740218420781057)
[**identity_video_info**](IdentityApi.md#identity_video_info) | **GET** /open_api/v1.3/identity/video/info/ | Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097)

# **identity_create**
> InlineResponse200 identity_create(access_token, body=body)

Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid=uraumvplog&id=1740654203526146)

https://ads.tiktok.com/marketing_api/search?s=identity%2Fcreate%2F&type=0&version=1.3

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.IdentityApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.IdentityCreateBody() # IdentityCreateBody | Identity create body parameters. (optional)

try:
    # Create a customized user identity. [Identity Create](https://ads.tiktok.com/marketing_api/docs?rid=uraumvplog&id=1740654203526146)
    api_response = api_instance.identity_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IdentityApi->identity_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**IdentityCreateBody**](IdentityCreateBody.md)| Identity create body parameters. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **identity_get**
> InlineResponse200 identity_get(advertiser_id, access_token, identity_type=identity_type, identity_authorized_bc_id=identity_authorized_bc_id, page=page, page_size=page_size)

Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid=uraumvplog&id=1740218420781057)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.IdentityApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
identity_type = 'identity_type_example' # str | Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details. (optional)
identity_authorized_bc_id = 'identity_authorized_bc_id_example' # str | Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT. (optional)
page = 56 # int | Page number. (optional)
page_size = 56 # int | Number of results on each page. (optional)

try:
    # Get a list of identities under an ad account. You can filter results by identity type. [Identity Get](https://ads.tiktok.com/marketing_api/docs?rid=uraumvplog&id=1740218420781057)
    api_response = api_instance.identity_get(advertiser_id, access_token, identity_type=identity_type, identity_authorized_bc_id=identity_authorized_bc_id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IdentityApi->identity_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **identity_type** | **str**| Identity type. Enum values: CUSTOMIZED_USER, AUTH_CODE, TT_USER, BC_AUTH_TT. If not specified, all identities will be returned. See Identities for details. | [optional] 
 **identity_authorized_bc_id** | **str**| Identity ID of a TikTok account that a Business Center is authorized to access. Required when identity_type is BC_AUTH_TT. | [optional] 
 **page** | **int**| Page number. | [optional] 
 **page_size** | **int**| Number of results on each page. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **identity_video_info**
> InlineResponse200 identity_video_info(access_token, advertiser_id, identity_type, identity_id, item_id, identity_authorized_bc_id=identity_authorized_bc_id)

Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097)

https://ads.tiktok.com/marketing_api/docs?id=1738958351620097

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.IdentityApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
identity_type = 'identity_type_example' # str | Identity type. Enum: `AUTH_CODE`, `TT_USER`, `BC_AUTH_TT`. See [Identities](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097) for details.
identity_id = 'identity_id_example' # str | Identity ID
item_id = 'item_id_example' # str | TikTok post ID
identity_authorized_bc_id = 'identity_authorized_bc_id_example' # str | The identity ID of a TikTok account that a Business Center is authorized to access. Required when` identity_type` is `BC_AUTH_TT`.  (optional)

try:
    # Get the information about a TikTok post that you own, if your identity is AUTH_CODE, TT_USER or BC_AUTH_TT. [Identity Video Info](https://ads.tiktok.com/marketing_api/docs?id=1738958351620097)
    api_response = api_instance.identity_video_info(access_token, advertiser_id, identity_type, identity_id, item_id, identity_authorized_bc_id=identity_authorized_bc_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IdentityApi->identity_video_info: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **advertiser_id** | **str**| Advertiser ID | [required]
 **identity_type** | **str**| Identity type. Enum: &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;, &#x60;BC_AUTH_TT&#x60;. See [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097) for details. | [required]
 **identity_id** | **str**| Identity ID | [required]
 **item_id** | **str**| TikTok post ID | [required]
 **identity_authorized_bc_id** | **str**| The identity ID of a TikTok account that a Business Center is authorized to access. Required when&#x60; identity_type&#x60; is &#x60;BC_AUTH_TT&#x60;.  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

