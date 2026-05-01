package com.qa.contacts;


import com.qa.base.BaseTest;
import com.qa.constants.AuthType;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicAuthTest extends BaseTest {

    @Test
    public void m1()
    {
        Response response = restClient.get(BASE_URL_BASIC_AUTH,BASE_URl_ENDPOINT,null,null, AuthType.BASIC_AUTH, ContentType.ANY);
        System.out.println(response.getBody().asString());
    }
}
