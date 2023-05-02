# js_sdk.AudienceApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dmpCustomAudienceList**](AudienceApi.md#dmpCustomAudienceList) | **GET** /open_api/v1.3/dmp/custom_audience/list/ | Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)

<a name="dmpCustomAudienceList"></a>
# **dmpCustomAudienceList**
> InlineResponse200 dmpCustomAudienceList(advertiser_id, Access_Token, opts)

Get all audiences [DMP cusom audience list](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739940506015746)

### Example
```javascript
import {js_sdk} from 'business_api_client';

let apiInstance = new js_sdk.AudienceApi();
let advertiser_id = "advertiser_id_example"; // String | Advertiser ID
let Access_Token = "Access_Token_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
let opts = { 
  'custom_audience_ids': ["custom_audience_ids_example"], // [String] | A list of Audience IDs. Length range is [1, 100]
  'page': 56, // Number | Current page number. Default value: 1. Value range: ≥ 1
  'page_size': 56 // Number | Page size. Defaults is 10. Value range: 1-100
};
apiInstance.dmpCustomAudienceList(advertiser_id, Access_Token, opts, (error, data, response) => {
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
 **custom_audience_ids** | [**[String]**](String.md)| A list of Audience IDs. Length range is [1, 100] | [optional] 
 **page** | **Number**| Current page number. Default value: 1. Value range: ≥ 1 | [optional] 
 **page_size** | **Number**| Page size. Defaults is 10. Value range: 1-100 | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

