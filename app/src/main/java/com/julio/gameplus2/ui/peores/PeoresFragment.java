package com.julio.gameplus2.ui.peores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.julio.gameplus2.R;
import com.julio.gameplus2.ui.Adaptadores.AdapterPeores;
import com.julio.gameplus2.ui.Adaptadores.AdapterTelefonos;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeoresFragment extends Fragment {
    GridView item;
    String []titulo;
    int[]imagen = {R.drawable.peor1,
            R.drawable.peor2,
            R.drawable.peor3

    };

    public PeoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_peores, container, false);;
        titulo = getResources().getStringArray(R.array.titulos);
        AdapterPeores adapte = new AdapterPeores(getContext(), titulo, imagen);
        item = (GridView) view.findViewById(R.id.grid_peores);
        item.setAdapter(adapte);

        return view;
    }

}
