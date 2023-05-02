# CampaignUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** | Advertiser ID |[required]  
**budget** | **Float** | Campaign budget. Required when budget_mode is BUDGET_MODE_DAY or BUDGET_MODE_TOTAL. To learn about the mininum budget and how to set budget types, see Budget settings. |  [optional]
**budgetMode** | **String** | Budget type. When Campaign Budgeet Optimization is enabled, only BUDGET_MODE_DAY is supported. To learn about how to set budget types, see Budget setting. |  [optional]
**campaignId** | **String** | Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character. |[required]  
**campaignName** | **String** | Campaign name. It can contain up to 512 characters. Emoji is not supported. Note: Each word in Chinese or Japanese counts as two characters, while each letter in English counts as one character. |  [optional]
**roasBid** | **Float** | ROAS (Return On Advertising Spend) goal to optimize value. This field can be modified only when Campaign Budget Optimization(budget_optimize_on) is enabled , optimization_goal is VALUE and deep_bid_type is VO_MIN_ROAS. Value range: 0.01-1000. |  [optional]
**specialIndustries** | **List&lt;String&gt;** | Ad categories. Enum values: HOUSING(Ads for real estate listings, homeowners insurance, mortgage loans or other related opportunities.) EMPLOYMENT(Ads for job offers, internship, professional certification programs or other related opportunities.) CREDIT(Ads for credit card offers, auto loans, long-term financing or other related opportunities.) Note: The ONLY supported operation here is that you can clear all the values for the field if you&#x27;ve specifed it when creating a campaign. If you&#x27;ve not specified the field when creating a campaign, you cannot specify it now either. |  [optional]
