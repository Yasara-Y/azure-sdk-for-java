// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.ServiceNowObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ServiceNowObjectDatasetTests {
    @Test
    public void testDeserialize() {
        ServiceNowObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"ServiceNowObject\",\"typeProperties\":{},\"description\":\"ghpxycphdr\",\"linkedServiceName\":{\"referenceName\":\"khv\",\"parameters\":{}},\"parameters\":{\"zvxnqmhrp\":{\"type\":\"Bool\"}},\"annotations\":[],\"folder\":{\"name\":\"mkoisqcssf\"},\"\":{}}")
                .toObject(ServiceNowObjectDataset.class);
        Assertions.assertEquals("ghpxycphdr", model.description());
        Assertions.assertEquals("khv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("zvxnqmhrp").type());
        Assertions.assertEquals("mkoisqcssf", model.folder().name());
    }

    @Test
    public void testSerialize() {
        ServiceNowObjectDataset model =
            new ServiceNowObjectDataset()
                .withDescription("ghpxycphdr")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("khv").withParameters(mapOf()))
                .withParameters(mapOf("zvxnqmhrp", new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("mkoisqcssf"));
        model = BinaryData.fromObject(model).toObject(ServiceNowObjectDataset.class);
        Assertions.assertEquals("ghpxycphdr", model.description());
        Assertions.assertEquals("khv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("zvxnqmhrp").type());
        Assertions.assertEquals("mkoisqcssf", model.folder().name());
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
