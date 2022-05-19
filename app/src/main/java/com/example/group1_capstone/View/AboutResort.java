package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.group1_capstone.R;

public class AboutResort extends AppCompatActivity {
    ImageButton outline,heart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_resort);

        heart=findViewById(R.id.btnHeart);
        outline=findViewById(R.id.btnOutline);

    }
    public void buttonFunction(View view){
        switch (view.getId()){
            case R.id.button13:
                finish();
                break;
            case R.id.btnOutline:
                heart.setVisibility(View.VISIBLE);
                overridePendingTransition(1,1);
                break;
            case R.id.btnHeart:
                heart.setVisibility(View.INVISIBLE);
                outline.setVisibility(View.VISIBLE);
                overridePendingTransition(1,1);
                break;
            case R.id.bookResort:
                startActivity(new Intent(this, BookResort.class));
        }
    }
}