package com.julio.gameplus2.ui.favoritos;


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
public class DetalleFavoritoFragment extends Fragment {


    public DetalleFavoritoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_favorito, container, false);
        TextView titleFav= view.findViewById(R.id.tv_title_detalle_favorito);
        TextView descripcion = view.findViewById(R.id.tv_detalle_descripcion_favorito);
        ImageView iv_detalleFav = view.findViewById(R.id.iv_detalle_favorito);

        if (getArguments() != null){
            titleFav.setText(getArguments().getString("title"));
            descripcion.setText(getArguments().getString("descripcion"));
            Glide.with(view).load(getArguments().getInt("imagen")).into(iv_detalleFav);
        }
        return view;
    }

}
