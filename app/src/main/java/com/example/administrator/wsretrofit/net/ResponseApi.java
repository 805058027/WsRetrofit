package com.example.administrator.wsretrofit.net;


/**
 * Created by l on 2017/4/25.
 */

import com.example.administrator.wsretrofit.model.AreaInfo;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * 获取数据
 */
public interface ResponseApi {

    /**
     * 获取区域列表
     */
    @POST(UrlConstants.App.GET_AREA_INFO)
    Call<AreaInfo> getAreaInfo();
}


