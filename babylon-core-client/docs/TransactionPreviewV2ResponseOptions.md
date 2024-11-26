

# TransactionPreviewV2ResponseOptions

A set of flags to configure the response of the transaction preview.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coreApiReceipt** | **Boolean** | This flag controls whether the preview response will include a Core API receipt or not. If not provided, this defaults to &#x60;false&#x60; and no core api receipt is provided in the response.  |  [optional] |
|**radixEngineToolkitReceipt** | **Boolean** | This flag controls whether the preview response will include a Radix Engine Toolkit serializable receipt or not. If not provided, this defaults to &#x60;false&#x60; and no toolkit receipt is provided in the response.  |  [optional] |
|**logs** | **Boolean** | This flag controls whether the preview response will include execution logs. If not provided, this defaults to &#x60;false&#x60; and no logs will be provided in the response.  |  [optional] |



