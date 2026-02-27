# MeasurementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offlineCreate**](MeasurementApi.md#offlineCreate) | **POST** /open_api/v1.3/offline/create/ | Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1758427576470529)
[**offlineDelete**](MeasurementApi.md#offlineDelete) | **POST** /open_api/v1.3/offline/delete/ | Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596790860802)
[**offlineGet**](MeasurementApi.md#offlineGet) | **GET** /open_api/v1.3/offline/get/ | Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596808589313)
[**offlineUpdate**](MeasurementApi.md#offlineUpdate) | **POST** /open_api/v1.3/offline/update/ | Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596741157889)
[**pixelCreate**](MeasurementApi.md#pixelCreate) | **POST** /open_api/v1.3/pixel/create/ | Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858779758593)
[**pixelEventCreate**](MeasurementApi.md#pixelEventCreate) | **POST** /open_api/v1.3/pixel/event/create/ | Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858807646209)
[**pixelEventDelete**](MeasurementApi.md#pixelEventDelete) | **POST** /open_api/v1.3/pixel/event/delete/ | Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858862104578)
[**pixelEventStats**](MeasurementApi.md#pixelEventStats) | **GET** /open_api/v1.3/pixel/event/stats/ | View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858904557570)
[**pixelEventUpdate**](MeasurementApi.md#pixelEventUpdate) | **POST** /open_api/v1.3/pixel/event/update/ | Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858823774210)
[**pixelList**](MeasurementApi.md#pixelList) | **GET** /open_api/v1.3/pixel/list/ | Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858697598978)
[**pixelUpdate**](MeasurementApi.md#pixelUpdate) | **POST** /open_api/v1.3/pixel/update/ | Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858799524865)

<a name="offlineCreate"></a>
# **offlineCreate**
> Response offlineCreate(accessToken, body)

Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1758427576470529)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
OfflineCreateBody body = new OfflineCreateBody(); // OfflineCreateBody | 
try {
    Response result = apiInstance.offlineCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#offlineCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**OfflineCreateBody**](OfflineCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="offlineDelete"></a>
# **offlineDelete**
> Response offlineDelete(accessToken, body)

Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596790860802)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
OfflineDeleteBody body = new OfflineDeleteBody(); // OfflineDeleteBody | 
try {
    Response result = apiInstance.offlineDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#offlineDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**OfflineDeleteBody**](OfflineDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="offlineGet"></a>
# **offlineGet**
> Response offlineGet(accessToken, advertiserId, eventSetIds, name)

Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596808589313)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String advertiserId = "advertiserId_example"; // String | 
List<String> eventSetIds = Arrays.asList("eventSetIds_example"); // List<String> | 
String name = "name_example"; // String | 
try {
    Response result = apiInstance.offlineGet(accessToken, advertiserId, eventSetIds, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#offlineGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **advertiserId** | **String**|  | [optional]
 **eventSetIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **name** | **String**|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offlineUpdate"></a>
# **offlineUpdate**
> Response offlineUpdate(accessToken, body)

Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596741157889)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
OfflineUpdateBody body = new OfflineUpdateBody(); // OfflineUpdateBody | 
try {
    Response result = apiInstance.offlineUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#offlineUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**OfflineUpdateBody**](OfflineUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelCreate"></a>
# **pixelCreate**
> Response pixelCreate(accessToken, body)

Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858779758593)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PixelCreateBody body = new PixelCreateBody(); // PixelCreateBody | 
try {
    Response result = apiInstance.pixelCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PixelCreateBody**](PixelCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelEventCreate"></a>
# **pixelEventCreate**
> Response pixelEventCreate(accessToken, body)

Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858807646209)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
EventCreateBody body = new EventCreateBody(); // EventCreateBody | 
try {
    Response result = apiInstance.pixelEventCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelEventCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**EventCreateBody**](EventCreateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelEventDelete"></a>
# **pixelEventDelete**
> Response pixelEventDelete(accessToken, body)

Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858862104578)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
EventDeleteBody body = new EventDeleteBody(); // EventDeleteBody | 
try {
    Response result = apiInstance.pixelEventDelete(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelEventDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**EventDeleteBody**](EventDeleteBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelEventStats"></a>
# **pixelEventStats**
> Response pixelEventStats(advertiserId, pixelIds, dateRange, accessToken)

View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858904557570)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String advertiserId = "advertiserId_example"; // String | 
List<String> pixelIds = Arrays.asList("pixelIds_example"); // List<String> | 
DateRange dateRange = new DateRange(); // DateRange | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
try {
    Response result = apiInstance.pixelEventStats(advertiserId, pixelIds, dateRange, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelEventStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **pixelIds** | [**List&lt;String&gt;**](String.md)|  |[required] 
 **dateRange** | [**DateRange**](DateRange.md)|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pixelEventUpdate"></a>
# **pixelEventUpdate**
> Response pixelEventUpdate(accessToken, body)

Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858823774210)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
EventUpdateBody body = new EventUpdateBody(); // EventUpdateBody | 
try {
    Response result = apiInstance.pixelEventUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelEventUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**EventUpdateBody**](EventUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelList"></a>
# **pixelList**
> Response pixelList(advertiserId, accessToken, pixelId, code, name, orderBy, filtering, page, pageSize)

Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858697598978)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String advertiserId = "advertiserId_example"; // String | 
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String pixelId = "pixelId_example"; // String | 
String code = "code_example"; // String | 
String name = "name_example"; // String | 
String orderBy = "EARLIEST_CREATE"; // String | 
FilteringPixelList filtering = new FilteringPixelList(); // FilteringPixelList | 
Long page = 789L; // Long | 
Long pageSize = 789L; // Long | 
try {
    Response result = apiInstance.pixelList(advertiserId, accessToken, pixelId, code, name, orderBy, filtering, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**|  |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **pixelId** | **String**|  | [optional]
 **code** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **orderBy** | **String**|  | [optional] [default to EARLIEST_CREATE]
 **filtering** | [**FilteringPixelList**](FilteringPixelList.md)|  | [optional]
 **page** | **Long**|  | [optional] [enum: 1]
 **pageSize** | **Long**|  | [optional] [enum: 1, 20]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pixelUpdate"></a>
# **pixelUpdate**
> Response pixelUpdate(accessToken, body)

Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858799524865)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.MeasurementApi;


MeasurementApi apiInstance = new MeasurementApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
PixelUpdateBody body = new PixelUpdateBody(); // PixelUpdateBody | 
try {
    Response result = apiInstance.pixelUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementApi#pixelUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**PixelUpdateBody**](PixelUpdateBody.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

