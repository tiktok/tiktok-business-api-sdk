# js_sdk.AdvertiserUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Business address that is shown on receipts | [optional] 
**advertiser_id** | **String** | Ad account ID | [required] 
**advertiser_name** | **String** | Ad account name | [optional] 
**company** | **String** | Company name | [optional] 
**contact_email** | **String** | Contact email | [optional] 
**contact_name** | **String** | Name of the contact person | [optional] 
**contact_number** | **String** | Contact phone number | [optional] 
**license_image_id** | **String** | Image ID (&#x60;image_id&#x60;) of the business license | [optional] 
**license_no** | **String** | Business license number. This is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico | [optional] 
**need_submit_certificate** | **Boolean** | Whether you want to submit the new certificate images for review | [optional] 
**promotion_link** | **String** | Promotion link. Length cannot exceed 255 characters | [optional] 
**qualification_images** | [**AdvertiserupdateQualificationImages**](AdvertiserupdateQualificationImages.md) |  | [optional] 
**tax_map** | **String** | Billing and invoicing tax number. Different countries use different tax number fields. France uses &#x60;vat&#x60;, and Brazil uses &#x60;tax_id&#x60; | [optional] 
