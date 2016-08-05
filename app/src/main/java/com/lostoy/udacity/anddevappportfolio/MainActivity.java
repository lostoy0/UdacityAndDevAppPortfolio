package com.lostoy.udacity.anddevappportfolio;

import android.os.Bundle;
import android.view.View;

import com.lostoy.udacity.anddevappportfolio.utils.Utilities;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopularMovies(View v) {
        Utilities.showToastShort(this, "Popular Movies Message");
    }

    public void tockHawk(View v) {
        Utilities.showToastShort(this, "Tock Hawk Message");
    }

    public void buildItBigger(View v) {
        Utilities.showToastShort(this, "Build It Bigger Message");
    }

    public void makeYourAppMaterial(View v) {
        Utilities.showToastShort(this, "Make Your App Material Message");
    }

    public void goUbiquitos(View v) {
        Utilities.showToastShort(this, "Go Ubiquitos Message");
    }

    public void capstones(View v) {
        Utilities.showToastShort(this, "Capstones Message");
    }

}
