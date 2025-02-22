// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecurityConnectorGovernanceRule List. */
public final class SecurityConnectorGovernanceRuleListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/ListBySecurityConnectorGovernanceRules_example.json
     */
    /**
     * Sample code: List security governanceRules by security connector level scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecurityGovernanceRulesBySecurityConnectorLevelScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectorGovernanceRules().list("gcpResourceGroup", "gcpconnector", Context.NONE);
    }
}
