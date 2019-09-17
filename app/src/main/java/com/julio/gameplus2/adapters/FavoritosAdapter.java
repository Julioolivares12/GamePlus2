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
import com.julio.gameplus2.listeners.OnItemClickListener;
import com.julio.gameplus2.modelos.VideoJuego;

import java.util.List;

public class FavoritosAdapter extends RecyclerView.Adapter<FavoritosAdapter.FavoritosHolder> {

    List<VideoJuego> videoJuegos;
    private final OnItemClickListener onItemClickListener;
    public FavoritosAdapter(List<VideoJuego> videoJuegos,OnItemClickListener onItemClickListener){
        this.videoJuegos = videoJuegos;
        this.onItemClickListener = onItemClickListener;
    }
    @NonNull
    @Override
    public FavoritosHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_favorito,viewGroup,false);
        return new FavoritosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoritosHolder favoritosHolder, int i) {
        VideoJuego videoJuego = videoJuegos.get(i);
        favoritosHolder.bind(videoJuego,onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return videoJuegos.size();
    }

    class FavoritosHolder extends RecyclerView.ViewHolder{

        ImageView iv_favorito;
        TextView tv_title_favorito;
        public FavoritosHolder(@NonNull View itemView) {
            super(itemView);
            iv_favorito = itemView.findViewById(R.id.iv_favorito);
            tv_title_favorito= itemView.findViewById(R.id.tv_title_favorito);
        }

        public void bind(final VideoJuego videoJuego, final OnItemClickListener onItemClickListener){
            Glide.with(itemView).load(videoJuego.getImagen()).into(iv_favorito);
            tv_title_favorito.setText(videoJuego.getNombre());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onClick(videoJuego);
                }
            });
        }
    }
}
