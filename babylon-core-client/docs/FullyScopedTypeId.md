

# FullyScopedTypeId

An identifier for a type in the context of a schema in an entity's schema partition.  Note - this type provides a schema context even for well-known types where this context is effectively irrelevant. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityAddress** | **String** | Bech32m-encoded human readable version of the entity&#39;s address (ie the entity&#39;s node id) |  |
|**schemaHash** | **String** | The hex-encoded schema hash, capturing the identity of an SBOR schema. |  |
|**localTypeId** | [**LocalTypeId**](LocalTypeId.md) |  |  |



