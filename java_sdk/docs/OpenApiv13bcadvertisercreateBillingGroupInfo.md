# OpenApiv13bcadvertisercreateBillingGroupInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingGroupId** | **String** | Billing group ID. Valid when &#x60;invoice_group_by&#x60; is &#x60;ACCOUNT&#x60; |  [optional]
**invoiceGroupBy** | **String** | Invoicing mode. Enum values: &#x60;ACCOUNT&#x60;: Invoices in this billing groups are combined. &#x60;ADVERTISER&#x60;: Invoices in this billing group are handled separately. |  [optional]
**invoicePayer** | **String** | Party who pays the invoices. Enum values: &#x60;AGENCY&#x60;, &#x60;ADVERTISER&#x60;. This field is required when the registrated area of the ad account is &#x60;FR&#x60; (France) |  [optional]
