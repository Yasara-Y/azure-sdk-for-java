// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB resource throughput policy. */
@Fluent
public final class ThroughputPolicyResource {
    /*
     * Determines whether the ThroughputPolicy is active or not
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Represents the percentage by which throughput can increase every time throughput policy kicks in.
     */
    @JsonProperty(value = "incrementPercent")
    private Integer incrementPercent;

    /**
     * Get the isEnabled property: Determines whether the ThroughputPolicy is active or not.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Determines whether the ThroughputPolicy is active or not.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the ThroughputPolicyResource object itself.
     */
    public ThroughputPolicyResource withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the incrementPercent property: Represents the percentage by which throughput can increase every time
     * throughput policy kicks in.
     *
     * @return the incrementPercent value.
     */
    public Integer incrementPercent() {
        return this.incrementPercent;
    }

    /**
     * Set the incrementPercent property: Represents the percentage by which throughput can increase every time
     * throughput policy kicks in.
     *
     * @param incrementPercent the incrementPercent value to set.
     * @return the ThroughputPolicyResource object itself.
     */
    public ThroughputPolicyResource withIncrementPercent(Integer incrementPercent) {
        this.incrementPercent = incrementPercent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
