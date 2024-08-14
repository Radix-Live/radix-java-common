/*
 * Radix Core API - Babylon (Bottlenose)
 * This API is exposed by the Babylon Radix node to give clients access to the Radix Engine, Mempool and State in the node.  The default configuration is intended for use by node-runners on a private network, and is not intended to be exposed publicly. Very heavy load may impact the node's function. The node exposes a configuration flag which allows disabling certain endpoints which may be problematic, but monitoring is advised. This configuration parameter is `api.core.flags.enable_unbounded_endpoints` / `RADIXDLT_CORE_API_FLAGS_ENABLE_UNBOUNDED_ENDPOINTS`.  This API exposes queries against the node's current state (see `/lts/state/` or `/state/`), and streams of transaction history (under `/lts/stream/` or `/stream`).  If you require queries against snapshots of historical ledger state, you may also wish to consider using the [Gateway API](https://docs-babylon.radixdlt.com/).  ## Integration and forward compatibility guarantees  Integrators (such as exchanges) are recommended to use the `/lts/` endpoints - they have been designed to be clear and simple for integrators wishing to create and monitor transactions involving fungible transfers to/from accounts.  All endpoints under `/lts/` have high guarantees of forward compatibility in future node versions. We may add new fields, but existing fields will not be changed. Assuming the integrating code uses a permissive JSON parser which ignores unknown fields, any additions will not affect existing code.  Other endpoints may be changed with new node versions carrying protocol-updates, although any breaking changes will be flagged clearly in the corresponding release notes.  All responses may have additional fields added, so clients are advised to use JSON parsers which ignore unknown fields on JSON objects. 
 *
 * The version of the OpenAPI document: v1.2.1
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
import java.util.Arrays;
import java.util.List;
import live.radix.core.model.LtsEntityFungibleBalanceChanges;
import live.radix.core.model.LtsEntityNonFungibleBalanceChanges;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CommittedTransactionBalanceChanges
 */
@JsonPropertyOrder({
  CommittedTransactionBalanceChanges.JSON_PROPERTY_FUNGIBLE_ENTITY_BALANCE_CHANGES,
  CommittedTransactionBalanceChanges.JSON_PROPERTY_NON_FUNGIBLE_ENTITY_BALANCE_CHANGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-14T23:48:58.387759700+03:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class CommittedTransactionBalanceChanges {
  public static final String JSON_PROPERTY_FUNGIBLE_ENTITY_BALANCE_CHANGES = "fungible_entity_balance_changes";
  private List<LtsEntityFungibleBalanceChanges> fungibleEntityBalanceChanges = new ArrayList<>();

  public static final String JSON_PROPERTY_NON_FUNGIBLE_ENTITY_BALANCE_CHANGES = "non_fungible_entity_balance_changes";
  private List<LtsEntityNonFungibleBalanceChanges> nonFungibleEntityBalanceChanges = new ArrayList<>();

  public CommittedTransactionBalanceChanges() {
  }

  public CommittedTransactionBalanceChanges fungibleEntityBalanceChanges(List<LtsEntityFungibleBalanceChanges> fungibleEntityBalanceChanges) {
    
    this.fungibleEntityBalanceChanges = fungibleEntityBalanceChanges;
    return this;
  }

  public CommittedTransactionBalanceChanges addFungibleEntityBalanceChangesItem(LtsEntityFungibleBalanceChanges fungibleEntityBalanceChangesItem) {
    if (this.fungibleEntityBalanceChanges == null) {
      this.fungibleEntityBalanceChanges = new ArrayList<>();
    }
    this.fungibleEntityBalanceChanges.add(fungibleEntityBalanceChangesItem);
    return this;
  }

  /**
   * A list of all fungible balance updates which occurred in this transaction, aggregated by the global entity (such as account) which owns the vaults which were updated. 
   * @return fungibleEntityBalanceChanges
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNGIBLE_ENTITY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LtsEntityFungibleBalanceChanges> getFungibleEntityBalanceChanges() {
    return fungibleEntityBalanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_FUNGIBLE_ENTITY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFungibleEntityBalanceChanges(List<LtsEntityFungibleBalanceChanges> fungibleEntityBalanceChanges) {
    this.fungibleEntityBalanceChanges = fungibleEntityBalanceChanges;
  }

  public CommittedTransactionBalanceChanges nonFungibleEntityBalanceChanges(List<LtsEntityNonFungibleBalanceChanges> nonFungibleEntityBalanceChanges) {
    
    this.nonFungibleEntityBalanceChanges = nonFungibleEntityBalanceChanges;
    return this;
  }

  public CommittedTransactionBalanceChanges addNonFungibleEntityBalanceChangesItem(LtsEntityNonFungibleBalanceChanges nonFungibleEntityBalanceChangesItem) {
    if (this.nonFungibleEntityBalanceChanges == null) {
      this.nonFungibleEntityBalanceChanges = new ArrayList<>();
    }
    this.nonFungibleEntityBalanceChanges.add(nonFungibleEntityBalanceChangesItem);
    return this;
  }

  /**
   * Non fungible changes per entity and resource 
   * @return nonFungibleEntityBalanceChanges
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_ENTITY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LtsEntityNonFungibleBalanceChanges> getNonFungibleEntityBalanceChanges() {
    return nonFungibleEntityBalanceChanges;
  }


  @JsonProperty(JSON_PROPERTY_NON_FUNGIBLE_ENTITY_BALANCE_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonFungibleEntityBalanceChanges(List<LtsEntityNonFungibleBalanceChanges> nonFungibleEntityBalanceChanges) {
    this.nonFungibleEntityBalanceChanges = nonFungibleEntityBalanceChanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommittedTransactionBalanceChanges committedTransactionBalanceChanges = (CommittedTransactionBalanceChanges) o;
    return Objects.equals(this.fungibleEntityBalanceChanges, committedTransactionBalanceChanges.fungibleEntityBalanceChanges) &&
        Objects.equals(this.nonFungibleEntityBalanceChanges, committedTransactionBalanceChanges.nonFungibleEntityBalanceChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fungibleEntityBalanceChanges, nonFungibleEntityBalanceChanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommittedTransactionBalanceChanges {\n");
    sb.append("    fungibleEntityBalanceChanges: ").append(toIndentedString(fungibleEntityBalanceChanges)).append("\n");
    sb.append("    nonFungibleEntityBalanceChanges: ").append(toIndentedString(nonFungibleEntityBalanceChanges)).append("\n");
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

    // add `fungible_entity_balance_changes` to the URL query string
    if (getFungibleEntityBalanceChanges() != null) {
      for (int i = 0; i < getFungibleEntityBalanceChanges().size(); i++) {
        if (getFungibleEntityBalanceChanges().get(i) != null) {
          joiner.add(getFungibleEntityBalanceChanges().get(i).toUrlQueryString(String.format("%sfungible_entity_balance_changes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `non_fungible_entity_balance_changes` to the URL query string
    if (getNonFungibleEntityBalanceChanges() != null) {
      for (int i = 0; i < getNonFungibleEntityBalanceChanges().size(); i++) {
        if (getNonFungibleEntityBalanceChanges().get(i) != null) {
          joiner.add(getNonFungibleEntityBalanceChanges().get(i).toUrlQueryString(String.format("%snon_fungible_entity_balance_changes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}
