package com.example.chitter;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class LeftOfCamera extends Fragment {
    public static LeftOfCamera newInstance(){
        LeftOfCamera fragment = new LeftOfCamera();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.leftofcamera , container, false);
        return view;
    }
}
