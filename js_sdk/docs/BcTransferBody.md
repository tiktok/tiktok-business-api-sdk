# js_sdk.BcTransferBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **String** | Ad Account ID | [required] 
**bc_id** | **String** | Business Center ID | [required] 
**cash_amount** | **Number** | The amount to process. You need to specify either cash_amount or grant_amount. Rounded to two decimal places. Value range &gt; 0. | [optional] 
**grant_amount** | **Number** | Coupon/voucher amount. You need to specify either &#x60;cash_amount&#x60; or &#x60;grant_amount&#x60;. Rounded to two decimal places. Value range &gt; 0 | [optional] 
**transfer_type** | **String** | How you&#x27;d like to process payments from an ad account. Enum values：&#x60;RECHARGE&#x60;(transfer), &#x60;REFUND&#x60;(deduction) | [required] 
