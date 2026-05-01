package com.qa.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class JsonPathUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T deserelise(Response response, Class<T> targetclass) throws JsonProcessingException
    {
        return objectMapper.readValue(response.getBody().asString(),targetclass);
    }
}
