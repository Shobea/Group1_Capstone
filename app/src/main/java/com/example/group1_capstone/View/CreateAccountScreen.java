package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.group1_capstone.R;

public class CreateAccountScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_create_account_screen);

        Button previous=findViewById(R.id.button7);
        Button createAccount=findViewById(R.id.button3);

        previous.setOnClickListener((view -> startActivity(new Intent(this, LogInScreen.class))));
        createAccount.setOnClickListener((view -> startActivity(new Intent(this, AccountConfirmationScreen.class))));
    }
}