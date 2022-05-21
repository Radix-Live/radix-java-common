

# PartialLedgerStateIdentifier

Optional. Allows a client to request a response referencing an earlier ledger state.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **Long** | If the version is provided, the latest ledger state &lt;&#x3D; the given version is returned. |  [optional]
**timestamp** | **String** | If a timestamp is provided, the latest ledger state &lt;&#x3D; the given timestamp is returned. |  [optional]
**epoch** | **Long** | If an epoch is provided, the ledger state at the given epoch &lt;&#x3D; the given round (else round 0) is returned. |  [optional]
**round** | **Long** |  |  [optional]



