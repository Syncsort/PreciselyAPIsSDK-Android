/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.0.2
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
import com.precisely.apis.model.TaxAddressRequest;
import com.precisely.apis.model.TaxResponses;
import com.precisely.apis.model.TaxLocationRequest;
import com.precisely.apis.model.TaxLocationResponses;
import com.precisely.apis.model.TaxRateResponses;
import com.precisely.apis.model.TaxRateAddressRequest;
import com.precisely.apis.model.TaxRateLocationResponses;
import com.precisely.apis.model.TaxRateLocationRequest;
import com.precisely.apis.model.TaxDistrictResponse;
import com.precisely.apis.model.TaxDistrictResponseList;
import com.precisely.apis.model.IPDTaxByAddressBatchRequest;
import com.precisely.apis.model.TaxResponse;
import com.precisely.apis.model.TaxRateResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocalTaxServiceApi
 */
public class LocalTaxServiceApiTest {

    private final LocalTaxServiceApi api = new LocalTaxServiceApi();

    
    /**
     * Post Tax By Address
     *
     * This is a Batch offering for &#39;Tax By Address&#39; service. It accepts a single address, purchase amount or a list of addresses, purchase amounts and retrieve applicable taxes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTaxByAddressTest() throws ApiException {
        String taxRateTypeId = null;
        TaxAddressRequest body = null;
        // TaxResponses response = api.getBatchTaxByAddress(taxRateTypeId, body);

        // TODO: test validations
    }
    
    /**
     * Post Tax By Location
     *
     * This is a Batch offering for &#39;Tax By Location&#39; service. It accepts a single location coordinate, purchase amount or a list of location coordinates, purchase amounts and retrieve applicable tax.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTaxByLocationTest() throws ApiException {
        String taxRateTypeId = null;
        TaxLocationRequest body = null;
        // TaxLocationResponses response = api.getBatchTaxByLocation(taxRateTypeId, body);

        // TODO: test validations
    }
    
    /**
     * Post Taxrate By Address
     *
     * This is a Batch offering for &#39;Taxrate By Address&#39; service. It accepts a single address or a list of addresses and retrieve applicable tax rates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTaxRateByAddressTest() throws ApiException {
        String taxRateTypeId = null;
        TaxRateAddressRequest body = null;
        // TaxRateResponses response = api.getBatchTaxRateByAddress(taxRateTypeId, body);

        // TODO: test validations
    }
    
    /**
     * Post Taxrate By Location
     *
     * This is a Batch offering for &#39;Taxrate By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve applicable tax rates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTaxRateByLocationTest() throws ApiException {
        String taxRateTypeId = null;
        TaxRateLocationRequest body = null;
        // TaxRateLocationResponses response = api.getBatchTaxRateByLocation(taxRateTypeId, body);

        // TODO: test validations
    }
    
    /**
     * Get IPD Tax by Address
     *
     * This will accept &#39;address&#39; as a parameter and will return one or many IPDs details for that region in which address will fall.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPDTaxByAddressTest() throws ApiException {
        String address = null;
        String returnLatLongFields = null;
        String latLongFormat = null;
        // TaxDistrictResponse response = api.getIPDTaxByAddress(address, returnLatLongFields, latLongFormat);

        // TODO: test validations
    }
    
    /**
     * Get IPD Tax for batch requests
     *
     * Get IPD Tax for batch requests
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPDTaxByAddressBatchTest() throws ApiException {
        IPDTaxByAddressBatchRequest body = null;
        // TaxDistrictResponseList response = api.getIPDTaxByAddressBatch(body);

        // TODO: test validations
    }
    
    /**
     * Get Tax By Address
     *
     * This service calculates and returns taxes applicable at a specific address. Address, purchase amount and supported tax rate type are inputs to the service.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpecificTaxByAddressTest() throws ApiException {
        String taxRateTypeId = null;
        String address = null;
        String purchaseAmount = null;
        // TaxResponse response = api.getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount);

        // TODO: test validations
    }
    
    /**
     * Get Tax By Location
     *
     * This service calculates and returns tax applicable at a specific location. Longitude, latitude, purchase amount and supported tax rate type are inputs to the service.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpecificTaxByLocationTest() throws ApiException {
        String taxRateTypeId = null;
        String latitude = null;
        String longitude = null;
        String purchaseAmount = null;
        // TaxResponse response = api.getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount);

        // TODO: test validations
    }
    
    /**
     * Get Taxrate By Address
     *
     * Retrieves tax rates applicable to a specific address. This service accepts address and supported tax rate type as inputs to retrieve applicable tax rates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpecificTaxRateByAddressTest() throws ApiException {
        String taxRateTypeId = null;
        String address = null;
        // TaxRateResponse response = api.getSpecificTaxRateByAddress(taxRateTypeId, address);

        // TODO: test validations
    }
    
    /**
     * Get Taxrate By Location
     *
     * Retrieves tax rates applicable to a specific location. This service accepts longitude, latitude and supported tax rate type as inputs to retrieve applicable tax rates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpecificTaxRateByLocationTest() throws ApiException {
        String taxRateTypeId = null;
        String latitude = null;
        String longitude = null;
        // TaxRateResponse response = api.getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude);

        // TODO: test validations
    }
    
}
