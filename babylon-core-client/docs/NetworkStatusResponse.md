

# NetworkStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preGenesisStateIdentifier** | [**CommittedStateIdentifier**](CommittedStateIdentifier.md) | The ledger state identifier of a fresh ledger before any genesis transactions.  |  |
|**genesisEpochRound** | [**EpochRound**](EpochRound.md) | The epoch details for the genesis epoch and round. The genesis epoch will be the last Olympia epoch + 1, and have a \&quot;fake\&quot; round-number 1 (because there is no round for the genesis transaction). In the Gateway, this can be used for the epoch and round number before the first RoundUpdate transaction. It is not present until genesis has been run.  |  [optional] |
|**postGenesisStateIdentifier** | [**CommittedStateIdentifier**](CommittedStateIdentifier.md) | The ledger state after the genesis transactions have been executed. It is not present until genesis has been run.  |  [optional] |
|**postGenesisEpochRound** | [**EpochRound**](EpochRound.md) | The post-genesis epoch and round.  |  [optional] |
|**currentStateIdentifier** | [**CommittedStateIdentifier**](CommittedStateIdentifier.md) | The current state identifier at the top of the node&#39;s copy of the ledger (ie as of the latest committed transaction). It is not present until genesis has been run.  |  [optional] |
|**currentEpochRound** | [**EpochRound**](EpochRound.md) | The current epoch and round of the ledger. It is not present until genesis has been run.  |  [optional] |
|**currentProtocolVersion** | **String** | A descriptor for the current protocol version that the node is running.  |  |



