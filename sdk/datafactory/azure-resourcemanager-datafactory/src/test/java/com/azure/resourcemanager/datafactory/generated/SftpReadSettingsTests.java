// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SftpReadSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SftpReadSettingsTests {
    @Test
    public void testDeserialize() {
        SftpReadSettings model =
            BinaryData
                .fromString("{\"type\":\"SftpReadSettings\",\"enablePartitionDiscovery\":false,\"\":{}}")
                .toObject(SftpReadSettings.class);
        Assertions.assertEquals(false, model.enablePartitionDiscovery());
    }

    @Test
    public void testSerialize() {
        SftpReadSettings model = new SftpReadSettings().withEnablePartitionDiscovery(false);
        model = BinaryData.fromObject(model).toObject(SftpReadSettings.class);
        Assertions.assertEquals(false, model.enablePartitionDiscovery());
    }
}
