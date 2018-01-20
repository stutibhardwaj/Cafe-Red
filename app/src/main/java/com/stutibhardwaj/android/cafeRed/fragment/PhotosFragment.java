package com.stutibhardwaj.android.cafeRed.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.stutibhardwaj.android.cafeRed.R;
import com.stutibhardwaj.android.cafeRed.adapters.ImageAdapter;

public class PhotosFragment extends Fragment {


    public PhotosFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_photos, container, false);
        GridView gridview = (GridView) root.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(getActivity().getApplicationContext()));
        return root;
    }



}
