

# ScopedTypeId

An identifier for a type in the context of a schema.  The location of the schema store to locate the schema is not included, and is known from context. Currently the schema store will be in the schema partition under a node (typically a package).  Note - this type provides scoping to a schema even for well-known types where the schema is irrelevant. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaHash** | **String** | The hex-encoded schema hash, capturing the identity of an SBOR schema. |  |
|**localTypeId** | [**LocalTypeId**](LocalTypeId.md) |  |  |



