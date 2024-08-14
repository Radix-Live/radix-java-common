

# TransactionPayloadDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payloadHash** | **String** | The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature.  |  |
|**payloadHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;. |  |
|**stateVersion** | **Long** |  |  [optional] |
|**status** | **TransactionPayloadStatus** | The status of the transaction payload, as per this node. A NotInMempool status means that it wasn&#39;t rejected at last execution attempt, but it&#39;s not currently in the mempool either.  |  |
|**errorMessage** | **String** | An explanation for the error, if failed or rejected |  [optional] |



