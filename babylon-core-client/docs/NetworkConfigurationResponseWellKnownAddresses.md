

# NetworkConfigurationResponseWellKnownAddresses

Key addresses for this network, as per https://docs.radixdlt.com/docs/well-known-addresses.  Note that at Cuttlefish, some of these names have been updated elsewhere in the stack, but for backwards compatibility, we must use the old names here.  Notably: - `secp256k1_signature_virtual_badge` is now `secp256k1_signature_resource` elsewhere - `ed25519_signature_virtual_badge` is now `ed25519_signature_resource` elsewhere - `package_of_direct_caller_virtual_badge` is now `package_of_direct_caller_resource` elsewhere - `global_caller_virtual_badge` is now `global_caller_resource` elsewhere - `system_transaction_badge` is now `system_transaction_resource` elsewhere 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**xrd** | **String** |  |  |
|**secp256k1SignatureVirtualBadge** | **String** |  |  |
|**ed25519SignatureVirtualBadge** | **String** |  |  |
|**systemTransactionBadge** | **String** |  |  |
|**packageOfDirectCallerVirtualBadge** | **String** |  |  |
|**globalCallerVirtualBadge** | **String** |  |  |
|**packageOwnerBadge** | **String** |  |  |
|**validatorOwnerBadge** | **String** |  |  |
|**accountOwnerBadge** | **String** |  |  |
|**identityOwnerBadge** | **String** |  |  |
|**packagePackage** | **String** |  |  |
|**resourcePackage** | **String** |  |  |
|**accountPackage** | **String** |  |  |
|**identityPackage** | **String** |  |  |
|**consensusManagerPackage** | **String** |  |  |
|**accessControllerPackage** | **String** |  |  |
|**transactionProcessorPackage** | **String** |  |  |
|**metadataModulePackage** | **String** |  |  |
|**royaltyModulePackage** | **String** |  |  |
|**roleAssignmentModulePackage** | **String** |  |  |
|**genesisHelperPackage** | **String** |  |  |
|**faucetPackage** | **String** |  |  |
|**poolPackage** | **String** |  |  |
|**transactionTrackerPackage** | **String** |  |  [optional] |
|**lockerPackage** | **String** |  |  [optional] |
|**testUtilsPackage** | **String** |  |  [optional] |
|**consensusManager** | **String** |  |  |
|**genesisHelper** | **String** |  |  |
|**faucet** | **String** |  |  |
|**transactionTracker** | **String** |  |  |



