

# StreamTransactionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**fromLedgerState** | [**LedgerStateSelector**](LedgerStateSelector.md) |  |  [optional] |
|**cursor** | **String** | This cursor allows forward pagination, by providing the cursor from the previous request. |  [optional] |
|**limitPerPage** | **Integer** | The page size requested. |  [optional] |
|**kindFilter** | [**KindFilterEnum**](#KindFilterEnum) | Limit returned transactions by their kind. Defaults to &#x60;user&#x60;. |  [optional] |
|**manifestAccountsWithdrawnFromFilter** | **List&lt;String&gt;** | Allows specifying an array of account addresses. If specified, the response will contain only transactions with a manifest containing withdrawals from the given accounts. |  [optional] |
|**manifestAccountsDepositedIntoFilter** | **List&lt;String&gt;** | Similar to &#x60;manifest_accounts_withdrawn_from_filter&#x60;, but will return only transactions with a manifest containing deposits to the given accounts. |  [optional] |
|**manifestBadgesPresentedFilter** | **List&lt;String&gt;** | Allows specifying array of badge resource addresses. If specified, the response will contain only transactions where the given badges were presented. |  [optional] |
|**manifestResourcesFilter** | **List&lt;String&gt;** | Allows specifying array of resource addresses. If specified, the response will contain only transactions containing the given resources in the manifest (regardless of their usage). |  [optional] |
|**affectedGlobalEntitiesFilter** | **List&lt;String&gt;** | Allows specifying an array of global addresses. If specified, the response will contain transactions that affected all of the given global entities. A global entity is marked as \&quot;affected\&quot; by a transaction if any of its state (or its descendents&#39; state) was modified as a result of the transaction. For performance reasons consensus manager and transaction tracker are excluded from that filter. |  [optional] |
|**affectedGlobalEntitiesFilterType** | [**AffectedGlobalEntitiesFilterTypeEnum**](#AffectedGlobalEntitiesFilterTypeEnum) | Whether the filter should require all addresses (AND) or any of them (OR) to be present in the transaction. Default - \&quot;And\&quot;. |  [optional] |
|**eventsFilter** | [**List&lt;StreamTransactionsRequestEventFilterItem&gt;**](StreamTransactionsRequestEventFilterItem.md) | Filters the transaction stream to transactions which emitted at least one event matching each filter (each filter can be satisfied by a different event). Currently *only* deposit and withdrawal events emitted by an internal vault entity are tracked. For the purpose of filtering, the emitter address is replaced by the global ancestor of the emitter, for example, the top-level account / component which contains the vault which emitted the event. |  [optional] |
|**accountsWithManifestOwnerMethodCalls** | **List&lt;String&gt;** | Allows specifying an array of account addresses. If specified, the response will contain only transactions that, for all specified accounts, contain manifest method calls to that account which require the owner role. See the [account docs](https://docs.radixdlt.com/docs/account) for more information. |  [optional] |
|**accountsWithoutManifestOwnerMethodCalls** | **List&lt;String&gt;** | Allows specifying an array of account addresses. If specified, the response will contain only transactions that, for all specified accounts, do NOT contain manifest method calls to that account which require owner role. See the [account docs](https://docs.radixdlt.com/docs/account) for more information. |  [optional] |
|**manifestClassFilter** | [**StreamTransactionsRequestAllOfManifestClassFilter**](StreamTransactionsRequestAllOfManifestClassFilter.md) |  |  [optional] |
|**eventGlobalEmittersFilter** | **List&lt;String&gt;** | Allows specifying an array of global addresses. If specified, the response will contain transactions in which all entities emitted events. If an event was published by an internal entity, it is going to be indexed as it is a global ancestor. For performance reasons events published by consensus manager and native XRD resource are excluded from that filter. |  [optional] |
|**order** | [**OrderEnum**](#OrderEnum) | Configures the order of returned result set. Defaults to &#x60;desc&#x60;. |  [optional] |
|**optIns** | [**TransactionDetailsOptIns**](TransactionDetailsOptIns.md) |  |  [optional] |



## Enum: KindFilterEnum

| Name | Value |
|---- | -----|
| USER | &quot;User&quot; |
| EPOCH_CHANGE | &quot;EpochChange&quot; |
| ALL | &quot;All&quot; |



## Enum: AffectedGlobalEntitiesFilterTypeEnum

| Name | Value |
|---- | -----|
| AND | &quot;And&quot; |
| OR | &quot;Or&quot; |



## Enum: OrderEnum

| Name | Value |
|---- | -----|
| ASC | &quot;Asc&quot; |
| DESC | &quot;Desc&quot; |



