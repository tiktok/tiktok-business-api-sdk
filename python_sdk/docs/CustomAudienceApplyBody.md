# CustomAudienceApplyBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_mode** | **str** | Specific operation to be performed on the audience. Enum values: Apply, Disconnect. | [required] 
**adgroup_ids** | **list[str]** | A list of ad group IDs. Note: adgroup_ids and custom_audience_id should be under the same advertiser account. Otherwise, an error will occur. Lookalike Audience cannot be used in Reach &amp; Frequency ads. Otherwise, an error will occur. See below for more details. 1. If the custom_audience_id is a Lookalike Audience and the adgroup_ids are Reach &amp; Frequency ad groups, an error will occur. 2. If the custom_audience_id is a Lookalike Audience with the REACH_FREQUENCY audience subtype, an error will occur. | [required] 
**advertiser_id** | **str** | Advertiser ID. | [required] 
**context_info** | [**OpenApiv13dmpcustomAudienceapplyContextInfo**](OpenApiv13dmpcustomAudienceapplyContextInfo.md) |  | [optional] 
**custom_audience_id** | **str** | Custom audience ID. You can only pass one custom audience ID. | [required] 
**usage_mode** | **str** | Whether to include this audience in or exclude it from your ad groups. Required when action_mode is Apply. Enum values: Include, Exclude. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

