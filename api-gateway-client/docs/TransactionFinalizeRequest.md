

# TransactionFinalizeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkIdentifier** | [**NetworkIdentifier**](NetworkIdentifier.md) |  | 
**unsignedTransaction** | **String** | The unsigned transaction payload, hex encoded. | 
**signature** | [**Signature**](Signature.md) |  | 
**submit** | **Boolean** | If true, the transaction is immediately submitted after finalization. However, we recommend that a transaction is submitted in a step after finalization. This ensures that you have a transaction identifier on hand to monitor the transaction status, even if the submission request failed with an uncertain error.  |  [optional]



