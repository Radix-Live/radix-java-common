

# StateValidatorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSummary**](LedgerStateSummary.md) |  |  |
|**address** | **String** | The Bech32m-encoded human readable version of the component address |  |
|**state** | [**Substate**](Substate.md) |  |  |
|**ownerRole** | [**Substate**](Substate.md) |  |  |
|**vaults** | [**List&lt;VaultBalance&gt;**](VaultBalance.md) | Any vaults owned directly or indirectly by the component |  |
|**descendentNodes** | [**List&lt;StateComponentDescendentNode&gt;**](StateComponentDescendentNode.md) | Any descendent nodes owned directly or indirectly by the component |  |



