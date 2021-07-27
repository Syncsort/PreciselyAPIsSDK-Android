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

import com.precisely.ApiCallback;
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.ApiResponse;
import com.precisely.Configuration;
import com.precisely.Pair;
import com.precisely.ProgressRequestBody;
import com.precisely.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.precisely.apis.model.GeoLocationIpAddr;
import com.precisely.apis.model.GeoLocationAccessPoint;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeolocationServiceApi {
    private ApiClient apiClient;

    public GeolocationServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeolocationServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getLocationByIPAddress */
    private com.squareup.okhttp.Call getLocationByIPAddressCall(String ipAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ipAddress' is set
        if (ipAddress == null) {
            throw new ApiException("Missing the required parameter 'ipAddress' when calling getLocationByIPAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/geolocation/v1/location/byipaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (ipAddress != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ipAddress", ipAddress));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Location By IP Address.
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @return GeoLocationIpAddr
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoLocationIpAddr getLocationByIPAddress(String ipAddress) throws ApiException {
        ApiResponse<GeoLocationIpAddr> resp = getLocationByIPAddressWithHttpInfo(ipAddress);
        return resp.getData();
    }

    /**
     * Location By IP Address.
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @return ApiResponse&lt;GeoLocationIpAddr&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoLocationIpAddr> getLocationByIPAddressWithHttpInfo(String ipAddress) throws ApiException {
        com.squareup.okhttp.Call call = getLocationByIPAddressCall(ipAddress, null, null);
        Type localVarReturnType = new TypeToken<GeoLocationIpAddr>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Location By IP Address. (asynchronously)
     * This service accepts an IP address and returns the location coordinates corresponding to that IP address.
     * @param ipAddress This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLocationByIPAddressAsync(String ipAddress, final ApiCallback<GeoLocationIpAddr> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLocationByIPAddressCall(ipAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoLocationIpAddr>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getLocationByWiFiAccessPoint */
    private com.squareup.okhttp.Call getLocationByWiFiAccessPointCall(String mac, String ssid, String rsid, String speed, String accessPoint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/geolocation/v1/location/byaccesspoint".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (mac != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mac", mac));
        if (ssid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ssid", ssid));
        if (rsid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rsid", rsid));
        if (speed != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "speed", speed));
        if (accessPoint != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessPoint", accessPoint));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Location by WiFi Access Point.
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @return GeoLocationAccessPoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GeoLocationAccessPoint getLocationByWiFiAccessPoint(String mac, String ssid, String rsid, String speed, String accessPoint) throws ApiException {
        ApiResponse<GeoLocationAccessPoint> resp = getLocationByWiFiAccessPointWithHttpInfo(mac, ssid, rsid, speed, accessPoint);
        return resp.getData();
    }

    /**
     * Location by WiFi Access Point.
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @return ApiResponse&lt;GeoLocationAccessPoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GeoLocationAccessPoint> getLocationByWiFiAccessPointWithHttpInfo(String mac, String ssid, String rsid, String speed, String accessPoint) throws ApiException {
        com.squareup.okhttp.Call call = getLocationByWiFiAccessPointCall(mac, ssid, rsid, speed, accessPoint, null, null);
        Type localVarReturnType = new TypeToken<GeoLocationAccessPoint>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Location by WiFi Access Point. (asynchronously)
     * This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.
     * @param mac This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. (optional)
     * @param ssid The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. (optional)
     * @param rsid This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. (optional)
     * @param speed This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. (optional)
     * @param accessPoint This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLocationByWiFiAccessPointAsync(String mac, String ssid, String rsid, String speed, String accessPoint, final ApiCallback<GeoLocationAccessPoint> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLocationByWiFiAccessPointCall(mac, ssid, rsid, speed, accessPoint, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GeoLocationAccessPoint>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
