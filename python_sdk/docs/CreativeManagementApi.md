"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.CreativeManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creative_asset_delete**](CreativeManagementApi.md#creative_asset_delete) | **POST** /open_api/v1.3/creative/asset/delete/ | Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1797202997456897)
[**creative_asset_share**](CreativeManagementApi.md#creative_asset_share) | **POST** /open_api/v1.3/creative/asset/share/ | SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1773192725768193)
[**creative_image_edit**](CreativeManagementApi.md#creative_image_edit) | **POST** /open_api/v1.3/creative/image/edit/ | Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id&#x3D;1739067107903489)
[**creative_portfolio_create**](CreativeManagementApi.md#creative_portfolio_create) | **POST** /open_api/v1.3/creative/portfolio/create/ | Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739091950439426)
[**creative_portfolio_get**](CreativeManagementApi.md#creative_portfolio_get) | **GET** /open_api/v1.3/creative/portfolio/get/ | Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739092113671170)
[**creative_portfolio_list**](CreativeManagementApi.md#creative_portfolio_list) | **GET** /open_api/v1.3/creative/portfolio/list/ | Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id&#x3D;1766324010279938)
[**creative_shareable_link_create**](CreativeManagementApi.md#creative_shareable_link_create) | **POST** /open_api/v1.3/creative/shareable_link/create/ | 
[**creative_smart_text_generate**](CreativeManagementApi.md#creative_smart_text_generate) | **POST** /open_api/v1.3/creative/smart_text/generate/ | Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id&#x3D;1739084248002626)
[**discovery_detail**](CreativeManagementApi.md#discovery_detail) | **GET** /open_api/v1.3/discovery/detail/ | Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119047070721)
[**discovery_trending_list**](CreativeManagementApi.md#discovery_trending_list) | **GET** /open_api/v1.3/discovery/trending_list/ | Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119032526849)
[**playable_delete**](CreativeManagementApi.md#playable_delete) | **POST** /open_api/v1.3/playable/delete/ | Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1737733368940546)
[**playable_get**](CreativeManagementApi.md#playable_get) | **GET** /open_api/v1.3/playable/get/ | Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732758495234)
[**playable_save**](CreativeManagementApi.md#playable_save) | **POST** /open_api/v1.3/playable/save/ | Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732203851777)
[**playable_upload**](CreativeManagementApi.md#playable_upload) | **POST** /open_api/v1.3/playable/upload/ | You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1737730926765057)
[**playable_validate**](CreativeManagementApi.md#playable_validate) | **GET** /open_api/v1.3/playable/validate/ | Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732054892545)

# **creative_asset_delete**
> InlineResponse200 creative_asset_delete(access_token, body=body)

Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id=1797202997456897)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CreativeAssetDeleteBody() # CreativeAssetDeleteBody |  (optional)

try:
    # Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id=1797202997456897)
    api_response = api_instance.creative_asset_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_asset_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CreativeAssetDeleteBody**](CreativeAssetDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_asset_share**
> InlineResponse200 creative_asset_share(access_token, body=body)

SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id=1773192725768193)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.AssetShareBody() # AssetShareBody |  (optional)

try:
    # SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id=1773192725768193)
    api_response = api_instance.creative_asset_share(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_asset_share: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**AssetShareBody**](AssetShareBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_image_edit**
> InlineResponse200 creative_image_edit(access_token, body=body)

Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id=1739067107903489)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ImageEditBody() # ImageEditBody |  (optional)

try:
    # Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id=1739067107903489)
    api_response = api_instance.creative_image_edit(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_image_edit: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ImageEditBody**](ImageEditBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_portfolio_create**
> InlineResponse200 creative_portfolio_create(access_token, body=body)

Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id=1739091950439426)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PortfolioCreateBody() # PortfolioCreateBody |  (optional)

try:
    # Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id=1739091950439426)
    api_response = api_instance.creative_portfolio_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_portfolio_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PortfolioCreateBody**](PortfolioCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_portfolio_get**
> InlineResponse200 creative_portfolio_get(advertiser_id, creative_portfolio_id, access_token)

Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id=1739092113671170)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
creative_portfolio_id = 'creative_portfolio_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id=1739092113671170)
    api_response = api_instance.creative_portfolio_get(advertiser_id, creative_portfolio_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_portfolio_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **creative_portfolio_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_portfolio_list**
> InlineResponse200 creative_portfolio_list(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size)

Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id=1766324010279938)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringCreativePortfolioList() # FilteringCreativePortfolioList |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 20 # int |  (optional) (default to 20)

try:
    # Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id=1766324010279938)
    api_response = api_instance.creative_portfolio_list(advertiser_id, access_token, filtering=filtering, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_portfolio_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringCreativePortfolioList**](FilteringCreativePortfolioList.md)|  | [optional] 
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 20]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_shareable_link_create**
> InlineResponse200 creative_shareable_link_create(access_token, body=body)



### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ShareableLinkCreateBody() # ShareableLinkCreateBody |  (optional)

try:
    api_response = api_instance.creative_shareable_link_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_shareable_link_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ShareableLinkCreateBody**](ShareableLinkCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **creative_smart_text_generate**
> InlineResponse200 creative_smart_text_generate(access_token, body=body)

Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id=1739084248002626)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.SmartTextGenerateBody() # SmartTextGenerateBody |  (optional)

try:
    # Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id=1739084248002626)
    api_response = api_instance.creative_smart_text_generate(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->creative_smart_text_generate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**SmartTextGenerateBody**](SmartTextGenerateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_detail**
> InlineResponse200 discovery_detail(hashtag_id, discovery_type, country_code, date_range, advertiser_id, access_token)

Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id=1825119047070721)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
hashtag_id = 'hashtag_id_example' # str | 
discovery_type = 'discovery_type_example' # str | 
country_code = 'country_code_example' # str | 
date_range = 'date_range_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id=1825119047070721)
    api_response = api_instance.discovery_detail(hashtag_id, discovery_type, country_code, date_range, advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->discovery_detail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hashtag_id** | **str**|  | [required]
 **discovery_type** | **str**|  | [required]
 **country_code** | **str**|  | [required]
 **date_range** | **str**|  | [required]
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discovery_trending_list**
> InlineResponse200 discovery_trending_list(discovery_type, advertiser_id, access_token, country_code=country_code, category_name=category_name, date_range=date_range)

Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id=1825119032526849)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
discovery_type = 'discovery_type_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
country_code = 'US' # str |  (optional) (default to US)
category_name = 'ALL' # str |  (optional) (default to ALL)
date_range = '7DAY' # str |  (optional) (default to 7DAY)

try:
    # Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id=1825119032526849)
    api_response = api_instance.discovery_trending_list(discovery_type, advertiser_id, access_token, country_code=country_code, category_name=category_name, date_range=date_range)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->discovery_trending_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discovery_type** | **str**|  | [required]
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **country_code** | **str**|  | [optional] [default to US]
 **category_name** | **str**|  | [optional] [default to ALL]
 **date_range** | **str**|  | [optional] [default to 7DAY]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **playable_delete**
> InlineResponse200 playable_delete(access_token, body=body)

Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id=1737733368940546)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PlayableDeleteBody() # PlayableDeleteBody |  (optional)

try:
    # Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id=1737733368940546)
    api_response = api_instance.playable_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->playable_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PlayableDeleteBody**](PlayableDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **playable_get**
> InlineResponse200 playable_get(advertiser_id, access_token, playable_id=playable_id, playable_url=playable_url, playable_name=playable_name, status=status, operation_status=operation_status, page=page, page_size=page_size)

Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id=1737732758495234)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
playable_id = 'playable_id_example' # str |  (optional)
playable_url = 'playable_url_example' # str |  (optional)
playable_name = 'playable_name_example' # str |  (optional)
status = 'status_example' # str |  (optional)
operation_status = 'SAVED' # str |  (optional) (default to SAVED)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id=1737732758495234)
    api_response = api_instance.playable_get(advertiser_id, access_token, playable_id=playable_id, playable_url=playable_url, playable_name=playable_name, status=status, operation_status=operation_status, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->playable_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **playable_id** | **str**|  | [optional] 
 **playable_url** | **str**|  | [optional] 
 **playable_name** | **str**|  | [optional] 
 **status** | **str**|  | [optional] 
 **operation_status** | **str**|  | [optional] [default to SAVED]
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

# **playable_save**
> InlineResponse200 playable_save(access_token, body=body)

Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id=1737732203851777)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.PlayableSaveBody() # PlayableSaveBody |  (optional)

try:
    # Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id=1737732203851777)
    api_response = api_instance.playable_save(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->playable_save: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**PlayableSaveBody**](PlayableSaveBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **playable_upload**
> InlineResponse200 playable_upload(access_token, advertiser_id=advertiser_id, file_id=file_id, playable_package=playable_package, upload_type=upload_type)

You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id=1737730926765057)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
advertiser_id = 'advertiser_id_example' # str |  (optional)
file_id = 'file_id_example' # str |  (optional)
playable_package = 'playable_package_example' # str |  (optional)
upload_type = 'upload_type_example' # str |  (optional)

try:
    # You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id=1737730926765057)
    api_response = api_instance.playable_upload(access_token, advertiser_id=advertiser_id, file_id=file_id, playable_package=playable_package, upload_type=upload_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->playable_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **advertiser_id** | **str**|  | [optional] 
 **file_id** | **str**|  | [optional] 
 **playable_package** | **str**|  | [optional] 
 **upload_type** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **playable_validate**
> InlineResponse200 playable_validate(advertiser_id, playable_id, access_token)

Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id=1737732054892545)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CreativeManagementApi()
advertiser_id = 'advertiser_id_example' # str | 
playable_id = 'playable_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id=1737732054892545)
    api_response = api_instance.playable_validate(advertiser_id, playable_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CreativeManagementApi->playable_validate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **playable_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

