# js_sdk.BidRecommendBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **String** | Advertiser ID. | [required] 
**campaign_id** | **String** | Campaign ID. | [optional] [default to &#x27;&quot;0&quot;&#x27;]
**external_action** | **String** | Conversion event for the ad group. | [optional] 
**location_ids** | **[String]** | IDs of the locations that you want to target. | [required] 
**objective_type** | **String** | Campaign objective. The current API endpoint only supports Traffic and Website conversions objectives. For enum values and descriptions, see Objectives. Note: This API is being revamped to support larger function scope and more accurate result. Please stay tuned for updates. | [required] 
