

# StreamProofsRequest

A request to retrieve a sublist of proofs. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**network** | **String** | The logical name of the network |  |
|**filter** | [**StreamProofsFilter**](StreamProofsFilter.md) |  |  [optional] |
|**maxPageSize** | **Integer** | If specified, the maximum number of proofs that will be returned. |  [optional] |
|**continuationToken** | **String** | A continuation token is returned if and only if there are further non-empty pages of items currently available. The token can be provided in a following request to fetch the next page of results. The filter and sort should not be changed when re-using the continuation token.  |  [optional] |



