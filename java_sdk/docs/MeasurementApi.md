# MeasurementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appList**](MeasurementApi.md#appList) | **GET** /open_api/v1.3/app/list/ | Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)
[**appOptimizationEvent**](MeasurementApi.md#appOptimizationEvent) | **GET** /open_api/v1.3/app/optimization_event/ | Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)

<a name="appList"></a>
# **appList**
> Response appList(advertiserId, accessToken, appPlatformIds)

Get the app list [App list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859313270786)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> appPlatformIds = Arrays.asList("appPlatformIds_example"); // List<String> | List of app platform ID for filter purpose
try {
    Response result = apiInstance.appList(advertiserId, accessToken, appPlatformIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#appList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **appPlatformIds** | [**List&lt;String&gt;**](String.md)| List of app platform ID for filter purpose | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appOptimizationEvent"></a>
# **appOptimizationEvent**
> Response appOptimizationEvent(appId, advertiserId, placement, optimizationGoal, accessToken, objective, availableOnly, isSkan, appPromotionType)

Get App Events [App events](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740859338750977)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String appId = "appId_example"; // String | Your App ID, obtained after successfully creating your app
String advertiserId = "advertiserId_example"; // String | Advertiser ID
List<String> placement = Arrays.asList("placement_example"); // List<String> | Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138)
String optimizationGoal = "optimizationGoal_example"; // String | Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138) for more
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String objective = "objective_example"; // String | Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id=1737174886619138)
Boolean availableOnly = true; // Boolean | Whether to return only available conversion events. The default value: `True` (only return available conversion events)
Boolean isSkan = true; // Boolean | Whether the app is using Skan features
String appPromotionType = "appPromotionType_example"; // String | App promotion type. Required when `objective_type` is `APP_PROMOTION`. Enum values: `APP_INSTALL`, `APP_RETARGETING`. Note: `APP_INSTALL` can be used in an iOS14 Dedicated Campaign, while `APP_RETARGETING` cannot be used
try {
    Response result = apiInstance.appOptimizationEvent(appId, advertiserId, placement, optimizationGoal, accessToken, objective, availableOnly, isSkan, appPromotionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#appOptimizationEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Your App ID, obtained after successfully creating your app |[required] 
 **advertiserId** | **String**| Advertiser ID |[required] 
 **placement** | [**List&lt;String&gt;**](String.md)| Advertisement positioning, See [Enumeration-Placement](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) |[required] 
 **optimizationGoal** | **String**| Optimization goal. For enum values, see [Enumeration-Optimization Goal](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) for more |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **objective** | **String**| Advertising Objective. For enum values, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138) | [optional]
 **availableOnly** | **Boolean**| Whether to return only available conversion events. The default value: &#x60;True&#x60; (only return available conversion events) | [optional]
 **isSkan** | **Boolean**| Whether the app is using Skan features | [optional]
 **appPromotionType** | **String**| App promotion type. Required when &#x60;objective_type&#x60; is &#x60;APP_PROMOTION&#x60;. Enum values: &#x60;APP_INSTALL&#x60;, &#x60;APP_RETARGETING&#x60;. Note: &#x60;APP_INSTALL&#x60; can be used in an iOS14 Dedicated Campaign, while &#x60;APP_RETARGETING&#x60; cannot be used | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

