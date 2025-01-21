# js_sdk.CatalogApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogAvailableCountryGet**](CatalogApi.md#catalogAvailableCountryGet) | **GET** /open_api/v1.3/catalog/available_country/get/ | Get the countries and regions that ads for a catalog can be delivered to. [Catalog Available Country Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740491257516034)
[**catalogCapitalize**](CatalogApi.md#catalogCapitalize) | **POST** /open_api/v1.3/catalog/capitalize/ | Migrate catalogs under your ad account to your Business Center. [Catalog Capitalize](https://business-api.tiktok.com/portal/docs?id&#x3D;1740490222539778)
[**catalogCreate**](CatalogApi.md#catalogCreate) | **POST** /open_api/v1.3/catalog/create/ | Create a catalog by specifying information such as name, targeted locations, and currency. [Catalog Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740306481704961)
[**catalogDelete**](CatalogApi.md#catalogDelete) | **POST** /open_api/v1.3/catalog/delete/ | Delete a catalog. [Catalog Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740310064588801)
[**catalogEventsourceBind**](CatalogApi.md#catalogEventsourceBind) | **POST** /open_api/v1.3/catalog/eventsource/bind/ | Bind app or website event sources to a catalog in a Business Center. [Catalog Eventsource Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492491200513)
[**catalogEventsourceBindGet**](CatalogApi.md#catalogEventsourceBindGet) | **GET** /open_api/v1.3/catalog/eventsource_bind/get/ | Get event source binding information. [Catalog Eventsource Bind Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492531343362)
[**catalogEventsourceUnbind**](CatalogApi.md#catalogEventsourceUnbind) | **POST** /open_api/v1.3/catalog/eventsource/unbind/ | Unbind event sources from a catalog. [Catalog Eventsource Unbind](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492512449538)
[**catalogFeedDelete**](CatalogApi.md#catalogFeedDelete) | **POST** /open_api/v1.3/catalog/feed/delete/ | Delete a feed. [Catalog Feed Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740665210863617)
[**catalogFeedGet**](CatalogApi.md#catalogFeedGet) | **GET** /open_api/v1.3/catalog/feed/get/ | Get all feeds or a particular feed. [Catalog Feed Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740665183073281)
[**catalogGet**](CatalogApi.md#catalogGet) | **GET** /open_api/v1.3/catalog/get/ | Get all catalogs or a particular catalog. [Catalog Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740315452868610)
[**catalogLexiconGet**](CatalogApi.md#catalogLexiconGet) | **GET** /open_api/v1.3/catalog/lexicon/get/ | Get the lexicon for your catalog for use in ad texts. [Catalog Lexicon Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740488375815169)
[**catalogLocationCurrencyGet**](CatalogApi.md#catalogLocationCurrencyGet) | **GET** /open_api/v1.3/catalog/location_currency/get/ | Get supported locations and corresponding currencies for Catalog API. [Catalog Location Currency Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740491571747841)
[**catalogOverview**](CatalogApi.md#catalogOverview) | **GET** /open_api/v1.3/catalog/overview/ | Get the number of products in different audit statuses in a catalog. [Catalog Overview](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492470201345)
[**catalogProductDelete**](CatalogApi.md#catalogProductDelete) | **POST** /open_api/v1.3/catalog/product/delete/ | Delete products in bulk. [Catalog Product Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740562489236481)
[**catalogProductFile**](CatalogApi.md#catalogProductFile) | **POST** /open_api/v1.3/catalog/product/file/ | Upload products via file URL. [Catalog Product File](https://business-api.tiktok.com/portal/docs?id&#x3D;1740496787164161)
[**catalogSetProductGet**](CatalogApi.md#catalogSetProductGet) | **GET** /open_api/v1.3/catalog/set/product/get/ | Get products in a product set. [Catalog Set Product Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740571478441986)
[**catalogUpdate**](CatalogApi.md#catalogUpdate) | **POST** /open_api/v1.3/catalog/update/ | Use this endpoint to update the name of a catalog. The catalog must be under a Business Center. [Catalog Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740306544966657)

<a name="catalogAvailableCountryGet"></a>
# **catalogAvailableCountryGet**
> InlineResponse200 catalogAvailableCountryGet(bc_id, Access_Token)

Get the countries and regions that ads for a catalog can be delivered to. [Catalog Available Country Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740491257516034)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.catalogAvailableCountryGet(bc_id, Access_Token, (error, data, response) => {
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
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogCapitalize"></a>
# **catalogCapitalize**
> InlineResponse200 catalogCapitalize(Access_Token, opts)

Migrate catalogs under your ad account to your Business Center. [Catalog Capitalize](https://business-api.tiktok.com/portal/docs?id&#x3D;1740490222539778)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CatalogCapitalizeBody() // CatalogCapitalizeBody | 
};
apiInstance.catalogCapitalize(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CatalogCapitalizeBody**](CatalogCapitalizeBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogCreate"></a>
# **catalogCreate**
> InlineResponse200 catalogCreate(Access_Token, opts)

Create a catalog by specifying information such as name, targeted locations, and currency. [Catalog Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1740306481704961)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CatalogCreateBody() // CatalogCreateBody | 
};
apiInstance.catalogCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CatalogCreateBody**](CatalogCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogDelete"></a>
# **catalogDelete**
> InlineResponse200 catalogDelete(Access_Token, opts)

Delete a catalog. [Catalog Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740310064588801)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CatalogDeleteBody() // CatalogDeleteBody | 
};
apiInstance.catalogDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CatalogDeleteBody**](CatalogDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogEventsourceBind"></a>
# **catalogEventsourceBind**
> InlineResponse200 catalogEventsourceBind(Access_Token, opts)

Bind app or website event sources to a catalog in a Business Center. [Catalog Eventsource Bind](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492491200513)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.EventsourceBindBody() // EventsourceBindBody | 
};
apiInstance.catalogEventsourceBind(Access_Token, opts, (error, data, response) => {
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
 **body** | [**EventsourceBindBody**](EventsourceBindBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogEventsourceBindGet"></a>
# **catalogEventsourceBindGet**
> InlineResponse200 catalogEventsourceBindGet(catalog_id, bc_id, Access_Token)

Get event source binding information. [Catalog Eventsource Bind Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492531343362)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let catalog_id = "catalog_id_example"; // String | 
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.catalogEventsourceBindGet(catalog_id, bc_id, Access_Token, (error, data, response) => {
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
 **catalog_id** | **String**|  |[required]  
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogEventsourceUnbind"></a>
# **catalogEventsourceUnbind**
> InlineResponse200 catalogEventsourceUnbind(Access_Token, opts)

Unbind event sources from a catalog. [Catalog Eventsource Unbind](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492512449538)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.EventsourceUnbindBody() // EventsourceUnbindBody | 
};
apiInstance.catalogEventsourceUnbind(Access_Token, opts, (error, data, response) => {
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
 **body** | [**EventsourceUnbindBody**](EventsourceUnbindBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogFeedDelete"></a>
# **catalogFeedDelete**
> InlineResponse200 catalogFeedDelete(Access_Token, opts)

Delete a feed. [Catalog Feed Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740665210863617)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.FeedDeleteBody() // FeedDeleteBody | 
};
apiInstance.catalogFeedDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**FeedDeleteBody**](FeedDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogFeedGet"></a>
# **catalogFeedGet**
> InlineResponse200 catalogFeedGet(catalog_id, bc_id, Access_Token, opts)

Get all feeds or a particular feed. [Catalog Feed Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740665183073281)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let catalog_id = "catalog_id_example"; // String | 
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'feed_id': "feed_id_example" // String | 
};
apiInstance.catalogFeedGet(catalog_id, bc_id, Access_Token, opts, (error, data, response) => {
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
 **catalog_id** | **String**|  |[required]  
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **feed_id** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogGet"></a>
# **catalogGet**
> InlineResponse200 catalogGet(bc_id, Access_Token, opts)

Get all catalogs or a particular catalog. [Catalog Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740315452868610)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'catalog_id': "catalog_id_example", // String | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.catalogGet(bc_id, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **catalog_id** | **String**|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogLexiconGet"></a>
# **catalogLexiconGet**
> InlineResponse200 catalogLexiconGet(catalog_id, bc_id, Access_Token)

Get the lexicon for your catalog for use in ad texts. [Catalog Lexicon Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740488375815169)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let catalog_id = "catalog_id_example"; // String | 
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.catalogLexiconGet(catalog_id, bc_id, Access_Token, (error, data, response) => {
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
 **catalog_id** | **String**|  |[required]  
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogLocationCurrencyGet"></a>
# **catalogLocationCurrencyGet**
> InlineResponse200 catalogLocationCurrencyGet(Access_Token)

Get supported locations and corresponding currencies for Catalog API. [Catalog Location Currency Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740491571747841)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.catalogLocationCurrencyGet(Access_Token, (error, data, response) => {
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

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogOverview"></a>
# **catalogOverview**
> InlineResponse200 catalogOverview(catalog_id, bc_id, Access_Token)

Get the number of products in different audit statuses in a catalog. [Catalog Overview](https://business-api.tiktok.com/portal/docs?id&#x3D;1740492470201345)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let catalog_id = "catalog_id_example"; // String | 
let bc_id = "bc_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.catalogOverview(catalog_id, bc_id, Access_Token, (error, data, response) => {
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
 **catalog_id** | **String**|  |[required]  
 **bc_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogProductDelete"></a>
# **catalogProductDelete**
> InlineResponse200 catalogProductDelete(Access_Token, opts)

Delete products in bulk. [Catalog Product Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1740562489236481)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ProductDeleteBody() // ProductDeleteBody | 
};
apiInstance.catalogProductDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**ProductDeleteBody**](ProductDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogProductFile"></a>
# **catalogProductFile**
> InlineResponse200 catalogProductFile(Access_Token, opts)

Upload products via file URL. [Catalog Product File](https://business-api.tiktok.com/portal/docs?id&#x3D;1740496787164161)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ProductFileBody() // ProductFileBody | 
};
apiInstance.catalogProductFile(Access_Token, opts, (error, data, response) => {
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
 **body** | [**ProductFileBody**](ProductFileBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogSetProductGet"></a>
# **catalogSetProductGet**
> InlineResponse200 catalogSetProductGet(bc_id, catalog_id, product_set_id, Access_Token, opts)

Get products in a product set. [Catalog Set Product Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1740571478441986)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let bc_id = "bc_id_example"; // String | 
let catalog_id = "catalog_id_example"; // String | 
let product_set_id = "product_set_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'page': 1, // Number | 
  'page_size': 20 // Number | 
};
apiInstance.catalogSetProductGet(bc_id, catalog_id, product_set_id, Access_Token, opts, (error, data, response) => {
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
 **bc_id** | **String**|  |[required]  
 **catalog_id** | **String**|  |[required]  
 **product_set_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 20]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="catalogUpdate"></a>
# **catalogUpdate**
> InlineResponse200 catalogUpdate(Access_Token, opts)

Use this endpoint to update the name of a catalog. The catalog must be under a Business Center. [Catalog Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1740306544966657)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CatalogApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CatalogUpdateBody() // CatalogUpdateBody | 
};
apiInstance.catalogUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CatalogUpdateBody**](CatalogUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

