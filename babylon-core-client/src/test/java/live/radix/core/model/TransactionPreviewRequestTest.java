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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import live.radix.core.model.PublicKey;
import live.radix.core.model.TransactionMessage;
import live.radix.core.model.TransactionPreviewRequestFlags;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TransactionPreviewRequest
 */
public class TransactionPreviewRequestTest {
    private final TransactionPreviewRequest model = new TransactionPreviewRequest();

    /**
     * Model tests for TransactionPreviewRequest
     */
    @Test
    public void testTransactionPreviewRequest() {
        // TODO: test TransactionPreviewRequest
    }

    /**
     * Test the property 'network'
     */
    @Test
    public void networkTest() {
        // TODO: test network
    }

    /**
     * Test the property 'manifest'
     */
    @Test
    public void manifestTest() {
        // TODO: test manifest
    }

    /**
     * Test the property 'blobsHex'
     */
    @Test
    public void blobsHexTest() {
        // TODO: test blobsHex
    }

    /**
     * Test the property 'startEpochInclusive'
     */
    @Test
    public void startEpochInclusiveTest() {
        // TODO: test startEpochInclusive
    }

    /**
     * Test the property 'endEpochExclusive'
     */
    @Test
    public void endEpochExclusiveTest() {
        // TODO: test endEpochExclusive
    }

    /**
     * Test the property 'notaryPublicKey'
     */
    @Test
    public void notaryPublicKeyTest() {
        // TODO: test notaryPublicKey
    }

    /**
     * Test the property 'notaryIsSignatory'
     */
    @Test
    public void notaryIsSignatoryTest() {
        // TODO: test notaryIsSignatory
    }

    /**
     * Test the property 'tipPercentage'
     */
    @Test
    public void tipPercentageTest() {
        // TODO: test tipPercentage
    }

    /**
     * Test the property 'nonce'
     */
    @Test
    public void nonceTest() {
        // TODO: test nonce
    }

    /**
     * Test the property 'signerPublicKeys'
     */
    @Test
    public void signerPublicKeysTest() {
        // TODO: test signerPublicKeys
    }

    /**
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
        // TODO: test message
    }

    /**
     * Test the property 'flags'
     */
    @Test
    public void flagsTest() {
        // TODO: test flags
    }

}
