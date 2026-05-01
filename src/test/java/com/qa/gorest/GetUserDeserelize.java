package com.qa.gorest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.base.BaseTest;
import com.qa.constants.AuthType;
import com.qa.pojo.UserPojo;
import com.qa.utils.JsonPathUtils;
import com.qa.utils.StringUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserDeserelize extends BaseTest {

    @Test
    public void m1() throws JsonProcessingException {
        UserPojo userPojo = new UserPojo(null,"priyanka", StringUtils.getRandomEmail(),"female","active");
        Response response = restClient.post(GO_REST_BASEURL,GO_REST_ENDPOINT,userPojo,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
        Assert.assertEquals(response.jsonPath().getString("name"),"priyanka");

        String userId = response.jsonPath().getString("id");

        Response response1 = restClient.get(GO_REST_BASEURL,GO_REST_ENDPOINT+"/"+userId,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
        Assert.assertTrue(response.statusLine().contains("OK"));

        UserPojo userPojo1 = JsonPathUtils.deserelise(response1,UserPojo.class);
        System.out.println(userPojo1.getName());
    }


}
