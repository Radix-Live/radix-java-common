

# TransactionBuildRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkIdentifier** | [**NetworkIdentifier**](NetworkIdentifier.md) |  | 
**atStateIdentifier** | [**PartialLedgerStateIdentifier**](PartialLedgerStateIdentifier.md) |  |  [optional]
**actions** | [**List&lt;Action&gt;**](Action.md) |  | 
**feePayer** | [**AccountIdentifier**](AccountIdentifier.md) |  | 
**message** | **String** | The hex-encoded message bytes. |  [optional]
**disableTokenMintAndBurn** | **Boolean** | If true, mints and burns (aside from fee payments) are not permitted during transaction execution. |  [optional]



