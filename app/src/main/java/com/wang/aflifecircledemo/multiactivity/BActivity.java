package com.wang.aflifecircledemo.multiactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wang.aflifecircledemo.R;
import com.wang.aflifecircledemo.base.BaseActivity;

/**
 * @author KyoWang
 * @since 2017/09/22
 */

public class BActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
}
