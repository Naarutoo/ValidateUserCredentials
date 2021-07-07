package com.example.validateusercredentials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
private EditText mEtEmail;
private EditText mEtPassword;
private Button mBtnLogin;
private String EmailValidation ="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
initviews();

mBtnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        boolean isEmailValid = isEmailValid();
        boolean isPasswordValid =isPasswordValid();
        if (isEmailValid && isPasswordValid){
            Intent intent = new Intent(login.this,home.class);
            intent.putExtra("email",mEtEmail.getText().toString());
            startActivity(intent);
        }
    }
});
    }

    private void initviews() {
        mEtEmail =findViewById(R.id.etEmail);
        mEtPassword = findViewById(R.id.etPassword);
        mBtnLogin = findViewById(R.id.btnLogin);
    }
    private boolean isEmailValid(){
        if (mEtEmail.getText().toString().matches(EmailValidation)){
            return true;
        }else{
            mEtEmail.setError("Invalid Email");
            return false;
        }
    }

    private boolean isPasswordValid(){
        if (mEtPassword.getText().toString().length()>=6){
            return true;

        }else{

            mEtPassword.setError("Invalid Password");
return false;
        }
    }
}