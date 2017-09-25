package com.defaultapps.preferenceshelperexample;

import android.app.Application;

import com.defaultapps.preferenceshelper.PreferencesHelper;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesHelper.builder(this)
                .build();
    }
}
