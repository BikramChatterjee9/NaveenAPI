package com.qa.gorest;

import com.qa.base.BaseTest;
import com.qa.client.RestClient;
import com.qa.constants.AuthType;
import com.qa.manager.ConfigManager;
import com.qa.pojo.CreateCredentials;
import com.qa.pojo.UserPojo;
import com.qa.utils.StringUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUser extends BaseTest {




    @Test
    public void m1()
    {

//        UserPojo userPojo = new UserPojo(null,"priyanka", StringUtils.getRandomEmail(),"female","active");
//        Response response = restClient.post(GO_REST_BASEURL,GO_REST_ENDPOINT,userPojo,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertEquals(response.jsonPath().getString("name"),"priyanka");
    }

    @Test
    public void m2()
    {

//        String User = "{\n" +
//                "    \"name\": \"Jagmeet Guneta\",\n" +
//                "    \"email\": \""+StringUtils.getRandomEmail()+"\",\n" +
//                "    \"gender\": \"female\",\n" +
//                "    \"status\": \"active\"\n" +
//                "}";
//        Response response = restClient.post(GO_REST_BASEURL,GO_REST_ENDPOINT,User,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertEquals(response.jsonPath().getString("name"),"Jagmeet Guneta");
    }
}
