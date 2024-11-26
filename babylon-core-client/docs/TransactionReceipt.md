

# TransactionReceipt

The transaction execution receipt

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TransactionStatus** |  |  |
|**feeSummary** | [**FeeSummary**](FeeSummary.md) |  |  |
|**costingParameters** | [**CostingParameters**](CostingParameters.md) |  |  |
|**feeSource** | [**FeeSource**](FeeSource.md) | Only present if the &#x60;status&#x60; is not &#x60;Rejected&#x60;. |  [optional] |
|**feeDestination** | [**FeeDestination**](FeeDestination.md) | Only present if the &#x60;status&#x60; is not &#x60;Rejected&#x60;. |  [optional] |
|**stateUpdates** | [**StateUpdates**](StateUpdates.md) |  |  |
|**events** | [**List&lt;Event&gt;**](Event.md) |  |  [optional] |
|**nextEpoch** | [**NextEpoch**](NextEpoch.md) |  |  [optional] |
|**output** | [**List&lt;SborData&gt;**](SborData.md) | The return data for each line of the transaction intent&#39;s manifest. This property is only present if the &#x60;status&#x60; is &#x60;Succeeded&#x60;.  |  [optional] |
|**errorMessage** | **String** | The error message. This property is only present if the status is &#x60;Failed&#x60; or &#x60;Rejected&#x60;.  |  [optional] |



