package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.group1_capstone.R;

public class BookResort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_resort);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.cancel:
                finish();
                break;
            case R.id.bookResort2:
                Toast.makeText(this, "Booking details has been sent to your e-mail", Toast.LENGTH_LONG).show();
                Intent next=new Intent(getApplicationContext(),AboutResort.class);
                next.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(next);
                break;
        }
    }
}