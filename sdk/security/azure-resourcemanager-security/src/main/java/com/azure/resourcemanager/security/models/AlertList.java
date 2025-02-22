// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.AlertInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of security alerts. */
@Fluent
public final class AlertList {
    /*
     * describes security alert properties.
     */
    @JsonProperty(value = "value")
    private List<AlertInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: describes security alert properties.
     *
     * @return the value value.
     */
    public List<AlertInner> value() {
        return this.value;
    }

    /**
     * Set the value property: describes security alert properties.
     *
     * @param value the value value to set.
     * @return the AlertList object itself.
     */
    public AlertList withValue(List<AlertInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
