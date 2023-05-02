# CampaignCreationApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignCreate**](CampaignCreationApi.md#campaignCreate) | **POST** /open_api/v1.3/campaign/create/ | To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)
[**campaignGet**](CampaignCreationApi.md#campaignGet) | **GET** /open_api/v1.3/campaign/get/ | Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)
[**campaignStatusUpdate**](CampaignCreationApi.md#campaignStatusUpdate) | **POST** /open_api/v1.3/campaign/status/update/ | Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)
[**campaignUpdate**](CampaignCreationApi.md#campaignUpdate) | **POST** /open_api/v1.3/campaign/update/ | To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)

<a name="campaignCreate"></a>
# **campaignCreate**
> Response campaignCreate(accessToken, body)

To create a campaign. To advertise on TikTok Ads, you need to create a campaign and set the Advertising objectives and budget. A regular campaign can contain one or more ad groups. [Campaign Create](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739318962329602)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CampaignCreateBody body = new CampaignCreateBody(); // CampaignCreateBody | Campaign create body parameters
try {
    Response result = apiInstance.campaignCreate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CampaignCreateBody**](CampaignCreateBody.md)| Campaign create body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignGet"></a>
# **campaignGet**
> Response campaignGet(advertiserId, accessToken, filtering, page, pageSize, fields)

Get all campaigns for an ad account. Optionally, you can use filters in your request to return only certain campaigns. [Campaign get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739315828649986)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
FilteringCampaignGet filtering = new FilteringCampaignGet(); // FilteringCampaignGet | Filtering Parameters
Integer page = 56; // Integer | Current page
Integer pageSize = 56; // Integer | Page size
List<String> fields = Arrays.asList("fields_example"); // List<String> | Supported values include`campaign_id `, ` campaign_name `, ` advertiser_id `, `budget `, `budget_mode `, `status `, `operation_status`, `objective `, `objective_type `, `create_time `, `modify_time`, `is_new_structure`, `campaign_app_profile_page_state` , `special_industries`, `secondary_status`.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default.
try {
    Response result = apiInstance.campaignGet(advertiserId, accessToken, filtering, page, pageSize, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **filtering** | [**FilteringCampaignGet**](FilteringCampaignGet.md)| Filtering Parameters | [optional]
 **page** | **Integer**| Current page | [optional]
 **pageSize** | **Integer**| Page size | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| Supported values include&#x60;campaign_id &#x60;, &#x60; campaign_name &#x60;, &#x60; advertiser_id &#x60;, &#x60;budget &#x60;, &#x60;budget_mode &#x60;, &#x60;status &#x60;, &#x60;operation_status&#x60;, &#x60;objective &#x60;, &#x60;objective_type &#x60;, &#x60;create_time &#x60;, &#x60;modify_time&#x60;, &#x60;is_new_structure&#x60;, &#x60;campaign_app_profile_page_state&#x60; , &#x60;special_industries&#x60;, &#x60;secondary_status&#x60;.For the exhaustive of the fields, see the Response section. When not specified, all fields are returned by default. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="campaignStatusUpdate"></a>
# **campaignStatusUpdate**
> Response campaignStatusUpdate(accessToken, body)

Enable, disable or delete a campaign. [Campaign status update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320994354178)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | 
CampaignStatusUpdateBody body = new CampaignStatusUpdateBody(); // CampaignStatusUpdateBody | Campaign status update body parameters
try {
    Response result = apiInstance.campaignStatusUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignStatusUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**|  |[required] 
 **body** | [**CampaignStatusUpdateBody**](CampaignStatusUpdateBody.md)| Campaign status update body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignUpdate"></a>
# **campaignUpdate**
> Response campaignUpdate(accessToken, body)

To modify a campaign after it has been created. Information like campaign name, budget, and budget type can be updated. [Campaign Update](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739320422086657)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.CampaignCreationApi;


CampaignCreationApi apiInstance = new CampaignCreationApi();
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
CampaignUpdateBody body = new CampaignUpdateBody(); // CampaignUpdateBody | Campaign update body parameters
try {
    Response result = apiInstance.campaignUpdate(accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignCreationApi#campaignUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **body** | [**CampaignUpdateBody**](CampaignUpdateBody.md)| Campaign update body parameters | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

