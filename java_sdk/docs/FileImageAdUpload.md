# FileImageAdUpload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** | Advertiser ID |[required]  
**fileId** | **String** | The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. |  [optional]
**fileName** | **String** | Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off. |  [optional]
**imageFile** | [**File**](File.md) | Picture file, required when upload_type is UPLOAD_BY_FILE. |  [optional]
**imageSignature** | **String** | Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE. |  [optional]
**imageUrl** | **String** | Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. |  [optional]
**uploadType** | **String** | Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID. |  [optional]
