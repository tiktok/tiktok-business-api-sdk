# js_sdk.FilteringCampaignGet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_ids** | **[String]** | Filter by campaign IDs. Allowable quantity- &#x60;1-100&#x60;. | [optional] 
**creation_filter_end_time** | **String** | Filter by higher range of campaign creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Campaigns created later than this time will be returned.Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected. | [optional] 
**creation_filter_start_time** | **String** | Filter by lower range of campaign creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Campaigns created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected | [optional] 
**objective_type** | **String** | Filter by  advertising objectives, see [Enumeration-Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). | [optional] 
**primary_status** | **String** | Primary status. For enum values, see [Enumeration-Primary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). | [optional] 
**secondary_status** | **String** | Filter by campaign status（Secondary status).  For enum values, see [Enumeration- Campaign Status - Secondary Status] | [optional] 
**targeting_broaden_required** | **Boolean** |  | [optional] 
