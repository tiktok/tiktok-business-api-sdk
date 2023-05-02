# Filtering

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | **str** | Keyword of the asset you are looking for | [optional] 
**user_email** | **str** | Email of the user that you want to get assets for. Note: &#x60;user_id&#x60; and &#x60;user_mail&#x60; cannot be set at the same time. For users that are in &#x60;BOUND&#x60; status, use &#x60;user_id&#x60; to get their assets. For users that are in &#x60;PENDING&#x60; status, use &#x60;user_email&#x60; to get their assets. Use &#x60;user_email&#x60; as filter only when you have set &#x60;asset_type&#x60; as &#x60;ADVERTISER&#x60; and the invitation for the user to join Business Center is still pending. | [optional] 
**user_id** | **str** | ID of the user that you want to get assets for. Note: &#x60;user_id&#x60; and &#x60;user_mail&#x60; cannot be set at the same time. For users that are in &#x60;BOUND&#x60; status, use &#x60;user_id&#x60; to get their assets. For users that are in &#x60;PENDING&#x60; status, use &#x60;user_email&#x60; to get their assets | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

