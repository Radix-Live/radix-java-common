

# TransactionBuild


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fee** | [**TokenAmount**](TokenAmount.md) |  | 
**unsignedTransaction** | **String** | The unsigned transaction payload, hex encoded. | 
**payloadToSign** | **String** | The payload which needs signing, hex encoded. This is &#x60;SHA256(SHA256(unsigned_transaction_bytes))&#x60;. | 



