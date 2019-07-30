package com.ym.myapplication;

/**
 * @author：created by leaf on 2019/7/29
 * Github地址：https://github.com/1948421773
 * Desc:
 */
public class LoginPresenter implements LoginContract.Presenter {
    private final LoginActivity loginActivity;
    private final LoginContract.Model mModel;

    public LoginPresenter(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        this.mModel=new LoginModel(this);
    }

    @Override
    public void login(String name, String psw) {
//        通知activity显示进度
        loginActivity.showDialog();
//        通知model登录
        mModel.Login(name,psw);
    }

    @Override
    public void loginSuccess() {
//        登录成功之后回调
        loginActivity.hideDialog();
        loginActivity.LoginSuccess();
    }

    @Override
    public void loginFailed(String msg) {
//        失败之后回调
        loginActivity.hideDialog();
        loginActivity.LoginFalie(msg);
    }
}
