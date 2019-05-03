package com.example.jasminapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v7.widget.Toolbar;


public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        Button pic_btn = (Button) view.findViewById(R.id.pic_btn);
        Button map_btn = (Button) view.findViewById(R.id.map_btn);


        pic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new PicFragment());
                fr.commit();
            }
        });
        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new MapFragment());
                fr.commit();
            }
        });

        return view;
    }
}