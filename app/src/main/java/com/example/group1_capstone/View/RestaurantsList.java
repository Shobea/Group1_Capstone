package com.example.group1_capstone.View;

import androidx.annotation.NonNull;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.group1_capstone.R;
import com.example.group1_capstone.databinding.ActivityRestaurantsListBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class RestaurantsList extends activity_base_drawer {

    BottomNavigationView navBar;
    ActivityRestaurantsListBinding activityRestaurantsListBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRestaurantsListBinding = ActivityRestaurantsListBinding.inflate(getLayoutInflater());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(activityRestaurantsListBinding.getRoot());
        allocateActivityTitle("Restaurants");

        navBar = findViewById(R.id.navigation_bar);
        navBar.setSelectedItemId(R.id.notification);
        navBar.setSelectedItemId(R.id.heart);
        navBar.setSelectedItemId(R.id.book);

        navBar.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.notification:
                    Toast.makeText(this, "No new notifications.", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.heart:
                    startActivity(new Intent(this, BookmarkList.class));
                    return true;
                case R.id.book:
                    Toast.makeText(this, "You did not book anything yet.", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.search:
                    startActivity(new Intent(this, popup_search.class));
                    return true;
            }
            return false;
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.resto1:
            case R.id.resto2:
            case R.id.resto3:
            case R.id.resto4:
            case R.id.resto5:
            case R.id.resto6:
            case R.id.resto7:
            case R.id.resto8:
            case R.id.resto9:
                startActivity(new Intent(this, AboutRestaurant.class));
                break;
        }
    }
}

