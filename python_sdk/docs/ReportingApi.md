"""
 Copyright 2023 TikTok Pte. Ltd.

 This source code is licensed under the MIT license found in
 the LICENSE file in the root directory of this source tree.
"""
# business_api_client.ReportingApi

All URIs are relative to *https://business-api.tiktok.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_integrated_get**](ReportingApi.md#report_integrated_get) | **GET** /open_api/v1.3/report/integrated/get/ | Create a synchronous report task.  This endpoint can currently return the reporting data of up to 10,000 advertisements. If your number of advertisements exceeds 10,000, please use campaign_ids / adgroup_ids / ad_ids as a filter to obtain the reporting data of all advertisements in batches. Additionally, with CHUNK mode on, up to 20,000 advertisements can be returned. If you use campaign_ids / adgroup_ids / ad_ids as a filter, you can pass in up to 100 IDs at a time. [Reporting Get](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740302848100353)

# **report_integrated_get**
> InlineResponse200 report_integrated_get(advertiser_id, report_type, dimensions, access_token, service_type=service_type, data_level=data_level, metrics=metrics, order_field=order_field, order_type=order_type, start_date=start_date, end_date=end_date, filtering=filtering, query_lifetime=query_lifetime, page=page, page_size=page_size, query_mode=query_mode)

