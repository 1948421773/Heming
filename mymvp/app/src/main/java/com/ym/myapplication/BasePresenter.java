package com.ym.myapplication;

import android.content.Context;

import nucleus5.presenter.RxPresenter;

/**
 * @author：created by leaf on 2019/7/30
 * Github地址：https://github.com/1948421773
 * Desc:
 */
public class BasePresenter<VIEW> extends RxPresenter<VIEW> {
    protected Context context;
}
