

# StateAccessControllerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSummary**](LedgerStateSummary.md) | A summarized state of the ledger at which the query was performed. |  |
|**state** | [**Substate**](Substate.md) |  |  |
|**ownerRole** | [**Substate**](Substate.md) |  |  |
|**vaults** | [**List&lt;VaultBalance&gt;**](VaultBalance.md) | Any vaults owned directly or indirectly by the component |  |
|**descendentNodes** | [**List&lt;StateComponentDescendentNode&gt;**](StateComponentDescendentNode.md) | Any descendent nodes owned directly or indirectly by the component |  |



