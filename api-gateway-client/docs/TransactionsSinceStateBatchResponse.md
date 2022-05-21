

# TransactionsSinceStateBatchResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ledgerState** | [**LedgerState**](LedgerState.md) |  | 
**nextCursor** | **String** | The cursor to be provided with a new request, to get the next page of results. If missing, this is the last page of results. |  [optional]
**accountTransactions** | [**List&lt;AccountTransactionInfo&gt;**](AccountTransactionInfo.md) | The page of the oldest transactions that match the criteria. | 



