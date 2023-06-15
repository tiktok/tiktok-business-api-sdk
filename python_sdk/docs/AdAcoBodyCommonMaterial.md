# AdAcoBodyCommonMaterial

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_name** | **str** | Ad name. Set as \&quot; \&quot; (Empty string) for it to be automatically generated. The format of auto-generated ad name is- creative name + creation time (e.g. adcreative20210111190739). Character limit is 512 and cannot contain emoji. | [optional] 
**call_to_action_id** | **str** | The ID of the CTA portfolio that you want to use in your ads. A CTA portfolio is a group of auto-optimized CTAs. For details about auto-optimized CTAs, see [CTA recommendations &gt; Dynamic CTAs](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1740307296329730) | [optional] 
**creative_authorized** | **bool** | Whether you grant displaying some of your ads in our TikTok for Business Creative Center. Only valid for non-US advertisers, the default value is &#x60;false&#x60;. | [optional] 
**fallback_type** | **str** | Fallback Type. If the audience do not have the app installed, you can have them fall back to install the app, or to view a specific web page.  Allowed values- &#x60;APP_INSTALL &#x60;, &#x60;WEBSITE&#x60;. If website is chosen, you need to specify the url via &#x60;landing_page_urls&#x60; field. | [optional] 
**identity_id** | **str** | Identity ID, required when you use Spark Ads (&#x60;tiktok_item_id&#x60;). | [optional] 
**identity_type** | **str** | Identity type. Required when you use Spark Ads (&#x60;tiktok_item_id&#x60;). Enum values- &#x60;AUTH_CODE&#x60;, &#x60;TT_USER&#x60;. For details about identities, see [Identities](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1738958351620097). | [optional] 
**is_smart_creative** | **bool** | Whether the ad is a Smart Creative ad. Default value- &#x60;False&#x60;. Smart Creative is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. | [optional] 
**playable_url** | **str** | Playable material url, valid only in Pangle placement. You can get the url via the [/playable/get/](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1737732758495234) endpoint. Note that all ads in the same ad group share the same playable material. | [optional] 
**tracking_info** | [**AdAcoBodyCommonMaterialTrackingInfo**](AdAcoBodyCommonMaterialTrackingInfo.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

