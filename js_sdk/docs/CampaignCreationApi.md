# js_sdk.CampaignCreationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignCreate**](CampaignCreationApi.md#campaignCreate) | **POST** /open_api/v1.3/campaign/create/ | To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)
[**campaignGet**](CampaignCreationApi.md#campaignGet) | **GET** /open_api/v1.3/campaign/get/ | Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)
[**campaignStatusUpdate**](CampaignCreationApi.md#campaignStatusUpdate) | **POST** /open_api/v1.3/campaign/status/update/ | Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)
[**campaignUpdate**](CampaignCreationApi.md#campaignUpdate) | **POST** /open_api/v1.3/campaign/update/ | To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)

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

