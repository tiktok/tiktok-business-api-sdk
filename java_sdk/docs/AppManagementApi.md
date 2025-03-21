# AppManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appCreate**](AppManagementApi.md#appCreate) | **POST** /open_api/v1.3/app/create/ | Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859280958466)
[**appInfo**](AppManagementApi.md#appInfo) | **GET** /open_api/v1.3/app/info/ | Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859272887297)
[**appList**](AppManagementApi.md#appList) | **GET** /open_api/v1.3/app/list/ | Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859313270786)
[**appOptimizationEvent**](AppManagementApi.md#appOptimizationEvent) | **GET** /open_api/v1.3/app/optimization_event/ | Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859338750977)
[**appOptimizationEventRetargeting**](AppManagementApi.md#appOptimizationEventRetargeting) | **GET** /open_api/v1.3/app/optimization_event/retargeting/ | Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859371033601)
[**appUpdate**](AppManagementApi.md#appUpdate) | **POST** /open_api/v1.3/app/update/ | Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859300069378)

<a name="appCreate"></a>
# **appCreate**
> Response appCreate(accessToken, body)

Create an app. [APP Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859280958466)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AppManagementApi;


AppManagementApi apiInstance = new AppManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AppCreateBody body = new AppCreateBody(); // AppCreateBody | 
try {
    Response result = apiInstance.appCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppManagementApi#appCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AppCreateBody**](AppCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="appInfo"></a>
# **appInfo**
> Response appInfo(advertiserId, appId, accessToken)

Get info of an app. [APP Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859272887297)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AppManagementApi;


AppManagementApi apiInstance = new AppManagementApi();
String advertiserId = "advertiserId_example"; // String | 
String appId = "appId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.appInfo(advertiserId, appId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppManagementApi#appInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **appId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appList"></a>
# **appList**
> Response appList(advertiserId, accessToken, appPlatformIds)

Get the app list. [APP List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859313270786)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AppManagementApi;


AppManagementApi apiInstance = new AppManagementApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID.
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> appPlatformIds = Arrays.asList("appPlatformIds_example"); // List<String> | List of app platform ID for filter purpose.
try {
    Response result = apiInstance.appList(advertiserId, accessToken, appPlatformIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppManagementApi#appList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID. |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **appPlatformIds** | [**List&lt;String&gt;**](String.md)| List of app platform ID for filter purpose. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appOptimizationEvent"></a>
# **appOptimizationEvent**
> Response appOptimizationEvent(appId, advertiserId, optimizationGoal, accessToken, placement, placementType, objective, availableOnly, isSkan, appPromotionType)

Get App Conversion Events. [App Optimization Event](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859338750977)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AppManagementApi;


AppManagementApi apiInstance = new AppManagementApi();
String appId = "appId_example"; // String | Your App ID, obtained after successfully creating your app.
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String optimizationGoal = "optimizationGoal_example"; // String | Optimization goal. For enum values, see Enumeration-Optimization Goal for more
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
List<String> placement = Arrays.asList("placement_example"); // List<String> | The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don't select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they've been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type = PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported.
String placementType = "placementType_example"; // String | 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。
String objective = "objective_example"; // String | Advertising Objective. For enum values, see Enumeration-Advertising Objective
Boolean availableOnly = true; // Boolean | Whether to return only available conversion events. The default value: True (only return available conversion events)
Boolean isSkan = true; // Boolean | Whether the app is using Skan features.
String appPromotionType = "appPromotionType_example"; // String | App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used.
try {
    Response result = apiInstance.appOptimizationEvent(appId, advertiserId, optimizationGoal, accessToken, placement, placementType, objective, availableOnly, isSkan, appPromotionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppManagementApi#appOptimizationEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Your App ID, obtained after successfully creating your app. |[required] 
 **advertiserId** | **String**| Advertiser ID |[required] 
 **optimizationGoal** | **String**| Optimization goal. For enum values, see Enumeration-Optimization Goal for more |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **placement** | [**List&lt;String&gt;**](String.md)| The apps where you want to deliver your ads. Required when placement_type is PLACEMENT_TYPE_NORMAL, and ignored when placement_type is PLACEMENT_TYPE_AUTOMATIC. Note: Currently, we support PLACEMENT_TIKTOK, PLACEMENT_PANGLE and PLACEMENT_GLOBAL_APP_BUNDLE. Please don&#x27;t select PLACEMENT_TOPBUZZ or PLACEMENT_HELO as your placements since they&#x27;ve been deprecated. For a full list of enum values, see Enumeration - Placement. For Product Sales campaigns (objective_type &#x3D; PRODUCT_SALES), only TikTok placement (PLACEMENT_TIKTOK) is supported. | [optional]
 **placementType** | **String**| 版位类型。 枚举值：PLACEMENT_TYPE_AUTOMATIC（自动版位）,PLACEMENT_TYPE_NORMAL （编辑版位）。 默认值: PLACEMENT_TYPE_NORMAL。 | [optional]
 **objective** | **String**| Advertising Objective. For enum values, see Enumeration-Advertising Objective | [optional]
 **availableOnly** | **Boolean**| Whether to return only available conversion events. The default value: True (only return available conversion events) | [optional]
 **isSkan** | **Boolean**| Whether the app is using Skan features. | [optional]
 **appPromotionType** | **String**| App promotion type. Required when objective_type is APP_PROMOTION. Enum values: APP_INSTALL, APP_RETARGETING. Note: APP_INSTALL can be used in an iOS14 Dedicated Campaign, while APP_RETARGETING cannot be used. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appOptimizationEventRetargeting"></a>
# **appOptimizationEventRetargeting**
> Response appOptimizationEventRetargeting(appId, advertiserId, accessToken)

Get App Retargeting Events. [App Optimization Event Retargeting](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859371033601)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AppManagementApi;


AppManagementApi apiInstance = new AppManagementApi();
String appId = "appId_example"; // String | 
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.appOptimizationEventRetargeting(appId, advertiserId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppManagementApi#appOptimizationEventRetargeting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |[required] 
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="appUpdate"></a>
# **appUpdate**
> Response appUpdate(accessToken, body)

Update an app. [APP Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740859300069378)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.AppManagementApi;


AppManagementApi apiInstance = new AppManagementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
AppUpdateBody body = new AppUpdateBody(); // AppUpdateBody | 
try {
    Response result = apiInstance.appUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppManagementApi#appUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**AppUpdateBody**](AppUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

