

# StateAccountResourcePreferencesPageResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ledgerState** | [**LedgerState**](LedgerState.md) |  |  |
|**totalCount** | **Long** | Total number of items in underlying collection, fragment of which is available in &#x60;items&#x60; collection. |  [optional] |
|**nextCursor** | **String** | If specified, contains a cursor to query next page of the &#x60;items&#x60; collection. |  [optional] |
|**items** | [**List&lt;AccountResourcePreferencesResponseItem&gt;**](AccountResourcePreferencesResponseItem.md) |  |  |
|**accountAddress** | **String** | Bech32m-encoded human readable version of the address. |  |



