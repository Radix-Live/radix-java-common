

# TransactionReceipt

The transaction execution receipt

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TransactionStatus** |  |  |
|**feeSummary** | [**FeeSummary**](FeeSummary.md) |  |  |
|**costingParameters** | [**CostingParameters**](CostingParameters.md) |  |  |
|**feeSource** | [**FeeSource**](FeeSource.md) |  |  [optional] |
|**feeDestination** | [**FeeDestination**](FeeDestination.md) |  |  [optional] |
|**stateUpdates** | [**StateUpdates**](StateUpdates.md) |  |  |
|**events** | [**List&lt;Event&gt;**](Event.md) |  |  [optional] |
|**nextEpoch** | [**NextEpoch**](NextEpoch.md) |  |  [optional] |
|**output** | [**List&lt;SborData&gt;**](SborData.md) | The manifest line-by-line engine return data (only present if &#x60;status&#x60; is &#x60;Succeeded&#x60;) |  [optional] |
|**errorMessage** | **String** | Error message (only present if status is &#x60;Failed&#x60; or &#x60;Rejected&#x60;) |  [optional] |



