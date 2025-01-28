# js_sdk.AdUploadBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **String** | Advertiser ID | [required] 
**auto_bind_enabled** | **Boolean** | Whether to automatically upload the fixed video to your creative library. Default value : False. Valid only when flaw_detect &#x3D; True and auto_fix_enabled &#x3D; True. | [optional] 
**auto_fix_enabled** | **Boolean** | Whether to automatically fix the detected issue. Default value : False. \\n If an issue is detected in your video and: \\n auto_fix_enabled &#x3D; False, then well return an error message with flaw types indicated. \\n auto_fix_enabled &#x3D;True, then well automatically fix all the issues and return fix_task_id and flaw_types. | [optional] 
**file_id** | **String** | The file_id of the file that you want to upload. This field is for files that are uploaded to the file repository. You can get file_id via the Upload Files endpoints. This field is required when upload_type is UPLOAD_BY_FILE_ID. | [optional] 
**file_name** | **String** | Video name. Length limit: 1 - 100 characters. The default value is the file name or the last path of the URL. If the file name contains more than 100 characters, only the first 100 characters will be used. Note: Videos under the same advertiser_id cannot have duplicated file names. If you get an error about duplicated file names, please rename the files or append timestamps to the original file names (for example, in the format of _, and upload the videos again. | [optional] 
**flaw_detect** | **Boolean** | Whether to automatically detect an issue in your video. Default value is False. | [optional] 
**is_third_party** | **Boolean** | The video is third party or not. | [optional] 
**upload_type** | **String** | Image upload method. Default value: UPLOAD_BY_FILE Enum values: UPLOAD_BY_FILE, UPLOAD_BY_URL, UPLOAD_BY_FILE_ID, UPLOAD_BY_VIDEO_ID. | [optional] 
**video_file** | **Blob** | Video file. Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**video_id** | **String** | Video ID. Required when upload_type is UPLOAD_BY_VIDEO_ID. | [optional] 
**video_signature** | **String** | Video MD5 (used for server verification). Required when upload_type is UPLOAD_BY_FILE. | [optional] 
**video_url** | **String** | Video url address, like http://xxx.xxx. Required when upload_type is UPLOAD_BY_URL. \\n (1) File size: better within 10MB. \\n (2)Verification: we will verify the data if you set a Content-MD5 in the response header. \\n (3) Others: ratio, format, resolution and bitrate limitation is the same as video_file. | [optional] 
