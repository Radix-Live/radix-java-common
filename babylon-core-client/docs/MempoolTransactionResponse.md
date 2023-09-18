

# MempoolTransactionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | An integer giving the total count of payload hashes checked in the returned response. |  |
|**payloads** | [**List&lt;MempoolTransactionResponsePayloadsInner&gt;**](MempoolTransactionResponsePayloadsInner.md) | An array containing pairs of payload hash (query) and payload hex or error (response). Note that this response is bounded - this means it is not guaranteed all queries will be processed. Please query missing payload hashes again.  |  |



