

# TransactionCallPreviewResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSummary**](LedgerStateSummary.md) | A summarized state of the ledger on top of which the preview was performed. |  |
|**status** | **TransactionStatus** |  |  |
|**output** | [**SborData**](SborData.md) |  |  [optional] |
|**errorMessage** | **String** | Error message (only present if status is Failed or Rejected) |  [optional] |



