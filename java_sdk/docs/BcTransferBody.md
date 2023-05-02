# BcTransferBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** | Ad Account ID |[required]  
**bcId** | **String** | Business Center ID |[required]  
**cashAmount** | [**BigDecimal**](BigDecimal.md) | The amount to process. You need to specify either cash_amount or grant_amount. Rounded to two decimal places. Value range &gt; 0. |  [optional]
**grantAmount** | [**BigDecimal**](BigDecimal.md) | Coupon/voucher amount. You need to specify either &#x60;cash_amount&#x60; or &#x60;grant_amount&#x60;. Rounded to two decimal places. Value range &gt; 0 |  [optional]
**transferType** | **String** | How you&#x27;d like to process payments from an ad account. Enum values：&#x60;RECHARGE&#x60;(transfer), &#x60;REFUND&#x60;(deduction) |[required]  
