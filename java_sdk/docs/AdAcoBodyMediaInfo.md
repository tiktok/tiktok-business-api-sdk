# AdAcoBodyMediaInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identityId** | **String** | Identity ID. Required when you are not using Spark Ads (&#x60;tiktok_item_id&#x60;). |  [optional]
**identityType** | **String** | Identity type. Required when you are not using Spark Ads (&#x60;tiktok_item_id&#x60;). The only supported value is &#x60;CUSTOMIZED_USER&#x60;. |  [optional]
**imageInfo** | [**List&lt;AdAcoBodyMediaInfoImageInfo&gt;**](AdAcoBodyMediaInfoImageInfo.md) | Image information. When you want to upload image materials (&#x60;video_info&#x60; is NOT included in the request), this field will be used as image materials. When you want to upload video materials (&#x60;video_info&#x60; is included in the request), this field will be used as the video cover. Only 1 picture can be submitted in each &#x60;image_info&#x60; object. |  [optional]
**tiktokItemId** | **String** | The ID of the TikTok post to be used as an ad (Spark Ad). Pass in the &#x60;tiktok_item_id&#x60; you get from the response of the [/tt_video/info/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738376324021250) and  [/identity/video/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740218475032577) endpoints. |  [optional]
**videoInfo** | [**AdAcoBodyMediaInfoVideoInfo**](AdAcoBodyMediaInfoVideoInfo.md) |  |  [optional]
