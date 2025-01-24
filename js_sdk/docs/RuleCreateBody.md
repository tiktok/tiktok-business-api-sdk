# js_sdk.RuleCreateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **String** | Advertiser ID. | [required] 
**audience_sub_type** | **String** | Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL: Audience for non-Reach &amp; Frequency ads. REACH_FREQUENCY: Audience for Reach &amp; Frequency ads. It can only be used in Reach &amp; Frequency ads. Default value: NORMAL. | [optional] 
**audience_type** | **String** | Audience type. Enum values: ENGAGEMENT: Engagement Audience (with asset type as ad groups). ENGAGEMENT_ORGANIC_VIDEO: Organic Engagement Audience (with asset type as public video). ENGAGEMENT_LIVE_VIDEO: Live Engagement Audience (with asset type as live video). APP: App Activity Audience. PIXEL: Website Traffic Audience. LEAD_GENERATION: Lead Generation Audience. BUSINESS_ACCOUNT: Business Account Audience. TIKTOK_SHOP: Shop Activity Audience. OFFLINE: Offline Activity Audience. | [required] 
**custom_audience_name** | **String** | Audience name. Length limit: 128 characters. | [required] 
**identity_authorized_bc_id** | **String** | Required when identity_type is BC_AUTH_TT. ID of the Business Center that a TikTok Account User in Business Center identity is associated with. | [optional] 
**identity_id** | **String** | Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity ID. | [optional] 
**identity_type** | **String** | Required when audience_type is ENGAGEMENT_LIVE_VIDEO or ENGAGEMENT_ORGANIC_VIDEO. Identity type. Enum values: TT_USER, BC_AUTH_TT | [optional] 
**is_auto_refresh** | **Boolean** | Whether to turn on the audience auto-refresh function. Supported values: true, false. Default value: true. If you enable this feature, your audience will automatically refresh to include the latest user data according to the lookback window you set. If you disable this feature, your audience will not automatically refresh. | [optional] 
**retention_in_days** | **Number** | Number of days to retain the audience. Value range: 1-365. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy. | [optional] 
**rule_spec** | [**DmpcustomAudiencerulecreateRuleSpec**](DmpcustomAudiencerulecreateRuleSpec.md) |  | [required] 
