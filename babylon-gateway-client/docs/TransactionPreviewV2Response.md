

# TransactionPreviewV2Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerStateVersion** | **Long** | A summarized state of the ledger on top of which the preview was performed. |  |
|**receipt** | **Object** | This is provided unless the &#x60;core_api_receipt&#x60; flag is set to false in the &#x60;opt_ins &#x60; property of the request.  This type is defined in the Core API as &#x60;TransactionReceipt&#x60;. See the Core API documentation for more details.  |  [optional] |
|**radixEngineToolkitReceipt** | **Object** | An optional field which is only provided if the &#x60;radix_engine_toolkit_receipt&#x60; flag is set to true in the &#x60;opt_ins&#x60; property of the request.  This receipt is primarily intended for use with the toolkit and may contain information that is already available in the receipt provided in the &#x60;receipt&#x60; field of this response.  A typical client of this API is not expected to use this receipt. The primary clients this receipt is intended for is the Radix wallet or any client that needs to perform execution summaries on their transactions.  |  [optional] |
|**logs** | [**List&lt;TransactionPreviewResponseLogsInner&gt;**](TransactionPreviewResponseLogsInner.md) | An optional field which is only provided if the &#x60;logs&#x60; flag is set to true in the &#x60;opt_ins&#x60; property of the request.  If present, it gives the emitted logs from the transaction execution.  |  [optional] |



