# StatusApi

All URIs are relative to *https://mainnet.radixdlt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gatewayStatus**](StatusApi.md#gatewayStatus) | **POST** /status/gateway-status | Get Gateway Status |
| [**networkConfiguration**](StatusApi.md#networkConfiguration) | **POST** /status/network-configuration | Get Network Configuration |



## gatewayStatus

> GatewayStatusResponse gatewayStatus()

Get Gateway Status

Returns the Gateway API version and current ledger state. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            GatewayStatusResponse result = apiInstance.gatewayStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#gatewayStatus");
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

[**GatewayStatusResponse**](GatewayStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Network Gateway Information |  -  |


## networkConfiguration

> NetworkConfigurationResponse networkConfiguration()

Get Network Configuration

Returns network identifier, network name and well-known network addresses. 

### Example

```java
// Import classes:
import live.radix.gateway.ApiClient;
import live.radix.gateway.ApiException;
import live.radix.gateway.Configuration;
import live.radix.gateway.models.*;
import live.radix.gateway.client.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mainnet.radixdlt.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            NetworkConfigurationResponse result = apiInstance.networkConfiguration();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#networkConfiguration");
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

