package com.example.administrator.wsretrofit.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 1 on 2017/4/25.
 */
public class HttpUtils {
    private static ResponseApi api;

    public static ResponseApi getInstance() {
        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(UrlConstants.SERVER)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            api = retrofit.create(ResponseApi.class);
        }
        return api;
    }
}
