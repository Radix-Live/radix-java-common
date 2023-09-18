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


package live.radix.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import live.radix.core.model.ConsensusManagerFieldCurrentTimeValue;
import live.radix.core.model.Substate;
import live.radix.core.model.SubstateType;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ConsensusManagerFieldCurrentTimeSubstate
 */
public class ConsensusManagerFieldCurrentTimeSubstateTest {
    private final ConsensusManagerFieldCurrentTimeSubstate model = new ConsensusManagerFieldCurrentTimeSubstate();

    /**
     * Model tests for ConsensusManagerFieldCurrentTimeSubstate
     */
    @Test
    public void testConsensusManagerFieldCurrentTimeSubstate() {
        // TODO: test ConsensusManagerFieldCurrentTimeSubstate
    }

    /**
     * Test the property 'substateType'
     */
    @Test
    public void substateTypeTest() {
        // TODO: test substateType
    }

    /**
     * Test the property 'isLocked'
     */
    @Test
    public void isLockedTest() {
        // TODO: test isLocked
    }

    /**
     * Test the property 'value'
     */
    @Test
    public void valueTest() {
        // TODO: test value
    }

}
