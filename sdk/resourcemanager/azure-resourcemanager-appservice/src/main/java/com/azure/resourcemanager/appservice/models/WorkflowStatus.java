// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkflowStatus. */
public final class WorkflowStatus extends ExpandableStringEnum<WorkflowStatus> {
    /** Static value NotSpecified for WorkflowStatus. */
    public static final WorkflowStatus NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Paused for WorkflowStatus. */
    public static final WorkflowStatus PAUSED = fromString("Paused");

    /** Static value Running for WorkflowStatus. */
    public static final WorkflowStatus RUNNING = fromString("Running");

    /** Static value Waiting for WorkflowStatus. */
    public static final WorkflowStatus WAITING = fromString("Waiting");

    /** Static value Succeeded for WorkflowStatus. */
    public static final WorkflowStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Skipped for WorkflowStatus. */
    public static final WorkflowStatus SKIPPED = fromString("Skipped");

    /** Static value Suspended for WorkflowStatus. */
    public static final WorkflowStatus SUSPENDED = fromString("Suspended");

    /** Static value Cancelled for WorkflowStatus. */
    public static final WorkflowStatus CANCELLED = fromString("Cancelled");

    /** Static value Failed for WorkflowStatus. */
    public static final WorkflowStatus FAILED = fromString("Failed");

    /** Static value Faulted for WorkflowStatus. */
    public static final WorkflowStatus FAULTED = fromString("Faulted");

    /** Static value TimedOut for WorkflowStatus. */
    public static final WorkflowStatus TIMED_OUT = fromString("TimedOut");

    /** Static value Aborted for WorkflowStatus. */
    public static final WorkflowStatus ABORTED = fromString("Aborted");

    /** Static value Ignored for WorkflowStatus. */
    public static final WorkflowStatus IGNORED = fromString("Ignored");

    /**
     * Creates or finds a WorkflowStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkflowStatus.
     */
    @JsonCreator
    public static WorkflowStatus fromString(String name) {
        return fromString(name, WorkflowStatus.class);
    }

    /**
     * Gets known WorkflowStatus values.
     *
     * @return known WorkflowStatus values.
     */
    public static Collection<WorkflowStatus> values() {
        return values(WorkflowStatus.class);
    }
}
