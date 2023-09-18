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
import live.radix.core.model.ObjectHook;
import live.radix.core.model.PackageExport;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * HookExport
 */
@JsonPropertyOrder({
  HookExport.JSON_PROPERTY_OBJECT_HOOK,
  HookExport.JSON_PROPERTY_EXPORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:57:43.738813900+03:00[Europe/Kiev]")
public class HookExport {
  public static final String JSON_PROPERTY_OBJECT_HOOK = "object_hook";
  private ObjectHook objectHook;

  public static final String JSON_PROPERTY_EXPORT = "export";
  private PackageExport export;

  public HookExport() {
  }

  public HookExport objectHook(ObjectHook objectHook) {
    
    this.objectHook = objectHook;
    return this;
  }

   /**
   * Get objectHook
   * @return objectHook
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT_HOOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ObjectHook getObjectHook() {
    return objectHook;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_HOOK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjectHook(ObjectHook objectHook) {
    this.objectHook = objectHook;
  }


  public HookExport export(PackageExport export) {
    
    this.export = export;
    return this;
  }

   /**
   * Get export
   * @return export
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PackageExport getExport() {
    return export;
  }


  @JsonProperty(JSON_PROPERTY_EXPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExport(PackageExport export) {
    this.export = export;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HookExport hookExport = (HookExport) o;
    return Objects.equals(this.objectHook, hookExport.objectHook) &&
        Objects.equals(this.export, hookExport.export);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectHook, export);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HookExport {\n");
    sb.append("    objectHook: ").append(toIndentedString(objectHook)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
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

    // add `object_hook` to the URL query string
    if (getObjectHook() != null) {
      try {
        joiner.add(String.format("%sobject_hook%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObjectHook()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `export` to the URL query string
    if (getExport() != null) {
      joiner.add(getExport().toUrlQueryString(prefix + "export" + suffix));
    }

    return joiner.toString();
  }

}

