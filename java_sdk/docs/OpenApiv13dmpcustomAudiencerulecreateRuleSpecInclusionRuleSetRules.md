# OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetRules

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventSourceIds** | **List&lt;String&gt;** | Required when audience_type is not ENGAGEMENT or LEAD_GENERATION. List of event source IDs of the rule. For an Engagement Audience, use ad group IDs as event source IDs. If not specified, all available event source IDs will be used. For an Organic Engagement Audience, use TikTok post IDs as event source IDs. You can use /identity/video/get/ to get TikTok post IDs. The maximum allowed number of TikTok post IDs is 10. For a Live Engagement Audience, use live video ID as event source IDs. You can use /identity/live/get/ to get live video IDs. The maximum allowed number of live video IDs is 10. For an App Activity Audience, use App IDs as event source IDs. For a Website Traffic Audience, use pixel IDs as event source IDs. For a Lead Generation Audience, do not pass in this field. Otherwise, an error will occur. If not specified, all available event source IDs will be used. For a Business Account Audience, use core user IDs of the advertisers. You can use /user/info/ to get a core user ID. For a Shop Activity Audience, use TikTok Shop IDs as event source IDs. You can use /store/list/ to get TikTok Shop IDs. For an Offline Activity Audience, use Offline Event set IDs as event source IDs. You can use /offline/get/ to get Offline Event set IDs. |  [optional]
**filterSet** | [**OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet**](OpenApiv13dmpcustomAudiencerulecreateRuleSpecInclusionRuleSetFilterSet.md) |  |  [optional]
**retentionDays** | **Integer** | Audience lookback window. For enum values, see Enumerations - Lookback window. Note: If audience_type &#x3D; BUSINESS_ACCOUNT, and the value in the filters object is not BUSINESS ACCOUNT PROFILE FOLLOW, then retention_days must be 7, 14, or 30. If audience_type &#x3D; ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO, then retention_days must be 7, 14, or 30. To avoid confusion between retention_days and retention_in_days, we&#x27;ll rename retention_days in the next API version. |[required]  