

# TransactionReceiptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**intentHash** | **String** | The transaction intent hash for a user transaction, also known as the transaction id. This hash identifies the core \&quot;intent\&quot; of the transaction. Each transaction intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent. Either hex or Bech32m-encoded strings are supported.  |  |
|**transactionFormatOptions** | [**TransactionFormatOptions**](TransactionFormatOptions.md) |  |  [optional] |



