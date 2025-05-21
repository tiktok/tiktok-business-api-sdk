# js_sdk.MeasurementApi

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
> InlineResponse200 offlineCreate(Access_Token, opts)

Create a new Offline Event set. [Offline Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1758427576470529)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.OfflineCreateBody() // OfflineCreateBody | 
};
apiInstance.offlineCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**OfflineCreateBody**](OfflineCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="offlineDelete"></a>
# **offlineDelete**
> InlineResponse200 offlineDelete(Access_Token, opts)

Delete an Offline Event set. [Offline Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596790860802)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.OfflineDeleteBody() // OfflineDeleteBody | 
};
apiInstance.offlineDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**OfflineDeleteBody**](OfflineDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="offlineGet"></a>
# **offlineGet**
> InlineResponse200 offlineGet(Access_Token, opts)

Get Offline Event sets. [Offline Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596808589313)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'advertiser_id': "advertiser_id_example", // String | 
  'event_set_ids': ["event_set_ids_example"], // [String] | 
  'name': "name_example" // String | 
};
apiInstance.offlineGet(Access_Token, opts, (error, data, response) => {
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
 **advertiser_id** | **String**|  | [optional] 
 **event_set_ids** | [**[String]**](String.md)|  | [optional] 
 **name** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="offlineUpdate"></a>
# **offlineUpdate**
> InlineResponse200 offlineUpdate(Access_Token, opts)

Update an Offline Event set. [Offline Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1765596741157889)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.OfflineUpdateBody() // OfflineUpdateBody | 
};
apiInstance.offlineUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**OfflineUpdateBody**](OfflineUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelCreate"></a>
# **pixelCreate**
> InlineResponse200 pixelCreate(Access_Token, opts)

Create a Pixel. [Pixel Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858779758593)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PixelCreateBody() // PixelCreateBody | 
};
apiInstance.pixelCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PixelCreateBody**](PixelCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelEventCreate"></a>
# **pixelEventCreate**
> InlineResponse200 pixelEventCreate(Access_Token, opts)

Choose either an industry or custom template to define your events. [Pixel Event Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858807646209)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.EventCreateBody() // EventCreateBody | 
};
apiInstance.pixelEventCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**EventCreateBody**](EventCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelEventDelete"></a>
# **pixelEventDelete**
> InlineResponse200 pixelEventDelete(Access_Token, opts)

Delete Pixel events. [Pixel Event Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858862104578)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.EventDeleteBody() // EventDeleteBody | 
};
apiInstance.pixelEventDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**EventDeleteBody**](EventDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelEventStats"></a>
# **pixelEventStats**
> InlineResponse200 pixelEventStats(advertiser_id, pixel_ids, date_range, Access_Token)

View statistics of an event data over a period of time. [Pixel Event Stats](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858904557570)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let pixel_ids = ["pixel_ids_example"]; // [String] | 
let date_range = new js_sdk.DateRange(); // DateRange | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.pixelEventStats(advertiser_id, pixel_ids, date_range, Access_Token, (error, data, response) => {
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
 **pixel_ids** | [**[String]**](String.md)|  |[required]  
 **date_range** | [**DateRange**](DateRange.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pixelEventUpdate"></a>
# **pixelEventUpdate**
> InlineResponse200 pixelEventUpdate(Access_Token, opts)

Update the name of a Pixel event and the conversion value. [Pixel Event Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858823774210)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.EventUpdateBody() // EventUpdateBody | 
};
apiInstance.pixelEventUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**EventUpdateBody**](EventUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pixelList"></a>
# **pixelList**
> InlineResponse200 pixelList(advertiser_id, Access_Token, opts)

Obtain a list of Pixel information. [Pixel List](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858697598978)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'pixel_id': "pixel_id_example", // String | 
  'code': "code_example", // String | 
  'name': "name_example", // String | 
  'order_by': "EARLIEST_CREATE", // String | 
  'filtering': new js_sdk.FilteringPixelList(), // FilteringPixelList | 
  'page': 789, // Number | 
  'page_size': 789 // Number | 
};
apiInstance.pixelList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **pixel_id** | **String**|  | [optional] 
 **code** | **String**|  | [optional] 
 **name** | **String**|  | [optional] 
 **order_by** | **String**|  | [optional] [default to EARLIEST_CREATE]
 **filtering** | [**FilteringPixelList**](FilteringPixelList.md)|  | [optional] 
 **page** | **Number**|  | [optional] 
 **page_size** | **Number**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pixelUpdate"></a>
# **pixelUpdate**
> InlineResponse200 pixelUpdate(Access_Token, opts)

Update a Pixel. [Pixel Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740858799524865)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.MeasurementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PixelUpdateBody() // PixelUpdateBody | 
};
apiInstance.pixelUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PixelUpdateBody**](PixelUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

