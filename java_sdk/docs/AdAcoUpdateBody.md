# AdAcoUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupId** | **String** | Ad group ID. The ID should be of the ad group that you will enable Automated Creative Optimization for, and &#x60;creative_material_mode&#x60; for the ad group must be set as &#x60;DYNAMIC&#x60;. |  [optional]
**advertiserId** | **String** | Advertiser ID.  |[required]  
**avatarIconList** | [**List&lt;AdAcoBodyAvatarIconList&gt;**](AdAcoBodyAvatarIconList.md) | Avatar image list. |  [optional]
**callToActionList** | [**List&lt;AdAcoBodyCallToActionList&gt;**](AdAcoBodyCallToActionList.md) | Call-to-action list. For TikTok ads, either this field or &#x60;call_to_action_id&#x60; must be specified. If both are specified, this field will be ignored. |  [optional]
**cardList** | [**List&lt;AdAcoBodyCardList&gt;**](AdAcoBodyCardList.md) | Card ID list. Length range- [0,1]. |  [optional]
**commonMaterial** | [**AdAcoBodyCommonMaterial**](AdAcoBodyCommonMaterial.md) |  |  [optional]
**deeplinkList** | [**List&lt;AdAcoBodyDeeplinkList&gt;**](AdAcoBodyDeeplinkList.md) | List of open URLs. Length range- [0,1] |  [optional]
**displayNameList** | [**List&lt;AdAcoBodyDisplayNameList&gt;**](AdAcoBodyDisplayNameList.md) | Display names. |  [optional]
**landingPageUrls** | [**List&lt;AdAcoBodyLandingPageUrls&gt;**](AdAcoBodyLandingPageUrls.md) | Multiple landing page URLs. |  [optional]
**mediaInfoList** | [**List&lt;AdAcoBodyMediaInfoList&gt;**](AdAcoBodyMediaInfoList.md) | List of media information. |  [optional]
**pageList** | [**List&lt;AdAcoBodyPageList&gt;**](AdAcoBodyPageList.md) | Page ID list. |  [optional]
**titleList** | [**List&lt;AdAcoBodyTitleList&gt;**](AdAcoBodyTitleList.md) | List of ad titles (also called ad texts). Ad titles are shown to your audience as part of your ad creative, to deliver the message you intend to communicate to them. |  [optional]
