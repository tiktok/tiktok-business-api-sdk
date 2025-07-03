# js_sdk.AutomatedRulesApi

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
> InlineResponse200 optimizerRuleBatchBind(Access_Token, opts)

Bind objects to rules. [Optimizer Rule Batch Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769164954626)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.RuleBatchBindBody() // RuleBatchBindBody | 
};
apiInstance.optimizerRuleBatchBind(Access_Token, opts, (error, data, response) => {
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
 **body** | [**RuleBatchBindBody**](RuleBatchBindBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimizerRuleCreate"></a>
# **optimizerRuleCreate**
> InlineResponse200 optimizerRuleCreate(Access_Token, opts)

Create an automated rule. [Optimizer Rule Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1738767670852610)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.OptimizerRuleCreateBody() // OptimizerRuleCreateBody | 
};
apiInstance.optimizerRuleCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**OptimizerRuleCreateBody**](OptimizerRuleCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="optimizerRuleGet"></a>
# **optimizerRuleGet**
> InlineResponse200 optimizerRuleGet(advertiser_id, rule_ids, Access_Token)

Get rules by rule IDs. [Optimizer Rule Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768750822466)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let advertiser_id = "advertiser_id_example"; // String | 
let rule_ids = ["rule_ids_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.optimizerRuleGet(advertiser_id, rule_ids, Access_Token, (error, data, response) => {
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
 **rule_ids** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleList"></a>
# **optimizerRuleList**
> InlineResponse200 optimizerRuleList(advertiser_id, Access_Token, opts)

Get rules based on the values of certain filters. [Optimizer Rule List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738768861976578)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringOptimizerRuleList(), // FilteringOptimizerRuleList | 
  'tzone': "UTC", // String | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.optimizerRuleList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **filtering** | [**FilteringOptimizerRuleList**](FilteringOptimizerRuleList.md)|  | [optional] 
 **tzone** | **String**|  | [optional] [default to UTC]
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleResultGet"></a>
# **optimizerRuleResultGet**
> InlineResponse200 optimizerRuleResultGet(advertiser_id, result_detail, Access_Token, opts)

Get result details. [Optimizer Rule Result Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769098314754)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let advertiser_id = "advertiser_id_example"; // String | 
let result_detail = [new js_sdk.ResultDetail()]; // [ResultDetail] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'lang': "EN" // String | 
};
apiInstance.optimizerRuleResultGet(advertiser_id, result_detail, Access_Token, opts, (error, data, response) => {
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
 **result_detail** | [**[ResultDetail]**](ResultDetail.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **lang** | **String**|  | [optional] [default to EN]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleResultList"></a>
# **optimizerRuleResultList**
> InlineResponse200 optimizerRuleResultList(advertiser_id, Access_Token, opts)

Get rule results. [Optimizer Rule Result List](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769076676609)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringOptimizerRuleResultList(), // FilteringOptimizerRuleResultList | 
  'lang': "EN", // String | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.optimizerRuleResultList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **filtering** | [**FilteringOptimizerRuleResultList**](FilteringOptimizerRuleResultList.md)|  | [optional] 
 **lang** | **String**|  | [optional] [default to EN]
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="optimizerRuleUpdate"></a>
# **optimizerRuleUpdate**
> InlineResponse200 optimizerRuleUpdate(Access_Token, opts)

Update an automated rule. [Optimizer Rule Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1738769123170306)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AutomatedRulesApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.OptimizerRuleUpdateBody() // OptimizerRuleUpdateBody | 
};
apiInstance.optimizerRuleUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**OptimizerRuleUpdateBody**](OptimizerRuleUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

