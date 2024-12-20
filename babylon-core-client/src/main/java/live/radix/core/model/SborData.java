/*
 * Radix Core API
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.3.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Various representations of an SBOR payload. Some endpoints may allow opting in/out of each representation. 
 */
@JsonPropertyOrder({
  SborData.JSON_PROPERTY_HEX,
  SborData.JSON_PROPERTY_PROGRAMMATIC_JSON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class SborData {
  public static final String JSON_PROPERTY_HEX = "hex";
  private String hex;

  public static final String JSON_PROPERTY_PROGRAMMATIC_JSON = "programmatic_json";
  private JsonNullable<Object> programmaticJson = JsonNullable.<Object>of(null);

  public SborData() {
  }

  public SborData hex(String hex) {
    
    this.hex = hex;
    return this;
  }

  /**
   * The hex-encoded, raw SBOR-encoded data
   * @return hex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHex() {
    return hex;
  }


  @JsonProperty(JSON_PROPERTY_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHex(String hex) {
    this.hex = hex;
  }

  public SborData programmaticJson(Object programmaticJson) {
    this.programmaticJson = JsonNullable.<Object>of(programmaticJson);
    
    return this;
  }

  /**
   * Get programmaticJson
   * @return programmaticJson
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getProgrammaticJson() {
        return programmaticJson.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROGRAMMATIC_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getProgrammaticJson_JsonNullable() {
    return programmaticJson;
  }
  
  @JsonProperty(JSON_PROPERTY_PROGRAMMATIC_JSON)
  public void setProgrammaticJson_JsonNullable(JsonNullable<Object> programmaticJson) {
    this.programmaticJson = programmaticJson;
  }

  public void setProgrammaticJson(Object programmaticJson) {
    this.programmaticJson = JsonNullable.<Object>of(programmaticJson);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SborData sborData = (SborData) o;
    return Objects.equals(this.hex, sborData.hex) &&
        equalsNullable(this.programmaticJson, sborData.programmaticJson);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hex, hashCodeNullable(programmaticJson));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SborData {\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    programmaticJson: ").append(toIndentedString(programmaticJson)).append("\n");
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

    // add `hex` to the URL query string
    if (getHex() != null) {
      try {
        joiner.add(String.format("%shex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `programmatic_json` to the URL query string
    if (getProgrammaticJson() != null) {
      try {
        joiner.add(String.format("%sprogrammatic_json%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProgrammaticJson()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

