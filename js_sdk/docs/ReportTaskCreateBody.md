# js_sdk.ReportTaskCreateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **String** |  | [optional] 
**advertiser_ids** | **[String]** |  | [optional] 
**data_level** | **String** |  | [optional] 
**dimensions** | **[String]** |  | [required] 
**enable_report_title_translation** | **Boolean** |  | [optional] [default to true]
**end_date** | **String** |  | [optional] 
**file_name** | **String** |  | [optional] [default to &#x27; &#x27;]
**filtering** | [**[ReportTaskCreateBodyFiltering]**](ReportTaskCreateBodyFiltering.md) |  | [optional] 
**metrics** | **[String]** |  | [optional] 
**order_field** | **String** |  | [optional] 
**order_type** | **String** |  | [optional] [default to &#x27;DESC&#x27;]
**output_format** | **String** |  | [optional] [default to &#x27;CSV_STRING&#x27;]
**query_lifetime** | **Boolean** |  | [optional] [default to false]
**report_type** | **String** |  | [required] 
**service_type** | **String** |  | [optional] [default to &#x27;AUCTION&#x27;]
**start_date** | **String** |  | [optional] 
