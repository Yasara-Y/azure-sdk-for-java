// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SsisParameterTests {
    @Test
    public void testDeserialize() {
        SsisParameter model =
            BinaryData
                .fromString(
                    "{\"id\":5489116524158771379,\"name\":\"raymezx\",\"description\":\"kihmxrfdsajredn\",\"dataType\":\"yshtuwgmev\",\"required\":true,\"sensitive\":false,\"designDefaultValue\":\"yifrkgwltxeqipx\",\"defaultValue\":\"dyimsfay\",\"sensitiveDefaultValue\":\"pra\",\"valueType\":\"jogeslabnsmjkwyn\",\"valueSet\":true,\"variable\":\"kqsykvwjtqpke\"}")
                .toObject(SsisParameter.class);
        Assertions.assertEquals(5489116524158771379L, model.id());
        Assertions.assertEquals("raymezx", model.name());
        Assertions.assertEquals("kihmxrfdsajredn", model.description());
        Assertions.assertEquals("yshtuwgmev", model.dataType());
        Assertions.assertEquals(true, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("yifrkgwltxeqipx", model.designDefaultValue());
        Assertions.assertEquals("dyimsfay", model.defaultValue());
        Assertions.assertEquals("pra", model.sensitiveDefaultValue());
        Assertions.assertEquals("jogeslabnsmjkwyn", model.valueType());
        Assertions.assertEquals(true, model.valueSet());
        Assertions.assertEquals("kqsykvwjtqpke", model.variable());
    }

    @Test
    public void testSerialize() {
        SsisParameter model =
            new SsisParameter()
                .withId(5489116524158771379L)
                .withName("raymezx")
                .withDescription("kihmxrfdsajredn")
                .withDataType("yshtuwgmev")
                .withRequired(true)
                .withSensitive(false)
                .withDesignDefaultValue("yifrkgwltxeqipx")
                .withDefaultValue("dyimsfay")
                .withSensitiveDefaultValue("pra")
                .withValueType("jogeslabnsmjkwyn")
                .withValueSet(true)
                .withVariable("kqsykvwjtqpke");
        model = BinaryData.fromObject(model).toObject(SsisParameter.class);
        Assertions.assertEquals(5489116524158771379L, model.id());
        Assertions.assertEquals("raymezx", model.name());
        Assertions.assertEquals("kihmxrfdsajredn", model.description());
        Assertions.assertEquals("yshtuwgmev", model.dataType());
        Assertions.assertEquals(true, model.required());
        Assertions.assertEquals(false, model.sensitive());
        Assertions.assertEquals("yifrkgwltxeqipx", model.designDefaultValue());
        Assertions.assertEquals("dyimsfay", model.defaultValue());
        Assertions.assertEquals("pra", model.sensitiveDefaultValue());
        Assertions.assertEquals("jogeslabnsmjkwyn", model.valueType());
        Assertions.assertEquals(true, model.valueSet());
        Assertions.assertEquals("kqsykvwjtqpke", model.variable());
    }
}
