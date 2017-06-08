package com.example.administrator.wsretrofit.net.callback;

import com.example.administrator.wsretrofit.AppContext;
import com.example.administrator.wsretrofit.util.toast.ToastUtils;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Callback的封装,可以在这里进行一些通用操作
 *
 * @param <T>
 */
public abstract class Callback<T> implements retrofit2.Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.code() != 200) {
            ToastUtils.showToast(AppContext.getInstance().getContext(), "服务器异常");
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }
}
