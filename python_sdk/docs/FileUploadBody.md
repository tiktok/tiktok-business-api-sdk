# FileUploadBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** | Advertiser ID. | [required] 
**calculate_type** | **str** | Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type. | [required] 
**context_info** | [**OpenApiv13dmpcustomAudiencefileuploadContextInfo**](OpenApiv13dmpcustomAudiencefileuploadContextInfo.md) |  | [optional] 
**file** | **str** | Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt. | [required] 
**file_name** | **str** | FileName. | [optional] 
**file_signature** | **str** | The file&#x27;s MD5, which is used for server-side verification. | [required] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

