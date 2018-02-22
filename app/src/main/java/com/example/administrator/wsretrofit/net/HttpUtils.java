package com.example.administrator.wsretrofit.net;

import com.example.administrator.wsretrofit.net.client.MyOkHttpClient;
import com.example.administrator.wsretrofit.net.gson.GsonHandler;

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
                    .client(MyOkHttpClient.getSaveHttpClient())
                    .addConverterFactory(GsonConverterFactory.create(GsonHandler.getNoExportGson()))
                    .build();
            api = retrofit.create(ResponseApi.class);
        }
        return api;
    }
}
