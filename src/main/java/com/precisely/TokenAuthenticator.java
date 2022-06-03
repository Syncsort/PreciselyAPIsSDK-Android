/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.9.0
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

package com.precisely;

import com.precisely.auth.OAuth;
import com.precisely.ApiClient;
import com.precisely.Configuration;
import com.precisely.ApiException;
import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-04T15:16:42.948+05:30")

public class TokenAuthenticator implements Authenticator {

@Override
public Request authenticate(Route route, Response response) throws IOException{

        Request request=response.request();
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        Gson gson = new Gson();
        Errors errors = null;
        try {
        errors = gson.fromJson(response.body().string(), Errors.class);
        } catch (IOException e) {
        e.printStackTrace();
        }

        for (Error error : errors.errors) {
            if (error.errorCode.toString().contentEquals("PB-APIM-ERR-1003")) {
            OAuth oAuth2Password = (OAuth) Configuration.getDefaultApiClient().getAuthentication("oAuth2Password");
                if (oAuth2Password.getApiKey()!=null && oAuth2Password.getSecret()!=null) {
                    try {
                    defaultClient.generateAndSetAccessToken(oAuth2Password.getApiKey(),oAuth2Password.getSecret());
                    // Add new header to rejected request and retry it
                    request= response.request().newBuilder()
                    .header("Authorization", "Bearer " + ((OAuth) defaultClient.getAuthentication("oAuth2Password")).getAccessToken())
                    .build();
                    } catch (ApiException e) {
                    throw  new IOException(e.getMessage());
                    }

                }
                else
                {
                throw  new IOException(error.errorCode.toString() +" "+error.errorDescription.toString());
                }
            }
            else
            {
            throw  new IOException(error.errorCode.toString() +" "+error.errorDescription.toString());
            }
        }

return request;
}

   


    public class Error
    {
        private String errorCode;

        public String getErrorCode() { return this.errorCode; }

        public void setErrorCode(String errorCode) { this.errorCode = errorCode; }

        private String errorDescription;

        public String getErrorDescription() { return this.errorDescription; }

        public void setErrorDescription(String errorDescription) { this.errorDescription = errorDescription; }
    }

    public class Errors
    {
    private ArrayList
    <Error> errors;

        public ArrayList
        <Error> getErrors() {
            return this.errors;
        }

        public void setErrors(ArrayList<Error> errors) {
            this.errors = errors;
        }
    }

}