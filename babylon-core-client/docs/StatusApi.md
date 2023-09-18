# StatusApi

All URIs are relative to *http://localhost:3333/core*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statusNetworkConfigurationPost**](StatusApi.md#statusNetworkConfigurationPost) | **POST** /status/network-configuration | Get Network Configuration |
| [**statusNetworkStatusPost**](StatusApi.md#statusNetworkStatusPost) | **POST** /status/network-status | Get Network Status |
| [**statusScenariosPost**](StatusApi.md#statusScenariosPost) | **POST** /status/scenarios | Get Scenarios&#39; results. |



## statusNetworkConfigurationPost

> NetworkConfigurationResponse statusNetworkConfigurationPost()

Get Network Configuration

Returns the network configuration of the network the node is connected to.

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            NetworkConfigurationResponse result = apiInstance.statusNetworkConfigurationPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#statusNetworkConfigurationPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**NetworkConfigurationResponse**](NetworkConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network Configuration |  -  |
| **500** | Server error |  -  |


## statusNetworkStatusPost

> NetworkStatusResponse statusNetworkStatusPost(networkStatusRequest)

Get Network Status

Returns the current state and status of the node&#39;s copy of the ledger.

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StatusApi apiInstance = new StatusApi(defaultClient);
        NetworkStatusRequest networkStatusRequest = new NetworkStatusRequest(); // NetworkStatusRequest | 
        try {
            NetworkStatusResponse result = apiInstance.statusNetworkStatusPost(networkStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#statusNetworkStatusPost");
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
| **networkStatusRequest** | [**NetworkStatusRequest**](NetworkStatusRequest.md)|  | |

### Return type

[**NetworkStatusResponse**](NetworkStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network Status |  -  |
| **500** | Server error |  -  |


## statusScenariosPost

> ScenariosResponse statusScenariosPost(scenariosRequest)

Get Scenarios&#39; results.

Get results of test-oriented \&quot;Genesis Scenarios\&quot; executed on this Network.

### Example

```java
// Import classes:
import live.radix.core.ApiClient;
import live.radix.core.ApiException;
import live.radix.core.Configuration;
import live.radix.core.models.*;
import live.radix.core.client.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3333/core");

        StatusApi apiInstance = new StatusApi(defaultClient);
        ScenariosRequest scenariosRequest = new ScenariosRequest(); // ScenariosRequest | 
        try {
            ScenariosResponse result = apiInstance.statusScenariosPost(scenariosRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#statusScenariosPost");
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
| **scenariosRequest** | [**ScenariosRequest**](ScenariosRequest.md)|  | |

### Return type

[**ScenariosResponse**](ScenariosResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scenarios&#39; results |  -  |
| **500** | Server error |  -  |

