

# StreamTransactionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**cursor** | **String** | This cursor allows forward pagination, by providing the cursor from the previous request. |  [optional] |
|**limitPerPage** | **Integer** | The page size requested. |  [optional] |
|**fromLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**kindFilter** | [**KindFilterEnum**](#KindFilterEnum) | Limit returned transactions by their kind. Defaults to &#x60;user&#x60;. |  [optional] |
|**manifestAccountsWithdrawnFromFilter** | **List&lt;String&gt;** |  |  [optional] |
|**manifestAccountsDepositedIntoFilter** | **List&lt;String&gt;** |  |  [optional] |
|**manifestResourcesFilter** | **List&lt;String&gt;** |  |  [optional] |
|**affectedGlobalEntitiesFilter** | **List&lt;String&gt;** |  |  [optional] |
|**eventsFilter** | [**List&lt;StreamTransactionsRequestEventFilterItem&gt;**](StreamTransactionsRequestEventFilterItem.md) |  |  [optional] |
|**order** | [**OrderEnum**](#OrderEnum) | Configures the order of returned result set. Defaults to &#x60;desc&#x60;. |  [optional] |
|**optIns** | [**TransactionDetailsOptIns**](TransactionDetailsOptIns.md) |  |  [optional] |



## Enum: KindFilterEnum

| Name | Value |
|---- | -----|
| USER | &quot;User&quot; |
| EPOCHCHANGE | &quot;EpochChange&quot; |
| ALL | &quot;All&quot; |



## Enum: OrderEnum

| Name | Value |
|---- | -----|
| ASC | &quot;Asc&quot; |
| DESC | &quot;Desc&quot; |



