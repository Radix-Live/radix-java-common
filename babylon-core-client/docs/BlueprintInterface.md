

# BlueprintInterface


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outerBlueprint** | **String** |  |  [optional] |
|**genericTypeParameters** | [**List&lt;GenericTypeParameter&gt;**](GenericTypeParameter.md) | Generic (SBOR) type parameters which need to be filled by a concrete instance of this blueprint.  |  |
|**isTransient** | **Boolean** | If true, an instantiation of this blueprint cannot be persisted. EG buckets and proofs are transient. |  |
|**features** | **List&lt;String&gt;** |  |  |
|**state** | [**IndexedStateSchema**](IndexedStateSchema.md) |  |  |
|**functions** | [**Map&lt;String, FunctionSchema&gt;**](FunctionSchema.md) | A map from the function name to the FunctionSchema |  |
|**events** | [**Map&lt;String, BlueprintPayloadDef&gt;**](BlueprintPayloadDef.md) | A map from the event name to the event payload type reference. |  |
|**types** | [**Map&lt;String, ScopedTypeId&gt;**](ScopedTypeId.md) | A map from the registered type name to the concrete type, resolved against a schema from the package&#39;s schema partition.  |  |



