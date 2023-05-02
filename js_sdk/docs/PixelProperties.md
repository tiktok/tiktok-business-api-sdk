# js_sdk.PixelProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contents** | [**[PixelContent]**](PixelContent.md) | Related items in a web event (e.g. items added in an Initiate Checkout event). | [optional] 
**currency** | **String** | ISO 4217 code. Examples: EUR, USD, JPY. List of currencies currently supported: AED, ARS, AUD, BDT, BHD, BIF, BOB, BRL, CAD, CHF, CLP, CNY, COP, CRC, CZK, DKK, DZD, EGP, EUR, GBP, GTQ, HKD, HNL, HUF, IDR, ILS, INR, ISK, JPY, KES, KHR, KRW, KWD, KZT, MAD, MOP, MXN, MYR, NGN, NIO, NOK, NZD, OMR, PEN, PHP, PHP, PKR, PLN, PYG, QAR, RON, RUB, SAR, SEK, SGD, THB, TRY, TWD, UAH, USD, VES, VND, ZAR. | [optional] 
**description** | **String** | Description of the item or page. | [optional] 
**query** | **String** | The text string that was input by a user. For instance, if a person searches for a product on your website, you can forward the keyword being searched. If a person enters a coupon code at check out, you can forward the code. | [optional] 
**value** | **Number** | Value of the order or items sold. Note: Price is the price for a single item, and value is the total price of the order. For example, if you have two items each sold for $10, the price parameter would pass 10 and the value parameter would pass 20. | [optional] 
