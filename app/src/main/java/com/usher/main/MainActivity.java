package com.usher.main;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TextWatcher {

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
                if (!TextUtils.isEmpty(mEtAccount.getText()) && !TextUtils.isEmpty(mEtPassword.getText())) {
                    AlertShowUtils.showSimpleLoading(MainActivity.this);
                } else {

                    if (!(mEtAccount.getText().length() > 0)) {
                        mTilAccount.setError("please input the account");
                    }
                    if (!(mEtPassword.getText().length() > 0)) {
                        mTilPassword.setError("please input the password");
                    }
                }
            }
        });
        mEtAccount.addTextChangedListener(this);
        mEtPassword.addTextChangedListener(this);
    }

    private void initView() {
        mTilAccount = (TextInputLayout) findViewById(R.id.til_account);
        mEtAccount = (EditText) findViewById(R.id.et_account);
        mTilPassword = (TextInputLayout) findViewById(R.id.til_password);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (mEtAccount.hasFocus() && !TextUtils.isEmpty(mTilAccount.getError())) {
            mTilAccount.setError(null);
        }
        if (mEtPassword.hasFocus() && !TextUtils.isEmpty(mTilPassword.getError())) {
            mTilPassword.setError(null);
        }
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
