# js_sdk.CampaignCreationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignCreate**](CampaignCreationApi.md#campaignCreate) | **POST** /open_api/v1.3/campaign/create/ | To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)
[**campaignGet**](CampaignCreationApi.md#campaignGet) | **GET** /open_api/v1.3/campaign/get/ | Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)
[**campaignGmvMaxCreate**](CampaignCreationApi.md#campaignGmvMaxCreate) | **POST** /open_api/v1.3/campaign/gmv_max/create/ | Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000988713089)
[**campaignGmvMaxInfo**](CampaignCreationApi.md#campaignGmvMaxInfo) | **GET** /open_api/v1.3/campaign/gmv_max/info/ | Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000968821762)
[**campaignGmvMaxSessionCreate**](CampaignCreationApi.md#campaignGmvMaxSessionCreate) | **POST** /open_api/v1.3/campaign/gmv_max/session/create/ | Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246967275522)
[**campaignGmvMaxSessionDelete**](CampaignCreationApi.md#campaignGmvMaxSessionDelete) | **POST** /open_api/v1.3/campaign/gmv_max/session/delete/ | Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246983475217)
[**campaignGmvMaxSessionGet**](CampaignCreationApi.md#campaignGmvMaxSessionGet) | **GET** /open_api/v1.3/campaign/gmv_max/session/get/ | Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247031331842)
[**campaignGmvMaxSessionList**](CampaignCreationApi.md#campaignGmvMaxSessionList) | **GET** /open_api/v1.3/campaign/gmv_max/session/list/ | Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246996436162)
[**campaignGmvMaxSessionUpdate**](CampaignCreationApi.md#campaignGmvMaxSessionUpdate) | **POST** /open_api/v1.3/campaign/gmv_max/session/update/ | Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247009119233)
[**campaignGmvMaxUpdate**](CampaignCreationApi.md#campaignGmvMaxUpdate) | **POST** /open_api/v1.3/campaign/gmv_max/update/ | Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001009002497)
[**campaignStatusUpdate**](CampaignCreationApi.md#campaignStatusUpdate) | **POST** /open_api/v1.3/campaign/status/update/ | Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)
[**campaignUpdate**](CampaignCreationApi.md#campaignUpdate) | **POST** /open_api/v1.3/campaign/update/ | To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)
[**gmvMaxBidRecommend**](CampaignCreationApi.md#gmvMaxBidRecommend) | **GET** /open_api/v1.3/gmv_max/bid/recommend/ | Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001024720897)
[**gmvMaxCustomAnchorVideoListGet**](CampaignCreationApi.md#gmvMaxCustomAnchorVideoListGet) | **GET** /open_api/v1.3/gmv_max/custom_anchor_video_list/get/ | Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1830215925061633)
[**gmvMaxOccupiedCustomShopAdsList**](CampaignCreationApi.md#gmvMaxOccupiedCustomShopAdsList) | **GET** /open_api/v1.3/gmv_max/occupied_custom_shop_ads/list/ | Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001136924674)
[**smartPlusCampaignCreate**](CampaignCreationApi.md#smartPlusCampaignCreate) | **POST** /open_api/v1.3/smart_plus/campaign/create/ | Create a new campaign [Smart Plus Campaign Create]
[**smartPlusCampaignGet**](CampaignCreationApi.md#smartPlusCampaignGet) | **GET** /open_api/v1.3/smart_plus/campaign/get/ | Retrieve campaign details [Smart Plus Campaign Get]
[**smartPlusCampaignStatusUpdate**](CampaignCreationApi.md#smartPlusCampaignStatusUpdate) | **POST** /open_api/v1.3/smart_plus/campaign/status/update/ | Update campaign status [Smart Plus Campaign Status Update]
[**smartPlusCampaignUpdate**](CampaignCreationApi.md#smartPlusCampaignUpdate) | **POST** /open_api/v1.3/smart_plus/campaign/update/ | Update an existing campaign [Smart Plus Campaign Update]

<a name="campaignCreate"></a>
# **campaignCreate**
> InlineResponse200 campaignCreate(Access_Token, opts)

To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CampaignCreateBody() // CampaignCreateBody | Campaign create body parameters
};
apiInstance.campaignCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CampaignCreateBody**](CampaignCreateBody.md)| Campaign create body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGet"></a>
# **campaignGet**
> InlineResponse200 campaignGet(advertiser_id, Access_Token, opts)

Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'filtering': new js_sdk.FilteringCampaignGet(), // FilteringCampaignGet | Filtering Parameters
  'page': 56, // Number | Current page
  'page_size': 56, // Number | Page size
  'fields': ["fields_example"] // [String] | Supported values include`campaign_id `, ` campaign_name `, ` advertiser_id `, `budget `, `budget_mode `, `status `, `operation_status`, `objective `, `objective_type `, `create_time `, `modify_time`, `is_new_structure`, `campaign_app_profile_page_state` , `special_industries`, `secondary_status`.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default.
};
apiInstance.campaignGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **filtering** | [**FilteringCampaignGet**](FilteringCampaignGet.md)| Filtering Parameters | [optional] 
 **page** | **Number**| Current page | [optional] 
 **page_size** | **Number**| Page size | [optional] 
 **fields** | [**[String]**](String.md)| Supported values include&#x60;campaign_id &#x60;, &#x60; campaign_name &#x60;, &#x60; advertiser_id &#x60;, &#x60;budget &#x60;, &#x60;budget_mode &#x60;, &#x60;status &#x60;, &#x60;operation_status&#x60;, &#x60;objective &#x60;, &#x60;objective_type &#x60;, &#x60;create_time &#x60;, &#x60;modify_time&#x60;, &#x60;is_new_structure&#x60;, &#x60;campaign_app_profile_page_state&#x60; , &#x60;special_industries&#x60;, &#x60;secondary_status&#x60;.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxCreate"></a>
# **campaignGmvMaxCreate**
> InlineResponse200 campaignGmvMaxCreate(Access_Token, opts)

Create GMV Max campaign [Smart Plus GMV Max Campaign Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000988713089)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.GmvMaxCreateBody() // GmvMaxCreateBody | 
};
apiInstance.campaignGmvMaxCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**GmvMaxCreateBody**](GmvMaxCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxInfo"></a>
# **campaignGmvMaxInfo**
> InlineResponse200 campaignGmvMaxInfo(advertiser_id, campaign_id, Access_Token)

Get GMV Max campaign info [Smart Plus GMV Max Campaign Info](https://business-api.tiktok.com/portal/docs?id&#x3D;1822000968821762)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = "advertiser_id_example"; // String | 
let campaign_id = "campaign_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.campaignGmvMaxInfo(advertiser_id, campaign_id, Access_Token, (error, data, response) => {
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
 **campaign_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxSessionCreate"></a>
# **campaignGmvMaxSessionCreate**
> InlineResponse200 campaignGmvMaxSessionCreate(Access_Token, opts)

Create GMV Max session [Smart Plus GMV Max Session Create](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246967275522)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SessionCreateBody() // SessionCreateBody | 
};
apiInstance.campaignGmvMaxSessionCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SessionCreateBody**](SessionCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxSessionDelete"></a>
# **campaignGmvMaxSessionDelete**
> InlineResponse200 campaignGmvMaxSessionDelete(Access_Token, opts)

Delete GMV Max session [Smart Plus GMV Max Session Delete](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246983475217)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SessionDeleteBody() // SessionDeleteBody | 
};
apiInstance.campaignGmvMaxSessionDelete(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SessionDeleteBody**](SessionDeleteBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxSessionGet"></a>
# **campaignGmvMaxSessionGet**
> InlineResponse200 campaignGmvMaxSessionGet(advertiser_id, session_ids, Access_Token)

Get GMV Max session info [Smart Plus GMV Max Session Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247031331842)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = "advertiser_id_example"; // String | 
let session_ids = ["session_ids_example"]; // [String] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.campaignGmvMaxSessionGet(advertiser_id, session_ids, Access_Token, (error, data, response) => {
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
 **session_ids** | [**[String]**](String.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxSessionList"></a>
# **campaignGmvMaxSessionList**
> InlineResponse200 campaignGmvMaxSessionList(campaign_id, advertiser_id, Access_Token)

Get GMV Max session list [Smart Plus GMV Max Session List](https://business-api.tiktok.com/portal/docs?id&#x3D;1835246996436162)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let campaign_id = "campaign_id_example"; // String | 
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.campaignGmvMaxSessionList(campaign_id, advertiser_id, Access_Token, (error, data, response) => {
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
 **campaign_id** | **String**|  |[required]  
 **advertiser_id** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignGmvMaxSessionUpdate"></a>
# **campaignGmvMaxSessionUpdate**
> InlineResponse200 campaignGmvMaxSessionUpdate(Access_Token, opts)

Update GMV Max session [Smart Plus GMV Max Session Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1835247009119233)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SessionUpdateBody() // SessionUpdateBody | 
};
apiInstance.campaignGmvMaxSessionUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SessionUpdateBody**](SessionUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGmvMaxUpdate"></a>
# **campaignGmvMaxUpdate**
> InlineResponse200 campaignGmvMaxUpdate(Access_Token, opts)

Update GMV Max campaign [Smart Plus GMV Max Campaign Update](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001009002497)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.GmvMaxUpdateBody() // GmvMaxUpdateBody | 
};
apiInstance.campaignGmvMaxUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**GmvMaxUpdateBody**](GmvMaxUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignStatusUpdate"></a>
# **campaignStatusUpdate**
> InlineResponse200 campaignStatusUpdate(Access_Token, opts)

Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CampaignStatusUpdateBody() // CampaignStatusUpdateBody | Campaign status update body parameters
};
apiInstance.campaignStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CampaignStatusUpdateBody**](CampaignStatusUpdateBody.md)| Campaign status update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignUpdate"></a>
# **campaignUpdate**
> InlineResponse200 campaignUpdate(Access_Token, opts)

To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.CampaignUpdateBody() // CampaignUpdateBody | Campaign update body parameters
};
apiInstance.campaignUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**CampaignUpdateBody**](CampaignUpdateBody.md)| Campaign update body parameters | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gmvMaxBidRecommend"></a>
# **gmvMaxBidRecommend**
> InlineResponse200 gmvMaxBidRecommend(advertiser_id, store_id, shopping_ads_type, optimization_goal, Access_Token, opts)

Get GMV Max bid recommendation [Smart Plus GMV Max Bid Recommend](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001024720897)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = "advertiser_id_example"; // String | 
let store_id = "store_id_example"; // String | 
let shopping_ads_type = "shopping_ads_type_example"; // String | 
let optimization_goal = "optimization_goal_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'item_group_ids': ["item_group_ids_example"], // [String] | 
  'identity_id': "identity_id_example" // String | 
};
apiInstance.gmvMaxBidRecommend(advertiser_id, store_id, shopping_ads_type, optimization_goal, Access_Token, opts, (error, data, response) => {
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
 **store_id** | **String**|  |[required]  
 **shopping_ads_type** | **String**|  |[required]  
 **optimization_goal** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  
 **item_group_ids** | [**[String]**](String.md)|  | [optional] 
 **identity_id** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxCustomAnchorVideoListGet"></a>
# **gmvMaxCustomAnchorVideoListGet**
> InlineResponse200 gmvMaxCustomAnchorVideoListGet(advertiser_id, campaign_custom_anchor_video_id, custom_anchor_video_list, Access_Token)

Get GMV Max custom anchor video list [Smart Plus GMV Max Custom Anchor Video List Get](https://business-api.tiktok.com/portal/docs?id&#x3D;1830215925061633)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = 789; // Number | 
let campaign_custom_anchor_video_id = 789; // Number | 
let custom_anchor_video_list = [new js_sdk.CustomAnchorVideoList()]; // [CustomAnchorVideoList] | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.gmvMaxCustomAnchorVideoListGet(advertiser_id, campaign_custom_anchor_video_id, custom_anchor_video_list, Access_Token, (error, data, response) => {
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
 **advertiser_id** | **Number**|  |[required]  
 **campaign_custom_anchor_video_id** | **Number**|  |[required]  
 **custom_anchor_video_list** | [**[CustomAnchorVideoList]**](CustomAnchorVideoList.md)|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gmvMaxOccupiedCustomShopAdsList"></a>
# **gmvMaxOccupiedCustomShopAdsList**
> InlineResponse200 gmvMaxOccupiedCustomShopAdsList(advertiser_id, store_id, asset_ids, occupied_asset_type, Access_Token)

Get GMV Max occupied custom shop ads [Smart Plus GMV Max Occupied Custom Shop Ads List](https://business-api.tiktok.com/portal/docs?id&#x3D;1822001136924674)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = "advertiser_id_example"; // String | 
let store_id = "store_id_example"; // String | 
let asset_ids = ["asset_ids_example"]; // [String] | 
let occupied_asset_type = "occupied_asset_type_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).

apiInstance.gmvMaxOccupiedCustomShopAdsList(advertiser_id, store_id, asset_ids, occupied_asset_type, Access_Token, (error, data, response) => {
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
 **store_id** | **String**|  |[required]  
 **asset_ids** | [**[String]**](String.md)|  |[required]  
 **occupied_asset_type** | **String**|  |[required]  
 **Access_Token** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required]  

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusCampaignCreate"></a>
# **smartPlusCampaignCreate**
> InlineResponse200 smartPlusCampaignCreate(Access_Token, opts)

Create a new campaign [Smart Plus Campaign Create]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusCampaignCreateBody() // SmartPlusCampaignCreateBody | 
};
apiInstance.smartPlusCampaignCreate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusCampaignCreateBody**](SmartPlusCampaignCreateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusCampaignGet"></a>
# **smartPlusCampaignGet**
> InlineResponse200 smartPlusCampaignGet(advertiser_id, Access_Token, opts)

Retrieve campaign details [Smart Plus Campaign Get]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let advertiser_id = "advertiser_id_example"; // String | 
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'fields': ["fields_example"], // [String] | 
  'filtering': new js_sdk.FilteringSmartPlusCampaignGet(), // FilteringSmartPlusCampaignGet | 
  'page': 1, // Number | 
  'page_size': 10 // Number | 
};
apiInstance.smartPlusCampaignGet(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **fields** | [**[String]**](String.md)|  | [optional] 
 **filtering** | [**FilteringSmartPlusCampaignGet**](FilteringSmartPlusCampaignGet.md)|  | [optional] 
 **page** | **Number**|  | [optional] [default to 1]
 **page_size** | **Number**|  | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartPlusCampaignStatusUpdate"></a>
# **smartPlusCampaignStatusUpdate**
> InlineResponse200 smartPlusCampaignStatusUpdate(Access_Token, opts)

Update campaign status [Smart Plus Campaign Status Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusCampaignStatusUpdateBody() // SmartPlusCampaignStatusUpdateBody | 
};
apiInstance.smartPlusCampaignStatusUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusCampaignStatusUpdateBody**](SmartPlusCampaignStatusUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartPlusCampaignUpdate"></a>
# **smartPlusCampaignUpdate**
> InlineResponse200 smartPlusCampaignUpdate(Access_Token, opts)

Update an existing campaign [Smart Plus Campaign Update]

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.CampaignCreationApi();
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'body': new js_sdk.SmartPlusCampaignUpdateBody() // SmartPlusCampaignUpdateBody | 
};
apiInstance.smartPlusCampaignUpdate(Access_Token, opts, (error, data, response) => {
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
 **body** | [**SmartPlusCampaignUpdateBody**](SmartPlusCampaignUpdateBody.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

