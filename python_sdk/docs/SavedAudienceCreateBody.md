# SavedAudienceCreateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**list[dmpsavedAudiencecreateActions]**](dmpsavedAudiencecreateActions.md) | A list of action category objects. | [optional] 
**advertiser_id** | **str** | Advertiser ID. | [required] 
**age_groups** | **list[str]** | Age groups you want to target. For enum values, see Enumeration - Targeting Age Group. | [optional] 
**audience_ids** | **list[str]** | List of audience IDs. You can get audience IDs via the /dmp/custom_audience/list/ endpoint. | [optional] 
**carrier_ids** | **list[str]** | Carriers that you want to target. Use /tool/carrier/ endpoint to get a list of carriers. A carrier is valid only when the in_use field for the carrier is true. The carriers must be consistent with the location(s) that you want to target. | [optional] 
**device_model_ids** | **list[str]** | IDs of the device models that you want to target. Use /tool/device_model/ to get the complete list of device model IDs and their statuses, and only active devices (is_active &#x3D; true in the response of /tool/device_model/) can be used to create ads. Note: Device model (device_model_ids) and device price (device_price_ranges) cannot be set at the same time. | [optional] 
**device_price_ranges** | **list[int]** |  | [optional] 
**excluded_audience_ids** | **list[str]** | List of audience IDs to be excluded. You can get audience IDs via the /dmp/custom_audience/list/ endpoint. | [optional] 
**gender** | **str** | Gender that you want to target. Enum values: GENDER_FEMALE,GENDER_MALE,GENDER_UNLIMITED | [optional] 
**interest_category_ids** | **list[str]** | Interest classification. You can use /tool/target_recommend_tags/ to get a list of recommended interest categories based on your targeting regions and your industries, or use /tool/interest_category/ endpoint to get the complete list of interest categories. If the interest is specified, users who do not meet the interest target will be excluded during delivery. Do not specify if you wish to target everyone. | [optional] 
**interest_keyword_ids** | **list[str]** | IDs of interest keywords that you want to use to target audience. You can use /tool/interest_keyword/recommend/ to get recommended interest keywords. | [optional] 
**languages** | **list[str]** | Codes of the languages that you want to target. You can get language codes via /tool/language/, and if you don&#x27;t want to limit the languages you target, assign an empty value to this field or do not pass in this field. | [optional] 
**location_ids** | **list[str]** | IDs of the locations that you want to target. To get the available locations and corresponding IDs, use the /tool/region/ or /tool/targeting/search/ endpoint. Note: Overlapping targeted locations are not supported. For instance, you cannot target the U.S. and the state of California at the same time. DMA-level and city-level (or lower) targeting is only available in certain countries, and the access is managed by allowlist. If you would like to access it, please contact your TikTok representative for allowlisting. | [required] 
**min_android_version** | **str** | Minimum device Android version. For enum values, see Enumeration - Minimum Android Version. | [optional] 
**min_ios_version** | **str** | Minimum iOS version. For enum values, see Enumeration - Minimum iOS Version. | [optional] 
**network_types** | **list[str]** | Device connection types that you want to target. Default: unlimited. For enum values, see Enumeration - Connection Type. | [optional] 
**operating_systems** | **list[str]** | Device operating systems that you want to target. Enum values: ANDROID, IOS. Only one value is allowed. | [optional] 
**saved_audience_name** | **str** | Saved Audience name. Character limit is 512 and cannot contain emoji. | [required] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

