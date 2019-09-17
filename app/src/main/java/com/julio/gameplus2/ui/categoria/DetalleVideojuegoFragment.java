package com.julio.gameplus2.ui.categoria;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.julio.gameplus2.R;
import com.julio.gameplus2.arreglos.Arreglos;
import com.julio.gameplus2.modelos.Games;
import com.julio.gameplus2.modelos.VideoJuego;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleVideojuegoFragment extends Fragment {


    public DetalleVideojuegoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_videojuego, container, false);
        TextView textView = view.findViewById(R.id.tv_title_detalle_games);
        TextView descrip = view.findViewById(R.id.tv_detalle_descripcion_videojuego);
        ImageView imageView = view.findViewById(R.id.iv_detalle_games);
        Button btnFav = view.findViewById(R.id.btnFavorito2);
        Bundle data = getArguments();
        if (data != null){
            final String title = data.getString("title");
            final String descripcion = data.getString("descripcion");
            final int imagen = data.getInt("imagen");

            textView.setText(title);
            descrip.setText(descripcion);
            Glide.with(view).load(imagen).into(imageView);

            btnFav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    VideoJuego videoJuego = new VideoJuego(title,descripcion,imagen);
                    Arreglos.favoritos.add(videoJuego);

                    Snackbar.make(v,"agregado con exito",Snackbar.LENGTH_LONG).show();
                }
            });
        }
        return view;
    }

}
