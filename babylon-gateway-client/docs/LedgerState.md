

# LedgerState

The ledger state against which the response was generated. Can be used to detect if the Network Gateway is returning up-to-date information. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**stateVersion** | **Long** | The state version of the ledger. Each transaction increments the state version by 1. |  |
|**proposerRoundTimestamp** | **String** | The proposer round timestamp of the consensus round when this transaction was committed to ledger. This is not guaranteed to be strictly increasing, as it is computed as an average across the validator set. If this is significantly behind the current timestamp, the Network Gateway is likely reporting out-dated information, or the network has stalled.  |  |
|**epoch** | **Long** | The epoch number of the ledger at this state version. |  |
|**round** | **Long** | The consensus round in the epoch that this state version was committed in. |  |



