// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AAD Vpn authentication type related parameters. */
@Fluent
public final class AadAuthenticationParameters {
    /*
     * AAD Vpn authentication parameter AAD tenant.
     */
    @JsonProperty(value = "aadTenant")
    private String aadTenant;

    /*
     * AAD Vpn authentication parameter AAD audience.
     */
    @JsonProperty(value = "aadAudience")
    private String aadAudience;

    /*
     * AAD Vpn authentication parameter AAD issuer.
     */
    @JsonProperty(value = "aadIssuer")
    private String aadIssuer;

    /** Creates an instance of AadAuthenticationParameters class. */
    public AadAuthenticationParameters() {
    }

    /**
     * Get the aadTenant property: AAD Vpn authentication parameter AAD tenant.
     *
     * @return the aadTenant value.
     */
    public String aadTenant() {
        return this.aadTenant;
    }

    /**
     * Set the aadTenant property: AAD Vpn authentication parameter AAD tenant.
     *
     * @param aadTenant the aadTenant value to set.
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadTenant(String aadTenant) {
        this.aadTenant = aadTenant;
        return this;
    }

    /**
     * Get the aadAudience property: AAD Vpn authentication parameter AAD audience.
     *
     * @return the aadAudience value.
     */
    public String aadAudience() {
        return this.aadAudience;
    }

    /**
     * Set the aadAudience property: AAD Vpn authentication parameter AAD audience.
     *
     * @param aadAudience the aadAudience value to set.
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadAudience(String aadAudience) {
        this.aadAudience = aadAudience;
        return this;
    }

    /**
     * Get the aadIssuer property: AAD Vpn authentication parameter AAD issuer.
     *
     * @return the aadIssuer value.
     */
    public String aadIssuer() {
        return this.aadIssuer;
    }

    /**
     * Set the aadIssuer property: AAD Vpn authentication parameter AAD issuer.
     *
     * @param aadIssuer the aadIssuer value to set.
     * @return the AadAuthenticationParameters object itself.
     */
    public AadAuthenticationParameters withAadIssuer(String aadIssuer) {
        this.aadIssuer = aadIssuer;
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
