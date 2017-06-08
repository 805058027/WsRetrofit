package com.example.administrator.wsretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.wsretrofit.model.AreaInfo;
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
                //网络请求
                Call<AreaInfo> mCall = HttpUtils.getInstance().getAreaInfo();
                mCall.enqueue(new Callback<AreaInfo>() {
                    @Override
                    public void onResponse(Call<AreaInfo> call, Response<AreaInfo> response) {
                        super.onResponse(call, response);
                        for (int i = 0; i < response.body().objects.size(); i++) {
                            System.out.println(response.body().objects.get(i).vcArea);
                        }
                    }
                });
                break;
        }
    }

}
