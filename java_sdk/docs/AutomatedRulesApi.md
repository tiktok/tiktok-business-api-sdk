# AutomatedRulesApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**optimizerRuleBatchBind**](AutomatedRulesApi.md#optimizerRuleBatchBind) | **POST** /open_api/v1.3/optimizer/rule/batch_bind/ | Bind objects to rules. [Optimizer Rule Batch Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769164954626)
[**optimizerRuleCreate**](AutomatedRulesApi.md#optimizerRuleCreate) | **POST** /open_api/v1.3/optimizer/rule/create/ | Create an automated rule. [Optimizer Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738767670852610)
[**optimizerRuleGet**](AutomatedRulesApi.md#optimizerRuleGet) | **GET** /open_api/v1.3/optimizer/rule/get/ | Get rules by rule IDs. [Optimizer Rule Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768750822466)
[**optimizerRuleList**](AutomatedRulesApi.md#optimizerRuleList) | **GET** /open_api/v1.3/optimizer/rule/list/ | Get rules based on the values of certain filters. [Optimizer Rule List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768861976578)
[**optimizerRuleResultGet**](AutomatedRulesApi.md#optimizerRuleResultGet) | **GET** /open_api/v1.3/optimizer/rule/result/get/ | Get result details. [Optimizer Rule Result Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769098314754)
[**optimizerRuleResultList**](AutomatedRulesApi.md#optimizerRuleResultList) | **GET** /open_api/v1.3/optimizer/rule/result/list/ | Get rule results. [Optimizer Rule Result List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769076676609)
[**optimizerRuleUpdate**](AutomatedRulesApi.md#optimizerRuleUpdate) | **POST** /open_api/v1.3/optimizer/rule/update/ | Update an automated rule. [Optimizer Rule Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769123170306)

<a name="optimizerRuleBatchBind"></a>
# **optimizerRuleBatchBind**
> Response optimizerRuleBatchBind(accessToken, body)

Bind objects to rules. [Optimizer Rule Batch Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769164954626)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
RuleBatchBindBody body = new RuleBatchBindBody(); // RuleBatchBindBody | 
try {
    Response result = apiInstance.optimizerRuleBatchBind(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleBatchBind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**RuleBatchBindBody**](RuleBatchBindBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimizerRuleCreate"></a>
# **optimizerRuleCreate**
> Response optimizerRuleCreate(accessToken, body)

Create an automated rule. [Optimizer Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738767670852610)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
OptimizerRuleCreateBody body = new OptimizerRuleCreateBody(); // OptimizerRuleCreateBody | 
try {
    Response result = apiInstance.optimizerRuleCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**OptimizerRuleCreateBody**](OptimizerRuleCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimizerRuleGet"></a>
# **optimizerRuleGet**
> Response optimizerRuleGet(advertiserId, ruleIds, accessToken)

Get rules by rule IDs. [Optimizer Rule Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768750822466)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> ruleIds = Arrays.asList("ruleIds_example"); // List<String> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.optimizerRuleGet(advertiserId, ruleIds, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **ruleIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleList"></a>
# **optimizerRuleList**
> Response optimizerRuleList(advertiserId, accessToken, filtering, tzone, page, pageSize)

Get rules based on the values of certain filters. [Optimizer Rule List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768861976578)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringOptimizerRuleList filtering = new FilteringOptimizerRuleList(); // FilteringOptimizerRuleList | 
String tzone = "UTC"; // String | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.optimizerRuleList(advertiserId, accessToken, filtering, tzone, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringOptimizerRuleList**](FilteringOptimizerRuleList.md)|  | [optional]
 **tzone** | **String**|  | [optional] [default to UTC]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleResultGet"></a>
# **optimizerRuleResultGet**
> Response optimizerRuleResultGet(advertiserId, resultDetail, accessToken, lang)

Get result details. [Optimizer Rule Result Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769098314754)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String advertiserId = "advertiserId_example"; // String | 
List<ResultDetail> resultDetail = Arrays.asList(new ResultDetail()); // List<ResultDetail> | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String lang = "EN"; // String | 
try {
    Response result = apiInstance.optimizerRuleResultGet(advertiserId, resultDetail, accessToken, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleResultGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **resultDetail** | [**List&lt;ResultDetail&gt;**](ResultDetail.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **lang** | **String**|  | [optional] [default to EN]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleResultList"></a>
# **optimizerRuleResultList**
> Response optimizerRuleResultList(advertiserId, accessToken, filtering, lang, page, pageSize)

Get rule results. [Optimizer Rule Result List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769076676609)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringOptimizerRuleResultList filtering = new FilteringOptimizerRuleResultList(); // FilteringOptimizerRuleResultList | 
String lang = "EN"; // String | 
Long page = 1L; // Long | 
Long pageSize = 10L; // Long | 
try {
    Response result = apiInstance.optimizerRuleResultList(advertiserId, accessToken, filtering, lang, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleResultList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringOptimizerRuleResultList**](FilteringOptimizerRuleResultList.md)|  | [optional]
 **lang** | **String**|  | [optional] [default to EN]
 **page** | **Long**|  | [optional] [default to 1]
 **pageSize** | **Long**|  | [optional] [default to 10]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleUpdate"></a>
# **optimizerRuleUpdate**
> Response optimizerRuleUpdate(accessToken, body)

Update an automated rule. [Optimizer Rule Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769123170306)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AutomatedRulesApi;


AutomatedRulesApi apiInstance = new AutomatedRulesApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
OptimizerRuleUpdateBody body = new OptimizerRuleUpdateBody(); // OptimizerRuleUpdateBody | 
try {
    Response result = apiInstance.optimizerRuleUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutomatedRulesApi#optimizerRuleUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**OptimizerRuleUpdateBody**](OptimizerRuleUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

