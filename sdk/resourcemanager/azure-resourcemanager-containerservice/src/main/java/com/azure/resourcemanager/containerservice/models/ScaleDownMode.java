// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScaleDownMode. */
public final class ScaleDownMode extends ExpandableStringEnum<ScaleDownMode> {
    /** Static value Delete for ScaleDownMode. */
    public static final ScaleDownMode DELETE = fromString("Delete");

    /** Static value Deallocate for ScaleDownMode. */
    public static final ScaleDownMode DEALLOCATE = fromString("Deallocate");

    /**
     * Creates or finds a ScaleDownMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScaleDownMode.
     */
    @JsonCreator
    public static ScaleDownMode fromString(String name) {
        return fromString(name, ScaleDownMode.class);
    }

    /** @return known ScaleDownMode values. */
    public static Collection<ScaleDownMode> values() {
        return values(ScaleDownMode.class);
    }
}