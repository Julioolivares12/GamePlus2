package com.julio.gameplus2.ui.videojuegos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.julio.gameplus2.R;
import com.julio.gameplus2.adapters.VideojuegosAdapter;
import com.julio.gameplus2.arreglos.Arreglos;
import com.julio.gameplus2.listeners.OnVideojuegosItemClickListener;
import com.julio.gameplus2.modelos.Games;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideojuegosFragment extends Fragment {


    Games[]games;
    public VideojuegosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_videojuegos, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_Games);

        games = Arreglos.videojuegosFull;
        iniRecycler(recyclerView);
        return view;
    }

    private void iniRecycler(RecyclerView recyclerView){
        recyclerView.setAdapter(new VideojuegosAdapter(games, new OnVideojuegosItemClickListener() {
            @Override
            public void onClick(Games game) {
                Bundle datos = new Bundle();
                datos.putInt("img",game.getImagen());
                datos.putString("title",game.getNombre());
                datos.putString("descripcion",game.getDescripcion());
                View view = getView();
                assert view != null;
                Navigation.findNavController(view).navigate(R.id.action_nav_videojuegos_to_detalleGameFragment,datos);
            }
        }));
    }

}
