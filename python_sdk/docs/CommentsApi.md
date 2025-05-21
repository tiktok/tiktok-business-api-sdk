"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.CommentsApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockedword_check**](CommentsApi.md#blockedword_check) | **GET** /open_api/v1.3/blockedword/check/ | Check if a list of words is blocked. [Blockedword Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029247961089)
[**blockedword_create**](CommentsApi.md#blockedword_create) | **POST** /open_api/v1.3/blockedword/create/ | Add words to the block list. [Blockedword Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029218470913)
[**blockedword_delete**](CommentsApi.md#blockedword_delete) | **POST** /open_api/v1.3/blockedword/delete/ | Delete one or more blocked words. [Blockedword Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029277346817)
[**blockedword_list**](CommentsApi.md#blockedword_list) | **GET** /open_api/v1.3/blockedword/list/ | Get the list of blocked words for an ad account. [Blockedword List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029260837889)
[**blockedword_task_check**](CommentsApi.md#blockedword_task_check) | **GET** /open_api/v1.3/blockedword/task/check/ | Check the status of the export task. [Blockedword Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029311687681)
[**blockedword_task_create**](CommentsApi.md#blockedword_task_create) | **POST** /open_api/v1.3/blockedword/task/create/ | Create a task to export blocked words. [Blockedword Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029296119809)
[**blockedword_update**](CommentsApi.md#blockedword_update) | **POST** /open_api/v1.3/blockedword/update/ | Replace a blocked word with another word. [Blockedword Task Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029234526209)
[**comment_delete**](CommentsApi.md#comment_delete) | **POST** /open_api/v1.3/comment/delete/ | Delete comments. [Comment Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957772267522)
[**comment_list**](CommentsApi.md#comment_list) | **GET** /open_api/v1.3/comment/list/ | Get comments for your ads. [Comment List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086301876225)
[**comment_post**](CommentsApi.md#comment_post) | **POST** /open_api/v1.3/comment/post/ | Reply to comments. [Comment Post](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957702411265)
[**comment_reference**](CommentsApi.md#comment_reference) | **GET** /open_api/v1.3/comment/reference/ | Get related comments. [Comment Reference](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086824859650)
[**comment_status_update**](CommentsApi.md#comment_status_update) | **POST** /open_api/v1.3/comment/status/update/ | Use this endpoint to change the status of a list of comments from public to hidden, or vice versa. [Comment Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086844585985)
[**comment_task_check**](CommentsApi.md#comment_task_check) | **GET** /open_api/v1.3/comment/task/check/ | Get comment export status. [Comment Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088242659330)
[**comment_task_create**](CommentsApi.md#comment_task_create) | **POST** /open_api/v1.3/comment/task/create/ | Create comment export task. [Comment Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088144215041)

# **blockedword_check**
> InlineResponse200 blockedword_check(advertiser_id, blocked_words, access_token)

Check if a list of words is blocked. [Blockedword Check](https://business-api.tiktok.com/portal/docs?id=1739029247961089)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
advertiser_id = 'advertiser_id_example' # str | 
blocked_words = ['blocked_words_example'] # list[str] | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Check if a list of words is blocked. [Blockedword Check](https://business-api.tiktok.com/portal/docs?id=1739029247961089)
    api_response = api_instance.blockedword_check(advertiser_id, blocked_words, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **blocked_words** | [**list[str]**](str.md)|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **blockedword_create**
> InlineResponse200 blockedword_create(access_token, body=body)

Add words to the block list. [Blockedword Create](https://business-api.tiktok.com/portal/docs?id=1739029218470913)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BlockedwordCreateBody() # BlockedwordCreateBody |  (optional)

try:
    # Add words to the block list. [Blockedword Create](https://business-api.tiktok.com/portal/docs?id=1739029218470913)
    api_response = api_instance.blockedword_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BlockedwordCreateBody**](BlockedwordCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **blockedword_delete**
> InlineResponse200 blockedword_delete(access_token, body=body)

Delete one or more blocked words. [Blockedword Delete](https://business-api.tiktok.com/portal/docs?id=1739029277346817)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BlockedwordDeleteBody() # BlockedwordDeleteBody |  (optional)

try:
    # Delete one or more blocked words. [Blockedword Delete](https://business-api.tiktok.com/portal/docs?id=1739029277346817)
    api_response = api_instance.blockedword_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BlockedwordDeleteBody**](BlockedwordDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **blockedword_list**
> InlineResponse200 blockedword_list(advertiser_id, access_token, page_info=page_info)

Get the list of blocked words for an ad account. [Blockedword List](https://business-api.tiktok.com/portal/docs?id=1739029260837889)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
page_info = business_api_client.PageInfo() # PageInfo |  (optional)

try:
    # Get the list of blocked words for an ad account. [Blockedword List](https://business-api.tiktok.com/portal/docs?id=1739029260837889)
    api_response = api_instance.blockedword_list(advertiser_id, access_token, page_info=page_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **page_info** | [**PageInfo**](PageInfo.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **blockedword_task_check**
> InlineResponse200 blockedword_task_check(task_id, advertiser_id, access_token)

Check the status of the export task. [Blockedword Task Check](https://business-api.tiktok.com/portal/docs?id=1739029311687681)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
task_id = 'task_id_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

try:
    # Check the status of the export task. [Blockedword Task Check](https://business-api.tiktok.com/portal/docs?id=1739029311687681)
    api_response = api_instance.blockedword_task_check(task_id, advertiser_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_task_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **str**|  | [required]
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

# **blockedword_task_create**
> InlineResponse200 blockedword_task_create(access_token, body=body)

Create a task to export blocked words. [Blockedword Task Create](https://business-api.tiktok.com/portal/docs?id=1739029296119809)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BlockedwordTaskCreateBody() # BlockedwordTaskCreateBody |  (optional)

try:
    # Create a task to export blocked words. [Blockedword Task Create](https://business-api.tiktok.com/portal/docs?id=1739029296119809)
    api_response = api_instance.blockedword_task_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_task_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BlockedwordTaskCreateBody**](BlockedwordTaskCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **blockedword_update**
> InlineResponse200 blockedword_update(access_token, body=body)

Replace a blocked word with another word. [Blockedword Task Update](https://business-api.tiktok.com/portal/docs?id=1739029234526209)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.BlockedwordUpdateBody() # BlockedwordUpdateBody |  (optional)

try:
    # Replace a blocked word with another word. [Blockedword Task Update](https://business-api.tiktok.com/portal/docs?id=1739029234526209)
    api_response = api_instance.blockedword_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->blockedword_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**BlockedwordUpdateBody**](BlockedwordUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **comment_delete**
> InlineResponse200 comment_delete(access_token, body=body)

Delete comments. [Comment Delete](https://business-api.tiktok.com/portal/docs?id=1738957772267522)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CommentDeleteBody() # CommentDeleteBody |  (optional)

try:
    # Delete comments. [Comment Delete](https://business-api.tiktok.com/portal/docs?id=1738957772267522)
    api_response = api_instance.comment_delete(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CommentDeleteBody**](CommentDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **comment_list**
> InlineResponse200 comment_list(advertiser_id, start_time, end_time, search_field, search_value, access_token, sort_field=sort_field, sort_type=sort_type, page=page, page_size=page_size, comment_type=comment_type, comment_status=comment_status)

Get comments for your ads. [Comment List](https://business-api.tiktok.com/portal/docs?id=1738086301876225)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
advertiser_id = 'advertiser_id_example' # str | 
start_time = 'start_time_example' # str | 
end_time = 'end_time_example' # str | 
search_field = 'search_field_example' # str | 
search_value = 'search_value_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
sort_field = 'CREATE_TIME' # str |  (optional) (default to CREATE_TIME)
sort_type = 'DESC' # str |  (optional) (default to DESC)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)
comment_type = ['comment_type_example'] # list[str] |  (optional)
comment_status = ['comment_status_example'] # list[str] |  (optional)

try:
    # Get comments for your ads. [Comment List](https://business-api.tiktok.com/portal/docs?id=1738086301876225)
    api_response = api_instance.comment_list(advertiser_id, start_time, end_time, search_field, search_value, access_token, sort_field=sort_field, sort_type=sort_type, page=page, page_size=page_size, comment_type=comment_type, comment_status=comment_status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **start_time** | **str**|  | [required]
 **end_time** | **str**|  | [required]
 **search_field** | **str**|  | [required]
 **search_value** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **sort_field** | **str**|  | [optional] [default to CREATE_TIME]
 **sort_type** | **str**|  | [optional] [default to DESC]
 **page** | **int**|  | [optional] [default to 1]
 **page_size** | **int**|  | [optional] [default to 10]
 **comment_type** | [**list[str]**](str.md)|  | [optional] 
 **comment_status** | [**list[str]**](str.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **comment_post**
> InlineResponse200 comment_post(access_token, body=body)

Reply to comments. [Comment Post](https://business-api.tiktok.com/portal/docs?id=1738957702411265)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CommentPostBody() # CommentPostBody |  (optional)

try:
    # Reply to comments. [Comment Post](https://business-api.tiktok.com/portal/docs?id=1738957702411265)
    api_response = api_instance.comment_post(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CommentPostBody**](CommentPostBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **comment_reference**
> InlineResponse200 comment_reference(advertiser_id, comment_id, comment_type, access_token, original_comment_id=original_comment_id, app=app, page=page, page_size=page_size)

Get related comments. [Comment Reference](https://business-api.tiktok.com/portal/docs?id=1738086824859650)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
advertiser_id = 'advertiser_id_example' # str | 
comment_id = 'comment_id_example' # str | 
comment_type = 'comment_type_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
original_comment_id = '0' # str |  (optional) (default to 0)
app = 'TIKTOK' # str |  (optional) (default to TIKTOK)
page = 1 # int |  (optional) (default to 1)
page_size = 10 # int |  (optional) (default to 10)

try:
    # Get related comments. [Comment Reference](https://business-api.tiktok.com/portal/docs?id=1738086824859650)
    api_response = api_instance.comment_reference(advertiser_id, comment_id, comment_type, access_token, original_comment_id=original_comment_id, app=app, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_reference: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**|  | [required]
 **comment_id** | **str**|  | [required]
 **comment_type** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **original_comment_id** | **str**|  | [optional] [default to 0]
 **app** | **str**|  | [optional] [default to TIKTOK]
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

# **comment_status_update**
> InlineResponse200 comment_status_update(access_token, body=body)

Use this endpoint to change the status of a list of comments from public to hidden, or vice versa. [Comment Status Update](https://business-api.tiktok.com/portal/docs?id=1738086844585985)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.StatusUpdateBody() # StatusUpdateBody |  (optional)

try:
    # Use this endpoint to change the status of a list of comments from public to hidden, or vice versa. [Comment Status Update](https://business-api.tiktok.com/portal/docs?id=1738086844585985)
    api_response = api_instance.comment_status_update(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_status_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**StatusUpdateBody**](StatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **comment_task_check**
> InlineResponse200 comment_task_check(task_id, advertiser_id, access_token, source=source)

Get comment export status. [Comment Task Check](https://business-api.tiktok.com/portal/docs?id=1738088242659330)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
task_id = 'task_id_example' # str | 
advertiser_id = 'advertiser_id_example' # str | 
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
source = 'BIDDING' # str |  (optional) (default to BIDDING)

try:
    # Get comment export status. [Comment Task Check](https://business-api.tiktok.com/portal/docs?id=1738088242659330)
    api_response = api_instance.comment_task_check(task_id, advertiser_id, access_token, source=source)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_task_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **str**|  | [required]
 **advertiser_id** | **str**|  | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **source** | **str**|  | [optional] [default to BIDDING]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **comment_task_create**
> InlineResponse200 comment_task_create(access_token, body=body)

Create comment export task. [Comment Task Create](https://business-api.tiktok.com/portal/docs?id=1738088144215041)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.CommentsApi()
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
body = business_api_client.CommentTaskCreateBody() # CommentTaskCreateBody |  (optional)

try:
    # Create comment export task. [Comment Task Create](https://business-api.tiktok.com/portal/docs?id=1738088144215041)
    api_response = api_instance.comment_task_create(access_token, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->comment_task_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **body** | [**CommentTaskCreateBody**](CommentTaskCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

