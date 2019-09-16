package com.julio.gameplus2.ui.peores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.navigation.Navigation;

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
            R.drawable.peor3,
            R.drawable.peor4,
            R.drawable.peor5,
            R.drawable.peor6,
            R.drawable.peor7,
            R.drawable.peor8,
            R.drawable.peor9

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
        item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //codigo para cambiar al otro fragment dale q  valla a la otra vacia por el momento
                //si queres enviar datos se hace asi
                //asi se hace ahi con tu logica para que le mostres los datos en el otro
                //Gracias
                Bundle datots = new Bundle();
                datots.putString("algo","algo");
                Navigation.findNavController(view).navigate(R.id.action_nav_peores_to_detallePeoresFragment,datots);
            }
        });

        return view;
    }

}
