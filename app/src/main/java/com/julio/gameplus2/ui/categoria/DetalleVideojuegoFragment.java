package com.julio.gameplus2.ui.categoria;


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
        Bundle data = getArguments();
        if (data != null){
            String title = data.getString("title");
            String descripcion = data.getString("descripcion");
            int imagen = data.getInt("imagen");

            textView.setText(title);
            descrip.setText(descripcion);
            Glide.with(view).load(imagen).into(imageView);
        }
        return view;
    }

}
