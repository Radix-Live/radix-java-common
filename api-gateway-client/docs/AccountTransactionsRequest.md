

# AccountTransactionsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkIdentifier** | [**NetworkIdentifier**](NetworkIdentifier.md) |  | 
**accountIdentifier** | [**AccountIdentifier**](AccountIdentifier.md) |  | 
**atStateIdentifier** | [**PartialLedgerStateIdentifier**](PartialLedgerStateIdentifier.md) |  |  [optional]
**cursor** | **String** | This cursor allows forward pagination, by providing the cursor from the previous request. |  [optional]
**limit** | **Integer** | The page size requested. The maximum value is 30 at present. |  [optional]



