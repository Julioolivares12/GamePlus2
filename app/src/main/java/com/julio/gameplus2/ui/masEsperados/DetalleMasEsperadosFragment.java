package com.julio.gameplus2.ui.masEsperados;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.julio.gameplus2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleMasEsperadosFragment extends Fragment {


    public DetalleMasEsperadosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_mas_esperados, container, false);

        TextView titleGame = view.findViewById(R.id.tv_title_detalle_mas_esperados);
        TextView DescripcionGame = view.findViewById(R.id.tv_detalle_descripcion_masEsperado);
        ImageView imageView = view.findViewById(R.id.iv_detalle_mas_esperado);
        Bundle data = getArguments();

        if (data != null){
            String title = data.getString("titleMasEperado");
            String descripcion = data.getString("descripcionMasEperado");
            int imagen = data.getInt("imagenMasEsperado");
            titleGame.setText(title);
            DescripcionGame.setText(descripcion);
            imageView.setImageResource(imagen);
        }
        return view;
    }

}
