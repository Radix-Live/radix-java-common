

# RemoteGenericSubstitutionAllOf

The generic substitution is provided remotely by a blueprint type. The `resolved_full_type_id` is added by the node, and is always present in the model returned from the transaction stream API. Other APIs may not resolve the type from the blueprint definition. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blueprintTypeIdentifier** | [**BlueprintTypeIdentifier**](BlueprintTypeIdentifier.md) |  |  |
|**resolvedFullTypeId** | [**FullyScopedTypeId**](FullyScopedTypeId.md) |  |  [optional] |



