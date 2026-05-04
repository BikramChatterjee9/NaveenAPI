package com.qa.gorest;

import com.qa.base.BaseTest;
import com.qa.client.RestClient;
import com.qa.constants.AuthType;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GetUser extends BaseTest {

    RestClient restClient;
    @Test
    public void m1()
    {
//        restClient = new RestClient();
//        Response response = restClient.get(GO_REST_BASEURL,GO_REST_ENDPOINT,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertTrue(response.statusLine().contains("OK"));
//        System.out.println(response.prettyPrint());
//        System.out.println(response.statusLine());
    }

    @Test
    public void m2()
    {
//        restClient = new RestClient();
//        Map<String,String> hm = new HashMap<>();
//        hm.put("name","Priyala Varman");
//        hm.put("status","active");
//        Response response = restClient.get(GO_REST_BASEURL,GO_REST_ENDPOINT,hm,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertTrue(response.statusLine().contains("OK"));
    }

//    @Test
//    public void m3()
//    {
//        restClient = new RestClient();
//        String userId="8442037";
//        Response response = restClient.get(GO_REST_BASEURL,GO_REST_ENDPOINT+"/"+userId,null,null, AuthType.BEARER_TOKEN, ContentType.JSON);
//        Assert.assertTrue(response.statusLine().contains("OK"));
//        System.out.println(response.statusLine());
//    }
}
