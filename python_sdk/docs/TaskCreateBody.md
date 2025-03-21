# TaskCreateBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **str** |  | [optional] 
**advertiser_ids** | **list[str]** |  | [optional] 
**data_level** | **str** |  | [optional] 
**dimensions** | **list[str]** |  | [required] 
**enable_report_title_translation** | **bool** |  | [optional] [default to True]
**end_date** | **str** |  | [optional] 
**file_name** | **str** |  | [optional] [default to ' ']
**filtering** | [**list[ReporttaskcreateFiltering]**](ReporttaskcreateFiltering.md) |  | [optional] 
**metrics** | **list[str]** |  | [optional] 
**order_field** | **str** |  | [optional] 
**order_type** | **str** |  | [optional] [default to 'DESC']
**output_format** | **str** |  | [optional] [default to 'CSV_STRING']
**query_lifetime** | **bool** |  | [optional] [default to False]
**report_type** | **str** |  | [required] 
**service_type** | **str** |  | [optional] [default to 'AUCTION']
**start_date** | **str** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

