# js_sdk.PixelContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_category** | **String** | Category of the page/product. | [optional] 
**content_id** | **String** | ID of the product item. Example &#x60;1077218&#x60; | [optional] 
**content_name** | **String** | Name of the page/product. | [optional] 
**content_type** | **String** | The content_type object propertys value must be set to either &#x60;product&#x60;, or &#x60;product_group&#x60;, depending on how you will configure your data feed when you set up your product catalog. If you will be tracking events associated with individual products, set the value to &#x60;product&#x60;. If you are tracking events associated with product groups, set it to &#x60;product_group&#x60; instead. | [optional] 
**price** | **Number** | The price of the item. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20. | [optional] 
**quantity** | **Number** | The number of the item.  | [optional] 
**status** | **String** | Status of an order, item, or service. Note: Depending on your use of status, Events API may be required in order to share status changes to TikTok. | [optional] 
