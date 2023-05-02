# FilteringAdGet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_ids** | **list[str]** | A list of Ad ID，quantity- &#x60;1-100&#x60; | [optional] 
**adgroup_ids** | **list[str]** | A list of Ad group ID, quantity- &#x60;1-100&#x60; | [optional] 
**billing_events** | **list[str]** | Billing events. For enum values, see [Enumeration - Billing Event](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). | [optional] 
**campaign_ids** | **list[str]** | A list of Campaign IDs, quantity- &#x60;1-100&#x60; | [optional] 
**creation_filter_end_time** | **str** | Filter by higher range of ad creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ads created earlier than this time will be returned. | [optional] 
**creation_filter_start_time** | **str** | Filter by lower range of ad creation time, in the format of &#x60;YYYY-MM-DD HH:MM:SS&#x60; (UTC time zone). Ads created later than this time will be returned. Suggestion A time range within 6 months is suggested when applying a creation time filter, to ensure that the success and speed of the task won&#x27;t be affected. | [optional] 
**objective_type** | **str** | Advertising Objective. For enum values, see [Enumeration - Advertising Objective](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). Note- Whether you choose &#x60;WEB_CONVERSIONS&#x60; or  &#x60;CONVERSIONS&#x60; as the objective filter, we will return data of both &#x60;WEB_CONVERSIONS&#x60; and  &#x60;CONVERSIONS&#x60;. | [optional] 
**primary_status** | **str** | Primary status. For enum values, see [Enumeration -Primary status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). | [optional] 
**secondary_status** | **str** | Ad status（secondary status). For enum values, see [Enumeration - Ad Status - Secondary Status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737174886619138). his field is not returned in the sandbox environment because the ad is not actually delivered. [Supported secondary statuses for a primary status](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1757239620352002) to learn about the valid values you can pass in via &#x60;secondary_status&#x60; for the primary status you specify. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

