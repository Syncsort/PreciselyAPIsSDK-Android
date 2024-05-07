/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 18.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo1;
import com.precisely.apis.model.MetadataResponse;
import com.precisely.apis.model.POIByGeometryRequest;
import com.precisely.apis.model.PlacesResponse;
import com.precisely.apis.model.Poi;
import com.precisely.apis.model.PoiCount;
import com.precisely.apis.model.PoiCountRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlacesServiceApi
 */
@Ignore
public class PlacesServiceApiTest {

    private final PlacesServiceApi api = new PlacesServiceApi();

    
    /**
     * Category Code Metadata.
     *
     * This service returns a list of Category codes &amp; associated metadata which can then be used as inputs for querying the Points of Interest By Address or Location methods listed above.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryCodeMetadataTest() throws ApiException {
        String categoryCode = null;
        String level = null;
                MetadataResponse response = api.getCategoryCodeMetadata(categoryCode, level);
        // TODO: test validations
    }
    
    /**
     * Points Of Interest Details By Id
     *
     * This service returns complete details of a chosen point of interest by an identifier. The identifier could be selected from Autocomplete API response.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIByIdTest() throws ApiException {
        String id = null;
                Poi response = api.getPOIById(id);
        // TODO: test validations
    }
    
    /**
     * Get POIs By Address.
     *
     * This service accepts an address as input and returns nearby points-of-interest places around that address. Additional input features include retrieving data by name, type, standard industrial classifications and category codes, as well as geographic filtering by radius, travel times and travel distances. Response features include JSON as well as CSV download.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByAddressTest() throws ApiException {
        String address = null;
        String country = null;
        String name = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String sortBy = null;
        String fuzzyOnName = null;
        String page = null;
        String matchMode = null;
        String specificMatchOn = null;
                PlacesResponse response = api.getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn);
        // TODO: test validations
    }
    
    /**
     * GET Points Of Interest By Area.
     *
     * This service accepts city or postcode (alongwith country) and returns points-of-interest places within a city or postcode. Additional input features include retrieving data by name, type, standard industrial classifications and category codes, as well as geographic filtering by radius, travel times and travel distances. Response features include JSON as well as CSV download.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByAreaTest() throws ApiException {
        String areaName1 = null;
        String areaName3 = null;
        String postcode1 = null;
        String postcode2 = null;
        String country = null;
        String name = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String fuzzyOnName = null;
        String page = null;
        String matchMode = null;
        String specificMatchOn = null;
                PlacesResponse response = api.getPOIsByArea(areaName1, areaName3, postcode1, postcode2, country, name, type, categoryCode, sicCode, maxCandidates, fuzzyOnName, page, matchMode, specificMatchOn);
        // TODO: test validations
    }
    
    /**
     * Points Of Interest By Boundary
     *
     * Accepts a user-defined boundary as input and returns all Points of Interest within the boundary. Additionally, user can filter the response by name, type, standard industrial classifications and category codes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByGeometryTest() throws ApiException {
        POIByGeometryRequest poIByGeometryRequest = null;
                PlacesResponse response = api.getPOIsByGeometry(poIByGeometryRequest);
        // TODO: test validations
    }
    
    /**
     * Get POIs By Location.
     *
     * This service accepts latitude/longitude as input and returns nearby points-of-interest places around that location. Additional input features include retrieving data by name, type, standard industrial classifications and category codes, as well as geographic filtering by radius, travel times and travel distances. Response features include JSON as well as CSV download
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String name = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String sortBy = null;
        String fuzzyOnName = null;
        String page = null;
        String matchMode = null;
        String specificMatchOn = null;
                PlacesResponse response = api.getPOIsByLocation(longitude, latitude, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy, fuzzyOnName, page, matchMode, specificMatchOn);
        // TODO: test validations
    }
    
    /**
     * Points Of Interest Count
     *
     * Accepts a user-defined boundary as input and returns the Count number of POIs within the boundary. Additionally, user can request the count of filtered POIs by name, type, standard industrial classifications and category codes within the given polygon.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIsCountTest() throws ApiException {
        String contentType = null;
        PoiCountRequest poiCountRequest = null;
                PoiCount response = api.getPOIsCount(contentType, poiCountRequest);
        // TODO: test validations
    }
    
    /**
     * Get SIC Metadata
     *
     * This service returns a list of standard industrial classification codes &amp; associated metadata which can then be used as inputs for querying the Points of Interest By Address or Location methods listed above.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSICMetadataTest() throws ApiException {
        String sicCode = null;
        String level = null;
                MetadataResponse response = api.getSICMetadata(sicCode, level);
        // TODO: test validations
    }
    
    /**
     * Points Of Interest Autocomplete
     *
     * This service accepts partial text input and returns matching points of interest, sorted by relevance or distance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poisAutocompleteTest() throws ApiException {
        String xForwardedFor = null;
        String longitude = null;
        String latitude = null;
        String searchText = null;
        String searchOnNameOnly = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String country = null;
        String areaName1 = null;
        String areaName3 = null;
        String postcode1 = null;
        String postcode2 = null;
        String ipAddress = null;
        String autoDetectLocation = null;
        String type = null;
        String categoryCode = null;
        String sicCode = null;
        String maxCandidates = null;
        String sortBy = null;
        String matchMode = null;
        String specificMatchOn = null;
                PlacesResponse response = api.poisAutocomplete(xForwardedFor, longitude, latitude, searchText, searchOnNameOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, country, areaName1, areaName3, postcode1, postcode2, ipAddress, autoDetectLocation, type, categoryCode, sicCode, maxCandidates, sortBy, matchMode, specificMatchOn);
        // TODO: test validations
    }
    
}
