package com.ini_package_anisaapril.anisatabview;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;



public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabview);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Set adapter untuk ViewPager2
        viewPager.setAdapter(new MyAdapter(this));

        // Set TabLayoutMediator untuk menghubungkan TabLayout dengan ViewPager2
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Tab 1");
                            break;
                        case 1:
                            tab.setText("Tab 2");
                            break;
                        case 2:
                            tab.setText("Tab 3");
                            break;
                    }
                }
        );
        tabLayoutMediator.attach();
    }
}
