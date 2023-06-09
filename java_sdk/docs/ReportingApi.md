# ReportingApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportIntegratedGet**](ReportingApi.md#reportIntegratedGet) | **GET** /open_api/v1.3/report/integrated/get/ | Create a synchronous report task.  This endpoint can currently return the reporting data of up to 10,000 advertisements. If your number of advertisements exceeds 10,000, please use campaign_ids / adgroup_ids / ad_ids as a filter to obtain the reporting data of all advertisements in batches. Additionally, with CHUNK mode on, up to 20,000 advertisements can be returned. If you use campaign_ids / adgroup_ids / ad_ids as a filter, you can pass in up to 100 IDs at a time. [Reporting Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740302848100353)

<a name="reportIntegratedGet"></a>
# **reportIntegratedGet**
> Response reportIntegratedGet(advertiserId, reportType, dimensions, accessToken, serviceType, dataLevel, metrics, orderField, orderType, startDate, endDate, filtering, queryLifetime, page, pageSize, queryMode)

Create a synchronous report task.  This endpoint can currently return the reporting data of up to 10,000 advertisements. If your number of advertisements exceeds 10,000, please use campaign_ids / adgroup_ids / ad_ids as a filter to obtain the reporting data of all advertisements in batches. Additionally, with CHUNK mode on, up to 20,000 advertisements can be returned. If you use campaign_ids / adgroup_ids / ad_ids as a filter, you can pass in up to 100 IDs at a time. [Reporting Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740302848100353)

