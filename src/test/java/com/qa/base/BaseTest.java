package com.qa.base;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.qa.client.RestClient;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ChainTestListener.class)
public class BaseTest {

    protected RestClient restClient;

    protected final static String GO_REST_BASEURL = "https://gorest.co.in";
    protected final static String CONTACTS_BASEURL = "https://thinking-tester-contact-list.herokuapp.com";
    protected final static String BASE_URL_BASIC_AUTH = "https://the-internet.herokuapp.com/";
    protected final static String FAKE_STORE_BASE_URL = "https://fakestoreapi.com";

    protected final static String GO_REST_ENDPOINT = "/public/v2/users";
    protected final static String CONTACTS_LOGIN_ENDPOINT = "/users/login";
    protected final static String CONTACTS_ENDPOINT = "/users/contacts";
    protected final static String BASE_URl_ENDPOINT = "/basic_auth";
    protected final static String FAKE_STORE_PRODUCTS="/products";

    @BeforeTest
    public void setup()
    {
        restClient = new RestClient();
    }
}
