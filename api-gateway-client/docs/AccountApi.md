# AccountApi

All URIs are relative to *http://localhost:5208*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountBalancesPost**](AccountApi.md#accountBalancesPost) | **POST** /account/balances | Get Account Balances
[**accountDerivePost**](AccountApi.md#accountDerivePost) | **POST** /account/derive | Derive Account Identifier
[**accountStakesPost**](AccountApi.md#accountStakesPost) | **POST** /account/stakes | Get Stake Positions
[**accountTransactionsPost**](AccountApi.md#accountTransactionsPost) | **POST** /account/transactions | Get Account Transactions
[**accountUnstakesPost**](AccountApi.md#accountUnstakesPost) | **POST** /account/unstakes | Get Unstake Positions



## accountBalancesPost

> AccountBalancesResponse accountBalancesPost(accountBalancesRequest)

Get Account Balances

Returns an account&#39;s available and staked token balances, given an account address. If an account address is valid, but doesn&#39;t have any ledger transactions against it, this endpoint still returns a successful response. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountBalancesRequest accountBalancesRequest = new AccountBalancesRequest(); // AccountBalancesRequest | 
        try {
            AccountBalancesResponse result = apiInstance.accountBalancesPost(accountBalancesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountBalancesPost");
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
 **accountBalancesRequest** | [**AccountBalancesRequest**](AccountBalancesRequest.md)|  |

### Return type

[**AccountBalancesResponse**](AccountBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Balances of Account |  -  |
| **500** | Gateway Error |  -  |


## accountDerivePost

> AccountDeriveResponse accountDerivePost(accountDeriveRequest)

Derive Account Identifier

Returns the account address associated with the given public key.

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountDeriveRequest accountDeriveRequest = new AccountDeriveRequest(); // AccountDeriveRequest | 
        try {
            AccountDeriveResponse result = apiInstance.accountDerivePost(accountDeriveRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountDerivePost");
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
 **accountDeriveRequest** | [**AccountDeriveRequest**](AccountDeriveRequest.md)|  |

### Return type

[**AccountDeriveResponse**](AccountDeriveResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token info |  -  |
| **500** | Gateway Error |  -  |


## accountStakesPost

> AccountStakesResponse accountStakesPost(accountStakesRequest)

Get Stake Positions

Returns the xrd which the account has in pending and active delegated stake positions with validators, given an account address. If an account address is valid, but doesn&#39;t have any ledger transactions against it, this endpoint still returns a successful response. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountStakesRequest accountStakesRequest = new AccountStakesRequest(); // AccountStakesRequest | 
        try {
            AccountStakesResponse result = apiInstance.accountStakesPost(accountStakesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountStakesPost");
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
 **accountStakesRequest** | [**AccountStakesRequest**](AccountStakesRequest.md)|  |

### Return type

[**AccountStakesResponse**](AccountStakesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Stake Positions |  -  |
| **500** | Gateway Error |  -  |


## accountTransactionsPost

> AccountTransactionsResponse accountTransactionsPost(accountTransactionsRequest)

Get Account Transactions

Returns user-initiated transactions involving the given account address which have been succesfully committed to the ledger. The transactions are returned in a paginated format, ordered by most recent. If an account address is valid, but doesn&#39;t have any ledger transactions against it, this endpoint still returns a successful response. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountTransactionsRequest accountTransactionsRequest = new AccountTransactionsRequest(); // AccountTransactionsRequest | 
        try {
            AccountTransactionsResponse result = apiInstance.accountTransactionsPost(accountTransactionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountTransactionsPost");
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
 **accountTransactionsRequest** | [**AccountTransactionsRequest**](AccountTransactionsRequest.md)|  |

### Return type

[**AccountTransactionsResponse**](AccountTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Transactions |  -  |
| **500** | Gateway Error |  -  |


## accountUnstakesPost

> AccountUnstakesResponse accountUnstakesPost(accountUnstakesRequest)

Get Unstake Positions

Returns the xrd which the account has in pending and temporarily-locked delegated unstake positions with validators, given an account address. If an account address is valid, but doesn&#39;t have any ledger transactions against it, this endpoint still returns a successful response. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        AccountApi apiInstance = new AccountApi(defaultClient);
        AccountUnstakesRequest accountUnstakesRequest = new AccountUnstakesRequest(); // AccountUnstakesRequest | 
        try {
            AccountUnstakesResponse result = apiInstance.accountUnstakesPost(accountUnstakesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountUnstakesPost");
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
 **accountUnstakesRequest** | [**AccountUnstakesRequest**](AccountUnstakesRequest.md)|  |

### Return type

[**AccountUnstakesResponse**](AccountUnstakesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Unstake Positions |  -  |
| **500** | Gateway Error |  -  |

