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
import live.radix.core.model.SubstateId;
import live.radix.core.model.SubstateSystemStructure;
import live.radix.core.model.SubstateValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DeletedSubstate
 */
@JsonPropertyOrder({
  DeletedSubstate.JSON_PROPERTY_SUBSTATE_ID,
  DeletedSubstate.JSON_PROPERTY_PREVIOUS_VALUE,
  DeletedSubstate.JSON_PROPERTY_SYSTEM_STRUCTURE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class DeletedSubstate {
  public static final String JSON_PROPERTY_SUBSTATE_ID = "substate_id";
  private SubstateId substateId;

  public static final String JSON_PROPERTY_PREVIOUS_VALUE = "previous_value";
  private SubstateValue previousValue;

  public static final String JSON_PROPERTY_SYSTEM_STRUCTURE = "system_structure";
  private SubstateSystemStructure systemStructure;

  public DeletedSubstate() {
  }

  public DeletedSubstate substateId(SubstateId substateId) {
    
    this.substateId = substateId;
    return this;
  }

   /**
   * Get substateId
   * @return substateId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSTATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubstateId getSubstateId() {
    return substateId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSTATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubstateId(SubstateId substateId) {
    this.substateId = substateId;
  }


  public DeletedSubstate previousValue(SubstateValue previousValue) {
    
    this.previousValue = previousValue;
    return this;
  }

   /**
   * Get previousValue
   * @return previousValue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubstateValue getPreviousValue() {
    return previousValue;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousValue(SubstateValue previousValue) {
    this.previousValue = previousValue;
  }


  public DeletedSubstate systemStructure(SubstateSystemStructure systemStructure) {
    
    this.systemStructure = systemStructure;
    return this;
  }

   /**
   * Get systemStructure
   * @return systemStructure
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SYSTEM_STRUCTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubstateSystemStructure getSystemStructure() {
    return systemStructure;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_STRUCTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSystemStructure(SubstateSystemStructure systemStructure) {
    this.systemStructure = systemStructure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedSubstate deletedSubstate = (DeletedSubstate) o;
    return Objects.equals(this.substateId, deletedSubstate.substateId) &&
        Objects.equals(this.previousValue, deletedSubstate.previousValue) &&
        Objects.equals(this.systemStructure, deletedSubstate.systemStructure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(substateId, previousValue, systemStructure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedSubstate {\n");
    sb.append("    substateId: ").append(toIndentedString(substateId)).append("\n");
    sb.append("    previousValue: ").append(toIndentedString(previousValue)).append("\n");
    sb.append("    systemStructure: ").append(toIndentedString(systemStructure)).append("\n");
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

    // add `substate_id` to the URL query string
    if (getSubstateId() != null) {
      joiner.add(getSubstateId().toUrlQueryString(prefix + "substate_id" + suffix));
    }

    // add `previous_value` to the URL query string
    if (getPreviousValue() != null) {
      joiner.add(getPreviousValue().toUrlQueryString(prefix + "previous_value" + suffix));
    }

    // add `system_structure` to the URL query string
    if (getSystemStructure() != null) {
      joiner.add(getSystemStructure().toUrlQueryString(prefix + "system_structure" + suffix));
    }

    return joiner.toString();
  }

}

