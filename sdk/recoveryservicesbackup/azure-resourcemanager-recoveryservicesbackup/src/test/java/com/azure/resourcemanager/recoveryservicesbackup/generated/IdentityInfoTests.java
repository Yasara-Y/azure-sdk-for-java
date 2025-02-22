// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IdentityInfoTests {
    @Test
    public void testDeserialize() {
        IdentityInfo model =
            BinaryData
                .fromString("{\"isSystemAssignedIdentity\":true,\"managedIdentityResourceId\":\"okffqyinljqepqwh\"}")
                .toObject(IdentityInfo.class);
        Assertions.assertEquals(true, model.isSystemAssignedIdentity());
        Assertions.assertEquals("okffqyinljqepqwh", model.managedIdentityResourceId());
    }

    @Test
    public void testSerialize() {
        IdentityInfo model =
            new IdentityInfo().withIsSystemAssignedIdentity(true).withManagedIdentityResourceId("okffqyinljqepqwh");
        model = BinaryData.fromObject(model).toObject(IdentityInfo.class);
        Assertions.assertEquals(true, model.isSystemAssignedIdentity());
        Assertions.assertEquals("okffqyinljqepqwh", model.managedIdentityResourceId());
    }
}
