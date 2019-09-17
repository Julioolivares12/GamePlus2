package com.julio.gameplus2.ui.categoria;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.julio.gameplus2.R;
import com.julio.gameplus2.adapters.CategoriaAdapter;
import com.julio.gameplus2.arreglos.Arreglos;
import com.julio.gameplus2.arreglos.GridItemDecoration;
import com.julio.gameplus2.listeners.OnItemCategoriaLIstener;
import com.julio.gameplus2.modelos.Categoria;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriaFragment extends Fragment {


    private List<Categoria> categorias = new ArrayList<>();
    public CategoriaFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_categoria, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_categorias);
        categorias= Arreglos.categorias;
        
        initRecycler(recyclerView,view);
        return view;
    }

    private void initRecycler(RecyclerView recyclerView, final View view){
        //recyclerView.addItemDecoration(new GridItemDecoration(10,2));
        recyclerView.setAdapter( new CategoriaAdapter(categorias, new OnItemCategoriaLIstener() {
            @Override
            public void onClick(Categoria categoria) {
                Bundle data = new  Bundle();
                data.putString("cat",categoria.getNombre());
               Navigation.findNavController(view).navigate(R.id.action_nav_categoria_to_detalleCategoriaFragment,data);
            }
        }));
    }

}
