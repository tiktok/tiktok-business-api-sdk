# js_sdk.CustomAudienceUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | Modification type. This field is valid when file_paths is passed. Enum values: APPEND: Upload files to expand the Customer File audience. Only data not included in the original file will be added. REMOVE: Upload files to remove the Customer File audience. Only the data that coincide with the original file will be removed. REPLACE: Upload files to replace the Customer File audience. All the data in the original file will be replaced. Default value: REPLACE. Note: The APPEND, REMOVE and REPLACE operations will fail if the audience size is less than 1,000 after the operation. | [optional] [default to &#x27;REPLACE&#x27;]
**advertiser_id** | **String** | Advertiser ID. | [required] 
**audience_enhancement** | **Boolean** |  | [optional] 
**audience_sub_type** | **String** | Audience sub type, indicating the type of ads that the audience can be used for. The allowed enum value: REACH_FREQUENCY(To enable the audience to be used in Reach &amp; Frequency campaigns). It means you can only convert audience sub type from NORMAL to REACH_FREQUENCY, but not the other way round. Note: If you update this field, changes to other data fields will be ignored. If you want to update a Lookalike audience, you cannot change the audience_sub_type to REACH_FREQUENCY. Otherwise, an error will occur. | [optional] 
**context_info** | [**DmpcustomAudienceapplyContextInfo**](DmpcustomAudienceapplyContextInfo.md) |  | [optional] 
**custom_audience_id** | **String** | Custom audience ID. | [required] 
**custom_audience_name** | **String** | New name for the audience. Length limit: 128 characters. You must pass in either this field or file_paths. | [optional] 
**file_paths** | **[String]** | The files you upload to update the Customer File audience. You must pass in either this field or custom_audience_name. The recommended size is &lt;50 per request to ensure stability. Once you pass in this field, you can specify the modification type (APPEND, REMOVE or REPLACE) via action. The files must be encrypted with the same encryption method/type with the audience that you want to update. | [optional] 
