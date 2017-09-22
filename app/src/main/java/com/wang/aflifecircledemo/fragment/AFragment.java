package com.wang.aflifecircledemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wang.aflifecircledemo.R;
import com.wang.aflifecircledemo.base.BaseFragment;

/**
 * @author KyoWang
 * @since 2017/09/22
 */

public class AFragment extends BaseFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        return v;
    }
}