Create a synchronous report task.  This endpoint can currently return the reporting data of up to 10,000 advertisements. If your number of advertisements exceeds 10,000, please use campaign_ids / adgroup_ids / ad_ids as a filter to obtain the reporting data of all advertisements in batches. Additionally, with CHUNK mode on, up to 20,000 advertisements can be returned. If you use campaign_ids / adgroup_ids / ad_ids as a filter, you can pass in up to 100 IDs at a time. [Reporting Get](https://ads.tiktok.com/marketing_api/docs?id=1740302848100353)

### Example
```python
from __future__ import print_function
import time
import business_api_client
from business_api_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = business_api_client.ReportingApi()
advertiser_id = 'advertiser_id_example' # str | Advertiser ID
report_type = 'report_type_example' # str | Report type. Enum values- `BASIC` (basic report), `AUDIENCE` (audience report), `PLAYABLE_MATERIAL`  (playable ads report), `CATALOG` (DSA report). When `service_type` is `RESERVATION`, only `BASIC` report is supported. When `service_type` is `AUCTION`, `BASIC`, `AUDIENCE`, `PLAYABLE_MATERIAL`, and `CATALOG` reports are all supported.
dimensions = ['dimensions_example'] # list[str] | Grouping conditions. For example- `［\"campaign_id\", \"stat_time_day\"］` indicates that both `campaign_id` and `stat_time_day` (days) are grouped. For supported dimensions for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id=1738864835805186).
access_token = 'access_token_example' # str | Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id=1738373164380162).
service_type = 'service_type_example' # str | Ad service type. Enum values:`AUCTION`(Auction Ads), `RESERVATION`(Reservation Ads). Default value `AUCTION`. (optional)
data_level = 'data_level_example' # str | The data level that you'd like to query in reports. Required when `report_type` is `BASIC`,`AUDIENCE` or `CATALOG`. Enum values `AUCTION_AD` Auction Ads, Ad level. `AUCTION_ADGROUP` Auction Ads, Ad Group level. `AUCTION_CAMPAIGN` Auction Ads, Campaign level. `AUCTION_ADVERTISER` Auction Ads, Advertiser level. `RESERVATION_AD` Reservation Ads, Ad level. `RESERVATION_ADGROUP` Reservation Ads, Ad Group level. RESERVATION_CAMPAIGN` Reservation Ads, Campaign level. `RESERVATION_ADVERTISER` Reservation Ads, Advertiser level. (optional)
metrics = ['metrics_example'] # list[str] | Metrics to query. Different report types support different metrics.  For supported metrics for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id=1738864835805186). (optional)
order_field = 'order_field_example' # str | Sorting field. All supported metrics (excluding attribute metrics) support sorting. Not sorting by default. (optional)
order_type = 'order_type_example' # str | Sorting order. Enum values- `ASC`, `DESC`. Default value- `DESC`. (optional)
start_date = 'start_date_example' # str | Query start date (closed interval) in the format of `YYYY-MM-DD`. The date is based on the ad account time zone. This field is required when `query_lifetime` is `False`. (optional)
end_date = 'end_date_example' # str | Query end date (closed interval) in the format of `YYYY-MM-DD`. The date is based on the ad account time zone. This field is required when `query_lifetime` is `False`. (optional)
filtering = [business_api_client.FilteringReportIntegratedGet()] # list[FilteringReportIntegratedGet] | Filtering conditions. Supported filtering conditions vary based on `service_type` and `data_level`. For filters supported in different report types, refer to the articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id=1738864835805186). (optional)
query_lifetime = true # bool | Whether to request the lifetime metrics.  Default value- `False`. If `query_lifetime` = `True`, the `start_date` and `end_date` parameters will be ignored. The lifetime metric name is the same as the normal one. (optional)
page = 56 # int | Current page number. Default value- `1` (optional)
page_size = 56 # int | Pagination size. Value range- 1-1000. Default value- `10`. (optional)
query_mode = 'query_mode_example' # str | The way data is queried. Enum values- `REGULAR`, `CHUNK`. Default value- `REGULAR`.  With `CHUNK` mode on, data can be returned much faster in a more stable way. Meanwhile, pagination will not be working with `CHUNK`. (optional)

try:
    # Create a synchronous report task.  This endpoint can currently return the reporting data of up to 10,000 advertisements. If your number of advertisements exceeds 10,000, please use campaign_ids / adgroup_ids / ad_ids as a filter to obtain the reporting data of all advertisements in batches. Additionally, with CHUNK mode on, up to 20,000 advertisements can be returned. If you use campaign_ids / adgroup_ids / ad_ids as a filter, you can pass in up to 100 IDs at a time. [Reporting Get](https://ads.tiktok.com/marketing_api/docs?id=1740302848100353)
    api_response = api_instance.report_integrated_get(advertiser_id, report_type, dimensions, access_token, service_type=service_type, data_level=data_level, metrics=metrics, order_field=order_field, order_type=order_type, start_date=start_date, end_date=end_date, filtering=filtering, query_lifetime=query_lifetime, page=page, page_size=page_size, query_mode=query_mode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingApi->report_integrated_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advertiser_id** | **str**| Advertiser ID | [required]
 **report_type** | **str**| Report type. Enum values- &#x60;BASIC&#x60; (basic report), &#x60;AUDIENCE&#x60; (audience report), &#x60;PLAYABLE_MATERIAL&#x60;  (playable ads report), &#x60;CATALOG&#x60; (DSA report). When &#x60;service_type&#x60; is &#x60;RESERVATION&#x60;, only &#x60;BASIC&#x60; report is supported. When &#x60;service_type&#x60; is &#x60;AUCTION&#x60;, &#x60;BASIC&#x60;, &#x60;AUDIENCE&#x60;, &#x60;PLAYABLE_MATERIAL&#x60;, and &#x60;CATALOG&#x60; reports are all supported. | [required]
 **dimensions** | [**list[str]**](str.md)| Grouping conditions. For example- &#x60;［\&quot;campaign_id\&quot;, \&quot;stat_time_day\&quot;］&#x60; indicates that both &#x60;campaign_id&#x60; and &#x60;stat_time_day&#x60; (days) are grouped. For supported dimensions for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). | [required]
 **access_token** | **str**| Authorized access token. For details, see [Authentication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738373164380162). | [required]
 **service_type** | **str**| Ad service type. Enum values:&#x60;AUCTION&#x60;(Auction Ads), &#x60;RESERVATION&#x60;(Reservation Ads). Default value &#x60;AUCTION&#x60;. | [optional] 
 **data_level** | **str**| The data level that you&#x27;d like to query in reports. Required when &#x60;report_type&#x60; is &#x60;BASIC&#x60;,&#x60;AUDIENCE&#x60; or &#x60;CATALOG&#x60;. Enum values &#x60;AUCTION_AD&#x60; Auction Ads, Ad level. &#x60;AUCTION_ADGROUP&#x60; Auction Ads, Ad Group level. &#x60;AUCTION_CAMPAIGN&#x60; Auction Ads, Campaign level. &#x60;AUCTION_ADVERTISER&#x60; Auction Ads, Advertiser level. &#x60;RESERVATION_AD&#x60; Reservation Ads, Ad level. &#x60;RESERVATION_ADGROUP&#x60; Reservation Ads, Ad Group level. RESERVATION_CAMPAIGN&#x60; Reservation Ads, Campaign level. &#x60;RESERVATION_ADVERTISER&#x60; Reservation Ads, Advertiser level. | [optional] 
 **metrics** | [**list[str]**](str.md)| Metrics to query. Different report types support different metrics.  For supported metrics for each report type, see the corresponding articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). | [optional] 
 **order_field** | **str**| Sorting field. All supported metrics (excluding attribute metrics) support sorting. Not sorting by default. | [optional] 
 **order_type** | **str**| Sorting order. Enum values- &#x60;ASC&#x60;, &#x60;DESC&#x60;. Default value- &#x60;DESC&#x60;. | [optional] 
 **start_date** | **str**| Query start date (closed interval) in the format of &#x60;YYYY-MM-DD&#x60;. The date is based on the ad account time zone. This field is required when &#x60;query_lifetime&#x60; is &#x60;False&#x60;. | [optional] 
 **end_date** | **str**| Query end date (closed interval) in the format of &#x60;YYYY-MM-DD&#x60;. The date is based on the ad account time zone. This field is required when &#x60;query_lifetime&#x60; is &#x60;False&#x60;. | [optional] 
 **filtering** | [**list[FilteringReportIntegratedGet]**](FilteringReportIntegratedGet.md)| Filtering conditions. Supported filtering conditions vary based on &#x60;service_type&#x60; and &#x60;data_level&#x60;. For filters supported in different report types, refer to the articles under [Report types](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738864835805186). | [optional] 
 **query_lifetime** | **bool**| Whether to request the lifetime metrics.  Default value- &#x60;False&#x60;. If &#x60;query_lifetime&#x60; &#x3D; &#x60;True&#x60;, the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters will be ignored. The lifetime metric name is the same as the normal one. | [optional] 
 **page** | **int**| Current page number. Default value- &#x60;1&#x60; | [optional] 
 **page_size** | **int**| Pagination size. Value range- 1-1000. Default value- &#x60;10&#x60;. | [optional] 
 **query_mode** | **str**| The way data is queried. Enum values- &#x60;REGULAR&#x60;, &#x60;CHUNK&#x60;. Default value- &#x60;REGULAR&#x60;.  With &#x60;CHUNK&#x60; mode on, data can be returned much faster in a more stable way. Meanwhile, pagination will not be working with &#x60;CHUNK&#x60;. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

