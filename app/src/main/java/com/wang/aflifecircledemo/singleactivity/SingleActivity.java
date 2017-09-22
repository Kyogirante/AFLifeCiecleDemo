package com.wang.aflifecircledemo.singleactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.wang.aflifecircledemo.R;
import com.wang.aflifecircledemo.base.BaseActivity;
import com.wang.aflifecircledemo.fragment.AFragment;
import com.wang.aflifecircledemo.fragment.BFragment;

/**
 * @author KyoWang
 * @since 2017/09/22
 */

public class SingleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new AFragment())
                .commit();

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, new BFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        findViewById(R.id.replace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new BFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm= getSupportFragmentManager();
                fm.popBackStack();
            }
        });
    }
}
