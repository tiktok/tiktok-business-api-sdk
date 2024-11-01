# js_sdk.AdAcoBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_id** | **String** | Ad group ID. The ID should be of the ad group that you will enable Automated Creative Optimization for, and &#x60;creative_material_mode&#x60; for the ad group must be set as &#x60;DYNAMIC&#x60;. | [optional] 
**advertiser_id** | **String** | Advertiser ID.  | [required] 
**avatar_icon_list** | [**[AdAcoBodyAvatarIconList]**](AdAcoBodyAvatarIconList.md) | Avatar image list. | [optional] 
**call_to_action_list** | [**[AdAcoBodyCallToActionList]**](AdAcoBodyCallToActionList.md) | Call-to-action list. For TikTok ads, either this field or &#x60;call_to_action_id&#x60; must be specified. If both are specified, this field will be ignored. | [optional] 
**card_list** | [**[AdAcoBodyCardList]**](AdAcoBodyCardList.md) | Card ID list. Length range- [0,1]. | [optional] 
**common_material** | [**AdAcoBodyCommonMaterial**](AdAcoBodyCommonMaterial.md) |  | [optional] 
**deeplink_list** | [**[AdAcoBodyDeeplinkList]**](AdAcoBodyDeeplinkList.md) | List of open URLs. Length range- [0,1] | [optional] 
**display_name_list** | [**[AdAcoBodyDisplayNameList]**](AdAcoBodyDisplayNameList.md) | Display names. | [optional] 
**landing_page_urls** | [**[AdAcoBodyLandingPageUrls]**](AdAcoBodyLandingPageUrls.md) | Multiple landing page URLs. | [optional] 
**media_info_list** | [**[AdAcoBodyMediaInfoList]**](AdAcoBodyMediaInfoList.md) | List of media information. | [optional] 
**page_list** | [**[AdAcoBodyPageList]**](AdAcoBodyPageList.md) | Page ID list. | [optional] 
**title_list** | [**[AdAcoBodyTitleList]**](AdAcoBodyTitleList.md) | List of ad titles (also called ad texts). Ad titles are shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them. | [optional] 
