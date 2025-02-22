// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual network subnet usage parameter. */
@Fluent
public final class VirtualNetworkSubnetUsageParameter {
    /*
     * Virtual network resource id.
     */
    @JsonProperty(value = "virtualNetworkResourceId")
    private String virtualNetworkResourceId;

    /**
     * Get the virtualNetworkResourceId property: Virtual network resource id.
     *
     * @return the virtualNetworkResourceId value.
     */
    public String virtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    /**
     * Set the virtualNetworkResourceId property: Virtual network resource id.
     *
     * @param virtualNetworkResourceId the virtualNetworkResourceId value to set.
     * @return the VirtualNetworkSubnetUsageParameter object itself.
     */
    public VirtualNetworkSubnetUsageParameter withVirtualNetworkResourceId(String virtualNetworkResourceId) {
        this.virtualNetworkResourceId = virtualNetworkResourceId;
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
