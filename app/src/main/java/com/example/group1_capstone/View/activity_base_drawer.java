package com.example.group1_capstone.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.group1_capstone.R;
import com.google.android.material.navigation.NavigationView;

public class activity_base_drawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    @Override
    public void setContentView(View view) {
        drawerLayout=(DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base_drawer, null);
        FrameLayout container=drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);
        super.setContentView(drawerLayout);

        Toolbar toolbar=drawerLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView=drawerLayout.findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.menu_drawer_open,R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()){
            case R.id.nav_resto:
                startActivity(new Intent(this,RestaurantsList.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_resort:
                startActivity(new Intent(this,ResortsList.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_fav:
                startActivity(new Intent(this,BookmarkList.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_notifs:
                Toast.makeText(this, "No new notifications.", Toast.LENGTH_LONG).show();
                break;
            case R.id.nav_promos:
                startActivity(new Intent(this,PromosScreen.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_profile:
                startActivity(new Intent(this,Profile.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_bookings:
                Toast.makeText(this, "You did not book anything yet.", Toast.LENGTH_LONG).show();
                break;

        }
        return false;
    }
    protected void  allocateActivityTitle(String titleString){
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(titleString);
        }
    }
}