# FileImageAdUpload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** | Advertiser ID | [required] 
**file_id** | **str** | The file_id of the image that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. | [optional] 
**file_name** | **str** | Image name. Length limit：1-100 characters. The default value is the file name. If the final filename has more than 100 chars, it will be cut off. | [optional] 
**image_file** | **str** | Picture file, required when upload_type is UPLOAD_BY_FILE. | [optional] 
**image_signature** | **str** | Md5 of the image (used for server verification). Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**image_url** | **str** | Image url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. | [optional] 
**upload_type** | **str** | Image upload method. Default value UPLOAD_BY_FILE.   Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

