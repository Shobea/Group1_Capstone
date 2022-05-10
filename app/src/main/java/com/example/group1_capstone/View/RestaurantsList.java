package com.example.group1_capstone.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.group1_capstone.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RestaurantsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_restaurants_list);

        BottomNavigationView navBar=findViewById(R.id.navigation_bar2);
        navBar.setSelectedItemId(R.id.notification);
        navBar.setSelectedItemId(R.id.heart);
        navBar.setSelectedItemId(R.id.book);

        navBar.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.notification:
                        startActivity(new Intent(getApplicationContext(),PromosScreen.class));
                        break;
                    case R.id.heart:
                        startActivity(new Intent(getApplicationContext(),BookmarkList.class));
                        break;
                    case R.id.book:
                        startActivity(new Intent(getApplicationContext(),CreateAccountScreen.class));
                        break;
                }
            }
        });
    }
    }