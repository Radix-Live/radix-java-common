/*
 * Radix Gateway API
 * This API is designed to enable clients to efficiently query information on the RadixDLT ledger, and allow clients to simply build and submit transactions to the network.  The API is designed for use by the Radix Foundation's [Desktop Wallet](https://wallet.radixdlt.com/) and [Explorer](https://explorer.radixdlt.com/), and replaces the original Olympia \"Archive Node API\".  # Gateway API Overview  The Gateway API is separated into distinct groupings:  * `/gateway` - Information about the Gateway API status * `/account/_*` - To query account-related information * `/token/_*` - To query token-related information * `/validator/_*` and `/validators` - To query validator-related information * `/transaction/_*` - To build, finalize and submit transactions, and to read the status and content of submitted and on-ledger transactions. * `/custom/_*` - Additional endpoints that are an unofficial extensions to the Gateway API and available only at some API providers (e.g. `https://radix.live`),           or as a custom build from a [forked repository](https://github.com/Radix-Live/radixdlt-network-gateway)  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/radixdlt-network-gateway), which is configured to read from full node/s to extract and index data from the network.  # Gateway API Format  The API is designed in a JSON-RPC style, using HTTP as a transport layer, which means that:  * All requests are POST requests. * Any error is returned with an HTTP status code of 500, with a returned error object.   * The error object contains an HTTP-like `code`   * The error object also contains a structured/typed `details` sub-object, with a `type` discriminator, allowing for structured error interpretation in clients.  # Comparison to other Radix APIs  * [Core API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/core/api.yaml) - The Core API is a low level API exposed by full nodes, and designed for use on internal networks. It is primarily designed for network integrations such as exchanges, ledger analytics providers, or hosted ledger data dashboards. The Core API provides endpoints for reading the mempool, constructing transactions and also exposes a stream of committed transactions.  * [System API](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/radixdlt/radixdlt/main/radixdlt-core/radixdlt/src/main/java/com/radixdlt/api/system/api.yaml) - The System API is a private API exposed by full nodes to read system status.  The Gateway API offers a much wider range of query options and is more performant than the Core API. It is built on top of the Core API, ingesting data via the Core API transaction stream into a relational database.  The Gateway API transaction/construction endpoints operate with the concept of \"actions\" - these are higher-levels of intent compared with the Core API, which makes it easier for clients to use. The Core API should be used if you require more power/flexiblity for managing UTXOs, or submitting transactions which can't be mapped to a Gateway API action. 
 *
 * The version of the OpenAPI document: 1.1.4.1-L
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package live.radix.gateway.client;

import com.fasterxml.jackson.core.type.TypeReference;

import live.radix.gateway.ApiException;
import live.radix.gateway.ApiClient;
import live.radix.gateway.Configuration;
import live.radix.gateway.model.*;
import live.radix.gateway.Pair;

import live.radix.gateway.model.ErrorResponse;
import live.radix.gateway.model.GatewayResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T00:27:56.028352900+03:00[Europe/Kiev]")
public class StatusApi {
  private ApiClient apiClient;

  public StatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatusApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Gateway Info
   * Returns the Gateway API version, network and current ledger state.
   * @param body  (required)
   * @return GatewayResponse
   * @throws ApiException if fails to make API call
   */
  public GatewayResponse gatewayPost(Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling gatewayPost");
    }
    
    // create path and map variables
    String localVarPath = "/gateway";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GatewayResponse> localVarReturnType = new TypeReference<GatewayResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
