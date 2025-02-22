// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SecureString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SecureStringTests {
    @Test
    public void testDeserialize() {
        SecureString model =
            BinaryData
                .fromString("{\"type\":\"SecureString\",\"value\":\"ggdufiqndieu\"}")
                .toObject(SecureString.class);
        Assertions.assertEquals("ggdufiqndieu", model.value());
    }

    @Test
    public void testSerialize() {
        SecureString model = new SecureString().withValue("ggdufiqndieu");
        model = BinaryData.fromObject(model).toObject(SecureString.class);
        Assertions.assertEquals("ggdufiqndieu", model.value());
    }
}
