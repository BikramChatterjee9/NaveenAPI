package com.qa.contacts;

import com.qa.base.BaseTest;
import com.qa.client.RestClient;
import com.qa.constants.AuthType;
import com.qa.manager.ConfigManager;
import com.qa.pojo.CreateCredentials;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CreateUser extends BaseTest {


    @Test
    public void m1()
    {
//        restClient = new RestClient();
//        CreateCredentials createCredentials = new CreateCredentials("rapanomik@gmail.com","vicky123");
//        Response response = restClient.post(CONTACTS_BASEURL,CONTACTS_LOGIN_ENDPOINT,createCredentials,null,null, AuthType.NO_AUTH, ContentType.JSON);
//        String userToken = response.jsonPath().getString("token");
//        System.out.println(userToken);
//
//        ConfigManager.set("bearerToken",userToken);
//        Response response1 =restClient.get(CONTACTS_BASEURL,CONTACTS_ENDPOINT,null,null,AuthType.BEARER_TOKEN,ContentType.JSON);
//        response1.prettyPrint();
    }
}
