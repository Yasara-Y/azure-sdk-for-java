// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.models.Application;

/** Samples for Application Update. */
public final class ApplicationUpdateSamples {
    /**
     * Sample code: ApplicationUpdate.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void applicationUpdate(com.azure.resourcemanager.batch.BatchManager batchManager) {
        Application resource =
            batchManager
                .applications()
                .getWithResponse("default-azurebatch-japaneast", "sampleacct", "app1", Context.NONE)
                .getValue();
        resource.update().withDisplayName("myAppName").withAllowUpdates(true).withDefaultVersion("2").apply();
    }
}