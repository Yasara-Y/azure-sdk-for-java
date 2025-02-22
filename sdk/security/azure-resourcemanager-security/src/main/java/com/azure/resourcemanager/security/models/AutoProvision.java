// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes what kind of security agent provisioning action to take. */
public final class AutoProvision extends ExpandableStringEnum<AutoProvision> {
    /** Static value On for AutoProvision. */
    public static final AutoProvision ON = fromString("On");

    /** Static value Off for AutoProvision. */
    public static final AutoProvision OFF = fromString("Off");

    /**
     * Creates or finds a AutoProvision from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoProvision.
     */
    @JsonCreator
    public static AutoProvision fromString(String name) {
        return fromString(name, AutoProvision.class);
    }

    /**
     * Gets known AutoProvision values.
     *
     * @return known AutoProvision values.
     */
    public static Collection<AutoProvision> values() {
        return values(AutoProvision.class);
    }
}
