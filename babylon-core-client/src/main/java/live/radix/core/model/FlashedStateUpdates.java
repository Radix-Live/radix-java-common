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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import live.radix.core.model.FlashSetSubstate;
import live.radix.core.model.PartitionId;
import live.radix.core.model.SubstateId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Direct state updates performed by a Flash Transaction.
 */
@JsonPropertyOrder({
  FlashedStateUpdates.JSON_PROPERTY_DELETED_PARTITIONS,
  FlashedStateUpdates.JSON_PROPERTY_SET_SUBSTATES,
  FlashedStateUpdates.JSON_PROPERTY_DELETED_SUBSTATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T13:05:03.171643800+02:00[Europe/Kiev]", comments = "Generator version: 7.7.0")
public class FlashedStateUpdates {
  public static final String JSON_PROPERTY_DELETED_PARTITIONS = "deleted_partitions";
  private List<PartitionId> deletedPartitions = new ArrayList<>();

  public static final String JSON_PROPERTY_SET_SUBSTATES = "set_substates";
  private List<FlashSetSubstate> setSubstates = new ArrayList<>();

  public static final String JSON_PROPERTY_DELETED_SUBSTATES = "deleted_substates";
  private List<SubstateId> deletedSubstates = new ArrayList<>();

  public FlashedStateUpdates() {
  }

  public FlashedStateUpdates deletedPartitions(List<PartitionId> deletedPartitions) {
    
    this.deletedPartitions = deletedPartitions;
    return this;
  }

  public FlashedStateUpdates addDeletedPartitionsItem(PartitionId deletedPartitionsItem) {
    if (this.deletedPartitions == null) {
      this.deletedPartitions = new ArrayList<>();
    }
    this.deletedPartitions.add(deletedPartitionsItem);
    return this;
  }

  /**
   * Get deletedPartitions
   * @return deletedPartitions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELETED_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PartitionId> getDeletedPartitions() {
    return deletedPartitions;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeletedPartitions(List<PartitionId> deletedPartitions) {
    this.deletedPartitions = deletedPartitions;
  }

  public FlashedStateUpdates setSubstates(List<FlashSetSubstate> setSubstates) {
    
    this.setSubstates = setSubstates;
    return this;
  }

  public FlashedStateUpdates addSetSubstatesItem(FlashSetSubstate setSubstatesItem) {
    if (this.setSubstates == null) {
      this.setSubstates = new ArrayList<>();
    }
    this.setSubstates.add(setSubstatesItem);
    return this;
  }

  /**
   * Get setSubstates
   * @return setSubstates
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SET_SUBSTATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FlashSetSubstate> getSetSubstates() {
    return setSubstates;
  }


  @JsonProperty(JSON_PROPERTY_SET_SUBSTATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSetSubstates(List<FlashSetSubstate> setSubstates) {
    this.setSubstates = setSubstates;
  }

  public FlashedStateUpdates deletedSubstates(List<SubstateId> deletedSubstates) {
    
    this.deletedSubstates = deletedSubstates;
    return this;
  }

  public FlashedStateUpdates addDeletedSubstatesItem(SubstateId deletedSubstatesItem) {
    if (this.deletedSubstates == null) {
      this.deletedSubstates = new ArrayList<>();
    }
    this.deletedSubstates.add(deletedSubstatesItem);
    return this;
  }

  /**
   * Get deletedSubstates
   * @return deletedSubstates
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELETED_SUBSTATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubstateId> getDeletedSubstates() {
    return deletedSubstates;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_SUBSTATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeletedSubstates(List<SubstateId> deletedSubstates) {
    this.deletedSubstates = deletedSubstates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlashedStateUpdates flashedStateUpdates = (FlashedStateUpdates) o;
    return Objects.equals(this.deletedPartitions, flashedStateUpdates.deletedPartitions) &&
        Objects.equals(this.setSubstates, flashedStateUpdates.setSubstates) &&
        Objects.equals(this.deletedSubstates, flashedStateUpdates.deletedSubstates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPartitions, setSubstates, deletedSubstates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlashedStateUpdates {\n");
    sb.append("    deletedPartitions: ").append(toIndentedString(deletedPartitions)).append("\n");
    sb.append("    setSubstates: ").append(toIndentedString(setSubstates)).append("\n");
    sb.append("    deletedSubstates: ").append(toIndentedString(deletedSubstates)).append("\n");
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

    // add `deleted_partitions` to the URL query string
    if (getDeletedPartitions() != null) {
      for (int i = 0; i < getDeletedPartitions().size(); i++) {
        if (getDeletedPartitions().get(i) != null) {
          joiner.add(getDeletedPartitions().get(i).toUrlQueryString(String.format("%sdeleted_partitions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `set_substates` to the URL query string
    if (getSetSubstates() != null) {
      for (int i = 0; i < getSetSubstates().size(); i++) {
        if (getSetSubstates().get(i) != null) {
          joiner.add(getSetSubstates().get(i).toUrlQueryString(String.format("%sset_substates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deleted_substates` to the URL query string
    if (getDeletedSubstates() != null) {
      for (int i = 0; i < getDeletedSubstates().size(); i++) {
        if (getDeletedSubstates().get(i) != null) {
          joiner.add(getDeletedSubstates().get(i).toUrlQueryString(String.format("%sdeleted_substates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

