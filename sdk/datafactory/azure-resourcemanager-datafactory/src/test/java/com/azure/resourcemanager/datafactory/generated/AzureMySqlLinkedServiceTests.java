// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.AzureMySqlLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureMySqlLinkedServiceTests {
    @Test
    public void testDeserialize() {
        AzureMySqlLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMySql\",\"typeProperties\":{\"password\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"arxqiubx\",\"parameters\":{}},\"description\":\"cpxdazvd\",\"parameters\":{\"koszu\":{\"type\":\"Float\"},\"nsntrpcaqki\":{\"type\":\"Array\"}},\"annotations\":[],\"\":{}}")
                .toObject(AzureMySqlLinkedService.class);
        Assertions.assertEquals("arxqiubx", model.connectVia().referenceName());
        Assertions.assertEquals("cpxdazvd", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("koszu").type());
    }

    @Test
    public void testSerialize() {
        AzureMySqlLinkedService model =
            new AzureMySqlLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("arxqiubx").withParameters(mapOf()))
                .withDescription("cpxdazvd")
                .withParameters(
                    mapOf(
                        "koszu",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "nsntrpcaqki",
                        new ParameterSpecification().withType(ParameterType.ARRAY)))
                .withAnnotations(Arrays.asList())
                .withPassword(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(AzureMySqlLinkedService.class);
        Assertions.assertEquals("arxqiubx", model.connectVia().referenceName());
        Assertions.assertEquals("cpxdazvd", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("koszu").type());
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
