package com.example.group1_capstone.View;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.group1_capstone.R;
import com.example.group1_capstone.databinding.ActivityResortsListBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

@SuppressWarnings("deprecation")
public class ResortsList extends activity_base_drawer {
    BottomNavigationView navbar;
    ActivityResortsListBinding activityResortsListBinding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityResortsListBinding= ActivityResortsListBinding.inflate(getLayoutInflater());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(activityResortsListBinding.getRoot());
        allocateActivityTitle("Resorts");


        navbar=findViewById(R.id.navigation_bar2);
        navbar.setSelectedItemId(R.id.notification);
        navbar.setSelectedItemId(R.id.heart);
        navbar.setSelectedItemId(R.id.book);


        navbar.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case  R.id.notification:
                    Toast.makeText(this, "No new notifications.", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.heart:
                    startActivity(new Intent(ResortsList.this,BookmarkList.class));
                    return true;
                case R.id.book:
                    Toast.makeText(this, "You did not book anything yet.", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.search:
                    startActivity(new Intent(ResortsList.this,popup_search.class));
                    return true;
            }
            return false;
        });
    }
    @SuppressLint("NonConstantResourceId")
    public void onClick (View view){
        switch (view.getId()){
            case R.id.resort1:
            case R.id.resort2:
            case R.id.resort3:
            case R.id.resort9:
            case R.id.resort8:
            case R.id.resort7:
            case R.id.resort6:
            case R.id.resort5:
            case R.id.resort4:
                startActivity(new Intent(this,AboutResort.class));
                break;
        }

    }
}