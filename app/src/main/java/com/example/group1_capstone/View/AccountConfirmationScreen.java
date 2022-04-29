package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.group1_capstone.R;

public class AccountConfirmationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_account_confirmation_screen);

        Button confirm=findViewById(R.id.button);
        Button back=findViewById(R.id.button2);

        confirm.setOnClickListener((view -> startActivity(new Intent(this, LogInScreen.class))));
        back.setOnClickListener((view -> startActivity(new Intent(this, CreateAccountScreen.class))));
    }
}