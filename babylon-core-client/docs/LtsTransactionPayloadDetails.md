

# LtsTransactionPayloadDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payloadHash** | **String** | The hex-encoded notarized transaction hash for a user transaction. This hash identifies the full submittable notarized transaction - ie the signed intent, plus the notary signature.  |  |
|**payloadHashBech32m** | **String** | The Bech32m-encoded human readable &#x60;NotarizedTransactionHash&#x60;. |  |
|**stateVersion** | **Long** |  |  [optional] |
|**status** | **LtsTransactionPayloadStatus** |  |  |
|**errorMessage** | **String** | An explanation for the error, if failed or rejected |  [optional] |



