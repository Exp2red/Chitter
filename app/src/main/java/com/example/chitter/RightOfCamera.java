package com.example.chitter;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class RightOfCamera extends Fragment {
    public static RightOfCamera newInstance(){
        RightOfCamera fragment = new RightOfCamera();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.rightofcamera , container, false);
        return view;
    }
}

