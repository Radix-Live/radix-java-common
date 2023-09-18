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

import live.radix.core.ApiException;
import live.radix.core.model.BasicErrorResponse;
import live.radix.core.model.NetworkConfigurationResponse;
import live.radix.core.model.NetworkStatusRequest;
import live.radix.core.model.NetworkStatusResponse;
import live.radix.core.model.ScenariosRequest;
import live.radix.core.model.ScenariosResponse;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Ignore
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    /**
     * Get Network Configuration
     *
     * Returns the network configuration of the network the node is connected to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusNetworkConfigurationPostTest() throws ApiException {
        NetworkConfigurationResponse response = api.statusNetworkConfigurationPost();

        // TODO: test validations
    }
    /**
     * Get Network Status
     *
     * Returns the current state and status of the node&#39;s copy of the ledger.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusNetworkStatusPostTest() throws ApiException {
        NetworkStatusRequest networkStatusRequest = null;
        NetworkStatusResponse response = api.statusNetworkStatusPost(networkStatusRequest);

        // TODO: test validations
    }
    /**
     * Get Scenarios&#39; results.
     *
     * Get results of test-oriented \&quot;Genesis Scenarios\&quot; executed on this Network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusScenariosPostTest() throws ApiException {
        ScenariosRequest scenariosRequest = null;
        ScenariosResponse response = api.statusScenariosPost(scenariosRequest);

        // TODO: test validations
    }
}