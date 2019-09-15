package com.julio.gameplus2.ui.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.julio.gameplus2.R;

public class AdapterPeores extends BaseAdapter {
    private Context contexto;
    private String []titulos;
    private int[] imagenes;
    TextView titulo;
    ImageView imagen2;

    public AdapterPeores(Context contexto, String[]titulos,int [] imagen) {
       this.contexto = contexto;
       this.titulos = titulos;
       this.imagenes = imagen;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }
    @Override
    public Object getItem(int arg0){
        return null;
    }
    @Override
    public long getItemId(int arg0){
        return 0;
    }
    @Override
    public View getView(int posicion, View arg1, ViewGroup arg2){
        View item;
        if(arg1==null){
            LayoutInflater inflar = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
            item = new View(contexto);
            item = inflar.inflate(R.layout.item_los_peores, null);

        }else{
            item= (View)arg1;
        }
        titulo=(TextView)item.findViewById(R.id.tvPeor);
        imagen2 = (ImageView)item.findViewById(R.id.imgPeor);
        titulo.setText(titulos[posicion]);
        imagen2.setImageResource(imagenes[posicion]);
        return item;
    }

}
