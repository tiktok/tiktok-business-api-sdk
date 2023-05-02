# js_sdk.AdgroupStatusUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_ids** | **[String]** | The ID of the ad group(s) to be operated. The allowed quantity range is &#x60;1-20&#x60;. | [required] 
**advertiser_id** | **String** | Advertiser ID | [required] 
**operation_status** | **String** | The operation being made.Enum values- &#x60;DELETE&#x60; (delete),&#x60; DISABLE&#x60; (pause), &#x60;ENABLE&#x60; (enable). The status of deleted ads cannot be modified. | [required] 
