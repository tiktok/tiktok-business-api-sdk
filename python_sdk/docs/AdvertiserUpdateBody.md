# AdvertiserUpdateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | Business address that is shown on receipts | [optional] 
**advertiser_id** | **str** | Ad account ID | [required] 
**advertiser_name** | **str** | Ad account name | [optional] 
**company** | **str** | Company name | [optional] 
**contact_email** | **str** | Contact email | [optional] 
**contact_name** | **str** | Name of the contact person | [optional] 
**contact_number** | **str** | Contact phone number | [optional] 
**license_image_id** | **str** | Image ID (&#x60;image_id&#x60;) of the business license | [optional] 
**license_no** | **str** | Business license number. This is required for ad accounts that are registered in the Chinese mainland, Hong Kong, or in countries Brazil and Mexico | [optional] 
**need_submit_certificate** | **bool** | Whether you want to submit the new certificate images for review | [optional] 
**promotion_link** | **str** | Promotion link. Length cannot exceed 255 characters | [optional] 
**qualification_images** | [**OpenApiv13advertiserupdateQualificationImages**](OpenApiv13advertiserupdateQualificationImages.md) |  | [optional] 
**tax_map** | **str** | Billing and invoicing tax number. Different countries use different tax number fields. France uses &#x60;vat&#x60;, and Brazil uses &#x60;tax_id&#x60; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

