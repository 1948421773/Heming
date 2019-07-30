package com.ym.myapplication;

import android.text.TextUtils;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author：created by leaf on 2019/7/29
 * Github地址：https://github.com/1948421773
 * Desc:
 */
public class LoginModel implements LoginContract.Model {
    private final LoginPresenter loginPresenter;
    public LoginModel(LoginPresenter loginPresenter){
            this.loginPresenter=loginPresenter;
    }
    @Override
    public void Login(final String name,final String psw) {
//这里我们做逻辑处理
        if (TextUtils.isEmpty(name)) {
            loginPresenter.loginFailed("姓名不允许为空");
        } else if (TextUtils.isEmpty(psw)) {
            loginPresenter.loginFailed("密码不允许为空");
        } else {
            //这里模拟登录过程
            Observable.timer(2, TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Consumer<Long>() {
                        @Override
                        public void accept(@NonNull Long aLong) throws Exception {
                            loginPresenter.loginSuccess();
                        }
                    });
        }
    }
}
