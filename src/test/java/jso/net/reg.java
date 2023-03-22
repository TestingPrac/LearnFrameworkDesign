package jso.net;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.ProxySpecification;

import java.util.HashMap;
import java.util.Map;


public class reg {
    public static void main(String[] args) {

//        String endPoint = "https://sandbox-uk-api.experian.com/oauth2/v1/token";
//        String body = "{\n" +
//                "\"username\" : \"ajin.s@bps.uk.atos.net\",\n" +
//                "\"password\" : \"AJIaji13@\",\n" +
//                "\"client_id\" : \"mbj5dYs6eqQBzvqItlAy7A4Q4cOjv42e\",\n" +
//                "\"client_secret\" : \"Dj17t8sZetbjBkkx\"\n" +
//                "}";
    //String num = "88888888";


        Map<String, String> header = new HashMap<String, String>();
    String num = "aWQ9MTAwIE1jZ3JlZ29yIFN0cmVldCwgR2xhc2dvdywgRzUxIDRVVywgVW5pdGVkIEtpbmdkb21-YWx0X2tleT0wOTUyNTcyNX5kYXRhc2V0PUdCUl9QQUZ-Zm9ybWF0X2tleT1HQlIkZ2ItYWRkcmVzcyQ4MzU0MjNhYi1jMDdlLTRiMWMtOWJhNy1kYzMwMzI3NzhlM2MkJCQ";
    String key ="addresskey";
    String key1 ="{addresskey}";
    String Bearer = "";


        //  String endPoint = "https://api-management-qa01.azure-api.net/ip/searchresult/businessprofile/v2/nonregistered/";
        String endPoint = "https://api-management-qa01.azure-api.net/ip/searchresult/address/v2/";
        RestAssured.baseURI = endPoint;


//        header.put("Reference-Id", "64872d09-007e-48b8-a448-e2f17cc6478c");
//        header.put("Correlation-ID", "efd72721cc06442a8a0888391269f097");
        header.put("Content-Type", "application/json");
        header.put("Accept", "application/json");
        header.put("api-key", "92dcebf30db4431a8d1cc428686be969");



       Response hai = (Response) RestAssured.given()
                .auth()
                .oauth2(Bearer)
                .headers(header)
                .basePath(key1)
                .pathParam(key,num)
                .get()
                .then()
                .log().all();
        System.out.println(hai.getBody());

//      ValidatableResponse response =  RestAssured.given()
//
//              .header("Content-type","app/json")
//              .contentType(ContentType.JSON)
//              .accept(ContentType.JSON)
//              .body(body)
//
//                .when().post(endPoint).then();
//
//
//        System.out.println();

    }

/*
if(pathParamObject.equals("")) {
        httpRequest = RestAssured
                    .given()
                .headers(header);
        httpRequest
                .body(requestBody)
                .when().log().all();
    } else {
        httpRequest = RestAssured
                .given()
                .auth()
                .oauth2(bearerToken)
                .basePath(pathParamKey)
                .pathParam(pathParamKey,pathParamObject)
                .headers(header);
        httpRequest
                .when()
                .get(endPoint)
                .then().log().all();
    }*/


