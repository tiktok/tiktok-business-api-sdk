# js_sdk.APPManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appCreate**](APPManagementApi.md#appCreate) | **POST** /open_api/v1.3/app/create/ | Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859280958466)
[**appInfo**](APPManagementApi.md#appInfo) | **GET** /open_api/v1.3/app/info/ | Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859272887297)
[**appList**](APPManagementApi.md#appList) | **GET** /open_api/v1.3/app/list/ | Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859313270786)
[**appOptimizationEvent**](APPManagementApi.md#appOptimizationEvent) | **GET** /open_api/v1.3/app/optimization_event/ | Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859338750977)
[**appOptimizationEventRetargeting**](APPManagementApi.md#appOptimizationEventRetargeting) | **GET** /open_api/v1.3/app/optimization_event/retargeting/ | Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859371033601)
[**appUpdate**](APPManagementApi.md#appUpdate) | **POST** /open_api/v1.3/app/update/ | Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859300069378)

<a name="appCreate"></a>
# **appCreate**
> InlineResponse200 appCreate(Access_Token, opts)

Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859280958466)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.APPManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AppCreateBody() // AppCreateBody | 
};
apiInstance.appCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AppCreateBody**](AppCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appInfo"></a>
# **appInfo**
> InlineResponse200 appInfo(advertiser_id, app_id, Access_Token)

Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859272887297)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.APPManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let app_id = "app_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.appInfo(advertiser_id, app_id, Access_Token, (error, data, response) => {
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
 **app_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appList"></a>
# **appList**
> InlineResponse200 appList(advertiser_id, Access_Token, opts)

Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859313270786)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.APPManagementApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID.
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'app_platform_ids': ["app_platform_ids_example"] // [String] | List of app platform ID for filter purpose.
};
apiInstance.appList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **advertiser_id** | **String**| Advertiser ID. |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **app_platform_ids** | [**[String]**](String.md)| List of app platform ID for filter purpose. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appOptimizationEvent"></a>
# **appOptimizationEvent**
> InlineResponse200 appOptimizationEvent(app_id, advertiser_id, optimization_goal, Access_Token, opts)

Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859338750977)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.APPManagementApi();
let app_id = "app_id_example"; // String | Your App ID, obtained after successfully creating your app.
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let optimization_goal = "optimization_goal_example"; // String | Optimization goal. For enum values, see Enumeration-Optimization Goal for more
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'placement': ["placement_example"], // [String] | The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don't select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they've been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type = PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported.
  'placement_type': "placement_type_example", // String | 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。
  'objective': "objective_example", // String | Advertising Objective. For enum values, see Enumeration-Advertising Objective
  'available_only': true, // Boolean | Whether to return only available conversion events. The default value: True (only return available conversion events)
  'is_skan': true, // Boolean | Whether the app is using Skan features.
  'app_promotion_type': "app_promotion_type_example" // String | App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used.
};
apiInstance.appOptimizationEvent(app_id, advertiser_id, optimization_goal, Access_Token, opts, (error, data, response) => {
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
 **app_id** | **String**| Your App ID, obtained after successfully creating your app. |[required]  
 **advertiser_id** | **String**| Advertiser ID |[required]  
 **optimization_goal** | **String**| Optimization goal. For enum values, see Enumeration-Optimization Goal for more |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **placement** | [**[String]**](String.md)| The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don&#x27;t select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they&#x27;ve been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported. | [optional] 
 **placement_type** | **String**| 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。 | [optional] 
 **objective** | **String**| Advertising Objective. For enum values, see Enumeration-Advertising Objective | [optional] 
 **available_only** | **Boolean**| Whether to return only available conversion events. The default value: True (only return available conversion events) | [optional] 
 **is_skan** | **Boolean**| Whether the app is using Skan features. | [optional] 
 **app_promotion_type** | **String**| App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appOptimizationEventRetargeting"></a>
# **appOptimizationEventRetargeting**
> InlineResponse200 appOptimizationEventRetargeting(app_id, advertiser_id, Access_Token)

Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859371033601)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.APPManagementApi();
let app_id = "app_id_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.appOptimizationEventRetargeting(app_id, advertiser_id, Access_Token, (error, data, response) => {
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
 **app_id** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appUpdate"></a>
# **appUpdate**
> InlineResponse200 appUpdate(Access_Token, opts)

Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859300069378)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.APPManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AppUpdateBody() // AppUpdateBody | 
};
apiInstance.appUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AppUpdateBody**](AppUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

