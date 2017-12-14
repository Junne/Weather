package com.github.junne.weather.common.utils;

import android.app.Application;
import android.widget.Toast;

import com.github.junne.weather.base.BaseApplication;

/**
 * Created by baijunfeng on 2017/12/11.
 */

public class ToastUtil {
    public static Toast sToast;

    public static void showShort(String msg) {
        if (sToast == null) {
            sToast = Toast.makeText(BaseApplication.getAppContext(),"",Toast.LENGTH_SHORT);
        }
        sToast.setText(msg);
        sToast.show();
    }

    public static void showLong(String msg) {
        if (sToast == null) {
            sToast = Toast.makeText(BaseApplication.getAppContext(),"",Toast.LENGTH_LONG);
        }
        sToast.setText(msg);
        sToast.show();
    }



}
