// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.OutboundNetworkDependenciesEndpointInner;
import com.azure.resourcemanager.kusto.models.OutboundNetworkDependenciesEndpointListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OutboundNetworkDependenciesEndpointListResultTests {
    @Test
    public void testDeserialize() {
        OutboundNetworkDependenciesEndpointListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"category\":\"wlquuijfqkace\",\"endpoints\":[],\"provisioningState\":\"Failed\"},\"etag\":\"pubjibw\",\"id\":\"iftohqkvpu\",\"name\":\"ksgplsa\",\"type\":\"nynfsynljphuo\"},{\"properties\":{\"category\":\"dlqiyntorzih\",\"endpoints\":[],\"provisioningState\":\"Running\"},\"etag\":\"swsrms\",\"id\":\"yzrpzbchckqqzq\",\"name\":\"ox\",\"type\":\"ysuiizynkedya\"}],\"nextLink\":\"wyhqmibzyhwits\"}")
                .toObject(OutboundNetworkDependenciesEndpointListResult.class);
        Assertions.assertEquals("wlquuijfqkace", model.value().get(0).category());
    }

    @Test
    public void testSerialize() {
        OutboundNetworkDependenciesEndpointListResult model =
            new OutboundNetworkDependenciesEndpointListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OutboundNetworkDependenciesEndpointInner()
                                .withCategory("wlquuijfqkace")
                                .withEndpoints(Arrays.asList()),
                            new OutboundNetworkDependenciesEndpointInner()
                                .withCategory("dlqiyntorzih")
                                .withEndpoints(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(OutboundNetworkDependenciesEndpointListResult.class);
        Assertions.assertEquals("wlquuijfqkace", model.value().get(0).category());
    }
}
