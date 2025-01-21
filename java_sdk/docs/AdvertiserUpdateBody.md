# AdvertiserUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Business address that is shown on receipts |  [optional]
**advertiserId** | **String** | Ad account ID |[required]  
**advertiserName** | **String** | Ad account name |  [optional]
**company** | **String** | Company name |  [optional]
**contactEmail** | **String** | Contact email |  [optional]
**contactName** | **String** | Name of the contact person |  [optional]
**contactNumber** | **String** | Contact phone number |  [optional]
**licenseImageId** | **String** | Image ID (&#x60;image_id&#x60;) of the business license |  [optional]
**licenseNo** | **String** | Business license number. This is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico |  [optional]
**needSubmitCertificate** | **Boolean** | Whether you want to submit the new certificate images for review |  [optional]
**promotionLink** | **String** | Promotion link. Length cannot exceed 255 characters |  [optional]
**qualificationImages** | [**advertiserupdateQualificationImages**](advertiserupdateQualificationImages.md) |  |  [optional]
**taxMap** | **String** | Billing and invoicing tax number. Different countries use different tax number fields. France uses &#x60;vat&#x60;, and Brazil uses &#x60;tax_id&#x60; |  [optional]
