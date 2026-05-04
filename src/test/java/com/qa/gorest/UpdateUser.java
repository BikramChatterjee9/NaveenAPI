package com.qa.gorest;

import com.qa.base.BaseTest;
import com.qa.client.RestClient;
import com.qa.constants.AuthType;
import com.qa.pojo.UserPojo;
import com.qa.utils.StringUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UpdateUser extends BaseTest {

    RestClient restClient;

    @Test
    public void m1()
    {
//        restClient = new RestClient();
//
//        UserPojo userPojo = new UserPojo(null,"Priyanka", StringUtils.getRandomEmail(),"female","active");
//        Response response1 = restClient.post(GO_REST_BASEURL,GO_REST_ENDPOINT,userPojo,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        String userId = response1.jsonPath().getString("id");
//        System.out.println(userId);
//
//        Response response2 = restClient.get(GO_REST_BASEURL,GO_REST_ENDPOINT+"/"+userId,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertTrue(response2.statusLine().contains("OK"));
//
//        userPojo.setName("Priyanka123");
//        Response response3 =restClient.put(GO_REST_BASEURL,GO_REST_ENDPOINT+"/"+userId,userPojo,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertEquals(response3.jsonPath().getString("name"),userPojo.getName());
//
//        Response response4 =restClient.delete(GO_REST_BASEURL,GO_REST_ENDPOINT+"/"+userId,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);



    }
}
