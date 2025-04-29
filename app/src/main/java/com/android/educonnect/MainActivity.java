package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    SonsFragment sonsFragment = new SonsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomnav);


        // findviewbyid didn't work with menuitem so this is how it work, this allow me to control menu items (change icons, ..)
        Menu menu = bottomNavigationView.getMenu();
        MenuItem homeItem = menu.getItem(0);
        MenuItem sonsItem = menu.getItem(1);
        MenuItem notificationItem = menu.getItem(2);

        // Default fragment (home page)
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();
        homeItem.setIcon(R.drawable.icon_home_fill);
        sonsItem.setIcon(R.drawable.icon_sons);
        notificationItem.setIcon(R.drawable.icon_notification);


        // On click Listner sur les items de menu
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {


                int id = item.getItemId(); // Get the ID of the selected item
                if (id == R.id.home_page) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, homeFragment).commit();  // go to home fragment
                    homeItem.setIcon(R.drawable.icon_home_fill);   // change icon of item selected
                    sonsItem.setIcon(R.drawable.icon_sons);
                    notificationItem.setIcon(R.drawable.icon_notification);

                } else if (id == R.id.sons_page) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,sonsFragment).commit(); // go to sons fragment
                    homeItem.setIcon(R.drawable.icon_home);
                    sonsItem.setIcon(R.drawable.icon_sons_fill); // change icon of item selected
                    notificationItem.setIcon(R.drawable.icon_notification);

                } else if (id == R.id.notification_page) {
                    Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                    startActivity(intent);
                }

                return false;
            }
        });


    }

}