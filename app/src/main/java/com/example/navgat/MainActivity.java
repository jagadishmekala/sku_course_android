package com.example.navgat;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.RemoteViews;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navgat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_aboutsku, R.id.nav_websitesku, R.id.nav_disclaimer, R.id.nav_developer)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void instagram(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://instagram.com/jagadish__mekala?igshid=NGExMmI2YTkyZg=="));
        startActivity(intent);

    }

    public void instagram2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://instagram.com/naa_ni__21?igshid=NGExMmI2YTkyZg=="));
        startActivity(intent);
    }

    public void jblogger(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://jagadishmekala.blogspot.com/"));
        startActivity(intent);
    }

    public void Portfolio(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://jagadishmekalaportfolio.netlify.app/?fbclid=PAAaas3at4mMJ4WsViLZNz_ayPGPD13Mok9AsPSZR4dcg4D-4SDyTBmsgCFCM"));
        startActivity(intent);
    }

    public void Linkedin(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.linkedin.com/in/jagadishmekala"));
        startActivity(intent);
    }

    public void Github(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/jagadishmekala?fbclid=PAAabz-nWrpwZK9uJTTyh6-mE3h69i7lfVidSkf2MMjQGlc8QjHQN9rCIHqSo"));
        startActivity(intent);
    }


    public void homepage(MenuItem item) {

        // Do something when the homepage SKU item is clicked.
        Log.d("homepage", "Homepage SKU clicked");

        // Open a web page in the default browser.
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.skuniversity.ac.in/"));
        startActivity(intent);
    }


    public void Feedback(MenuItem item) {

        // Do something when the feedback SKU item is clicked.
        Log.d("feeback", "Feedback SKU clicked");

        // Open a web page in the default browser.
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("mailto:jagadishmekala2000@gmail.com?subject=Feedback&Suggestions About S K University Syllabus App"));
        startActivity(intent);
    }

    public void Websitesku(MenuItem item) {

        // Do something when the feedback SKU item is clicked.
        Log.d("Atal Incubation", "Feedback SKU clicked");

        // Open a web page in the default browser.
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.aic-sku.com/startups"));
        startActivity(intent);
    }
    public void Resultsku(MenuItem item) {

        // Do something when the feedback SKU item is clicked.
        Log.d("Atal Incubation", "Feedback SKU clicked");

        // Open a web page in the default browser.
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://jnanabhumi.ap.gov.in/"));
        startActivity(intent);
    }

    public void Notificationsku(MenuItem item) {

        // Do something when the feedback SKU item is clicked.
        Log.d("SKU Notificaton", "sku notifiaction SKU clicked");

        // Open a web page in the default browser.
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://skuniversity.ac.in/notifications.html"));
        startActivity(intent);
    }

    public void mapsku(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://goo.gl/maps/eqZbM9n4V7g25dFt5"));
        startActivity(intent);

    }

    public void Whatsapp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://wa.me/+918106238184"));
        startActivity(intent);
    }
}

