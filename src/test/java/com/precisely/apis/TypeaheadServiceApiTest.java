/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.GeosearchLocations;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TypeaheadServiceApi
 */
public class TypeaheadServiceApiTest {

    private final TypeaheadServiceApi api = new TypeaheadServiceApi();

    
    /**
     * Typeahead Search
     *
     * Performs search to retrieve list of places by input text and location vicinity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String searchText = null;
        String latitude = null;
        String longitude = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String maxCandidates = null;
        String country = null;
        String matchOnAddressNumber = null;
        String autoDetectLocation = null;
        String ipAddress = null;
        String areaName1 = null;
        String areaName3 = null;
        String postCode = null;
        String returnAdminAreasOnly = null;
        String includeRangesDetails = null;
        String searchType = null;
        // GeosearchLocations response = api.search(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode, returnAdminAreasOnly, includeRangesDetails, searchType);

        // TODO: test validations
    }
    
}
