// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.RecoveryPointResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPoint;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RecoveryPointResourceInnerTests {
    @Test
    public void testDeserialize() {
        RecoveryPointResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"hxdeoejz\",\"location\":\"cwif\",\"tags\":{\"jdeyeamdpha\":\"tgzfbishcbkh\",\"wkgshwa\":\"alpbuxwgipwhon\"},\"id\":\"kix\",\"name\":\"bin\",\"type\":\"eputtmrywnuzoqf\"}")
                .toObject(RecoveryPointResourceInner.class);
        Assertions.assertEquals("cwif", model.location());
        Assertions.assertEquals("tgzfbishcbkh", model.tags().get("jdeyeamdpha"));
        Assertions.assertEquals("hxdeoejz", model.etag());
    }

    @Test
    public void testSerialize() {
        RecoveryPointResourceInner model =
            new RecoveryPointResourceInner()
                .withLocation("cwif")
                .withTags(mapOf("jdeyeamdpha", "tgzfbishcbkh", "wkgshwa", "alpbuxwgipwhon"))
                .withProperties(new RecoveryPoint())
                .withEtag("hxdeoejz");
        model = BinaryData.fromObject(model).toObject(RecoveryPointResourceInner.class);
        Assertions.assertEquals("cwif", model.location());
        Assertions.assertEquals("tgzfbishcbkh", model.tags().get("jdeyeamdpha"));
        Assertions.assertEquals("hxdeoejz", model.etag());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