 /*   public Response prepareIntegrationRequest(Map<String, String> header,String bearerToken, String requestBody, String requestType, String endPoint) {
        Response response=null;
        RequestSpecification httpRequest = null;
        RestAssured.config = RestAssured
                .config().encoderConfig(new EncoderConfig().defaultContentCharset("UTF-8").appendDefaultContentCharsetToContentTypeIfUndefined(false));
        if (endPoint.contains("?")) {
            if(requestBody.equals("")) {		// when request has only header.
                httpRequest = (RequestSpecification) RestAssured
                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .queryParams(queryParm)
                        .headers(header)
                        .when()
                        .log().all();

//						.given()
//						.queryParams(queryParm)
//						.headers(header)
//						.when().log().all();
            } else{						// when request has both header and body.
                httpRequest = RestAssured
                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .queryParams(queryParm)
                        .headers(header);
                httpRequest
                        .when()
                        .get(endPoint)
                        .then().log().all();
            }
        } else {
            if(requestBody.equals("")) {		// when request has only header.
                httpRequest = RestAssured

                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .headers(header)
                        .when().log().all();
//						.given()
//						.headers(header)
//						.when().log().all();
            } else{						// when request has both header and body.
                httpRequest = RestAssured
                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .headers(header);
                httpRequest
                        .when()
                        .get(endPoint)
                        .then().log().all();;
            }
        }
        switch (requestType.toLowerCase()) {
            case "get":
                response = httpRequest.get();
                break;
            case "post":
                try{
                    response = httpRequest.post();
                } catch(Exception e)
                { System.out.println(e.getMessage());}
                break;
            case "put":
                response = httpRequest.put();
                break;
            case "delete":
                response = httpRequest.delete();
                break;
        }
        slf4jLogger.info("Endpoint is        : " + endPoint);
        slf4jLogger.info("Header is          :" + header);
        slf4jLogger.info("Body is            :" + requestBody);
        slf4jLogger.info("Operation is       :" + requestType);
        slf4jLogger.info("Status code is     :" + response.getStatusCode());
        slf4jLogger.info("Query Params       :" + queryParm);
        slf4jLogger.info("Response Body       :" + response.getBody().asString());
        slf4jLogger.info("Cookies       :" + "  " + response.getCookie("cookie.jwt"));
        return response;
    }

    	public Response preparePegaRequest(Map<String, String> header, String requestBody, String requestType, String endPoint) {
		Response response=null;
		RequestSpecification httpRequest = null;
		RestAssured.config = RestAssured
				.config().encoderConfig(new EncoderConfig().defaultContentCharset("UTF-8").appendDefaultContentCharsetToContentTypeIfUndefined(false));
		if (endPoint.contains("?")) {
			if(requestBody.equals("")) {		// when request has only header.
				httpRequest = RestAssured
						.given()
						.queryParams(queryParm)
						.headers(header)
						.when().log().all();
			} else{						// when request has both header and body.
				httpRequest = RestAssured
						.given()
						.queryParams(queryParm)
						.headers(header);
				httpRequest
						.body(requestBody)
						.when().log().all();
			}
		} else {
			if(requestBody.equals("")) {		// when request has only header.
				httpRequest = RestAssured
						.given()
						.headers(header)
						.when().log().all();
			} else{						// when request has both header and body.
				httpRequest = RestAssured
						.given()
						.headers(header);
				httpRequest
						.body(requestBody)
						.when().log().all();
			}
		}
		switch (requestType.toLowerCase()) {
			case "get":
				response = httpRequest.get();
				break;
			case "post":
				try{
					response = httpRequest.post();
				} catch(Exception e)
				{ System.out.println(e.getMessage());}
				break;
			case "put":
				response = httpRequest.put();
				break;
			case "delete":
				response = httpRequest.delete();
				break;
		}
		slf4jLogger.info("Endpoint is        : " + endPoint);
		slf4jLogger.info("Header is          :" + header);
		slf4jLogger.info("Body is            :" + requestBody);
		slf4jLogger.info("Operation is       :" + requestType);
		slf4jLogger.info("Status code is     :" + response.getStatusCode());
		slf4jLogger.info("Query Params       :" + queryParm);
		slf4jLogger.info("Response Body       :" + response.getBody().asString());
		slf4jLogger.info("Cookies       :" + "  " + response.getCookie("cookie.jwt"));

//		Reporter.addStepLog("<b><font color=\"Red\">Input</font></b>");
//		Reporter.addStepLog("<b><font color=\"blue\">Endpoint:</font></b>" + "<font color=\"salmon\">" + endPoint + "</font>");
//		Reporter.addStepLog("<b><font color=\"blue\">Operation:</font></b>" + "<font color=\"salmon\">" + requestType + "</font>");
//		Reporter.addStepLog("<b><font color=\"blue\">Header:</font></b>" + "<font color=\"salmon\">" + header + "</font>");
//		Reporter.addStepLog("<b><font color=\"blue\">Body:</font></b>" + "<font color=\"salmon\">" + requestBody + "</font>");
//		Reporter.addStepLog("<b><font color=\"blue\">Query Params:</font></b>" + "<font color=\"salmon\">" + queryParm + "</font>");
//		Reporter.addStepLog("<b><font color=\"Red\">Output</font></b>");
//		Reporter.addStepLog("<b><font color=\"blue\">Response Code:</font></b>" + "<font color=\"salmon\">" + response.getStatusCode() + "</font>");
//		Reporter.addStepLog("<b><font color=\"blue\">Response Body:</font></b>" + "<font color=\"salmon\">" + response.getBody().asString() + "</font>");
		return response;
	}





    */

/////////////barer token hit
 /*   public Response prepareResponseIntegration(String functionality, String bearerToken, String body, String requestType, String endPoint, String qaEnvironment) {
        slf4jLogger.info("Functionality is         : " + functionality);
        response = null;
        connectEndpoint(endPoint);
        Map<String, String> header = prepareIntegrationHeader(functionality,qaEnvironment);
        response = prepareIntegrationRequest(header, bearerToken, body, requestType, endPoint);                        // Prepare request with header and body
        System.out.println(response.getBody().asString());
        return response;
    }

    public Response prepareIntegrationRequest(Map<String, String> header,String bearerToken, String requestBody, String requestType, String endPoint) {
        Response response=null;
        RequestSpecification httpRequest = null;
        RestAssured.config = RestAssured
                .config().encoderConfig(new EncoderConfig().defaultContentCharset("UTF-8").appendDefaultContentCharsetToContentTypeIfUndefined(false));
        if (endPoint.contains("?")) {
            if(requestBody.equals("")) {		// when request has only header.
                httpRequest = (RequestSpecification) RestAssured
                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .queryParams(queryParm)
                        .headers(header)
                        .when()
                        .log().all();


            } else{						// when request has both header and body.
                httpRequest = RestAssured
                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .queryParams(queryParm)
                        .headers(header);
                httpRequest
                        .when()
                        .get(endPoint)
                        .then().log().all();
            }
        } else {
            if(requestBody.equals("")) {		// when request has only header.
                httpRequest = RestAssured

                        .given()
                        .auth()
                        .oauth2(bearerToken)
                        .headers(header)
                        .when().log().all();
            } else{						// when request has both header and body.
                if(bearerToken.equals("")) {
                    httpRequest = RestAssured
                            .given()
                            .headers(header);
                    httpRequest
                            .body(requestBody)
                            .when().log().all();
                } else {
                    httpRequest = RestAssured
                            .given()
                            .auth()
                            .oauth2(bearerToken)
                            .headers(header);
                    httpRequest
                            .when()
                            .get(endPoint)
                            .then().log().all();
                }

            }
        }
        switch (requestType.toLowerCase()) {
            case "get":
                response = httpRequest.get();
                break;
            case "post":
                try{
                    response = httpRequest.post();
                } catch(Exception e)
                { System.out.println(e.getMessage());}
                break;
            case "put":
                response = httpRequest.put();
                break;
            case "delete":
                response = httpRequest.delete();
                break;
        }
        slf4jLogger.info("Endpoint is        : " + endPoint);
        slf4jLogger.info("Header is          :" + header);
        slf4jLogger.info("Body is            :" + requestBody);
        slf4jLogger.info("Operation is       :" + requestType);
        slf4jLogger.info("Status code is     :" + response.getStatusCode());
        slf4jLogger.info("Query Params       :" + queryParm);
        slf4jLogger.info("Response Body       :" + response.getBody().asString());
        slf4jLogger.info("Cookies       :" + "  " + response.getCookie("cookie.jwt"));
        return response;
    }*/



}
