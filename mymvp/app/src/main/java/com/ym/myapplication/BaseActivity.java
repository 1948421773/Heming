package com.ym.myapplication;

import android.app.ProgressDialog;
import android.os.Bundle;

import nucleus5.presenter.Presenter;
import nucleus5.view.NucleusAppCompatActivity;

/**
 * @author：created by leaf on 2019/7/30
 * Github地址：https://github.com/1948421773
 * Desc:
 */
public class BaseActivity<P extends Presenter> extends NucleusAppCompatActivity<P> {
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intLayout();
        initView();
        initData();
        initClickListenner();
    }

    private void initClickListenner() {
    }

    private void initData() {
    }

    private void initView() {
    }

    private void intLayout() {
    }

    
}
