package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.group1_capstone.R;

public class AboutRestaurant extends AppCompatActivity {
ImageButton heart,outline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about_restaurant);

        heart=findViewById(R.id.btnHeart);
        outline=findViewById(R.id.btnOutline);
    }

    public void buttonFunction(View view){
        switch (view.getId()){
            case R.id.button10:
                Toast.makeText(this, "BUY ONE, TAKE ONE ON ALL DRINKS!", Toast.LENGTH_LONG).show();
                break;
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
            case R.id.btnMenu:
                startActivity(new Intent(this, popup_menu.class));
                break;
            case R.id.button14:
                Toast.makeText(this, "This restaurant has no ratings yet.", Toast.LENGTH_LONG).show();
                break;
            case R.id.button15:
                Toast.makeText(this, "This restaurant has no reviews yet", Toast.LENGTH_LONG).show();
                break;
            case R.id.button16:
                Toast.makeText(this, "Nobody has liked this restaurant", Toast.LENGTH_LONG).show();
                break;

        }
    }
}