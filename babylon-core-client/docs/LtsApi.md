# LtsApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ltsStateAccountAllFungibleResourceBalancesPost**](LtsApi.md#ltsStateAccountAllFungibleResourceBalancesPost) | **POST** /lts/state/account-all-fungible-resource-balances | Get All Account Balances |
| [**ltsStateAccountFungibleResourceBalancePost**](LtsApi.md#ltsStateAccountFungibleResourceBalancePost) | **POST** /lts/state/account-fungible-resource-balance | Get Single Account Balance |
| [**ltsStreamAccountTransactionOutcomesPost**](LtsApi.md#ltsStreamAccountTransactionOutcomesPost) | **POST** /lts/stream/account-transaction-outcomes | Get Account Transaction Outcomes |
| [**ltsStreamTransactionOutcomesPost**](LtsApi.md#ltsStreamTransactionOutcomesPost) | **POST** /lts/stream/transaction-outcomes | Get Transaction Outcomes |
| [**ltsTransactionConstructionPost**](LtsApi.md#ltsTransactionConstructionPost) | **POST** /lts/transaction/construction | Get Construction Metadata |
| [**ltsTransactionStatusPost**](LtsApi.md#ltsTransactionStatusPost) | **POST** /lts/transaction/status | Get Transaction Status |
| [**ltsTransactionSubmitPost**](LtsApi.md#ltsTransactionSubmitPost) | **POST** /lts/transaction/submit | Submit Transaction |



## ltsStateAccountAllFungibleResourceBalancesPost

> LtsStateAccountAllFungibleResourceBalancesResponse ltsStateAccountAllFungibleResourceBalancesPost(ltsStateAccountAllFungibleResourceBalancesRequest)

Get All Account Balances

Returns balances for all resources associated with an account

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsStateAccountAllFungibleResourceBalancesRequest ltsStateAccountAllFungibleResourceBalancesRequest = new LtsStateAccountAllFungibleResourceBalancesRequest(); // LtsStateAccountAllFungibleResourceBalancesRequest | 
        try {
            LtsStateAccountAllFungibleResourceBalancesResponse result = apiInstance.ltsStateAccountAllFungibleResourceBalancesPost(ltsStateAccountAllFungibleResourceBalancesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsStateAccountAllFungibleResourceBalancesPost");
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
| **ltsStateAccountAllFungibleResourceBalancesRequest** | [**LtsStateAccountAllFungibleResourceBalancesRequest**](LtsStateAccountAllFungibleResourceBalancesRequest.md)|  | |

### Return type

[**LtsStateAccountAllFungibleResourceBalancesResponse**](LtsStateAccountAllFungibleResourceBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account all resource balances response |  -  |
| **500** | Server error |  -  |


## ltsStateAccountFungibleResourceBalancePost

> LtsStateAccountFungibleResourceBalanceResponse ltsStateAccountFungibleResourceBalancePost(ltsStateAccountFungibleResourceBalanceRequest)

Get Single Account Balance

Returns balance of a single fungible resource in an account

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsStateAccountFungibleResourceBalanceRequest ltsStateAccountFungibleResourceBalanceRequest = new LtsStateAccountFungibleResourceBalanceRequest(); // LtsStateAccountFungibleResourceBalanceRequest | 
        try {
            LtsStateAccountFungibleResourceBalanceResponse result = apiInstance.ltsStateAccountFungibleResourceBalancePost(ltsStateAccountFungibleResourceBalanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsStateAccountFungibleResourceBalancePost");
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
| **ltsStateAccountFungibleResourceBalanceRequest** | [**LtsStateAccountFungibleResourceBalanceRequest**](LtsStateAccountFungibleResourceBalanceRequest.md)|  | |

### Return type

[**LtsStateAccountFungibleResourceBalanceResponse**](LtsStateAccountFungibleResourceBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Account resource balance response |  -  |
| **500** | Server error |  -  |


## ltsStreamAccountTransactionOutcomesPost

> LtsStreamAccountTransactionOutcomesResponse ltsStreamAccountTransactionOutcomesPost(ltsStreamAccountTransactionOutcomesRequest)

Get Account Transaction Outcomes

Returns a list of committed transaction outcomes (containing balance changes) from a given state version, filtered to only transactions which involved the given account. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsStreamAccountTransactionOutcomesRequest ltsStreamAccountTransactionOutcomesRequest = new LtsStreamAccountTransactionOutcomesRequest(); // LtsStreamAccountTransactionOutcomesRequest | 
        try {
            LtsStreamAccountTransactionOutcomesResponse result = apiInstance.ltsStreamAccountTransactionOutcomesPost(ltsStreamAccountTransactionOutcomesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsStreamAccountTransactionOutcomesPost");
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
| **ltsStreamAccountTransactionOutcomesRequest** | [**LtsStreamAccountTransactionOutcomesRequest**](LtsStreamAccountTransactionOutcomesRequest.md)|  | |

### Return type

[**LtsStreamAccountTransactionOutcomesResponse**](LtsStreamAccountTransactionOutcomesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paged response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## ltsStreamTransactionOutcomesPost

> LtsStreamTransactionOutcomesResponse ltsStreamTransactionOutcomesPost(ltsStreamTransactionOutcomesRequest)

Get Transaction Outcomes

Returns a list of committed transaction outcomes (containing balance changes) from a given state version. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsStreamTransactionOutcomesRequest ltsStreamTransactionOutcomesRequest = new LtsStreamTransactionOutcomesRequest(); // LtsStreamTransactionOutcomesRequest | 
        try {
            LtsStreamTransactionOutcomesResponse result = apiInstance.ltsStreamTransactionOutcomesPost(ltsStreamTransactionOutcomesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsStreamTransactionOutcomesPost");
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
| **ltsStreamTransactionOutcomesRequest** | [**LtsStreamTransactionOutcomesRequest**](LtsStreamTransactionOutcomesRequest.md)|  | |

### Return type

[**LtsStreamTransactionOutcomesResponse**](LtsStreamTransactionOutcomesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paged response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## ltsTransactionConstructionPost

> LtsTransactionConstructionResponse ltsTransactionConstructionPost(ltsTransactionConstructionRequest)

Get Construction Metadata

Returns information necessary to build a transaction

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsTransactionConstructionRequest ltsTransactionConstructionRequest = new LtsTransactionConstructionRequest(); // LtsTransactionConstructionRequest | 
        try {
            LtsTransactionConstructionResponse result = apiInstance.ltsTransactionConstructionPost(ltsTransactionConstructionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsTransactionConstructionPost");
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
| **ltsTransactionConstructionRequest** | [**LtsTransactionConstructionRequest**](LtsTransactionConstructionRequest.md)|  | |

### Return type

[**LtsTransactionConstructionResponse**](LtsTransactionConstructionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All info needed to build a transaction |  -  |
| **500** | Server error |  -  |


## ltsTransactionStatusPost

> LtsTransactionStatusResponse ltsTransactionStatusPost(ltsTransactionStatusRequest)

Get Transaction Status

Shares the node&#39;s knowledge of any payloads associated with the given intent hash. Generally there will be a single payload for a given intent, but it&#39;s theoretically possible there may be multiple. This knowledge is summarised into a status for the intent. This summarised status in the response is likely sufficient for most clients. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsTransactionStatusRequest ltsTransactionStatusRequest = new LtsTransactionStatusRequest(); // LtsTransactionStatusRequest | 
        try {
            LtsTransactionStatusResponse result = apiInstance.ltsTransactionStatusPost(ltsTransactionStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsTransactionStatusPost");
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
| **ltsTransactionStatusRequest** | [**LtsTransactionStatusRequest**](LtsTransactionStatusRequest.md)|  | |

### Return type

[**LtsTransactionStatusResponse**](LtsTransactionStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction status response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |


## ltsTransactionSubmitPost

> LtsTransactionSubmitResponse ltsTransactionSubmitPost(ltsTransactionSubmitRequest)

Submit Transaction

Submits a notarized transaction to the network. Returns whether the transaction submission was already included in the node&#39;s mempool. 

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.LtsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        LtsApi apiInstance = new LtsApi(defaultClient);
        LtsTransactionSubmitRequest ltsTransactionSubmitRequest = new LtsTransactionSubmitRequest(); // LtsTransactionSubmitRequest | 
        try {
            LtsTransactionSubmitResponse result = apiInstance.ltsTransactionSubmitPost(ltsTransactionSubmitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LtsApi#ltsTransactionSubmitPost");
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
| **ltsTransactionSubmitRequest** | [**LtsTransactionSubmitRequest**](LtsTransactionSubmitRequest.md)|  | |

### Return type

[**LtsTransactionSubmitResponse**](LtsTransactionSubmitResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction Submit Response |  -  |
| **400** | Client error |  -  |
| **500** | Server error |  -  |

