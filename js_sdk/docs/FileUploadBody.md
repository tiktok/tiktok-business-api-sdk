# js_sdk.FileUploadBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **String** | Advertiser ID. | [required] 
**calculate_type** | **String** | Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type. | [required] 
**context_info** | [**DmpcustomAudiencefileuploadContextInfo**](DmpcustomAudiencefileuploadContextInfo.md) |  | [optional] 
**file** | **Blob** | Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt. | [required] 
**file_name** | **String** | FileName. | [optional] 
**file_signature** | **String** | The file&#x27;s MD5, which is used for server-side verification. | [required] 
