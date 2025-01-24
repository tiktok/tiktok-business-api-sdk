# js_sdk.CustomAudienceApplyBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_mode** | **String** | Specific operation to be performed on the audience. Enum values: Apply, Disconnect. | [required] 
**adgroup_ids** | **[String]** | A list of ad group IDs. Note: adgroup_ids and custom_audience_id should be under the same advertiser account. Otherwise, an error will occur. Lookalike Audience cannot be used in Reach &amp; Frequency ads. Otherwise, an error will occur. See below for more details. 1. If the custom_audience_id is a Lookalike Audience and the adgroup_ids are Reach &amp; Frequency ad groups, an error will occur. 2. If the custom_audience_id is a Lookalike Audience with the REACH_FREQUENCY audience subtype, an error will occur. | [required] 
**advertiser_id** | **String** | Advertiser ID. | [required] 
**context_info** | [**DmpcustomAudienceapplyContextInfo**](DmpcustomAudienceapplyContextInfo.md) |  | [optional] 
**custom_audience_id** | **String** | Custom audience ID. You can only pass one custom audience ID. | [required] 
**usage_mode** | **String** | Whether to include this audience in or exclude it from your ad groups. Required when action_mode is Apply. Enum values: Include, Exclude. | [optional] 
