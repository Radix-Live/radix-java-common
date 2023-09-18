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
import live.radix.core.model.Substate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * StateNonFungibleResourceManagerAllOf
 */
@JsonPropertyOrder({
  StateNonFungibleResourceManagerAllOf.JSON_PROPERTY_ID_TYPE,
  StateNonFungibleResourceManagerAllOf.JSON_PROPERTY_TOTAL_SUPPLY,
  StateNonFungibleResourceManagerAllOf.JSON_PROPERTY_MUTABLE_FIELDS
})
@JsonTypeName("StateNonFungibleResourceManager_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class StateNonFungibleResourceManagerAllOf {
  public static final String JSON_PROPERTY_ID_TYPE = "id_type";
  private Substate idType;

  public static final String JSON_PROPERTY_TOTAL_SUPPLY = "total_supply";
  private Substate totalSupply;

  public static final String JSON_PROPERTY_MUTABLE_FIELDS = "mutable_fields";
  private Substate mutableFields;

  public StateNonFungibleResourceManagerAllOf() {
  }

  public StateNonFungibleResourceManagerAllOf idType(Substate idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Substate getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdType(Substate idType) {
    this.idType = idType;
  }


  public StateNonFungibleResourceManagerAllOf totalSupply(Substate totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Get totalSupply
   * @return totalSupply
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Substate getTotalSupply() {
    return totalSupply;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalSupply(Substate totalSupply) {
    this.totalSupply = totalSupply;
  }


  public StateNonFungibleResourceManagerAllOf mutableFields(Substate mutableFields) {
    
    this.mutableFields = mutableFields;
    return this;
  }

   /**
   * Get mutableFields
   * @return mutableFields
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MUTABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Substate getMutableFields() {
    return mutableFields;
  }


  @JsonProperty(JSON_PROPERTY_MUTABLE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMutableFields(Substate mutableFields) {
    this.mutableFields = mutableFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateNonFungibleResourceManagerAllOf stateNonFungibleResourceManagerAllOf = (StateNonFungibleResourceManagerAllOf) o;
    return Objects.equals(this.idType, stateNonFungibleResourceManagerAllOf.idType) &&
        Objects.equals(this.totalSupply, stateNonFungibleResourceManagerAllOf.totalSupply) &&
        Objects.equals(this.mutableFields, stateNonFungibleResourceManagerAllOf.mutableFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType, totalSupply, mutableFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateNonFungibleResourceManagerAllOf {\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    mutableFields: ").append(toIndentedString(mutableFields)).append("\n");
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

    // add `id_type` to the URL query string
    if (getIdType() != null) {
      joiner.add(getIdType().toUrlQueryString(prefix + "id_type" + suffix));
    }

    // add `total_supply` to the URL query string
    if (getTotalSupply() != null) {
      joiner.add(getTotalSupply().toUrlQueryString(prefix + "total_supply" + suffix));
    }

    // add `mutable_fields` to the URL query string
    if (getMutableFields() != null) {
      joiner.add(getMutableFields().toUrlQueryString(prefix + "mutable_fields" + suffix));
    }

    return joiner.toString();
  }

}
