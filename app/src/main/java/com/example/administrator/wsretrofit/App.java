package com.example.administrator.wsretrofit;

import android.app.Application;

/**
 * Description
 *
 * @author azzbcc on 17-4-26 下午2:50
 * @email azzbcc@sina.com
 */
public class App extends Application {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContext.init(this);
        if (instance == null) {
            instance = this;
        }
    }
}
