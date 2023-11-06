

# ResourceSpecificDepositBehaviour


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourcePreference** | **ResourcePreference** |  |  [optional] |
|**vaultExists** | **Boolean** | Whether the account contains a vault for the resource (even if 0 balance). This plays a role when &#x60;DefaultDepositRule&#x60; is &#x60;AllowExisting&#x60;.  |  |
|**isXrd** | **Boolean** | Whether the resource represents the native XRD fungible. XRD is a special case which does not require &#x60;vault_exists &#x3D; true&#x60; to satisfy the &#x60;AllowExisting&#x60; rule.  |  |
|**allowsTryDeposit** | **Boolean** | The fully resolved &#x60;try_deposit_*&#x60; ability of this resource (which takes all the inputs into account, including the authorized depositor badge, the default deposit rule and the above resource-specific circumstances).  |  |



