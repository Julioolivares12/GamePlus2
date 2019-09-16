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
import com.julio.gameplus2.listeners.OnVideojuegosItemClickListener;
import com.julio.gameplus2.modelos.Games;

public class VideojuegosAdapter extends RecyclerView.Adapter<VideojuegosAdapter.VideoJuegosHolder> {

    Games[] games;
    private final OnVideojuegosItemClickListener onVideojuegosItemClickListener;
   public VideojuegosAdapter(Games[] games,OnVideojuegosItemClickListener onVideojuegosItemClickListener){
        this.games = games;
        this.onVideojuegosItemClickListener = onVideojuegosItemClickListener;
    }

    @NonNull
    @Override
    public VideoJuegosHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.videojuegos_item,viewGroup,false);
        return new VideoJuegosHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoJuegosHolder videoJuegosHolder, int i) {
       Games game = games[i];
       videoJuegosHolder.bind(game,onVideojuegosItemClickListener);
    }

    @Override
    public int getItemCount() {
        return games.length;
    }

    class VideoJuegosHolder extends RecyclerView.ViewHolder {

       TextView textView ;
       ImageView imageView;
        public VideoJuegosHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title_videojuegoCategoria);
            imageView = itemView.findViewById(R.id.iv_videojuegosCategoria);
        }

        void bind(final Games game, final OnVideojuegosItemClickListener onVideojuegosItemClickListener){

            textView.setText(game.getNombre());
            Glide.with(itemView).load(game.getImagen()).centerCrop().into(imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onVideojuegosItemClickListener.onClick(game);
                }
            });
        }
    }
}
