package com.julio.gameplus2.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.julio.gameplus2.R;
import com.julio.gameplus2.listeners.OnItemClickListener;
import com.julio.gameplus2.modelos.VideoJuego;

import java.util.List;

public class MasEsperadosAdapter extends RecyclerView.Adapter<MasEsperadosAdapter.MasEsperadosHolder> {
    private final OnItemClickListener onItemClickListener;
    List<VideoJuego>videoJuegos;
    public MasEsperadosAdapter(List<VideoJuego> videoJuegos,OnItemClickListener onItemClickListener){
        this.videoJuegos = videoJuegos;
        this.onItemClickListener = onItemClickListener;

    }
    @NonNull
    @Override
    public MasEsperadosHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mas_esperados,viewGroup,false);
        return new MasEsperadosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MasEsperadosHolder masEsperadosHolder, int i) {
        VideoJuego videoJuego = videoJuegos.get(i);
        masEsperadosHolder.bind(videoJuego,onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return videoJuegos.size();
    }

    class MasEsperadosHolder extends RecyclerView.ViewHolder{

        private ImageView iv_masEsperado;
        private TextView tv_title_masEsperado;
        public MasEsperadosHolder(@NonNull View itemView) {
            super(itemView);
            iv_masEsperado = itemView.findViewById(R.id.iv_masEsperados);
            tv_title_masEsperado = itemView.findViewById(R.id.tv_title_masEsperado);
        }

        public void bind(final VideoJuego videoJuego, final OnItemClickListener onItemClickListener){
            iv_masEsperado.setImageResource(videoJuego.getImagen());
            tv_title_masEsperado.setText(videoJuego.getNombre());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onClick(videoJuego);
                }
            });
        }


    }
}
