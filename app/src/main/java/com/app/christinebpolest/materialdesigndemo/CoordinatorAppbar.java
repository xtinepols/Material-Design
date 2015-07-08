package com.app.christinebpolest.materialdesigndemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CoordinatorAppbar extends Fragment {

    View view;
    
    public CoordinatorAppbar() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_coordinator_appbar, container, false);
        Toolbar toolbar = (Toolbar)view.findViewById(R.id.sixth_coordinatorAppBarLayout);
        return view;
    }
}
