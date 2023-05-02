# js_sdk.FilteringAdgroupGet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_ids** | **[String]** | List of Ad group ID. Allowed number of IDs- &#x60;1-100&#x60; | [optional] 
**adgroup_name** | **String** | Ad group name. | [optional] 
**billing_events** | **[String]** | Events that you want to pay for.  For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). | [optional] 
**campaign_ids** | **[String]** | List of campaign IDs. Allowed number of IDs- &#x60;1-100&#x60; | [optional] 
**creation_filter_end_time** | **String** | Filter by higher range of ad group creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ad groups created earlier than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected. | [optional] 
**creation_filter_start_time** | **String** | Filter by lower range of ad group creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ad groups created later than this time will be returned. Suggestion- A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected. | [optional] 
**objective_type** | **String** | Advertising objective. For details, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). Whether you choose &#x60;WEB_CONVERSIONS&#x60; or  &#x60;CONVERSIONS&#x60; as the objective filter, we will return data of both &#x60;WEB_CONVERSIONS&#x60; and  &#x60;CONVERSIONS&#x60;. | [optional] 
**primary_status** | **String** | Primary status. For enum values, see [Enumeration - Primary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). The default value is &#x60;STATUS_NOT_DELETE&#x60;, which returns ad groups in all status excluding &#x60;STATUS_DELETE&#x60;. If you want to get ad groups in all status including &#x60;STATUS_DELETE&#x60;, use &#x60;STATUS_ALL&#x60; instead. | [optional] 
**secondary_status** | **String** | Ad group status（secondary status). For enum values, see [Enumeration - Ad Group Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). his field is not returned in the sandbox environment because the ad group is not actually delivered. See [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1757239620352002) to learn about the valid values you can pass in via &#x60;secondary_status&#x60; for the primary status you specify. | [optional] 
