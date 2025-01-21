# creativeportfoliocreateStickerParam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color** | **str** | Background color of the sticker. Enum values: &#x60;ORANGE&#x60;(orange), &#x60;BLACK&#x60;(black), &#x60;RED&#x60;(red), &#x60;BLUE&#x60;(blue) | [optional] 
**cutoff_time** | **str** | Countdown deadline (when &#x60;sticker_type&#x60;&#x3D; &#x60;COUNTDOWN&#x60; or &#x60;REMINDER_COUNTDOWN&#x60;) or LIVE start time (when &#x60;sticker_type&#x60;&#x3D;&#x60;LIVE_REMINDER_COUNTDOWN&#x60;) for the Countdown Sticker, in the format of \&quot;2022-10-30 00:00:00\&quot; (UTC+0 Time). Note: The time you pass in via this field is regarded as UTC+0 time by default and you cannot modify the default time zone | [optional] 
**display_angle** | **int** | Sticker display angle. Value range: &#x60;[-180, +180]&#x60;. &#x60;+90&#x60; means to rotate the sticker clockwise by 90 degrees | [optional] 
**landing_page_url** | **str** | The landing page URL you will be redirected to when you click the reminder after the countdown for an non-LIVE event ends. Required when &#x60;sticker_type&#x60; is &#x60;REMINDER_COUNTDOWN&#x60; | [optional] 
**live_tiktok_user_id** | **str** | TikTok user ID of the LIVE event host. Required when &#x60;sticker_type&#x60; is &#x60;LIVE_REMINDER_COUNTDOWN&#x60;. After specifying this field, you will be redirected to the host LIVE room when you click the reminder for a LIVE event | [optional] 
**opacity** | **str** | Sticker opacity. Enum values: &#x60;0.7&#x60;, &#x60;0.8&#x60;, &#x60;0.9&#x60;, &#x60;1&#x60;. The lower the value, the more transparent the sticker will be | [optional] 
**position_x** | **int** | The x-axis coordinate relative to the top-left corner of the screen. Value range: 50-109 | [optional] 
**position_y** | **int** | The y-axis coordinate relative to the top-left corner of the screen. Value range: 141-506 | [optional] 
**reminder_time** | **str** | The time set for the reminder. Required when &#x60;sticker_type&#x60;&#x3D; &#x60;REMINDER_COUNTDOWN&#x60; or &#x60;LIVE_REMINDER_COUNTDOWN&#x60;.For non-LIVE stickers (when &#x60;sticker_type&#x60;&#x3D; &#x60;REMINDER_COUNTDOWN&#x60;), the enum values are:&#x60;ONE_MINUTE_EARLIER&#x60;: send the reminder one minute before the non-LIVE event.&#x60;ONE_HOUR_EARLIER &#x60;: send the reminder one hour before the non-LIVE event.&#x60;ONE_DAY_EARLIER&#x60;: send the reminder one day before the non-LIVE event.For LIVE stickers (when &#x60;sticker_type&#x60;&#x3D; &#x60;LIVE_REMINDER_COUNTDOWN&#x60;), the enum values are: &#x60;ONE_MINUTE_AFTER&#x60;: send the reminder one minute after the LIVE event starts.&#x60;FIVE_MINUTES_AFTER&#x60;: send the reminder five minutes after the LIVE event starts.&#x60;TEN_MINUTES_AFTER&#x60;: send the reminder ten minutes after the LIVE event starts.  | [optional] 
**size** | **str** |  | [optional] 
**sticker_type** | **str** | Sticker type. Default value: &#x60;COUNTDOWN&#x60;. Enum values: &#x60;COUNTDOWN&#x60;: A Countdown Sticker with no reminder.&#x60;REMINDER_COUNTDOWN&#x60;: A Countdown Sticker with reminder for a non-LIVE event.&#x60;LIVE_REMINDER_COUNTDOWN&#x60;: A Countdown Sticker with reminder for a LIVE event. | [optional] 
**title** | **str** | Sticker title. The maximum length is 54, in UTF-8 bytes (54 English letters or 18 Chinese characters), and the hashtag symbol (#) is not supported | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

