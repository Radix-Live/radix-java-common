

# StreamTransactionsRequest

A request to retrieve a sublist of committed transactions from the ledger. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**fromStateVersion** | **Long** |  |  |
|**limit** | **Integer** | The maximum number of transactions that will be returned. |  |
|**sborFormatOptions** | [**SborFormatOptions**](SborFormatOptions.md) |  |  [optional] |
|**transactionFormatOptions** | [**TransactionFormatOptions**](TransactionFormatOptions.md) |  |  [optional] |
|**substateFormatOptions** | [**SubstateFormatOptions**](SubstateFormatOptions.md) |  |  [optional] |



