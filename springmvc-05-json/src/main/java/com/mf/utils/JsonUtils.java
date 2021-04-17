package com.mf.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author mf
 * @create 2021-04-16-12:54
 */
public class JsonUtils {
    public static String getJson(Object object) throws JsonProcessingException {
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }
    public static String getJson(Object object,String sdf) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);
        objectMapper.setDateFormat(simpleDateFormat);
        return objectMapper.writeValueAsString(object);
    }
}
