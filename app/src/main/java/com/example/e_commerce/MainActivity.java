package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.e_commerce.fragments.CartFragment;
import com.example.e_commerce.fragments.CheckOutFragment;
import com.example.e_commerce.fragments.HomeFragment;
import com.example.e_commerce.fragments.SearchFragment;
import com.example.e_commerce.fragments.SettingsFragment;
import com.example.e_commerce.fragments.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ImageView open_nav=findViewById(R.id.menu_open);
        DrawerLayout open=findViewById(R.id.open);
        BottomNavigationView bottom_nav=findViewById(R.id.bottom_nav);
        TextView nameOfPage=findViewById(R.id.nameOfPage);
        open_nav.setOnClickListener(v -> open.openDrawer(GravityCompat.START));

        bottom_nav.getOrCreateBadge(R.id.cart).setNumber(14);
        nameOfPage.setText("Home");
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
        bottom_nav.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
                    nameOfPage.setText("Home");
                    return true;
                case R.id.cart:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new CartFragment()).commit();
                    nameOfPage.setText("Shopping Cart");
                    return true;
                case R.id.user:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new UserFragment()).commit();
                    nameOfPage.setText("Account");
                    return true;
                case R.id.setting:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new SettingsFragment()).commit();
                    nameOfPage.setText("Settings");
                    return true;
            }
            return false;
        });
        ImageView searchView = findViewById(R.id.search);
         searchView.setOnClickListener(e->{
             getSupportFragmentManager().beginTransaction().replace(R.id.container,new SearchFragment()).commit();
//              searchView.setImageResource(R.drawable.icons_filter_gray);
              nameOfPage.setText("Search");

         });
  ;

    }
}