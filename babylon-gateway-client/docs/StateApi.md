# StateApi

All URIs are relative to *https://gateway.radix.live*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountAuthorizedDepositorsPage**](StateApi.md#accountAuthorizedDepositorsPage) | **POST** /state/account/page/authorized-depositors | Get Account authorized depositors |
| [**accountLockerVaultsPage**](StateApi.md#accountLockerVaultsPage) | **POST** /state/account-locker/page/vaults | Get Account Locker Vaults Page |
| [**accountLockersTouchedAt**](StateApi.md#accountLockersTouchedAt) | **POST** /state/account-lockers/touched-at | Get Most Recent Touch of Account Lockers |
| [**accountResourcePreferencesPage**](StateApi.md#accountResourcePreferencesPage) | **POST** /state/account/page/resource-preferences | Get Account resource preferences |
| [**entityFungibleResourceVaultPage**](StateApi.md#entityFungibleResourceVaultPage) | **POST** /state/entity/page/fungible-vaults/ | Get page of Global Entity Fungible Resource Vaults |
| [**entityFungiblesPage**](StateApi.md#entityFungiblesPage) | **POST** /state/entity/page/fungibles/ | Get page of Global Entity Fungible Resource Balances |
| [**entityMetadataPage**](StateApi.md#entityMetadataPage) | **POST** /state/entity/page/metadata | Get Entity Metadata Page |
| [**entityNonFungibleIdsPage**](StateApi.md#entityNonFungibleIdsPage) | **POST** /state/entity/page/non-fungible-vault/ids | Get page of Non-Fungibles in Vault |
| [**entityNonFungibleResourceVaultPage**](StateApi.md#entityNonFungibleResourceVaultPage) | **POST** /state/entity/page/non-fungible-vaults/ | Get page of Global Entity Non-Fungible Resource Vaults |
| [**entityNonFungiblesPage**](StateApi.md#entityNonFungiblesPage) | **POST** /state/entity/page/non-fungibles/ | Get page of Global Entity Non-Fungible Resource Balances |
| [**entitySchemaPage**](StateApi.md#entitySchemaPage) | **POST** /state/entity/page/schemas | Get Entity Schema Page |
| [**keyValueStoreData**](StateApi.md#keyValueStoreData) | **POST** /state/key-value-store/data | Get KeyValueStore Data |
| [**keyValueStoreKeys**](StateApi.md#keyValueStoreKeys) | **POST** /state/key-value-store/keys | Get KeyValueStore Keys |
| [**nonFungibleData**](StateApi.md#nonFungibleData) | **POST** /state/non-fungible/data | Get Non-Fungible Data |
| [**nonFungibleIds**](StateApi.md#nonFungibleIds) | **POST** /state/non-fungible/ids | Get page of Non-Fungible Ids in Resource Collection |
| [**nonFungibleLocation**](StateApi.md#nonFungibleLocation) | **POST** /state/non-fungible/location | Get Non-Fungible Location |
| [**packageBlueprintPage**](StateApi.md#packageBlueprintPage) | **POST** /state/package/page/blueprints | Get Package Blueprints Page |
| [**packageCodePage**](StateApi.md#packageCodePage) | **POST** /state/package/page/codes | Get Package Codes Page |
| [**stateEntityDetails**](StateApi.md#stateEntityDetails) | **POST** /state/entity/details | Get Entity Details |
| [**stateValidatorsList**](StateApi.md#stateValidatorsList) | **POST** /state/validators/list | Get Validators List |



## accountAuthorizedDepositorsPage

> StateAccountAuthorizedDepositorsPageResponse accountAuthorizedDepositorsPage(stateAccountAuthorizedDepositorsPageRequest)

Get Account authorized depositors

Returns paginable collection of authorized depositors for given account. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateAccountAuthorizedDepositorsPageRequest stateAccountAuthorizedDepositorsPageRequest = new StateAccountAuthorizedDepositorsPageRequest(); // StateAccountAuthorizedDepositorsPageRequest | 
        try {
            StateAccountAuthorizedDepositorsPageResponse result = apiInstance.accountAuthorizedDepositorsPage(stateAccountAuthorizedDepositorsPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#accountAuthorizedDepositorsPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateAccountAuthorizedDepositorsPageRequest** | [**StateAccountAuthorizedDepositorsPageRequest**](StateAccountAuthorizedDepositorsPageRequest.md)|  | |

### Return type

[**StateAccountAuthorizedDepositorsPageResponse**](StateAccountAuthorizedDepositorsPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account resource preferences page |  -  |
| **4XX** | Client-originated request error |  -  |


## accountLockerVaultsPage

> StateAccountLockerPageVaultsResponse accountLockerVaultsPage(stateAccountLockerPageVaultsRequest)

Get Account Locker Vaults Page

Returns all the resource vaults associated with a given account locker. The returned response is in a paginated format, ordered by the most recent resource vault creation on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateAccountLockerPageVaultsRequest stateAccountLockerPageVaultsRequest = new StateAccountLockerPageVaultsRequest(); // StateAccountLockerPageVaultsRequest | 
        try {
            StateAccountLockerPageVaultsResponse result = apiInstance.accountLockerVaultsPage(stateAccountLockerPageVaultsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#accountLockerVaultsPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateAccountLockerPageVaultsRequest** | [**StateAccountLockerPageVaultsRequest**](StateAccountLockerPageVaultsRequest.md)|  | |

### Return type

[**StateAccountLockerPageVaultsResponse**](StateAccountLockerPageVaultsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account Locker vaults (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## accountLockersTouchedAt

> StateAccountLockersTouchedAtResponse accountLockersTouchedAt(stateAccountLockersTouchedAtRequest)

Get Most Recent Touch of Account Lockers

Returns most recent state version given account locker has been touched. Touch refers to the creation of the account locker itself as well as any modification to its contents, such as resource claim, airdrop or store. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateAccountLockersTouchedAtRequest stateAccountLockersTouchedAtRequest = new StateAccountLockersTouchedAtRequest(); // StateAccountLockersTouchedAtRequest | 
        try {
            StateAccountLockersTouchedAtResponse result = apiInstance.accountLockersTouchedAt(stateAccountLockersTouchedAtRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#accountLockersTouchedAt");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateAccountLockersTouchedAtRequest** | [**StateAccountLockersTouchedAtRequest**](StateAccountLockersTouchedAtRequest.md)|  | |

### Return type

[**StateAccountLockersTouchedAtResponse**](StateAccountLockersTouchedAtResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account locker account pair last touch state version |  -  |
| **4XX** | Client-originated request error |  -  |


## accountResourcePreferencesPage

> StateAccountResourcePreferencesPageResponse accountResourcePreferencesPage(stateAccountResourcePreferencesPageRequest)

Get Account resource preferences

Returns paginable collection of resource preference rules for given account. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateAccountResourcePreferencesPageRequest stateAccountResourcePreferencesPageRequest = new StateAccountResourcePreferencesPageRequest(); // StateAccountResourcePreferencesPageRequest | 
        try {
            StateAccountResourcePreferencesPageResponse result = apiInstance.accountResourcePreferencesPage(stateAccountResourcePreferencesPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#accountResourcePreferencesPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateAccountResourcePreferencesPageRequest** | [**StateAccountResourcePreferencesPageRequest**](StateAccountResourcePreferencesPageRequest.md)|  | |

### Return type

[**StateAccountResourcePreferencesPageResponse**](StateAccountResourcePreferencesPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account resource preferences page |  -  |
| **4XX** | Client-originated request error |  -  |


## entityFungibleResourceVaultPage

> StateEntityFungibleResourceVaultsPageResponse entityFungibleResourceVaultPage(stateEntityFungibleResourceVaultsPageRequest)

Get page of Global Entity Fungible Resource Vaults

Returns vaults for fungible resource owned by a given global entity. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityFungibleResourceVaultsPageRequest stateEntityFungibleResourceVaultsPageRequest = new StateEntityFungibleResourceVaultsPageRequest(); // StateEntityFungibleResourceVaultsPageRequest | 
        try {
            StateEntityFungibleResourceVaultsPageResponse result = apiInstance.entityFungibleResourceVaultPage(stateEntityFungibleResourceVaultsPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entityFungibleResourceVaultPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityFungibleResourceVaultsPageRequest** | [**StateEntityFungibleResourceVaultsPageRequest**](StateEntityFungibleResourceVaultsPageRequest.md)|  | |

### Return type

[**StateEntityFungibleResourceVaultsPageResponse**](StateEntityFungibleResourceVaultsPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Fungibles (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## entityFungiblesPage

> StateEntityFungiblesPageResponse entityFungiblesPage(stateEntityFungiblesPageRequest)

Get page of Global Entity Fungible Resource Balances

Returns the total amount of each fungible resource owned by a given global entity. Result can be aggregated globally or per vault. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityFungiblesPageRequest stateEntityFungiblesPageRequest = new StateEntityFungiblesPageRequest(); // StateEntityFungiblesPageRequest | 
        try {
            StateEntityFungiblesPageResponse result = apiInstance.entityFungiblesPage(stateEntityFungiblesPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entityFungiblesPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityFungiblesPageRequest** | [**StateEntityFungiblesPageRequest**](StateEntityFungiblesPageRequest.md)|  | |

### Return type

[**StateEntityFungiblesPageResponse**](StateEntityFungiblesPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Fungibles (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## entityMetadataPage

> StateEntityMetadataPageResponse entityMetadataPage(stateEntityMetadataPageRequest)

Get Entity Metadata Page

Returns all the metadata properties associated with a given global entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityMetadataPageRequest stateEntityMetadataPageRequest = new StateEntityMetadataPageRequest(); // StateEntityMetadataPageRequest | 
        try {
            StateEntityMetadataPageResponse result = apiInstance.entityMetadataPage(stateEntityMetadataPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entityMetadataPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityMetadataPageRequest** | [**StateEntityMetadataPageRequest**](StateEntityMetadataPageRequest.md)|  | |

### Return type

[**StateEntityMetadataPageResponse**](StateEntityMetadataPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Metadata (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## entityNonFungibleIdsPage

> StateEntityNonFungibleIdsPageResponse entityNonFungibleIdsPage(stateEntityNonFungibleIdsPageRequest)

Get page of Non-Fungibles in Vault

Returns all non-fungible IDs of a given non-fungible resource owned by a given entity. The returned response is in a paginated format, ordered by the resource&#39;s first appearence on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityNonFungibleIdsPageRequest stateEntityNonFungibleIdsPageRequest = new StateEntityNonFungibleIdsPageRequest(); // StateEntityNonFungibleIdsPageRequest | 
        try {
            StateEntityNonFungibleIdsPageResponse result = apiInstance.entityNonFungibleIdsPage(stateEntityNonFungibleIdsPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entityNonFungibleIdsPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityNonFungibleIdsPageRequest** | [**StateEntityNonFungibleIdsPageRequest**](StateEntityNonFungibleIdsPageRequest.md)|  | |

### Return type

[**StateEntityNonFungibleIdsPageResponse**](StateEntityNonFungibleIdsPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Non-Fungible IDs (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## entityNonFungibleResourceVaultPage

> StateEntityNonFungibleResourceVaultsPageResponse entityNonFungibleResourceVaultPage(stateEntityNonFungibleResourceVaultsPageRequest)

Get page of Global Entity Non-Fungible Resource Vaults

Returns vaults for non fungible resource owned by a given global entity. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityNonFungibleResourceVaultsPageRequest stateEntityNonFungibleResourceVaultsPageRequest = new StateEntityNonFungibleResourceVaultsPageRequest(); // StateEntityNonFungibleResourceVaultsPageRequest | 
        try {
            StateEntityNonFungibleResourceVaultsPageResponse result = apiInstance.entityNonFungibleResourceVaultPage(stateEntityNonFungibleResourceVaultsPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entityNonFungibleResourceVaultPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityNonFungibleResourceVaultsPageRequest** | [**StateEntityNonFungibleResourceVaultsPageRequest**](StateEntityNonFungibleResourceVaultsPageRequest.md)|  | |

### Return type

[**StateEntityNonFungibleResourceVaultsPageResponse**](StateEntityNonFungibleResourceVaultsPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Fungibles (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## entityNonFungiblesPage

> StateEntityNonFungiblesPageResponse entityNonFungiblesPage(stateEntityNonFungiblesPageRequest)

Get page of Global Entity Non-Fungible Resource Balances

Returns the total amount of each non-fungible resource owned by a given global entity. Result can be aggregated globally or per vault. The returned response is in a paginated format, ordered by the resource&#39;s first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityNonFungiblesPageRequest stateEntityNonFungiblesPageRequest = new StateEntityNonFungiblesPageRequest(); // StateEntityNonFungiblesPageRequest | 
        try {
            StateEntityNonFungiblesPageResponse result = apiInstance.entityNonFungiblesPage(stateEntityNonFungiblesPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entityNonFungiblesPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityNonFungiblesPageRequest** | [**StateEntityNonFungiblesPageRequest**](StateEntityNonFungiblesPageRequest.md)|  | |

### Return type

[**StateEntityNonFungiblesPageResponse**](StateEntityNonFungiblesPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Non-Fungibles (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## entitySchemaPage

> StateEntitySchemaPageResponse entitySchemaPage(stateEntitySchemaPageRequest)

Get Entity Schema Page

Returns all the schemas associated with a given global entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntitySchemaPageRequest stateEntitySchemaPageRequest = new StateEntitySchemaPageRequest(); // StateEntitySchemaPageRequest | 
        try {
            StateEntitySchemaPageResponse result = apiInstance.entitySchemaPage(stateEntitySchemaPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#entitySchemaPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntitySchemaPageRequest** | [**StateEntitySchemaPageRequest**](StateEntitySchemaPageRequest.md)|  | |

### Return type

[**StateEntitySchemaPageResponse**](StateEntitySchemaPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Schemas (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## keyValueStoreData

> StateKeyValueStoreDataResponse keyValueStoreData(stateKeyValueStoreDataRequest)

Get KeyValueStore Data

Returns data (value) associated with a given key of a given key-value store. [Check detailed documentation for explanation](#section/How-to-query-the-content-of-a-key-value-store-inside-a-component) 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateKeyValueStoreDataRequest stateKeyValueStoreDataRequest = new StateKeyValueStoreDataRequest(); // StateKeyValueStoreDataRequest | 
        try {
            StateKeyValueStoreDataResponse result = apiInstance.keyValueStoreData(stateKeyValueStoreDataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#keyValueStoreData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateKeyValueStoreDataRequest** | [**StateKeyValueStoreDataRequest**](StateKeyValueStoreDataRequest.md)|  | |

### Return type

[**StateKeyValueStoreDataResponse**](StateKeyValueStoreDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Non-Fungible ID Data |  -  |
| **4XX** | Client-originated request error |  -  |


## keyValueStoreKeys

> StateKeyValueStoreKeysResponse keyValueStoreKeys(stateKeyValueStoreKeysRequest)

Get KeyValueStore Keys

Allows to iterate over key value store keys.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateKeyValueStoreKeysRequest stateKeyValueStoreKeysRequest = new StateKeyValueStoreKeysRequest(); // StateKeyValueStoreKeysRequest | 
        try {
            StateKeyValueStoreKeysResponse result = apiInstance.keyValueStoreKeys(stateKeyValueStoreKeysRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#keyValueStoreKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateKeyValueStoreKeysRequest** | [**StateKeyValueStoreKeysRequest**](StateKeyValueStoreKeysRequest.md)|  | |

### Return type

[**StateKeyValueStoreKeysResponse**](StateKeyValueStoreKeysResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | KeyValueStore keys collection |  -  |
| **4XX** | Client-originated request error |  -  |


## nonFungibleData

> StateNonFungibleDataResponse nonFungibleData(stateNonFungibleDataRequest)

Get Non-Fungible Data

Returns data associated with a given non-fungible ID of a given non-fungible resource. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateNonFungibleDataRequest stateNonFungibleDataRequest = new StateNonFungibleDataRequest(); // StateNonFungibleDataRequest | 
        try {
            StateNonFungibleDataResponse result = apiInstance.nonFungibleData(stateNonFungibleDataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#nonFungibleData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateNonFungibleDataRequest** | [**StateNonFungibleDataRequest**](StateNonFungibleDataRequest.md)|  | |

### Return type

[**StateNonFungibleDataResponse**](StateNonFungibleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Non-Fungible ID Data |  -  |
| **4XX** | Client-originated request error |  -  |


## nonFungibleIds

> StateNonFungibleIdsResponse nonFungibleIds(stateNonFungibleIdsRequest)

Get page of Non-Fungible Ids in Resource Collection

Returns the non-fungible IDs of a given non-fungible resource. Returned response is in a paginated format, ordered by their first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateNonFungibleIdsRequest stateNonFungibleIdsRequest = new StateNonFungibleIdsRequest(); // StateNonFungibleIdsRequest | 
        try {
            StateNonFungibleIdsResponse result = apiInstance.nonFungibleIds(stateNonFungibleIdsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#nonFungibleIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateNonFungibleIdsRequest** | [**StateNonFungibleIdsRequest**](StateNonFungibleIdsRequest.md)|  | |

### Return type

[**StateNonFungibleIdsResponse**](StateNonFungibleIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Non-Fungible IDs (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## nonFungibleLocation

> StateNonFungibleLocationResponse nonFungibleLocation(stateNonFungibleLocationRequest)

Get Non-Fungible Location

Returns location of a given non-fungible ID. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateNonFungibleLocationRequest stateNonFungibleLocationRequest = new StateNonFungibleLocationRequest(); // StateNonFungibleLocationRequest | 
        try {
            StateNonFungibleLocationResponse result = apiInstance.nonFungibleLocation(stateNonFungibleLocationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#nonFungibleLocation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateNonFungibleLocationRequest** | [**StateNonFungibleLocationRequest**](StateNonFungibleLocationRequest.md)|  | |

### Return type

[**StateNonFungibleLocationResponse**](StateNonFungibleLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Non-Fungible ID Location |  -  |
| **4XX** | Client-originated request error |  -  |


## packageBlueprintPage

> StatePackageBlueprintPageResponse packageBlueprintPage(statePackageBlueprintPageRequest)

Get Package Blueprints Page

Returns all the blueprints associated with a given package entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StatePackageBlueprintPageRequest statePackageBlueprintPageRequest = new StatePackageBlueprintPageRequest(); // StatePackageBlueprintPageRequest | 
        try {
            StatePackageBlueprintPageResponse result = apiInstance.packageBlueprintPage(statePackageBlueprintPageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#packageBlueprintPage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **statePackageBlueprintPageRequest** | [**StatePackageBlueprintPageRequest**](StatePackageBlueprintPageRequest.md)|  | |

### Return type

[**StatePackageBlueprintPageResponse**](StatePackageBlueprintPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package Blueprints (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## packageCodePage

> StatePackageCodePageResponse packageCodePage(statePackageCodePageRequest)

Get Package Codes Page

Returns all the codes associated with a given package entity. The returned response is in a paginated format, ordered by first appearance on the ledger. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StatePackageCodePageRequest statePackageCodePageRequest = new StatePackageCodePageRequest(); // StatePackageCodePageRequest | 
        try {
            StatePackageCodePageResponse result = apiInstance.packageCodePage(statePackageCodePageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#packageCodePage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **statePackageCodePageRequest** | [**StatePackageCodePageRequest**](StatePackageCodePageRequest.md)|  | |

### Return type

[**StatePackageCodePageResponse**](StatePackageCodePageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package Blueprints (paginated) |  -  |
| **4XX** | Client-originated request error |  -  |


## stateEntityDetails

> StateEntityDetailsResponse stateEntityDetails(stateEntityDetailsRequest)

Get Entity Details

Returns detailed information for collection of entities. Aggregate resources globally by default. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateEntityDetailsRequest stateEntityDetailsRequest = new StateEntityDetailsRequest(); // StateEntityDetailsRequest | 
        try {
            StateEntityDetailsResponse result = apiInstance.stateEntityDetails(stateEntityDetailsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateEntityDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateEntityDetailsRequest** | [**StateEntityDetailsRequest**](StateEntityDetailsRequest.md)|  | |

### Return type

[**StateEntityDetailsResponse**](StateEntityDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Details |  -  |
| **4XX** | Client-originated request error |  -  |


## stateValidatorsList

> StateValidatorsListResponse stateValidatorsList(stateValidatorsListRequest)

Get Validators List

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.radix.live");

        StateApi apiInstance = new StateApi(defaultClient);
        StateValidatorsListRequest stateValidatorsListRequest = new StateValidatorsListRequest(); // StateValidatorsListRequest | 
        try {
            StateValidatorsListResponse result = apiInstance.stateValidatorsList(stateValidatorsListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateValidatorsList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateValidatorsListRequest** | [**StateValidatorsListRequest**](StateValidatorsListRequest.md)|  | |

### Return type

[**StateValidatorsListResponse**](StateValidatorsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validators List |  -  |
| **4XX** | Client-originated request error |  -  |

