# PortfolioCreateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** | The advertiser ID | [required] 
**creative_portfolio_type** | **str** | Type of the portfolio. Enum values: &#x60;CTA&#x60; (call-to-action text), &#x60;CARD&#x60; (card), &#x60;PREMIUM_BADGE&#x60; (badge pop-up)， &#x60;STICKER&#x60; (countdown sticker) ,&#x60;DOWNLOAD_CARD&#x60; (Download Card), &#x60;PRODUCT_CARD&#x60; (Product Card). The default value is &#x60;CTA&#x60;. See examples of Countdown Stickers Download Cards and in [Portfolios](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739361803446273), and see examples of Countdown Sticker and Download Card in [Countdown Sticker](https://ads.tiktok.com/help/article?aid&#x3D;10007423) and [Download Card](https://ads.tiktok.com/help/article?aid&#x3D;10007086).Note: You can only create one countdown sticker at a time.Countdown Sticker is an allowlist-only feature for auction ads with the advertising objective (&#x60;objective_type&#x60;) as App Installs (&#x60;APP_INSTALL&#x60;), App Promotion (&#x60;APP_PROMOTION&#x60;), Traffic (&#x60;TRAFFIC&#x60;), or Conversion (&#x60;CONVERSIONS&#x60;). If you would like to access it for auction ads with these objectives , please contact your TikTok representative.Download Card is currently an allowlist-only feature. If you would like to access it, please contact your TikTok representative. Product Cards can only be used in Video Shopping Ads. | [optional] 
**portfolio_content** | [**list[creativeportfoliocreatePortfolioContent]**](creativeportfoliocreatePortfolioContent.md) | The content of the portfolio | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

