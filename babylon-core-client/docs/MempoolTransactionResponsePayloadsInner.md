

# MempoolTransactionResponsePayloadsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature.  |  |
|**hashBech32m** | **String** | The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;. |  |
|**hex** | **String** | The hex-encoded full notarized transaction payload - returned only if found in mempool. |  [optional] |
|**error** | **String** | Error message why &#x60;hex&#x60; field is missing: the transaction was not found in the mempool or the provided hash is invalid.  |  [optional] |



