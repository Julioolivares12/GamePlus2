package com.julio.gameplus2.ui.videojuegos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.julio.gameplus2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideojuegosFragment extends Fragment {


    public VideojuegosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videojuegos, container, false);
    }

}
