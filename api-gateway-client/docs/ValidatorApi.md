# ValidatorApi

All URIs are relative to *http://localhost:5208*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validatorDerivePost**](ValidatorApi.md#validatorDerivePost) | **POST** /validator/derive | Get Validator Identifier
[**validatorPost**](ValidatorApi.md#validatorPost) | **POST** /validator | Get Validator
[**validatorStakesPost**](ValidatorApi.md#validatorStakesPost) | **POST** /validator/stakes | Get Validator Stakes
[**validatorsPost**](ValidatorApi.md#validatorsPost) | **POST** /validators | Get Validators



## validatorDerivePost

> ValidatorDeriveResponse validatorDerivePost(validatorDeriveRequest)

Get Validator Identifier

Returns the validator address associated with the given public key.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.ValidatorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        ValidatorApi apiInstance = new ValidatorApi(defaultClient);
        ValidatorDeriveRequest validatorDeriveRequest = new ValidatorDeriveRequest(); // ValidatorDeriveRequest | 
        try {
            ValidatorDeriveResponse result = apiInstance.validatorDerivePost(validatorDeriveRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ValidatorApi#validatorDerivePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorDeriveRequest** | [**ValidatorDeriveRequest**](ValidatorDeriveRequest.md)|  |

### Return type

[**ValidatorDeriveResponse**](ValidatorDeriveResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validator Info |  -  |
| **500** | Gateway Error |  -  |


## validatorPost

> ValidatorResponse validatorPost(validatorRequest)

Get Validator

Returns information about a validator, given a validator address. If a validator address is valid, but has not appeared on ledger as a validator, this endpoint still returns a successful response. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.ValidatorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        ValidatorApi apiInstance = new ValidatorApi(defaultClient);
        ValidatorRequest validatorRequest = new ValidatorRequest(); // ValidatorRequest | 
        try {
            ValidatorResponse result = apiInstance.validatorPost(validatorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ValidatorApi#validatorPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorRequest** | [**ValidatorRequest**](ValidatorRequest.md)|  |

### Return type

[**ValidatorResponse**](ValidatorResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validator Info |  -  |
| **500** | Gateway Error |  -  |


## validatorStakesPost

> ValidatorStakesResponse validatorStakesPost(validatorStakesRequest)

Get Validator Stakes

Returns paginated results about the delegated stakes from accounts to a validator. The results are totalled by account, and ordered by account age (oldest to newest). 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.ValidatorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        ValidatorApi apiInstance = new ValidatorApi(defaultClient);
        ValidatorStakesRequest validatorStakesRequest = new ValidatorStakesRequest(); // ValidatorStakesRequest | 
        try {
            ValidatorStakesResponse result = apiInstance.validatorStakesPost(validatorStakesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ValidatorApi#validatorStakesPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorStakesRequest** | [**ValidatorStakesRequest**](ValidatorStakesRequest.md)|  |

### Return type

[**ValidatorStakesResponse**](ValidatorStakesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Page of account-validator stakes. |  -  |
| **500** | Gateway Error |  -  |


## validatorsPost

> ValidatorsResponse validatorsPost(validatorsRequest)

Get Validators

Returns information about all validators.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.ValidatorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        ValidatorApi apiInstance = new ValidatorApi(defaultClient);
        ValidatorsRequest validatorsRequest = new ValidatorsRequest(); // ValidatorsRequest | 
        try {
            ValidatorsResponse result = apiInstance.validatorsPost(validatorsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ValidatorApi#validatorsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorsRequest** | [**ValidatorsRequest**](ValidatorsRequest.md)|  |

### Return type

[**ValidatorsResponse**](ValidatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ordered list of validators |  -  |
| **500** | Gateway Error |  -  |

