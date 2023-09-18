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
import live.radix.core.model.EntityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * EntityReference
 */
@JsonPropertyOrder({
  EntityReference.JSON_PROPERTY_ENTITY_TYPE,
  EntityReference.JSON_PROPERTY_IS_GLOBAL,
  EntityReference.JSON_PROPERTY_ENTITY_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class EntityReference {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity_type";
  private EntityType entityType;

  public static final String JSON_PROPERTY_IS_GLOBAL = "is_global";
  private Boolean isGlobal;

  public static final String JSON_PROPERTY_ENTITY_ADDRESS = "entity_address";
  private String entityAddress;

  public EntityReference() {
  }

  public EntityReference entityType(EntityType entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public EntityReference isGlobal(Boolean isGlobal) {
    
    this.isGlobal = isGlobal;
    return this;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isIsGlobal() {
    return isGlobal;
  }


  @JsonProperty(JSON_PROPERTY_IS_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }


  public EntityReference entityAddress(String entityAddress) {
    
    this.entityAddress = entityAddress;
    return this;
  }

   /**
   * Bech32m-encoded human readable version of the entity&#39;s address (ie the entity&#39;s node id)
   * @return entityAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityAddress() {
    return entityAddress;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityAddress(String entityAddress) {
    this.entityAddress = entityAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityReference entityReference = (EntityReference) o;
    return Objects.equals(this.entityType, entityReference.entityType) &&
        Objects.equals(this.isGlobal, entityReference.isGlobal) &&
        Objects.equals(this.entityAddress, entityReference.entityAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, isGlobal, entityAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityReference {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    entityAddress: ").append(toIndentedString(entityAddress)).append("\n");
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

    // add `entity_type` to the URL query string
    if (getEntityType() != null) {
      try {
        joiner.add(String.format("%sentity_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `is_global` to the URL query string
    if (isIsGlobal() != null) {
      try {
        joiner.add(String.format("%sis_global%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isIsGlobal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entity_address` to the URL query string
    if (getEntityAddress() != null) {
      try {
        joiner.add(String.format("%sentity_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

