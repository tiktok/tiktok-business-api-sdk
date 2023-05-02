# js_sdk.AdStatusUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aco_ad_ids** | **[String]** | A list of ACO ad IDs. Only support &#x60;ENABLE&#x60; and &#x60;DISABLE&#x60; for ACO ads.  Allowed quantity- &#x60;1-20&#x60;. Either &#x60;ad_ids&#x60; or &#x60;aco_ad_ids&#x60; has to be set. | [optional] 
**ad_ids** | **[String]** | A list of ad IDs. Allowed quantity- &#x60;1-20&#x60;. Either &#x60;ad_ids&#x60; or &#x60;aco_ad_ids&#x60; has to be set. | [optional] 
**advertiser_id** | **String** | Advertiser ID | [required] 
**operation_status** | **String** | The operation being made. Enum values- &#x60;DELETE&#x60; (delete),&#x60; DISABLE&#x60; (pause), &#x60;ENABLE&#x60; (enable).  The status of deleted ads cannot be modified. | [required] 
