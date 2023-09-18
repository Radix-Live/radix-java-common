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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import live.radix.core.model.LedgerStateSummary;
import live.radix.core.model.StateComponentDescendentNode;
import live.radix.core.model.Substate;
import live.radix.core.model.VaultBalance;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateAccessControllerResponse
 */
@JsonPropertyOrder({
  StateAccessControllerResponse.JSON_PROPERTY_AT_LEDGER_STATE,
  StateAccessControllerResponse.JSON_PROPERTY_STATE,
  StateAccessControllerResponse.JSON_PROPERTY_OWNER_ROLE,
  StateAccessControllerResponse.JSON_PROPERTY_VAULTS,
  StateAccessControllerResponse.JSON_PROPERTY_DESCENDENT_NODES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class StateAccessControllerResponse {
  public static final String JSON_PROPERTY_AT_LEDGER_STATE = "at_ledger_state";
  private LedgerStateSummary atLedgerState;

  public static final String JSON_PROPERTY_STATE = "state";
  private Substate state;

  public static final String JSON_PROPERTY_OWNER_ROLE = "owner_role";
  private Substate ownerRole;

  public static final String JSON_PROPERTY_VAULTS = "vaults";
  private List<VaultBalance> vaults = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCENDENT_NODES = "descendent_nodes";
  private List<StateComponentDescendentNode> descendentNodes = new ArrayList<>();

  public StateAccessControllerResponse() {
  }

  public StateAccessControllerResponse atLedgerState(LedgerStateSummary atLedgerState) {
    
    this.atLedgerState = atLedgerState;
    return this;
  }

   /**
   * Get atLedgerState
   * @return atLedgerState
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LedgerStateSummary getAtLedgerState() {
    return atLedgerState;
  }


  @JsonProperty(JSON_PROPERTY_AT_LEDGER_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtLedgerState(LedgerStateSummary atLedgerState) {
    this.atLedgerState = atLedgerState;
  }


  public StateAccessControllerResponse state(Substate state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Substate getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(Substate state) {
    this.state = state;
  }


  public StateAccessControllerResponse ownerRole(Substate ownerRole) {
    
    this.ownerRole = ownerRole;
    return this;
  }

   /**
   * Get ownerRole
   * @return ownerRole
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OWNER_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Substate getOwnerRole() {
    return ownerRole;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnerRole(Substate ownerRole) {
    this.ownerRole = ownerRole;
  }


  public StateAccessControllerResponse vaults(List<VaultBalance> vaults) {
    
    this.vaults = vaults;
    return this;
  }

  public StateAccessControllerResponse addVaultsItem(VaultBalance vaultsItem) {
    if (this.vaults == null) {
      this.vaults = new ArrayList<>();
    }
    this.vaults.add(vaultsItem);
    return this;
  }

   /**
   * Any vaults owned directly or indirectly by the component
   * @return vaults
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<VaultBalance> getVaults() {
    return vaults;
  }


  @JsonProperty(JSON_PROPERTY_VAULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVaults(List<VaultBalance> vaults) {
    this.vaults = vaults;
  }


  public StateAccessControllerResponse descendentNodes(List<StateComponentDescendentNode> descendentNodes) {
    
    this.descendentNodes = descendentNodes;
    return this;
  }

  public StateAccessControllerResponse addDescendentNodesItem(StateComponentDescendentNode descendentNodesItem) {
    if (this.descendentNodes == null) {
      this.descendentNodes = new ArrayList<>();
    }
    this.descendentNodes.add(descendentNodesItem);
    return this;
  }

   /**
   * Any descendent nodes owned directly or indirectly by the component
   * @return descendentNodes
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCENDENT_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StateComponentDescendentNode> getDescendentNodes() {
    return descendentNodes;
  }


  @JsonProperty(JSON_PROPERTY_DESCENDENT_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescendentNodes(List<StateComponentDescendentNode> descendentNodes) {
    this.descendentNodes = descendentNodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateAccessControllerResponse stateAccessControllerResponse = (StateAccessControllerResponse) o;
    return Objects.equals(this.atLedgerState, stateAccessControllerResponse.atLedgerState) &&
        Objects.equals(this.state, stateAccessControllerResponse.state) &&
        Objects.equals(this.ownerRole, stateAccessControllerResponse.ownerRole) &&
        Objects.equals(this.vaults, stateAccessControllerResponse.vaults) &&
        Objects.equals(this.descendentNodes, stateAccessControllerResponse.descendentNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atLedgerState, state, ownerRole, vaults, descendentNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateAccessControllerResponse {\n");
    sb.append("    atLedgerState: ").append(toIndentedString(atLedgerState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ownerRole: ").append(toIndentedString(ownerRole)).append("\n");
    sb.append("    vaults: ").append(toIndentedString(vaults)).append("\n");
    sb.append("    descendentNodes: ").append(toIndentedString(descendentNodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `at_ledger_state` to the URL query string
    if (getAtLedgerState() != null) {
      joiner.add(getAtLedgerState().toUrlQueryString(prefix + "at_ledger_state" + suffix));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(getState().toUrlQueryString(prefix + "state" + suffix));
    }

    // add `owner_role` to the URL query string
    if (getOwnerRole() != null) {
      joiner.add(getOwnerRole().toUrlQueryString(prefix + "owner_role" + suffix));
    }

    // add `vaults` to the URL query string
    if (getVaults() != null) {
      for (int i = 0; i < getVaults().size(); i++) {
        if (getVaults().get(i) != null) {
          joiner.add(getVaults().get(i).toUrlQueryString(String.format("%svaults%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `descendent_nodes` to the URL query string
    if (getDescendentNodes() != null) {
      for (int i = 0; i < getDescendentNodes().size(); i++) {
        if (getDescendentNodes().get(i) != null) {
          joiner.add(getDescendentNodes().get(i).toUrlQueryString(String.format("%sdescendent_nodes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

