# StateApi

All URIs are relative to *https://mainnet.radixdlt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**entityFungibleResourceVaultPage**](StateApi.md#entityFungibleResourceVaultPage) | **POST** /state/entity/page/fungible-vaults/ | Get vault page of Entity Fungible resource aggregated per vault |
| [**entityFungiblesPage**](StateApi.md#entityFungiblesPage) | **POST** /state/entity/page/fungibles/ | Get Entity Fungible Resource Totals Page aggregated globally |
| [**entityMetadataPage**](StateApi.md#entityMetadataPage) | **POST** /state/entity/page/metadata | Get Entity Metadata Page |
| [**entityNonFungibleIdsPage**](StateApi.md#entityNonFungibleIdsPage) | **POST** /state/entity/page/non-fungible-vault/ids | Get Entity Non-Fungible IDs |
| [**entityNonFungibleResourceVaultPage**](StateApi.md#entityNonFungibleResourceVaultPage) | **POST** /state/entity/page/non-fungible-vaults/ | Get vault page of Entity Non Fungible aggregated per vault |
| [**entityNonFungiblesPage**](StateApi.md#entityNonFungiblesPage) | **POST** /state/entity/page/non-fungibles/ | Get Entity Non-Fungible Resource Totals Page aggregated globally |
| [**keyValueStoreData**](StateApi.md#keyValueStoreData) | **POST** /state/key-value-store/data | Get KeyValueStore Data |
| [**nonFungibleData**](StateApi.md#nonFungibleData) | **POST** /state/non-fungible/data | Get Non-Fungible Data |
| [**nonFungibleIds**](StateApi.md#nonFungibleIds) | **POST** /state/non-fungible/ids | Get Non-Fungible Collection |
| [**nonFungibleLocation**](StateApi.md#nonFungibleLocation) | **POST** /state/non-fungible/location | Get Non-Fungible Location |
| [**stateEntityDetails**](StateApi.md#stateEntityDetails) | **POST** /state/entity/details | Get Entity Details |
| [**stateValidatorsList**](StateApi.md#stateValidatorsList) | **POST** /state/validators/list | Get Validators List |



## entityFungibleResourceVaultPage

> StateEntityFungibleResourceVaultsPageResponse entityFungibleResourceVaultPage(stateEntityFungibleResourceVaultsPageRequest)

Get vault page of Entity Fungible resource aggregated per vault

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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

Get Entity Fungible Resource Totals Page aggregated globally

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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

Get Entity Non-Fungible IDs

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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

Get vault page of Entity Non Fungible aggregated per vault

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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

Get Entity Non-Fungible Resource Totals Page aggregated globally

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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


## keyValueStoreData

> StateKeyValueStoreDataResponse keyValueStoreData(stateKeyValueStoreDataRequest)

Get KeyValueStore Data

Returns data (value) associated with a given key of a given key-value store. 

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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

Get Non-Fungible Collection

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

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

