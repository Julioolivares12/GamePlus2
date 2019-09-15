package com.julio.gameplus2.ui.contacto;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.julio.gameplus2.R;
import com.julio.gameplus2.ui.Adaptadores.AdapterTelefonos;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactoFragment extends Fragment {
    GridView item;
    String []sucursal;
    String []telefono;
    int imagen1 = R.drawable.home;

    public ContactoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contacto, container, false);
        sucursal = getResources().getStringArray(R.array.sucursales);
        telefono = getResources().getStringArray(R.array.telefonos);
        AdapterTelefonos adapte = new AdapterTelefonos(getContext(), telefono, sucursal,imagen1);
        item = (GridView) view.findViewById(R.id.gridTelefono);
        item.setAdapter(adapte);

        // Inflate the layout for this fragment
        return view;
    }

}
