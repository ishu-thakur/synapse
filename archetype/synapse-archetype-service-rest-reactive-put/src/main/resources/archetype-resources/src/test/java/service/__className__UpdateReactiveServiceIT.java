/*
 * Copyright 2020 American Express Travel Related Services Company, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package ${package}.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import io.americanexpress.synapse.framework.test.CommonAssertionMessages;

import ${package}.model.${className}ServiceRequest;

/**
 * {@code ${className}UpdateReactiveServiceIT} class performs integration tests
 * for the {@link ${className}UpdateReactiveService}.
 * <p>
 * Be sure that the ${apiName} REST API is running
 * prior to running this integration test.
 * @author ${author}
 */
@ExtendWith(SpringExtension.class)
class ${className}UpdateReactiveServiceIT {

    @Test
    void update_givenValidRequest_expectValidResponse() {
        ${className}UpdateReactiveService restService = new ${className}UpdateReactiveService();
        ${className}ServiceRequest serviceRequest = new ${className}ServiceRequest();
        HttpHeaders httpHeaders = new HttpHeaders();
        restService.executeUpdate(httpHeaders, serviceRequest);
    }
}
