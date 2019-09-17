package com.julio.gameplus2.ui.videojuegos;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.julio.gameplus2.R;
import com.julio.gameplus2.arreglos.Arreglos;
import com.julio.gameplus2.modelos.VideoJuego;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleGameFragment extends Fragment {


    public DetalleGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_game, container, false);

        TextView tv_title_detalle_games2 = view.findViewById(R.id.tv_title_detalle_games2);
        TextView tv_detalle_game_videojuego = view.findViewById(R.id.tv_detalle_game_videojuego);
        ImageView iv_detalle_game = view.findViewById(R.id.iv_detalle_game);

        Button btnFav = view.findViewById(R.id.btnFav3);

        final Bundle data = getArguments();
        if (data != null){
            final String title = data.getString("title");
            final String Descripcion=data.getString("descripcion");
            final int imagen = data.getInt("img");
            tv_title_detalle_games2.setText(title);
            tv_detalle_game_videojuego.setText(Descripcion);
            Glide.with(view).load(imagen).into(iv_detalle_game);

            btnFav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    VideoJuego videoJuego = new VideoJuego(title,Descripcion,imagen);
                    Arreglos.favoritos.add(videoJuego);
                    if (Arreglos.favoritos.size() > 0){
                        Snackbar.make(v,"agregado con exito",Snackbar.LENGTH_LONG).show();
                    }

                }
            });
        }
        return view;
    }

}
