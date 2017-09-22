package com.wang.aflifecircledemo.util;

import android.util.Log;

/**
 * @author KyoWang
 * @since 2017/09/22
 */

public class LogUtil {

    private static final String TAG = "wang_demo";

    public static void d(String target, String msg) {
        Log.d(TAG, target + " : " + msg);
    }
}
