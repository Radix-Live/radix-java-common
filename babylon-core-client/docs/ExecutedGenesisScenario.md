

# ExecutedGenesisScenario


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sequenceNumber** | **Integer** | An index of the Scenario on the list of all Scenarios that were executed. Note: the stored sequence numbers do not necessarily have to be consecutive (e.g. in a case where some configured Scenario failed to execute or failed to write results to the database).  |  |
|**logicalName** | **String** |  |  |
|**committedTransactions** | [**List&lt;ExecutedScenarioTransaction&gt;**](ExecutedScenarioTransaction.md) | Transactions successfully committed by the Scenario. |  |
|**addresses** | **Map&lt;String, String&gt;** | Well-named addresses touched/created by the Scenario, keyed by their name.  |  |



