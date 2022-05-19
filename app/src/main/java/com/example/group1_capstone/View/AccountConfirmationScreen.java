package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.group1_capstone.R;

public class AccountConfirmationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_account_confirmation_screen); }

        @SuppressLint("ShowToast")
        public void buttonConfirmationScreen(View view){
            switch (view.getId()){
                case R.id.button:
                    startActivity(new Intent(this, LogInScreen.class));
                    break;
                case R.id.button2:
                    startActivity(new Intent(this, CreateAccountScreen.class));
                    break;
                case R.id.btnLink:
                    Toast.makeText(this, "Verification code has been sent to your email.", Toast.LENGTH_LONG).show();
                    break;
            }
    }
}