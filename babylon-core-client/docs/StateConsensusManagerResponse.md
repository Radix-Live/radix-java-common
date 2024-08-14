

# StateConsensusManagerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSummary**](LedgerStateSummary.md) | A summarized state of the ledger at which the query was performed. |  |
|**config** | [**Substate**](Substate.md) |  |  |
|**state** | [**Substate**](Substate.md) |  |  |
|**currentProposalStatistic** | [**Substate**](Substate.md) |  |  |
|**currentValidatorSet** | [**Substate**](Substate.md) |  |  |
|**currentTime** | [**Substate**](Substate.md) |  |  |
|**currentTimeRoundedToMinutes** | [**Substate**](Substate.md) |  |  |
|**currentValidatorReadinessSignals** | [**List&lt;ProtocolVersionReadiness&gt;**](ProtocolVersionReadiness.md) | Protocol versions signalled by the current validator set. Every validator from &#x60;current_validator_set&#x60; will be referenced by exactly one of the items here. Only returned if enabled by &#x60;include_readiness_signals&#x60; on your request.  |  [optional] |



