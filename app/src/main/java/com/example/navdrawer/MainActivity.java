package com.example.navdrawer;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.navdrawer.fragments.ClubFragment;
import com.example.navdrawer.fragments.TopScorerFragment;
import com.example.navdrawer.fragments.POTMFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            showClubPage();
            showPOTMPage();

            drawerLayout = findViewById(R.id.drawer_layout);
            toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

            drawerLayout.addDrawerListener(toggle);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);

            NavigationView navigationView = findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int itemId = item.getItemId();

                    if (itemId == R.id.menu_item1) {
                        showClubPage();
                    } else if (itemId == R.id.menu_item2) {
                        showPOTMPage();
                    } else {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, new POTMFragment())
                                .commit();
                        getSupportActionBar().setTitle("POTM");
                    }

                    drawerLayout.closeDrawers();
                    return true;
                }
            });
            showClubPage();
        }

    @Override
        protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);
            toggle.syncState();
        }

        private void showClubPage() {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, new ClubFragment())
                    .commit();

            getSupportActionBar().setTitle("Klasemen LaLiga");
        }

        private void showPOTMPage() {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new TopScorerFragment())
                .commit();

            getSupportActionBar().setTitle("Top Scorer");
        }
    }