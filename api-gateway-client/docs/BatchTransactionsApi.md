# BatchTransactionsApi

All URIs are relative to *http://localhost:5208*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customTransactionsBatchSinceAccountTransactionsPost**](BatchTransactionsApi.md#customTransactionsBatchSinceAccountTransactionsPost) | **POST** /custom/transactions-batch/since-account-transactions | Batch Polling of new Transactions
[**customTransactionsBatchSinceLedgerStatePost**](BatchTransactionsApi.md#customTransactionsBatchSinceLedgerStatePost) | **POST** /custom/transactions-batch/since-ledger-state | Batch request transactions for multiple accounts.



## customTransactionsBatchSinceAccountTransactionsPost

> TransactionsSinceHashBatchResponse customTransactionsBatchSinceAccountTransactionsPost(transactionsSinceHashBatchRequest)

Batch Polling of new Transactions

Returns a list of transactions for each of the requested accounts, that were committed after the requested transaction hash.&lt;br&gt; The transactions are grouped by accounts and ordered by date (oldest first).&lt;br&gt; The pagination is not supported; the clients are expected to perform a new request with updated last seen transaction hashes.&lt;br&gt; If there are no new transactions for one of the specified accounts - it will be omitted from the response.&lt;br&gt; If there are no new transactions for all of the specified accounts - the endpoint will return a successful response with an empty list of AccountTransactions.&lt;br&gt; If there is a transaction that is related to two or more requested accounts - it will be included in the response multiple times - once per each related account.&lt;br&gt; A typical use usage scenario: 1. Execute the request for a list of accounts, without specifying the TX hashes in the request 2. Process the received transactions, store the last seen transaction for each monitored account 3. Execute a new request, this time supply the last seen transaction hashes in the request 4. Process the received transactions, store the last seen transaction for each monitored account 5. Repeat #3-#4 while received TX count &#x3D;&#x3D; limit 6. After some interval (1-5 minutes) - goto #3. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.BatchTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        BatchTransactionsApi apiInstance = new BatchTransactionsApi(defaultClient);
        TransactionsSinceHashBatchRequest transactionsSinceHashBatchRequest = new TransactionsSinceHashBatchRequest(); // TransactionsSinceHashBatchRequest | 
        try {
            TransactionsSinceHashBatchResponse result = apiInstance.customTransactionsBatchSinceAccountTransactionsPost(transactionsSinceHashBatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchTransactionsApi#customTransactionsBatchSinceAccountTransactionsPost");
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
 **transactionsSinceHashBatchRequest** | [**TransactionsSinceHashBatchRequest**](TransactionsSinceHashBatchRequest.md)|  |

### Return type

[**TransactionsSinceHashBatchResponse**](TransactionsSinceHashBatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The oldest transactions that match the criteria |  -  |
| **500** | Gateway Error |  -  |


## customTransactionsBatchSinceLedgerStatePost

> TransactionsSinceStateBatchResponse customTransactionsBatchSinceLedgerStatePost(transactionsSinceStateBatchRequest)

Batch request transactions for multiple accounts.

Returns a list of transactions for each of the requested accounts, that were committed after the requested historical ledger state.&lt;br&gt; The transactions are returned in a paginated format, grouped by accounts and ordered by date (oldest first).&lt;br&gt; To get the next page - execute a new request with the \&quot;cursor\&quot; object received in the response.&lt;br&gt; If there are no transactions for one of the specified accounts - it will be omitted from the response.&lt;br&gt; If there are no transactions for all of the specified accounts - the endpoint will still return a successful response with an empty list of AccountTransactions.&lt;br&gt; If there is a transaction that is related to two or more requested accounts - it will be included in the response multiple times - once per each related account.&lt;br&gt;  &#x60;since_state_identifier&#x60; - Transactions from this or any earlier state versions will not be included into the response.&lt;br&gt; &#x60;at_state_identifier&#x60; - The most recent state version to include (inclusive). Optional, by default the most recent observed state will be used.&lt;br&gt; &#x60;cursor&#x60; - The value from the previous page request. If set, overrides &#x60;since_state_identifier&#x60; param.&lt;br&gt; One of [&#x60;since_state_identifier&#x60;, &#x60;cursor&#x60;] is required. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.BatchTransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5208");

        BatchTransactionsApi apiInstance = new BatchTransactionsApi(defaultClient);
        TransactionsSinceStateBatchRequest transactionsSinceStateBatchRequest = new TransactionsSinceStateBatchRequest(); // TransactionsSinceStateBatchRequest | 
        try {
            TransactionsSinceStateBatchResponse result = apiInstance.customTransactionsBatchSinceLedgerStatePost(transactionsSinceStateBatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BatchTransactionsApi#customTransactionsBatchSinceLedgerStatePost");
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
 **transactionsSinceStateBatchRequest** | [**TransactionsSinceStateBatchRequest**](TransactionsSinceStateBatchRequest.md)|  |

### Return type

[**TransactionsSinceStateBatchResponse**](TransactionsSinceStateBatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The oldest transactions that match the criteria |  -  |
| **500** | Gateway Error |  -  |

