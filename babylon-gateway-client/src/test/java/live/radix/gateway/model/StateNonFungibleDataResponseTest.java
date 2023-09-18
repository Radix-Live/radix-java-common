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


package live.radix.gateway.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import live.radix.gateway.model.LedgerState;
import live.radix.gateway.model.NonFungibleIdType;
import live.radix.gateway.model.StateNonFungibleDetailsResponseItem;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for StateNonFungibleDataResponse
 */
public class StateNonFungibleDataResponseTest {
    private final StateNonFungibleDataResponse model = new StateNonFungibleDataResponse();

    /**
     * Model tests for StateNonFungibleDataResponse
     */
    @Test
    public void testStateNonFungibleDataResponse() {
        // TODO: test StateNonFungibleDataResponse
    }

    /**
     * Test the property 'ledgerState'
     */
    @Test
    public void ledgerStateTest() {
        // TODO: test ledgerState
    }

    /**
     * Test the property 'resourceAddress'
     */
    @Test
    public void resourceAddressTest() {
        // TODO: test resourceAddress
    }

    /**
     * Test the property 'nonFungibleIdType'
     */
    @Test
    public void nonFungibleIdTypeTest() {
        // TODO: test nonFungibleIdType
    }

    /**
     * Test the property 'nonFungibleIds'
     */
    @Test
    public void nonFungibleIdsTest() {
        // TODO: test nonFungibleIds
    }

}
