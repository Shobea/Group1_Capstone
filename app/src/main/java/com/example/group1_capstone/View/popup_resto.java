package com.example.group1_capstone.View;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.example.group1_capstone.R;

public class popup_resto extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_resto);

        DisplayMetrics displayMetrics= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width=displayMetrics.widthPixels;
        int height=displayMetrics.heightPixels;

        getWindow().setLayout((int) (width*.9),(int) (height*.5));

    }
}
