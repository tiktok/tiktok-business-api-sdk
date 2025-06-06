# CustomAudienceCreateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** | Advertiser ID. |[required]  
**audienceEnhancement** | **Boolean** |  |  [optional]
**audienceSubType** | **String** | Audience sub type, indicating the type of ads that the audience can be used. Enum values: NORMAL Normal audience. It can be used in non-R&amp;F ads. REACH_FREQUENCY: Audience for Reach &amp; Frequency. It can only be used in R&amp;F ads. Default: NORMAL. |  [optional]
**calculateType** | **String** | Encryption type. calculate_type should be the same as all the files in the file_path, or you will not get a audience id or get an invalid audience id. For enum values, see Enumeration - Encryption Type. |[required]  
**customAudienceName** | **String** | Audience name. Maximum of 128 characters. |[required]  
**filePaths** | **List&lt;String&gt;** | List of file paths. The recommended size is &lt;50 to ensure a stable request. You can use /dmp/custom_audience/update/ to append more data files to the audience. You get the file_path in response after you upload your file calling Upload audience files endpoint. |[required]  
**retentionInDays** | **Integer** | Number of days to retain the audience. Value range: [1, 365]. Note: If this field is passed, the expiration date will be the specified number of retention days from the date when the audience was created. Any operations to the audience CANNOT reset the expiration date. If this field is not passed, the expiration date will be 365 days from the last time the audience was applied to an active ad group or modified. Applying the audience to an active ad group or modifying the audience will reset the expiration date. To learn about the actions that will reset the expiration date, refer to the Help Center article Audience Expiration Policy. |  [optional]
