// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MicrosoftAccessSource;
import org.junit.jupiter.api.Test;

public final class MicrosoftAccessSourceTests {
    @Test
    public void testDeserialize() {
        MicrosoftAccessSource model =
            BinaryData.fromString("{\"type\":\"MicrosoftAccessSource\",\"\":{}}").toObject(MicrosoftAccessSource.class);
    }

    @Test
    public void testSerialize() {
        MicrosoftAccessSource model = new MicrosoftAccessSource();
        model = BinaryData.fromObject(model).toObject(MicrosoftAccessSource.class);
    }
}
