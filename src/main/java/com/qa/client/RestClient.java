package com.qa.client;
import com.qa.constants.AuthType;
import com.qa.manager.ConfigManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Base64;
import java.util.Map;

public class RestClient {

    ResponseSpecification response200 = expect().statusCode(200);
    ResponseSpecification response201 = expect().statusCode(201);
    ResponseSpecification response400 = expect().statusCode(400);
    ResponseSpecification response200or201 = expect().statusCode(anyOf(equalTo(200),equalTo(201)));
    ResponseSpecification response200or404 = expect().statusCode(anyOf(equalTo(200),equalTo(404)));
    ResponseSpecification response204 = expect().statusCode(204);

    public static RequestSpecification SetupRequest(String baseURL, AuthType authType, ContentType contentType)
    {
        RequestSpecification request = given().baseUri(baseURL).log().all()
                .contentType(contentType)
                .accept(contentType);

        switch (authType)
        {
            case BEARER_TOKEN:
                request.header("Authorization","Bearer "+ ConfigManager.get("bearerToken"));
                break;
            case OATH2:
                request.header("Authorization ","Bearer ");
                break;
            case NO_AUTH:
                System.out.println("No Auth needed");
                break;
            case BASIC_AUTH:
                request.header("Authorization ","Basic "+generateBasicAuth());
                break;
            default:
                System.out.println("Invalid auth");
                break;
        }

        return request;
    }

    public void applyParam(RequestSpecification request, Map<String,String> queryMap,Map<String,String> pathMap)
    {
        if(queryMap!=null)
        {
            request.queryParams(queryMap);
        }
        if(pathMap!=null)
        {
            request.pathParams(pathMap);
        }
    }

    private static String generateBasicAuth()
    {
        String credentials=ConfigManager.get("basicUserName")+":"+ConfigManager.get("basicPassword");
        return Base64.getEncoder().encodeToString(credentials.getBytes());
    }

    public Response get(String baseURL, String endPoint, Map<String,String> queryMap, Map<String,String> pathMap,
                        AuthType authType, ContentType contentType)
    {
        RequestSpecification request = SetupRequest(baseURL,authType,contentType);
        applyParam(request,queryMap,pathMap);
        Response response = request.get(endPoint).then().spec(response200or404).extract().response();
        response.prettyPrint();
        return response;
    }

    public <T>Response post(String baseURL, String endPoint, T body, Map<String,String> queryParam,
                            Map<String,String> pathParam,
                            AuthType authType, ContentType contentType)
    {
        RequestSpecification request = SetupRequest(baseURL,authType,contentType);
        applyParam(request,queryParam,pathParam);
        Response response = request
                .body(body).log().all()
                .post(endPoint)
                .then().log().all()
                .spec(response200or201)
                .extract().response();
        response.prettyPrint();
        return response;
    }

    public <T>Response put(String baseURL, String endPoint, T body, Map<String,String> queryParam,
                            Map<String,String> pathParam,
                            AuthType authType, ContentType contentType)
    {
        RequestSpecification request = SetupRequest(baseURL,authType,contentType);
        applyParam(request,queryParam,pathParam);
        Response response = request
                .body(body).log().all()
                .put(endPoint)
                .then().log().all()
                .spec(response200)
                .extract().response();
        response.prettyPrint();
        return response;
    }

    public <T>Response patch(String baseURL, String endPoint, T body, Map<String,String> queryParam,
                           Map<String,String> pathParam,
                           AuthType authType, ContentType contentType)
    {
        RequestSpecification request = SetupRequest(baseURL,authType,contentType);
        applyParam(request,queryParam,pathParam);
        Response response = request
                .body(body).log().all()
                .patch(endPoint)
                .then().log().all()
                .spec(response200)
                .extract().response();
        response.prettyPrint();
        return response;
    }

    public Response delete(String baseURL, String endPoint, Map<String,String> queryParam,
                             Map<String,String> pathParam,
                             AuthType authType, ContentType contentType)
    {
        RequestSpecification request = SetupRequest(baseURL,authType,contentType);
        applyParam(request,queryParam,pathParam);
        Response response = request
                .log().all()
                .delete(endPoint)
                .then().log().all()
                .spec(response204)
                .extract().response();
        response.prettyPrint();
        return response;
    }








}
