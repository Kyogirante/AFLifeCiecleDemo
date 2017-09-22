package com.wang.aflifecircledemo.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.wang.aflifecircledemo.R;
import com.wang.aflifecircledemo.base.BaseActivity;

/**
 * @author KyoWang
 * @since 2017/09/22
 */

public class AActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        findViewById(R.id.route).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AActivity.this.startActivity(new Intent(AActivity.this, BActivity.class));
            }
        });
    }
}
