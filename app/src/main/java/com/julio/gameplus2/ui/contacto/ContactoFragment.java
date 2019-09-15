package com.julio.gameplus2.ui.contacto;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.julio.gameplus2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactoFragment extends Fragment {
    GridView item;
    String []sucursal;
    String []telefono;
    int imagen1;

    public ContactoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacto, container, false);
    }

}
