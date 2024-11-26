

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
|**manifestInstructions** | **String** | A text-representation of a transaction manifest. This field will be present only for user transactions and when explicitly opted-in using the &#x60;manifest_instructions&#x60; flag.  |  [optional] |
|**manifestClasses** | **List&lt;ManifestClass&gt;** | A collection of zero or more manifest classes ordered from the most specific class to the least specific one. This field will be present only for user transactions. For user transactions with subintents only the root transaction intent is currently used to determine the manifest classes.  |  [optional] |
|**message** | **Object** | The optional transaction message. This type is defined in the Core API as &#x60;TransactionMessage&#x60;. See the Core API documentation for more details.  |  [optional] |
|**balanceChanges** | [**TransactionBalanceChanges**](TransactionBalanceChanges.md) |  |  [optional] |
|**subintentDetails** | [**List&lt;TransactionSubintentDetails&gt;**](TransactionSubintentDetails.md) | Subintent details. Please note that it is returned regardless of whether the transaction was committed successfully or failed, and it can be returned in multiple transactions.  |  [optional] |
|**childSubintentHashes** | **List&lt;String&gt;** | The child subintent hashes of the root transaction intent. Please note that it is returned regardless of whether the transaction was committed successfully or failed, and it can be returned in multiple transactions.  |  [optional] |



