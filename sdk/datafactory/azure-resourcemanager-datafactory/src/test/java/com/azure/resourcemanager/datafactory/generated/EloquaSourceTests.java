// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.EloquaSource;
import org.junit.jupiter.api.Test;

public final class EloquaSourceTests {
    @Test
    public void testDeserialize() {
        EloquaSource model = BinaryData.fromString("{\"type\":\"EloquaSource\",\"\":{}}").toObject(EloquaSource.class);
    }

    @Test
    public void testSerialize() {
        EloquaSource model = new EloquaSource();
        model = BinaryData.fromObject(model).toObject(EloquaSource.class);
    }
}
