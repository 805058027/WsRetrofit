package com.example.administrator.wsretrofit.net;


/**
 * Created by l on 2017/4/25.
 */

import com.example.administrator.wsretrofit.model.WeatherBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 获取数据
 */
public interface ResponseApi {

    @FormUrlEncoded
    @POST(UrlConstants.App.GET_WEATHER)
    Call<WeatherBean> getWeatherInfo(@Field("appkey") String appkey,
                                     @Field("city") String format);


    /* @FormUrlEncoded
    @POST(UrlConstants.App.APP_LOGIN)
    Call<AppRegLoginBean> appLogin(@Field("username") String regUserName,
                                   @Field("password") String regPwd
    );*/

}


