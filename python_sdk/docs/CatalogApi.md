"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.CatalogApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalog_available_country_get**](CatalogApi.md#catalog_available_country_get) | **GET** /open_api/v1.3/catalog/available_country/get/ | Get the countries and regions that ads for a catalog can be delivered to. [Catalog Available Country Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740491257516034)
[**catalog_capitalize**](CatalogApi.md#catalog_capitalize) | **POST** /open_api/v1.3/catalog/capitalize/ | Migrate catalogs under your ad account to your Business Center. [Catalog Capitalize](https://business-api.tiktok.com/portal/docs?id&#x3D;1740490222539778)
[**catalog_create**](CatalogApi.md#catalog_create) | **POST** /open_api/v1.3/catalog/create/ | Create a catalog by specifying information such as name, targeted locations, and currency. [Catalog Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740306481704961)
[**catalog_delete**](CatalogApi.md#catalog_delete) | **POST** /open_api/v1.3/catalog/delete/ | Delete a catalog. [Catalog Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740310064588801)
[**catalog_eventsource_bind**](CatalogApi.md#catalog_eventsource_bind) | **POST** /open_api/v1.3/catalog/eventsource/bind/ | Bind app or website event sources to a catalog in a Business Center. [Catalog Eventsource Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492491200513)
[**catalog_eventsource_bind_get**](CatalogApi.md#catalog_eventsource_bind_get) | **GET** /open_api/v1.3/catalog/eventsource_bind/get/ | Get event source binding information. [Catalog Eventsource Bind Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492531343362)
[**catalog_eventsource_unbind**](CatalogApi.md#catalog_eventsource_unbind) | **POST** /open_api/v1.3/catalog/eventsource/unbind/ | Unbind event sources from a catalog. [Catalog Eventsource Unbind](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492512449538)
[**catalog_feed_delete**](CatalogApi.md#catalog_feed_delete) | **POST** /open_api/v1.3/catalog/feed/delete/ | Delete a feed. [Catalog Feed Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740665210863617)
[**catalog_feed_get**](CatalogApi.md#catalog_feed_get) | **GET** /open_api/v1.3/catalog/feed/get/ | Get all feeds or a particular feed. [Catalog Feed Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740665183073281)
[**catalog_get**](CatalogApi.md#catalog_get) | **GET** /open_api/v1.3/catalog/get/ | Get all catalogs or a particular catalog. [Catalog Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740315452868610)
[**catalog_lexicon_get**](CatalogApi.md#catalog_lexicon_get) | **GET** /open_api/v1.3/catalog/lexicon/get/ | Get the lexicon for your catalog for use in ad texts. [Catalog Lexicon Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740488375815169)
[**catalog_location_currency_get**](CatalogApi.md#catalog_location_currency_get) | **GET** /open_api/v1.3/catalog/location_currency/get/ | Get supported locations and corresponding currencies for Catalog API. [Catalog Location Currency Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740491571747841)
[**catalog_overview**](CatalogApi.md#catalog_overview) | **GET** /open_api/v1.3/catalog/overview/ | Get the number of products in different audit statuses in a catalog. [Catalog Overview](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492470201345)
[**catalog_product_delete**](CatalogApi.md#catalog_product_delete) | **POST** /open_api/v1.3/catalog/product/delete/ | Delete products in bulk. [Catalog Product Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740562489236481)
[**catalog_product_file**](CatalogApi.md#catalog_product_file) | **POST** /open_api/v1.3/catalog/product/file/ | Upload products via file URL. [Catalog Product File](https://business-api.tiktok.com/portal/docs?id&#x3D;1740496787164161)
[**catalog_set_product_get**](CatalogApi.md#catalog_set_product_get) | **GET** /open_api/v1.3/catalog/set/product/get/ | Get products in a product set. [Catalog Set Product Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740571478441986)
[**catalog_update**](CatalogApi.md#catalog_update) | **POST** /open_api/v1.3/catalog/update/ | Use this endpoint to update the name of a catalog. The catalog must be under a Business Center. [Catalog Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740306544966657)

# **catalog_available_country_get**
> InlineResponse200 catalog_available_country_get(bc_id, access_token)

Get the countries and regions that ads for a catalog can be delivered to. [Catalog Available Country Get](https://business-api.tiktok.com/portal/docs?id=1740491257516034)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the countries and regions that ads for a catalog can be delivered to. [Catalog Available Country Get](https://business-api.tiktok.com/portal/docs?id=1740491257516034)
    api_response = api_instance.catalog_available_country_get(bc_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_available_country_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_capitalize**
> InlineResponse200 catalog_capitalize(access_token, body=body)

Migrate catalogs under your ad account to your Business Center. [Catalog Capitalize](https://business-api.tiktok.com/portal/docs?id=1740490222539778)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CatalogCapitalizeBody() # CatalogCapitalizeBody |  (optional)

try:
    # Migrate catalogs under your ad account to your Business Center. [Catalog Capitalize](https://business-api.tiktok.com/portal/docs?id=1740490222539778)
    api_response = api_instance.catalog_capitalize(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_capitalize: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CatalogCapitalizeBody**](CatalogCapitalizeBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_create**
> InlineResponse200 catalog_create(access_token, body=body)

Create a catalog by specifying information such as name, targeted locations, and currency. [Catalog Create](https://business-api.tiktok.com/portal/docs?id=1740306481704961)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CatalogCreateBody() # CatalogCreateBody |  (optional)

try:
    # Create a catalog by specifying information such as name, targeted locations, and currency. [Catalog Create](https://business-api.tiktok.com/portal/docs?id=1740306481704961)
    api_response = api_instance.catalog_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CatalogCreateBody**](CatalogCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_delete**
> InlineResponse200 catalog_delete(access_token, body=body)

Delete a catalog. [Catalog Delete](https://business-api.tiktok.com/portal/docs?id=1740310064588801)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CatalogDeleteBody() # CatalogDeleteBody |  (optional)

try:
    # Delete a catalog. [Catalog Delete](https://business-api.tiktok.com/portal/docs?id=1740310064588801)
    api_response = api_instance.catalog_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CatalogDeleteBody**](CatalogDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_eventsource_bind**
> InlineResponse200 catalog_eventsource_bind(access_token, body=body)

Bind app or website event sources to a catalog in a Business Center. [Catalog Eventsource Bind](https://business-api.tiktok.com/portal/docs?id=1740492491200513)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.EventsourceBindBody() # EventsourceBindBody |  (optional)

try:
    # Bind app or website event sources to a catalog in a Business Center. [Catalog Eventsource Bind](https://business-api.tiktok.com/portal/docs?id=1740492491200513)
    api_response = api_instance.catalog_eventsource_bind(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_eventsource_bind: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**EventsourceBindBody**](EventsourceBindBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_eventsource_bind_get**
> InlineResponse200 catalog_eventsource_bind_get(catalog_id, bc_id, access_token)

Get event source binding information. [Catalog Eventsource Bind Get](https://business-api.tiktok.com/portal/docs?id=1740492531343362)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
catalog_id = 'catalog_id_example' # str | 
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get event source binding information. [Catalog Eventsource Bind Get](https://business-api.tiktok.com/portal/docs?id=1740492531343362)
    api_response = api_instance.catalog_eventsource_bind_get(catalog_id, bc_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_eventsource_bind_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**|  | [required]
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_eventsource_unbind**
> InlineResponse200 catalog_eventsource_unbind(access_token, body=body)

Unbind event sources from a catalog. [Catalog Eventsource Unbind](https://business-api.tiktok.com/portal/docs?id=1740492512449538)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.EventsourceUnbindBody() # EventsourceUnbindBody |  (optional)

try:
    # Unbind event sources from a catalog. [Catalog Eventsource Unbind](https://business-api.tiktok.com/portal/docs?id=1740492512449538)
    api_response = api_instance.catalog_eventsource_unbind(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_eventsource_unbind: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**EventsourceUnbindBody**](EventsourceUnbindBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_feed_delete**
> InlineResponse200 catalog_feed_delete(access_token, body=body)

Delete a feed. [Catalog Feed Delete](https://business-api.tiktok.com/portal/docs?id=1740665210863617)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.FeedDeleteBody() # FeedDeleteBody |  (optional)

try:
    # Delete a feed. [Catalog Feed Delete](https://business-api.tiktok.com/portal/docs?id=1740665210863617)
    api_response = api_instance.catalog_feed_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_feed_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**FeedDeleteBody**](FeedDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_feed_get**
> InlineResponse200 catalog_feed_get(catalog_id, bc_id, access_token, feed_id=feed_id)

Get all feeds or a particular feed. [Catalog Feed Get](https://business-api.tiktok.com/portal/docs?id=1740665183073281)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
catalog_id = 'catalog_id_example' # str | 
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
feed_id = 'feed_id_example' # str |  (optional)

try:
    # Get all feeds or a particular feed. [Catalog Feed Get](https://business-api.tiktok.com/portal/docs?id=1740665183073281)
    api_response = api_instance.catalog_feed_get(catalog_id, bc_id, access_token, feed_id=feed_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_feed_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**|  | [required]
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **feed_id** | **str**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_get**
> InlineResponse200 catalog_get(bc_id, access_token, catalog_id=catalog_id, page=page, page_size=page_size)

Get all catalogs or a particular catalog. [Catalog Get](https://business-api.tiktok.com/portal/docs?id=1740315452868610)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
catalog_id = 'catalog_id_example' # str |  (optional)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get all catalogs or a particular catalog. [Catalog Get](https://business-api.tiktok.com/portal/docs?id=1740315452868610)
    api_response = api_instance.catalog_get(bc_id, access_token, catalog_id=catalog_id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **catalog_id** | **str**|  | [optional] 
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

# **catalog_lexicon_get**
> InlineResponse200 catalog_lexicon_get(catalog_id, bc_id, access_token)

Get the lexicon for your catalog for use in ad texts. [Catalog Lexicon Get](https://business-api.tiktok.com/portal/docs?id=1740488375815169)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
catalog_id = 'catalog_id_example' # str | 
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the lexicon for your catalog for use in ad texts. [Catalog Lexicon Get](https://business-api.tiktok.com/portal/docs?id=1740488375815169)
    api_response = api_instance.catalog_lexicon_get(catalog_id, bc_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_lexicon_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**|  | [required]
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_location_currency_get**
> InlineResponse200 catalog_location_currency_get(access_token)

Get supported locations and corresponding currencies for Catalog API. [Catalog Location Currency Get](https://business-api.tiktok.com/portal/docs?id=1740491571747841)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get supported locations and corresponding currencies for Catalog API. [Catalog Location Currency Get](https://business-api.tiktok.com/portal/docs?id=1740491571747841)
    api_response = api_instance.catalog_location_currency_get(access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_location_currency_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_overview**
> InlineResponse200 catalog_overview(catalog_id, bc_id, access_token)

Get the number of products in different audit statuses in a catalog. [Catalog Overview](https://business-api.tiktok.com/portal/docs?id=1740492470201345)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
catalog_id = 'catalog_id_example' # str | 
bc_id = 'bc_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get the number of products in different audit statuses in a catalog. [Catalog Overview](https://business-api.tiktok.com/portal/docs?id=1740492470201345)
    api_response = api_instance.catalog_overview(catalog_id, bc_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_overview: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**|  | [required]
 **bc_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_product_delete**
> InlineResponse200 catalog_product_delete(access_token, body=body)

Delete products in bulk. [Catalog Product Delete](https://business-api.tiktok.com/portal/docs?id=1740562489236481)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ProductDeleteBody() # ProductDeleteBody |  (optional)

try:
    # Delete products in bulk. [Catalog Product Delete](https://business-api.tiktok.com/portal/docs?id=1740562489236481)
    api_response = api_instance.catalog_product_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_product_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ProductDeleteBody**](ProductDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_product_file**
> InlineResponse200 catalog_product_file(access_token, body=body)

Upload products via file URL. [Catalog Product File](https://business-api.tiktok.com/portal/docs?id=1740496787164161)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.ProductFileBody() # ProductFileBody |  (optional)

try:
    # Upload products via file URL. [Catalog Product File](https://business-api.tiktok.com/portal/docs?id=1740496787164161)
    api_response = api_instance.catalog_product_file(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_product_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**ProductFileBody**](ProductFileBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalog_set_product_get**
> InlineResponse200 catalog_set_product_get(bc_id, catalog_id, product_set_id, access_token, page=page, page_size=page_size)

Get products in a product set. [Catalog Set Product Get](https://business-api.tiktok.com/portal/docs?id=1740571478441986)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
bc_id = 'bc_id_example' # str | 
catalog_id = 'catalog_id_example' # str | 
product_set_id = 'product_set_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
page = 1 # int |  (optional) (default to 1)
page_size = 20 # int |  (optional) (default to 20)

try:
    # Get products in a product set. [Catalog Set Product Get](https://business-api.tiktok.com/portal/docs?id=1740571478441986)
    api_response = api_instance.catalog_set_product_get(bc_id, catalog_id, product_set_id, access_token, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_set_product_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bc_id** | **str**|  | [required]
 **catalog_id** | **str**|  | [required]
 **product_set_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
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

# **catalog_update**
> InlineResponse200 catalog_update(access_token, body=body)

Use this endpoint to update the name of a catalog. The catalog must be under a Business Center. [Catalog Update](https://business-api.tiktok.com/portal/docs?id=1740306544966657)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CatalogApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CatalogUpdateBody() # CatalogUpdateBody |  (optional)

try:
    # Use this endpoint to update the name of a catalog. The catalog must be under a Business Center. [Catalog Update](https://business-api.tiktok.com/portal/docs?id=1740306544966657)
    api_response = api_instance.catalog_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CatalogApi->catalog_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CatalogUpdateBody**](CatalogUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

