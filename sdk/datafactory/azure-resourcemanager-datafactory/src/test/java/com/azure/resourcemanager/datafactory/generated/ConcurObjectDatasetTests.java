// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConcurObjectDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ConcurObjectDatasetTests {
    @Test
    public void testDeserialize() {
        ConcurObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"ConcurObject\",\"typeProperties\":{},\"description\":\"leallklm\",\"linkedServiceName\":{\"referenceName\":\"lowkxxpvb\",\"parameters\":{}},\"parameters\":{\"yzfhotlhi\":{\"type\":\"Int\"},\"ychunsjlpjrtwszh\":{\"type\":\"Float\"},\"icphvtrrmhw\":{\"type\":\"Int\"}},\"annotations\":[],\"folder\":{\"name\":\"yflubhvjglroc\"},\"\":{}}")
                .toObject(ConcurObjectDataset.class);
        Assertions.assertEquals("leallklm", model.description());
        Assertions.assertEquals("lowkxxpvb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("yzfhotlhi").type());
        Assertions.assertEquals("yflubhvjglroc", model.folder().name());
    }

    @Test
    public void testSerialize() {
        ConcurObjectDataset model =
            new ConcurObjectDataset()
                .withDescription("leallklm")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("lowkxxpvb").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "yzfhotlhi",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "ychunsjlpjrtwszh",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "icphvtrrmhw",
                        new ParameterSpecification().withType(ParameterType.INT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("yflubhvjglroc"));
        model = BinaryData.fromObject(model).toObject(ConcurObjectDataset.class);
        Assertions.assertEquals("leallklm", model.description());
        Assertions.assertEquals("lowkxxpvb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("yzfhotlhi").type());
        Assertions.assertEquals("yflubhvjglroc", model.folder().name());
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
