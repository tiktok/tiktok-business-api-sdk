# AdStatusUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aco_ad_ids** | **list[str]** | A list of ACO ad IDs. Only support &#x60;ENABLE&#x60; and &#x60;DISABLE&#x60; for ACO ads.  Allowed quantity- &#x60;1-20&#x60;. Either &#x60;ad_ids&#x60; or &#x60;aco_ad_ids&#x60; has to be set. | [optional] 
**ad_ids** | **list[str]** | A list of ad IDs. Allowed quantity- &#x60;1-20&#x60;. Either &#x60;ad_ids&#x60; or &#x60;aco_ad_ids&#x60; has to be set. | [optional] 
**advertiser_id** | **str** | Advertiser ID | [required] 
**operation_status** | **str** | The operation being made. Enum values- &#x60;DELETE&#x60; (delete),&#x60; DISABLE&#x60; (pause), &#x60;ENABLE&#x60; (enable).  The status of deleted ads cannot be modified. | [required] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

