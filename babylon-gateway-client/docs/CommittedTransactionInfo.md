

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
|**message** | **Object** | The optional transaction message. This type is defined in the Core API as &#x60;TransactionMessage&#x60;. See the Core API documentation for more details.  |  [optional] |
|**balanceChanges** | [**TransactionBalanceChanges**](TransactionBalanceChanges.md) |  |  [optional] |



