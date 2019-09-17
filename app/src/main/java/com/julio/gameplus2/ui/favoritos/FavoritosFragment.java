package com.julio.gameplus2.ui.favoritos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.julio.gameplus2.R;
import com.julio.gameplus2.adapters.FavoritosAdapter;
import com.julio.gameplus2.arreglos.Arreglos;
import com.julio.gameplus2.listeners.OnItemClickListener;
import com.julio.gameplus2.modelos.VideoJuego;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritosFragment extends Fragment {


    List<VideoJuego>videoJuegos;
    public FavoritosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_favoritos, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_favoritos);
        videoJuegos = Arreglos.favoritos;
        initRecyclerView(recyclerView);
        return view;
    }

    private void initRecyclerView(RecyclerView recyclerView){
        recyclerView.setAdapter(new FavoritosAdapter(videoJuegos, new OnItemClickListener() {
            @Override
            public void onClick(VideoJuego videoJuego) {
                View view = getView();
                assert view != null;

                Bundle datos = new  Bundle();
                datos.putString("title",videoJuego.getNombre());
                datos.putString("descripcion",videoJuego.getDescripcion());
                datos.putInt("imagen",videoJuego.getImagen());
                Navigation.findNavController(view).navigate(R.id.action_nav_favoritos_to_detalleFavoritoFragment,datos);
            }
        }));

    }

}
