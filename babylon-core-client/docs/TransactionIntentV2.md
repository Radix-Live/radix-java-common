

# TransactionIntentV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded transaction intent hash for a user transaction, also known as the transaction id. This hash identifies the core \&quot;intent\&quot; of the transaction. Each transaction intent can only be committed once. This hash gets signed by any signatories on the transaction, to create the signed intent.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;TransactionIntentHash&#x60;. |  |
|**transactionHeader** | [**TransactionHeaderV2**](TransactionHeaderV2.md) |  |  |
|**rootIntentCore** | [**IntentCoreV2**](IntentCoreV2.md) |  |  |
|**nonRootSubintents** | [**List&lt;SubintentV2&gt;**](SubintentV2.md) |  |  |



