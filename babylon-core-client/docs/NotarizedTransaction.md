

# NotarizedTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;. |  |
|**payloadHex** | **String** | The hex-encoded full notarized transaction payload. Returning this can be disabled in TransactionFormatOptions on your request (default true). |  [optional] |
|**signedIntent** | [**SignedTransactionIntent**](SignedTransactionIntent.md) |  |  |
|**notarySignature** | [**Signature**](Signature.md) |  |  |



