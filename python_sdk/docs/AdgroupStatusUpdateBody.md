# AdgroupStatusUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_ids** | **list[str]** | The ID of the ad group(s) to be operated. The allowed quantity range is &#x60;1-20&#x60;. | [required] 
**advertiser_id** | **str** | Advertiser ID | [required] 
**operation_status** | **str** | The operation being made.Enum values- &#x60;DELETE&#x60; (delete),&#x60; DISABLE&#x60; (pause), &#x60;ENABLE&#x60; (enable). The status of deleted ads cannot be modified. | [required] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

