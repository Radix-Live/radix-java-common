

# TransactionStatusResponseKnownPayloadItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payloadHash** | **String** | Bech32m-encoded hash. |  |
|**status** | **TransactionStatus** |  |  |
|**payloadStatus** | **TransactionPayloadStatus** |  |  [optional] |
|**payloadStatusDescription** | **String** | An additional description to clarify the payload status.  |  [optional] |
|**errorMessage** | **String** | The initial error message received for a rejection or failure during transaction execution. This will typically be the useful error message, explaining the root cause of the issue. Please note that presence of an error message doesn&#39;t imply that this payload will definitely reject or fail. This could represent an error during a temporary rejection (such as out of fees) which then gets resolved (e.g. by depositing money to pay the fee), allowing the transaction to be committed.  |  [optional] |
|**latestErrorMessage** | **String** | The latest error message received for a rejection or failure during transaction execution, this is only returned if it is different from the initial error message. This is more current than the initial error message, but may be less useful, as it could be a message regarding the expiry of the transaction at the end of its epoch validity window. Please note that presence of an error message doesn&#39;t imply that this payload will definitely reject or fail. This could represent an error during a temporary rejection (such as out of fees) which then gets resolved (e.g. by depositing money to pay the fee), allowing the transaction to be committed.  |  [optional] |
|**handlingStatus** | **TransactionPayloadGatewayHandlingStatus** |  |  [optional] |
|**handlingStatusReason** | **String** | Additional reason for why the Gateway has its current handling status.  |  [optional] |
|**submissionError** | **String** | The most recent error message received when submitting this transaction to the network. Please note that the presence of an error message doesn&#39;t imply that this transaction payload will definitely reject or fail. This could be a transient error.  |  [optional] |



