

# SignallingValidator


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | [**ActiveValidatorIndex**](ActiveValidatorIndex.md) | Validator index within the &#x60;current_validator_set&#x60;. |  |
|**activeStakeProportion** | **String** | A proportion (between 0 and 1) of the total active stake of an entire &#x60;current_validator_set&#x60; (i.e. an easily-computable convenience field). This is a string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |



