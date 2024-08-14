

# ExecutedScenario


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sequenceNumber** | **Integer** | An index of the Scenario (reflecting its execution order). |  |
|**logicalName** | **String** |  |  |
|**committedTransactions** | [**List&lt;ExecutedScenarioTransaction&gt;**](ExecutedScenarioTransaction.md) | Transactions successfully committed by the Scenario. |  |
|**addresses** | **Map&lt;String, String&gt;** | Well-named addresses touched/created by the Scenario, keyed by their name.  |  |



