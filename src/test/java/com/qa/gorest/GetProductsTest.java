package com.qa.gorest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.base.BaseTest;
import com.qa.client.RestClient;
import com.qa.constants.AuthType;
import com.qa.pojo.FakeStore;
import com.qa.utils.JsonPathUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProductsTest extends BaseTest {


    @Test
    public void m1() throws JsonProcessingException {

//        Response response = restClient.get(FAKE_STORE_BASE_URL,FAKE_STORE_PRODUCTS,null,null, AuthType.NO_AUTH, ContentType.ANY);
//        System.out.println(response);
//
//        FakeStore[] fakeStores = JsonPathUtils.deserelise(response, FakeStore[].class);
//
//        for(FakeStore fs : fakeStores)
//        {
//            System.out.println(fs.getId());
//        }
    }
}
