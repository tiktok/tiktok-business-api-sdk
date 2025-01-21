# adgroupcreateActions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionCategoryIds** | **List&lt;String&gt;** | IDs of the action categories (behaviors) or hashtags that you want to target. This field is valid only when TikTok placement is the only placement selected. |  [optional]
**actionPeriod** | **Integer** | Select a time period to include actions from. Supported values- &#x60;0&#x60;, &#x60;7&#x60;, &#x60;15&#x60;. If &#x60;action_scene&#x60; is &#x60;CREATOR_RELATED&#x60; or &#x60;HASHTAG_RELATED&#x60;, 0 will be used regardless of the value you pass in. &#x60;0&#x60; means that there is no definite timeframe to select actions from. |  [optional]
**actionScene** | **String** | Where you can collect information about user actions. Enum values- &#x60;VIDEO_RELATED&#x60;, &#x60;CREATOR_RELATED&#x60;, &#x60;HASHTAG_RELATED&#x60;. |  [optional]
**videoUserActions** | **List&lt;String&gt;** | Video-related Actions. If &#x60;action_scene&#x60; is &#x60;VIDEO_RELATED&#x60;, the allowed values are- &#x60;WATCHED_TO_END&#x60;,&#x60;LIKED&#x60;,&#x60;COMMENTED&#x60;,&#x60;SHARED&#x60;. If &#x60;action_scene&#x60; is &#x60;CREATOR_RELATED&#x60;, the allowed values are- &#x60;FOLLOWING&#x60;, &#x60;VIEW_HOMEPAGE&#x60;. If &#x60;action_scene&#x60; is &#x60;HASHTAG_RELATED&#x60;, the allowed value is &#x60;VIEW_HASHTAG&#x60;. |  [optional]
