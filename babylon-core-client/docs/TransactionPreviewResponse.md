

# TransactionPreviewResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSummary**](LedgerStateSummary.md) | A summarized state of the ledger on top of which the preview was performed. |  |
|**encodedReceipt** | **String** | The hex-sbor-encoded receipt |  |
|**receipt** | [**TransactionReceipt**](TransactionReceipt.md) |  |  |
|**instructionResourceChanges** | [**List&lt;InstructionResourceChanges&gt;**](InstructionResourceChanges.md) |  |  |
|**logs** | [**List&lt;TransactionPreviewResponseLogsInner&gt;**](TransactionPreviewResponseLogsInner.md) |  |  |



