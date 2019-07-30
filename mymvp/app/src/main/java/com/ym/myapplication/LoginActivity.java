package com.ym.myapplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author：created by leaf on 2019/7/29
 * Github地址：https://github.com/Ye-Miao
 * Desc:
 */
public class LoginActivity extends AppCompatActivity implements LoginContract.View{
    private  ProgressDialog progressDialog;
    @BindView(R.id.et_user_name) EditText et_user_name;
    @BindView(R.id.et_psw) EditText et_psw;
    private LoginContract.Presenter mPresenter;
    @OnClick(R.id.btn_login)
    public void onViewClicked(View view){
//        Toast.makeText(this, "你好", Toast.LENGTH_SHORT).show();
        String name=et_user_name.getText().toString().trim();
        String psw=et_psw.getText().toString().trim();
        mPresenter.login(name, psw);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
//        拿到presenter层的引用
        mPresenter=new LoginPresenter(this);


    }

    @Override
    public void LoginSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginFalie(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登陆中");
        progressDialog.show();
    }

    @Override
    public void hideDialog() {
        if (progressDialog != null && progressDialog.isShowing())
            progressDialog.dismiss();
    }
}
