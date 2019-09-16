package com.julio.gameplus2.ui.categoria;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.julio.gameplus2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriaFragment extends Fragment {


    public CategoriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_categoria, container, false);
        return view;
    }

}
