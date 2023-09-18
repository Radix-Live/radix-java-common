

# CommittedIntentMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateVersion** | **Long** |  |  |
|**payloadHash** | **String** | The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature.  |  |
|**payloadHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;. |  |
|**isSameTransaction** | **Boolean** | Whether the intent was committed in a transaction with the same payload. This is a convenience field, which can also be computed using &#x60;payload_hash&#x60; by a client knowing the payload of the submitted transaction.  |  |



