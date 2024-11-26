

# StateEntityDetailsOptIns

Check detailed [OptIns](#section/Using-endpoints-with-opt-in-features) documentation for more details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ancestorIdentities** | **Boolean** | if set to &#x60;true&#x60;, ancestor addresses - &#x60;parent_address&#x60;, &#x60;owner_address&#x60; and &#x60;global_address&#x60; for entities are returned. |  [optional] |
|**componentRoyaltyConfig** | **Boolean** | if set to &#x60;true&#x60;, &#x60;royalty_config&#x60; for component entities is returned. |  [optional] |
|**componentRoyaltyVaultBalance** | **Boolean** | if set to &#x60;true&#x60;, &#x60;royalty_vault_balance&#x60; for component entities is returned. |  [optional] |
|**packageRoyaltyVaultBalance** | **Boolean** | if set to &#x60;true&#x60;, &#x60;royalty_vault_balance&#x60; for package entities is returned. |  [optional] |
|**nonFungibleIncludeNfids** | **Boolean** | if set to &#x60;true&#x60;, first page of non fungible ids are returned for each non fungible resource, with &#x60;next_cursor&#x60; which can be later used at &#x60;/state/entity/page/non-fungible-vault/ids&#x60; endpoint. |  [optional] |
|**explicitMetadata** | **List&lt;String&gt;** | allows specifying explicitly metadata properties which should be returned in response. |  [optional] |
|**dappTwoWayLinks** | **Boolean** | if set to &#x60;true&#x60;, on-ledger dApp two-way links (resolved &amp; verified) are returned. See https://docs.radixdlt.com/docs/metadata-for-verification for more details. |  [optional] |
|**nativeResourceDetails** | **Boolean** | if set to &#x60;true&#x60;, additional details for the Network native resources are returned. |  [optional] |



