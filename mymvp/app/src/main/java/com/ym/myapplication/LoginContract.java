package com.ym.myapplication;

/**
 * @author：created by leaf on 2019/7/29
 * Github地址：https://github.com/1948421773
 * Desc:
 */
public interface LoginContract {
    interface Model{
        void Login(String name,String psw);
    }
    interface View{
        void LoginSuccess();
        void LoginFalie(String msg);
        void showDialog();
        void hideDialog();
    }
    interface Presenter{
       void login(String name,String psw);
       void loginSuccess();
       void loginFailed(String msg);
    }
}
