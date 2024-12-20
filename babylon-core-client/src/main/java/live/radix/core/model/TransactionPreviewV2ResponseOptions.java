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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A set of flags to configure the response of the transaction preview.
 */
@JsonPropertyOrder({
  TransactionPreviewV2ResponseOptions.JSON_PROPERTY_CORE_API_RECEIPT,
  TransactionPreviewV2ResponseOptions.JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT,
  TransactionPreviewV2ResponseOptions.JSON_PROPERTY_LOGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class TransactionPreviewV2ResponseOptions {
  public static final String JSON_PROPERTY_CORE_API_RECEIPT = "core_api_receipt";
  private Boolean coreApiReceipt;

  public static final String JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT = "radix_engine_toolkit_receipt";
  private Boolean radixEngineToolkitReceipt;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private Boolean logs;

  public TransactionPreviewV2ResponseOptions() {
  }

  public TransactionPreviewV2ResponseOptions coreApiReceipt(Boolean coreApiReceipt) {
    
    this.coreApiReceipt = coreApiReceipt;
    return this;
  }

  /**
   * This flag controls whether the preview response will include a Core API receipt or not. If not provided, this defaults to &#x60;false&#x60; and no core api receipt is provided in the response. 
   * @return coreApiReceipt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORE_API_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isCoreApiReceipt() {
    return coreApiReceipt;
  }


  @JsonProperty(JSON_PROPERTY_CORE_API_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoreApiReceipt(Boolean coreApiReceipt) {
    this.coreApiReceipt = coreApiReceipt;
  }

  public TransactionPreviewV2ResponseOptions radixEngineToolkitReceipt(Boolean radixEngineToolkitReceipt) {
    
    this.radixEngineToolkitReceipt = radixEngineToolkitReceipt;
    return this;
  }

  /**
   * This flag controls whether the preview response will include a Radix Engine Toolkit serializable receipt or not. If not provided, this defaults to &#x60;false&#x60; and no toolkit receipt is provided in the response. 
   * @return radixEngineToolkitReceipt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isRadixEngineToolkitReceipt() {
    return radixEngineToolkitReceipt;
  }


  @JsonProperty(JSON_PROPERTY_RADIX_ENGINE_TOOLKIT_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRadixEngineToolkitReceipt(Boolean radixEngineToolkitReceipt) {
    this.radixEngineToolkitReceipt = radixEngineToolkitReceipt;
  }

  public TransactionPreviewV2ResponseOptions logs(Boolean logs) {
    
    this.logs = logs;
    return this;
  }

  /**
   * This flag controls whether the preview response will include execution logs. If not provided, this defaults to &#x60;false&#x60; and no logs will be provided in the response. 
   * @return logs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isLogs() {
    return logs;
  }


  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogs(Boolean logs) {
    this.logs = logs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPreviewV2ResponseOptions transactionPreviewV2ResponseOptions = (TransactionPreviewV2ResponseOptions) o;
    return Objects.equals(this.coreApiReceipt, transactionPreviewV2ResponseOptions.coreApiReceipt) &&
        Objects.equals(this.radixEngineToolkitReceipt, transactionPreviewV2ResponseOptions.radixEngineToolkitReceipt) &&
        Objects.equals(this.logs, transactionPreviewV2ResponseOptions.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreApiReceipt, radixEngineToolkitReceipt, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPreviewV2ResponseOptions {\n");
    sb.append("    coreApiReceipt: ").append(toIndentedString(coreApiReceipt)).append("\n");
    sb.append("    radixEngineToolkitReceipt: ").append(toIndentedString(radixEngineToolkitReceipt)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

    // add `core_api_receipt` to the URL query string
    if (isCoreApiReceipt() != null) {
      try {
        joiner.add(String.format("%score_api_receipt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isCoreApiReceipt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `radix_engine_toolkit_receipt` to the URL query string
    if (isRadixEngineToolkitReceipt() != null) {
      try {
        joiner.add(String.format("%sradix_engine_toolkit_receipt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isRadixEngineToolkitReceipt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logs` to the URL query string
    if (isLogs() != null) {
      try {
        joiner.add(String.format("%slogs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(isLogs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

