package com.study.jasmin.jasmin.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.study.jasmin.jasmin.R;

public class IntroActivity extends Activity implements View.OnClickListener{
    public static final String TAG = "IntroActivity";
    Button btnRegist;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        btnRegist = (Button)findViewById(R.id.btn_register);
        btnLogin = (Button)findViewById(R.id.btn_login);
        btnRegist.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                startActivity(new Intent(this,RegistActivity.class));
                break;

            case R.id.btn_login:
                startActivity(new Intent(this,LoginActivity.class));
                break;
        }
    }
}
