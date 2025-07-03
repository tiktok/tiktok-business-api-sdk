"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.AutomatedRulesApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**optimizer_rule_batch_bind**](AutomatedRulesApi.md#optimizer_rule_batch_bind) | **POST** /open_api/v1.3/optimizer/rule/batch_bind/ | Bind objects to rules. [Optimizer Rule Batch Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769164954626)
[**optimizer_rule_create**](AutomatedRulesApi.md#optimizer_rule_create) | **POST** /open_api/v1.3/optimizer/rule/create/ | Create an automated rule. [Optimizer Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738767670852610)
[**optimizer_rule_get**](AutomatedRulesApi.md#optimizer_rule_get) | **GET** /open_api/v1.3/optimizer/rule/get/ | Get rules by rule IDs. [Optimizer Rule Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768750822466)
[**optimizer_rule_list**](AutomatedRulesApi.md#optimizer_rule_list) | **GET** /open_api/v1.3/optimizer/rule/list/ | Get rules based on the values of certain filters. [Optimizer Rule List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768861976578)
[**optimizer_rule_result_get**](AutomatedRulesApi.md#optimizer_rule_result_get) | **GET** /open_api/v1.3/optimizer/rule/result/get/ | Get result details. [Optimizer Rule Result Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769098314754)
[**optimizer_rule_result_list**](AutomatedRulesApi.md#optimizer_rule_result_list) | **GET** /open_api/v1.3/optimizer/rule/result/list/ | Get rule results. [Optimizer Rule Result List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769076676609)
[**optimizer_rule_update**](AutomatedRulesApi.md#optimizer_rule_update) | **POST** /open_api/v1.3/optimizer/rule/update/ | Update an automated rule. [Optimizer Rule Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769123170306)

# **optimizer_rule_batch_bind**
> InlineResponse200 optimizer_rule_batch_bind(access_token, body=body)

Bind objects to rules. [Optimizer Rule Batch Bind](https://business-api.tiktok.com/portal/docs?id=1738769164954626)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.RuleBatchBindBody() # RuleBatchBindBody |  (optional)

try:
    # Bind objects to rules. [Optimizer Rule Batch Bind](https://business-api.tiktok.com/portal/docs?id=1738769164954626)
    api_response = api_instance.optimizer_rule_batch_bind(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_batch_bind: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**RuleBatchBindBody**](RuleBatchBindBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **optimizer_rule_create**
> InlineResponse200 optimizer_rule_create(access_token, body=body)

Create an automated rule. [Optimizer Rule Create](https://business-api.tiktok.com/portal/docs?id=1738767670852610)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.OptimizerRuleCreateBody() # OptimizerRuleCreateBody |  (optional)

try:
    # Create an automated rule. [Optimizer Rule Create](https://business-api.tiktok.com/portal/docs?id=1738767670852610)
    api_response = api_instance.optimizer_rule_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**OptimizerRuleCreateBody**](OptimizerRuleCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **optimizer_rule_get**
> InlineResponse200 optimizer_rule_get(advertiser_id, rule_ids, access_token)

Get rules by rule IDs. [Optimizer Rule Get](https://business-api.tiktok.com/portal/docs?id=1738768750822466)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
advertiser_id = 'advertiser_id_example' # str | 
rule_ids = ['rule_ids_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Get rules by rule IDs. [Optimizer Rule Get](https://business-api.tiktok.com/portal/docs?id=1738768750822466)
    api_response = api_instance.optimizer_rule_get(advertiser_id, rule_ids, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **rule_ids** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **optimizer_rule_list**
> InlineResponse200 optimizer_rule_list(advertiser_id, access_token, filtering=filtering, tzone=tzone, page=page, page_size=page_size)

Get rules based on the values of certain filters. [Optimizer Rule List](https://business-api.tiktok.com/portal/docs?id=1738768861976578)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringOptimizerRuleList() # FilteringOptimizerRuleList |  (optional)
tzone = 'UTC' # str |  (optional) (default to UTC)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get rules based on the values of certain filters. [Optimizer Rule List](https://business-api.tiktok.com/portal/docs?id=1738768861976578)
    api_response = api_instance.optimizer_rule_list(advertiser_id, access_token, filtering=filtering, tzone=tzone, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringOptimizerRuleList**](FilteringOptimizerRuleList.md)|  | [optional] 
 **tzone** | **str**|  | [optional] [default to UTC]
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

# **optimizer_rule_result_get**
> InlineResponse200 optimizer_rule_result_get(advertiser_id, result_detail, access_token, lang=lang)

Get result details. [Optimizer Rule Result Get](https://business-api.tiktok.com/portal/docs?id=1738769098314754)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
advertiser_id = 'advertiser_id_example' # str | 
result_detail = [business_api_client.ResultDetail()] # list[ResultDetail] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
lang = 'EN' # str |  (optional) (default to EN)

try:
    # Get result details. [Optimizer Rule Result Get](https://business-api.tiktok.com/portal/docs?id=1738769098314754)
    api_response = api_instance.optimizer_rule_result_get(advertiser_id, result_detail, access_token, lang=lang)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_result_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **result_detail** | [**list[ResultDetail]**](ResultDetail.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **lang** | **str**|  | [optional] [default to EN]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **optimizer_rule_result_list**
> InlineResponse200 optimizer_rule_result_list(advertiser_id, access_token, filtering=filtering, lang=lang, page=page, page_size=page_size)

Get rule results. [Optimizer Rule Result List](https://business-api.tiktok.com/portal/docs?id=1738769076676609)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
filtering = business_api_client.FilteringOptimizerRuleResultList() # FilteringOptimizerRuleResultList |  (optional)
lang = 'EN' # str |  (optional) (default to EN)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get rule results. [Optimizer Rule Result List](https://business-api.tiktok.com/portal/docs?id=1738769076676609)
    api_response = api_instance.optimizer_rule_result_list(advertiser_id, access_token, filtering=filtering, lang=lang, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_result_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **filtering** | [**FilteringOptimizerRuleResultList**](FilteringOptimizerRuleResultList.md)|  | [optional] 
 **lang** | **str**|  | [optional] [default to EN]
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

# **optimizer_rule_update**
> InlineResponse200 optimizer_rule_update(access_token, body=body)

Update an automated rule. [Optimizer Rule Update](https://business-api.tiktok.com/portal/docs?id=1738769123170306)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.AutomatedRulesApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.OptimizerRuleUpdateBody() # OptimizerRuleUpdateBody |  (optional)

try:
    # Update an automated rule. [Optimizer Rule Update](https://business-api.tiktok.com/portal/docs?id=1738769123170306)
    api_response = api_instance.optimizer_rule_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AutomatedRulesApi->optimizer_rule_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**OptimizerRuleUpdateBody**](OptimizerRuleUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

