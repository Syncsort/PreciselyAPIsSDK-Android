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

import com.precisely.apis.model.ValidateEmailAddressAPIRequest;
import com.precisely.apis.model.ValidateEmailAddressAPIResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailVerificationServiceApi {
    private ApiClient apiClient;

    public EmailVerificationServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailVerificationServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for validateEmailAddress */
    private com.squareup.okhttp.Call validateEmailAddressCall(ValidateEmailAddressAPIRequest inputEmailAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = inputEmailAddress;
        
        // verify the required parameter 'inputEmailAddress' is set
        if (inputEmailAddress == null) {
            throw new ApiException("Missing the required parameter 'inputEmailAddress' when calling validateEmailAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/emailverification/v1/validateemailaddress/results.json".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * ValidateEmailAddress
     * Confirm that your customer’s mailing address exists and that mail and packages can be delivered to it.
     * @param inputEmailAddress  (required)
     * @return ValidateEmailAddressAPIResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ValidateEmailAddressAPIResponse validateEmailAddress(ValidateEmailAddressAPIRequest inputEmailAddress) throws ApiException {
        ApiResponse<ValidateEmailAddressAPIResponse> resp = validateEmailAddressWithHttpInfo(inputEmailAddress);
        return resp.getData();
    }

    /**
     * ValidateEmailAddress
     * Confirm that your customer’s mailing address exists and that mail and packages can be delivered to it.
     * @param inputEmailAddress  (required)
     * @return ApiResponse&lt;ValidateEmailAddressAPIResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ValidateEmailAddressAPIResponse> validateEmailAddressWithHttpInfo(ValidateEmailAddressAPIRequest inputEmailAddress) throws ApiException {
        com.squareup.okhttp.Call call = validateEmailAddressCall(inputEmailAddress, null, null);
        Type localVarReturnType = new TypeToken<ValidateEmailAddressAPIResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * ValidateEmailAddress (asynchronously)
     * Confirm that your customer’s mailing address exists and that mail and packages can be delivered to it.
     * @param inputEmailAddress  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateEmailAddressAsync(ValidateEmailAddressAPIRequest inputEmailAddress, final ApiCallback<ValidateEmailAddressAPIResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = validateEmailAddressCall(inputEmailAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ValidateEmailAddressAPIResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
