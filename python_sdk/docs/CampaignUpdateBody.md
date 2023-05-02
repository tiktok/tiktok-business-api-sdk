# CampaignUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** | Advertiser ID | [required] 
**budget** | **float** | Campaign budget. Required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings. | [optional] 
**budget_mode** | **str** | Budget type. When Campaign Budgeet Optimization is enabled, only BUDGET_MODE_DAY is supported. To learn about how to set budget types, see Budget setting. | [optional] 
**campaign_id** | **str** | Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character. | [required] 
**campaign_name** | **str** | Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character. | [optional] 
**roas_bid** | **float** | ROAS (Return On Advertising Spend) goal to optimize value. This field can be modified only when Campaign Budget Optimization(budget_optimize_on) is enabled , optimization_goal is VALUE and deep_bid_type is VO_MIN_ROAS. Value range: 0.01-1000. | [optional] 
**special_industries** | **list[str]** | Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: The ONLY supported operation here is that you can clear all the values for the field if you&#x27;ve specifed it when creating a campaign. If you&#x27;ve not specified the field when creating a campaign, you cannot specify it now either. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

