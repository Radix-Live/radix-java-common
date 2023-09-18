/*
 * Babylon Core API - RCnet v3.1
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  It is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  This version of the Core API belongs to the fourth release candidate of the Radix Babylon network (\"RCnet v3.1\").  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` are guaranteed to be forward compatible to Babylon mainnet launch (and beyond). We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code. 
 *
 * The version of the OpenAPI document: 0.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package live.radix.core.client;

import com.fasterxml.jackson.core.type.TypeReference;

import live.radix.core.ApiException;
import live.radix.core.ApiClient;
import live.radix.core.Configuration;
import live.radix.core.model.*;
import live.radix.core.Pair;

import live.radix.core.model.BasicErrorResponse;
import live.radix.core.model.TransactionCallPreviewRequest;
import live.radix.core.model.TransactionCallPreviewResponse;
import live.radix.core.model.TransactionParseRequest;
import live.radix.core.model.TransactionParseResponse;
import live.radix.core.model.TransactionPreviewRequest;
import live.radix.core.model.TransactionPreviewResponse;
import live.radix.core.model.TransactionReceiptRequest;
import live.radix.core.model.TransactionReceiptResponse;
import live.radix.core.model.TransactionStatusRequest;
import live.radix.core.model.TransactionStatusResponse;
import live.radix.core.model.TransactionSubmitErrorResponse;
import live.radix.core.model.TransactionSubmitRequest;
import live.radix.core.model.TransactionSubmitResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class TransactionApi {


  private ApiClient apiClient;

  public TransactionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Scrypto Call Preview
   * Preview a scrypto function or method call against the latest network state. Returns the result of the scrypto function or method call. 
   * @param transactionCallPreviewRequest  (required)
   * @return TransactionCallPreviewResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionCallPreviewResponse transactionCallPreviewPost(TransactionCallPreviewRequest transactionCallPreviewRequest) throws ApiException {
    return this.transactionCallPreviewPost(transactionCallPreviewRequest, Collections.emptyMap());
  }


  /**
   * Scrypto Call Preview
   * Preview a scrypto function or method call against the latest network state. Returns the result of the scrypto function or method call. 
   * @param transactionCallPreviewRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionCallPreviewResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionCallPreviewResponse transactionCallPreviewPost(TransactionCallPreviewRequest transactionCallPreviewRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionCallPreviewRequest;
    
    // verify the required parameter 'transactionCallPreviewRequest' is set
    if (transactionCallPreviewRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionCallPreviewRequest' when calling transactionCallPreviewPost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/call-preview";

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

    TypeReference<TransactionCallPreviewResponse> localVarReturnType = new TypeReference<TransactionCallPreviewResponse>() {};
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

  /**
   * Parse Transaction Payload
   * Extracts the contents and hashes of various types of transaction payloads, or sub-payloads.
   * @param transactionParseRequest  (required)
   * @return TransactionParseResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionParseResponse transactionParsePost(TransactionParseRequest transactionParseRequest) throws ApiException {
    return this.transactionParsePost(transactionParseRequest, Collections.emptyMap());
  }


  /**
   * Parse Transaction Payload
   * Extracts the contents and hashes of various types of transaction payloads, or sub-payloads.
   * @param transactionParseRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionParseResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionParseResponse transactionParsePost(TransactionParseRequest transactionParseRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionParseRequest;
    
    // verify the required parameter 'transactionParseRequest' is set
    if (transactionParseRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionParseRequest' when calling transactionParsePost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/parse";

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

    TypeReference<TransactionParseResponse> localVarReturnType = new TypeReference<TransactionParseResponse>() {};
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

  /**
   * Transaction Preview
   * Preview a transaction against the latest network state, and returns the preview receipt. 
   * @param transactionPreviewRequest  (required)
   * @return TransactionPreviewResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionPreviewResponse transactionPreviewPost(TransactionPreviewRequest transactionPreviewRequest) throws ApiException {
    return this.transactionPreviewPost(transactionPreviewRequest, Collections.emptyMap());
  }


  /**
   * Transaction Preview
   * Preview a transaction against the latest network state, and returns the preview receipt. 
   * @param transactionPreviewRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionPreviewResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionPreviewResponse transactionPreviewPost(TransactionPreviewRequest transactionPreviewRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionPreviewRequest;
    
    // verify the required parameter 'transactionPreviewRequest' is set
    if (transactionPreviewRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionPreviewRequest' when calling transactionPreviewPost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/preview";

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

    TypeReference<TransactionPreviewResponse> localVarReturnType = new TypeReference<TransactionPreviewResponse>() {};
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

  /**
   * Get Transaction Receipt
   * Gets the transaction receipt for a committed transaction. 
   * @param transactionReceiptRequest  (required)
   * @return TransactionReceiptResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionReceiptResponse transactionReceiptPost(TransactionReceiptRequest transactionReceiptRequest) throws ApiException {
    return this.transactionReceiptPost(transactionReceiptRequest, Collections.emptyMap());
  }


  /**
   * Get Transaction Receipt
   * Gets the transaction receipt for a committed transaction. 
   * @param transactionReceiptRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionReceiptResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionReceiptResponse transactionReceiptPost(TransactionReceiptRequest transactionReceiptRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionReceiptRequest;
    
    // verify the required parameter 'transactionReceiptRequest' is set
    if (transactionReceiptRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionReceiptRequest' when calling transactionReceiptPost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/receipt";

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

    TypeReference<TransactionReceiptResponse> localVarReturnType = new TypeReference<TransactionReceiptResponse>() {};
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

  /**
   * Get Transaction Status
   * Shares the node&#39;s knowledge of any payloads associated with the given intent hash. Generally there will be a single payload for a given intent, but it&#39;s theoretically possible there may be multiple. This knowledge is summarised into a status for the intent. This summarised status in the response is likely sufficient for most clients. 
   * @param transactionStatusRequest  (required)
   * @return TransactionStatusResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionStatusResponse transactionStatusPost(TransactionStatusRequest transactionStatusRequest) throws ApiException {
    return this.transactionStatusPost(transactionStatusRequest, Collections.emptyMap());
  }


  /**
   * Get Transaction Status
   * Shares the node&#39;s knowledge of any payloads associated with the given intent hash. Generally there will be a single payload for a given intent, but it&#39;s theoretically possible there may be multiple. This knowledge is summarised into a status for the intent. This summarised status in the response is likely sufficient for most clients. 
   * @param transactionStatusRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionStatusResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionStatusResponse transactionStatusPost(TransactionStatusRequest transactionStatusRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionStatusRequest;
    
    // verify the required parameter 'transactionStatusRequest' is set
    if (transactionStatusRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionStatusRequest' when calling transactionStatusPost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/status";

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

    TypeReference<TransactionStatusResponse> localVarReturnType = new TypeReference<TransactionStatusResponse>() {};
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

  /**
   * Transaction Submit
   * Submits a notarized transaction to the network. Returns whether the transaction submission was already included in the node&#39;s mempool. 
   * @param transactionSubmitRequest  (required)
   * @return TransactionSubmitResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionSubmitResponse transactionSubmitPost(TransactionSubmitRequest transactionSubmitRequest) throws ApiException {
    return this.transactionSubmitPost(transactionSubmitRequest, Collections.emptyMap());
  }


  /**
   * Transaction Submit
   * Submits a notarized transaction to the network. Returns whether the transaction submission was already included in the node&#39;s mempool. 
   * @param transactionSubmitRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return TransactionSubmitResponse
   * @throws ApiException if fails to make API call
   */
  public TransactionSubmitResponse transactionSubmitPost(TransactionSubmitRequest transactionSubmitRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = transactionSubmitRequest;
    
    // verify the required parameter 'transactionSubmitRequest' is set
    if (transactionSubmitRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionSubmitRequest' when calling transactionSubmitPost");
    }
    
    // create path and map variables
    String localVarPath = "/transaction/submit";

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

    TypeReference<TransactionSubmitResponse> localVarReturnType = new TypeReference<TransactionSubmitResponse>() {};
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