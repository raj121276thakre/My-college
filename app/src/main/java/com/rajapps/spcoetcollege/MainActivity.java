package com.rajapps.spcoetcollege;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this,R.id.frame_layout);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_menu);

        toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.start,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);



    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_video:
                Toast.makeText(this, "navigation_video", Toast.LENGTH_SHORT).show();
                break;


            case R.id.navigation_ebook:
                Toast.makeText(this, "navigation_ebook", Toast.LENGTH_SHORT).show();
                break;


            case R.id.navigation_theme:
                Toast.makeText(this, "navigation_theme", Toast.LENGTH_SHORT).show();
                break;


            case R.id.navigation_website:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.secsomeshwar.ac.in/"));
                startActivity(intent2);
                break;



            case R.id.navigation_rate:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" +
                            getPackageName())));
                    // google play

                } catch (Exception ex) {
                    startActivity(new
                            Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id=" +
                            getPackageName())));
                    // website google play

                }

                break;


            case R.id.navigation_share:
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Share  app with your friends and colleagues!  Download now " + "https://www.amazon.com/gp/product/B0BVWF2HL3";

                String shareSub = "Best App for college";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Share using"));
                break;


            case R.id.navigation_developer:
                Toast.makeText(this, "navigation_developer", Toast.LENGTH_SHORT).show();
                break;
        }


        //drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}