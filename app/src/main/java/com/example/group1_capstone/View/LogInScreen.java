package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.group1_capstone.R;

public class LogInScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log_in_screen);

    }
        @SuppressLint("ShowToast")
        public void buttonLogInScreen(View view){
            switch (view.getId()){
                case R.id.button4:
                    startActivity(new Intent(this, PromosScreen.class));
                    break;
                case R.id.button5:
                    startActivity(new Intent(this, CreateAccountScreen.class));
                    break;
                case R.id.btnForgotPass:
                    Toast.makeText(this, "Instructions to retrieve your account has been sent to your e-mail!", Toast.LENGTH_LONG).show();
                    break;
            }
    }
}