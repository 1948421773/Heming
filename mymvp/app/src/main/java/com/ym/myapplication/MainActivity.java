package com.ym.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    Context context;
    @BindView(R.id.mText) TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        ButterKnife.bind(this);
        mText.setText("你好");
        mText.setOnClickListener((v)-> {
//                Toast.makeText(getApplicationContext(),"你好",Toast.LENGTH_SHORT).show());
                Intent it = new Intent();
                it.setClass(context, LoginActivity.class);
                startActivity(it);
        });
    }
}
