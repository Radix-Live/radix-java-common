

# CommittedTransactionInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateVersion** | **Long** |  |  |
|**epoch** | **Long** |  |  |
|**round** | **Long** |  |  |
|**roundTimestamp** | **String** |  |  |
|**transactionStatus** | **TransactionStatus** |  |  |
|**payloadHash** | **String** | Bech32m-encoded hash. |  [optional] |
|**intentHash** | **String** | Bech32m-encoded hash. |  [optional] |
|**feePaid** | **String** | String-encoded decimal representing the amount of a related fungible resource. |  [optional] |
|**affectedGlobalEntities** | **List&lt;String&gt;** |  |  [optional] |
|**confirmedAt** | **OffsetDateTime** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**rawHex** | **String** | Hex-encoded binary blob. |  [optional] |
|**receipt** | [**TransactionReceipt**](TransactionReceipt.md) |  |  [optional] |
|**message** | **Object** | defined in core api specs. |  [optional] |



