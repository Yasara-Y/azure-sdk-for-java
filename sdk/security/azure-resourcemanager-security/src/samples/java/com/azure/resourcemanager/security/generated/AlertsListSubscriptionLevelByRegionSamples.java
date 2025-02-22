// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for Alerts ListSubscriptionLevelByRegion. */
public final class AlertsListSubscriptionLevelByRegionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-01-01/examples/Alerts/GetAlertsSubscriptionsLocation_example.json
     */
    /**
     * Sample code: Get security alerts on a subscription from a security data location.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityAlertsOnASubscriptionFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.alerts().listSubscriptionLevelByRegion("westeurope", Context.NONE);
    }
}
