# FilteringAdvertiserTransactionGet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date** | **str** | Transaction record search end time, (UTC+0) format：&#x60;2020-11-12&#x60;. The default date is the same day | [optional] 
**funds_type** | **list[str]** | Fund type. Allowed types- &#x60;FUNDS_TYPE_CASH&#x60;(cash), &#x60;FUNDS_TYPE_GRANT&#x60;(coupon/voucher). The default is to select both types. | [optional] 
**keyword** | **str** | Search keywords, you can search for ad account name or ad account ID. | [optional] 
**start_date** | **str** | Transaction record search start time, (UTC+0) format：&#x60;2020-10-12&#x60;. The default date is 90 days ago | [optional] 
**summary_by_account** | **bool** | Whether to summarize by account. &#x60;false&#x60; means no summary; &#x60;true&#x60; means summary. Default value- &#x60;false&#x60;. | [optional] 
**transfer_type** | **str** | Billing type. Enum values- &#x60;TRANS_TYPE_TRANSFER&#x60;(transfer), &#x60;TRANS_TYPE_TAX&#x60;(tax), &#x60;TRANS_TYPE_COST&#x60;(consumption), &#x60;TRANS_TYPE_PAYMENT&#x60; (payment). Default value-  &#x60;TRANS_TYPE_TRANSFER&#x60; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

