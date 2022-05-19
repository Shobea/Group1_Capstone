package com.example.group1_capstone.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;

import com.example.group1_capstone.R;

public class PromosScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_promos_screen);
    }
    public void buttonPromos(View view){
        switch(view.getId()){
            case R.id.coupon1:
            case R.id.coupon3:
            case R.id.coupon5:
            case R.id.coupon7:
            case R.id.coupon9:
                startActivity(new Intent(this,AboutResort.class));
                break;
            case R.id.coupon2:
            case R.id.coupon4:
            case R.id.coupon6:
            case R.id.coupon8:
            case R.id.coupon10:
                startActivity(new Intent(this,AboutRestaurant.class));
                break;
            case R.id.promo1:
            case R.id.promo3:
            case R.id.promo5:
            case R.id.promo7:
            case R.id.promo9:
                startActivity(new Intent(this,popup_resort.class));
                break;
            case R.id.promo2:
            case R.id.promo4:
            case R.id.promo6:
            case R.id.promo8:
            case R.id.promo10:
                startActivity(new Intent(this,popup_resto.class));
                break;
            case R.id.button6:
                startActivity(new Intent(this, ResortsList.class));
                break;

        }

        }
    }
