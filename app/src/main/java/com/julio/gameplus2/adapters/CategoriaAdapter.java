package com.julio.gameplus2.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.julio.gameplus2.R;
import com.julio.gameplus2.listeners.OnItemCategoriaLIstener;
import com.julio.gameplus2.modelos.Categoria;

import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.CategoriaHolder> {
    List<Categoria> categorias;
    private final OnItemCategoriaLIstener onItemCategoriaLIstener;
    CategoriaAdapter(List<Categoria>categorias,OnItemCategoriaLIstener onItemCategoriaLIstener){
        this.categorias = categorias;
        this.onItemCategoriaLIstener = onItemCategoriaLIstener;
    }
    @NonNull
    @Override
    public CategoriaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_categoria,viewGroup,false);
        return new CategoriaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaHolder categoriaHolder, int i) {
        Categoria categoria = categorias.get(i);
        categoriaHolder.bind(categoria,onItemCategoriaLIstener);
    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    class CategoriaHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView iv_categoria;
        public CategoriaHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_categoria);
            iv_categoria = itemView.findViewById(R.id.iv_categoria);
        }

        void bind(final Categoria categoria, final OnItemCategoriaLIstener onItemCategoriaLIstener){
            title.setText(categoria.getNombre());
            Glide.with(itemView).load(categoria.getImagen()).centerCrop().into(iv_categoria);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemCategoriaLIstener.onClick(categoria);
                }
            });
        }
    }
}
