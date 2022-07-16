package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView signIn=findViewById(R.id.signInBtn);
        getSupportActionBar().hide();
        signIn.setOnClickListener(v -> {
            startActivity(new Intent(this,SignUpActivity.class));
        });
        ImageView back=findViewById(R.id.iv_back);
        back.setOnClickListener(v ->{finish();});
    }
}