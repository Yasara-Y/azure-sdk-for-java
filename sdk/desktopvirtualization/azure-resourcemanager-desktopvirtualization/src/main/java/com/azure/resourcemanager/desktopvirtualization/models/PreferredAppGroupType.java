// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PreferredAppGroupType. */
public final class PreferredAppGroupType extends ExpandableStringEnum<PreferredAppGroupType> {
    /** Static value None for PreferredAppGroupType. */
    public static final PreferredAppGroupType NONE = fromString("None");

    /** Static value Desktop for PreferredAppGroupType. */
    public static final PreferredAppGroupType DESKTOP = fromString("Desktop");

    /** Static value RailApplications for PreferredAppGroupType. */
    public static final PreferredAppGroupType RAIL_APPLICATIONS = fromString("RailApplications");

    /**
     * Creates or finds a PreferredAppGroupType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PreferredAppGroupType.
     */
    @JsonCreator
    public static PreferredAppGroupType fromString(String name) {
        return fromString(name, PreferredAppGroupType.class);
    }

    /**
     * Gets known PreferredAppGroupType values.
     *
     * @return known PreferredAppGroupType values.
     */
    public static Collection<PreferredAppGroupType> values() {
        return values(PreferredAppGroupType.class);
    }
}
