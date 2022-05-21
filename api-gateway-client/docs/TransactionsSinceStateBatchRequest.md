

# TransactionsSinceStateBatchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkIdentifier** | [**NetworkIdentifier**](NetworkIdentifier.md) |  | 
**accountIdentifiers** | [**List&lt;AccountIdentifier&gt;**](AccountIdentifier.md) | A list of up to 100 accounts to check. | 
**sinceStateIdentifier** | [**PartialLedgerStateIdentifier**](PartialLedgerStateIdentifier.md) |  |  [optional]
**atStateIdentifier** | [**PartialLedgerStateIdentifier**](PartialLedgerStateIdentifier.md) |  |  [optional]
**cursor** | **String** | This cursor allows forward pagination, by providing the cursor from the previous request. |  [optional]
**limit** | **Integer** | The page size requested. The maximum value is 100. Default - 30. |  [optional]



