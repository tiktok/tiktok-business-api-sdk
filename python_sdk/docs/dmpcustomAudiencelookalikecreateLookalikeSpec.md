# dmpcustomAudiencelookalikecreateLookalikeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_size** | **str** | Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD. | [optional] 
**include_source** | **bool** | Whether to include the source audience in the new lookalike audience. | [optional] 
**location_ids** | **list[str]** | IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations. | [optional] 
**mobile_os** | **str** | Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details. | [optional] 
**placements** | **list[str]** | The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz &amp; BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details. | [optional] 
**source_audience_id** | **str** | Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

