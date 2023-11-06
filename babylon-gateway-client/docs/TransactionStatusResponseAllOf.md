

# TransactionStatusResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TransactionStatus** |  |  |
|**intentStatus** | **TransactionIntentStatus** |  |  |
|**intentStatusDescription** | **String** | An additional description to clarify the intent status.  |  |
|**knownPayloads** | [**List&lt;TransactionStatusResponseKnownPayloadItem&gt;**](TransactionStatusResponseKnownPayloadItem.md) |  |  |
|**committedStateVersion** | **Long** | If the intent was committed, this gives the state version when this intent was committed.  |  [optional] |
|**errorMessage** | **String** | The most relevant error message received, due to a rejection or commit as failure. Please note that presence of an error message doesn&#39;t imply that the intent will definitely reject or fail. This could represent a temporary error (such as out of fees), or an error with a payload which doesn&#39;t end up being committed.  |  [optional] |



