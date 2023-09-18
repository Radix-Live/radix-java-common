# StateApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**stateAccessControllerPost**](StateApi.md#stateAccessControllerPost) | **POST** /state/access-controller | Get Access Controller Details |
| [**stateAccountPost**](StateApi.md#stateAccountPost) | **POST** /state/account | Get Account Details |
| [**stateComponentPost**](StateApi.md#stateComponentPost) | **POST** /state/component | Get Component Details |
| [**stateConsensusManagerPost**](StateApi.md#stateConsensusManagerPost) | **POST** /state/consensus-manager | Get Consensus Manager Details |
| [**stateNonFungiblePost**](StateApi.md#stateNonFungiblePost) | **POST** /state/non-fungible | Get Non-Fungible Details |
| [**statePackagePost**](StateApi.md#statePackagePost) | **POST** /state/package | Get Package Details |
| [**stateResourcePost**](StateApi.md#stateResourcePost) | **POST** /state/resource | Get Resource Details |
| [**stateValidatorPost**](StateApi.md#stateValidatorPost) | **POST** /state/validator | Get Validator Details |



## stateAccessControllerPost

> StateAccessControllerResponse stateAccessControllerPost(stateAccessControllerRequest)

Get Access Controller Details

Reads the access controller&#39;s substate/s from the top of the current ledger. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateAccessControllerRequest stateAccessControllerRequest = new StateAccessControllerRequest(); // StateAccessControllerRequest | 
        try {
            StateAccessControllerResponse result = apiInstance.stateAccessControllerPost(stateAccessControllerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateAccessControllerPost");
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
| **stateAccessControllerRequest** | [**StateAccessControllerRequest**](StateAccessControllerRequest.md)|  | |

### Return type

[**StateAccessControllerResponse**](StateAccessControllerResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |


## stateAccountPost

> StateAccountResponse stateAccountPost(stateAccountRequest)

Get Account Details

Reads the account&#39;s substate/s from the top of the current ledger. Also returns all vaults under the account. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateAccountRequest stateAccountRequest = new StateAccountRequest(); // StateAccountRequest | 
        try {
            StateAccountResponse result = apiInstance.stateAccountPost(stateAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateAccountPost");
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
| **stateAccountRequest** | [**StateAccountRequest**](StateAccountRequest.md)|  | |

### Return type

[**StateAccountResponse**](StateAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |


## stateComponentPost

> StateComponentResponse stateComponentPost(stateComponentRequest)

Get Component Details

Reads the component&#39;s substate/s from the top of the current ledger. Also recursively extracts vault balance totals from the component&#39;s entity subtree. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateComponentRequest stateComponentRequest = new StateComponentRequest(); // StateComponentRequest | 
        try {
            StateComponentResponse result = apiInstance.stateComponentPost(stateComponentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateComponentPost");
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
| **stateComponentRequest** | [**StateComponentRequest**](StateComponentRequest.md)|  | |

### Return type

[**StateComponentResponse**](StateComponentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |


## stateConsensusManagerPost

> StateConsensusManagerResponse stateConsensusManagerPost(stateConsensusManagerRequest)

Get Consensus Manager Details

Reads the consensus manager&#39;s substate/s from the top of the current ledger. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateConsensusManagerRequest stateConsensusManagerRequest = new StateConsensusManagerRequest(); // StateConsensusManagerRequest | 
        try {
            StateConsensusManagerResponse result = apiInstance.stateConsensusManagerPost(stateConsensusManagerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateConsensusManagerPost");
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
| **stateConsensusManagerRequest** | [**StateConsensusManagerRequest**](StateConsensusManagerRequest.md)|  | |

### Return type

[**StateConsensusManagerResponse**](StateConsensusManagerResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## stateNonFungiblePost

> StateNonFungibleResponse stateNonFungiblePost(stateNonFungibleRequest)

Get Non-Fungible Details

Reads the data associated with a single Non-Fungible Unit under a Non-Fungible Resource. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateNonFungibleRequest stateNonFungibleRequest = new StateNonFungibleRequest(); // StateNonFungibleRequest | 
        try {
            StateNonFungibleResponse result = apiInstance.stateNonFungiblePost(stateNonFungibleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateNonFungiblePost");
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
| **stateNonFungibleRequest** | [**StateNonFungibleRequest**](StateNonFungibleRequest.md)|  | |

### Return type

[**StateNonFungibleResponse**](StateNonFungibleResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |


## statePackagePost

> StatePackageResponse statePackagePost(statePackageRequest)

Get Package Details

Reads the package&#39;s substate/s from the top of the current ledger. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StatePackageRequest statePackageRequest = new StatePackageRequest(); // StatePackageRequest | 
        try {
            StatePackageResponse result = apiInstance.statePackagePost(statePackageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#statePackagePost");
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
| **statePackageRequest** | [**StatePackageRequest**](StatePackageRequest.md)|  | |

### Return type

[**StatePackageResponse**](StatePackageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |


## stateResourcePost

> StateResourceResponse stateResourcePost(stateResourceRequest)

Get Resource Details

Reads the resource manager&#39;s substate/s from the top of the current ledger. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateResourceRequest stateResourceRequest = new StateResourceRequest(); // StateResourceRequest | 
        try {
            StateResourceResponse result = apiInstance.stateResourcePost(stateResourceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateResourcePost");
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
| **stateResourceRequest** | [**StateResourceRequest**](StateResourceRequest.md)|  | |

### Return type

[**StateResourceResponse**](StateResourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |


## stateValidatorPost

> StateValidatorResponse stateValidatorPost(stateValidatorRequest)

Get Validator Details

Reads the validator&#39;s substate/s from the top of the current ledger. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StateApi apiInstance = new StateApi(defaultClient);
        StateValidatorRequest stateValidatorRequest = new StateValidatorRequest(); // StateValidatorRequest | 
        try {
            StateValidatorResponse result = apiInstance.stateValidatorPost(stateValidatorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StateApi#stateValidatorPost");
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
| **stateValidatorRequest** | [**StateValidatorRequest**](StateValidatorRequest.md)|  | |

### Return type

[**StateValidatorResponse**](StateValidatorResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current state response |  -  |
| **400** | Client error |  -  |
| **404** | Not found error |  -  |
| **500** | Server error |  -  |

