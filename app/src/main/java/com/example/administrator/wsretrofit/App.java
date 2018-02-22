package com.example.administrator.wsretrofit;

import android.app.Application;

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
