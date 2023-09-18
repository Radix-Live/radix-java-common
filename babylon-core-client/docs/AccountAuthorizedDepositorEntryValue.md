

# AccountAuthorizedDepositorEntryValue

Empty value. The existence of the key implies the depositor is authorized.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isAuthorized** | **Boolean** | This is always true. This field is just added to ensure we return some data as the value, so a present entry is not confused by clients for a deleted/missing entry (which would imply not authorized).  |  |



