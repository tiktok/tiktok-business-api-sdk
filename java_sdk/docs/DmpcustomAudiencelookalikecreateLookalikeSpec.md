# DmpcustomAudiencelookalikecreateLookalikeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audienceSize** | **String** | Size of lookalike audience. Enum values: NARROW, BALANCED and BROAD. |  [optional]
**includeSource** | **Boolean** | Whether to include the source audience in the new lookalike audience. |  [optional]
**locationIds** | **List&lt;String&gt;** | IDs of the locations that you want to target. For enum values, see Enumeration-Lookalike Locations. |  [optional]
**mobileOs** | **String** | Device operating systems. Enum values support ALL for both ANDROID and IOS. See Enumeration-Audience Management-Lookalike System for details. |  [optional]
**placements** | **List&lt;String&gt;** | The apps where you want to deliver your ads. Enum values: TikTok, TopBuzz &amp; BuzzVideo, Pangle. See Enumeration - Audience Management-Lookalike Placement for details. |  [optional]
**sourceAudienceId** | **String** | Source (seed) audience ID. Source audience cannot be an existing lookalike audience. Note: The size of source audience should be no less than 100. |  [optional]
