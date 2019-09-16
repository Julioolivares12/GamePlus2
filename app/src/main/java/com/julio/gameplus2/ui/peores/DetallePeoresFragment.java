package com.julio.gameplus2.ui.peores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.julio.gameplus2.R;

public class DetallePeoresFragment extends Fragment {


    public DetallePeoresFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle_peores, container, false);
        TextView txtTitulo = (TextView)view.findViewById(R.id.tvDetalleTitulo);
        TextView txtComentario = (TextView)view.findViewById(R.id.tvComentario);
        ImageView imagen = (ImageView)view.findViewById(R.id.imgDetallePeor);
        String titulo,comentario;
        int img;

        Bundle b = getArguments();
        titulo = b.getString("titulo","");
        comentario = b.getString("comentario","");
        img = b.getInt("imagen",0);
        txtTitulo.setText(titulo);
        txtComentario.setText(comentario);
        imagen.setImageResource(img);



        return view;
    }

}
