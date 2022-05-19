package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.group1_capstone.R;

public class BookmarkList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bookmark_list);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.imgbtn1:
            case R.id.imgbtn2:
                startActivity(new Intent(this, AboutRestaurant.class));
                break;
            case R.id.imgbtn3:
            case R.id.imgbtn4:
            case R.id.imgbtn5:
            case R.id.imgbtn6:
                startActivity(new Intent(this, AboutResort.class));
                break;
            case R.id.button12:
                finish();
                break;
        }
    }
}