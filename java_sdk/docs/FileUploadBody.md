# FileUploadBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** | Advertiser ID. |[required]  
**calculateType** | **String** | Encryption type. The value for this field must be consistent with the actual file data. Otherwise, your upload will fail or you will not be able to create a valid audience. For enum values, see Enumeration - Encryption Type. |[required]  
**contextInfo** | [**dmpcustomAudiencefileuploadContextInfo**](dmpcustomAudiencefileuploadContextInfo.md) |  |  [optional]
**file** | [**File**](File.md) | Data files. Only supports CSV and TXT files. The file suffixes should exactly be .csv or .txt. |[required]  
**fileName** | **String** | FileName. |  [optional]
**fileSignature** | **String** | The file&#x27;s MD5, which is used for server-side verification. |[required]  
