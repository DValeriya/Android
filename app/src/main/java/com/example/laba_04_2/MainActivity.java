package com.example.laba_04_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener{

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.menu_fragment, new MenuFragment(), "flag1")
                .commit();
    }


    @Override
    public void onFragmentInteraction(String result) {
        manager.beginTransaction()
                .add(R.id.details_fragment,DetailsFragment.newInstance(result),"frag2")
                .commit();
    }
}
