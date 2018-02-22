package com.example.administrator.wsretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.wsretrofit.model.WeatherBean;
import com.example.administrator.wsretrofit.net.HttpUtils;
import com.example.administrator.wsretrofit.net.callback.Callback;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.mRetrofit)
    Button mRetrofit;
    @BindView(R.id.wether)
    TextView weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.mRetrofit)
    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.mRetrofit:
                getWeatherInfo();
                break;
        }
    }

    /**
     * 获取天气信息
     */
    private void getWeatherInfo() {
        Call<WeatherBean> mCall = HttpUtils.getInstance().getWeatherInfo("164d04ada7384e29", "北京");
        mCall.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                super.onResponse(call, response);
                if (response.body().getMsg().equals("ok")) {
                    weather.setText(response.body().getResult().getCity() + "---" + response.body().getResult().getWeather());
                }
            }
        });
    }
}
