package com.example.workoutfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private long workoutId;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Workout workout = Workout.workouts[(int) workoutId];
            TextView title = (TextView) view.findViewById(R.id.TextTitle);
            title.setText(workout.getName());
            TextView desc = (TextView) view.findViewById(R.id.TextDescription);
            desc.setText(workout.getDescription());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }


    public void setWorkoutId(long id) {
        this.workoutId = id;
    }
}
