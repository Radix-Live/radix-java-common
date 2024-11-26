

# TransactionPreviewResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encodedReceipt** | **String** | Hex-encoded binary blob. |  |
|**radixEngineToolkitReceipt** | **Object** | An optional field which is only provided if the &#x60;radix_engine_toolkit_receipt&#x60; flag is set to true when requesting a transaction preview from the API.  This receipt is primarily intended for use with the toolkit and may contain information that is already available in the receipt provided in the &#x60;receipt&#x60; field of this response.  A typical client of this API is not expected to use this receipt. The primary clients this receipt is intended for is the Radix wallet or any client that needs to perform execution summaries on their transactions.  |  [optional] |
|**receipt** | **Object** | This type is defined in the Core API as &#x60;TransactionReceipt&#x60;. See the Core API documentation for more details.  |  |
|**resourceChanges** | **List&lt;Object&gt;** |  |  |
|**logs** | [**List&lt;TransactionPreviewResponseLogsInner&gt;**](TransactionPreviewResponseLogsInner.md) |  |  |



