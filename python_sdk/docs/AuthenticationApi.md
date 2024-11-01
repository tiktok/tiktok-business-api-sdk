"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AuthenticationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth2_access_token**](AuthenticationApi.md#oauth2_access_token) | **POST** /open_api/v1.3/oauth2/access_token/ | Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739965703387137)
[**oauth2_advertiser_get**](AuthenticationApi.md#oauth2_advertiser_get) | **GET** /open_api/v1.3/oauth2/advertiser/get/ | Obtain a list of advertiser accounts that authorized an app. [Advertiser Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738455508553729)

# **oauth2_access_token**
> InlineResponse200 oauth2_access_token(body=body)

Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id=1739965703387137)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AuthenticationApi()
body = business_api_client.Oauth2AccessTokenBody() # Oauth2AccessTokenBody | Oauth2 Access token Body parameters (optional)

try:
    # Get access_token and refresh_token by auth_code. The creator access token is valid for 24 hours and the refresh token is valid for one year. Within one year you will need to refresh the access token with the refresh token on a daily basis. After one year you will need to ask the creator to reauthorize. [Oauth2 Access Token](https://ads.tiktok.com/marketing_api/docs?id=1739965703387137)
    api_response = api_instance.oauth2_access_token(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuthenticationApi->oauth2_access_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Oauth2AccessTokenBody**](Oauth2AccessTokenBody.md)| Oauth2 Access token Body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **oauth2_advertiser_get**
> InlineResponse200 oauth2_advertiser_get(app_id, secret, access_token)

Obtain a list of advertiser accounts that authorized an app. [Advertiser Get](https://ads.tiktok.com/marketing_api/docs?id=1738455508553729)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AuthenticationApi()
app_id = 'app_id_example' # str | The App id applied by the developer, which can be found on the [Application Management](https://ads.tiktok.com/marketing_api/apps/) page.
secret = 'secret_example' # str | The private key of the developer's application, which can be found on the [Application Management](https://ads.tiktok.com/marketing_api/apps/) page.
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Obtain a list of advertiser accounts that authorized an app. [Advertiser Get](https://ads.tiktok.com/marketing_api/docs?id=1738455508553729)
    api_response = api_instance.oauth2_advertiser_get(app_id, secret, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuthenticationApi->oauth2_advertiser_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_id** | **str**| The App id applied by the developer, which can be found on the [Application Management](https://ads.tiktok.com/marketing_api/apps/) page. | [required]
 **secret** | **str**| The private key of the developer&#x27;s application, which can be found on the [Application Management](https://ads.tiktok.com/marketing_api/apps/) page. | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

