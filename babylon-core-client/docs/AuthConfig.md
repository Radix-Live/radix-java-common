

# AuthConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**functionAuthType** | **FunctionAuthType** |  |  |
|**functionAccessRules** | [**Map&lt;String, AccessRule&gt;**](AccessRule.md) | A map from a function name to AccessRule. Only exists if &#x60;function_auth_type&#x60; is set to &#x60;FunctionAccessRules&#x60;.  |  [optional] |
|**methodAuthType** | **MethodAuthType** |  |  |
|**methodRoles** | [**StaticRoleDefinitionAuthTemplate**](StaticRoleDefinitionAuthTemplate.md) |  |  [optional] |



