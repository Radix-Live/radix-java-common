

# StreamTransactionsRequestAllOfManifestClassFilter

Allows filtering to transactions which match the given manifest classification. If specified, the response will contain only transactions which have a class that matches the filter. If `match_only_most_specific` set to true, only transactions where the queried class is most specific will be returned. See the [docs on manifest classification](https://docs.radixdlt.com/docs/conforming-transaction-manifest-types) for more information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**propertyClass** | **ManifestClass** |  |  |
|**matchOnlyMostSpecific** | **Boolean** |  |  [optional] |



