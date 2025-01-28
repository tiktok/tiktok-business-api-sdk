# js_sdk.PixelbatchBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**PixelContext**](PixelContext.md) |  | [optional] 
**event** | **String** | Conversion event name. Please refer to the above &#x60;Supported web events&#x60; section for accepted event names. | [optional] 
**event_id** | **String** | {Any hashed ID that can identify a unique user/session and do not contain &#x60;_&#x60;}_RandomNumber. Some examples are: 1. RandomNumber 2. OrderID (for CompletePayment event) 3. SessionID_RandomNumber 4. ExternalID_RandomNumber 5. BrowserID_RandomNumber  | [optional] 
**properties** | [**PixelProperties**](PixelProperties.md) |  | [optional] 
**timestamp** | **String** | Timestamp that the event took place. Timestamp with ISO 8601 format. See ISO_8601. Please note, if timestamp is not provided, the time when TikTok receives the event via the server will be used. | [optional] 
**type** | **String** | Currently only accepting value track | [optional] 
