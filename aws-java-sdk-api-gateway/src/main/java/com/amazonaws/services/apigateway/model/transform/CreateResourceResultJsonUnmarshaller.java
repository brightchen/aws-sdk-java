/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateResourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceResultJsonUnmarshaller implements Unmarshaller<CreateResourceResult, JsonUnmarshallerContext> {

    public CreateResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateResourceResult createResourceResult = new CreateResourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createResourceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createResourceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentId", targetDepth)) {
                    context.nextToken();
                    createResourceResult.setParentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pathPart", targetDepth)) {
                    context.nextToken();
                    createResourceResult.setPathPart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    context.nextToken();
                    createResourceResult.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceMethods", targetDepth)) {
                    context.nextToken();
                    createResourceResult.setResourceMethods(new MapUnmarshaller<String, Method>(context.getUnmarshaller(String.class), MethodJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createResourceResult;
    }

    private static CreateResourceResultJsonUnmarshaller instance;

    public static CreateResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateResourceResultJsonUnmarshaller();
        return instance;
    }
}
