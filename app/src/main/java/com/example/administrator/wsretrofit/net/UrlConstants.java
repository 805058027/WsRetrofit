package com.example.administrator.wsretrofit.net;


/**
 * Description
 * 接口汇总
 */
public interface UrlConstants {

    String IP_WITH_PORT = "api.jisuapi.com";
    String SEPARATOR = "/";
    String PROTOCOL = "http://";
    String SERVER = PROTOCOL + IP_WITH_PORT + SEPARATOR + SEPARATOR;

    interface App {
        String GET_WEATHER= "weather/query";
    }
}
