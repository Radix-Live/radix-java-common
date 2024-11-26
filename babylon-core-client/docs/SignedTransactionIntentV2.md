

# SignedTransactionIntentV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded signed intent hash for a user transaction. This hash identifies the transaction intent, plus additional signatures. This hash is signed by the notary, to create the submittable &#x60;NotarizedTransaction&#x60;.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;SignedTransactionIntentHash&#x60;. |  |
|**transactionIntent** | [**TransactionIntentV2**](TransactionIntentV2.md) |  |  |
|**transactionIntentSignatures** | [**IntentSignatures**](IntentSignatures.md) |  |  |
|**nonRootSubintentSignatures** | [**List&lt;IntentSignatures&gt;**](IntentSignatures.md) | This gives the signatures for each subintent in &#x60;non_root_subintents&#x60; in &#x60;TransactionIntentV2&#x60;. For committed transactions, these arrays are of equal length and correspond one-to-one in order.  |  |



