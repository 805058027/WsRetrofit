package com.example.administrator.wsretrofit.net;


/**
 * Description
 * 接口汇总
 */
public interface UrlConstants {

    String IP_WITH_PORT = "123.57.84.199";
    String SEPARATOR = "/";
    String PROTOCOL = "http://";
    String BACK_SERVER_NAME = "SinoCommunity";
    String SERVER = PROTOCOL + IP_WITH_PORT + SEPARATOR + BACK_SERVER_NAME + SEPARATOR;

    /*
     * 用户信息接口
     */
    interface App {
        // 获取区域列表
        String GET_AREA_INFO = "appCounty/getAreaInfo.do";
    }
}
