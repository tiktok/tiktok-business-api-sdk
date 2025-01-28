# js_sdk.DmpsavedAudiencecreateActions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_category_ids** | **[String]** | Required when actions has been specified and valid only when TikTok placement is the only placement selected in your ad group. IDs of the action categories (behaviors) or hashtags that you want to target. You can get action category IDs via /tool/action_category/. | [optional] 
**action_period** | **Number** | Required when actions has been specified. The time period to include actions from. Enum values: 0, 7, 15. If action_scene is CREATOR_RELATED or HASHTAG_RELATED, 0 will be used regardless of the value you pass in. 0 means that there is no definite timeframe to select actions from. | [optional] 
**action_scene** | **String** | Required when actions has been specified. Where you can collect information about user actions. Enum values: VIDEO_RELATED, CREATOR_RELATED, HASHTAG_RELATED. | [optional] 
**video_user_actions** | **[String]** | Required when actions has been specified. Video-related Actions. If action_scene is VIDEO_RELATED, the allowed values are: WATCHED_TO_END,LIKED,COMMENTED,SHARED. If action_scene is CREATOR_RELATED, the allowed values are: FOLLOWING, VIEW_HOMEPAGE. If action_scene is HASHTAG_RELATED, the allowed value is VIEW_HASHTAG. | [optional] 
