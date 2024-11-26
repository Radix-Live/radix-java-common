

# TransactionPreviewResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSummary**](LedgerStateSummary.md) | A summarized state of the ledger on top of which the preview was performed. |  |
|**encodedReceipt** | **String** | The hex-sbor-encoded receipt.  This field is deprecated and will be removed from the API with the release of the next  protocol update, cuttlefish. This field was provided primarily for use with the Radix  Engine Toolkit and its execution summary functionality. If you still wish to use this  functionality update your Radix Engine Toolkit and use the receipt provided in the  &#x60;radix_engine_toolkit_receipt&#x60; field of this response.  |  |
|**receipt** | [**TransactionReceipt**](TransactionReceipt.md) |  |  |
|**radixEngineToolkitReceipt** | **Object** | An optional field which is only provided if the &#x60;radix_engine_toolkit_receipt&#x60; flag is set to true when requesting a transaction preview from the API.  This receipt is primarily intended for use with the toolkit and may contain information  that is already available in the receipt provided in the &#x60;receipt&#x60; field of this  response.  A typical client of this API is not expected to use this receipt. The primary clients  this receipt is intended for is the Radix wallet or any client that needs to perform  execution summaries on their transactions.  |  [optional] |
|**instructionResourceChanges** | [**List&lt;InstructionResourceChanges&gt;**](InstructionResourceChanges.md) |  |  |
|**logs** | [**List&lt;TransactionPreviewResponseLogsInner&gt;**](TransactionPreviewResponseLogsInner.md) |  |  |



