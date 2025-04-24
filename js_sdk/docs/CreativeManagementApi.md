# js_sdk.CreativeManagementApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creativeAssetDelete**](CreativeManagementApi.md#creativeAssetDelete) | **POST** /open_api/v1.3/creative/asset/delete/ | Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1797202997456897)
[**creativeAssetShare**](CreativeManagementApi.md#creativeAssetShare) | **POST** /open_api/v1.3/creative/asset/share/ | SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1773192725768193)
[**creativeImageEdit**](CreativeManagementApi.md#creativeImageEdit) | **POST** /open_api/v1.3/creative/image/edit/ | Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id&#x3D;1739067107903489)
[**creativePortfolioCreate**](CreativeManagementApi.md#creativePortfolioCreate) | **POST** /open_api/v1.3/creative/portfolio/create/ | Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739091950439426)
[**creativePortfolioGet**](CreativeManagementApi.md#creativePortfolioGet) | **GET** /open_api/v1.3/creative/portfolio/get/ | Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739092113671170)
[**creativePortfolioList**](CreativeManagementApi.md#creativePortfolioList) | **GET** /open_api/v1.3/creative/portfolio/list/ | Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id&#x3D;1766324010279938)
[**creativeShareableLinkCreate**](CreativeManagementApi.md#creativeShareableLinkCreate) | **POST** /open_api/v1.3/creative/shareable_link/create/ | 
[**creativeSmartTextGenerate**](CreativeManagementApi.md#creativeSmartTextGenerate) | **POST** /open_api/v1.3/creative/smart_text/generate/ | Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id&#x3D;1739084248002626)
[**discoveryDetail**](CreativeManagementApi.md#discoveryDetail) | **GET** /open_api/v1.3/discovery/detail/ | Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119047070721)
[**discoveryTrendingList**](CreativeManagementApi.md#discoveryTrendingList) | **GET** /open_api/v1.3/discovery/trending_list/ | Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119032526849)
[**playableDelete**](CreativeManagementApi.md#playableDelete) | **POST** /open_api/v1.3/playable/delete/ | Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1737733368940546)
[**playableGet**](CreativeManagementApi.md#playableGet) | **GET** /open_api/v1.3/playable/get/ | Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732758495234)
[**playableSave**](CreativeManagementApi.md#playableSave) | **POST** /open_api/v1.3/playable/save/ | Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732203851777)
[**playableUpload**](CreativeManagementApi.md#playableUpload) | **POST** /open_api/v1.3/playable/upload/ | You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1737730926765057)
[**playableValidate**](CreativeManagementApi.md#playableValidate) | **GET** /open_api/v1.3/playable/validate/ | Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732054892545)

<a name="creativeAssetDelete"></a>
# **creativeAssetDelete**
> InlineResponse200 creativeAssetDelete(Access_Token, opts)

Delete creative assets. [Asset Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1797202997456897)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CreativeAssetDeleteBody() // CreativeAssetDeleteBody | 
};
apiInstance.creativeAssetDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CreativeAssetDeleteBody**](CreativeAssetDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativeAssetShare"></a>
# **creativeAssetShare**
> InlineResponse200 creativeAssetShare(Access_Token, opts)

SShare creative assets with other advertiser accounts. [Asset Share](https://business-api.tiktok.com/portal/docs?id&#x3D;1773192725768193)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.AssetShareBody() // AssetShareBody | 
};
apiInstance.creativeAssetShare(Access_Token, opts, (error, data, response) => {
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
 **body** | [**AssetShareBody**](AssetShareBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativeImageEdit"></a>
# **creativeImageEdit**
> InlineResponse200 creativeImageEdit(Access_Token, opts)

Edit an image according to the size you want as well as apply creative trimmings. [Image Edit](https://business-api.tiktok.com/portal/docs?id&#x3D;1739067107903489)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ImageEditBody() // ImageEditBody | 
};
apiInstance.creativeImageEdit(Access_Token, opts, (error, data, response) => {
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
 **body** | [**ImageEditBody**](ImageEditBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativePortfolioCreate"></a>
# **creativePortfolioCreate**
> InlineResponse200 creativePortfolioCreate(Access_Token, opts)

Create a portfolio. [Creative Portfolie Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1739091950439426)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PortfolioCreateBody() // PortfolioCreateBody | 
};
apiInstance.creativePortfolioCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PortfolioCreateBody**](PortfolioCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativePortfolioGet"></a>
# **creativePortfolioGet**
> InlineResponse200 creativePortfolioGet(advertiser_id, creative_portfolio_id, Access_Token)

Get a portfolio by ID. [Portfolio Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1739092113671170)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let creative_portfolio_id = "creative_portfolio_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.creativePortfolioGet(advertiser_id, creative_portfolio_id, Access_Token, (error, data, response) => {
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
 **creative_portfolio_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="creativePortfolioList"></a>
# **creativePortfolioList**
> InlineResponse200 creativePortfolioList(advertiser_id, Access_Token, opts)

Get portfolios within an ad account. [Portfolio List](https://business-api.tiktok.com/portal/docs?id&#x3D;1766324010279938)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringCreativePortfolioList(), // FilteringCreativePortfolioList | 
  'page': 1, // Number | 
  'page_size': 20 // Number | 
};
apiInstance.creativePortfolioList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **filtering** | [**FilteringCreativePortfolioList**](FilteringCreativePortfolioList.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 20]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="creativeShareableLinkCreate"></a>
# **creativeShareableLinkCreate**
> InlineResponse200 creativeShareableLinkCreate(Access_Token, opts)



### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.ShareableLinkCreateBody() // ShareableLinkCreateBody | 
};
apiInstance.creativeShareableLinkCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**ShareableLinkCreateBody**](ShareableLinkCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creativeSmartTextGenerate"></a>
# **creativeSmartTextGenerate**
> InlineResponse200 creativeSmartTextGenerate(Access_Token, opts)

Use smart text. [Smart Text Generate](https://business-api.tiktok.com/portal/docs?id&#x3D;1739084248002626)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartTextGenerateBody() // SmartTextGenerateBody | 
};
apiInstance.creativeSmartTextGenerate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartTextGenerateBody**](SmartTextGenerateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="discoveryDetail"></a>
# **discoveryDetail**
> InlineResponse200 discoveryDetail(hashtag_id, discovery_type, country_code, date_range, advertiser_id, Access_Token)

Get details of a popular hashtag. [Discovery Detail](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119047070721)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let hashtag_id = "hashtag_id_example"; // String | 
let discovery_type = "discovery_type_example"; // String | 
let country_code = "country_code_example"; // String | 
let date_range = "date_range_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.discoveryDetail(hashtag_id, discovery_type, country_code, date_range, advertiser_id, Access_Token, (error, data, response) => {
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
 **hashtag_id** | **String**|  |[required]  
 **discovery_type** | **String**|  |[required]  
 **country_code** | **String**|  |[required]  
 **date_range** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="discoveryTrendingList"></a>
# **discoveryTrendingList**
> InlineResponse200 discoveryTrendingList(discovery_type, advertiser_id, Access_Token, opts)

Get popular hashtags. [Trending List](https://business-api.tiktok.com/portal/docs?id&#x3D;1825119032526849)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let discovery_type = "discovery_type_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'country_code': "US", // String | 
  'category_name': "ALL", // String | 
  'date_range': "7DAY" // String | 
};
apiInstance.discoveryTrendingList(discovery_type, advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **discovery_type** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **country_code** | **String**|  | [optional] [default to US]
 **category_name** | **String**|  | [optional] [default to ALL]
 **date_range** | **String**|  | [optional] [default to 7DAY]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playableDelete"></a>
# **playableDelete**
> InlineResponse200 playableDelete(Access_Token, opts)

Delete a playable ad. [Playable Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1737733368940546)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PlayableDeleteBody() // PlayableDeleteBody | 
};
apiInstance.playableDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PlayableDeleteBody**](PlayableDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playableGet"></a>
# **playableGet**
> InlineResponse200 playableGet(advertiser_id, Access_Token, opts)

Use this endpoint to get a list of playables. [Playable Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732758495234)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'playable_id': "playable_id_example", // String | 
  'playable_url': "playable_url_example", // String | 
  'playable_name': "playable_name_example", // String | 
  'status': "status_example", // String | 
  'operation_status': "SAVED", // String | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.playableGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **playable_id** | **String**|  | [optional] 
 **playable_url** | **String**|  | [optional] 
 **playable_name** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 
 **operation_status** | **String**|  | [optional] [default to SAVED]
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playableSave"></a>
# **playableSave**
> InlineResponse200 playableSave(Access_Token, opts)

Use this endpoint to save a playable. [Playable Save](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732203851777)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.PlayableSaveBody() // PlayableSaveBody | 
};
apiInstance.playableSave(Access_Token, opts, (error, data, response) => {
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
 **body** | [**PlayableSaveBody**](PlayableSaveBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playableUpload"></a>
# **playableUpload**
> InlineResponse200 playableUpload(Access_Token, opts)

You can use this endpoint to upload Playable Ad contents. [Playable Upload](https://business-api.tiktok.com/portal/docs?id&#x3D;1737730926765057)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'advertiser_id': "advertiser_id_example", // String | 
  'file_id': "file_id_example", // String | 
  'playable_package': "playable_package_example", // Blob | 
  'upload_type': "upload_type_example" // String | 
};
apiInstance.playableUpload(Access_Token, opts, (error, data, response) => {
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
 **file_id** | **String**|  | [optional] 
 **playable_package** | **Blob**|  | [optional] 
 **upload_type** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="playableValidate"></a>
# **playableValidate**
> InlineResponse200 playableValidate(advertiser_id, playable_id, Access_Token)

Check the status of the playable. [Playable Validate](https://business-api.tiktok.com/portal/docs?id&#x3D;1737732054892545)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CreativeManagementApi();
let advertiser_id = "advertiser_id_example"; // String | 
let playable_id = "playable_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.playableValidate(advertiser_id, playable_id, Access_Token, (error, data, response) => {
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
 **playable_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

