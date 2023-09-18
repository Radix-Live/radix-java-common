

# SignedTransactionIntent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded signed intent hash for a user transaction. This hash identifies the transaction intent, plus additional signatures. This hash is signed by the notary, to create the submittable NotarizedTransaction.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;SignedIntentHash&#x60;. |  |
|**intent** | [**TransactionIntent**](TransactionIntent.md) |  |  |
|**intentSignatures** | [**List&lt;SignatureWithPublicKey&gt;**](SignatureWithPublicKey.md) |  |  |



