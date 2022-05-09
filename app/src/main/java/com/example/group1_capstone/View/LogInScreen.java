package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.group1_capstone.R;

public class LogInScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_log_in_screen);

        Button login=findViewById(R.id.button4);
        Button create=findViewById(R.id.button5);

        login.setOnClickListener((view -> startActivity(new Intent(this, PromosScreen.class))));
        create.setOnClickListener((view -> startActivity(new Intent(this, CreateAccountScreen.class))));
    }
}