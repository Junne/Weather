package com.github.junne.weather.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by baijunfeng on 2017/12/14.
 */

public class BaseApplication extends Application {

    private static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return sAppContext;
    }
}
