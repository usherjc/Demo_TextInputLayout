package com.usher.main;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout mTilAccount;
    private EditText mEtAccount;
    private TextInputLayout mTilPassword;
    private EditText mEtPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(mEtAccount.getText().length() > 0)) {
                    mTilAccount.setError("please input the account");
                }
                if (!(mEtPassword.getText().length() > 0)) {
                    mTilPassword.setError("please input the password");
                }
            }
        });
    }

    private void initView() {
        mTilAccount = (TextInputLayout) findViewById(R.id.til_account);
        mEtAccount = (EditText) findViewById(R.id.et_account);
        mTilPassword = (TextInputLayout) findViewById(R.id.til_password);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
    }
}
