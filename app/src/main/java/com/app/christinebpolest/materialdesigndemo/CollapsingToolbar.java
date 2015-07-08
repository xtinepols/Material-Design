package com.app.christinebpolest.materialdesigndemo;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Interpolator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.jar.Attributes;

public class CollapsingToolbar extends Fragment {

    View view;

    public CollapsingToolbar() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_collapsing_toolbar, container, false);
        CollapsingToolbar collapsingToolbar = (CollapsingToolbar)view.findViewById(R.id.seventh_collapsingToolbar);
        collapsingToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hey! You're clicking floating action button", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
