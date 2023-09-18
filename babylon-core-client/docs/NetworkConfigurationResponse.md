

# NetworkConfigurationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | [**NetworkConfigurationResponseVersion**](NetworkConfigurationResponseVersion.md) |  |  |
|**network** | **String** | The logical name of the network |  |
|**networkId** | **Integer** | The logical id of the network |  |
|**networkHrpSuffix** | **String** | The network suffix used for Bech32m HRPs used for addressing. |  |
|**usdPriceInXrd** | **String** | The current value of the protocol-based USD/XRD multiplier (i.e. an amount of XRDs to be paid for 1 USD). A decimal is formed of some signed integer &#x60;m&#x60; of attos (&#x60;10^(-18)&#x60;) units, where &#x60;-2^(192 - 1) &lt;&#x3D; m &lt; 2^(192 - 1)&#x60;.  |  |
|**addressTypes** | [**List&lt;AddressType&gt;**](AddressType.md) |  |  |
|**wellKnownAddresses** | [**NetworkConfigurationResponseWellKnownAddresses**](NetworkConfigurationResponseWellKnownAddresses.md) |  |  |



