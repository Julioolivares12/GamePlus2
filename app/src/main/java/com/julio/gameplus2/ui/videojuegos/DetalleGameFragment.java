package com.julio.gameplus2.ui.videojuegos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.julio.gameplus2.R;

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


        Bundle data = getArguments();
        if (data != null){
            tv_title_detalle_games2.setText(data.getString("title"));
            tv_detalle_game_videojuego.setText(data.getString("descripcion"));
            Glide.with(view).load(data.getInt("img")).into(iv_detalle_game);
        }
        return view;
    }

}
