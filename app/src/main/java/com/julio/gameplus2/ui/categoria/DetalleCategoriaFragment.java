package com.julio.gameplus2.ui.categoria;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.julio.gameplus2.R;
import com.julio.gameplus2.adapters.VideojuegosAdapter;
import com.julio.gameplus2.arreglos.Arreglos;
import com.julio.gameplus2.listeners.OnVideojuegosItemClickListener;
import com.julio.gameplus2.modelos.Games;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleCategoriaFragment extends Fragment {


    Games[]games;
    public DetalleCategoriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_categoria, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_detalle_categoria);
        Bundle data = getArguments();
        if (data != null){
            String categoria = data.getString("cat");
            if (categoria != null){
                switch (categoria){
                    case "Accion":
                        games = Arreglos.juegosDeAccion;
                        break;
                    case "Carreras":
                        games = Arreglos.juegosDeCarreras;
                        break;
                    case "Lucha":
                        games = Arreglos.juegosDeLucha;
                        break;
                    case "Rol":
                        games = Arreglos.juegosRol;
                        break;
                    case "Zombies":
                        games = Arreglos.juegosDeZombies;
                        break;
                    case "Plataformas":
                        games = Arreglos.juegosDePlataformas;
                        break;
                }
            }

        }
        initRecycelrViewCategoriaJuegos(recyclerView);
        return view;

    }
    private void initRecycelrViewCategoriaJuegos(RecyclerView recyclerView){

        recyclerView.setAdapter(new VideojuegosAdapter(games, new OnVideojuegosItemClickListener() {
            @Override
            public void onClick(Games games) {
                View view = getView();
                assert view != null;

                Bundle data = new  Bundle();
                data.putString("title",games.getNombre());
                data.putString("descripcion",games.getDescripcion());
                data.putInt("imagen",games.getImagen());

                Navigation.findNavController(view).navigate(R.id.action_detalleCategoriaFragment_to_detalleVideojuegoFragment,data);
            }
        }));
    }
}
