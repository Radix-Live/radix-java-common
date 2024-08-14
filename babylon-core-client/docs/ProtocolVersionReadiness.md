

# ProtocolVersionReadiness


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signalledProtocolVersion** | **String** | A name identifying a protocol version. May be absent to denote no readiness signalled by the &#x60;signalling_validators&#x60;.  |  [optional] |
|**totalActiveStakeProportion** | **String** | A sum of &#x60;active_stake_proportion&#x60; across &#x60;signalling_validators&#x60; (i.e. an easily-computable convenience field). This is a string-encoded fixed-precision decimal to 18 decimal places. A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**signallingValidators** | [**List&lt;SignallingValidator&gt;**](SignallingValidator.md) | References to some of the current validators (i.e. a subset of &#x60;current_validator_set&#x60;) which have signalled readiness for the &#x60;signalled_protocol_version&#x60;.  |  |



