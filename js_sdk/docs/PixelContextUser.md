# js_sdk.PixelContextUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email of the customer if available. It must be hashed with SHA256 on the client side. | [optional] 
**external_id** | **String** | Any unique identifier on the advertisers side, such as loyalty membership IDs, user IDs, and external cookie IDs. It must be hashed with SHA256 on the client side. | [optional] 
**phone_number** | **String** | The phone number of the customer if available. It must be hashed with SHA256 on the client side. | [optional] 
**ttp** | **String** | Cookie ID. If you also use Pixel SDK and enabled cookie, Pixel SDK automatically saves a unique identifier in the _ttp cookie. The value of _ttp is used to match website visitor events with TikTok ads. You can extract the value of _ttp and attach the value here. For details, see [Set up TikTok Click ID and Cookies](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584860883969) | [optional] 
