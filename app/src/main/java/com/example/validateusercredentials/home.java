package com.example.validateusercredentials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {
    private TextView mTvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
mTvEmail = findViewById(R.id.tvEmail);
Intent intent = getIntent();
String data = intent.getStringExtra("email");
mTvEmail.setText(data);


    }
}