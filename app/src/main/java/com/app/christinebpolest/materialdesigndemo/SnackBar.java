package com.app.christinebpolest.materialdesigndemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SnackBar extends Fragment {

    View view;

    public SnackBar() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_snack_bar, container, false);
        FloatingActionButton fab = (FloatingActionButton)view.findViewById(R.id.second_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(parentLayout, "Hey, i'm a snackbar", Snackbar.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
