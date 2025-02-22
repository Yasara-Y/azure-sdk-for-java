// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.JiraObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class JiraObjectDatasetTests {
    @Test
    public void testDeserialize() {
        JiraObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"JiraObject\",\"typeProperties\":{},\"description\":\"kxibdafh\",\"linkedServiceName\":{\"referenceName\":\"dyomkxfbv\",\"parameters\":{}},\"parameters\":{\"hpwpgddeimawzovg\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"ikjcjcazt\"},\"\":{}}")
                .toObject(JiraObjectDataset.class);
        Assertions.assertEquals("kxibdafh", model.description());
        Assertions.assertEquals("dyomkxfbv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("hpwpgddeimawzovg").type());
        Assertions.assertEquals("ikjcjcazt", model.folder().name());
    }

    @Test
    public void testSerialize() {
        JiraObjectDataset model =
            new JiraObjectDataset()
                .withDescription("kxibdafh")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("dyomkxfbv").withParameters(mapOf()))
                .withParameters(
                    mapOf("hpwpgddeimawzovg", new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("ikjcjcazt"));
        model = BinaryData.fromObject(model).toObject(JiraObjectDataset.class);
        Assertions.assertEquals("kxibdafh", model.description());
        Assertions.assertEquals("dyomkxfbv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("hpwpgddeimawzovg").type());
        Assertions.assertEquals("ikjcjcazt", model.folder().name());
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