### Example
```java
// Import classes:
//import business_api.ApiException;
//import io.swagger.client.api.ReportingApi;


ReportingApi apiInstance = new ReportingApi();
String advertiserId = "advertiserId_example"; // String | Advertiser ID
String reportType = "reportType_example"; // String | Report type. Enum values- `BASIC` (basic report), `AUDIENCE` (audience report), `PLAYABLE_MATERIAL`  (playable ads report), `CATALOG` (DSA report). When `service_type` is `RESERVATION`, only `BASIC` report is supported. When `service_type` is `AUCTION`, `BASIC`, `AUDIENCE`, `PLAYABLE_MATERIAL`, and `CATALOG` reports are all supported.
List<String> dimensions = Arrays.asList("dimensions_example"); // List<String> | Grouping conditions. For example- `［\"campaign_id\", \"stat_time_day\"］` indicates that both `campaign_id` and `stat_time_day` (days) are grouped. For supported dimensions for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id=1738864835805186).
String accessToken = "accessToken_example"; // String | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
String serviceType = "serviceType_example"; // String | Ad service type. Enum values:`AUCTION`(Auction Ads), `RESERVATION`(Reservation Ads). Default value `AUCTION`.
String dataLevel = "dataLevel_example"; // String | The data level that you'd like to query in reports. Required when `report_type` is `BASIC`,`AUDIENCE` or `CATALOG`. Enum values `AUCTION_AD` Auction Ads, Ad level. `AUCTION_ADGROUP` Auction Ads, Ad Group level. `AUCTION_CAMPAIGN` Auction Ads, Campaign level. `AUCTION_ADVERTISER` Auction Ads, Advertiser level. `RESERVATION_AD` Reservation Ads, Ad level. `RESERVATION_ADGROUP` Reservation Ads, Ad Group level. RESERVATION_CAMPAIGN` Reservation Ads, Campaign level. `RESERVATION_ADVERTISER` Reservation Ads, Advertiser level.
List<String> metrics = Arrays.asList("metrics_example"); // List<String> | Metrics to query. Different report types support different metrics.  For supported metrics for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id=1738864835805186).
String orderField = "orderField_example"; // String | Sorting field. All supported metrics (excluding attribute metrics) support sorting. Not sorting by default.
String orderType = "orderType_example"; // String | Sorting order. Enum values- `ASC`, `DESC`. Default value- `DESC`.
String startDate = "startDate_example"; // String | Query start date (closed interval) in the format of `YYYY-MM-DD`. The date is based on the ad account time zone. This field is required when `query_lifetime` is `False`.
String endDate = "endDate_example"; // String | Query end date (closed interval) in the format of `YYYY-MM-DD`. The date is based on the ad account time zone. This field is required when `query_lifetime` is `False`.
List<FilteringReportIntegratedGet> filtering = Arrays.asList(new FilteringReportIntegratedGet()); // List<FilteringReportIntegratedGet> | Filtering conditions. Supported filtering conditions vary based on `service_type` and `data_level`. For filters supported in different report types, refer to the articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id=1738864835805186).
Boolean queryLifetime = true; // Boolean | Whether to request the lifetime metrics.  Default value- `False`. If `query_lifetime` = `True`, the `start_date` and `end_date` parameters will be ignored. The lifetime metric name is the same as the normal one.
Integer page = 56; // Integer | Current page number. Default value- `1`
Integer pageSize = 56; // Integer | Pagination size. Value range- 1-1000. Default value- `10`.
String queryMode = "queryMode_example"; // String | The way data is queried. Enum values- `REGULAR`, `CHUNK`. Default value- `REGULAR`.  With `CHUNK` mode on, data can be returned much faster in a more stable way. Meanwhile, pagination will not be working with `CHUNK`.
try {
    Response result = apiInstance.reportIntegratedGet(advertiserId, reportType, dimensions, accessToken, serviceType, dataLevel, metrics, orderField, orderType, startDate, endDate, filtering, queryLifetime, page, pageSize, queryMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#reportIntegratedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiserId** | **String**| Advertiser ID |[required] 
 **reportType** | **String**| Report type. Enum values- &#x60;BASIC&#x60; (basic report), &#x60;AUDIENCE&#x60; (audience report), &#x60;PLAYABLE_MATERIAL&#x60;  (playable ads report), &#x60;CATALOG&#x60; (DSA report). When &#x60;service_type&#x60; is &#x60;RESERVATION&#x60;, only &#x60;BASIC&#x60; report is supported. When &#x60;service_type&#x60; is &#x60;AUCTION&#x60;, &#x60;BASIC&#x60;, &#x60;AUDIENCE&#x60;, &#x60;PLAYABLE_MATERIAL&#x60;, and &#x60;CATALOG&#x60; reports are all supported. |[required] 
 **dimensions** | [**List&lt;String&gt;**](String.md)| Grouping conditions. For example- &#x60;［\&quot;campaign_id\&quot;, \&quot;stat_time_day\&quot;］&#x60; indicates that both &#x60;campaign_id&#x60; and &#x60;stat_time_day&#x60; (days) are grouped. For supported dimensions for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). |[required] 
 **accessToken** | **String**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). |[required] 
 **serviceType** | **String**| Ad service type. Enum values:&#x60;AUCTION&#x60;(Auction Ads), &#x60;RESERVATION&#x60;(Reservation Ads). Default value &#x60;AUCTION&#x60;. | [optional]
 **dataLevel** | **String**| The data level that you&#x27;d like to query in reports. Required when &#x60;report_type&#x60; is &#x60;BASIC&#x60;,&#x60;AUDIENCE&#x60; or &#x60;CATALOG&#x60;. Enum values &#x60;AUCTION_AD&#x60; Auction Ads, Ad level. &#x60;AUCTION_ADGROUP&#x60; Auction Ads, Ad Group level. &#x60;AUCTION_CAMPAIGN&#x60; Auction Ads, Campaign level. &#x60;AUCTION_ADVERTISER&#x60; Auction Ads, Advertiser level. &#x60;RESERVATION_AD&#x60; Reservation Ads, Ad level. &#x60;RESERVATION_ADGROUP&#x60; Reservation Ads, Ad Group level. RESERVATION_CAMPAIGN&#x60; Reservation Ads, Campaign level. &#x60;RESERVATION_ADVERTISER&#x60; Reservation Ads, Advertiser level. | [optional]
 **metrics** | [**List&lt;String&gt;**](String.md)| Metrics to query. Different report types support different metrics.  For supported metrics for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). | [optional]
 **orderField** | **String**| Sorting field. All supported metrics (excluding attribute metrics) support sorting. Not sorting by default. | [optional]
 **orderType** | **String**| Sorting order. Enum values- &#x60;ASC&#x60;, &#x60;DESC&#x60;. Default value- &#x60;DESC&#x60;. | [optional]
 **startDate** | **String**| Query start date (closed interval) in the format of &#x60;YYYY-MM-DD&#x60;. The date is based on the ad account time zone. This field is required when &#x60;query_lifetime&#x60; is &#x60;False&#x60;. | [optional]
 **endDate** | **String**| Query end date (closed interval) in the format of &#x60;YYYY-MM-DD&#x60;. The date is based on the ad account time zone. This field is required when &#x60;query_lifetime&#x60; is &#x60;False&#x60;. | [optional]
 **filtering** | [**List&lt;FilteringReportIntegratedGet&gt;**](FilteringReportIntegratedGet.md)| Filtering conditions. Supported filtering conditions vary based on &#x60;service_type&#x60; and &#x60;data_level&#x60;. For filters supported in different report types, refer to the articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). | [optional]
 **queryLifetime** | **Boolean**| Whether to request the lifetime metrics.  Default value- &#x60;False&#x60;. If &#x60;query_lifetime&#x60; &#x3D; &#x60;True&#x60;, the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters will be ignored. The lifetime metric name is the same as the normal one. | [optional]
 **page** | **Integer**| Current page number. Default value- &#x60;1&#x60; | [optional]
 **pageSize** | **Integer**| Pagination size. Value range- 1-1000. Default value- &#x60;10&#x60;. | [optional]
 **queryMode** | **String**| The way data is queried. Enum values- &#x60;REGULAR&#x60;, &#x60;CHUNK&#x60;. Default value- &#x60;REGULAR&#x60;.  With &#x60;CHUNK&#x60; mode on, data can be returned much faster in a more stable way. Meanwhile, pagination will not be working with &#x60;CHUNK&#x60;. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

