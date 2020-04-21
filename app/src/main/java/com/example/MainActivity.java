package com.example;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 pager = findViewById(R.id.pager);

        ViewPageAdapter adapter = new ViewPageAdapter(this);
        adapter.addFragment(WebFragment.newInstance("https://tsn.ua/ru"));
        adapter.addFragment(WebFragment.newInstance("https://www.obozrevatel.com/"));
        adapter.addFragment(WebFragment.newInstance("https://www.radiosvoboda.org/"));
        adapter.addFragment(WebFragment.newInstance("https://www.cnn.com/"));

        pager.setAdapter(adapter);


        TabLayout tabLayout = findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout, pager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("TCH");
                        break;
                    case 1:
                        tab.setText("Обозраватель");
                        break;
                    case 2:
                        tab.setText("Радио Свобода");
                        break;
                    case 3:
                        tab.setText("CNN");
                        break;
                }
            }
        }).attach();
    }

    static class ViewPageAdapter extends FragmentStateAdapter {

        private List<Fragment> list;

        ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            list = new ArrayList<>();
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return list.get(position);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        void addFragment(Fragment fragment) {
            list.add(fragment);
        }
    }
}
