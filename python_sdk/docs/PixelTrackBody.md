# PixelTrackBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**PixelContext**](PixelContext.md) |  | [optional] 
**event** | **str** | Conversion event name. Please refer to the above &#x60;Supported web events section&#x60; for accepted event names. | [required] 
**event_id** | **str** | Any string or hashed ID that can identify a unique event. This is required if you are sending overlapping events from both TikTok Pixel and Events API.  Please check the [deduplication](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584864945154) subsection for details and complete the setup. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber  | [optional] 
**pixel_code** | **str** | Pixel ID that can be found in events manager of the TikTok ads platform. For details, see the [Where to Find pixel_code](https://ads.tiktok.com/marketing_api/docs?id&#x3D;1739584855420929) section | [required] 
**properties** | [**PixelProperties**](PixelProperties.md) |  | [optional] 
**timestamp** | **str** | Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

