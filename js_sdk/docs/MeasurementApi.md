# js_sdk.MeasurementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appList**](MeasurementApi.md#appList) | **GET** /open_api/v1.3/app/list/ | Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)
[**appOptimizationEvent**](MeasurementApi.md#appOptimizationEvent) | **GET** /open_api/v1.3/app/optimization_event/ | Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)

<a name="appList"></a>
# **appList**
> InlineResponse200 appList(advertiser_id, Access_Token, opts)

Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'app_platform_ids': ["app_platform_ids_example"] // [String] | List of app platform ID for filter purpose
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
 **advertiser_id** | **String**| Advertiser ID |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **app_platform_ids** | [**[String]**](String.md)| List of app platform ID for filter purpose | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appOptimizationEvent"></a>
# **appOptimizationEvent**
> InlineResponse200 appOptimizationEvent(app_id, advertiser_id, placement, optimization_goal, Access_Token, opts)

Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let app_id = "app_id_example"; // String | Your App ID, obtained after successfully creating your app
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let placement = ["placement_example"]; // [String] | Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138)
let optimization_goal = "optimization_goal_example"; // String | Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) for more
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'objective': "objective_example", // String | Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138)
  'available_only': true, // Boolean | Whether to return only available conversion events. The default value: `True` (only return available conversion events)
  'is_skan': true, // Boolean | Whether the app is using Skan features
  'app_promotion_type': "app_promotion_type_example" // String | App promotion type. Required when `objective_type` is `APP_PROMOTION`. Enum values: `APP_INSTALL`, `APP_RETARGETING`. Note: `APP_INSTALL` can be used in an iOS14 Dedicated Campaign, while `APP_RETARGETING` cannot be used
};
apiInstance.appOptimizationEvent(app_id, advertiser_id, placement, optimization_goal, Access_Token, opts, (error, data, response) => {
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
 **app_id** | **String**| Your App ID, obtained after successfully creating your app |[required]  
 **advertiser_id** | **String**| Advertiser ID |[required]  
 **placement** | [**[String]**](String.md)| Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) |[required]  
 **optimization_goal** | **String**| Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) for more |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **objective** | **String**| Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) | [optional] 
 **available_only** | **Boolean**| Whether to return only available conversion events. The default value: &#x60;True&#x60; (only return available conversion events) | [optional] 
 **is_skan** | **Boolean**| Whether the app is using Skan features | [optional] 
 **app_promotion_type** | **String**| App promotion type. Required when &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60;. Enum values: &#x60;APP_INSTALL&#x60;, &#x60;APP_RETARGETING&#x60;. Note: &#x60;APP_INSTALL&#x60; can be used in an iOS14 Dedicated Campaign, while &#x60;APP_RETARGETING&#x60; cannot be used | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

