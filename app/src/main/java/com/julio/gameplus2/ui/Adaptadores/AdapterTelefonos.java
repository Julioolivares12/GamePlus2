package com.julio.gameplus2.ui.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.julio.gameplus2.R;

public class AdapterTelefonos extends BaseAdapter {
    private Context contexto;
    private String []telefonos;
    private String []sucursales;
    private int imagen;
    TextView telefono;
    TextView sucursal;
    ImageView imagen2;

    public AdapterTelefonos(Context contexto, String[]telefonos,String []sucursales ,int imagen) {
       this.contexto = contexto;
       this.telefonos = telefonos;
       this.imagen = imagen;
    }

    @Override
    public int getCount() {
        return telefonos.length;
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
            item = inflar.inflate(R.layout.itemtelefono, null);

        }else{
            item= (View)arg1;
        }
        telefono=(TextView)item.findViewById(R.id.tvTelefono);
        sucursal=(TextView)item.findViewById(R.id.tvSucursal);
        imagen2 = (ImageView)item.findViewById(R.id.imgLocal);
        telefono.setText(telefonos[posicion]);
        sucursal.setText(sucursales[posicion]);
        imagen2.setImageResource(imagen);
        return item;
    }

}
