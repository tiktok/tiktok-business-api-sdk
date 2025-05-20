# js_sdk.CommentsApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockedwordCheck**](CommentsApi.md#blockedwordCheck) | **GET** /open_api/v1.3/blockedword/check/ | Check if a list of words is blocked. [Blockedword Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029247961089)
[**blockedwordCreate**](CommentsApi.md#blockedwordCreate) | **POST** /open_api/v1.3/blockedword/create/ | Add words to the block list. [Blockedword Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029218470913)
[**blockedwordDelete**](CommentsApi.md#blockedwordDelete) | **POST** /open_api/v1.3/blockedword/delete/ | Delete one or more blocked words. [Blockedword Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029277346817)
[**blockedwordList**](CommentsApi.md#blockedwordList) | **GET** /open_api/v1.3/blockedword/list/ | Get the list of blocked words for an ad account. [Blockedword List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029260837889)
[**blockedwordTaskCheck**](CommentsApi.md#blockedwordTaskCheck) | **GET** /open_api/v1.3/blockedword/task/check/ | Check the status of the export task. [Blockedword Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029311687681)
[**blockedwordTaskCreate**](CommentsApi.md#blockedwordTaskCreate) | **POST** /open_api/v1.3/blockedword/task/create/ | Create a task to export blocked words. [Blockedword Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029296119809)
[**blockedwordUpdate**](CommentsApi.md#blockedwordUpdate) | **POST** /open_api/v1.3/blockedword/update/ | Replace a blocked word with another word. [Blockedword Task Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029234526209)
[**commentDelete**](CommentsApi.md#commentDelete) | **POST** /open_api/v1.3/comment/delete/ | Delete comments. [Comment Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957772267522)
[**commentList**](CommentsApi.md#commentList) | **GET** /open_api/v1.3/comment/list/ | Get comments for your ads. [Comment List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086301876225)
[**commentPost**](CommentsApi.md#commentPost) | **POST** /open_api/v1.3/comment/post/ | Reply to comments. [Comment Post](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957702411265)
[**commentReference**](CommentsApi.md#commentReference) | **GET** /open_api/v1.3/comment/reference/ | Get related comments. [Comment Reference](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086824859650)
[**commentStatusUpdate**](CommentsApi.md#commentStatusUpdate) | **POST** /open_api/v1.3/comment/status/update/ | Use this endpoint to change the status of a list of comments from public to hidden, or vice versa. [Comment Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086844585985)
[**commentTaskCheck**](CommentsApi.md#commentTaskCheck) | **GET** /open_api/v1.3/comment/task/check/ | Get comment export status. [Comment Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088242659330)
[**commentTaskCreate**](CommentsApi.md#commentTaskCreate) | **POST** /open_api/v1.3/comment/task/create/ | Create comment export task. [Comment Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088144215041)

<a name="blockedwordCheck"></a>
# **blockedwordCheck**
> InlineResponse200 blockedwordCheck(advertiser_id, blocked_words, Access_Token)

Check if a list of words is blocked. [Blockedword Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029247961089)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let advertiser_id = "advertiser_id_example"; // String | 
let blocked_words = ["blocked_words_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.blockedwordCheck(advertiser_id, blocked_words, Access_Token, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**|  |[required]  
 **blocked_words** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockedwordCreate"></a>
# **blockedwordCreate**
> InlineResponse200 blockedwordCreate(Access_Token, opts)

Add words to the block list. [Blockedword Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029218470913)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.BlockedwordCreateBody() // BlockedwordCreateBody | 
};
apiInstance.blockedwordCreate(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**BlockedwordCreateBody**](BlockedwordCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockedwordDelete"></a>
# **blockedwordDelete**
> InlineResponse200 blockedwordDelete(Access_Token, opts)

Delete one or more blocked words. [Blockedword Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029277346817)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.BlockedwordDeleteBody() // BlockedwordDeleteBody | 
};
apiInstance.blockedwordDelete(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**BlockedwordDeleteBody**](BlockedwordDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockedwordList"></a>
# **blockedwordList**
> InlineResponse200 blockedwordList(advertiser_id, Access_Token, opts)

Get the list of blocked words for an ad account. [Blockedword List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029260837889)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'page_info': new js_sdk.PageInfo() // PageInfo | 
};
apiInstance.blockedwordList(advertiser_id, Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **page_info** | [**PageInfo**](PageInfo.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockedwordTaskCheck"></a>
# **blockedwordTaskCheck**
> InlineResponse200 blockedwordTaskCheck(task_id, advertiser_id, Access_Token)

Check the status of the export task. [Blockedword Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029311687681)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let task_id = "task_id_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.blockedwordTaskCheck(task_id, advertiser_id, Access_Token, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockedwordTaskCreate"></a>
# **blockedwordTaskCreate**
> InlineResponse200 blockedwordTaskCreate(Access_Token, opts)

Create a task to export blocked words. [Blockedword Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029296119809)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.BlockedwordTaskCreateBody() // BlockedwordTaskCreateBody | 
};
apiInstance.blockedwordTaskCreate(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**BlockedwordTaskCreateBody**](BlockedwordTaskCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockedwordUpdate"></a>
# **blockedwordUpdate**
> InlineResponse200 blockedwordUpdate(Access_Token, opts)

Replace a blocked word with another word. [Blockedword Task Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029234526209)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.BlockedwordUpdateBody() // BlockedwordUpdateBody | 
};
apiInstance.blockedwordUpdate(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**BlockedwordUpdateBody**](BlockedwordUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentDelete"></a>
# **commentDelete**
> InlineResponse200 commentDelete(Access_Token, opts)

Delete comments. [Comment Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957772267522)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CommentDeleteBody() // CommentDeleteBody | 
};
apiInstance.commentDelete(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**CommentDeleteBody**](CommentDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentList"></a>
# **commentList**
> InlineResponse200 commentList(advertiser_id, start_time, end_time, search_field, search_value, Access_Token, opts)

Get comments for your ads. [Comment List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086301876225)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let advertiser_id = "advertiser_id_example"; // String | 
let start_time = "start_time_example"; // String | 
let end_time = "end_time_example"; // String | 
let search_field = "search_field_example"; // String | 
let search_value = "search_value_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'sort_field': "CREATE_TIME", // String | 
  'sort_type': "DESC", // String | 
  'page': 1, // Number | 
  'page_size': 10, // Number | 
  'comment_type': ["comment_type_example"], // [String] | 
  'comment_status': ["comment_status_example"] // [String] | 
};
apiInstance.commentList(advertiser_id, start_time, end_time, search_field, search_value, Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**|  |[required]  
 **start_time** | **String**|  |[required]  
 **end_time** | **String**|  |[required]  
 **search_field** | **String**|  |[required]  
 **search_value** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **sort_field** | **String**|  | [optional] [default to CREATE_TIME]
 **sort_type** | **String**|  | [optional] [default to DESC]
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]
 **comment_type** | [**[String]**](String.md)|  | [optional] 
 **comment_status** | [**[String]**](String.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentPost"></a>
# **commentPost**
> InlineResponse200 commentPost(Access_Token, opts)

Reply to comments. [Comment Post](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957702411265)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CommentPostBody() // CommentPostBody | 
};
apiInstance.commentPost(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**CommentPostBody**](CommentPostBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentReference"></a>
# **commentReference**
> InlineResponse200 commentReference(advertiser_id, comment_id, comment_type, Access_Token, opts)

Get related comments. [Comment Reference](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086824859650)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let advertiser_id = "advertiser_id_example"; // String | 
let comment_id = "comment_id_example"; // String | 
let comment_type = "comment_type_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'original_comment_id': "0", // String | 
  'app': "TIKTOK", // String | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.commentReference(advertiser_id, comment_id, comment_type, Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **String**|  |[required]  
 **comment_id** | **String**|  |[required]  
 **comment_type** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **original_comment_id** | **String**|  | [optional] [default to 0]
 **app** | **String**|  | [optional] [default to TIKTOK]
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentStatusUpdate"></a>
# **commentStatusUpdate**
> InlineResponse200 commentStatusUpdate(Access_Token, opts)

Use this endpoint to change the status of a list of comments from public to hidden, or vice versa. [Comment Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086844585985)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.StatusUpdateBody() // StatusUpdateBody | 
};
apiInstance.commentStatusUpdate(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**StatusUpdateBody**](StatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentTaskCheck"></a>
# **commentTaskCheck**
> InlineResponse200 commentTaskCheck(task_id, advertiser_id, Access_Token, opts)

Get comment export status. [Comment Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088242659330)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let task_id = "task_id_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'source': "BIDDING" // String | 
};
apiInstance.commentTaskCheck(task_id, advertiser_id, Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **source** | **String**|  | [optional] [default to BIDDING]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentTaskCreate"></a>
# **commentTaskCreate**
> InlineResponse200 commentTaskCreate(Access_Token, opts)

Create comment export task. [Comment Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088144215041)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CommentsApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CommentTaskCreateBody() // CommentTaskCreateBody | 
};
apiInstance.commentTaskCreate(Access_Token, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **body** | [**CommentTaskCreateBody**](CommentTaskCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

