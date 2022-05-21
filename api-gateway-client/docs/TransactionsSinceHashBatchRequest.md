

# TransactionsSinceHashBatchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkIdentifier** | [**NetworkIdentifier**](NetworkIdentifier.md) |  | 
**sinceAccountTransactions** | [**List&lt;AccountTransactionPair&gt;**](AccountTransactionPair.md) | A list of up to 100 pairs: [ account, last seen transaction identifier(optional) ]. | 
**limit** | **Integer** | The number of transactions to return. The maximum value is 100. Default - 30. |  [optional]



