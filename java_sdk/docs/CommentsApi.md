# CommentsApi

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
> Response blockedwordCheck(advertiserId, blockedWords, accessToken)

Check if a list of words is blocked. [Blockedword Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029247961089)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> blockedWords = Arrays.asList("blockedWords_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.blockedwordCheck(advertiserId, blockedWords, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **blockedWords** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockedwordCreate"></a>
# **blockedwordCreate**
> Response blockedwordCreate(accessToken, body)

Add words to the block list. [Blockedword Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029218470913)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
BlockedwordCreateBody body = new BlockedwordCreateBody(); // BlockedwordCreateBody | 
try {
    Response result = apiInstance.blockedwordCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**BlockedwordCreateBody**](BlockedwordCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockedwordDelete"></a>
# **blockedwordDelete**
> Response blockedwordDelete(accessToken, body)

Delete one or more blocked words. [Blockedword Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029277346817)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
BlockedwordDeleteBody body = new BlockedwordDeleteBody(); // BlockedwordDeleteBody | 
try {
    Response result = apiInstance.blockedwordDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**BlockedwordDeleteBody**](BlockedwordDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockedwordList"></a>
# **blockedwordList**
> Response blockedwordList(advertiserId, accessToken, pageInfo)

Get the list of blocked words for an ad account. [Blockedword List](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029260837889)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PageInfo pageInfo = new PageInfo(); // PageInfo | 
try {
    Response result = apiInstance.blockedwordList(advertiserId, accessToken, pageInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **pageInfo** | [**PageInfo**](PageInfo.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockedwordTaskCheck"></a>
# **blockedwordTaskCheck**
> Response blockedwordTaskCheck(taskId, advertiserId, accessToken)

Check the status of the export task. [Blockedword Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029311687681)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String taskId = "taskId_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.blockedwordTaskCheck(taskId, advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordTaskCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockedwordTaskCreate"></a>
# **blockedwordTaskCreate**
> Response blockedwordTaskCreate(accessToken, body)

Create a task to export blocked words. [Blockedword Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029296119809)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
BlockedwordTaskCreateBody body = new BlockedwordTaskCreateBody(); // BlockedwordTaskCreateBody | 
try {
    Response result = apiInstance.blockedwordTaskCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordTaskCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**BlockedwordTaskCreateBody**](BlockedwordTaskCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockedwordUpdate"></a>
# **blockedwordUpdate**
> Response blockedwordUpdate(accessToken, body)

Replace a blocked word with another word. [Blockedword Task Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1739029234526209)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
BlockedwordUpdateBody body = new BlockedwordUpdateBody(); // BlockedwordUpdateBody | 
try {
    Response result = apiInstance.blockedwordUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#blockedwordUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**BlockedwordUpdateBody**](BlockedwordUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentDelete"></a>
# **commentDelete**
> Response commentDelete(accessToken, body)

Delete comments. [Comment Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957772267522)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CommentDeleteBody body = new CommentDeleteBody(); // CommentDeleteBody | 
try {
    Response result = apiInstance.commentDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CommentDeleteBody**](CommentDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentList"></a>
# **commentList**
> Response commentList(advertiserId, startTime, endTime, searchField, searchValue, accessToken, sortField, sortType, page, pageSize, commentType, commentStatus)

Get comments for your ads. [Comment List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086301876225)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String advertiserId = "advertiserId_example"; // String | 
String startTime = "startTime_example"; // String | 
String endTime = "endTime_example"; // String | 
String searchField = "searchField_example"; // String | 
String searchValue = "searchValue_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String sortField = "CREATE_TIME"; // String | 
String sortType = "DESC"; // String | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
List<String> commentType = Arrays.asList("commentType_example"); // List<String> | 
List<String> commentStatus = Arrays.asList("commentStatus_example"); // List<String> | 
try {
    Response result = apiInstance.commentList(advertiserId, startTime, endTime, searchField, searchValue, accessToken, sortField, sortType, page, pageSize, commentType, commentStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **startTime** | **String**|  |[required] 
 **endTime** | **String**|  |[required] 
 **searchField** | **String**|  |[required] 
 **searchValue** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **sortField** | **String**|  | [optional] [default to CREATE_TIME]
 **sortType** | **String**|  | [optional] [default to DESC]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10]
 **commentType** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **commentStatus** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentPost"></a>
# **commentPost**
> Response commentPost(accessToken, body)

Reply to comments. [Comment Post](https://business-api.tiktok.com/portal/docs?id&#x3D;1738957702411265)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CommentPostBody body = new CommentPostBody(); // CommentPostBody | 
try {
    Response result = apiInstance.commentPost(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CommentPostBody**](CommentPostBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentReference"></a>
# **commentReference**
> Response commentReference(advertiserId, commentId, commentType, accessToken, originalCommentId, app, page, pageSize)

Get related comments. [Comment Reference](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086824859650)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String advertiserId = "advertiserId_example"; // String | 
String commentId = "commentId_example"; // String | 
String commentType = "commentType_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String originalCommentId = "0"; // String | 
String app = "TIKTOK"; // String | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.commentReference(advertiserId, commentId, commentType, accessToken, originalCommentId, app, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentReference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **commentId** | **String**|  |[required] 
 **commentType** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **originalCommentId** | **String**|  | [optional] [default to 0]
 **app** | **String**|  | [optional] [default to TIKTOK]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10] [enum: 1, 100]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentStatusUpdate"></a>
# **commentStatusUpdate**
> Response commentStatusUpdate(accessToken, body)

Use this endpoint to change the status of a list of comments from public to hidden, or vice versa. [Comment Status Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738086844585985)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
StatusUpdateBody body = new StatusUpdateBody(); // StatusUpdateBody | 
try {
    Response result = apiInstance.commentStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**StatusUpdateBody**](StatusUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commentTaskCheck"></a>
# **commentTaskCheck**
> Response commentTaskCheck(taskId, advertiserId, accessToken, source)

Get comment export status. [Comment Task Check](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088242659330)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String taskId = "taskId_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String source = "BIDDING"; // String | 
try {
    Response result = apiInstance.commentTaskCheck(taskId, advertiserId, accessToken, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentTaskCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **source** | **String**|  | [optional] [default to BIDDING]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentTaskCreate"></a>
# **commentTaskCreate**
> Response commentTaskCreate(accessToken, body)

Create comment export task. [Comment Task Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738088144215041)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CommentsApi;


CommentsApi apiInstance = new CommentsApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CommentTaskCreateBody body = new CommentTaskCreateBody(); // CommentTaskCreateBody | 
try {
    Response result = apiInstance.commentTaskCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#commentTaskCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CommentTaskCreateBody**](CommentTaskCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

