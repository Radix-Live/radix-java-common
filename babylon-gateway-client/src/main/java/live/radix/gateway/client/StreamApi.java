/*
 * Babylon Gateway API - RCnet V3
 * This API is exposed by the Babylon Radix Gateway to enable clients to efficiently query current and historic state on the RadixDLT ledger, and intelligently handle transaction submission.  It is designed for use by wallets and explorers. For simple use cases, you can typically use the Core API on a Node. A Gateway is only needed for reading historic snapshots of ledger states or a more robust set-up.  The Gateway API is implemented by the [Network Gateway](https://github.com/radixdlt/babylon-gateway), which is configured to read from [full node(s)](https://github.com/radixdlt/babylon-node) to extract and index data from the network.  This document is an API reference documentation, visit [User Guide](https://docs-babylon.radixdlt.com/) to learn more about how to run a Gateway of your own.  ## Migration guide  Please see [the latest release notes](https://github.com/radixdlt/babylon-gateway/releases).  ## Integration and forward compatibility guarantees  We give no guarantees that other endpoints will not change before Babylon mainnet launch, although changes are expected to be minimal. 
 *
 * The version of the OpenAPI document: 0.5.0
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
import live.radix.gateway.model.StreamTransactionsRequest;
import live.radix.gateway.model.StreamTransactionsResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:19:23.851991900+03:00[Europe/Kiev]")
public class StreamApi {


  private ApiClient apiClient;

  public StreamApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StreamApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Transactions Stream
   * Returns transactions which have been committed to the ledger. 
   * @param streamTransactionsRequest  (required)
   * @return StreamTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public StreamTransactionsResponse streamTransactions(StreamTransactionsRequest streamTransactionsRequest) throws ApiException {
    return this.streamTransactions(streamTransactionsRequest, Collections.emptyMap());
  }


  /**
   * Get Transactions Stream
   * Returns transactions which have been committed to the ledger. 
   * @param streamTransactionsRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StreamTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public StreamTransactionsResponse streamTransactions(StreamTransactionsRequest streamTransactionsRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = streamTransactionsRequest;
    
    // verify the required parameter 'streamTransactionsRequest' is set
    if (streamTransactionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'streamTransactionsRequest' when calling streamTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/stream/transactions";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<StreamTransactionsResponse> localVarReturnType = new TypeReference<StreamTransactionsResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
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