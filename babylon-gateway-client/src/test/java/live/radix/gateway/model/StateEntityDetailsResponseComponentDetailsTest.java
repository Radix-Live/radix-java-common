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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.gateway.model.ComponentEntityRoleAssignments;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetails;
import live.radix.gateway.model.StateEntityDetailsResponseItemDetailsType;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for StateEntityDetailsResponseComponentDetails
 */
public class StateEntityDetailsResponseComponentDetailsTest {
    private final StateEntityDetailsResponseComponentDetails model = new StateEntityDetailsResponseComponentDetails();

    /**
     * Model tests for StateEntityDetailsResponseComponentDetails
     */
    @Test
    public void testStateEntityDetailsResponseComponentDetails() {
        // TODO: test StateEntityDetailsResponseComponentDetails
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'packageAddress'
     */
    @Test
    public void packageAddressTest() {
        // TODO: test packageAddress
    }

    /**
     * Test the property 'blueprintName'
     */
    @Test
    public void blueprintNameTest() {
        // TODO: test blueprintName
    }

    /**
     * Test the property 'blueprintVersion'
     */
    @Test
    public void blueprintVersionTest() {
        // TODO: test blueprintVersion
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'roleAssignments'
     */
    @Test
    public void roleAssignmentsTest() {
        // TODO: test roleAssignments
    }

    /**
     * Test the property 'royaltyVaultBalance'
     */
    @Test
    public void royaltyVaultBalanceTest() {
        // TODO: test royaltyVaultBalance
    }

}
