package com.app.christinebpolest.materialdesigndemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class fab extends Fragment {

    View view;

    public fab() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fab, container, false);
        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.second_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hey! You're clicking floating action button", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
