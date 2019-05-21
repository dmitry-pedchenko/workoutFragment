package com.example.workoutfragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment frag = (BlankFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        frag.setWorkoutId(1);
    }
}
